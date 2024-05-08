package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/***
 * A <code>DAO</code> implementation capable of accessing
 * a remote MariaDB database.
 */
class MariaDBDAO implements DAO {

    private static final String DB_URL = "jdbc:mariadb://143.106.243.64:3306/SI400";
    private static final String LINE_QUERY_TEMPLATE = "SELECT * FROM Fragmentos WHERE groupId = ? ORDER BY line ASC";
    private static final String TEXT_COLUMN_LABEL = "text";

    private boolean isConnected = false;
    private Connection connection;

    @Override
    public void connect(String login, String password) throws SQLException {
        if (!isConnected) {
            connection = DriverManager.getConnection(DB_URL, login, password);
            isConnected = true;
        }
    }

    @Override
    public ArrayList<String> getLinesByGroupId(int groupId) throws SQLException {
        ArrayList<String> lines = new ArrayList<>();

        try ( PreparedStatement stmt = connection.prepareStatement(LINE_QUERY_TEMPLATE)) {
            stmt.setInt(1, groupId);

            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                lines.add(result.getString(TEXT_COLUMN_LABEL));
            }
        }

        return lines;
    }

    @Override
    public boolean isConnected() {
        return isConnected;
    }

}

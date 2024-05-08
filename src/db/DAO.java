package db;

import java.util.ArrayList;

/***
 * <code>DAO</code> provides an uniform interface to access different
 * sources of data, such as a database or a file in disk.
 */
public interface DAO {

    /***
     * Connect to the data source, by providing login and password.
     * @param login
     * @param password
     * @throws Exception
     */
    void connect(String login, String password) throws Exception;
    
    /***
     * Check whether there is an open connection to the data source.
     * @return
     */
    boolean isConnected();

    /***
     * Retrieve lines of text from the data source.
     * @param groupId
     * @return List of lines
     * @throws Exception 
     */
    ArrayList<String> getLinesByGroupId(int groupId) throws Exception;
}

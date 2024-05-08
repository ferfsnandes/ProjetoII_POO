package db;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/***
 * A <code>DAO</code> implementation that accesses data in memory
 */
public class MemoryDAO implements DAO {

    private static final String LOCAL_FILE_URL = "/db/sample/localtext.txt";
    private boolean isConnected = false;
    
    @Override
    public void connect(String login, String password) {
        // método vazio, pois não é necessário autenticação para se acessar
        // recurso local
        isConnected = true;
    }
    
    @Override
    public ArrayList<String> getLinesByGroupId(int groupId) throws Exception {
        String path = getClass().getResource(LOCAL_FILE_URL).getPath();
        
        ArrayList<String> lines = new ArrayList<>();
        Map<String, String> lineTextMap = new TreeMap<>();
        
        try ( BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            
            while (line != null) {
                String[] fields = line.split(";");
                
                if (Integer.parseInt(fields[0]) == groupId) {  // verifica a coluna groupId
                    lineTextMap.put(fields[1], fields[3]);     //armazena line como chave e text como valor
                }
                
                line = br.readLine();
            }
            
            for (Map.Entry<String, String> entry : lineTextMap.entrySet()) {
                lines.add(entry.getValue());
            }
        }
        
        return lines;
    }

    @Override
    public boolean isConnected() {
        return isConnected;
    }
   
}

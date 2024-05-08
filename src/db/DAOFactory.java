package db;

/***
 * A factory of objects that implement the <code>DAO</code> interface.
 */
public class DAOFactory {
    
    /***
     * Create an object implementing the <code>DAO</code> interface.
     * 
     * If <code>local</code> is true, return an object that accesses data
     * stored in memory. Otherwise, return an object that accesses data in
     * a remote database.
     * @param local
     * @return 
     */
    public DAO createDAO(boolean local) {
        return local ? new MemoryDAO() : new MariaDBDAO();
   }
}

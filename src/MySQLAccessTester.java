import java.sql.ResultSet;



public class MySQLAccessTester 
{
  public static void main(String[] args) throws Exception 
  {
    MySQLAccess dao = new MySQLAccess();
    
    dao.connectToDataBase();
    dao.getAllUsers();
    dao.createRandomNewUser();
    dao.getUser("tyler", true);
    dao.updateCurrentScore("jason", 3);
    dao.getUserCurrentScore("jason");
    dao.updateHighScore("jason", 398);
    dao.getUserHighScore("jason");
    dao.deleteUser("_deleteme63");
    
  }

} 

import java.sql.*;

public class JDBCCRUD{
    public static void main(String[] args){
        String url = "jdbc:mariadb://localhost:3306/practice_db";
        String username = "galav";
        String passwd = "md@123";

        try{
        Connection conn = DriverManager.getConnection(url, username, passwd);
        Statement stmt = conn.createStatement();
        String sql = "insert into students(id,name,email)" + "values(5,'dheeraj','xy@gmail.com')";
        int result = stmt.executeUpdate(sql);
        System.out.println("result:" + result);
         stmt.close();
        conn.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
       

    }
}
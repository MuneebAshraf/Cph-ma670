import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class db {
        public static void main(String[] args){
            try{
                System.out.println("step 1");
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("step 2");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ditaso?characterEncoding=utf8","Recruitio","recruitio");
                System.out.println("step 3");
            //here sonoo is database name, root is username and password
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from ditaso.jobs");
                while(rs.next())
                    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
                con.close();
            }catch(Exception e){ e.printStackTrace();}
        }
    }

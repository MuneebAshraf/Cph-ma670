import entities.Student;

import java.sql.*;
import java.util.ArrayList;

public class Main {

    private final static String DB = "cphbusiness";
    private final static String USER = "cph-ma670";
    private final static String PW = "cph-ma670";
    private final static String URL = "jdbc:mysql://localhost:3306/"+DB + "?serverTimezone=CET&useSSL=false&allowPublicKeyRetrieval=true";
    public static void main(String[] args)
    {
        System.out.println("Engine starting");
        ArrayList<Student> students = new ArrayList<Student>();

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }

        Connection connection= null;

        try
        {
            connection = DriverManager.getConnection(URL, USER, PW);
            System.out.println("Connection established to Database");

            String sql = "SELECT * FROM students";

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();


            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                students.add(new Student(id, name, age));

            }

        connection.close();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }

        students.add(new Student(1, "Muneeb",26));

        students.forEach(System.out::println);
    }


}

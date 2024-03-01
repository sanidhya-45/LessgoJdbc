import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        String sql="select first_name, gmail from telusko where id='2'";

        String url="jdbc:postgresql://localhost:5432/postgres";
        String username="postgres";
        String password="123";
        Connection con= DriverManager.getConnection(url, username, password);
        Statement st= con.createStatement();
        ResultSet rs= st.executeQuery(sql);
        while(rs.next()) {


            String name = rs.getString(1);
            System.out.println(name);
        }
    }
}
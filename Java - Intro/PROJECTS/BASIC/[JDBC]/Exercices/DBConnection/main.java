import java.sql.*;

public class Main {

    public static void main(String[] args) {

        Connection connection = ConDB.getConnection("classes", "root", "samlfstr.FR0");


        String my_sql_statement = "select t1.*, t2.* from employees_of_a t1 inner join employees_of_b t2 on t1.first_name = t2.first_name";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(my_sql_statement);
            while(resultSet.next()){
                System.out.println(resultSet.getString("first_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

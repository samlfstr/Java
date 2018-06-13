import java.sql.*;

class Main {

    public static void main(String[] args){
        try{
            //region Connection(1)

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?verifyServerCertificate=false&useSSL=true","root","samlfstr.FR0");
            //endregion

            //region Statement(2)
            Statement statement = connection.createStatement();
            //endregion

            //region ResultSet(3)
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");
            //endregion

            //region Show(4)
            while(resultSet.next()){
                System.out.print(resultSet.getString("last_name")+ ", " + resultSet.getString("first_name"));
                System.out.print("\n");
            }
            //endregion
        }
        catch (Exception e){

            System.out.print(e.getMessage());
        }


    }
}

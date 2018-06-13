/*
* Created by Isa 4.2.2018 21:50
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class NameGenerator {

    private String user_name;
    private String password;
    private String data_base_name;
    private String first_letter, last_letter = null;
    private int name_length;
    private String[] list_of_names = null;

    public NameGenerator() {
        user_name = "root";
        password = "";
        data_base_name = "";
        first_letter = "A";
        last_letter = null;
        name_length = 0;
    }

    // zorunlu
    public NameGenerator(String user_name, String password, String data_base_name) {
        this.user_name = user_name;
        this.password = password;
        this.data_base_name = data_base_name;
    }

    // zorunlu değil
    public void setParameters() {
        Scanner sc = new Scanner(System.in);
        System.out.print("First letter : ");
        first_letter = sc.next();
        //System.out.println("Last letter :");
        //last_letter = sc.next();
        //System.out.println("Name length");
        //name_length = sc.nextInt();
    }

    public void showParameters() {
        System.out.print(String.format("First letter : %s\n Last letter : %s\n Name length : %d\n", first_letter, last_letter, name_length));
    }

    public void getNames() {

        String user = this.user_name, password = this.password;
        StringBuilder str = new StringBuilder();
        String url = "jdbc:mysql://localhost:3306/"+data_base_name+"?verifyServerCertificate=false&useSSL=true";
        String sql_code = "SELECT * FROM names.first WHERE firstname LIKE '"+first_letter+"%'";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql_code);

            while (resultSet.next()) {
                // str ye isimleri ekle
                str.append(resultSet.getString("firstname")).append(" ");
                // tüm regex ifadeye uyuşan elemanları array'e kaydet
                list_of_names = str.toString().split(" ");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void buttonCreateName(){
        double random_number = Math.random() * list_of_names.length;
        System.out.println(list_of_names[(int)random_number]);
    }

}

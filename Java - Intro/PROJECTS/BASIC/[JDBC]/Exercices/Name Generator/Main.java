import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        
        NameGenerator nameGenerator = new NameGenerator("root","******","names");
        nameGenerator.setParameters();
        nameGenerator.getNames();
        nameGenerator.buttonCreateName();

    }
}

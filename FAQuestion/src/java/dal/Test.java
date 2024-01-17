import dal.UserDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
        UserDAO a = new UserDAO();
        a.getUserById(1);
    }
}

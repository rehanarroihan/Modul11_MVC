
package pack.control;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


public class login_koneksi {

    private static Connection koneksi;

    public static Connection GetConnection() throws
            SQLException {
        if (koneksi == null) {
            Driver driver = new Driver();
            koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/db_toko?"
                    + "zeroDateTimeBehavior=convertToNull", "root", "");
        }
        return koneksi;
    }
}

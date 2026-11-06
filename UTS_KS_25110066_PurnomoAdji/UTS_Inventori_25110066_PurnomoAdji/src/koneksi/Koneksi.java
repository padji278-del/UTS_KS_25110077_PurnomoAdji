package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {

    private static final String URL =
            "jdbc:mysql://localhost:3306/db_inventori";

    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getKoneksi() {
        Connection koneksi = null;

        try {
            koneksi = DriverManager.getConnection(
                    URL, USER, PASSWORD
            );

            System.out.println("Koneksi Database Berhasil!");

        } catch (SQLException e) {
            System.out.println("Koneksi Database Gagal!");
            System.out.println(e.getMessage());
        }

        return koneksi;
    }
}
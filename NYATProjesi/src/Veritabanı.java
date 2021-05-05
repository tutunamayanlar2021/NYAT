import java.sql.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Veritabanı {
    static String url = "jdbc:postgresql://localhost:5432/Proje";
    static Connection conn = null;
     boolean dogrula=false;
    static Connection baglan() {
        try {
            conn = DriverManager.getConnection(url, "postgres", "k12345");
            System.out.println("***********Veritabanına Bağlanıldı***********");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return conn;
    }


    public void dogrula() throws SQLException {
        Scanner veriAl=new Scanner(System.in);
        String KullanıcıAdı="";
        String KullanıcıSifre="";

        if(conn==null){
            baglan();
        }
        Statement stm = conn.createStatement();
        ResultSet rs=stm.executeQuery("select * from \"Kullanıcı\";");



        while(dogrula==false){
         System.out.print("Kullanıcı adınızı giriniz: ");
        String vAdi = veriAl.next();
        System.out.print("Şifrenizi giriniz: ");
        String vsifre = veriAl.next();
            if (vAdi.equals(KullanıcıAdı) && vsifre.equals(KullanıcıSifre)) {
                System.out.println("Giriş başarılı!\n");
                dogrula = true;
                break;

            }
        while (rs.next()) {
            //System.out.println(rs.getString("Adı"));
            KullanıcıAdı = rs.getString("Adı");
            KullanıcıSifre = rs.getString("Şifre");
            if (vAdi.equals(KullanıcıAdı) && vsifre.equals(KullanıcıSifre)) {
                System.out.println("**************Giriş Başarılı!**************\n");
                dogrula = true;
                break;

            }
           else {
                System.out.println("Kullanıcı adı veya şifre yanlış!\nKullanıcı bilgilerinizi tekrar giriniz.\n");
                dogrula = false;
              break;
            }
          }

        }conn.close();


}  }

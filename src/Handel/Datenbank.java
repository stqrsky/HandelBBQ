package Handel;

import com.mysql.jdbc.CommunicationsException;

import java.sql.*;

public class Datenbank {

    private Connection connection = null;
    private Statement statement = null;


    public Datenbank()  {
        //Vorsicht hier ist keine Fehlerbehandlung möglich
      connect();


    }

    private void connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Connection String
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/handel?characterEncoding=Latin1", PrivatDaten.User, PrivatDaten.PW);
            statement = connection.createStatement();
        }   catch (CommunicationsException e){
            System.out.println("hallo");
            e.getMessage();
        }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }


    public void dbin(Kunde k)  {
        connect();
        try {
            String t1 = "','";
            String sql = new StringBuilder().append("insert into kunde values ('").append(k.getKnr()).append("','").append(k.getVorname())
                    .append(t1).append(k.getNachname()).append(t1).append(k.getStrasse()).append(t1)
                    .append(k.getHausnr()).append(t1).append(k.getPlz()).append(t1).append(k.getOrt()).append(t1)
                    .append(k.getEmail()).append("')").toString();

            System.out.println(sql);
            statement.executeUpdate(sql);
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void dbout(Kunde kunde) {
        int knr = kunde.getKnr();
        connect();
        try {
            ResultSet result = statement.executeQuery(
                    "select * from kunde where knr =" + knr
            );
            if(result.next()) {
                kunde.setVorname(result.getString("vorname"));
                kunde.setNachname(result.getString("nachname"));
                kunde.setOrt(result.getString("ort"));
                kunde.setPlz(result.getString("plz"));
                kunde.setStrasse(result.getString("strasse"));
                kunde.setHausnr(result.getString("hausnummer"));
                kunde.setEmail(result.getString("email"));
            }else {
                kunde.setVorname("Kunden nummer nicht vorhanden");
            }
            result.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}

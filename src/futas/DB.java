/*
 * Made by Andrea Mate.
 * For practice.
 * This is the way!
 */
package futas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.ObservableList;

/* @author Máté Andrea */
public class DB {

    final String db = "jdbc:mysql://localhost:3306/futas?useUnicode=true&characterEncoding=UTF-8";
    final String user = "futo";
    final String pass = "futo";

    public void beolvas(ObservableList<Edzes> tabla) {
        String s = "select * from naplo order by datum";
        try (Connection kapcs = DriverManager.getConnection(db, user, pass);
                PreparedStatement ekp = kapcs.prepareStatement(s)) {
            tabla.clear();
            ResultSet eredmeny = ekp.executeQuery();
            while (eredmeny.next()) {
                tabla.add(new Edzes(
                        eredmeny.getInt("futasID"),
                        eredmeny.getString("datum"),
                        eredmeny.getInt("tav"),
                        eredmeny.getInt("ido")));
            }
        } catch (SQLException e) {
            panel.Panel.hiba("Hiba!", e.getMessage());
        }
    }

    public int hozzáad(String datum, int tav, int ido) {
        String s = "insert into naplo (datum,tav,ido) values (?,?,?)";
        try (Connection kapcs = DriverManager.getConnection(db, user, pass);
                PreparedStatement ekp = kapcs.prepareStatement(s)) {
            ekp.setString(1, datum);
            ekp.setInt(2, tav);
            ekp.setInt(3, ido);
            return ekp.executeUpdate();
        } catch (Exception e) {
            panel.Panel.hiba("Hiba", e.getMessage());
            return 0;
        }
    }

    public int modosit(int id, String datum, int tav, int ido) {
        String s = "update naplo set datum=?,tav=?,ido=? where futasID=?;";
        try (Connection kapcs = DriverManager.getConnection(db, user, pass);
                PreparedStatement ekp = kapcs.prepareStatement(s)) {
            ekp.setString(1, datum);
            ekp.setInt(2, tav);
            ekp.setInt(3, ido);
            ekp.setInt(4, id);
            return ekp.executeUpdate();
        } catch (SQLException e) {
            panel.Panel.hiba("Hiba!", e.getMessage());
            return 0;
        }
    }
    public int torol(int id){
        String s = "delete from naplo where futasID=?;";
        try (Connection kapcs = DriverManager.getConnection(db, user, pass);
                PreparedStatement ekp = kapcs.prepareStatement(s)) {
            ekp.setInt(1, id);
            return ekp.executeUpdate();
        } catch (SQLException e) {
            panel.Panel.hiba("Hiba!", e.getMessage());
            return 0;
        }
    }
}

package services;

import entities.preference;
import utils.MyDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServicePreference implements Iservice<preference>  {
    private Connection connection ;
    public ServicePreference(){
        connection= MyDB.getInstance().getConnection();
    }
    @Override

    public void ajouter(preference preference) throws SQLException {
        String req = "INSERT INTO preference (taille, style, marque, couleur) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pre = connection.prepareStatement(req)) {
            pre.setString(1, preference.getTaille());
            pre.setString(2, preference.getStyle());
            pre.setString(3, preference.getMarque());
            pre.setString(4, preference.getCouleur());

            pre.executeUpdate();
        }
    }

    @Override
    public void modifier(preference preference) throws SQLException {
        String req = "update preference set taille=? , style=? , marque=? , couleur=? where id=?" ;
        PreparedStatement pre = connection.prepareStatement(req);
        pre.setString(1,preference.getTaille());
        pre.setString(2,preference.getStyle());
        pre.setString(3,preference.getMarque());
        pre.setString(4,preference.getCouleur());
        pre.setInt(5,preference.getId());

        pre.executeUpdate();
    }

    @Override
    public void supprimer(preference preference) throws SQLException {
        String req = " delete from preference where id=?" ;
        PreparedStatement pre = connection.prepareStatement(req);
        pre.setInt(1,preference.getId());
        pre.executeUpdate();
    }

    @Override
    public List<    preference> afficher() throws SQLException {
        String req ="select * from preference" ;
        Statement ste = connection.createStatement();
        ResultSet res = ste.executeQuery(req);
        List<preference> list = new ArrayList<>();
        while (res.next()) {
            preference p = new preference();
            p.setId(res.getInt(1));
            p.setTaille(res.getString(2));
            p.setStyle(res.getString(3));
            p.setMarque(res.getString(3));
            p.setCouleur(res.getString(4));
            list.add(p);
        }
        return list;
    }
}

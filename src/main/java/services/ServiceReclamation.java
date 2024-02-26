package services;

import entities.reclamation;
import utils.MyDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceReclamation implements Iservice<reclamation>  {
    private Connection connection ;
    public ServiceReclamation(){
        connection= MyDB.getInstance().getConnection();

    }
    @Override
    public void ajouter(reclamation reclamation) throws SQLException {
        String req ="INSERT INTO reclamation (type,description,statut,date)"+
                "VALUES ('"+reclamation.getType()+"','"+reclamation.getDescription()+"','"
                +reclamation.getStatut()+"',"+reclamation.getDate()+")" ;
        Statement ste=connection.createStatement();
        ste.executeUpdate(req);



    }

    @Override
    public void modifier(reclamation reclamation) throws SQLException {
        String req = "update reclamation set type=? , description=? , date=? , statut=? where id=?" ;
        PreparedStatement pre = connection.prepareStatement(req);
        pre.setString(1,reclamation.getType());
        pre.setString(2,reclamation.getDescription());
        pre.setString(3,reclamation.getDate());
        pre.setString(4,reclamation.getStatut());
        pre.setInt(5,reclamation.getId());

        pre.executeUpdate();



    }

    @Override
    public void supprimer(reclamation reclamation) throws SQLException {
        String req = " delete from reclamation where id=?" ;
        PreparedStatement pre = connection.prepareStatement(req);
        pre.setInt(1,reclamation.getId());
        pre.executeUpdate();
    }

    @Override
    public List<reclamation> afficher() throws SQLException {
        String req ="select * from reclamation" ;
    Statement ste = connection.createStatement();
    ResultSet res = ste.executeQuery(req);
    List<reclamation> list = new ArrayList<>();
    while (res.next()) {
        reclamation r = new reclamation();
        r.setId(res.getInt(1));
        r.setType(res.getString(2));
        r.setDescription(res.getString(3));
        r.setDate(res.getString(3));
        r.setStatut(res.getString(4));
        list.add(r);
    }
    return list;
    }
}

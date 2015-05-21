/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import PIMclass.PIMCollection;
import PIMclass.PIMEntity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yangmi
 */
public class PIMSQLManager implements manager.RemotePIMCollection{

    private Connection connection;
    private Statement statement;
    private ResultSet resultset;
    private ResultSetMetaData metaDate;
    private int numberofRows;
    private boolean connectiontodatabase=false;
    
    PIMSQLManager(String driver,String url,String usename,String password) throws ClassNotFoundException, SQLException{
        Class.forName(driver);
        connection=DriverManager.getConnection(url, usename, password);
        statement=connection.createStatement();
        connectiontodatabase=true;
    }
   

    @Override
    public PIMCollection getNotes() throws CustomizedException {
        PIMCollection a=new PIMCollection();
        try {
            do{
            resultset =statement.executeQuery("select * from msgmain join note where msgmain.id=note.id");
            String owner=resultset.getString("owner");
            String priority=resultset.getString("priority");
            String property=resultset.getString("property");
            String note=resultset.getString("note");
            PIMclass.PIMNote tep=new PIMclass.PIMNote(note, PIMEntity.f.valueOf(priority), PIMEntity.P.valueOf(property), owner);
            a.add(tep);
            }while(resultset.next());
        } catch (SQLException ex) {
            Logger.getLogger(PIMSQLManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }

    @Override
    public PIMCollection getNotes(String owner) throws CustomizedException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PIMCollection getTodos() throws CustomizedException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PIMCollection getTodos(String owner) throws CustomizedException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PIMCollection getAppointments() throws CustomizedException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PIMCollection getAppointments(String owner) throws CustomizedException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PIMCollection getContacts() throws CustomizedException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PIMCollection getContacts(String owner) throws CustomizedException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PIMCollection getItemsForDate(Date d) throws CustomizedException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PIMCollection getItemsForDate(Date d, String owner) throws CustomizedException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PIMCollection getAll() throws CustomizedException {
         PIMCollection a=new PIMCollection();
        return a;
    }

    @Override
    public PIMCollection getAllByOwner(String owner) throws CustomizedException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(PIMEntity entity) throws CustomizedException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

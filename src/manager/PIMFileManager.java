/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import PIMclass.PIMAppointment;
import PIMclass.PIMCollection;
import PIMclass.PIMContact;
import PIMclass.PIMEntity;
import PIMclass.PIMNote;
import PIMclass.PIMToDo;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yangmi
 */
public class PIMFileManager implements RemotePIMCollection{
    String filename;

    public PIMFileManager(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    
    @Override
    public PIMCollection getNotes() throws CustomizedException {
        InputStream is=null;
        PIMCollection result=new PIMCollection();
        try {
            is = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(is);
            while(true){
                PIMEntity tem=(PIMEntity) ois.readObject();
                if(tem.getClass().getName().equals("PIMclass.PIMNote")){
                    result.add(tem);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                is.close();
            } catch (IOException ex) {
                Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
    }

    @Override
    public PIMCollection getNotes(String owner) throws CustomizedException {
        InputStream is=null;
        PIMCollection result=new PIMCollection();
        try {
            is = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(is);
            while(true){
                PIMEntity tem=(PIMEntity) ois.readObject();
                if(tem.getClass().getName().equals("PIMclass.PIMNote")&&
                        tem.getClass().getDeclaredField("owner").get(tem).equals(owner)){
                    result.add(tem);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchFieldException ex) {
            Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                is.close();
            } catch (IOException ex) {
                Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
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
        InputStream is=null;
        PIMCollection result=new PIMCollection();
        try {
            is = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(is);
            result=(PIMCollection) ois.readObject();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
            FileOutputStream os=new FileOutputStream(filename);
            os.close();
        } catch (IOException ex) {
            Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(is!=null)is.close();
            } catch (IOException ex) {
                Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
                return result;
            }
            return result;
        }
    }
    

    @Override
    public PIMCollection getAllByOwner(String owner) throws CustomizedException {
        InputStream is=null;
        PIMCollection result=new PIMCollection();
        try {
            is = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(is);
            while(true){
                PIMEntity tem=(PIMEntity) ois.readObject();
                if(tem.getClass().getDeclaredField("owner").get(tem).equals(owner));
                    result.add(tem);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchFieldException ex) {
            Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                is.close();
            } catch (IOException ex) {
                Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
    }
    

    @Override
    public boolean add(PIMEntity entity) throws CustomizedException {
        pimfinal.PIMFinal.getCollection().add(entity);
        try {
            OutputStream os=null;
            os = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(pimfinal.PIMFinal.getCollection());
            oos.flush();
            os.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (IOException ex) {
            Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
        
    }
    public boolean save(PIMCollection coo) throws CustomizedException{
         try {
            OutputStream os=null;
            os = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(pimfinal.PIMFinal.getCollection());
            oos.flush();
            os.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (IOException ex) {
            Logger.getLogger(PIMFileManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
         return true;
    }
}

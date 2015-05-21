/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pimfinal;

import PIMclass.PIMAppointment;
import PIMclass.PIMCollection;
import PIMclass.PIMEntity;
import PIMclass.PIMEntity.P;
import PIMclass.PIMEntity.f;
import PIMclass.PIMToDo;
import java.util.Calendar;
import javax.swing.JFrame;
import manager.CustomizedException;
import manager.PIMFileManager;
import ui.CalenderFrame;

/**
 *
 * @author yangmi
 */
public class PIMFinal {
    static String filename;

    public static String getFilename() {
        return filename;
    }

    public static void setFilename(String filename) {
        PIMFinal.filename = filename;
    }

    public static PIMCollection getCollection() {
        return collection;
    }

    public static void setCollection(PIMCollection collection) {
        PIMFinal.collection = collection;
    }

    public static PIMFileManager getFilemanager() {
        return filemanager;
    }

    public static void setFilemanager(PIMFileManager filemanager) {
        PIMFinal.filemanager = filemanager;
    }
    static PIMclass.PIMCollection collection;
    static manager.PIMFileManager filemanager;
    static ui.CalenderFrame fram;

    public static CalenderFrame getFram() {
        return fram;
    }

    public static void setFram(CalenderFrame fram) {
        PIMFinal.fram = fram;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CustomizedException {
        // TODO code application logic here
        setFilename("PIM.txt");
        filemanager=new manager.PIMFileManager(filename);
        collection=filemanager.getAll();
//        boolean a=filemanager.add(new PIMToDo(Calendar.getInstance(), "describe", f.Private, P.normal, ""));
//        boolean b=filemanager.add(new PIMAppointment(Calendar.getInstance(), "somthing", f.Public, P.normal, ""));
//        System.out.println(a+" "+b);
        fram=new ui.CalenderFrame();
        fram.setIfo_PIM(collection);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                fram.setTitle("PIM");
                fram.paint();
                fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                fram.setVisible(true);
            }
        });
        
    }
    
}

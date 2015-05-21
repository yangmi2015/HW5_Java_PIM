/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PIMclass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author yangmi
 * @param <PIMEntity>
 */
public class PIMCollection extends ArrayList<PIMEntity> implements
        Collection<PIMEntity>, PIMCollect {

    @Override
    public PIMCollection getNotes() {
        PIMCollection a=new PIMCollection();
        Iterator<PIMEntity> itr = this.iterator();
        while (itr.hasNext()) {
            PIMEntity entry = (PIMEntity) itr.next();
            if ("".equals(entry.getOwner())
                    && entry.getClass().getName().equalsIgnoreCase("PIMclass.PIMNote")) {
                a.add(entry);
            }
        }
        return  a;
    }

    @Override
    public PIMCollection getNotes(String owner) {
        PIMCollection a=new PIMCollection();
        Iterator<PIMEntity> itr = this.iterator();
        while (itr.hasNext()) {
            PIMEntity entry = (PIMEntity) itr.next();
            if (owner.equals(entry.getOwner())
                    && entry.getClass().getName().equalsIgnoreCase("PIMclass.PIMNote")) {
                a.add(entry);
            }
        }
        return  a;
    }

    @Override
    public PIMCollection getTodos() {
        PIMCollection a=new PIMCollection();
        Iterator<PIMEntity> itr = this.iterator();
        while (itr.hasNext()) {
            PIMEntity entry = (PIMEntity) itr.next();
            if ("".equals(entry.getOwner())
                    && entry.getClass().getName().equalsIgnoreCase("PIMclass.PIMToDo")) {
                a.add(entry);
            }
        }
        return  a;
    }

    @Override
    public PIMCollection getTodos(String owner) {
        PIMCollection a=new PIMCollection();
        Iterator<PIMEntity> itr = this.iterator();
        while (itr.hasNext()) {
            PIMEntity entry = (PIMEntity) itr.next();
            if (owner.equals(entry.getOwner())
                    && entry.getClass().getName().equalsIgnoreCase("PIMclass.PIMToDo")) {
                a.add(entry);
            }
        }
        return  a;
    }

    @Override
    public PIMCollection getAppointments() {
        PIMCollection a = new PIMCollection();
        Iterator<PIMEntity> itr = this.iterator();
        while (itr.hasNext()) {
            PIMEntity entry = (PIMEntity) itr.next();
            if ("".equals(entry.getOwner())
                    && entry.getClass().getName().equalsIgnoreCase("PIMclass.PIMAppointment")) {
                a.add(entry);
            }
        }
        return a;
    }

    @Override
    public PIMCollection getAppointments(String owner) {
        PIMCollection a = new PIMCollection();
        Iterator<PIMEntity> itr = this.iterator();
        while (itr.hasNext()) {
            PIMEntity entry = (PIMEntity) itr.next();
            if (owner.equals(entry.getOwner())
                    && entry.getClass().getName().equalsIgnoreCase("PIMclass.PIMAppointment")) {
                a.add(entry);
            }
        }
        return a;
    }

    @Override
    public PIMCollection getContacts() {
        PIMCollection a = new PIMCollection();
        Iterator<PIMEntity> itr = this.iterator();
        while (itr.hasNext()) {
            PIMEntity entry = (PIMEntity) itr.next();
            if ("".equals(entry.getOwner())
                    && entry.getClass().getName().equalsIgnoreCase("PIMclass.PIMContact")) {
                a.add(entry);
            }
        }
        return a;
    }

    @Override
    public PIMCollection getContacts(String owner) {
        PIMCollection a = new PIMCollection();
        Iterator<PIMEntity> itr = this.iterator();
        while (itr.hasNext()) {
            PIMEntity entry = (PIMEntity) itr.next();
            if (owner.equals(entry.getOwner())
                    && entry.getClass().getName().equalsIgnoreCase("PIMclass.PIMContact")) {
                a.add(entry);
            }
        }
        return a;
    }

    @Override
    public PIMCollection getItemsForDate(Calendar d) {
        PIMCollection a = new PIMCollection();
        Iterator<PIMEntity> itr = this.iterator();
        while (itr.hasNext()) {
            PIMEntity entry = (PIMEntity) itr.next();
            if (!"".equals(entry.getOwner())) {
                continue;
            }
            if (entry.getClass().getName().equals("PIMclass.PIMAppointment")) {
                PIMAppointment temp = (PIMAppointment) entry;
                DateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
                if (format1.format(temp.getDate().getTime()).equals(format1.format(d.getTime()))) {
                    a.add(entry);
                }
            }
            if (entry.getClass().getName().equals("PIMclass.PIMToDo")) {
                PIMToDo temp = (PIMToDo) entry;
                DateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
                if (format1.format(temp.getDate().getTime()).equals(format1.format(d.getTime()))) {
                    a.add(entry);
                }

            }

        }
        return a;
    }

    @Override
    public PIMCollection getItemsForDate(Calendar d, String owner) {
        PIMCollection a = new PIMCollection();
        Iterator<PIMEntity> itr = this.iterator();
        while (itr.hasNext()) {
            PIMEntity entry = (PIMEntity) itr.next();
            if (!owner.equals(entry.getOwner())) {
                continue;
            }
            if (entry.getClass().getName().equals("PIMclass.PIMAppointment")) {
                PIMAppointment temp = (PIMAppointment) entry;
                DateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
                if (format1.format(temp.getDate()).equals(format1.format(d))) {
                    a.add(entry);
                }
            }
            if (entry.getClass().getName().equals("PIMclass.PIMToDo")) {
                PIMToDo temp = (PIMToDo) entry;
                DateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
                if (format1.format(temp.getDate().getTime()).equals(format1.format(d.getTime()))) {
                    a.add(entry);
                }

            }

        }
        return a;
    }

    @Override
    public PIMCollection getAll() {
        return this;
    }

    @Override
    public PIMCollection getAllByOwner(String owner) {
        PIMCollection a = new PIMCollection();
        Iterator<PIMEntity> itr = this.iterator();
        while (itr.hasNext()) {
            PIMEntity entry = (PIMEntity) itr.next();
            if (owner.equals(entry.getOwner())) {
                a.add(entry);
            }
        }
        return a;
    }

}

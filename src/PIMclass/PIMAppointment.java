/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PIMclass;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author yangmi
 */
public class PIMAppointment implements PIMEntity, Serializable {
	    private Calendar date;
            private String describe;
            private f flag;
            private P Priority;
            private String owner;

    @Override
    public String toString() {
        return new String("PIMAppointment:"+"\n"
                + "Owner:   "+owner+"\n"
                + "date:    "+date.getTime().toString()+"\n"
                + "Appointment:    "+describe+"\n"
                + "Property:  "+flag.name()+"\n"
                + "Priority:  "+Priority.name()+" \n");
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public f getFlag() {
        return flag;
    }

    public void setFlag(f flag) {
        this.flag = flag;
    }

    public P getPriority() {
        return Priority;
    }

    public void setPriority(P Priority) {
        this.Priority = Priority;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public PIMAppointment(Calendar date, String describe, f flag, P Priority, String owner) {
        this.date = date;
        this.describe = describe;
        this.flag = flag;
        this.Priority = Priority;
        this.owner = owner;
    }

	
}
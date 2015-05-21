/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PIMclass;

import static PIMclass.PIMEntity.P;
import static PIMclass.PIMEntity.f;
import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author yangmi
 */
public class PIMToDo implements PIMEntity, Serializable {

    public PIMToDo(Calendar date, String describe, f flag, P Priority, String owner) {
        this.date = date;
        this.describe = describe;
        this.flag = flag;
        this.Priority = Priority;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return new String("PIMToDo:"+"\n"
                + "Owner:   "+owner+"\n"
                + "date:    "+date.getTime().toString()+"\n"
                + "Todo:    "+describe+"\n"
                + "Property:  "+flag.name()+"\n"
                + "Priority:  "+Priority.name()+" \n"
                );
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

    @Override
    public f getFlag() {
        return flag;
    }

    @Override
    public void setFlag(f flag) {
        this.flag = flag;
    }

    @Override
    public P getPriority() {
        return Priority;
    }

    @Override
    public void setPriority(P Priority) {
        this.Priority = Priority;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    private Calendar date;
    private String describe;
    private f flag;
    private P Priority;
    private String owner;
}

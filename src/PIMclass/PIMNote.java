/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PIMclass;

import java.io.Serializable;

/**
 *
 * @author yangmi
 */
public class PIMNote implements PIMEntity, Serializable {
    private String note;
    private f flag;
    private P Priority;
    private String owner;

    @Override
    public String toString() {
        return new String("PIMNote:"+"\n"
                + "Owner:   "+owner+"\n"
                + "note:    "+note+"\n"
                + "Property:  "+flag.name()+"\n"
                + "Priority:  "+Priority.name()+"\n");
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

    public PIMNote(String note, f flag, P Priority, String owner) {
        this.note = note;
        this.flag = flag;
        this.Priority = Priority;
        this.owner = owner;
    }
}

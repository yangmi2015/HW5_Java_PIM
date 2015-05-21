/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PIMclass;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author yangmi
 */
public class PIMContact implements PIMEntity, Serializable {
	private String fname;
	private String lname;
	private String email;
	private String address;
        private f flag;
        private P Priority;
        private String owner;

    @Override
    public String toString() {
        return new String("PIMContact:"+"\n"
                + "Owner:   "+owner+"\n"
                + "Contact:    "+"\n"
                +"firstname:   "+fname
                +"lastname:    "+lname
                +"email:    "+email
                +"address:  "+address
                + "Property:  "+flag.name()+"\n"
                + "Priority:  "+Priority.name()+" \n");
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public PIMContact(String fname, String lname, String email, String address, f flag, P Priority, String owner) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.address = address;
        this.flag = flag;
        this.Priority = Priority;
        this.owner = owner;
    }

	
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PIMclass;

import java.util.Calendar;

/**
 *
 * @author yangmi
 */
public interface PIMCollect {
  public PIMCollection getNotes();
  public PIMCollection getNotes(String owner);
  public PIMCollection getTodos();
  public PIMCollection getTodos(String owner);
  public PIMCollection getAppointments();
  public PIMCollection getAppointments(String owner);
  public PIMCollection getContacts();
  public PIMCollection getContacts(String owner);
  public PIMCollection getItemsForDate(Calendar d);
  public PIMCollection getItemsForDate(Calendar d, String owner);
  public PIMCollection getAll();
  public PIMCollection getAllByOwner(String owner);
  public boolean add(PIMEntity entity);

}

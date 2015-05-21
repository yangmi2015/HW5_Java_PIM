/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import PIMclass.PIMCollection;
import PIMclass.PIMEntity;
import java.util.Date;

/**
 *
 * @author yangmi
 */
public interface RemotePIMCollection {
  public PIMCollection getNotes() throws CustomizedException;
  public PIMCollection getNotes(String owner) throws CustomizedException;
  public PIMCollection getTodos() throws CustomizedException;
  public PIMCollection getTodos(String owner) throws CustomizedException;
  public PIMCollection getAppointments() throws CustomizedException;
  public PIMCollection getAppointments(String owner) throws CustomizedException;
  public PIMCollection getContacts() throws CustomizedException;
  public PIMCollection getContacts(String owner) throws CustomizedException;
  public PIMCollection getItemsForDate(Date d) throws CustomizedException;
  public PIMCollection getItemsForDate(Date d, String owner) throws CustomizedException;
  public PIMCollection getAll() throws CustomizedException;
  public PIMCollection getAllByOwner(String owner) throws CustomizedException;
  public boolean add(PIMEntity entity) throws CustomizedException;
}


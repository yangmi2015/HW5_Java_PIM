/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PIMclass;

/**
 *
 * @author yangmi
 */
public interface PIMEntity {

    /**
     *
     */
    
        enum f {Private,Public};
        enum P {normal,urgent,relax};
	public P getPriority();
	public void setPriority(P p);
        public f getFlag();
        public void setFlag(f flag);
        public String getOwner();
        public void setOwner(String owner);
        @Override
        public String toString();
}

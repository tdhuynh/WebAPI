//
// This file was generated by the JPA Modeler
//
package org.ohdsi.webapi.study;

import java.io.Serializable;



public class StudySCCPairPK implements Serializable {

    private Integer target;

    private Integer outcome;

    private Integer ssc;

    public StudySCCPairPK(){
    }

    public StudySCCPairPK(Integer target,Integer outcome,Integer ssc){
        this.target=target;
        this.outcome=outcome;
        this.ssc=ssc;
    }


   public Integer getTarget() {
        return this.target;
    }

    public void setTarget (Integer target) {
        this.target = target;
    }

   public Integer getOutcome() {
        return this.outcome;
    }

    public void setOutcome (Integer outcome) {
        this.outcome = outcome;
    }

   public Integer getSsc() {
        return this.ssc;
    }

    public void setSsc (Integer ssc) {
        this.ssc = ssc;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {return false;}
        if (!java.util.Objects.equals(getClass(), obj.getClass())) {return false;}
        final StudySCCPairPK other = (StudySCCPairPK) obj;
        if (!java.util.Objects.equals(this.getTarget(), other.getTarget())) {        return false;        }
        if (!java.util.Objects.equals(this.getOutcome(), other.getOutcome())) {        return false;        }
        if (!java.util.Objects.equals(this.getSsc(), other.getSsc())) {        return false;        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (this.getTarget() != null ? this.getTarget().hashCode() : 0);
        hash = 89 * hash + (this.getOutcome() != null ? this.getOutcome().hashCode() : 0);
        hash = 89 * hash + (this.getSsc() != null ? this.getSsc().hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "StudySCCPairPK{" + " target=" + target + ", outcome=" + outcome + ", ssc=" + ssc + '}';
    }

}

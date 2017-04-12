/**
 * This file was generated by the JPA Modeler
 */ 

package org.ohdsi.webapi.study;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Chris Knoll <cknoll@ohdsi.org>
 */

@Entity
@Table(name="STUDY_CCA")
public class StudyCCA { 

    @Id
    @GeneratedValue(generator="STUDY_CCA_SEQ",strategy=GenerationType.SEQUENCE)
    @SequenceGenerator(name="STUDY_CCA_SEQ",sequenceName="STUDY_CCA_SEQ",allocationSize=1)
    private Integer id;

    @Basic
    private String params;

    @OneToMany(cascade={CascadeType.ALL},fetch = FetchType.LAZY,targetEntity = StudyCCATrio.class,mappedBy = "cca")
    private List<StudyCCATrio> trios = new java.util.ArrayList<>();


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParams() {
        return this.params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public List<StudyCCATrio> getTrios() {
        return this.trios;
    }

    public void setTrios(List<StudyCCATrio> trios) {
        this.trios = trios;
    }


}

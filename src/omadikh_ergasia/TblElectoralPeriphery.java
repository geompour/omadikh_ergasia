/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omadikh_ergasia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author geo
 */
@Entity
@Table(name = "TBL_ELECTORAL_PERIPHERY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblElectoralPeriphery.findAll", query = "SELECT t FROM TblElectoralPeriphery t")
    , @NamedQuery(name = "TblElectoralPeriphery.findByPkElectoralPeripheryId", query = "SELECT t FROM TblElectoralPeriphery t WHERE t.pkElectoralPeripheryId = :pkElectoralPeripheryId")
    , @NamedQuery(name = "TblElectoralPeriphery.findByFldName", query = "SELECT t FROM TblElectoralPeriphery t WHERE t.fldName = :fldName")
    , @NamedQuery(name = "TblElectoralPeriphery.findByFldRegisteredCitizensCount", query = "SELECT t FROM TblElectoralPeriphery t WHERE t.fldRegisteredCitizensCount = :fldRegisteredCitizensCount")
    , @NamedQuery(name = "TblElectoralPeriphery.findByFldSeatsCount", query = "SELECT t FROM TblElectoralPeriphery t WHERE t.fldSeatsCount = :fldSeatsCount")})
public class TblElectoralPeriphery implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PK_ELECTORAL_PERIPHERY_ID")
    private Integer pkElectoralPeripheryId;
    @Basic(optional = false)
    @Column(name = "FLD_NAME")
    private String fldName;
    @Column(name = "FLD_REGISTERED_CITIZENS_COUNT")
    private Integer fldRegisteredCitizensCount;
    @Column(name = "FLD_SEATS_COUNT")
    private Integer fldSeatsCount;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkElectoralPeripheryId")
    private List<TblCandidate> tblCandidateList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkElectoralPeripheryId")
    private List<TblVote> tblVoteList;

    public TblElectoralPeriphery() {
    }

    public TblElectoralPeriphery(Integer pkElectoralPeripheryId) {
        this.pkElectoralPeripheryId = pkElectoralPeripheryId;
    }

    public TblElectoralPeriphery(Integer pkElectoralPeripheryId, String fldName) {
        this.pkElectoralPeripheryId = pkElectoralPeripheryId;
        this.fldName = fldName;
    }

    TblElectoralPeriphery(String periphery_name, Integer registeredCitizens_count, Integer seats_count) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getPkElectoralPeripheryId() {
        return pkElectoralPeripheryId;
    }

    public void setPkElectoralPeripheryId(Integer pkElectoralPeripheryId) {
        this.pkElectoralPeripheryId = pkElectoralPeripheryId;
    }

    public String getFldName() {
        return fldName;
    }

    public void setFldName(String fldName) {
        this.fldName = fldName;
    }

    public Integer getFldRegisteredCitizensCount() {
        return fldRegisteredCitizensCount;
    }

    public void setFldRegisteredCitizensCount(Integer fldRegisteredCitizensCount) {
        this.fldRegisteredCitizensCount = fldRegisteredCitizensCount;
    }

    public Integer getFldSeatsCount() {
        return fldSeatsCount;
    }

    public void setFldSeatsCount(Integer fldSeatsCount) {
        this.fldSeatsCount = fldSeatsCount;
    }

    @XmlTransient
    public List<TblCandidate> getTblCandidateList() {
        return tblCandidateList;
    }

    public void setTblCandidateList(List<TblCandidate> tblCandidateList) {
        this.tblCandidateList = tblCandidateList;
    }

    @XmlTransient
    public List<TblVote> getTblVoteList() {
        return tblVoteList;
    }

    public void setTblVoteList(List<TblVote> tblVoteList) {
        this.tblVoteList = tblVoteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkElectoralPeripheryId != null ? pkElectoralPeripheryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblElectoralPeriphery)) {
            return false;
        }
        TblElectoralPeriphery other = (TblElectoralPeriphery) object;
        if ((this.pkElectoralPeripheryId == null && other.pkElectoralPeripheryId != null) || (this.pkElectoralPeripheryId != null && !this.pkElectoralPeripheryId.equals(other.pkElectoralPeripheryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "omadikh_ergasia.TblElectoralPeriphery[ pkElectoralPeripheryId=" + pkElectoralPeripheryId + " ]";
    }
    
}

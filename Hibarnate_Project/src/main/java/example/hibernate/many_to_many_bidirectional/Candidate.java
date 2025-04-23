package example.hibernate.many_to_many_bidirectional;

import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

//this is the OWNING side
@Entity
@Table(name = "Candidate_master")
public class Candidate {
	@Id
	private int candidateId;
	private String cNames;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "candidate_certification_master", joinColumns = { @JoinColumn(name = "cand_Id") }// foriegn key
																										// referring to
																										// pk of OWNING
																										// side
			, inverseJoinColumns = { @JoinColumn(name = "certi_id") }// foriegn key referring to pk of INVERSE side
	)
	private Collection<Certification> certifications;

	@Override
	public String toString() {
		return "Candidate [candidateId=" + candidateId + ", cNames=" + cNames + ", candidates=" + certifications + "]";
	}

	public int getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	public String getcNames() {
		return cNames;
	}

	public void setcNames(String cNames) {
		this.cNames = cNames;
	}

	public Collection<Certification> getCandidates() {
		return certifications;
	}

// add collection 
	public void setCandidates(Collection<Certification> certifications) {
		this.certifications = certifications;
		// Setting other end as well
		for (Certification c : certifications) {
			c.getCertifications().add(this);
		}
	}

// add 1 certificate at a time
	public void addCandidates(Certification certi) {
		certifications.add(certi);
		// setting other end as well
		certi.getCertifications().add(this);
	}

	public Candidate(int candidateId, String cNames, Collection<Certification> certifications) {
		super();
		this.candidateId = candidateId;
		this.cNames = cNames;
		this.certifications = certifications;
	}

	public Candidate() {
	}
}


package example.hibernate.many_to_many_bidirectional;

import java.util.Collection;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

//this is the INCERSE side
@Entity
@Table(name = "certification_master")
public class Certification {
	@Id
	@Column(name = "certification_code", length = 5)
	private String certificateCode;
	private String name;

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "certifications")

	private Collection<Candidate> candidates;

	public Certification() {
		// TODO Auto-generated constructor stub
	}

	public Certification(String certificateCode, String name, Collection<Candidate> candidates) {
		super();
		this.certificateCode = certificateCode;
		this.name = name;
		this.candidates = candidates;
	}

	public String getCertificateCode() {
		return certificateCode;
	}

	public void setCertificateCode(String certificateCode) {
		this.certificateCode = certificateCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Candidate> getCertifications() {
		return candidates;
	}

	public void setCertifications(Collection<Candidate> candidates) {
		this.candidates = candidates;
	}

	@Override
	public String toString() {
		return "Certification [certificateCode=" + certificateCode + ", name=" + name + ", certifications=" + candidates
				+ "]";
	}

}

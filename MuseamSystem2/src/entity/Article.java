package entity;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "articles")
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	private String name;

	@Enumerated(EnumType.STRING) // Store enum as string (e.g., "TECH", "SPORTS")
	@Column(nullable = false)
	private Catogery Catogery;

	@Column(name = "date_created")
	private LocalDate dateCreated;

	@Column(name = "creator_name")
	private String creatorName;

	public Article() {
	}

	public Article(Integer id, String name, Catogery Catogery, LocalDate dateCreated, String creatorName) {
		this.id = id;
		this.name = name;
		this.Catogery = Catogery;
		this.dateCreated = dateCreated;
		this.creatorName = creatorName;
	}

	// Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Catogery getCatogery() {
		return Catogery;
	}

	public void setCatogery(Catogery Catogery) {
		this.Catogery = Catogery;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", name=" + name + ", Catogery=" + Catogery + ", dateCreated=" + dateCreated
				+ ", creatorName=" + creatorName + "]";
	}
}

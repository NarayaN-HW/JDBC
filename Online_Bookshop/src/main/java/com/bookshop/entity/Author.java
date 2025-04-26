package com.bookshop.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "author_master")
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int authorId;

	@Column(name = "author_name", length = 30)
	private String authorName;

	@Column(name = "author_email", length = 30)
	private String email;

	@Column(name = "author_country", length = 30)
	private String country;

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public Author() {

	}

	public Author(int authorId, String authorName, String email, String country) {
		this.authorId = authorId;
		this.authorName = authorName;
		this.email = email;
		this.country = country;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getAuthorId() {
		return authorId;
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + ", email=" + email + ", country="
				+ country + "]";
	}

}

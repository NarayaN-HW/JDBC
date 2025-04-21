package example.hibernate.entity;

public class Movie {

	private int movieId;
	private String title;
	private String genre;
	private int year;

	public Movie() {

	}

	public Movie(int movieId, String title, String genre, int year) {
		this.movieId = movieId;
		this.title = title;
		this.genre = genre;
		this.year = year;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ",\t title=" + title + ",\t genre=" + genre + ",\t year=" + year + "]";
	}

}

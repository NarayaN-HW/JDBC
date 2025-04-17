package service;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Optional;

import dao.ArticleDao;
import entity.Article;
import entity.Catogery;
import exception.ResourceAlreadyExistException;
import exception.ResourceNotFoundArticle;

public class ArticleServices {
	private ArticleDao dao;

	public ArticleServices() throws SQLException {
		dao = new ArticleDao();
	}

	public void addArticle(String name, Catogery category, LocalDate date_created, String cratorName)
			throws SQLException {
		Optional<Article> exisitngarticle = dao.getAll().stream().filter(art -> art.getName().equalsIgnoreCase(name))
				.findFirst();

		if (exisitngarticle.isEmpty()) {

			Article newarticle = new Article(null, name, category, date_created, cratorName);
			boolean status = dao.save(newarticle);

			if (status)
				System.out.println("Article added successfully " + name);
			else
				System.out.println("Article failed to add");
		} else

			throw new ResourceAlreadyExistException("Article already exist with same name: " + name);
	}

	public void displayGetall() throws SQLException {
		dao.getAll().stream().forEach(article -> System.out.println(article));
	}

	public void displayGetonebyID(Integer id) throws SQLException {
		Article foundArticle = dao.getOnebyId(id);
		if (foundArticle != null)
			System.out.println(foundArticle);
		else
			throw new ResourceNotFoundArticle("Arrticle not found id: " + id);
	}
}

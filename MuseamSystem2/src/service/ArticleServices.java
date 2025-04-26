package service;

import java.time.LocalDate;
import java.util.Optional;
import dao.ArticleDao;
import entity.Article;
import exception.ResourceAlreadyExistException;
import exception.ResourceNotFoundArticle;

public class ArticleServices {
    private ArticleDao dao;

    public ArticleServices() {
        dao = new ArticleDao();  // Hibernate-based DAO
    }

    public void addArticle(String name, Category category, LocalDate dateCreated, String creatorName) {
        Optional<Article> existingArticle = dao.getAll().stream()
                .filter(art -> art.getName().equalsIgnoreCase(name))
                .findFirst();

        if (existingArticle.isEmpty()) {
            Article newArticle = new Article(null, name, category, dateCreated, creatorName);
            boolean status = dao.save(newArticle);

            if (status)
                System.out.println("Article added successfully: " + name);
            else
                System.out.println("Failed to add article.");
        } else {
            throw new ResourceAlreadyExistException("Article already exists with name: " + name);
        }
    }

    public void displayGetAll() {
        dao.getAll().forEach(System.out::println);
    }

    public void displayGetOneById(Integer id) {
        Article foundArticle = dao.getOneById(id);
        if (foundArticle != null)
            System.out.println(foundArticle);
        else
            throw new ResourceNotFoundArticle("Article not found with ID: " + id);
    }

    public void deleteRecord(Integer id) {
        dao.delete(id);
        System.out.println("Article deleted successfully.");
    }

    public void updateRecordArticle(int id, Category category, LocalDate date, String name, String creatorName) {
        Article article = new Article(id, name, category, date, creatorName);
        dao.update(article);
        System.out.println("Article updated successfully.");
    }
}

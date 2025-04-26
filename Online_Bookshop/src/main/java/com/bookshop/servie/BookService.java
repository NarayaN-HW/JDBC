package com.bookshop.servie;

import java.util.Optional;

import com.bookshop.dao.AuthorDao;
import com.bookshop.dao.BookDao;
import com.bookshop.entity.Author;
import com.bookshop.entity.Book;
import com.bookshop.exception.ResourceAlreadyExistException;
import com.bookshop.exception.ResourceNotFoundException;

public class BookService {
	private BookDao dao;
	private AuthorDao adao;

	public BookService() {
		dao = new BookDao();
		adao = new AuthorDao();
	}

	public boolean AddingBook(Book newbook, String authorname, String authorEmail, String authorCountry) {

		// 1 validate Book with same name
		Optional<Book> foundbook = dao.findAllBooks().stream()
				.filter(b -> b.getTitle().equalsIgnoreCase(newbook.getTitle())).findFirst();
		if (foundbook.isPresent()) {
			throw new ResourceAlreadyExistException(" Book is already present same Title!!!");
		}
		// 2 search for author if new author save and else already author is to linked
		Author foundAuthor = adao.findAuthorNameandEmail(authorname, authorEmail);

		if (foundAuthor == null) {
			Author newAuth = new Author(0, authorname, authorEmail, authorCountry);
			boolean isSave = adao.save(newAuth);
			if (isSave) {
				newbook.setAuthor(newAuth);
			}

		} else {
			newbook.setAuthor(foundAuthor);
		}

		// 3 search for books
		return dao.save(newbook);
	}

	public Book getDisplayBookbyTitle(String title) {
		Book foundbook =dao.findByTitle(title); 
		if(foundbook==null) {
			throw new ResourceNotFoundException("Book not found by Title"+title);
		}else
			return foundbook;
	}
}

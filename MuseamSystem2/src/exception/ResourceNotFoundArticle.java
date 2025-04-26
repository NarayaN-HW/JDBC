package exception;

public class ResourceNotFoundArticle extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundArticle(String msg) {
		super(msg);
	}
}

package cglib;

public class Testcglib {
	public static void main(String[] args) {
		BookFacadeImpl bookFacade = new BookFacadeImpl();
		BookFacadeCglib cglib= new BookFacadeCglib();
		BookFacadeImpl bookcglib =(BookFacadeImpl) cglib.getInstance(bookFacade);
		bookcglib.addBook();
		
	}
}

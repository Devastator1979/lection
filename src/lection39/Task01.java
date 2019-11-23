package lection39;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class Book{
        private String isbn;
        private String title;
        private String author;

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
        
        
        public String getIsbn() {
            return isbn;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

//        public Book(String isbn, String title, String author) {
//            this.isbn = isbn;
//            this.title = title;
//            this.author = author;
//        }
        
    }
interface BookDao{
    Collection<Book> findAllBooks();
    Book findBookBuIsbn(Book book);
    void create(Book book);
    void delete(Book book);
    void update(Book book);
}
class InMemoryBookDao implements BookDao{
       private static Map<String, Book> bookstore = new HashMap<String, Book>();
       public Collection<Book> findAllBooks(){
           return bookstore.values();
       }
       public Book findBookBuIsbn(Book book){
           return bookstore.get(book.getIsbn());
       }
       public void create(Book book){
           bookstore.put(book.getIsbn(), book);
       }
       public void delete(Book book){
           bookstore.remove(book.getIsbn());
       }
       public void update(Book book){
           
       }      
}
class OracleBookDao implements BookDao{
       private static Map<String, Book> bookstore = new HashMap<String, Book>();
       public Collection<Book> findAllBooks(){
           return bookstore.values();
       }
       public Book findBookBuIsbn(Book book){
           return bookstore.get(book.getIsbn());
       }
       public void create(Book book){
           bookstore.put(book.getIsbn(), book);
       }
       public void delete(Book book){
           bookstore.remove(book.getIsbn());
       }
       public void update(Book book){
           
       }      
}
class MySqlBookDao implements BookDao{

        
       private static Map<String, Book> bookstore = new HashMap<String, Book>();
       public Collection<Book> findAllBooks(){
           return bookstore.values();
       }
       public Book findBookBuIsbn(Book book){
           return bookstore.get(book.getIsbn());
       }
       public void create(Book book){
        String url = "jdbc:mysql://localhost:3306/mybook?zeroDateTimeBehavior=convertToNull";
        String user = "root";
        String pwd = "admin";
        Connection conn;
           try {
               conn = DriverManager.getConnection(url, user, pwd);
               Statement stmt = (Statement) conn.createStatement();
               String q = "INSERT INTO book (isbn, title, author) VALUES ('" + book.getIsbn() + "', '" + book.getTitle() + "', '" + book.getAuthor()+"')";
               stmt.executeUpdate(q);
                
           } catch (SQLException ex) {
               Logger.getLogger(MySqlBookDao.class.getName()).log(Level.SEVERE, null, ex);
           }

           bookstore.put(book.getIsbn(), book);
       }
       public void delete(Book book){
           bookstore.remove(book.getIsbn());
       }
       public void update(Book book){
           
       }      
}

public class Task01 { 
    public static void main(String args[]){
        BookDao dao = new MySqlBookDao();
        Book book = new Book();
        book.setIsbn("hjsdfdsfhj");
        book.setTitle("New my book");
        book.setAuthor("Pasha Yanushkevich");
        dao.create(book);
        
        //book.setTitle("Updated");
        //dao.update(book);
        //dao.delete(book);
        //System.out.println(book);
    }
}
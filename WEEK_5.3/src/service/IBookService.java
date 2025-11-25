package service;

import model.Book;

public interface IBookService {
    public void addBook(Book book);
    public void getBookById(String id);
    public void getAllBooksByCategory(Object category);
    public void deleteBookById(String id);
    public void getAllBooks();
    public double caculateTotalValue();
}

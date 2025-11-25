package service.impl;

import constant.Constant;
import model.Book;
import model.Novel;
import model.TextBook;
import service.IBookService;

import javax.swing.text.Element;
import java.util.ArrayList;
import java.util.Scanner;

public class IBookServiceImpl implements IBookService {

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Book> books;

    public IBookServiceImpl(ArrayList<Book> books) {
        this.books = books;
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }


    @Override
    public void getBookById(String id) {
        boolean check = false;
        for(Book b : books){
            if(b.getId().equalsIgnoreCase(id)){
               b.displayInfo();
               check = true;
            }
        }
        if(!check){
            System.out.println(Constant.error.NOT_FIND_ID);
        }
    }

    @Override
    public void getAllBooksByCategory(Object category) {
        for(Book b : books){
            if(b instanceof Novel && category.equals("Novel")){
                b.displayInfo();
            }
            else if(b instanceof TextBook && category.equals("TextBook")){
                b.displayInfo();
            }
        }

    }

    @Override
    public void deleteBookById(String id) {
        boolean check = false;
        for(Book b : books){
            if(b.getId().equalsIgnoreCase(id)){
                books.remove(b);
                System.out.println(Constant.message.REMOVE);
                check = true;
                return;
            }
        }
        if(!check){
            System.out.println(Constant.error.NOT_FIND_ID);
        }
    }

    @Override
    public void getAllBooks() {
        if(books.isEmpty()){
            System.out.println(Constant.message.EMPTY);
            return;
        }
        for(Book b : books){
            b.displayInfo();
        }
    }

    @Override
    public double caculateTotalValue() {
        double kq,KQ = 0;
        
        if(books.isEmpty()){
            System.out.println(Constant.message.EMPTY);
            return 0;
        }
        for(Book b : books){
           kq = b.getPrice()*b.getQuantity();
           KQ += kq;
        }

        return KQ;
    }
}

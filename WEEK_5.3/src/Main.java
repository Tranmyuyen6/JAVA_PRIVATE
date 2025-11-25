import constant.Constant;
import model.Book;
import model.Novel;
import model.TextBook;
import service.impl.IBookServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Book> books = new ArrayList<>();
    private static IBookServiceImpl iBookService = new IBookServiceImpl(books);

    public static void main(String[] args) {
        books.add(new TextBook("dế mèn phiêu lưu kí","tô hoài", 2000,2,"đồng thoại"));
        books.add(new TextBook("truyện kiều","nguyễn du", 2000,2,"thơ nôm"));
        books.add(new TextBook("chí phèo","nam cao", 2000,2,"truyện ngắn"));
        books.add(new Novel("hary potter","jk rowling", 900, 20, "kì ảo"));
        books.add(new Novel("sherlock holmes","conan doyle", 600, 100, "trinh thám"));

        int choose;
        do {
            try{
                Constant.menu();
                choose = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                choose = 0;
            }
            switch (choose){
                case 1:
                    boolean check = false;
                    String title,author;
                    double price;
                    int quantity;
                    do {
                        System.out.println(Constant.enter.TITLE);
                        title = sc.nextLine();
                    }while (title.isEmpty());
                    do {
                        System.out.println(Constant.enter.AUTHOR);
                        author = sc.nextLine();
                    }while (author.isEmpty());
                    do {
                        System.out.println(Constant.enter.PRICE);
                        price = Double.parseDouble(sc.nextLine());
                    }while (price <= 0);
                    do {
                        System.out.println(Constant.enter.QUANTITY);
                        quantity = Integer.parseInt(sc.nextLine());
                    }while (quantity <= 0);
                    do {
                        System.out.println(Constant.enter.TYPE);
                        String type = sc.nextLine();
                        if(type.equalsIgnoreCase("novel")) {
                            System.out.println(Constant.enter.GENRE);
                            String genre = sc.nextLine();
                            iBookService.addBook(new Novel(title, author, price, quantity,genre));
                            System.out.println(Constant.message.ADD);
                            check = true;
                        }
                        if(type.equalsIgnoreCase("textbook")) {
                            System.out.println(Constant.enter.SUBJECT);
                            String subject = sc.nextLine();
                            iBookService.addBook(new TextBook(title, author, price, quantity,subject));
                            System.out.println(Constant.message.ADD);
                            check = true;
                        }
                    }while (!check);
                    iBookService.getAllBooks();
                    break;
                case 2:
                    System.out.println(Constant.enter.ID);
                    String id = sc.nextLine();
                    iBookService.getBookById(id);
                    break;
                case 3:
                    System.out.println(Constant.enter.TYPE);
                    Object category = sc.nextLine();
                    iBookService.getAllBooksByCategory(category);
                    break;
                case 4:
                    iBookService.getAllBooks();
                    break;
                case 5:
                    System.out.println(Constant.enter.ID);
                    String id2 = sc.nextLine();
                    iBookService.deleteBookById(id2);
                    iBookService.getAllBooks();
                    break;
                case 6:
                    System.out.println(iBookService.caculateTotalValue());
                    break;
                case 7:
                    System.out.println(Constant.message.EXIT);
                    break;
                default:
                    System.out.println(Constant.error.CHOOSE);
                    break;

            }


        }while (choose != 7);

    }
}
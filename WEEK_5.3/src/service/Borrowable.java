package service;

import model.Book;

public interface Borrowable{
    boolean borow(int quantity);
    int getAvaiableQuantity();
}

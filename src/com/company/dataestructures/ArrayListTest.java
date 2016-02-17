package com.company.dataestructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.company.app.pojo.Book;

public class ArrayListTest {

  public static void main(String[] args) {
    /* 
     * If order is important we are speaking about ArrayLists
     * 
     * In order to get one ArrayList of objects orderly will need 
     * to them implements Comparable
     * 
     * See the book.class implementatio
     * 
     */
    List<Book> lista = new ArrayList<>();
    
    Book b1 = new Book();
    b1.setId(1L);
    b1.setTitle("C");
    b1.setAuthor("A");
    
    Book b2 = new Book();
    b2.setId(2L);
    b2.setTitle("B");
    b2.setAuthor("B");
    
    Book b3 = new Book();
    b3.setId(3L);
    b3.setTitle("A");
    b3.setAuthor("C");
    
    lista.add(b1);
    lista.add(b2);
    lista.add(b3);
    
    /*If the order is important use arrayList*/
    System.out.println("=======Author=========");
    Collections.sort(lista,Book.Comparators.AUTHOR);
    System.out.println(lista);
    System.out.println("=======Title==========");
    Collections.sort(lista,Book.Comparators.TITLE);
    System.out.println(lista);
  }
}

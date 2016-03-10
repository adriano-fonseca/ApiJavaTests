package com.company.dataestructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.company.app.pojo.Book;
import com.company.app.pojo.ChildBook;

public class HashMapTest {
  static HashMap<Long, Book> bookMap = new HashMap<Long, Book>();
  
  public static void main(String[] args){  
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
    
    ChildBook b4 = new ChildBook();
    b4.setId(4L);
    b4.setTitle("A");
    b4.setAgeLimit(9);
    
    
    bookMap.put(b1.getId(), b1);
    bookMap.put(b2.getId(), b2);
    bookMap.put(b3.getId(), b3);
    
    printItems(bookMap);
    /*A little of polymorphism*/
    addOnMap(b4);
//    System.out.println(bookMap.get(b4.getId()));
  }
  
   private static void printItems(HashMap<Long, Book> bookMap) {
    for(Map.Entry<Long, Book> entry : bookMap.entrySet()){
      System.out.println("ID: "+entry.getKey()+" Title: "+entry.getValue().getTitle());
    }
    
  }

  static void addOnMap(Book b){
    bookMap.put(b.getId(), b);
  }
 }




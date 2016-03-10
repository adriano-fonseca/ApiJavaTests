package com.company.dataestructures;

import java.util.HashSet;
import java.util.Iterator;

import com.company.app.pojo.Book;

public class HashSetTest {

  public static void main(String[] args) {
    /*
     * If have not duplicity is important we are speaking about HashSet
     * Be careful with your equals e hashset implementation in Object Classes
     * */
    
    Book b1 = new Book();
    b1.setId(1L);
    b1.setTitle("titulo 1");
    
    Book b2 = new Book();
    b2.setId(1L);
    b2.setTitle("titulo 1");
    
    HashSet<Book> hashSet = new HashSet<Book>();
    hashSet.add(b1);
    hashSet.add(b2);
        
    /* Without equals e hash code in book
     * hashset does work as should (avoid repetition)
     * because it have not how know that the objects are the same
     * in order of see work fine just create equals and hashset in book
     * */
    
    Iterator<Book>it =hashSet.iterator();
    
    while (it.hasNext()) {
      System.out.println(it.next().getTitle());
    }
    
    System.out.println(hashSet.toString());
  }
  
}

package com.company.app.pojo;

import java.io.Serializable;
import java.util.Comparator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="book")
public class Book implements Serializable, Comparable<Book> {
  
  private static final long serialVersionUID = 1L;
  
  private Long id;
  private String author;
  private String title;
  
  public static class Comparators {
    public static Comparator<Book> AUTHOR = new Comparator<Book>() {
      @Override
      public int compare(Book o1, Book o2) {
          return o1.author.compareTo(o2.author);
      }
    };
    
    public static Comparator<Book> TITLE = new Comparator<Book>() {
      @Override
      public int compare(Book o1, Book o2) {
          return o1.title.compareTo(o2.title);
      }
  };
  }
  
  public String getAuthor() {
    return author;
  }
  
  public void setAuthor(String author) {
    this.author = author;
  }
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }


  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }
  
 


  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }


  @Override
  public int compareTo(Book o) {
      return Comparators.TITLE.compare(this, o);
  }
}

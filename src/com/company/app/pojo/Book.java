package com.company.app.pojo;

import java.io.Serializable;
import java.util.Comparator;
import java.util.HashSet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="book")
public class Book implements Serializable {
  
  private static final long serialVersionUID = 1L;
  
  private Long id;
  private String author;
  private String title;
  private HashSet<Page> pages = new HashSet<Page>();
  
  
  /* Comparator using LAMBDA just work in JAVA 8 (jdk 1.8)
  public static class Comparators {
    public static final Comparator<Book> AUTHOR = (Book o1, Book o2) -> o1.author.compareTo(o2.author);
    public static final Comparator<Book> TITLE = (Book o1, Book o2) -> o1.title.compareTo(o2.title);
  }
  */
  
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
    
    public static Comparator<Book> AUTHORANDTITLE = new Comparator<Book>() {
      @Override
      public int compare(Book o1, Book o2) {
          int i = o1.author.compareTo(o2.author);
          if (i != 0) return i;
          
          i = o1.title.compareTo(o2.title);
          return i;
          
      };
    };
    
//    public int compareTo(Person other) {
//      int i = firstName.compareTo(other.firstName);
//      if (i != 0) return i;
//
//      i = lastName.compareTo(other.lastName);
//      if (i != 0) return i;
//
//      return Integer.compare(age, other.age);
//    }
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
  
  public HashSet<Page> getPages() {
    return pages;
  }

  public void setPages(HashSet<Page> pages) {
    this.pages = pages;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Book other = (Book) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }
  
  
}



package com.company.app.pojo;

public class Page {
  private int pageNumber;
  private String content;
  
  public int getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(int pageNumber) {
    this.pageNumber = pageNumber;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + pageNumber;
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
    Page other = (Page) obj;
    if (pageNumber != other.pageNumber)
      return false;
    return true;
  }
  
}

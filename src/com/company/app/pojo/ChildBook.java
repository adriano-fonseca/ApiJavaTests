package com.company.app.pojo;

public class ChildBook extends Book {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  
  private int ageLimit;

  public int getAgeLimit() {
    return ageLimit;
  }

  public void setAgeLimit(int ageLimit) {
    this.ageLimit = ageLimit;
  }

}

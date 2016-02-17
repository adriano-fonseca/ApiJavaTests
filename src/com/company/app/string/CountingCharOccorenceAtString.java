package com.company.app.string;

public class CountingCharOccorenceAtString {
  public static void main(String[] args){
    String name = "adriano da silva fonseca";
    char[] charArray = name.toCharArray();
    char testChar = 'a';
    int count = 0;
    
    
    for(char  a : charArray){
      if(a==testChar){
        count++;
      }
    }
    
    System.out.println("Number of occurences: "+count);
  }
}

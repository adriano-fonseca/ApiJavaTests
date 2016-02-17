package com.company.app.string;

public class RemoveCharAtString {
  
  public static void main(String[] args){
    String name = "adriano da silva fonseca";
    Character chatToRemove = 'a';
    String nameAltered = removeChar(chatToRemove, name);
    System.out.println(nameAltered);
    
  }
  
  public static String removeChar(char a, String word){
    word = word.replace("a", "");
    return word;
  }

}

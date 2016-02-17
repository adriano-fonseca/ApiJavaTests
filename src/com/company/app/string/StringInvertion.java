package com.company.app.string;

public class StringInvertion {

  public static void main(String[] args) {
    String name = "Adriano";
    StringBuilder novo = new StringBuilder(name);
    novo = novo.reverse();
    System.out.println(novo);
    
    char[] charArray = name.toCharArray();
    char[] newCharArray = new char[7];
    
    int lentgh = (charArray.length);
    int index = 0;
    
      for(int y = lentgh; y>0; y--){
        newCharArray[index] = charArray[y-1];
        index++;
      }
    
    String nameInverted = new String(newCharArray);
    String nameInverted2 = String.valueOf(newCharArray);
    System.out.println(nameInverted);
    System.out.println(nameInverted2);
  }
}

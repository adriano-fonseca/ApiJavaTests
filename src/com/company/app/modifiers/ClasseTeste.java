package com.company.app.modifiers;


public class ClasseTeste implements Testable {
  
    protected String var = "Sou uma var Protected";
    String var2 = "Sou uma var Default";
    
    public static void metodo (Testable classe){
      classe.hello();
    }
    
    @Override
    public void hello(){
      System.out.println("Sou uma classe!");
    }
}

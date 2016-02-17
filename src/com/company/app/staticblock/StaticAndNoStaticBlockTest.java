package com.company.app.staticblock;

public class StaticAndNoStaticBlockTest {
  
    public StaticAndNoStaticBlockTest(){
      System.out.println("Contructor of "+StaticAndNoStaticBlockTest.class.getName());
    }
    
    /* static block method executed just once (it does matter how many 
     * objects are instantiated) and before the constructor of class*/
    static{
        System.out.println("Static");
    }

    
    /* non-static block method executed every time just one and 
     * before the constructor of class*/
    {
        System.out.println("Non-static block");
    }

    public static void main(String[] args) {
      StaticAndNoStaticBlockTest t1 = new StaticAndNoStaticBlockTest();
      StaticAndNoStaticBlockTest t2 = new StaticAndNoStaticBlockTest();
    }
}

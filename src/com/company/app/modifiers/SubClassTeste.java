package com.company.app.modifiers;


public class SubClassTeste extends ClasseTeste {
  
  public void acesseVarProtected(){
    ClasseTeste classe = new ClasseTeste();
    SubClassTeste classTesteSub = new SubClassTeste();
    System.out.println(classe.var); //protected
    System.out.println(classe.var2); //defauld
    System.out.println(classTesteSub.var);
  }

}

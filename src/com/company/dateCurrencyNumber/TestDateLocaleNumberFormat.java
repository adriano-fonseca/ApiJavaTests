package com.company.dateCurrencyNumber;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestDateLocaleNumberFormat {

  public static void main(String[] args) {
    
    Locale ptBr = new Locale("pt", "BR");
    Locale japan = new Locale("ja");
    Locale gb = new Locale("en","GB");
    Locale nz = new Locale("en","NZ");
    
    Locale[] localArray = new Locale[4];
    localArray[0] = ptBr;
    localArray[1] = japan;
    localArray[2] = gb;
    localArray[3] = nz;
    
    printDate(localArray);
    printLocaleInfo(localArray);
    printCoin(1030.2F,ptBr);
    printDecimal(1030.2F,ptBr);
    
    
  }
  
  private static void printDecimal(float number, Locale ptBr) {
    DecimalFormat df = new DecimalFormat("#.00");
    DecimalFormat df2 = new DecimalFormat("#.##");
    System.out.println("Decimal Format (two decimal is require): "+df.format(number));
    System.out.println("Decimal Format (two decimal is optional): "+df2.format(number));
  }

  private static void printCoin(Float number, Locale locale) {
    System.out.println("\n");
    NumberFormat nfBr = NumberFormat.getInstance(locale);
    
    System.out.println("Coin: "+nfBr.getCurrency());
    System.out.println("Valor em "+nfBr.getCurrencyInstance().format(number));
  }

  private static void printLocaleInfo(Locale[] localArray) {
    System.out.println("======================");
    for(Locale locale : localArray){
      System.out.println(locale.getDisplayCountry());
      System.out.println(locale.getDisplayCountry(locale));
      System.out.println(locale.getDisplayLanguage());
      System.out.println(locale.getDisplayLanguage(locale));
    }
    
  }

  public static void printDate(Locale[] localArray){
    Calendar calendarDate = Calendar.getInstance();
    calendarDate.set(1986, 6, 23);

    Date date = calendarDate.getTime();
    DateFormat[] dateArray = new DateFormat[8];
    
    dateArray[0] = DateFormat.getInstance();
    dateArray[1] = DateFormat.getDateInstance();
    dateArray[2] = DateFormat.getDateInstance(DateFormat.FULL,localArray[0]);
    dateArray[3] = DateFormat.getDateInstance(DateFormat.FULL,localArray[1]);
    dateArray[4] = DateFormat.getDateInstance(DateFormat.FULL,localArray[2]);
    dateArray[5] = DateFormat.getDateInstance(DateFormat.LONG);
    dateArray[6] = DateFormat.getDateInstance(DateFormat.MEDIUM);
    dateArray[7] = DateFormat.getDateInstance(DateFormat.SHORT);
    
    
    for(DateFormat df : dateArray){
      System.out.println(df.format(date));
    }
    
  }

}

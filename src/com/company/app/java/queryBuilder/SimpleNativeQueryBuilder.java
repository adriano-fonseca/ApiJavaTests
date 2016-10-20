package com.company.app.java.queryBuilder;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;

public class SimpleNativeQueryBuilder {
  public static void main(String[] args) throws IOException {
    System.out.println("Paste the code and press Enter: (The SQL Code shall end with ';') ");
    String queryFromSqlBuilder = readSqlQuery(1,";");
    String[] lines = queryFromSqlBuilder.split("\n");

    int numberOfLines = lines.length;

    // sql.append(" \n"); \n = 19 characteres in total obs: \n count as one
    int nrCharcterStructure = 19;  
    
    //all characters that not depend from content provided for user obs: \n count as one
    int nrCharcterPrefixAndSufix = 15+46+42+47+29+35;
    int capacity = (queryFromSqlBuilder.length()-numberOfLines)+(numberOfLines*nrCharcterStructure)+nrCharcterPrefixAndSufix;
    System.out.println("Capacity previewed:"+capacity);
    StringBuilder sql = new StringBuilder(capacity);
    sql.append("EntityManager em = super.getEntityManager(); \n"); //46 characteres
    sql.append("StringBuilder sql = new StringBuilder(); \n");     //42 characteres
    
    for(String line:lines){
      /*remove '\n' that was used to split above*/
      line = line.replaceAll("(\\r|\\n|\\r\\n)+", "");
      sql.append("sql.append(\""); //12
      sql.append(line);
      sql.append(" \\n\"); \n"); //7
    }
    
    sql.append("Query query = em.createQuery(sql.toString()); \n"); //47
    sql.append("query.setParameter(param1), value); \n"); //35 
    sql.append("return query.getResultList();"); //29
    System.out.println("Capacity required:"+sql.length());
    System.out.println("\n");
    System.out.println(sql);
  }

  private static String readSqlQuery(int nrDelimterToBreakwhile, String delimiter) {
    Scanner stdin = new Scanner(new BufferedInputStream(System.in));
    
    StringBuilder queryFromSqlBuilder = new StringBuilder();
    stdin.useDelimiter(delimiter);
    int delimiterNumber=0;
    while (stdin.hasNext()) {
      if(delimiterNumber==nrDelimterToBreakwhile){
        break;
      }
      queryFromSqlBuilder.append(stdin.next());
      delimiterNumber++;
    }
    stdin.close();
    return queryFromSqlBuilder.toString();
  }
}

package com.company.app.StringuilderVsStringBuffer;

public class PerformanceStrBuilderVsStrBuffer {
  public static void main(String[] args) {
      int N = 8888888;
      long t;

      {
        // StringBuffer is synchronized (thread safe)
          StringBuffer sb = new StringBuffer();
          t = System.currentTimeMillis();
          for (int i = N; i > 0 ; i--) {
              sb.append("");
          }
          Long time = System.currentTimeMillis() - t;
          System.out.println("StringBuffer:"+time.toString());
      }
      
      
      
      //StringBuilder It's faster, because it's not synchronized
      {
          StringBuilder sb = new StringBuilder();
          t = System.currentTimeMillis();
          for (int i = N; i > 0 ; i--) {
              sb.append("");
          }
          Long time = System.currentTimeMillis() - t;
          System.out.println("StringBuilder:"+time.toString());
      }
  }
}
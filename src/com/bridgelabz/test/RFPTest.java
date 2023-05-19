package com.bridgelabz.test;

import java.util.Scanner;

public class RFPTest {
    public static void main(String[] args) {
        stopWatch();
 }
 public static void stopWatch() {
     Scanner sc = new Scanner(System.in);
      long startTime;
      long endTime;
      boolean running;

     System.out.println("Press 's' to start the stopwatch.");
     sc.nextLine();
     startTime = System.currentTimeMillis();
     running = true;
     System.out.println("Stopwatch started.");
     System.out.println("Press 'e' to stop the stopwatch.");
     sc.nextLine();
     if (!running) {
         System.out.println("Stopwatch is not running.");
         return;
     }
     endTime = System.currentTimeMillis();
     running = false;
     System.out.println("Stopwatch stopped.");

     long elapsedMillis = endTime - startTime;
     long elapsedSeconds = elapsedMillis / 1000;
     long elapsedMinutes = elapsedSeconds / 60;
     elapsedSeconds = elapsedSeconds % 60;
     elapsedMillis =elapsedMillis% 1000;

     System.out.printf("Elapsed Time: %d minutes, %d seconds, %d milliseconds.%n",
             elapsedMinutes, elapsedSeconds, elapsedMillis);
 }
}
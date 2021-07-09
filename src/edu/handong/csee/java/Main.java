package edu.handong.csee.java;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Main stepD = new Main();
    stepD.d10();
  }
  void d10(){
    Scanner s = new Scanner(System.in);
    int num1, num2;
    int i = 0;

    System.out.print("Enter two numbers > ");
    num1 = s.nextInt();
    num2 = s.nextInt();
    
    for(i = 1; i <= 100; i++){
      if(i%num1 == 0 && i%num2 != 0 || i%num1 != 0 && i%num2 == 0)
        System.out.print(i + " ");

    }
  
  }
}
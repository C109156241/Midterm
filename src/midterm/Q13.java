/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

import java.util.Scanner;

/**
 *
 * @author a
 */
public class Q13 {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("輸入一字元為");
       String str = scanner.nextLine();
       StringBuilder str1 = new StringBuilder(str);
       String str2=str1.reverse().toString();
       if(str.equals(str2)){
           System.out.println("Yes");
       }else{
           System.out.println("NO");
       }
       
       
       
       
      
     } 
}

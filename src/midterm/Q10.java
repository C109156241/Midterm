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
public class Q10 {
     public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("請輸入M及N為：");
       String str1 = scanner.nextLine();
       System.out.println("請輸入矩陣第一列：");
       String str2 = scanner.nextLine();
       System.out.println("請輸入矩陣第二列：");
       String str3 = scanner.nextLine();
       String[] s=str1.split(" ");
       String[] r1=str2.split(" ");
       String[] r2=str3.split(" ");

            for(int j=0;j<Integer.parseInt(s[1]);j++){
                System.out.printf("輸出矩陣數值第%d列為:%s %s%n",j+1,r1[j],r2[j]);
            }

       
       
       
      
     }
}

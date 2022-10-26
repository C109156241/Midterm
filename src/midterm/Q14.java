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
public class Q14 {
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("輸入一字串為：");
        String str= input.nextLine();
        System.out.printf("There are %d characters",str.length());
     }
}

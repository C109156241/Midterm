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
public class Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("輸入值為s1：");
        String str1=sc.next();
        System.out.print("輸入值為s2：");
        String str2=sc.next();
        if (str2.contains(str1)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
        
        
        

    }
}

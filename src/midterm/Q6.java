/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author a
 */
public class Q6 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("輸入值為：");
        String str=sc.next();
        String[] in=str.split(",");
        Arrays.sort(in);
        String max="";
        String min="";
        for (String i:in){
             min+=i;
        }
        for (int i=in.length-1;i>=0;i--){
            max+=in[i];
        }
        System.out.println(Integer.parseInt(max)-Integer.parseInt(min));

        
        

    }
}

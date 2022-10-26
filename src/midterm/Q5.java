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
public class Q5 {
        public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("請輸入階乘值：");
        int m= input.nextInt();

        int n=1;
        int i=1;
        while(i<m){
            i*=n;
            n+=1;
        }
        System.out.printf("超過M為%d的最小階乘N值為：%d%n",m,n);
    }
}

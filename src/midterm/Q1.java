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
public class Q1 {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入整數:");
        String input = sc.next();
        int nl=input.length();
        int sqrt,n,max=0,s=0;
        for (int i=0; i<=nl;i++){
            for (int j=nl;j>i;j--){
                n=Integer.parseInt(input.substring(i,j));
                if(n==2){max=2;}
                if(n%2!=0){
                    sqrt=(int)Math.sqrt(n);
                    s=0;
                    for(int k =3;k<=sqrt;k=k+2)
                    {   
                        if(n%k==0){
                            s+=1;
                        }
                    }
                    if(s==0 && n>max){max=n;}
                }
            }
        }
       if(max>0){System.out.printf("子字串中最大的質數為:%d%n",max);} 
       else {System.out.println("No prime found");}    
    }
}

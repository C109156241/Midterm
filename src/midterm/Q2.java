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
public class Q2 {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("輸入整數度數:");
        int input = sc.nextInt();
        double[]s={2.10,3.02,4.39,4.97,5.63};
        double[] ns={2.10,2.68,3.61,4.01,4.50};
        int [] t={0,120,330,500,700};
        int [] r=new int[5];
        int i=0;
        for (;i<=4;i++){
            if(input-t[i]<0){
                r[i-1]=input-t[i-1];
                break;
            }
            r[i]=(t[i+1]-t[i]);  
        }
        double result1=0;
        double result2=0;
        for(int j=0;j<i+1;j++){
            result1+=s[j] *r[j];
            result2+=ns[j] *r[j];
        }
        System.out.printf("Summer months:%.2f%n",result1);
        System.out.printf("Non-Summer months:%.2f%n",result2);
        
    }
}

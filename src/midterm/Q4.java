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
public class Q4 {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] in=new int [2];
        System.out.println("X軸座標:");
        int x=sc.nextInt();
        System.out.println("Y軸座標:");
        int y=sc.nextInt();
        int d=(int)(Math.pow(x,2)+Math.pow(y,2));
        if(x>0 && y>0){ System.out.printf("該點位於第一象限，離原點距離為根號%d%n",d);}
        else if(x<0 && y<0){ System.out.printf("該點位於第三象限，離原點距離為根號%d%n",d);}
        else if(x<0 && y>0){ System.out.printf("該點位於第二象限，離原點距離為根號%d%n",d);}
        else if(x>0 && y<0){ System.out.printf("該點位於第四象限，離原點距離為根號%d%n",d);}
        else if(x==0 && y==0){System.out.println("該點位於原點%n");}
        else if(x==0 && y>0){ System.out.printf("該點位於下半平面Y軸上，離原點距離為根號%d%n",d);}
        else if(x==0 && y>0){ System.out.printf("該點位於上半平面Y軸上，離原點距離為根號%d%n",d);}
        else if(x>0 && y==0){System.out.printf("該點位於右半平面X軸上，離原點距離為根號%d%n",d);}
        else if(x<0 && y==0){System.out.printf("該點位於左半平面X軸上，離原點距離為根號%d%n",d);}
            
        
        

        
        
     }
}

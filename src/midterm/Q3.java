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
public class Q3 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入西元年:");
        int input = sc.nextInt();
        String [] a={"rat", "ox", "tiger", "rabbit",
                    "dragon", "snake", "horse", "sheep",
                    "monkey", "rooster", "dog", "pig"};
        int i;
        i=input%12-4;
        System.out.println(a[i]);
    }
}

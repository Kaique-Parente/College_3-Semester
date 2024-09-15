/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.utils;

import java.util.Scanner;

/**
 *
 * @author kaiqu
 */
public class Biblioteca {
    private static final Scanner sc = new Scanner(System.in);
    
    public static int lerInteiro(String msg){
        System.out.print(msg);
        return sc.nextInt();
    }
    
     public static char lerChar(String msg){
        System.out.print(msg);
        return sc.next().charAt(0);
    }
     
    public static String lerString(String msg){
        System.out.print(msg);
        sc.nextLine();
        return sc.nextLine();
    }
}

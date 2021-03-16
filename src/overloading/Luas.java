/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author WINDOWS 10
 */
public class Luas {
    
    //Luas persegi
    int ls(int s){
        System.out.println("Sebuah persegi memiliki sisi "+s);
        System.out.println("Rumus   : sisi * sisi");
        int luas = s * s;
        System.out.print("Luas persegi = ");
        return luas;
    }
    
    //Luas segitiga
    double ls(int a, int t){
        System.out.println("Sebuah segitiga memiliki alas "+a+" dan tinggi "+t);
        System.out.println("Rumus   : 1/2 * a * t");
        double luas = 0.5 * a * t;
        System.out.print("Luas segitiga = ");
        return luas;
    }
    
    //Luas lingkaran
    double ls(double r){
        System.out.println("Sebuah lingkaran memiliki jari-jari "+r);
        System.out.println("Rumus   : Phi * r * r");
        double luas = Math.PI * r * r;
        System.out.print("Luas lingkaran = ");
        return luas;
    }
}


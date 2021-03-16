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
public class Keliling {
    
    //Keliling persegi
    int kl(int s){
        System.out.println("Sebuah persegi memiliki sisi "+s);
        System.out.println("Rumus   : 4 * sisi");
        int keliling = 4 * s;
        System.out.print("Keliling persegi = ");
        return keliling;
    }
    
    //Keliling segitiga
    double kl(int a, int b, int c){
        System.out.println("Sebuah segitiga memiliki sisi "+a+" , "+b+" , dan "+c);
        System.out.println("Rumus   : a + b + c");
        double keliling = a + b + c;
        System.out.print("Keliling segitiga = ");
        return keliling;
    }
    
    //Keliling lingkaran
    double kl(double r){
        System.out.println("Sebuah lingkaran memiliki jari-jari "+r);
        System.out.println("Rumus   : Phi * d atau Phi * (r * 2)");
        double keliling = 2 * r * Math.PI;
        System.out.print("Keliling lingkaran = ");
        return keliling;
    }
}


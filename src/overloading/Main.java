/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Scanner input
        Scanner input = new Scanner(System.in);
        
        //objek untuk class Luas
        Luas luas = new Luas();
        //objek untuk class Keliling
        Keliling keliling = new Keliling();
        
        System.out.println("--- KALKULATOR BANGUN DATAR SEDERHANA ---\n");
        
        //deklarasi
        int pilihan;
        
        do{ //perulangan
        System.out.print("1. Persegi \n2. Segitiga \n3. Lingkaran \nPilihan : ");
        //input pilihan user
        pilihan = input.nextInt();
        
        //Percabangan
        if (pilihan == 1){
            //deklarasi
            int persegi;
            
            do{ //perulangan
                //pilihan
                System.out.println("\nIngin menghitung apa?");
                System.out.print("1. Luas \n2. Keliling \nPilihan : ");
                //input pilihan user
                persegi = input.nextInt();
            
                //percabangan
                switch(persegi){
                    //luas persegi
                    case 1:
                        System.out.println("\n--- Menghitung Luas Persegi ---\n");
                        //memanggil dari class Luas
                        System.out.println(luas.ls(5));
                        break;
                
                    //keliling persegi
                    case 2:
                        System.out.println("\n--- Menghitung Keliling Persegi ---\n");
                        //memanggil dari class Keliling
                        System.out.println(keliling.kl(5));
                        break;
                
                    default:
                        System.out.println("Pilihan tidak ditemukan");
                }
                
            }while(persegi > 2 || persegi == 0);  //jika tidak memilih 1 atau 2, akan terus terulang
        }
        
        else if(pilihan == 2){
            //deklarasi
            int segitiga;
            
            do{ //perulangan
                //pilihan
                System.out.println("\nIngin menghitung apa?");
                System.out.print("1. Luas \n2. Keliling \nPilihan : ");
                //input pilihan user
                segitiga = input.nextInt();
            
                //percabangan
                switch(segitiga){
                    //luas segitiga
                    case 1:
                        System.out.println("\n--- Menghitung Luas Segitiga ---\n");
                        //memanggil dari class Luas
                        System.out.println(luas.ls(10,4));
                        break;
                
                    //keliling segitiga
                    case 2:
                        System.out.println("\n--- Menghitung Keliling Segitiga ---\n");
                        //memanggil dari class Keliling
                        System.out.println(keliling.kl(8,6,10));
                        break;
                
                    default:
                        System.out.println("Pilihan tidak ditemukan");
                }
                
            }while(segitiga > 2 || segitiga == 0);  //jika tidak memilih 1 atau 2, akan terus terulang
        }
        
        else if(pilihan == 3){
            //deklarasi
            int lingkaran;
            
            do{ //perulangan
                //pilihan
                System.out.println("\nIngin menghitung apa?");
                System.out.print("1. Luas \n2. Keliling \nPilihan : ");
                //input pilihan user
                lingkaran = input.nextInt();
            
                //percabangan
                switch(lingkaran){
                    //luas lingkaran
                    case 1:
                        System.out.println("\n--- Menghitung Luas Lingkaran ---\n");
                        //memanggil dari class Luas
                        System.out.println(luas.ls(7.0));
                        break;
                
                    //keliling lingkaran
                    case 2:
                        System.out.println("\n--- Menghitung Keliling Lingkaran ---\n");
                        //memanggil dari class Keliling
                        System.out.println(keliling.kl(7.0));
                        break;
                
                    default:
                        System.out.println("Pilihan tidak ditemukan");
                }
                
            }while(lingkaran > 2 || lingkaran == 0);  //jika tidak memilih 1 atau 2, akan terus terulang
        }else
            System.out.println("Pilihan tidak ditemukan\n");
        
        }while(pilihan > 3 || pilihan == 0);    //jika memilih selain 1, 2 dan 3, akan terus terulang
    }  
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logika;
import java.util.Scanner;
/**
 *
 * @author varar
 */
public class satu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int angka1, angka2;
        Scanner satu = new Scanner(System.in);
        
        System.out.println("masukkan angka 1 : ");
        angka1 = satu.nextInt();
        System.out.println("masukkan angka 2 : ");
        angka2 = satu.nextInt();
        
        if(angka1 > angka2){
            System.out.println("lebih besar : " + angka1);
        }else{
            System.out.println("lebih besar : " + angka2);
        }
        }
    }

    


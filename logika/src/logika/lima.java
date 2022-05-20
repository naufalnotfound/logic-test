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
public class lima {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        int i = 0;
        System.out.print("masukkan angka : ");
        
        i = angka.nextInt();
            if(i % 2 == 0){
                System.out.println("berhasil : genap");
            }
        }
}

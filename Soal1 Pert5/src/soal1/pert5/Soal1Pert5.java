/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1.pert5;

/**
 *
 * @author ctray
 */

 import java.util.Scanner;
public class Soal1Pert5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
        
        int hasil = penjumlahanDeret(N);
        
        System.out.println("Hasil penjumlahan deret 1+2+3+...+" + N + " = " + hasil);
    }
    
    public static int penjumlahanDeret(int N) {
        int hasil = 0;
        for (int i = 1; i <= N; i++) {
            hasil += i;
        }
        return hasil;
    }
}

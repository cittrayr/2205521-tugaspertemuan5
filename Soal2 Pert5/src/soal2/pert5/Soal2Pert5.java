/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2.pert5;

/**
 *
 * @author ctray
 */
import java.util.Scanner;
public class Soal2Pert5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();
        
        int jumlahGanjil = hitungBanyakBilanganGanjil(batasAwal, batasAkhir);
        
        System.out.println("Banyaknya bilangan ganjil dari " + batasAwal + " hingga " + batasAkhir + " adalah: " + jumlahGanjil);
    }
    
    public static int hitungBanyakBilanganGanjil(int batasAwal, int batasAkhir) {
        int count = 0;
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
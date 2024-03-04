/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal3.pert5;

/**
 *
 * @author ctray
 */
import java.util.Scanner;
public class Soal3Pert5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        
        if (n < 0) {
            System.out.println("Nilai n tidak boleh negatif.");
        } else {
            int hasil = hitungFaktorial(n);
            System.out.println(n + "! = " + faktorialString(n) + " = " + hasil);
        }
    }
    
    public static int hitungFaktorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * hitungFaktorial(n - 1);
        }
    }
    
    public static String faktorialString(int n) {
        if (n == 0) {
            return "1";
        }
        String result = Integer.toString(n);
        for (int i = n - 1; i >= 1; i--) {
            result += "*" + i;
        }
        return result;
    }
}
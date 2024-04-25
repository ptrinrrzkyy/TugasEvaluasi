/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package tugas.evaluasi.pkg1;
import java.util.Scanner;
public class TugasEvaluasi1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    String NamaDepan, NamaBelakang; 
    
    System.out.print("Masukkan Nama depan : ");
    NamaDepan = input.nextLine();
    System.out.print("Masukkan Nama belakang: ");
    NamaBelakang = input.nextLine();

    System.out.println(" ");
    System.out.println("Hallo " + NamaDepan + " " +NamaBelakang );
   
    }

}
   

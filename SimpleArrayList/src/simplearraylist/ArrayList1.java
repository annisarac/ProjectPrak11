/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;
import static java.util.Collections.binarySearch;
import java.util.Scanner;
import java.util.ArrayList;



/**
 *
 * @author AVITA
 */
public class ArrayList1 {
    ArrayList<String> AL = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    
    void TambahData(){
        System.out.println("Masukan data string : ");
        AL.add(input.nextLine());
        System.out.println("Daftar string dalam array list : " + AL);
        input.nextLine();
    }
    
    void CariData(){
        System.out.println("String yang mau dicari : ");
        String cari = input.nextLine();
        int hasil = AL.indexOf(cari);
        
        if(hasil>-1){
            System.out.println("String " + cari + " ada di index ke-" + hasil + " di dalam data");  
        }
        else{
            System.out.println("String " + cari + "tidak ada dalam data");
        }
    }
    
    void hapusData(){
        System.out.println("String yang mau di hapus ");
        String hapus = input.nextLine();
        if(binarySearch(AL,hapus)>-1){
            AL.remove(binarySearch(AL,hapus));
            System.out.println("String " + hapus + " Sudah di hapus didalam data");
        }
        else{
            System.out.println("String " + hapus + " tidak ada dalam data");
        }
    }
    
    void ShowData(){
        System.out.println("Daftar string dalam array list" + this.AL);
    }
}

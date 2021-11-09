/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

import java.util.Scanner;
/**
 *
 * @author AVITA
 */
public class SimpleArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList1 AL1 = new ArrayList1();
        while(true){
            int inpt;
            System.out.println("1.Tambah data");
            System.out.println("2.Cari Data");
            System.out.println("3.Hapus Data");
            System.out.println("4.Tampil Data");
            System.out.println("5.Keluar");
            
            Scanner input = new Scanner(System.in);
            System.out.println("");
            System.out.println("Pilih nomor berapa : ");
            inpt = input.nextInt();
            
            switch (inpt){
                case 1:
                    AL1.TambahData();
                    break;
                case 2:
                    AL1.CariData();
                    break;
                case 3:
                    AL1.hapusData();
                    break;
                case 4:
                    AL1.ShowData();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
    
}

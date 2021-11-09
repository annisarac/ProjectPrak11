/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrerata;
import java.util.Scanner;
/**
 *
 * @author AVITA
 */
public class ArrayProcessing {
    // array of integer -> data
    int[] dataBil = new int[100];
    
    // jumlah data
    int n;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan banyaknya data (n) : " );
        this.n= input.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Masukan bil ke-" +(i+1) + ": ");
            this.dataBil[i] = input.nextInt();
        }
    }
    
    double hitungRerata(int[] data){
        double sum = 0;
        for(int i=0; i<this.n; i++){
            sum += data[i];
        }
        
        double rerata = sum/this.n;
        return rerata;
    }
    
    int minimal(int[] data){
        int min = data[0];
        for(int i=0; i<this.n; i++){
            if(data[i]<min){
                min = data[i];
            }
        }
        return min;
    }
    
    int maximal(int[] data){
        int max = data[0];
        for(int i=0; i<this.n; i++){
            if(data[i]> max){
                max = data[i];
            }
        }
        return max;
    }
    
    void urutkan(int[] data){
        int n = this.n;
        int urut = 0;
        
        for(int i=0; i<n; i++){
            for(int j=1; j<(n-i); j++){
                if (data[j-1]>data[j]){
                    urut = data[j-1];
                    data[j-1]= data[j];
                    data[j] = urut;
                }
            }
        }
        
        for(int i=0; i<n; i++){
            System.out.println(data[i] + " ");
        }
    }
    
    void output(){
        System.out.println("Rerata : " + this.hitungRerata(this.dataBil));
        System.out.println("Minimal : " + this.minimal(this.dataBil));
        System.out.println("Maximal : " + this.maximal(this.dataBil));
        System.out.println("Urutannya : " );
        this.urutkan(this.dataBil);
    }
}

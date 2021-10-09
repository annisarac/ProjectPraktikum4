/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author AVITA
 */
public class Persegi {
    void luasPersegi(int s){
        int luas;
        luas = s * s;
        System.out.println("Luas perseginya adalah : " + luas + " satuan luas");
    }
    
    void luasPersegi(double s){
        double luas;
        luas = s * s;
        System.out.println("Luas perseginya adalah : " + luas + " satuan luas");
    }
    
    void kelilingPersegi(int s){
        int keliling;
        keliling = 4 * s;
        System.out.println("Keliling perseginya adalah : " + keliling + " satuan panjang");
    }
    
    void kelilingPersegi(double a){
        double keliling;
        keliling = a * a;
        System.out.println("Keliling perseginya adalah : " + keliling + " satuan panjang");
    }
}

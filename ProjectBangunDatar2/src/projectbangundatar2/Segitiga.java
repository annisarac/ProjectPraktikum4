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
public class Segitiga {
    
    static double sisiMiring(double a, double b){
        return (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }
    
    void luasSegitiga(int alas, int t){
        int luas;
        luas = ((alas * t) /2);
        System.out.println("Luas segitiganya adalah : " + luas + " satuan luas");
    }
    
    void luasSegitiga(double alas, double t){
        double luas;
        luas = ((alas * t) /2);
        System.out.println("Luas segitiganya adalah : " + luas + " satuan luas");
    }
    
    void luasSegitiga(double alas, int t){
        double luas;
        luas = ((alas * t) /2);
        System.out.println("Luas segitiganya adalah : " + luas + " satuan luas");
    }
    
    void luasSegitiga(int alas, double t){
        double luas;
        luas = ((alas * t) /2);
        System.out.println("Luas segitiganya adalah : " + luas + " satuan luas");
    }
    
    double kelilingSegitiga(int alas, int t){
        double sisimiring = sisiMiring(alas, t);
        double keliling = alas + t + sisimiring;
        return keliling;
    }
    
    double kelilingSegitiga(double alas, double t){
        double sisimiring = sisiMiring(alas, t);
        double keliling = alas + t + sisimiring;
        return keliling;
    }
    
    double kelilingSegitiga(double alas, int t){
        double sisimiring = sisiMiring(alas, t);
        double keliling = alas + t + sisimiring;
        return keliling;
    }
    
    double kelilingSegitiga(int alas, double t){
        double sisimiring = sisiMiring(alas, t);
        double keliling = alas + t + sisimiring;
        return keliling;
    }
}

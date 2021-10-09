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
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Luas persegi panjang
        PersegiPanjang pp = new PersegiPanjang();
        pp.luasPersegiPanjang(10, 5);
        pp.luasPersegiPanjang(3.6, 8);
        pp.luasPersegiPanjang(6, 8.3);
        pp.luasPersegiPanjang(5.6, 8.8);
        
        System.out.println("---------------------------------------------------------------------------------------");
        
        //Keliling persegi panjang
        pp.kelilingPersegiPanjang(10, 5);
        pp.kelilingPersegiPanjang(3.6, 8);
        pp.kelilingPersegiPanjang(6, 8.3);
        pp.kelilingPersegiPanjang(5.6, 8.8);
        
        System.out.println("---------------------------------------------------------------------------------------");
        
        //Luas persegi
        Persegi p = new Persegi();
        p.luasPersegi(4.5);
        p.luasPersegi(7);
        
        System.out.println("---------------------------------------------------------------------------------------");
        
        //Keliling persegi
        p.kelilingPersegi(4.5);
        p.kelilingPersegi(7);
        
        System.out.println("---------------------------------------------------------------------------------------");
        
        //Luas lingkaran
        Lingkaran l = new Lingkaran();
        l.luasLingkaran(5);
        l.luasLingkaran(7.4);
        
        System.out.println("---------------------------------------------------------------------------------------");
        
        //Keliling lingkaran
        l.kelilingLingkaran(5);
        l.kelilingLingkaran(7.4);
        
        System.out.println("---------------------------------------------------------------------------------------");
        
        //Luas segitiga
        Segitiga s = new Segitiga();
        s.luasSegitiga(8, 10);
        s.luasSegitiga(8, 11.5);
        s.luasSegitiga(12.2, 9);
        s.luasSegitiga(13.9, 20.7);
        
        System.out.println("---------------------------------------------------------------------------------------");
        
        //Keliling segitiga
        System.out.println("Keliling segitiganya adalah : " + s.kelilingSegitiga(8, 10) + " satuan panjang");
        System.out.println("Keliling segitiganya adalah : " + s.kelilingSegitiga(8, 11.5) + " satuan panjang");
        System.out.println("Keliling segitiganya adalah : " + s.kelilingSegitiga(12.2, 9) + " satuan panjang");
        System.out.println("Keliling segitiganya adalah : " + s.kelilingSegitiga(13.9, 20.7) + " satuan panjang");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author AVITA
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operasi o = new Operasi();
        
        System.out.println("hasil 3 + 4 adalah : " + o.jumlahkan(3, 4));
        System.out.println("hasil 4 + 7 + (-9) adalah  : " + o.jumlahkan(4, 7, -9));
        System.out.println("hasil 3.4 + (-0.002) + 0.12313 adalah: " + o.jumlahkan(3.4, -0.002, 0.12313));
        System.out.println("hasil perkalian 3 x 4 adalah : " + o.kalikan(3, 4));
        System.out.println("hasil perkalian 4 x 7 x (-9) adalah : " + o.kalikan(4, 7, -9));
        System.out.println("hasil perkalian 3.4 x (-0.002) x 0.12313 adalah : " + o.kalikan(3.4, -0.002, 0.12313));
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remidi.quiz;

/**
 *
 * @author hp
 */
public class MainClass {
    public static void main(String[] args) {
        Customer c = new Customer();
        Tujuan tj = new Tujuan();
        Travel tr = new Travel();
        Tiket t = new Tiket();
        
        c.setKtp("Budi");
        tj.setTujuan("Surabaya");
        tr.setJenisTravel("mobil xenia");
        t.setHarga(500000);
        
        c.info();
        tj.info();
        tr.info();
        t.info();
        
    }
}

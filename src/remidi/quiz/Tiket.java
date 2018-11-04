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
public class Tiket {
    private int harga;
    private String jenisTiket;

    public Tiket() {
    }

    public Tiket(int harga, String jenisTiket) {
        this.harga = harga;
        this.jenisTiket = jenisTiket;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getJenisTiket() {
        return jenisTiket;
    }

    public void setJenisTiket(String jenisTiket) {
        this.jenisTiket = jenisTiket;
    }
    
    public void info(){
        System.out.println("Harga tiket: " + harga);
    }
}

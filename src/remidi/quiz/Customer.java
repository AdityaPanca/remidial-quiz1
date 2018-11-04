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
public class Customer {
    private String ktp;
    private Tiket tiket;

    public Customer() {
    }

    public Customer(String ktp, Tiket tiket) {
        this.ktp = ktp;
        this.tiket = tiket;
    }

   
    public String getKtp() {
        return ktp;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public Tiket getTiket() {
        return tiket;
    }

    public void setTiket(Tiket tiket) {
        this.tiket = tiket;
    }
    
    public void info (){
        System.out.println("Nama :" + ktp );
    }
}

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
public class Tujuan {
    private String tujuan;
    private Tiket tiketTujuan;

    public Tujuan() {
    }

    public Tujuan(String tujuan, Tiket tiketTujuan) {
        this.tujuan = tujuan;
        this.tiketTujuan = tiketTujuan;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public Tiket getTiketTujuan() {
        return tiketTujuan;
    }

    public void setTiketTujuan(Tiket tiketTujuan) {
        this.tiketTujuan = tiketTujuan;
    }
    
    public void info(){
        System.out.println("Tujuan: "+tujuan);
    }
}

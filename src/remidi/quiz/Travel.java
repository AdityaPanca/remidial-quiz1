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
public class Travel {
    private String jenisTravel;
    private Customer penumpang;

    public Travel() {
    }

    public Travel(String jenisTravel, Customer penumpang) {
        this.jenisTravel = jenisTravel;
        this.penumpang = penumpang;
    }

    public String getJenisTravel() {
        return jenisTravel;
    }

    public void setJenisTravel(String jenisTravel) {
        this.jenisTravel = jenisTravel;
    }

    public Customer getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(Customer penumpang) {
        this.penumpang = penumpang;
    }
    
    public void info(){
        System.out.println("Jenis Kendaraan: "+ jenisTravel);
    }

}

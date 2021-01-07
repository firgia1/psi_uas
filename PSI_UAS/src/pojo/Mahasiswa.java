/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author itsproinc
 */
public class Mahasiswa {
    private String nrp;
    private String nama;
    private String jenisKelamin;
    
    public String getNrp() {
        return nrp;
    }
    
    public void setNrp(String nrp) {
        this.nrp = nrp;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getJenisKelamin() {
        return jenisKelamin;
    }
    
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
}

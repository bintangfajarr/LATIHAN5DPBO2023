/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarmahasiswa;

/**
 *
 * @author sekar
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String nilai;
    private String kelas;
    private String jk;
    
    public Mahasiswa(String nim, String nama, String nilai,String kelas, String jk){
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
        this.kelas=kelas;
        this.jk=jk;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setNilai(String nilai) {
        this.nilai = nilai;
    }
    public void setKelas(String kelas){
        this.kelas=kelas;
    }
    public void setJk(String jk){
        this.jk=jk;
    }
    public String getKelas(){
        return this.kelas;
    }
    public String getJk(){
        return this.jk;
    }
    public String getNim() {
        return this.nim;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public String getNilai() {
        return this.nilai;
    }
}

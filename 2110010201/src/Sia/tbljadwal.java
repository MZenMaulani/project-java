/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sia;

/**
 *
 * @author mzenm
 */
public class tbljadwal {
    private int id_jadwal;
    private int kd_kelas;
    private int kd_pel;
    private String nik;
    private String jam_masuk;
    private String hari_masuk;
    
    public tbljadwal() {}
    
    public void setIdJadwal(int IdJadwal) {
        this.id_jadwal=IdJadwal;
    }
    public int getIdJadwal() {
        return this.id_jadwal;
    }
    
    public void setKdKelas(int KodeKelas) {
        this.kd_kelas=KodeKelas;
    }
    public int getKdKelas() {
        return this.kd_kelas;
    }
    
    public void setKdPel(int KodePelajaran) {
        this.kd_pel=KodePelajaran;
    }
    public int getKodePel() {
        return this.kd_pel;
    }
    
    public void setNik(String NomorIndukKaryawan) {
        this.nik=NomorIndukKaryawan;
    }
    public String getNik() {
        return this.nik;
    }
    
    public void setJamMasuk(String JamMasuk) {
        this.jam_masuk=JamMasuk;
    }
    public String getJamMasuk() {
        return this.jam_masuk;
    }
    
    public void setHariMasuk(String HariMasuk) {
        this.hari_masuk=HariMasuk;
    }
    public String getHariMasuk() {
        return this.hari_masuk;
    }
}

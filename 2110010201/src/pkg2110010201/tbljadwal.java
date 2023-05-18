/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2110010201;

/**
 *
 * @author mzenm
 */
public class tbljadwal {
    private int Id_jadwal;
    private int Kd_kelas;
    private int Kd_pel;
    private String Nik;
    private String Jam_masuk;
    private String Hari_masuk;
    
    public tbljadwal() {}
    
    public void setIdJad(int IdJadwal) {
        this.Id_jadwal=IdJadwal;
    }
    public int getIdJadwal() {
        return this.Id_jadwal;
    }
    
    public void setKdKelas(int KodeKelas) {
        this.Kd_kelas=KodeKelas;
    }
    public int getKodeKelas() {
        return this.Kd_kelas;
    }
    
    public void setKdPel(int KodePelajaran) {
        this.Kd_pel=KodePelajaran;
    }
    public int getKodedPelajaran() {
        return this.Kd_pel;
    }
    
    public void setNoInduk(String NomorIndukKaryawan) {
        this.Nik=NomorIndukKaryawan;
    }
    public String getNomorIndukKaryawan() {
        return this.Nik;
    }
    
    public void setJam(String JamMasuk) {
        this.Jam_masuk=JamMasuk;
    }
    public String getJamMasuk() {
        return this.Jam_masuk;
    }
    
    public void setHari(String HariMasuk) {
        this.Hari_masuk=HariMasuk;
    }
    public String getHariMasuk() {
        return this.Hari_masuk;
    }
}

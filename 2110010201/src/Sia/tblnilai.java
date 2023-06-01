/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sia;

/**
 *
 * @author mzenm
 */
public class tblnilai {
    private int kd_kelas;
    private String nis;
    private String nik;
    private int kd_pel;
    private int nil_uts;
    private int nil_uas;
    private int nil_tgs;
    private int absen;
    
    public tblnilai(){}
    
    public void setKdKelas(int KodeKelas) {
        this.kd_kelas=KodeKelas;
    }
    public int getKdKelas() {
        return this.kd_kelas;
    }
    
    public void setNis(String NomorIndukSiswa) {
        this.nis=NomorIndukSiswa;
    }
    public String getNis() {
        return this.nis;
    }
    
    public void setNik(String NomorIndukKaryawan) {
        this.nik=NomorIndukKaryawan;
    }
    public String getNomorIndukKaryawan() {
        return this.nik;
    }
    
    public void setKdPel(int KodePelajaran) {
        this.kd_pel=KodePelajaran;
    }
    public int getKdPel() {
        return this.kd_pel;
    }
    
    public void setNilUts(int NilaiUts) {
        this.nil_uts=NilaiUts;
    }
    public int getNilUts() {
        return this.nil_uts;
    }
    
    public void setNilUas(int NilaiUas) {
        this.nil_uas=NilaiUas;
    }
    public int getNilUas() {
        return this.nil_uas;
    }
    
    public void setNilTgs(int NilaiTgs) {
        this.nil_tgs=NilaiTgs;
    }
    public int getNilTgs() {
        return this.nil_tgs;
    }
    
    public void setAbsen(int Absen) {
        this.absen=Absen;
    }
    public int getAbsen() {
        return this.absen;
    }
}

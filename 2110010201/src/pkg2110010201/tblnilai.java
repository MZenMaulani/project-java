/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2110010201;

/**
 *
 * @author mzenm
 */
public class tblnilai {
    private int Kd_kelas;
    private String Nis;
    private String Nik;
    private int Kd_pel;
    private int Nil_uts;
    private int Nil_uas;
    private int Nil_tgs;
    private int Absen;
    
    public tblnilai(){}
    
    public void setKdKelas(int KodeKelas) {
        this.Kd_kelas=KodeKelas;
    }
    public int getKodeKelas() {
        return this.Kd_kelas;
    }
    
    public void setNoIndukSiswa(String NomorIndukSiswa) {
        this.Nis=NomorIndukSiswa;
    }
    public String getNomorIndukSiswa() {
        return this.Nis;
    }
    
    public void setNoIndukKaryawan(String NomorIndukKaryawan) {
        this.Nik=NomorIndukKaryawan;
    }
    public String getNomorIndukKaryawan() {
        return this.Nik;
    }
    
    public void setKdPel(int KodePelajaran) {
        this.Kd_pel=KodePelajaran;
    }
    public int getKodePelajaran() {
        return this.Kd_pel;
    }
    
    public void setNilUts(int NilaiUts) {
        this.Nil_uts=NilaiUts;
    }
    public int getNillaiUts() {
        return this.Nil_uts;
    }
    
    public void setNilUas(int NilaiUas) {
        this.Nil_uas=NilaiUas;
    }
    public int getNilaiUas() {
        return this.Nil_uas;
    }
    
    public void setNilTgs(int NilaiTgs) {
        this.Nil_tgs=NilaiTgs;
    }
    public int getNilaiTgs() {
        return this.Nil_tgs;
    }
    
    public void setAbs(int Absen) {
        this.Absen=Absen;
    }
    public int getAbsen() {
        return this.Absen;
    }
}

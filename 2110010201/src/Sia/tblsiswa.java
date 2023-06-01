/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sia;

/**
 *
 * @author mzenm
 */
public class tblsiswa {
    private String nis;
    private String nm_siswa;
    private String tmpt_lhr_siswa;
    private String tgl_lahir_siswa;
    private String agm_siswa;
    private String jk_siswa;
    private String almt_siswa;
    private String tlp_siswa;
    private String asal_sekolah;
    private int kd_kelas;
    private String kondisi;
    private String nm_wali;
    
    public tblsiswa () {}
    
    public void setNis(String NomorIndukSiswa) {
        this.nis=NomorIndukSiswa;
    }
    public String getNis() {
        return this.nis;
    }
    
    public void setNmSiswa(String NamaSiswa) {
        this.nm_siswa=NamaSiswa;
    }
    public String getNmSiswa() {
        return this.nm_siswa;
    }
    
    public void setTmptLhrSiswa(String TempatLahirSiswa) {
        this.tmpt_lhr_siswa=TempatLahirSiswa;
    }
    public String getTmptLahirSiswa() {
        return this.tmpt_lhr_siswa;
    }
    
    public void setTglLahirSiswa(String TanggalLahirSiswa) {
        this.tgl_lahir_siswa=TanggalLahirSiswa;
    }
    public String getTglLahirSiswa() {
        return this.tgl_lahir_siswa;
    }
    
    public void setAgmSiswa(String AgamaSiswa) {
        this.agm_siswa=AgamaSiswa;
    }
    public String getAgmSiswa() {
        return this.agm_siswa;
    }
    
    public void setJkSiswa(String JenisKelaminSiswa) {
        this.jk_siswa=JenisKelaminSiswa;
    }
    public String getJkSiswa() {
        return this.jk_siswa;
    }
    
    public void setAlmtSiswa(String AlamatSiswa) {
        this.almt_siswa=AlamatSiswa;
    }
    public String getAlmtSiswa() {
        return this.almt_siswa;
    }
    
    public void setTlpSiswa(String TeleponSiswa) {
        this.tlp_siswa=TeleponSiswa;
    }
    public String getTlpSiswa() {
        return this.tlp_siswa;
    }
    
    public void setAsalSekolah(String AsalSekolah) {
        this.asal_sekolah=AsalSekolah;
    }
    public String getAsalSekolah() {
        return this.asal_sekolah;  
    } 
    
    public void setKdKelas(int KodeKelas) {
        this.kd_kelas=KodeKelas;
    }
    public int getKdKelas() {
        return this.kd_kelas;
    }
    
    public void setKondisi(String Kondisi) {
        this.kondisi=Kondisi;
    }
    public String getKondisi() {
        return this.kondisi;
    }
    
    public void setNmWali(String NamaWali) {
        this.nm_wali=NamaWali;
    }
    public String getNmWali() {
        return this.nm_wali;
    }
}

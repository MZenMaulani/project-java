/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2110010201;

/**
 *
 * @author mzenm
 */
public class tblsiswa {
    private String Nis;
    private String Nm_siswa;
    private String Tmpt_lhr_siswa;
    private String Tgl_lahir_siswa;
    private String Agm_siswa;
    private String Jk_siswa;
    private String Almt_siswa;
    private String Tlp_siswa;
    private String Asal_sekolah;
    private int Kd_kelas;
    private String Kondisi;
    private String Nm_wali;
    
    public tblsiswa () {}
    
    public void setNoIndukSiswa(String NomorIndukSiswa) {
        this.Nis=NomorIndukSiswa;
    }
    public String getNomorIndukSiswa() {
        return this.Nis;
    }
    
    public void setNmSiswa(String NamaSiswa) {
        this.Nm_siswa=NamaSiswa;
    }
    public String getNamaSiswa() {
        return this.Nm_siswa;
    }
    
    public void setTmptLhrSiswa(String TempatLahirSiswa) {
        this.Tmpt_lhr_siswa=TempatLahirSiswa;
    }
    public String getTempatLahirSiswa() {
        return this.Tmpt_lhr_siswa;
    }
    
    public void setTglLahirSiswa(String TanggalLahirSiswa) {
        this.Tgl_lahir_siswa=TanggalLahirSiswa;
    }
    public String getTanggalLahirSiswa() {
        return this.Tgl_lahir_siswa;
    }
    
    public void setAgmSiswa(String AgamaSiswa) {
        this.Agm_siswa=AgamaSiswa;
    }
    public String getAgamaSiswa() {
        return this.Agm_siswa;
    }
    
    public void setJkSiswa(String JenisKelaminSiswa) {
        this.Jk_siswa=JenisKelaminSiswa;
    }
    public String getJenisKelaminSiswa() {
        return this.Jk_siswa;
    }
    
    public void setAlmtSiswa(String AlamatSiswa) {
        this.Almt_siswa=AlamatSiswa;
    }
    public String getAlamatSiswa() {
        return this.Almt_siswa;
    }
    
    public void setTlpSiswa(String TeleponSiswa) {
        this.Tlp_siswa=TeleponSiswa;
    }
    public String getTeleponSiswa() {
        return this.Tlp_siswa;
    }
    
    public void setAsalSklh(String AsalSekolah) {
        this.Asal_sekolah=AsalSekolah;
    }
    public String getAsalSekolah() {
        return this.Asal_sekolah;  
    } 
    
    public void setKdKelas(int KodeKelas) {
        this.Kd_kelas=KodeKelas;
    }
    public int getKodeKelas() {
        return this.Kd_kelas;
    }
    
    public void setKndsi(String Kondisi) {
        this.Kondisi=Kondisi;
    }
    public String getKondisi() {
        return this.Kondisi;
    }
    
    public void setNmWali(String NamaWali) {
        this.Nm_wali=NamaWali;
    }
    public String getNamaWali() {
        return this.Nm_wali;
    }
}

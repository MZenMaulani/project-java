/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sia;

/**
 *
 * @author mzenm
 */
public class tblguru {
    private String nik;
    private String nama_guru;
    private String tmpt_lhr_guru;
    private String tgl_lhr_guru;
    private String pass_guru;   
    private String agm_guru;
    private String jk_guru;
    private String tlp_guru;
    private String email_guru;
    private String almt_guru;
    private String pend_guru;
    private String status_kawin;
    private String jab;
    
    public tblguru() {}
    
    public void setNik(String NomorIndukKaryawan) {
        this.nik=NomorIndukKaryawan;
    }
    public String getNik() {
        return this.nik;
    }
    
    public void setNamaGuru(String NamaGuru) {
        this.nama_guru=NamaGuru;
    }
    public String getNamaGuru() {
        return this.nama_guru;
    }
    
    public void setTmptLhrGuru(String TempatLahirGuru) {
    this.tmpt_lhr_guru=TempatLahirGuru;
    }
    public String getTmptLhrGuru() {
        return this.tmpt_lhr_guru;
    }
    
    public void setTglLhrGuru(String TanggalLahirGuru) {
    this.tgl_lhr_guru=TanggalLahirGuru;
    }
    public String getTglLhrGuru() {
        return this.tgl_lhr_guru;
    }

    public void setPassGuru(String PasswordGuru) {
        this.pass_guru=PasswordGuru;
    }
    public String getPassGuru() {
        return this.pass_guru;
    }
    
    public void setAgmGuru(String AgamaGuru) {
        this.agm_guru=AgamaGuru;
    }
    public String getAgmGuru() {
        return this.agm_guru;
    }
    
    public void setJkGuru(String JenisKelaminGuru) {
        this.jk_guru=JenisKelaminGuru;
    }
    public String getJkGuru() {
        return this.jk_guru;
    }
    
    public void setTlpGuru(String TeleponGuru) {
        this.tlp_guru=TeleponGuru;
    }
    public String getTlpGuru() {
        return this.tlp_guru;
    }
    
    public void setEmailGuru(String EmailGuru) {
        this.email_guru=EmailGuru;
    }
    public String getEmailGuru() {
        return this.email_guru;
    }
    
    public void setAlmtGuru(String AlamatGuru) {
        this.almt_guru=AlamatGuru;
    }
    public String getAlmtGuru() {
        return this.almt_guru;
    }
    
    public void setPendGuru(String PendidikanGuru) {
        this.pend_guru=PendidikanGuru;
    }
    public String getPendGuru() {
        return this.pend_guru;
    }
    
   public void setStatusKawin(String StatusKawin) {
        this.status_kawin=StatusKawin;
    }
    public String getStatusKawin() {
        return this.status_kawin;
    } 
    
    public void setJab(String Jabatan) {
        this.jab=Jabatan;
    }
    public String getJab() {
        return this.jab;
    }
    
}

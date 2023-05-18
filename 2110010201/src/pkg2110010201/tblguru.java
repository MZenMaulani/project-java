/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2110010201;

/**
 *
 * @author mzenm
 */
public class tblguru {
    private String Nik;
    private String Nama_guru;
    private String Tmpt_lhr_guru;
    private String Tgl_lhr_guru;
    private String Pass_guru;   
    private String Agm_guru;
    private String Jk_guru;
    private String Tlp_guru;
    private String Email_guru;
    private String Almt_guru;
    private String Pend_guru;
    private String Status_kawin;
    private String Jab;
    
    public tblguru() {}
    
    public void setNoIndukKaryawan(String NomorIndukKaryawan) {
        this.Nik=NomorIndukKaryawan;
    }
    public String getNomorIndukKaryawan() {
        return this.Nik;
    }
    
    public void setNmGuru(String NamaGuru) {
        this.Nama_guru=NamaGuru;
    }
    public String getNamaGuru() {
        return this.Nama_guru;
    }
    
    public void setTmptLhrGuru(String TempatLahirGuru) {
    this.Tmpt_lhr_guru=TempatLahirGuru;
    }
    public String getTempatLahirGuru() {
        return this.Tmpt_lhr_guru;
    }
    
    public void setTglLhrGuru(String TanggalLahirGuru) {
    this.Tgl_lhr_guru=TanggalLahirGuru;
    }
    public String getTanggalLahirGuru() {
        return this.Tgl_lhr_guru;
    }

    public void setPassGuru(String PasswordGuru) {
        this.Pass_guru=PasswordGuru;
    }
    public String getPasswordGuru() {
        return this.Pass_guru;
    }
    
    public void setAgmGuru(String AgamaGuru) {
        this.Agm_guru=AgamaGuru;
    }
    public String getAgamaGuru() {
        return this.Agm_guru;
    }
    
    public void setJkGuru(String JenisKelaminGuru) {
        this.Jk_guru=JenisKelaminGuru;
    }
    public String getJenisKelaminGuru() {
        return this.Jk_guru;
    }
    
    public void setTlpGuru(String TeleponGuru) {
        this.Tlp_guru=TeleponGuru;
    }
    public String getTeleponGuru() {
        return this.Tlp_guru;
    }
    
    public void setEmail(String EmailGuru) {
        this.Email_guru=EmailGuru;
    }
    public String getEmailGuru() {
        return this.Email_guru;
    }
    
    public void AlmtGuru(String AlamatGuru) {
        this.Almt_guru=AlamatGuru;
    }
    public String getAlamatGuru() {
        return this.Almt_guru;
    }
    
    public void setPendGuru(String PendidikanGuru) {
        this.Pend_guru=PendidikanGuru;
    }
    public String getPendidikanGuru() {
        return this.Pend_guru;
    }
    
   public void setStatus(String StatusKawin) {
        this.Status_kawin=StatusKawin;
    }
    public String getStatusKawin() {
        return this.Status_kawin;
    } 
    
    public void setJab(String Jabatan) {
        this.Jab=Jabatan;
    }
    public String getJabatan() {
        return this.Jab;
    }
    
}

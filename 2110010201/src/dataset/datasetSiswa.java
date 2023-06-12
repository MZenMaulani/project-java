/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;

/**
 *
 * @author mzenm
 */
public class datasetSiswa {
    
    private ArrayList<String> nis;
    private ArrayList<String> nm_siswa;
    private ArrayList<String> tmpt_lhr_siswa;
    private ArrayList<String> tgl_lhr_siswa;
    private ArrayList<String> agm_siswa;
    private ArrayList<String> jk_siswa;
    private ArrayList<String> almt_siswa;
    private ArrayList<String> tlp_siswa;
    private ArrayList<String> asal_sekolah;
    private ArrayList<Integer> kd_kelas;
    private ArrayList<String> kondisi;
    private ArrayList<String> nm_wali;
    
    public datasetSiswa(){
    nis = new ArrayList<String>();
    nm_siswa = new ArrayList<String>();
    tmpt_lhr_siswa = new ArrayList<String>();
    tgl_lhr_siswa = new ArrayList<String>();
    agm_siswa = new ArrayList<String>();
    jk_siswa = new ArrayList<String>();
    almt_siswa = new ArrayList<String>();
    tlp_siswa = new ArrayList<String>();
    asal_sekolah = new ArrayList<String>();
    kd_kelas = new ArrayList<Integer>();
    kondisi = new ArrayList<String>();
    nm_wali = new ArrayList<String>();
    }
    
    public void insertNis(String isi){
        this.nis.add(isi);
    }
    public ArrayList<String> getRecordNis(){
        return this.nis; 
    }
    
    public void insertNmSiswa(String isi){
        this.nm_siswa.add(isi);
    }
    public ArrayList<String> getRecordNmSiswa(){
        return this.nm_siswa; 
    } 
    
    public void insertTmptLhrSiswa(String isi){
        this.tmpt_lhr_siswa.add(isi);
    }
    public ArrayList<String> getRecordTmptLhrSiswa(){
        return this.tmpt_lhr_siswa; 
    }
    
    public void insertTglLhrSiswa(String isi){
        this.tgl_lhr_siswa.add(isi);
    }
    public ArrayList<String> getRecordTglLhrSiswa(){
        return this.tgl_lhr_siswa; 
    }
    
    public void insertAgmSiswa(String isi){
        this.agm_siswa.add(isi);
    }
    public ArrayList<String> getRecordAgmSiswa(){
        return this.agm_siswa; 
    }
    
    public void insertJkSiswa(String isi){
        this.jk_siswa.add(isi);
    }
    public ArrayList<String> getRecordJkSiswa(){
        return this.jk_siswa; 
    }
    
    public void insertAlmtSiswa(String isi){
        this.almt_siswa.add(isi);
    }
    public ArrayList<String> getRecordAlmtSiswa(){
        return this.almt_siswa; 
    }
    
    public void insertTlpSiswa(String isi){
        this.tlp_siswa.add(isi);
    }
    public ArrayList<String> getRecordTlpSiswa(){
        return this.tlp_siswa; 
    }
    
    public void insertAsalSekolah(String isi){
        this.asal_sekolah.add(isi);
    }
    public ArrayList<String> getRecordAsalSekolah(){
        return this.asal_sekolah; 
    }
    
     public void insertKdKelas(Integer isi){
        this.kd_kelas.add(isi);
    }
    public ArrayList<Integer> getRecordKdKelas(){
        return this.kd_kelas; 
    }
    
     public void insertKondisi(String isi){
        this.kondisi.add(isi);
    }
    public ArrayList<String> getRecordKondisi(){
        return this.kondisi; 
    }
    
     public void insertNmWali(String isi){
        this.nm_wali.add(isi);
    }
    public ArrayList<String> getRecordNmWali(){
        return this.nm_wali; 
    }
    
    public void insertSiswa(String Nis, String nmSiswa, String tmptLhrSiswa, String tglLhrSiswa, 
            String agmSiswa, String jkSiswa, String almtSiswa, String tlpSiswa, String asalSekolah,
            int kdKelas, String Kondisi, String nmWali){
    this.nis.add(Nis);
    this.nm_siswa.add(nmSiswa);
    this.tmpt_lhr_siswa.add(tmptLhrSiswa);
    this.tgl_lhr_siswa.add(tglLhrSiswa);
    this.agm_siswa.add(agmSiswa);
    this.jk_siswa.add(jkSiswa);
    this.almt_siswa.add(almtSiswa);
    this.tlp_siswa.add(tlpSiswa);
    this.asal_sekolah.add(asalSekolah);
    this.kd_kelas.add(kdKelas);
    this.kondisi.add(Kondisi);
    this.nm_wali.add(nmWali);
        
    }
}

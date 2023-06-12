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
public class datasetGuru {
    
    private ArrayList<String> nik;
    private ArrayList<String> nama_guru;
    private ArrayList<String> tmpt_lhr_guru;
    private ArrayList<String> tgl_lhr_guru;
    private ArrayList<String> pass_guru;   
    private ArrayList<String> agm_guru;
    private ArrayList<String> jk_guru;
    private ArrayList<String> tlp_guru;
    private ArrayList<String> email_guru;
    private ArrayList<String> almt_guru;
    private ArrayList<String> pend_guru;
    private ArrayList<String> status_kawin;
    private ArrayList<String> jab;
    
    public datasetGuru(){
nik = new ArrayList<String>();
nama_guru = new ArrayList<String>();
tmpt_lhr_guru = new ArrayList<String>();
tgl_lhr_guru = new ArrayList<String>();
pass_guru= new ArrayList<String>();
agm_guru = new ArrayList<String>();
jk_guru = new ArrayList<String>();
tlp_guru = new ArrayList<String>();
email_guru = new ArrayList<String>();
almt_guru = new ArrayList<String>();
pend_guru= new ArrayList<String>();
status_kawin= new ArrayList<String>();
jab= new ArrayList<String>();
    }
    
   public void insertNik(String isi){
        this.nik.add(isi);
    }
    public ArrayList<String> getRecordNik(){
        return this.nik; 
    }
    
    public void insertNamaGuru(String isi){
        this.nama_guru.add(isi);
    }
    public ArrayList<String> getRecordNamaGuru(){
        return this.nama_guru; 
    } 
    
    public void insertTmptLhrGuru(String isi){
        this.tmpt_lhr_guru.add(isi);
    }
    public ArrayList<String> getRecordTmptLhrGuru(){
        return this.tmpt_lhr_guru; 
    }
    
    public void insertTglLhrGuru(String isi){
        this.tgl_lhr_guru.add(isi);
    }
    public ArrayList<String> getRecordTglLhrGuru(){
        return this.tgl_lhr_guru; 
    }
    
    public void insertPassGuru(String isi){
        this.pass_guru.add(isi);
    }
    public ArrayList<String> getRecordPassGuru(){
        return this.pass_guru; 
    }
    
    public void insertAgmGuru(String isi){
        this.agm_guru.add(isi);
    }
    public ArrayList<String> getRecordAgmGuru(){
        return this.agm_guru; 
    }
    
    public void insertJkGuru(String isi){
        this.jk_guru.add(isi);
    }
    public ArrayList<String> getRecordJkGuru(){
        return this.jk_guru; 
    }
    
    public void insertTlpGuru(String isi){
        this.tlp_guru.add(isi);
    }
    public ArrayList<String> getRecordTlpGuru(){
        return this.tlp_guru; 
    }
    
    public void insertEmailGuru(String isi){
        this.email_guru.add(isi);
    }
    public ArrayList<String> getRecordEmailGuru(){
        return this.email_guru; 
    }
    
     public void insertAlmtGuru(String isi){
        this.almt_guru.add(isi);
    }
    public ArrayList<String> getRecordAlmtGuru(){
        return this.almt_guru; 
    }
    
     public void insertPendGuru(String isi){
        this.pend_guru.add(isi);
    }
    public ArrayList<String> getRecordPendGuru(){
        return this.pend_guru; 
    }
    
     public void insertStatusKawin(String isi){
        this.status_kawin.add(isi);
    }
    public ArrayList<String> getRecordStatusKawin(){
        return this.status_kawin; 
    }
    
     public void insertJab(String isi){
        this.jab.add(isi);
    }
    public ArrayList<String> getRecordJab(){
        return this.jab; 
    }
    
     public void insertGuru(String nik, String namaGuru, String tmptLhrGuru, String tglLhrGuru, 
            String passGuru, String agmGuru,String jkGuru, String tlpGuru, String emailGuru,
            String almtGuru, String pendGuru, String statusKawin, String Jab){
        this.nik.add(nik);
        this.nama_guru.add(namaGuru);
        this.tmpt_lhr_guru.add(tmptLhrGuru);
        this.tgl_lhr_guru.add(tglLhrGuru);
        this.pass_guru.add(passGuru);
        this.agm_guru.add(agmGuru);
        this.jk_guru.add(jkGuru);
        this.tlp_guru.add(tlpGuru);
        this.email_guru.add(emailGuru);
        this.almt_guru.add(almtGuru);
        this.pend_guru.add(pendGuru);
        this.status_kawin.add(statusKawin);
        this.jab.add(Jab);
        
     }      
}

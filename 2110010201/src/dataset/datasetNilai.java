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
public class datasetNilai {
    private ArrayList <Integer> kd_kelas;
    private ArrayList <String> nis;
    private ArrayList <String> nik;
    private ArrayList <Integer> kd_pel;
    private ArrayList <Integer> nil_uts;
    private ArrayList <Integer> nil_uas;
    private ArrayList <Integer> nil_tgs;
    private ArrayList <Integer> absen;
    
    public datasetNilai(){
    kd_kelas = new ArrayList <Integer>();
    nis = new ArrayList <String>();
    nik = new ArrayList <String>();
    kd_pel = new ArrayList <Integer>();
    nil_uts = new ArrayList <Integer>();
    nil_uas = new ArrayList <Integer>();
    nil_tgs = new ArrayList <Integer>();
    absen = new ArrayList <Integer>();
    }
    
    public void insertKdKelas(Integer isi){
        this.kd_kelas.add(isi);
    }
    public ArrayList<Integer> getRecordKdKelas(){
        return this.kd_kelas; 
    }
    
    public void insertNis(String isi){
        this.nis.add(isi);
    }
    public ArrayList<String> getRecordNis(){
        return this.nis; 
    }
    
    public void insertNik(String isi){
        this.nik.add(isi);
    }
    public ArrayList<String> getRecordNik(){
        return this.nik; 
    }
    
    public void insertKdPel(Integer isi){
        this.kd_pel.add(isi);
    }
    public ArrayList<Integer> getRecordKdPel(){
        return this.kd_pel; 
    }
    
    public void insertNilUts(Integer isi){
        this.nil_uts.add(isi);
    }
    public ArrayList<Integer> getRecordNilUts(){
        return this.nil_uts; 
    }
    
    public void insertNilUas(Integer isi){
        this.nil_uas.add(isi);
    }
    public ArrayList<Integer> getRecordNilUas(){
        return this.nil_uas; 
    }
    
    public void insertNilTgs(Integer isi){
        this.nil_tgs.add(isi);
    }
    public ArrayList<Integer> getRecordNilTgs(){
        return this.nil_tgs; 
    }
    
    public void insertAbsen(Integer isi){
        this.absen.add(isi);
    }
    public ArrayList<Integer> getRecordAbsen(){
        return this.absen; 
    }
}

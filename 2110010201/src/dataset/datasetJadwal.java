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
public class datasetJadwal {
    private ArrayList<Integer> id_jadwal;
    private ArrayList<Integer> kd_kelas;
    private ArrayList<Integer> kd_pel;
    private ArrayList<String> nik;
    private ArrayList<String> jam_masuk;
    private ArrayList<String> hari_masuk;

    public datasetJadwal(){
    id_jadwal = new ArrayList<Integer>();
    kd_kelas = new ArrayList<Integer>();
    kd_pel = new ArrayList<Integer>();
    nik = new ArrayList<String>();
    jam_masuk = new ArrayList<String>();
    hari_masuk = new ArrayList<String>();
}
    
   public void insertIdJadwal(Integer isi){
        this.id_jadwal.add(isi);
    }
    public ArrayList<Integer> getRecordIdJadwal(){
        return this.id_jadwal; 
    }
    
    public void insertKdKelas(Integer isi){
        this.kd_kelas.add(isi);
    }
    public ArrayList<Integer> getRecordKdKelas(){
        return this.kd_kelas; 
    }
    
    public void insertKdPel(Integer isi){
        this.kd_pel.add(isi);
    }
    public ArrayList<Integer> getRecordKdPel(){
        return this.kd_pel; 
    }
    
    public void insertNik(String isi){
        this.nik.add(isi);
    }
    public ArrayList<String> getRecordNik(){
        return this.nik; 
    }
    
    public void insertJamMasuk(String isi){
        this.jam_masuk.add(isi);
    }
    public ArrayList<String> getRecordJamMasuk(){
        return this.jam_masuk; 
    }
    
    public void insertHariMasuk(String isi){
        this.hari_masuk.add(isi);
    }
    public ArrayList<String> getRecordHariMasuk(){
        return this.hari_masuk; 
    }
    
    public void insertJadwal(int idJadwal, int kdKelas, int kdPel, String Nik, 
        String jamMasuk, String hariMasuk){
        this.id_jadwal.add(idJadwal);
        this.kd_kelas.add(kdKelas);
        this.kd_pel.add(kdPel);
        this.nik.add(Nik);
        this.jam_masuk.add(jamMasuk);
        this.hari_masuk.add(hariMasuk);
        
        
    }
}  
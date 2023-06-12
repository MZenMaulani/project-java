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
public class datasetPelajaran {
    private ArrayList <Integer> kd_pel;
    private ArrayList <String> nm_pel;
    private ArrayList <Integer> kkm;
    
    public datasetPelajaran(){
        kd_pel = new ArrayList<Integer>();
        nm_pel = new ArrayList<String>();
        kkm = new ArrayList<Integer>();
    }
    public void insertKdPel(Integer isi){
        this.kd_pel.add(isi);
    }
    public ArrayList<Integer> getRecordKdPel(){
        return this.kd_pel;   
    }
        
    public void insertNmPel(String isi){
        this.nm_pel.add(isi);
    }
    public ArrayList<String> getRecordNmPel(){
        return this.nm_pel;   
    }  

    public void insertKkm(Integer isi){
        this.kkm.add(isi);
    }
    public ArrayList<Integer> getRecordKkm(){
        return this.kkm;   
    }    
    
    public void insertPelajaran(int kdPel, String nmPel, int Kkm){
        
        this.kd_pel.add(kdPel);
        this.nm_pel.add(nmPel);
        this.kkm.add(Kkm);
    }
}

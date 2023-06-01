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
public class datasetKelas {
    
    private ArrayList<Integer> kd_kelas;
    private ArrayList<String> kelas;
    private ArrayList<String> kapasitas;
    
     public datasetKelas(){
        kd_kelas = new ArrayList<Integer>();
        kelas = new ArrayList<String>();
        kapasitas = new ArrayList<String>();
    }
     
        public void insertKdKelas(Integer isi){
            this.kd_kelas.add(isi);
    }
        public ArrayList<Integer> getRecordKdKelas(){
            return this.kd_kelas;   
    }
        
        public void insertKelas(String isi){
            this.kelas.add(isi);
    }
        public ArrayList<String> getRecordKelas(){
            return this.kelas;
    }  
        public void insertKapasitas(String isi){
            this.kapasitas.add(isi);
    }
        public ArrayList<String> getRecordKapasitas(){
            return this.kapasitas;   
    }
}   

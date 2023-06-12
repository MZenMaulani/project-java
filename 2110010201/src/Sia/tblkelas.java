/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sia;

/**
 *
 * @author mzenm
 */
public class tblkelas {
    private int kd_kelas;
    private String kelas;
    private String kapasitas;
    
    
    public tblkelas() {}
        
    public void setKdKelas(int KodeKelas) {
        this.kd_kelas=KodeKelas;
    }
    public int getKdKelas() {
        return this.kd_kelas;
    }
    
   public void setNmKelas(String Kelas) {
        this.kelas=Kelas;
    }
    public String getNmKelas() {
        return this.kelas;
    } 
    
    public void setKapasitas(String Kapasitas) {
        this.kapasitas=Kapasitas;
    }
    public String getKapasitas() {
        return this.kapasitas;
    }
}

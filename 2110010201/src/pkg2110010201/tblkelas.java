/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2110010201;

/**
 *
 * @author mzenm
 */
public class tblkelas {
    private int Kd_kelas;
    private String Kelas;
    private String Kapasitas;
    
    
    public tblkelas() {}
        
    public void setKdKelas(int KodeKelas) {
        this.Kd_kelas=KodeKelas;
    }
    public int getKodeKelas() {
        return this.Kd_kelas;
    }
    
   public void setKls(String Kelas) {
        this.Kelas=Kelas;
    }
    public String getKelas() {
        return this.Kelas;
    } 
    
    public void setKps(String Kapasitas) {
        this.Kapasitas=Kapasitas;
    }
    public String getKapasitas() {
        return this.Kapasitas;
    }
}

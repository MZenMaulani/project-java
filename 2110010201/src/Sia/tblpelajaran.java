/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sia;

/**
 *
 * @author mzenm
 */
public class tblpelajaran {
    private int Kd_pel;
    private String Nm_pel;
    private int Kkm;
    
    public tblpelajaran(){}
    
    public void setKdpel(int KodePelajaran) {
        this.Kd_pel=KodePelajaran;
    }
    public int getKdpel() {
        return this.Kd_pel;
    }
    
    public void setNmpel(String NamaPelajaran) {
        this.Nm_pel=NamaPelajaran;
    }
    public String getNmpel() {
        return this.Nm_pel;
    }
    
    public void setKkm(int KKM) {
        this.Kkm=KKM;
    }
    public int getKkm() {
        return this.Kkm;
    }
}

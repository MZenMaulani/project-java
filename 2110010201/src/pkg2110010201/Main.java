/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2110010201;
import Sia.*;
import dataset.*;


/**
 *
 * @author mzenm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        tblguru guru = new tblguru();
        tblsiswa siswa = new tblsiswa();
        tblkelas kelas = new tblkelas();
        tbljadwal jadwal = new tbljadwal();
        tblpelajaran pelajaran = new tblpelajaran();
        tblnilai nilai =new tblnilai();
        
        //set
        guru.setNik("633123");
        guru.setNamaGuru("Jamal");
        guru.setTmptLhrGuru("Banjarmasin");
        guru.setTglLhrGuru("01/01/2001");
        guru.setPassGuru("jamal23");
        guru.setAgmGuru("Islam");
        guru.setJkGuru("L");
        guru.setTlpGuru("081234567890");
        guru.setEmailGuru("jamal03@gmail.com");
        guru.setAlmtGuru("Jl.Manggis");
        guru.setPendGuru("S1 Pendidikan");
        guru.setStatusKawin("Belum");
        guru.setJab("Anggota");
        
        //get
        System.out.println("Nomor Induk Karyawan: " +guru.getNik());
        System.out.println("Nama Guru           : " +guru.getNamaGuru());
        System.out.println("Tempat Lahir        : " +guru.getTmptLhrGuru());
        System.out.println("Tanggal Lahir       : " +guru.getTglLhrGuru());
        System.out.println("Password Guru       : " +guru.getPassGuru());
        System.out.println("Agama               : " +guru.getAgmGuru());
        System.out.println("Jenis Kelamin       : " +guru.getJkGuru());
        System.out.println("Telpon              : " +guru.getTlpGuru());
        System.out.println("Email               : " +guru.getEmailGuru());
        System.out.println("Alamat              : " +guru.getAlmtGuru());
        System.out.println("Pendidikan          : " +guru.getPendGuru());
        System.out.println("Status Kawin        : " +guru.getStatusKawin());
        System.out.println("Jabatan             : " +guru.getJab());
       
       //Memasukkan Array List kedalam Object
       datasetGuru Guru = new datasetGuru();
       datasetSiswa Siswa = new datasetSiswa();
       datasetKelas Kelas = new datasetKelas();
       datasetJadwal Jadwal = new datasetJadwal();
       datasetPelajaran Pelajaran = new datasetPelajaran();
       datasetNilai Nilai = new datasetNilai();
       
       //Menginput data Array List pada setiap tabel
       Guru.insertNik("033123");
       Guru.insertNamaGuru("Jamal");
       Guru.insertTmptLhrGuru("Banjarmasin");
       Guru.insertTglLhrGuru("01-01-2001");
       Guru.insertPassGuru("jamal23");
       Guru.insertAgmGuru("Islam");
       Guru.insertJkGuru("L");
       Guru.insertTlpGuru("081234567890");
       Guru.insertEmailGuru("jamal03@gmail.com");
       Guru.insertAlmtGuru("Jl.Manggis");
       Guru.insertPendGuru("S1 Pendidikan");
       Guru.insertStatusKawin("Belum");
       Guru.insertJab("Anggota");
       
       Siswa.insertNis("022123");
       Siswa.insertNmSiswa("Zen");
       Siswa.insertTmptLhrSiswa("Banjarmasin");
       Siswa.insertAgmSiswa("Islam");
       Siswa.insertJkSiswa("L");
       Siswa.insertAlmtSiswa("Jl.Simpang Tangga");
       Siswa.insertTlpSiswa("081234567891");
       Siswa.insertAsalSekolah("SMKN 1 Simpang Empat");
       Siswa.insertKdKelas(012);
       Siswa.insertKondisi("Sehat");
       Siswa.insertNmWali("Noor");
        
       Kelas.insertKdKelas(012);
       Kelas.insertKelas("C");
       Kelas.insertKapasitas("35");
        
       Jadwal.insertIdJadwal(002);
       Jadwal.insertKdKelas(012);
       Jadwal.insertKdPel(002);
       Jadwal.insertNik("033123");
       Jadwal.insertJamMasuk("08:00");
       Jadwal.insertHariMasuk("Rabu");
       
       Pelajaran.insertKdPel(022);
       Pelajaran.insertNmPel("B.Indonesia");
       Pelajaran.insertKkm(70);
       
       Nilai.insertKdKelas(012);
       Nilai.insertNis("022123");
       Nilai.insertNik("033123");
       Nilai.insertKdPel(022);
       Nilai.insertNilUts(80);
       Nilai.insertNilUas(70);
       Nilai.insertNilTgs(80);
       Nilai.insertAbsen(1);
       
       
       //menampilkan data Array List
        System.out.println("===============DATA GURU==============");
        System.out.println(Guru.getRecordNik());
        System.out.println(Guru.getRecordNamaGuru());
        System.out.println(Guru.getRecordTmptLhrGuru());
        System.out.println(Guru.getRecordTglLhrGuru());
        System.out.println(Guru.getRecordPassGuru());
        System.out.println(Guru.getRecordAgmGuru());
        System.out.println(Guru.getRecordJkGuru());
        System.out.println(Guru.getRecordTlpGuru());
        System.out.println(Guru.getRecordEmailGuru());
        System.out.println(Guru.getRecordAlmtGuru());
        System.out.println(Guru.getRecordPendGuru());
        System.out.println(Guru.getRecordStatusKawin());
        System.out.println(Guru.getRecordJab());
        
        System.out.println("\t");
        System.out.println("===============DATA SISWA==============");
        System.out.println(Siswa.getRecordNis());
        System.out.println(Siswa.getRecordNmSiswa());
        System.out.println(Siswa.getRecordTmptLhrSiswa());
        System.out.println(Siswa.getRecordTglLhrSiswa());
        System.out.println(Siswa.getRecordAgmSiswa());
        System.out.println(Siswa.getRecordJkSiswa());
        System.out.println(Siswa.getRecordAlmtSiswa());
        System.out.println(Siswa.getRecordTlpSiswa());
        System.out.println(Siswa.getRecordAsalSekolah());
        System.out.println(Siswa.getRecordKdKelas());
        System.out.println(Siswa.getRecordKondisi());
        System.out.println(Siswa.getRecordNmWali());
        
        System.out.println("\t");
        System.out.println("===============DATA KELAS==============");
        System.out.println(Kelas.getRecordKdKelas());
        System.out.println(Kelas.getRecordKelas());
        System.out.println(Kelas.getRecordKapasitas());
        
        System.out.println("\t");
        System.out.println("===============DATA JADWAL==============");
        System.out.println(Jadwal.getRecordIdJadwal());
        System.out.println(Jadwal.getRecordKdKelas());
        System.out.println(Jadwal.getRecordKdPel());
        System.out.println(Jadwal.getRecordNik());
        System.out.println(Jadwal.getRecordJamMasuk());
        System.out.println(Jadwal.getRecordHariMasuk());
        
        System.out.println("\t");
        System.out.println("===============DATA PELAJARAN==============");
        System.out.println(Pelajaran.getRecordKdPel());
        System.out.println(Pelajaran.getRecordNmPel());
        System.out.println(Pelajaran.getRecordKkm());
        
        
        System.out.println("\t");
        System.out.println("===============DATA NILAI==============");
        System.out.println(Nilai.getRecordKdKelas());
        System.out.println(Nilai.getRecordNis());
        System.out.println(Nilai.getRecordNik());
        System.out.println(Nilai.getRecordKdPel());
        System.out.println(Nilai.getRecordNilUts());
        System.out.println(Nilai.getRecordNilUas());
        System.out.println(Nilai.getRecordNilTgs());
        System.out.println(Nilai.getRecordAbsen());
    }
    
}

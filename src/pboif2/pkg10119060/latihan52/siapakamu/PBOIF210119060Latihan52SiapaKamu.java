/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan52.siapakamu;

/**
 *
  @author Megianto Adi saputra
 Nama         : Megianto Adi Saputra
 Kelas        : IF-2
 NIM          : 10119060
 Deskripsi    : Program Siapa Kamu
 */
public class PBOIF210119060Latihan52SiapaKamu {

    public static void main(String[] args) {
        // TODO code application logic here
        Manusia objManusia = new Manusia(); 
        Dosen objDosen = new Dosen(); 
        objDosen.setNama("Rizki Adam Kurniawan");
        objDosen.setUmur(27);
        objDosen.setNip("41227829930");
        objDosen.setMataKuliah("PBO");
        System.out.println("NIP : " + objDosen.getNip());
        
        objDosen.mengajarApa();
        objDosen.siapaKamu();
        System.out.println("");
     
        Mahasiswa objMahasiswa = new Mahasiswa(); 
        objMahasiswa.setNama("Nindi");
        objMahasiswa.setUmur(17);
        objMahasiswa.setNim("10110269");
        objMahasiswa.setKelas("PBO2");
        System.out.println("NIM Mahasiswa : "+ objMahasiswa.getNim());
        
        objMahasiswa.kelasApa();
        objMahasiswa.siapaKamu();
                
        

         
       
    }
    
}

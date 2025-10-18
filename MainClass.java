/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mahasiswa;

/**
 *
 * @author Lenovo
 */
public class MainClass {
    public static void main(String[] args){
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNama("Aulia nakesya");
        mhs1.setNim(207015);
        mhs1.setJurusan("Pendidikan Teknologi Informasi");
        mhs1.tampilkanData();
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.setNama("Sofyan Aji L");
        mhs2.setNim(207020);
        mhs2.setJurusan("Pendidikan Teknologi Informasi");
        mhs2.tampilkanData();
        
    }
    
}

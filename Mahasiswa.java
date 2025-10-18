/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mahasiswa;

/**
 *
 * @author Lenovo
 */
public class Mahasiswa {
    private String nama;
    private int nim;
    private String jurusan;

    public void setNama(String namaMahasiswa) {
        nama = namaMahasiswa;
    }

    public void setNim(int nimMahasiswa) {
        nim = nimMahasiswa;
    }

    public void setJurusan(String jurusanMahasiswa) {
        jurusan = jurusanMahasiswa;
    }

    public void tampilkanData(){
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama   : " + nama);
        System.out.println("NIM    : " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println();
    } 

}

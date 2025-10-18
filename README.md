# Tugas1_Prog2_24183207015
Tugas 1 Pemrograman 2 - Class dan Object  java

**Nama:** Aulia Nakesya
**NPM:** 24183207015
**Jurusan/smt:** PTI 3A

-----

## Penjelasan singkat Class dan Atribut yang digunakan
Program ini membuat objek Mahasiswa yang memiliki beberapa atribut dasar dan menampilkannya ke layar melalui method.
Program terdiri dari dua class utama:

-----
### 1. Class Mahasiswa
Class ini merepresentasikan data mahasiswa.  
Berisi *atribut* dan *method* berikut:
#### 🔸 Atribut:
- private String nama; → menyimpan nama mahasiswa  
- private int NPM; → menyimpan Nomor Induk Mahasiswa  
- private String jurusan; → menyimpan jurusan mahasiswa  
#### 🔸 Method:
- setNama(String namaMahasiswa) → mengatur nilai atribut nama  
- setNPM(int nimMahasiswa) → mengatur nilai atribut NPM  
- setJurusan(String jurusanMahasiswa) → mengatur nilai atribut jurusan  
- tampilkanData() → menampilkan semua data mahasiswa ke layar  
Class ini menggunakan prinsip *enkapsulasi*, di mana atribut dibuat private agar tidak bisa diakses langsung dari luar class.

-----
### 2. Class MainClass
Class ini merupakan *class utama* untuk menjalankan program.  
Berisi method main() yang berfungsi untuk:
- Membuat *dua objek* dari class Mahasiswa (mhs1 dan mhs2)  
- Mengisi data masing-masing objek dengan method setter  
- Menampilkan data menggunakan method tampilkanData()

-----
## 💻 Contoh Output Program
=== Data Mahasiswa === 
Nama   : Aulia Nakesya 
NIM    : 207015 
Jurusan: Pendidikan Teknologi Informasi

=== Data Mahasiswa === 
Nama   : Sofyan Aji L 
NIM    : 207020 
Jurusan: Pendidikan Teknologi Informasi

---

## 🧠 Konsep yang Diterapkan
- *Class dan Object*  
  Untuk mendefinisikan blueprint (Mahasiswa) dan membuat instansinya (mhs1, mhs2).
- *Enkapsulasi*  
  Melindungi data dengan atribut private dan mengaksesnya melalui method setter.
- *Modularitas*  
  Pemisahan antara class data (Mahasiswa) dan class eksekusi (MainClass) agar kode lebih terstruktur.

---

## Program ini disusun untuk memenuhi tugas 1 mata kuliah **Pemrograman 2**




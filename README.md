# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi **Sistem Manajemen Gym** menggunakan Java sebagai tugas akhir mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini digunakan untuk mengelola data member gym. Pengguna dapat menambahkan data member, menampilkan seluruh data member, mencari member berdasarkan ID, mengubah data member, menghapus data member, serta menghitung biaya keanggotaan berdasarkan jenis member yang dipilih.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti **Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Polymorphism (Overriding), Seleksi, Perulangan, Input Output Sederhana, Array,** dan **Error Handling**.

---

# Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang digunakan pada aplikasi ini.

## 1. Class

Class merupakan blueprint atau cetakan untuk membuat object.

Pada program ini terdapat beberapa class yaitu:

- Member
- RegularMember
- PremiumMember
- Gym
- Main

```java
public class Member {
    ...
}

public class RegularMember extends Member {
    ...
}

public class PremiumMember extends Member {
    ...
}

public class Gym {
    ...
}

public class Main {
    ...
}
```

---

## 2. Object

Object merupakan hasil instansiasi dari sebuah class.

Contoh pada program:

```java
Gym gym = new Gym();

Member member = new RegularMember(
        id, nama, umur,
        jenisKelamin,
        nomorHP,
        lamaBulan
);
```

---

## 3. Atribut

Atribut merupakan variabel yang dimiliki oleh class.

Contoh pada class Member:

```java
private String idMember;
private String nama;
private int umur;
private String jenisKelamin;
private String nomorHP;
private String jenisMember;
private int lamaBulan;
```

---

## 4. Constructor

Constructor digunakan untuk memberikan nilai awal saat object dibuat.

```java
public Member(String idMember,
              String nama,
              int umur,
              String jenisKelamin,
              String nomorHP,
              String jenisMember,
              int lamaBulan){

    this.idMember = idMember;
    this.nama = nama;
    this.umur = umur;
    this.jenisKelamin = jenisKelamin;
    this.nomorHP = nomorHP;
    this.jenisMember = jenisMember;
    this.lamaBulan = lamaBulan;
}
```

---

## 5. Mutator (Setter)

Method setter digunakan untuk mengubah nilai atribut.

```java
public void setNama(String nama){
    this.nama = nama;
}

public void setUmur(int umur){
    this.umur = umur;
}
```

---

## 6. Accessor (Getter)

Method getter digunakan untuk mengambil nilai atribut.

```java
public String getNama(){
    return nama;
}

public int getUmur(){
    return umur;
}
```

---

## 7. Encapsulation

Encapsulation dilakukan dengan membuat atribut menjadi private dan hanya dapat diakses melalui getter dan setter.

```java
private String nama;
private int umur;
```

---

## 8. Inheritance

Inheritance digunakan agar class PremiumMember dan RegularMember mewarisi seluruh atribut dan method dari class Member.

```java
public class PremiumMember extends Member{

}

public class RegularMember extends Member{

}
```

---

## 9. Polymorphism

Program menggunakan **Method Overriding**.

Method `hitungBiaya()` pada class Member dioverride pada class PremiumMember dan RegularMember.

```java
@Override
public double hitungBiaya(){

    return getLamaBulan() * BIAYA_PER_BULAN;

}
```

Pada PremiumMember:

```java
@Override
public double hitungBiaya(){

    double total = getLamaBulan() * BIAYA_PER_BULAN;

    if(getLamaBulan() >= 12){
        total *= 0.9;
    }

    return total;

}
```

---

## 10. Seleksi

Program menggunakan percabangan `if-else` untuk menentukan diskon pada member Premium.

```java
if(getLamaBulan() >= 12){
    total *= 0.9;
}
```

---

## 11. Perulangan

Program menggunakan perulangan untuk menampilkan seluruh data member.

```java
for(int i=0; i<jumlahMember; i++){

    System.out.println(daftarMember[i]);

}
```

---

## 12. Input Output Sederhana

Program menggunakan Scanner sebagai input dari keyboard dan System.out.println sebagai output.

```java
Scanner input = new Scanner(System.in);

System.out.print("Nama : ");
String nama = input.nextLine();

System.out.println("Data berhasil ditambahkan.");
```

---

## 13. Array

Program menggunakan array object untuk menyimpan data member.

```java
private Member[] daftarMember = new Member[100];
```

---

## 14. Error Handling

Program menggunakan try-catch untuk menangani kesalahan input maupun kesalahan saat program berjalan.

```java
try{

    int umur = Integer.parseInt(input.nextLine());

}catch(Exception e){

    System.out.println("Terjadi Kesalahan : " + e.getMessage());

}
```

---

# Fitur Program

- Menambah data member
- Menampilkan seluruh member
- Mencari member berdasarkan ID
- Mengubah data member
- Menghapus data member
- Menghitung biaya member otomatis
- Member Premium mendapatkan diskon apabila berlangganan minimal 12 bulan

---

# Usulan Nilai

| No | Materi | Nilai |
|:--:|----------------|:----:|
|1|Class|5|
|2|Object|5|
|3|Atribut|5|
|4|Constructor|5|
|5|Mutator|5|
|6|Accessor|5|
|7|Encapsulation|5|
|8|Inheritance|5|
|9|Polymorphism|10|
|10|Seleksi|5|
|11|Perulangan|5|
|12|IO Sederhana|10|
|13|Array|15|
|14|Error Handling|15|
| |**TOTAL**|**100**|

---

# Pembuat

**Nama :** Gusti Achmad Reza Ananta

**NPM :** 2410010213

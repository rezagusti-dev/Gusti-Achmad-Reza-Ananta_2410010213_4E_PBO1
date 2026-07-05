/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemmanajemangym;

import java.util.Scanner;

public class Gym {

    Scanner input = new Scanner(System.in);

    // Array Object
    private final Member[] daftarMember = new Member[100];
    private int jumlahMember = 0;

    // ==========================
    // Tambah Member
    // ==========================
    public void tambahMember() {

        try {

            System.out.println("\n===== TAMBAH MEMBER =====");

            System.out.print("ID Member          : ");
            String id = input.nextLine();

            System.out.print("Nama               : ");
            String nama = input.nextLine();

            System.out.print("Umur               : ");
            int umur = Integer.parseInt(input.nextLine());

            System.out.print("Jenis Kelamin      : ");
            String jk = input.nextLine();

            System.out.print("Nomor HP           : ");
            String hp = input.nextLine();

            System.out.println("Jenis Member");
            System.out.println("1. Regular");
            System.out.println("2. Premium");
            System.out.print("Pilih : ");
            int pilih = Integer.parseInt(input.nextLine());

            System.out.print("Lama Member (bulan): ");
            int lama = Integer.parseInt(input.nextLine());

            if (pilih == 1) {

                daftarMember[jumlahMember] =
                        new RegularMember(id, nama, umur, jk, hp, lama);

            } else if (pilih == 2) {

                daftarMember[jumlahMember] =
                        new PremiumMember(id, nama, umur, jk, hp, lama);

            } else {

                System.out.println("Pilihan tidak tersedia.");
                return;

            }

            jumlahMember++;

            System.out.println("\nMember berhasil ditambahkan.");

        } catch (NumberFormatException e) {

            System.out.println("Input angka tidak valid!");

        } catch (Exception e) {

            System.out.println("Terjadi kesalahan : " + e.getMessage());

        }

    }

    // ==========================
    // Tampilkan Semua Member
    // ==========================
    public void tampilkanMember() {

        if (jumlahMember == 0) {

            System.out.println("\nBelum ada data member.");
            return;

        }

        System.out.println("\n===== DATA MEMBER =====");

        for (int i = 0; i < jumlahMember; i++) {

            System.out.println("\nData Ke-" + (i + 1));
            daftarMember[i].tampilkanData();

        }

    }

    // ==========================
    // Cari Member
    // ==========================
    public void cariMember() {

        if (jumlahMember == 0) {

            System.out.println("Data masih kosong.");
            return;

        }

        System.out.print("Masukkan ID Member : ");
        String cari = input.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < jumlahMember; i++) {

            if (daftarMember[i].getIdMember().equalsIgnoreCase(cari)) {

                daftarMember[i].tampilkanData();
                ditemukan = true;
                break;

            }

        }

        if (!ditemukan) {

            System.out.println("Member tidak ditemukan.");

        }

    }

    // ==========================
    // Update Member
    // ==========================
    public void updateMember() {

        System.out.print("Masukkan ID Member : ");
        String cari = input.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < jumlahMember; i++) {

            if (daftarMember[i].getIdMember().equalsIgnoreCase(cari)) {

                System.out.print("Nama Baru : ");
                daftarMember[i].setNama(input.nextLine());

                System.out.print("Umur Baru : ");
                daftarMember[i].setUmur(Integer.parseInt(input.nextLine()));

                System.out.print("Nomor HP Baru : ");
                daftarMember[i].setNomorHP(input.nextLine());

                System.out.println("Data berhasil diperbarui.");

                ditemukan = true;
                break;

            }

        }

        if (!ditemukan) {

            System.out.println("Member tidak ditemukan.");

        }

    }

    // ==========================
    // Hapus Member
    // ==========================
    public void hapusMember() {

        System.out.print("Masukkan ID Member : ");
        String cari = input.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < jumlahMember; i++) {

            if (daftarMember[i].getIdMember().equalsIgnoreCase(cari)) {

                for (int j = i; j < jumlahMember - 1; j++) {

                    daftarMember[j] = daftarMember[j + 1];

                }

                daftarMember[jumlahMember - 1] = null;
                jumlahMember--;

                System.out.println("Member berhasil dihapus.");

                ditemukan = true;
                break;

            }

        }

        if (!ditemukan) {

            System.out.println("Member tidak ditemukan.");

        }

    }

}
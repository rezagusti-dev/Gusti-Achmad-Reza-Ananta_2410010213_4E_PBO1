
package sistemmanajemangym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Gym gym = new Gym();

        int pilihan;

        do {

            System.out.println();
            System.out.println("=======================================");
            System.out.println("      SISTEM MANAJEMEN GYM");
            System.out.println("=======================================");
            System.out.println("1. Tambah Member");
            System.out.println("2. Tampilkan Semua Member");
            System.out.println("3. Cari Member");
            System.out.println("4. Update Member");
            System.out.println("5. Hapus Member");
            System.out.println("6. Keluar");
            System.out.println("=======================================");
            System.out.print("Pilih Menu : ");

            try {

                pilihan = Integer.parseInt(input.nextLine());

                switch (pilihan) {

                    case 1 -> gym.tambahMember();

                    case 2 -> gym.tampilkanMember();

                    case 3 -> gym.cariMember();

                    case 4 -> gym.updateMember();

                    case 5 -> gym.hapusMember();

                    case 6 -> {
                        System.out.println();
                        System.out.println("=======================================");
                        System.out.println("Terima kasih telah menggunakan");
                        System.out.println("Sistem Manajemen Gym");
                        System.out.println("=======================================");
                    }

                    default -> System.out.println("Menu tidak tersedia.");

                }

            } catch (NumberFormatException e) {

                System.out.println("Input harus berupa angka.");
                pilihan = 0;

            }

        } while (pilihan != 6);

        input.close();

    }

}
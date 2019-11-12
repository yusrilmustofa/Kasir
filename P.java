/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge.rpl;

import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author yusri
 */
public class P {

    class Tanggal {

        private String getTanggal() {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = new Date();
            return dateFormat.format(date);
        }

        private String getWaktu() {
            DateFormat dateFormat = new SimpleDateFormat("HH:mm");
            Date date = new Date();
            return dateFormat.format(date);
        }
    }

    void Menu() {
        Scanner Iam = new Scanner(System.in);
        System.out.println("||||||||||||||||||||||||||||| WELCOME TO MY SHOES SHOP"
                + "\tEnjoy It:v|||||||||||||||||||||||||||||||| ");
        System.out.println("\nSilakan Masukkan Nama Kasir: ");
        String NamaKasir = Iam.next();

        System.out.println("\n =====JAYABARU SHOES=====");
        CoKasir2 cetak = new CoKasir2("\n[1]COWOK  \n[2]CEWEK", "\n[1]OLAHRAGA \n[2]Lari   \n[3]SANTAI \n[4]KANTORAN","\n[1]ADIDAS  \n[2]NIKE   \n[3]SKECHERS\n[4]PUMA   \n[5]REEBOK \n[6]VANS   \n[7]CONVERSE   \n[8]910   \n[9]Fila","\n[1]BLACK   \n[2]WHITE  \n[3]Gold   \n[4]SILVER \n[5]ORANGE \n[6]Green  \n[7]YELLOW \n[8]BLUE   \n[9]RED");

        System.out.println("DAFTAR HARGA SEPATU :");
        int harga = 5000000;
        int harga2 = 6000511;
        int harga3 = 10000000;
        int harga4 = 900000;
        int harga5 = 7500000;
        int harga6 = 790000;
        int harga7 = 8000000;
        int harga8 = 75400000;
        int harga9 = 750000;

        System.out.println("{Adidas}          \tRp" + harga);
        System.out.println("{Nike}              \tRp" + harga2);
        System.out.println("{Skechers}      \tRp" + harga3);
        System.out.println("{Puma}            \tRp" + harga4);
        System.out.println("{Reebok}         \tRp" + harga5);
        System.out.println("{Vans}             \tRp" + harga6);
        System.out.println("{Converse}      \tRp" + harga7);
        System.out.println("{Fila}                \tRp" + harga8);
        System.out.println("{910}                \tRp" + harga9);
        System.out.println("[BELI >= 2 DISKON Rp 50000]");

        System.out.println("\nSilakan Pilih Kategori Sepatu \t:");
        int kategori = Iam.nextInt();
        if (kategori > 2) {
            System.out.println("Mohon Maaf Kategori Tidak Ditemukan,Silakan Pilih Ulang: ");
            int kodeKategori = Iam.nextInt();
        }
            System.out.println("Jenis Sepatu yang Dipilih \t:");
            int jenis = Iam.nextInt();
            if (jenis > 4) {
                System.out.println("Mohon Maaf Jenis Tidak Ditemukan,Silakan Pilih Ulang");
                int kodeJenis = Iam.nextInt();
            }
            System.out.println("Merk Sepatu yang Dipilih \t:");
            int merk = Iam.nextInt();
            if (merk > 8) {
                System.out.println("Mohon Maaf Merk Tidak Ditemukan,Silakan Pilih Ulang");
                int kodeMerk = Iam.nextInt();
            }
            System.out.println("Warna yang dipilih \t:");
            int warna = Iam.nextInt();
            if (warna > 9) {
                System.out.println("Mohon Maaf Warna Tidak Ditemukan,Silakan Pilih Ulang");
                int kodeWarna = Iam.nextInt();
            }
            System.out.println("Silakan Pilih Ukuran Sepatu (25-34) \t:");
            int ukuran = Iam.nextInt();
            if (ukuran > 34) {
                System.out.println("Mohon Maaf Ukuran Tidak Ditemukan,Silakan Pilih Ulang");
                int kodeUkuran = Iam.nextInt();
            }
            System.out.println("Jumlah yang ingin dibeli \t:");
            int jumlah = Iam.nextInt();
            int diskon = jumlah * 50000;

            System.out.println("\n==========NOTA PEMBELIAN==========");
            System.out.println("       -----JAYABARU SHOES-----        ");
            System.out.println("          Jl.Berdua Bersamamu       ");
            System.out.println("            (0231)843555            ");
            Tanggal tgl = new Tanggal();
            System.out.println("\nTANGGAL PEMBELIAN \t: " + tgl.getTanggal());
            System.out.println("WAKTU PEMBELIAN     \t: " + tgl.getWaktu());
            System.out.println("Nama Kasir          \t: " + NamaKasir);

            if (jenis == 1) {
                System.out.println("\nJenis Sepatu: COWOK");
            } else if (jenis == 2) {
                System.out.println("\nJenis Sepatu: CEWEK");
            }
            if (kategori == 1) {
                System.out.println("KATEGORI SEPATU: OLAHRAGA");
            } else if (kategori == 2) {
                System.out.println("KATEGORI SEPATU: LARI");
            } else if (kategori == 3) {
                System.out.println("KATEGORI SEPATU: KANTORAN");
            } else if (kategori == 4) {
                System.out.println("KATEGORI SEPATU: SANTAI");
            }
            if (merk == 1) {
                System.out.println("MERK SEPATU: ADIDAS");
            } else if (merk == 2) {
                System.out.println("MERK SEPATU: NIKE");
            } else if (merk == 3) {
                System.out.println("MERK SEPATU: SKECHERS");
            } else if (merk == 4) {
                System.out.println("MERK SEPATU: PUMA");
            } else if (merk == 5) {
                System.out.println("MERK SEPATU: REEBOK");
            } else if (merk == 6) {
                System.out.println("MERK SEPATU: VANS");
            } else if (merk == 7) {
                System.out.println("MERK SEPATU: CONVERSE");
            } else if (merk == 8) {
                System.out.println("MERK SEPATU: FILA");
            } else if (merk == 9) {
                System.out.println("MERK SEPATU: 910");
            }
            if (warna == 1) {
                System.out.println("WARNA SEPATU: BLACK");
            } else if (warna == 2) {
                System.out.println("WARNA SEPATU: WHITE");
            } else if (warna == 3) {
                System.out.println("WARNA SEPATU: GOLD");
            } else if (warna == 4) {
                System.out.println("WARNA SEPATU: SILVER");
            } else if (warna == 5) {
                System.out.println("WARNA SEPATU: ORANGE");
            } else if (warna == 6) {
                System.out.println("WARNA SEPATU: GREEN");
            } else if (warna == 7) {
                System.out.println("WARNA SEPATU: YELLOW");
            } else if (warna == 8) {
                System.out.println("WARNA SEPATU: BLUE");
            } else if (warna == 9) {
                System.out.println("WARNA SEPATU: RED");
            }

            System.out.println("UKURAN SEPATU : " + ukuran);
            System.out.println("JUMLAH PEMBELIAN : " + jumlah);

            if (merk == 1 && jumlah >= 2) {
                System.out.println("\nHARGA @SEPATU \t: Rp " + harga + " x " + jumlah);
                System.out.println("DISKON SEPATU   \t: Rp " + diskon);
                System.out.println("TOTAL HARGA     \t: Rp " + ((harga * jumlah) - diskon));
                System.out.println("\nPEMBAYARAN    \t: Rp ");
                int pembayaran = Iam.nextInt();
                System.out.println("PENGEMBALIAN    \t: Rp " + (pembayaran - ((harga * jumlah) - diskon)));
            } else if (merk == 2 && jumlah >= 2) {
                System.out.println("\nHARGA @SEPATU \t: Rp " + harga2 + " x " + jumlah);
                System.out.println("DISKON SEPATU   \t: Rp " + diskon);
                System.out.println("TOTAL HARGA     \t: Rp " + ((harga2 * jumlah) - diskon));
                System.out.println("\nPEMBAYARAN    \t: Rp ");
                int pembayaran = Iam.nextInt();
                System.out.println("PENGEMBALIAN    \t: Rp " + (pembayaran - ((harga2 * jumlah) - diskon)));
            } else if (merk == 3 && jumlah >= 2) {
                System.out.println("\nHARGA @SEPATU \t: Rp " + harga3 + " x " + jumlah);
                System.out.println("DISKON SEPATU   \t: Rp " + diskon);
                System.out.println("TOTAL HARGA     \t: Rp " + ((harga3 * jumlah) - diskon));
                System.out.println("\nPEMBAYARAN    \t: Rp ");
                int pembayaran = Iam.nextInt();
                System.out.println("PENGEMBALIAN    \t: Rp " + (pembayaran - ((harga3 * jumlah) - diskon)));
            } else if (merk == 4 && jumlah >= 2) {
                System.out.println("\nHARGA @SEPATU \t: Rp " + harga4 + " x " + jumlah);
                System.out.println("DISKON SEPATU   \t: Rp " + diskon);
                System.out.println("TOTAL HARGA     \t: Rp " + ((harga4 * jumlah) - diskon));
                System.out.println("\nPEMBAYARAN    \t: Rp ");
                int pembayaran = Iam.nextInt();
                System.out.println("PENGEMBALIAN    \t: Rp " + (pembayaran - ((harga4 * jumlah) - diskon)));
            } else if (merk == 5 && jumlah >= 2) {
                System.out.println("\nHARGA @SEPATU \t: Rp " + harga5 + " x " + jumlah);
                System.out.println("DISKON SEPATU   \t: Rp " + diskon);
                System.out.println("TOTAL HARGA     \t: Rp " + ((harga5 * jumlah) - diskon));
                System.out.println("\nPEMBAYARAN    \t: Rp ");
                int pembayaran = Iam.nextInt();
                System.out.println("PENGEMBALIAN    \t: Rp " + (pembayaran - ((harga5 * jumlah) - diskon)));
            } else if (merk == 6 && jumlah >= 2) {
                System.out.println("\nHARGA @SEPATU \t: Rp " + harga6 + " x " + jumlah);
                System.out.println("DISKON SEPATU   \t: Rp " + diskon);
                System.out.println("TOTAL HARGA     \t: Rp " + ((harga6 * jumlah) - diskon));
                System.out.println("\nPEMBAYARAN    \t: Rp ");
                int pembayaran = Iam.nextInt();
                System.out.println("PENGEMBALIAN    \t: Rp " + (pembayaran - ((harga6 * jumlah) - diskon)));
            } else if (merk == 7 && jumlah >= 2) {
                System.out.println("\nHARGA @SEPATU \t: Rp " + harga7 + " x " + jumlah);
                System.out.println("DISKON SEPATU   \t: Rp " + diskon);
                System.out.println("TOTAL HARGA     \t: Rp " + ((harga7 * jumlah) - diskon));
                System.out.println("\nPEMBAYARAN    \t: Rp ");
                int pembayaran = Iam.nextInt();
                System.out.println("PENGEMBALIAN    \t: Rp " + (pembayaran - ((harga7 * jumlah) - diskon)));
            } else if (merk == 8 && jumlah >= 2) {
                System.out.println("\nHARGA @SEPATU \t: Rp " + harga8 + " x " + jumlah);
                System.out.println("DISKON SEPATU   \t: Rp " + diskon);
                System.out.println("TOTAL HARGA     \t: Rp " + ((harga8 * jumlah) - diskon));
                System.out.println("\nPEMBAYARAN    \t: Rp ");
                int pembayaran = Iam.nextInt();
                System.out.println("PENGEMBALIAN    \t: Rp " + (pembayaran - ((harga8 * jumlah) - diskon)));
            } else if (merk == 9 && jumlah >= 2) {
                System.out.println("\nHARGA @SEPATU \t: Rp " + harga9 + " x " + jumlah);
                System.out.println("DISKON SEPATU   \t: Rp " + diskon);
                System.out.println("TOTAL HARGA     \t: Rp " + ((harga9 * jumlah) - diskon));
                System.out.println("\nPEMBAYARAN    \t: Rp ");
                int pembayaran = Iam.nextInt();
                System.out.println("PENGEMBALIAN    \t: Rp " + (pembayaran - ((harga9 * jumlah) - diskon)));

                System.out.println("\n==========Sampai Jumpa Kembali Byeeee=========");

            }

        }
    }



package com.rpl;

import com.rpl.lembaga.Kelas;
import com.rpl.lembaga.Sertifikat;
import com.rpl.dosen.Materi;
import com.rpl.dosen.Tes;
import com.rpl.dosen.Soal;
import com.rpl.mahasiswa.Enrollment;
import com.rpl.mahasiswa.Jawaban;
import com.rpl.mahasiswa.Nilai;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // -----------------------------------------------------------------
        // DATA MASTER (Sudah Terdaftar Otomatis di Sistem)
        // -----------------------------------------------------------------
        // Data Dosen
        User dosen1 = new User(201, "Dr. Kornelius Sulistyo, S.Kom", "Kortyo@univ.ac.id", "dosen321", "dosen");
        User dosen2 = new User(202, "Miss Sarah, M.Pd", "sarah@univ.ac.id", "dosen654", "dosen");

        // Data Pilihan Kelas (Bahasa China & English)
        Kelas kelasRpl = new Kelas(1, "Kelas Bahasa China", dosen1.getIdUser());
        Kelas kelasIelts = new Kelas(2, "English Class", dosen2.getIdUser());

        System.out.println("==================================================");
        System.out.println("   SIMULASI SISTEM MANAGEMENT PEMBELAJARAN (RPL)  ");
        System.out.println("==================================================\n");

        // -----------------------------------------------------------------
        // 1. INPUT IDENTITAS MAHASISWA & REGISTRASI
        // -----------------------------------------------------------------
        System.out.println("--- [1] Registrasi Identitas Mahasiswa ---");
        System.out.print("Masukkan Nama Anda : ");
        String namaMhs = input.nextLine();
        if (namaMhs.trim().isEmpty()) {
            namaMhs = "Delsyad Iza";
        }
        
        System.out.print("Masukkan Email Anda : ");
        String emailMhs = input.nextLine();
        if (emailMhs.trim().isEmpty()) {
            emailMhs = "delsyad@univ.ac.id";
        }
        
        User mhs = new User();
        mhs.setIdUser(101);
        mhs.daftar(namaMhs, emailMhs, "rahasia123", "mahasiswa");
        System.out.println();

        // -----------------------------------------------------------------
        // 2. PILIHAN KELAS (DIPILIH OLEH MAHASISWA)
        // -----------------------------------------------------------------
        System.out.println("--- [2] Pendaftaran Kelas Kuliah ---");
        System.out.println("Daftar Kelas yang Tersedia:");
        System.out.println("1. " + kelasRpl.getNamaKelas() + " (Pengajar ID: " + kelasRpl.getIdPengajar() + ")");
        System.out.println("2. " + kelasIelts.getNamaKelas() + " (Pengajar ID: " + kelasIelts.getIdPengajar() + ")");
        System.out.print("Pilih nomor kelas yang ingin diikuti (1/2): ");
        int pilihan = input.nextInt();
        input.nextLine(); // Membersihkan sisa baris baru/enter

        // Variabel penampung untuk kelas dan dosen terpilih
        Kelas kelasTerpilih = null;
        User dosenTerpilih = null;

        if (pilihan == 1) {
            kelasTerpilih = kelasRpl;
            dosenTerpilih = dosen1;
        } else if (pilihan == 2) {
            kelasTerpilih = kelasIelts;
            dosenTerpilih = dosen2;
        } else {
            System.out.println("[Error] Pilihan tidak valid! Otomatis dialihkan ke Kelas Bahasa China.");
            kelasTerpilih = kelasRpl;
            dosenTerpilih = dosen1;
        }

        System.out.println("\n>> ANDA BERHASIL MEMILIH KELAS BERSAMA DOSEN:");
        System.out.println("   Nama Kelas   : " + kelasTerpilih.getNamaKelas());
        System.out.println("   Nama Pengajar: " + dosenTerpilih.getNamaUser());
        System.out.println("   Email Dosen  : " + dosenTerpilih.getEmail());
        System.out.println("--------------------------------------------------\n");

        kelasTerpilih.mulai_kelas();
        
        System.out.println(">> Aktivitas di Dalam Kelas:");
        kelasTerpilih.lihatmateri();   
        kelasTerpilih.lihatpeserta();  

        // -----------------------------------------------------------------
        // 3. PROSES ENROLLMENT KELAS TERPILIH
        // -----------------------------------------------------------------
        System.out.println("\n--- [3] Proses Pendaftaran Kelas (Enrollment) ---");
        Enrollment enrollBudi = new Enrollment();
        enrollBudi.setIdEnroll(8801);
        enrollBudi.daftar(mhs.getIdUser(), kelasTerpilih.getIdKelas());
        enrollBudi.validasiPendaftaran(); 
        System.out.println();

        // -----------------------------------------------------------------
        // 4. DOSEN MEMBUAT MATERI & TES
        // -----------------------------------------------------------------
        System.out.println("--- [4] Pembuatan Ujian/Tes oleh Dosen Terpilih ---");
        Materi materi1 = new Materi();
        materi1.setIdMateri(501);
        
        Tes uasListening = new Tes();
        uasListening.setIdTest(701);
        
        Soal soal1 = new Soal();
        Soal soal2 = new Soal();

        // Kondisi materi kuis dinamis berdasarkan kelas yang kamu pilih
        if (kelasTerpilih.getIdKelas() == 1) {
            materi1.tambahMateri("Basic Hanyu Pinyin", "Materi pengenalan nada dan ejaan Bahasa China.", kelasTerpilih.getIdKelas(), dosenTerpilih.getIdUser());
            materi1.lihatMateri();
            System.out.println();

            uasListening.buatTes("UAS Hanyu Listening 101", LocalDate.now(), kelasTerpilih.getIdKelas());

            soal1.setIdSoal(901);
            soal1.tambahSoal("Apa arti dari kata 'Ni Hao' (你好)?", "A. Terima Kasih | B. Halo", "B", uasListening.getIdTest());

            soal2.setIdSoal(902);
            soal2.tambahSoal("Bagaimana cara membaca angka 1 dalam pinyin?", "A. Yi | B. Er", "A", uasListening.getIdTest());
        } else {
            materi1.tambahMateri("Basic English Grammar", "Materi pembelajaran Tenses dasar.", kelasTerpilih.getIdKelas(), dosenTerpilih.getIdUser());
            materi1.lihatMateri();
            System.out.println();

            uasListening.buatTes("UAS English Listening 101", LocalDate.now(), kelasTerpilih.getIdKelas());

            soal1.setIdSoal(901);
            soal1.tambahSoal("Which one is a verb?", "A. Run | B. Beautiful", "A", uasListening.getIdTest());

            soal2.setIdSoal(902);
            soal2.tambahSoal("What is the past tense of 'Go'?", "A. Gone | B. Went", "B", uasListening.getIdTest());
        }

        uasListening.mulaiTes();
        System.out.println();

        // -----------------------------------------------------------------
        // 5. MAHASISWA MENGERJAKAN TES
        // -----------------------------------------------------------------
        System.out.println("--- [5] Mahasiswa Mengerjakan Ujian ---");
        System.out.println("Soal 1: " + soal1.getPertanyaan());
        System.out.print("Jawaban Anda (A/B): ");
        String jawab1 = input.nextLine().toUpperCase();

        // Di sini kata "Jawaban" sudah bersih dan normal kembali
        Jawaban jwb1 = new Jawaban();
        jwb1.setIdJawaban(11);
        jwb1.setIdUser(mhs.getIdUser());
        jwb1.setIdSoal(soal1.getIdSoal());
        jwb1.simpanJawaban(jawab1);
        jwb1.periksaJawaban(soal1);

        System.out.println("\nSoal 2: " + soal2.getPertanyaan());
        System.out.print("Jawaban Anda (A/B): ");
        String jawab2 = input.nextLine().toUpperCase();

        Jawaban jwb2 = new Jawaban();
        jwb2.setIdJawaban(12);
        jwb2.setIdUser(mhs.getIdUser());
        jwb2.setIdSoal(soal2.getIdSoal());
        jwb2.simpanJawaban(jawab2);
        jwb2.periksaJawaban(soal2);

        uasListening.tutupTes();
        System.out.println();

        // -----------------------------------------------------------------
        // 6. PENILAIAN HASIL UJIAN
        // -----------------------------------------------------------------
        System.out.println("--- [6] Perhitungan Nilai Ujian ---");
        List<Jawaban> listJawabanBudi = new ArrayList<>();
        listJawabanBudi.add(jwb1);
        listJawabanBudi.add(jwb2);

        Nilai nilaiUasBudi = new Nilai(401, mhs.getIdUser(), uasListening.getIdTest());
        nilaiUasBudi.hitungNilai(listJawabanBudi);
        nilaiUasBudi.lihatNilai();
        System.out.println();

        // -----------------------------------------------------------------
        // 7. PENERBITAN SERTIFIKAT
        // -----------------------------------------------------------------
        System.out.println("--- [7] Rekapitulasi & Kelulusan (Sertifikat) ---");
        enrollBudi.selesaikan();

        List<Nilai> seluruhNilaiBudi = new ArrayList<>();
        seluruhNilaiBudi.add(nilaiUasBudi);

        Sertifikat sertifikatBudi = new Sertifikat(9901, mhs.getIdUser(), kelasTerpilih.getIdKelas());
        sertifikatBudi.hitungNilai(seluruhNilaiBudi);
        sertifikatBudi.lihatNilai();
        System.out.println();

        // -----------------------------------------------------------------
        // 8. LOGOUT LOG
        // -----------------------------------------------------------------
        System.out.println("--- [8] Akhir Sesi ---");
        mhs.logout();
        System.out.println("\n==================================================");
        System.out.println("            SIMULASI SELESAI DIJALANKAN           ");
        System.out.println("==================================================");
        
        input.close();
    }
}
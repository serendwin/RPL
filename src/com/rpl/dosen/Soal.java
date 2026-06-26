package com.rpl.dosen;

public class Soal extends Dosen 
{
    private int idSoal;
    private String pertanyaan;
    private String pilihan;
    private String jawabanBenar;
    private int idTes;

    public Soal(int id_user,
                String namaUser,
                String email,
                String password,
                int idSoal,
                String pertanyaan,
                String pilihan,
                String jawabanBenar,
                int idTes) {

        super(id_user, namaUser, email, password);

        this.idSoal = idSoal;
        this.pertanyaan = pertanyaan;
        this.pilihan = pilihan;
        this.jawabanBenar = jawabanBenar;
        this.idTes = idTes;
    }

    public void tambahSoal() {
        System.out.println("===========================================================");
        System.out.println("                  SOAL BERHASIL DITAMBAH");
        System.out.println("===========================================================");
        System.out.println("ID Soal      : " + idSoal);
        System.out.println("Pertanyaan   : " + pertanyaan);
        System.out.println("ID Tes       : " + idTes);
        System.out.println("===========================================================");
        System.out.println();
    }

    public void editSoal() {
        System.out.println("===========================================================");
        System.out.println("                   SOAL BERHASIL DIEDIT");
        System.out.println("===========================================================");
        System.out.println("ID Soal      : " + idSoal);
        System.out.println("Pertanyaan   : " + pertanyaan);
        System.out.println("ID Tes       : " + idTes);
        System.out.println("Status       : Data soal diperbarui");
        System.out.println("===========================================================");
        System.out.println();
    }

    public void hapusSoal() {
        System.out.println("===========================================================");
        System.out.println("                  SOAL BERHASIL DIHAPUS");
        System.out.println("===========================================================");
        System.out.println("ID Soal      : " + idSoal);
        System.out.println("Pertanyaan   : " + pertanyaan);
        System.out.println("ID Tes       : " + idTes);
        System.out.println("Status       : Soal telah dihapus");
        System.out.println("===========================================================");
        System.out.println();
    }

    public void eksekusiUjian(java.util.Scanner input) 
    {
        System.out.println("===========================================================");
        System.out.println("                    MULAI UJIAN MAHASISWA                  ");
        System.out.println("===========================================================");
        System.out.println("ID Tes       : " + this.idTes);
        System.out.println("ID Soal      : " + this.idSoal);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Pertanyaan: " + this.pertanyaan);
        System.out.println();
        String[] daftarPilihan = this.pilihan.split(",");
        for (String opsi : daftarPilihan) 
        {
            System.out.println("   " + opsi.trim());
        }    
        System.out.println("-----------------------------------------------------------");
        System.out.print("Masukkan Jawaban Anda (A/B/C/D): ");
        String jawabanUser = input.next();    
        System.out.println("===========================================================");
        if (jawabanUser.equalsIgnoreCase(this.jawabanBenar)) {
            System.out.println("Hasil: JAWABAN ANDA BENAR");
            System.out.println("Nilai: 100");
        } else {
            System.out.println("Hasil: JAWABAN ANDA SALAH");
            System.out.println("Jawaban yang benar adalah: " + this.jawabanBenar);
            System.out.println("Nilai: 0");
        }
        System.out.println("===========================================================");
        System.out.println();
    }    
}
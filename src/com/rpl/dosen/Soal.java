package com.rpl.dosen;

public class Soal extends Dosen 
{
    private int idSoal;
    private String pertanyaan;
    private String pilihan;
    private String jawabanBenar;
    private String namaKelas;
    private int namaPengajar;

    public Soal(int id_user,
                String namaUser,
                String email,
                String password,
                int idSoal,
                String pertanyaan,
                String pilihan,
                String jawabanBenar,
                String namaKelas,
                int namaPengajar) 
    {

        super(id_user, namaUser, email, password);

        this.idSoal = idSoal;
        this.pertanyaan = pertanyaan;
        this.pilihan = pilihan;
        this.jawabanBenar = jawabanBenar;
        this.namaKelas = namaKelas;
        this.namaPengajar = namaPengajar;
    }

    public void tambahSoal() 
    {
        System.out.println("===========================================================");
        System.out.println("                  SOAL BERHASIL DITAMBAH");
        System.out.println("===========================================================");
        System.out.println("ID Soal      : " + idSoal);
        System.out.println("Kelas        : " + namaKelas);
        System.out.println("Pengajar     : " + namaPengajar);
        System.out.println("===========================================================");
        System.out.println();
    }

    public void editSoal() {
        System.out.println("===========================================================");
        System.out.println("                   SOAL BERHASIL DIEDIT");
        System.out.println("===========================================================");
        System.out.println("ID Soal      : " + idSoal);
        System.out.println("Kelas        : " + namaKelas);
        System.out.println("Pengajar     : " + namaPengajar);
        System.out.println("Status       : Data soal diperbarui");
        System.out.println("===========================================================");
        System.out.println();
    }

    public void hapusSoal() {
        System.out.println("===========================================================");
        System.out.println("                  SOAL BERHASIL DIHAPUS");
        System.out.println("===========================================================");
        System.out.println("ID Soal      : " + idSoal);
        System.out.println("Kelas        : " + namaKelas);
        System.out.println("Pengajar     : " + namaPengajar);
        System.out.println("Status       : Soal telah dihapus");
        System.out.println("===========================================================");
        System.out.println();
    }

    public void eksekusiUjian(java.util.Scanner input) 
    {
        System.out.println("===========================================================");
        System.out.println("                    MULAI MENGERJAKAN SOAL                 ");
        System.out.println("===========================================================");
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
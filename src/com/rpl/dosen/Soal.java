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

    // Getter
    public int getIdSoal() {
        return idSoal;
    }

    public String getPertanyaan() {
        return pertanyaan;
    }

    public String getPilihan() {
        return pilihan;
    }

    public String getJawabanBenar() {
        return jawabanBenar;
    }

    public int getIdTes() {
        return idTes;
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
}
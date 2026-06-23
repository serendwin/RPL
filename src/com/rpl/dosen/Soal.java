package com.rpl.dosen;

public class Soal {

    private int idSoal;
    private String pertanyaan;
    private String pilihan;
    private String jawabanBenar;
    private int idTes;

    public Soal(int idSoal,
                String pertanyaan,
                String pilihan,
                String jawabanBenar,
                int idTes) {

        this.idSoal = idSoal;
        this.pertanyaan = pertanyaan;
        this.pilihan = pilihan;
        this.jawabanBenar = jawabanBenar;
        this.idTes = idTes;
    }

    public void tambahSoal() {}
    public void editSoal() {}
    public void hapusSoal() {}
}
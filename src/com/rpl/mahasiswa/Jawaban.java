package com.rpl.mahasiswa;

import java.time.LocalDateTime;

public class Jawaban {

    private int idJawaban;
    private int idUser;
    private int idSoal;
    private String jawaban;
    private boolean statusBenar;
    private LocalDateTime waktuJawab;

    public Jawaban(int idJawaban,
                   int idUser,
                   int idSoal,
                   String jawaban) {

        this.idJawaban = idJawaban;
        this.idUser = idUser;
        this.idSoal = idSoal;
        this.jawaban = jawaban;
        this.waktuJawab = LocalDateTime.now();
    }

    // Getter
    public int getIdJawaban() {
        return idJawaban;
    }

    public int getIdUser() {
        return idUser;
    }

    public int getIdSoal() {
        return idSoal;
    }

    public String getJawaban() {
        return jawaban;
    }

    public boolean isStatusBenar() {
        return statusBenar;
    }

    public LocalDateTime getWaktuJawab() {
        return waktuJawab;
    }

    // Setter
    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }

    public void setStatusBenar(boolean statusBenar) {
        this.statusBenar = statusBenar;
    }

    // Method simpan jawaban
    public void simpanJawaban() {
        System.out.println("Jawaban berhasil disimpan.");
    }

    // Method cek jawaban
    public void periksaJawaban(String kunci) {
        statusBenar = jawaban.equalsIgnoreCase(kunci);
    }
}
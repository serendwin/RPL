package com.rpl.mahasiswa;

import java.time.LocalDateTime;
import com.rpl.dosen.Soal;

public class Jawaban {
    private int idJawaban;
    private int idUser;
    private int idSoal;
    private String jawaban;
    private boolean statusBenar;
    private LocalDateTime waktuJawab;

    public Jawaban() {
    }

    public Jawaban(int idJawaban, int idUser, int idSoal, String jawaban) {
        this.idJawaban = idJawaban;
        this.idUser = idUser;
        this.idSoal = idSoal;
        this.jawaban = jawaban;
    }

    // ===== Getter & Setter =====
    public int getIdJawaban() {
        return idJawaban;
    }

    public void setIdJawaban(int idJawaban) {
        this.idJawaban = idJawaban;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdSoal() {
        return idSoal;
    }

    public void setIdSoal(int idSoal) {
        this.idSoal = idSoal;
    }

    public String getJawaban() {
        return jawaban;
    }

    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }

    public boolean isStatusBenar() {
        return statusBenar;
    }

    public LocalDateTime getWaktuJawab() {
        return waktuJawab;
    }

    // ===== Method sesuai UML =====
    public void simpanJawaban(String jawaban) {
        this.jawaban = jawaban;
        this.waktuJawab = LocalDateTime.now();
        System.out.println("[Jawaban] Jawaban user id=" + idUser + " untuk soal id=" + idSoal + " disimpan");
    }

    public boolean periksaJawaban(Soal soal) {
        this.statusBenar = soal != null && jawaban != null
                && jawaban.equalsIgnoreCase(soal.getJawabanBenar());
        System.out.println("[Jawaban] Soal id=" + idSoal + " -> " + (statusBenar ? "BENAR" : "SALAH"));
        return statusBenar;
    }

    @Override
    public String toString() {
        return "Jawaban{id=" + idJawaban + ", benar=" + statusBenar + "}";
    }
}

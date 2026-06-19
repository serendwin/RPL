package com.rpl.mahasiswa;

import java.util.List;

public class Nilai {
    private int idNilai;
    private int idUser;
    private int idTest;
    private double skor;

    public Nilai() {
    }

    public Nilai(int idNilai, int idUser, int idTest) {
        this.idNilai = idNilai;
        this.idUser = idUser;
        this.idTest = idTest;
    }

    // ===== Getter & Setter =====
    public int getIdNilai() {
        return idNilai;
    }

    public void setIdNilai(int idNilai) {
        this.idNilai = idNilai;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdTest() {
        return idTest;
    }

    public void setIdTest(int idTest) {
        this.idTest = idTest;
    }

    public double getSkor() {
        return skor;
    }

    // ===== Method sesuai UML =====
    public double hitungNilai(List<Jawaban> daftarJawaban) {
        if (daftarJawaban == null || daftarJawaban.isEmpty()) {
            this.skor = 0;
            return skor;
        }
        long jumlahBenar = daftarJawaban.stream().filter(Jawaban::isStatusBenar).count();
        this.skor = (jumlahBenar * 100.0) / daftarJawaban.size();
        System.out.println("[Nilai] Skor untuk user id=" + idUser + " pada tes id=" + idTest + " = " + skor);
        return skor;
    }

    public void lihatNilai() {
        System.out.println("[Nilai] User id=" + idUser + " | Tes id=" + idTest + " | Skor=" + skor);
    }

    @Override
    public String toString() {
        return "Nilai{idUser=" + idUser + ", skor=" + skor + "}";
    }
}

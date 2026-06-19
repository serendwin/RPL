package com.rpl.dosen;

import java.time.LocalDate;

public class Tes {
    private int idTest;
    private String namaTest;
    private LocalDate tanggal;
    private int idKelas;
    private boolean dibuka;

    public Tes() {
    }

    public Tes(int idTest, String namaTest, LocalDate tanggal, int idKelas) {
        this.idTest = idTest;
        this.namaTest = namaTest;
        this.tanggal = tanggal;
        this.idKelas = idKelas;
        this.dibuka = false;
    }

    // ===== Getter & Setter =====
    public int getIdTest() {
        return idTest;
    }

    public void setIdTest(int idTest) {
        this.idTest = idTest;
    }

    public String getNamaTest() {
        return namaTest;
    }

    public void setNamaTest(String namaTest) {
        this.namaTest = namaTest;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public int getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(int idKelas) {
        this.idKelas = idKelas;
    }

    public boolean isDibuka() {
        return dibuka;
    }

    // ===== Method sesuai UML =====
    public void buatTes(String namaTest, LocalDate tanggal, int idKelas) {
        this.namaTest = namaTest;
        this.tanggal = tanggal;
        this.idKelas = idKelas;
        System.out.println("[Tes] Tes '" + namaTest + "' dibuat untuk kelas id=" + idKelas);
    }

    public void mulaiTes() {
        this.dibuka = true;
        System.out.println("[Tes] Tes '" + namaTest + "' dimulai");
    }

    public void tutupTes() {
        this.dibuka = false;
        System.out.println("[Tes] Tes '" + namaTest + "' ditutup");
    }

    @Override
    public String toString() {
        return "Tes{id=" + idTest + ", nama='" + namaTest + "'}";
    }
}

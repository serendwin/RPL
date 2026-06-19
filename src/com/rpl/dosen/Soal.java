package com.rpl.dosen;

public class Soal {
    private int idSoal;
    private String pertanyaan;
    private String pilihan; 
    private String jawabanBenar;
    private int idTest;

    public Soal() {
    }

    public Soal(int idSoal, String pertanyaan, String pilihan, String jawabanBenar, int idTest) {
        this.idSoal = idSoal;
        this.pertanyaan = pertanyaan;
        this.pilihan = pilihan;
        this.jawabanBenar = jawabanBenar;
        this.idTest = idTest;
    }

    // ===== Getter & Setter =====
    public int getIdSoal() {
        return idSoal;
    }

    public void setIdSoal(int idSoal) {
        this.idSoal = idSoal;
    }

    public String getPertanyaan() {
        return pertanyaan;
    }

    public void setPertanyaan(String pertanyaan) {
        this.pertanyaan = pertanyaan;
    }

    public String getPilihan() {
        return pilihan;
    }

    public void setPilihan(String pilihan) {
        this.pilihan = pilihan;
    }

    public String getJawabanBenar() {
        return jawabanBenar;
    }

    public void setJawabanBenar(String jawabanBenar) {
        this.jawabanBenar = jawabanBenar;
    }

    public int getIdTest() {
        return idTest;
    }

    public void setIdTest(int idTest) {
        this.idTest = idTest;
    }

    // ===== Method sesuai UML =====
    public void tambahSoal(String pertanyaan, String pilihan, String jawabanBenar, int idTest) {
        this.pertanyaan = pertanyaan;
        this.pilihan = pilihan;
        this.jawabanBenar = jawabanBenar;
        this.idTest = idTest;
        System.out.println("[Soal] Soal baru ditambahkan ke tes id=" + idTest);
    }

    public void editSoal(String pertanyaanBaru, String pilihanBaru, String jawabanBenarBaru) {
        this.pertanyaan = pertanyaanBaru;
        this.pilihan = pilihanBaru;
        this.jawabanBenar = jawabanBenarBaru;
        System.out.println("[Soal] Soal id=" + idSoal + " diperbarui");
    }

    public void hapusSoal() {
        System.out.println("[Soal] Soal id=" + idSoal + " dihapus");
    }

    @Override
    public String toString() {
        return "Soal{id=" + idSoal + ", pertanyaan='" + pertanyaan + "'}";
    }
}

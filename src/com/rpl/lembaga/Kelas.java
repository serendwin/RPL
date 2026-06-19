package com.rpl.lembaga;

public class Kelas {
    private int idKelas;
    private String namaKelas;
    private int idPengajar;

    public Kelas() {
    }

    public Kelas(int idKelas, String namaKelas, int idPengajar) {
        this.idKelas = idKelas;
        this.namaKelas = namaKelas;
        this.idPengajar = idPengajar;
    }

    // ===== Getter & Setter =====
    public int getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(int idKelas) {
        this.idKelas = idKelas;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public int getIdPengajar() {
        return idPengajar;
    }

    public void setIdPengajar(int idPengajar) {
        this.idPengajar = idPengajar;
    }

    // ===== Method sesuai UML =====
    public void mulai_kelas() {
        System.out.println("[Kelas] Kelas '" + namaKelas + "' dimulai oleh pengajar id=" + idPengajar);
    }

    public void lihatmateri() {
        System.out.println("[Kelas] Menampilkan daftar materi untuk kelas '" + namaKelas + "'");
    }

    public void lihatpeserta() {
        System.out.println("[Kelas] Menampilkan daftar peserta untuk kelas '" + namaKelas + "'");
    }

    @Override
    public String toString() {
        return "Kelas{id=" + idKelas + ", nama='" + namaKelas + "'}";
    }
}

package com.rpl.dosen;

public class Materi {
    private int idMateri;
    private String judul;
    private String isiMateri;
    private int idKelas;
    private int idPengajar;

    public Materi() {
    }

    public Materi(int idMateri, String judul, String isiMateri, int idKelas, int idPengajar) {
        this.idMateri = idMateri;
        this.judul = judul;
        this.isiMateri = isiMateri;
        this.idKelas = idKelas;
        this.idPengajar = idPengajar;
    }

    // ===== Getter & Setter =====
    public int getIdMateri() {
        return idMateri;
    }

    public void setIdMateri(int idMateri) {
        this.idMateri = idMateri;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getIsiMateri() {
        return isiMateri;
    }

    public void setIsiMateri(String isiMateri) {
        this.isiMateri = isiMateri;
    }

    public int getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(int idKelas) {
        this.idKelas = idKelas;
    }

    public int getIdPengajar() {
        return idPengajar;
    }

    public void setIdPengajar(int idPengajar) {
        this.idPengajar = idPengajar;
    }

    // ===== Method sesuai UML =====
    public void tambahMateri(String judul, String isiMateri, int idKelas, int idPengajar) {
        this.judul = judul;
        this.isiMateri = isiMateri;
        this.idKelas = idKelas;
        this.idPengajar = idPengajar;
        System.out.println("[Materi] Materi '" + judul + "' ditambahkan ke kelas id=" + idKelas);
    }

    public void editMateri(String judulBaru, String isiBaru) {
        this.judul = judulBaru;
        this.isiMateri = isiBaru;
        System.out.println("[Materi] Materi id=" + idMateri + " diperbarui");
    }

    public void hapusMateri() {
        System.out.println("[Materi] Materi '" + judul + "' (id=" + idMateri + ") dihapus");
    }

    public void lihatMateri() {
        System.out.println("=== Materi ===");
        System.out.println("Judul : " + judul);
        System.out.println("Isi   : " + isiMateri);
    }

    @Override
    public String toString() {
        return "Materi{id=" + idMateri + ", judul='" + judul + "'}";
    }
}

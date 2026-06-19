package com.rpl.mahasiswa;

import java.time.LocalDate;

public class Enrollment {
    private int idEnroll;
    private int idUser;
    private int idKelas;
    private LocalDate tanggalDaftar;
    private String status; 

    public Enrollment() {
    }

    public Enrollment(int idEnroll, int idUser, int idKelas, LocalDate tanggalDaftar, String status) {
        this.idEnroll = idEnroll;
        this.idUser = idUser;
        this.idKelas = idKelas;
        this.tanggalDaftar = tanggalDaftar;
        this.status = status;
    }

    // ===== Getter & Setter =====
    public int getIdEnroll() {
        return idEnroll;
    }

    public void setIdEnroll(int idEnroll) {
        this.idEnroll = idEnroll;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(int idKelas) {
        this.idKelas = idKelas;
    }

    public LocalDate getTanggalDaftar() {
        return tanggalDaftar;
    }

    public void setTanggalDaftar(LocalDate tanggalDaftar) {
        this.tanggalDaftar = tanggalDaftar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // ===== Method sesuai UML =====
    public void daftar(int idUser, int idKelas) {
        this.idUser = idUser;
        this.idKelas = idKelas;
        this.tanggalDaftar = LocalDate.now();
        this.status = "pending";
        System.out.println("[Enrollment] User id=" + idUser + " mendaftar ke kelas id=" + idKelas);
    }

    public void selesaikan() {
        this.status = "selesai";
        System.out.println("[Enrollment] Enrollment id=" + idEnroll + " ditandai selesai");
    }

    public boolean validasiPendaftaran() {
        boolean valid = idUser > 0 && idKelas > 0 && tanggalDaftar != null;
        this.status = valid ? "diterima" : "ditolak";
        System.out.println("[Enrollment] Validasi pendaftaran id=" + idEnroll + " -> " + status);
        return valid;
    }

    @Override
    public String toString() {
        return "Enrollment{id=" + idEnroll + ", status='" + status + "'}";
    }
}

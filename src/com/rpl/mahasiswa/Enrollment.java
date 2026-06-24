package com.rpl.mahasiswa;

public class Enrollment {

    private int idEnrollment;
    private int idUser;
    private int idKelas;

    public Enrollment(int idEnrollment, int idUser, int idKelas) {
        this.idEnrollment = idEnrollment;
        this.idUser = idUser;
        this.idKelas = idKelas;
    }

    public int getIdEnrollment() {
        return idEnrollment;
    }

    public int getIdUser() {
        return idUser;
    }

    public int getIdKelas() {
        return idKelas;
    }

    // Setter
    public void setIdEnrollment(int idEnrollment) {
        this.idEnrollment = idEnrollment;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setIdKelas(int idKelas) {
        this.idKelas = idKelas;
    }

    public void daftar() {
        System.out.println("Mahasiswa dengan ID " + idUser +
                           " berhasil mendaftar ke kelas " + idKelas);
    }
}
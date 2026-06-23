package com.rpl.dosen;

public class Tes {

    private int idTes;
    private String namaTes;
    private String tanggal;
    private int idKelas;

    public Tes(int idTes,
               String namaTes,
               String tanggal,
               int idKelas) {

        this.idTes = idTes;
        this.namaTes = namaTes;
        this.tanggal = tanggal;
        this.idKelas = idKelas;
    }

    public void buatTes() {
        System.out.println("Tes dibuat");
    }

    public void mulaiTes() {
        System.out.println("Tes dimulai");
    }

    public void tutupTes() {
        System.out.println("Tes ditutup");
    }
}
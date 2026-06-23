package com.rpl.dosen;

public class Materi {

    private int idMateri;
    private String judul;
    private String isiMateri;
    private int idKelas;
    private int idPengajar;

    public Materi(int idMateri,
                  String judul,
                  String isiMateri,
                  int idKelas,
                  int idPengajar) {

        this.idMateri = idMateri;
        this.judul = judul;
        this.isiMateri = isiMateri;
        this.idKelas = idKelas;
        this.idPengajar = idPengajar;
    }

    public void tambahMateri() {
        System.out.println("Materi ditambah");
    }

    public void editMateri() {
        System.out.println("Materi diedit");
    }

    public void hapusMateri() {
        System.out.println("Materi dihapus");
    }

    public void lihatMateri() {
        System.out.println(judul);
        System.out.println(isiMateri);
    }
}
package com.rpl.lembaga;

public class Kelas {

    private int idKelas;
    private String namaKelas;
    private int idPengajar;

    public Kelas(int idKelas,
                 String namaKelas,
                 int idPengajar) {

        this.idKelas = idKelas;
        this.namaKelas = namaKelas;
        this.idPengajar = idPengajar;
    }

    public void mulaiKelas() {}
    public void lihatMateri() {}
    public void lihatPeserta() {}
}
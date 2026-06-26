package com.rpl.lembaga;

public class Kelas {

    private int idKelas;
    private String namaKelas;
    private int idPengajar;
    private String tanggalkelas;
    private String waktukelas;;

    public Kelas(int idKelas,
                 String namaKelas,
                 int idPengajar,
                 String tanggalkelas,
                 String waktukelas) 
    {

        this.idKelas = idKelas;
        this.namaKelas = namaKelas;
        this.idPengajar = idPengajar;
        this.tanggalkelas = tanggalkelas;
        this.waktukelas = waktukelas;
    }


        public String getNamaKelas() {
        return namaKelas;
    }

    public void mulaiKelas() 
    {
        System.out.println("===========================================================");
        System.out.println("                  KELAS TELAH DIMULAI");
        System.out.println("===========================================================");
        System.out.println("ID Kelas     : " + idKelas);
        System.out.println("Nama Kelas   : " + namaKelas);
        System.out.println("ID Pengajar  : " + idPengajar);
        System.out.println("Status       : Sedang Berlangsung");
        System.out.println("===========================================================");
        System.out.println();
    }

    public void jadwalkelas() {
        System.out.println("===========================================================");
        System.out.println("                    JADWAL KELAS");
        System.out.println("===========================================================");
        System.out.println("ID Kelas     : " + idKelas);
        System.out.println("Nama Kelas   : " + namaKelas);
        System.out.println("Tanggal      : " + tanggalkelas);
        System.out.println("Waktu        : " + waktukelas);
        System.out.println("===========================================================");
        System.out.println();
    }

    public void lihatPeserta() {
        System.out.println("===========================================================");
        System.out.println("                   DAFTAR PESERTA");
        System.out.println("===========================================================");
        System.out.println("ID Kelas     : " + idKelas);
        System.out.println("Nama Kelas   : " + namaKelas);
        System.out.println("Status       : Menampilkan data peserta");
        System.out.println("===========================================================");
        System.out.println();
    }
}
package com.rpl.pengajar;

public class Tes extends Pengajar {

    private int idTes;
    private String namaTes;
    private String tanggal;
    private int idKelas;

    
    public Tes(int id_user,
               String namaUser,
               String email,
               String password,
               int idTes,
               String namaTes,
               String tanggal,
               int idKelas) {

        super(id_user, namaUser, email, password);

        this.idTes = idTes;
        this.namaTes = namaTes;
        this.tanggal = tanggal;
        this.idKelas = idKelas;
    }

    public void buatTes() {
        System.out.println("===========================================================");
        System.out.println("                   TES BERHASIL DIBUAT");
        System.out.println("===========================================================");
        System.out.println("ID Tes       : " + idTes);
        System.out.println("Nama Tes     : " + namaTes);
        System.out.println("Tanggal      : " + tanggal);
        System.out.println("ID Kelas     : " + idKelas);
        System.out.println("===========================================================");
        System.out.println();
    }

    public void mulaiTes() {
        System.out.println("===========================================================");
        System.out.println("                    TES TELAH DIMULAI");
        System.out.println("===========================================================");
        System.out.println("ID Tes       : " + idTes);
        System.out.println("Nama Tes     : " + namaTes);
        System.out.println("Tanggal      : " + tanggal);
        System.out.println("Status       : Open Book");
        System.out.println("===========================================================");
        System.out.println();
    }

    public void tutupTes() {
        System.out.println("===========================================================");
        System.out.println("                    TES TELAH DITUTUP");
        System.out.println("===========================================================");
        System.out.println("ID Tes       : " + idTes);
        System.out.println("Nama Tes     : " + namaTes);
        System.out.println("Tanggal      : " + tanggal);
        System.out.println("Status       : Selesai");
        System.out.println("===========================================================");
        System.out.println();
    }
}
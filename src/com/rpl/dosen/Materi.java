package com.rpl.dosen;

public class Materi extends Dosen 
{

    private int idMateri;
    private String judul;
    private String isiMateri;
    private int idKelas;
    private int idPengajar;

    public Materi(int id_user,
                  String namaUser,
                  String email,
                  String password,
                  int idMateri,
                  String judul,
                  String isiMateri,
                  int idKelas,
                  int idPengajar) 
    {

        super(id_user, namaUser, email, password);

        this.idMateri = idMateri;
        this.judul = judul;
        this.isiMateri = isiMateri;
        this.idKelas = idKelas;
        this.idPengajar = idPengajar;
    }

    public void tambahMateri() 
    {
        System.out.println("===========================================================");
        System.out.println("                 MATERI BERHASIL DITAMBAH");
        System.out.println("===========================================================");
        System.out.println("Judul Materi : " + judul);
        System.out.println("ID Materi    : " + idMateri);
        System.out.println("===========================================================");
        System.out.println();
    }

    public void editMateri() 
    {
        System.out.println("===========================================================");
        System.out.println("                 MATERI BERHASIL DIEDIT");
        System.out.println("===========================================================");
        System.out.println("Judul Materi : " + judul);
        System.out.println("ID Materi    : " + idMateri);
        System.out.println("Status       : Data materi telah diperbarui");
        System.out.println("===========================================================");
        System.out.println();
    }

    public void hapusMateri() 
    {
        System.out.println("===========================================================");
        System.out.println("                 MATERI BERHASIL DIHAPUS");
        System.out.println("===========================================================");
        System.out.println("Judul Materi : " + judul);
        System.out.println("ID Materi    : " + idMateri);
        System.out.println("Status       : Materi telah dihapus");
        System.out.println("===========================================================");
        System.out.println();
    }

    public void lihatMateri() {
        System.out.println("===========================================================");
        System.out.println("                    DETAIL MATERI");
        System.out.println("===========================================================");
        System.out.println("Judul      : " + judul);
        System.out.println("Isi Materi : " + isiMateri);
        System.out.println("===========================================================");
    }
}
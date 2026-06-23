package com.rpl.dosen;

import com.rpl.User;

public class Dosen extends User {

    public Dosen(int idUser, String namaUser,
                 String email, String password) {

        super(idUser,namaUser,email,password,"Dosen");
    }

    public void unggahMateri() {
        System.out.println("Materi berhasil diunggah");
    }

    public void buatSoal() {
        System.out.println("Soal berhasil dibuat");
    }

    public void nilaiTes() {
        System.out.println("Menilai tes");
    }

    public void mulaiKelas() {
        System.out.println("Kelas dimulai");
    }
}
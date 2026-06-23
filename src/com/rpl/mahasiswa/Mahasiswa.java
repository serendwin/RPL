package com.rpl.mahasiswa;

import com.rpl.User;

public class Mahasiswa extends User {

    public Mahasiswa(int idUser, String namaUser,
                     String email, String password) {

        super(idUser,namaUser,email,password,"Mahasiswa");
    }

    public void daftarKelas() {
        System.out.println("Mahasiswa mendaftar kelas");
    }

    public void ikutiKelas() {
        System.out.println("Mengikuti kelas");
    }

    public void kerjakanTes() {
        System.out.println("Mengerjakan tes");
    }

    public void lihatNilai() {
        System.out.println("Melihat nilai");
    }
}
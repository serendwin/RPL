package com.rpl.pengajar;

import com.rpl.User;

public class Pengajar extends User 
{
    public Pengajar(int id_user, String namaUser,
                 String email, String password) 
    {

        super(id_user,namaUser,email,password,"Dosen");
    }

    
    public void unggahMateri() 
    {
        System.out.println("Materi berhasil diunggah");
    }

    public void buatSoal() 
    {
        System.out.println("Soal berhasil dibuat");
    }

    public void nilaiTes() 
    {
        System.out.println("Menilai tes");
    }

    public void mulaiKelas() 
    {
        System.out.println("Kelas dimulai");
    }
}
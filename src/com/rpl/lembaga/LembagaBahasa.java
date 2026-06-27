package com.rpl.lembaga;

import com.rpl.User;

public class LembagaBahasa extends User {

    public LembagaBahasa(int idUser, String namaUser,
                         String email, String password) {

        super(idUser,namaUser,email,password,"Admin");
    }

    public void validasiDaftar() 
    {
        System.out.println("Pendaftaran tervalidasi");
    }

    public void kelolaJadwal() {
        System.out.println("Jadwal sudah dikelola");
    }

    public void kelolaKurikulum()
    {
        System.out.println("Mengelola kurikulum");
    }

    public void terbitSertifikat() {
        System.out.println("Sertifikat diterbitkan");
    }
}
package com.rpl.mahasiswa;

public class Nilai {

    private int idNilai;
    private int idUser;
    private int idTes;
    private float skor;

    public Nilai(int idNilai,
                 int idUser,
                 int idTes,
                 float skor) {

        this.idNilai = idNilai;
        this.idUser = idUser;
        this.idTes = idTes;
        this.skor = skor;
    }

    public float hitungNilai() {
        return skor;
    }
}
package com.rpl.mahasiswa;

import java.time.LocalDateTime;

public class Jawaban {

    private int idJawaban;
    private int idUser;
    private int idSoal;
    private String jawaban;
    private boolean statusBenar;
    private LocalDateTime waktuJawab;

    public Jawaban(int idJawaban,
                   int idUser,
                   int idSoal,
                   String jawaban) {

        this.idJawaban = idJawaban;
        this.idUser = idUser;
        this.idSoal = idSoal;
        this.jawaban = jawaban;
        this.waktuJawab = LocalDateTime.now();
    }

    public void simpanJawaban() {}

    public void periksaJawaban(String kunci) {
        statusBenar = jawaban.equalsIgnoreCase(kunci);
    }
}
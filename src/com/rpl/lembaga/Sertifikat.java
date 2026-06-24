package com.rpl.lembaga;

import com.rpl.mahasiswa.Nilai;
import java.time.LocalDateTime;
import java.util.List;

public class Sertifikat {

    private int idSertifikat;
    private int idUser;
    private int idKelas;
    private double nilaiAkhir;
    private LocalDateTime tanggalTerbit;
    private String statusValidasi;

    public Sertifikat() {
        this.statusValidasi = "Belum Tervalidasi";
    }

    public Sertifikat(int idSertifikat, int idUser, int idKelas) {
        this.idSertifikat = idSertifikat;
        this.idUser = idUser;
        this.idKelas = idKelas;
        this.statusValidasi = "Belum Tervalidasi";
    }

    // ================= GETTER =================

    public int getIdSertifikat() {
        return idSertifikat;
    }

    public int getIdUser() {
        return idUser;
    }

    public int getIdKelas() {
        return idKelas;
    }

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }

    public LocalDateTime getTanggalTerbit() {
        return tanggalTerbit;
    }

    public String getStatusValidasi() {
        return statusValidasi;
    }

    // ================= SETTER =================

    public void setIdSertifikat(int idSertifikat) {
        this.idSertifikat = idSertifikat;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setIdKelas(int idKelas) {
        this.idKelas = idKelas;
    }

    // ================= METHOD UML =================

    public double hitungNilai(List<Nilai> daftarNilai) {

        if (daftarNilai == null || daftarNilai.isEmpty()) {
            nilaiAkhir = 0;
            statusValidasi = "Tidak Lulus";
            return nilaiAkhir;
        }

        double total = 0;

        for (Nilai nilai : daftarNilai) 
        {
            total += nilai.getSkor();
        }

        nilaiAkhir = total / daftarNilai.size();

        if (nilaiAkhir >= 70) {
            statusValidasi = "Valid";
            tanggalTerbit = LocalDateTime.now();
        } else {
            statusValidasi = "Tidak Lulus";
        }

        return nilaiAkhir;
    }

    public void lihatNilai() {
        System.out.println("=================================");
        System.out.println("         SERTIFIKAT");
        System.out.println("=================================");
        System.out.println("ID Sertifikat   : " + idSertifikat);
        System.out.println("ID User         : " + idUser);
        System.out.println("ID Kelas        : " + idKelas);
        System.out.printf("Nilai Akhir     : %.2f%n", nilaiAkhir);
        System.out.println("Tanggal Terbit  : " + tanggalTerbit);
        System.out.println("Status Validasi : " + statusValidasi);
        System.out.println("=================================");
    }

    @Override
    public String toString() {
        return "Sertifikat{" +
                "idSertifikat=" + idSertifikat +
                ", idUser=" + idUser +
                ", idKelas=" + idKelas +
                ", nilaiAkhir=" + nilaiAkhir +
                ", statusValidasi='" + statusValidasi + '\'' +
                '}';
    }
}
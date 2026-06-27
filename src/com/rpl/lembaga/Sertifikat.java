package com.rpl.lembaga;

import com.rpl.mahasiswa.Nilai;
import java.time.LocalDateTime;
import java.util.List;

public class Sertifikat {

    private int idSertifikat;
    private int idUser;
    private String namaUser;
    private String namakelas;
    private double nilaiAkhir;
    private LocalDateTime tanggalTerbit;
    private String statusValidasi;

    public Sertifikat() {
        this.statusValidasi = "Belum Tervalidasi";
    }

    public Sertifikat(int idSertifikat, int idUser, String namaUser, String namakelas) {
        this.idSertifikat = idSertifikat;
        this.idUser = idUser;
        this.namaUser = namaUser;
        this.namakelas = namakelas;
        this.statusValidasi = "Belum Tervalidasi";
    }

    // ================= GETTER =================

    public int getIdSertifikat() {
        return idSertifikat;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getNamaKelas() {
        return namakelas;
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

    public void setINamaKelas(String namakelas) {
        this.namakelas = namakelas;
    }

    // ================= METHOD UML =================

    public double hitungNilai(List<Nilai> daftarNilai) {

        if (daftarNilai == null || daftarNilai.isEmpty()) {
            nilaiAkhir = 0;
            statusValidasi = "TIDAK LULUS";
            return nilaiAkhir;
        }

        double total = 0;

        for (Nilai nilai : daftarNilai) 
        {
            total += nilai.getSkor();
        }

        nilaiAkhir = total / daftarNilai.size();

        if (nilaiAkhir >= 70) {
            statusValidasi = "LULUS";
            tanggalTerbit = LocalDateTime.now();
        } else {
            statusValidasi = "TIDAK LULUS";
        }

        return nilaiAkhir;
    }

    public void lihatNilai() {
        System.out.println("=================================");
        System.out.println("         SERTIFIKAT");
        System.out.println("=================================");
        System.out.println("ID Sertifikat   : " + idSertifikat);
        System.out.println("ID User         : " + idUser);
        System.out.println("Nama User       : " + namaUser);
        System.out.println("Nama Kelas      : " + namakelas);
        System.out.printf("Nilai Akhir     : %.2f%n", nilaiAkhir);
        System.out.println("Tanggal Terbit  : " + tanggalTerbit);
        System.out.println("Keterangan      : " + statusValidasi);
        System.out.println("=================================");
        System.out.println();
    }

    @Override
    public String toString() {
        return "Sertifikat{" +
                "idSertifikat=" + idSertifikat +
                ", idUser=" + idUser +
                ", idUser=" + namaUser +                
                ", namakelas=" + namakelas +
                ", nilaiAkhir=" + nilaiAkhir +
                ", statusValidasi='" + statusValidasi + '\'' +
                '}';
    }
}
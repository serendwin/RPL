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
    private String statusValidasi; // contoh: "belum tervalidasi", "valid", "tidak lulus"

    public Sertifikat() {
    }

    public Sertifikat(int idSertifikat, int idUser, int idKelas) {
        this.idSertifikat = idSertifikat;
        this.idUser = idUser;
        this.idKelas = idKelas;
        this.statusValidasi = "belum tervalidasi";
    }

    // ===== Getter & Setter =====
    public int getIdSertifikat() {
        return idSertifikat;
    }

    public void setIdSertifikat(int idSertifikat) {
        this.idSertifikat = idSertifikat;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(int idKelas) {
        this.idKelas = idKelas;
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

    // ===== Method sesuai UML =====
    public double hitungNilai(List<Nilai> daftarNilai) {
        if (daftarNilai == null || daftarNilai.isEmpty()) {
            this.nilaiAkhir = 0;
            this.statusValidasi = "tidak lulus";
            return nilaiAkhir;
        }
        double total = 0;
        for (Nilai n : daftarNilai) {
            total += n.getSkor();
        }
        this.nilaiAkhir = total / daftarNilai.size();
        this.tanggalTerbit = LocalDateTime.now();
        this.statusValidasi = (nilaiAkhir >= 70) ? "valid" : "tidak lulus";
        System.out.println("[Sertifikat] Nilai akhir user id=" + idUser + " = " + nilaiAkhir
                + " (" + statusValidasi + ")");
        return nilaiAkhir;
    }

    public void lihatNilai() {
        System.out.println("=== Sertifikat ===");
        System.out.println("ID Sertifikat   : " + idSertifikat);
        System.out.println("User            : " + idUser);
        System.out.println("Kelas           : " + idKelas);
        System.out.println("Nilai Akhir     : " + nilaiAkhir);
        System.out.println("Tanggal Terbit  : " + tanggalTerbit);
        System.out.println("Status Validasi : " + statusValidasi);
    }

    @Override
    public String toString() {
        return "Sertifikat{id=" + idSertifikat + ", nilaiAkhir=" + nilaiAkhir + ", status='" + statusValidasi + "'}";
    }
}

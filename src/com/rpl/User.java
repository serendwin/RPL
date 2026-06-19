package com.rpl;

public class User {
    private int idUser;
    private String namaUser;
    private String email;
    private String password;
    private String role; // contoh: "mahasiswa", "dosen", "lembaga"

    public User() {
    }

    public User(int idUser, String namaUser, String email, String password, String role) {
        this.idUser = idUser;
        this.namaUser = namaUser;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    // ===== Getter & Setter =====
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNamaUser() {
        return namaUser;
    }

    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // ===== Method sesuai UML =====
    public boolean daftar(String namaUser, String email, String password, String role) {
        this.namaUser = namaUser;
        this.email = email;
        this.password = password;
        this.role = role;
        System.out.println("[User] " + namaUser + " berhasil mendaftar sebagai " + role);
        return true;
    }

    public boolean login(String email, String password) {
        boolean valid = this.email != null && this.email.equals(email)
                && this.password != null && this.password.equals(password);
        System.out.println("[User] Login " + (valid ? "berhasil" : "gagal") + " untuk " + email);
        return valid;
    }

    public void logout() {
        System.out.println("[User] " + namaUser + " telah logout");
    }

    public void lihatprofil() {
        System.out.println("=== Profil User ===");
        System.out.println("ID    : " + idUser);
        System.out.println("Nama  : " + namaUser);
        System.out.println("Email : " + email);
        System.out.println("Role  : " + role);
    }

    @Override
    public String toString() {
        return "User{id=" + idUser + ", nama='" + namaUser + "', role='" + role + "'}";
    }
}

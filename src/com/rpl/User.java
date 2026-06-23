package com.rpl;

public class User {

    protected int idUser;
    protected String namaUser;
    protected String email;
    protected String password;
    protected String role;

    public User(int idUser, String namaUser, String email,
                String password, String role) {

        this.idUser = idUser;
        this.namaUser = namaUser;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public void daftar() {
        System.out.println(namaUser + " berhasil daftar");
    }

    public void login() {
        System.out.println(namaUser + " login");
    }

    public void logout() {
        System.out.println(namaUser + " logout");
    }

    public void lihatProfil() {
        System.out.println("Nama : " + namaUser);
        System.out.println("Email : " + email);
        System.out.println("Role : " + role);
    }
}
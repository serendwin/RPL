package com.rpl;

public class User {

    protected int id_user;
    protected String nama_user;
    protected String email;
    protected String password;
    protected String role;

    public User(int idUser, String namaUser, String email,
                String password, String role) {

        this.id_user = idUser;
        this.nama_user = namaUser;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public void daftar() 
    {
        System.out.println("daftar user");
    }

    public void registrasiberhasil() 
    {
        System.out.println("Registrasi berhasil!");
    }
    
    public void registrasiinvalid() 
    {
        System.out.println("Registrasi gagal silahkan periksa kembali data yang dimasukkan.");
    }

    public void loginberhasil()
    {
        System.out.println("Login berhasil!");
    }

    public void logininvalid(){
        System.out.println("Login gagal: Email atau password salah.");
    }
    
    public void loginakun() 
    {
        System.out.println("===========================================================");
        System.out.println("                 LOGIN ");
        System.out.println("===========================================================");
        System.out.println("Masukan nama anda        : " + nama_user);
        System.out.println("Masukan email anda       : " + email);
        System.out.println("Masukan password anda    : " + password);
        System.out.println("===========================================================");
        System.out.println();
    }

    public void logout() 
    {
        System.out.println("===========================================================");
        System.out.println("                 LOGOUT");
        System.out.println("===========================================================");
        System.out.println("Sampai jumpa, " + nama_user);
        System.out.println("Terima kasih telah menggunakan sistem les bahasa.");
        System.out.println("===========================================================");
        System.out.println();
    }

    public void lihatProfil() {
        System.out.println("===========================================================");
        System.out.println("                  PROFIL PENGGUNA");
        System.out.println("===========================================================");
        System.out.println("ID User : " + id_user);
        System.out.println("Nama    : " + nama_user);
        System.out.println("Email   : " + email);
        System.out.println("Role    : " + role);
        System.out.println("===========================================================");
        System.out.println();
    }
}
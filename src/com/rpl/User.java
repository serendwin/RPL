package com.rpl;

import java.util.Scanner;

public class User {

    protected int id_user;
    protected String nama_user;
    protected String email;
    protected String password;
    protected String role;
    
    protected Scanner input = new Scanner(System.in);

    public User(int idUser, String namaUser, String email,
                String password, String role) 
    {

        this.id_user = idUser;
        this.nama_user = namaUser;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public void daftar() 
    {
        System.out.println("===========================================================");
        System.out.println("                         DAFTAR ");
        System.out.println("===========================================================");
        System.out.print("Masukan nama anda        : ");
        nama_user = input.nextLine();        
        System.out.print("Masukan email anda       : ");
        email = input.nextLine();
        System.out.print("Masukan password anda    : ");
        password = input.nextLine();  
        System.out.println("===========================================================");
        System.out.println();
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

    public void logininvalid()
    {
        System.out.println("Login gagal: Email atau password salah.");
    }
    
    public void loginakun() 
    {
        System.out.println("===========================================================");
        System.out.println("                         LOGIN ");
        System.out.println("===========================================================");
        System.out.print("Masukan email anda       : ");
        email = input.nextLine();
        System.out.print("Masukan password anda    : ");
        password = input.nextLine();  
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
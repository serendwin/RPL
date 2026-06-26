package com.rpl;

import com.rpl.User;
import com.rpl.lembaga.Kelas;
import com.rpl.lembaga.Sertifikat;
import com.rpl.dosen.Materi;
import com.rpl.dosen.Tes;
import com.rpl.dosen.Soal;
import com.rpl.mahasiswa.Enrollment;
import com.rpl.mahasiswa.Jawaban;
import com.rpl.mahasiswa.Nilai;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args) 
    {

        User Mahasiswa = new User(
                1,
                "Joko",
                "kijokogawlbodo@gmail.ac.id",
                "66666",
                "Mahasiswa"
        );

        User Pengajar1 = new User(
                101,
                "Mark Lee",
                "marklee@gmail.ac.id",
                "020809",
                "Pengajar"
        );   
        
        User Pengajar2 = new User(
                102,
                "Jisung Park",
                "jisungpark@gmail.ac.id",
                "050202",
                "Pengajar"
        );        

        User Pengajar3 = new User(
                103,
                "Yeji Hwang",
                "yejihwang@gmail.ac.id",
                "050202",
                "Pengajar"
        );        

        User Lembagabahasa = new User(
                10,
                "Ajeng Febriah",
                "febriahajasie@gmail.ac.id",
                "808080",
                "Staff Lembaga Bahasa"
        );        

        Materi materibinggris1 = new Materi(
                101,                            
                "Mark Lee",               
                "marklee@gmail.ac.id",
                "020809",                       
                20,                              
                "Bahasa Inggris", 
                "Materi membahas konsep OOP seperti Class, Object, Inheritance, Polymorphism, Encapsulation, dan Abstraction.",
                10,                             
                101                          
        );

        Materi materibinggris2 = new Materi(
                101,                            
                "Mark Lee",               
                "marklee@gmail.ac.id",
                "020809",                       
                21,                              
                "Bahasa Inggris", 
                "Materi membahas konsep OOP seperti Class, Object, Inheritance, Polymorphism, Encapsulation, dan Abstraction.",
                11,                             
                101                          
        );

        Materi materibjerman1 = new Materi(
                102,                            
                "Jisung Park",               
                "jisungpark@gmail.ac.id",
                "050202",                       
                20,                              
                "Bahasa Jerman", 
                "Materi membahas konsep OOP seperti Class, Object, Inheritance, Polymorphism, Encapsulation, dan Abstraction.",
                20,                             
                102                          
        );

        Materi materibjerman2 = new Materi(
                102,                            
                "Jisung Park",               
                "jisungpark@gmail.ac.id",
                "050202",                       
                21,                              
                "Bahasa Jerman", 
                "Materi membahas konsep OOP seperti Class, Object, Inheritance, Polymorphism, Encapsulation, dan Abstraction.",
                21,                             
                102                          
        );

        Materi materibchina1 = new Materi(
                103,                            
                "Yeji Hwang",               
                "yejihwang@gmail.ac.id",
                "050203",                       
                30,                              
                "Bahasa Cina", 
                "Materi membahas konsep OOP seperti Class, Object, Inheritance, Polymorphism, Encapsulation, dan Abstraction.",
                30,                             
                103                          
        );

        Materi materibchina2 = new Materi(
                103,                            
                "Yeji Hwang",               
                "yejihwang@gmail.ac.id",
                "050203",                       
                31,                              
                "Bahasa Cina", 
                "Materi membahas konsep OOP seperti Class, Object, Inheritance, Polymorphism, Encapsulation, dan Abstraction.",
                31,                             
                103                          
        );

        Soal soalbinggris1 = new Soal(
                1,                                    
                "Joko",                        
                "kijokogawlbodo@gmail.ac.id",                    
                "66666",                             
                11,                                     
                "Apa kepanjangan dari OOP?",       
                "A. Object Oriented Programming\n" +
                "B. Open Object Program\n" +
                "C. Object Operating Process\n" +
                "D. Operator Oriented Program",         
                "A",                      
                10                               
        );

        Soal soalbinggris2 = new Soal(
                1,                                    
                "Joko",                        
                "kijokogawlbodo@gmail.ac.id",                    
                "66666",                             
                12,                                     
                "Apa kepanjangan dari OOP?",       
                "A. Object Oriented Programming\n" +
                "B. Open Object Program\n" +
                "C. Object Operating Process\n" +
                "D. Operator Oriented Program",         
                "A",                      
                11                               
        );

        Soal soalbjerman1 = new Soal(
                1,                                    
                "Joko",                        
                "kijokogawlbodo@gmail.ac.id",                    
                "66666",                             
                21,                                     
                "Apa kepanjangan dari OOP?",       
                "A. Object Oriented Programming\n" +
                "B. Open Object Program\n" +
                "C. Object Operating Process\n" +
                "D. Operator Oriented Program",         
                "A",                      
                20                               
        );

        Soal soalbjerman2 = new Soal(
                1,                                    
                "Joko",                        
                "kijokogawlbodo@gmail.ac.id",                    
                "66666",                             
                22,                                     
                "Apa kepanjangan dari OOP?",       
                "A. Object Oriented Programming\n" +
                "B. Open Object Program\n" +
                "C. Object Operating Process\n" +
                "D. Operator Oriented Program",         
                "A",                      
                21                             
        );        

        Soal soalbchina1 = new Soal(
                1,                                    
                "Joko",                        
                "kijokogawlbodo@gmail.ac.id",                    
                "66666",                             
                31,                                     
                "Apa kepanjangan dari OOP?",       
                "A. Object Oriented Programming\n" +
                "B. Open Object Program\n" +
                "C. Object Operating Process\n" +
                "D. Operator Oriented Program",         
                "A",                      
                30                               
        );

        Soal soalbchina2 = new Soal(
                1,                                    
                "Joko",                        
                "kijokogawlbodo@gmail.ac.id",                    
                "66666",                             
                32,                                     
                "Apa kepanjangan dari OOP?",       
                "A. Object Oriented Programming\n" +
                "B. Open Object Program\n" +
                "C. Object Operating Process\n" +
                "D. Operator Oriented Program",         
                "A",                      
                31                              
        );

        Tes tesbinggris1 = new Tes(
                1,                                    
                "Joko",                        
                "kijokogawlbodo@gmail.ac.id",                    
                "66666",                 
                10,                          
                "Ujian Java OOP",         
                "26-06-2026",             
                10                        
        );

        Tes tesbinggris2 = new Tes(
                1,                                    
                "Joko",                        
                "kijokogawlbodo@gmail.ac.id",                    
                "66666",                 
                11,                          
                "Ujian Java OOP",         
                "26-06-2026",             
                11                        
        );        

        Tes tesbjerman1 = new Tes(
                1,                                    
                "Joko",                        
                "kijokogawlbodo@gmail.ac.id",                    
                "66666",                 
                20,                          
                "Ujian Java OOP",         
                "26-06-2026",             
                20                        
        );

        Tes tesbjerman2 = new Tes(
                1,                                    
                "Joko",                        
                "kijokogawlbodo@gmail.ac.id",                    
                "66666",                 
                21,                          
                "Ujian Java OOP",         
                "26-06-2026",             
                21                        
        );        
        
        Tes tesbchina1 = new Tes(
                1,                                    
                "Joko",                        
                "kijokogawlbodo@gmail.ac.id",                    
                "66666",                 
                30,                          
                "Ujian Java OOP",         
                "26-06-2026",             
                30                        
        );

        Tes tesbchina2 = new Tes(
                1,                                    
                "Joko",                        
                "kijokogawlbodo@gmail.ac.id",                    
                "66666",                 
                31,                          
                "Ujian Java OOP",         
                "26-06-2026",             
                31                        
        );        

        Kelas kelasbinggris1 = new Kelas(
                10,
                "Pemrograman Berorientasi Objek",
                101
        );
        
        Kelas kelasbinggris2 = new Kelas(
                11,
                "Pemrograman Berorientasi Objek",
                101
        );

        Kelas kelasbjerman1 = new Kelas(
                20,
                "Pemrograman Berorientasi Objek",
                102
        );
        Kelas kelasbjerman2 = new Kelas(
                21,
                "Pemrograman Berorientasi Objek",
                103
        );
        Kelas kelasbchina1 = new Kelas(
                30,
                "Pemrograman Berorientasi Objek",
                103
        );
        Kelas kelasbchina2 = new Kelas(
                31,
                "Pemrograman Berorientasi Objek",
                103
        );

        Sertifikat sertifikatbinggris1 = new Sertifikat(
                15,      
                1,    
                10    
        );        

        Sertifikat sertifikatbinggris2 = new Sertifikat(
                16,      
                1,    
                11    
        );        

        Sertifikat sertifikatbjerman1 = new Sertifikat(
                25,      
                1,    
                20    
        );        

        Sertifikat sertifikatbjerman2 = new Sertifikat(
                26,      
                1,    
                21    
        );        

        Sertifikat sertifikatbchina1 = new Sertifikat(
                35,      
                1,    
                30    
        );        

        Sertifikat sertifikatbchina2 = new Sertifikat(
                36,      
                1,    
                31    
        );

        Enrollment enrollmentBInggris1 = new Enrollment(
                1,
                1,
                10
        );

        Enrollment enrollmentBInggris2 = new Enrollment(
                2,
                202,
                11
        );

        Enrollment enrollmentBJerman1 = new Enrollment(
                3,
                203,
                20
        );

        Enrollment enrollmentBJerman2 = new Enrollment(
                4,
                204,
                21
        );

        Enrollment enrollmentBChina1 = new Enrollment(
                5,
                205,
                30
        );

        Enrollment enrollmentBChina2 = new Enrollment(
                6,
                206,
                31
        );
        Scanner input = new Scanner(System.in);

        System.out.println("______________________________________________________________________");
        System.out.println("=====           Selamat Datang Di Sistem Aku Cinta Bahasa           ====");
        System.out.println("=====             Lembaga Bahasa Universitas Pancasila             ====");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Login Sebagai:");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("1. Mahasiswa");
        System.out.println("2. Pengajar");
        System.out.println("3. Lembaga Bahasa");
        System.out.println("4. Keluar");
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Pilih menu : ");
        int menuUtama = input.nextInt();
        System.out.println();

        switch (menuUtama) {

            case 1:
                boolean kembaliAktor = false;

                while (!kembaliAktor) {
                    System.out.println("=================================================================");
                    System.out.println("========================= MENU AKTOR ============================");
                    System.out.println("=================================================================");
                    System.out.println("1. Lihat Biodata");
                    System.out.println("2. Info Event dan Pembelian Tiket");
                    System.out.println("3. Kembali ke Menu Utama");
                    System.out.println("-----------------------------------------------------------------");
                    System.out.print("Pilih Menu : ");

                    int menuAktor = input.nextInt();
                    System.out.println();

                    switch (menuAktor) {
                        case 1:
                            System.out.println("Menampilkan Biodata...");
                            break;

                        case 2:
                            System.out.println("Menampilkan Event dan Tiket...");
                            break;

                        case 3:
                            kembaliAktor = true;
                            break;

                        default:
                            System.out.println("Menu tidak tersedia!");
                    }
                }
                break;

            case 2:
                System.out.println("Login sebagai Pengajar");
                break;

            case 3:
                System.out.println("Login sebagai Lembaga Bahasa");
                break;

            case 4:
                System.out.println("Terima kasih telah menggunakan sistem.");
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }


        input.close();


    }
}
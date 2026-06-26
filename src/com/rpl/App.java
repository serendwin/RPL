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
import com.rpl.mahasiswa.Mahasiswa;

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
                        "Yesterday, my sister ______ to the library to borrow some novels.", // Pertanyaan b.inggris      
                        "A. goes\n" +
                        "B. went\n" +
                        "C. gone\n" +
                        "D. going",        
                        "B",                      
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

        Kelas kelasbinggris = new Kelas(
                10,
                "Pemrograman Berorientasi Objek",
                101,
                "26-06-2026",
                "08:00 - 10:00"
        );
        
        Kelas kelasbjerman = new Kelas(
                20,
                "Pemrograman Berorientasi Objek",
                102,
                "26-06-2026",
                "10:00 - 12:00"
        );

        Kelas kelasbchina = new Kelas(
                30,
                "Pemrograman Berorientasi Objek",
                103,
                "26-06-2026",
                "14:00 - 16:00"
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

        Enrollment enrollmentbinggris = new Enrollment(
                41,
                1,
                10
        );

        Enrollment enrollmentbjerman = new Enrollment(
                51,
                1,
                20
        );

        Enrollment enrollmentbchina = new Enrollment(
                61,
                1,
                30
        );

        Jawaban jawabanbinggris1 = new Jawaban(
                71,
                1,
                11,
                "A"
        );

        Jawaban jawabanbinggris2 = new Jawaban(
                72,
                1,
                12,
                "B"
        );

        Jawaban jawabanbjerman1 = new Jawaban(
                81,
                1,
                21,
                "C"
        );

        Jawaban jawabanbjerman2 = new Jawaban(
                82,
                1,
                22,
                "D"
        );


        Jawaban jawabanbchina1 = new Jawaban(
                91,
                1,
                31,
                "A"
        );

        Jawaban jawabanbchina2 = new Jawaban(
                92,
                1,
                32,
                "B"
        );

        Nilai nilaibinggris1 = new Nilai(
                51,
                1,
                10,
                85
        );

        Nilai nilaibinggris2 = new Nilai(
                52,
                1,
                11,
                90
        );

        Nilai nilaibjerman1 = new Nilai(
                61,
                1,
                20,
                80
        );


        Nilai nilaibjerman2 = new Nilai(
                62,
                1,
                21,
                75
        );

        Nilai nilaibchina1 = new Nilai(
                71,
                1,
                30,
                95
        );

        Nilai nilaibchina2 = new Nilai(
                72,
                1,
                31,
                88
        );

        Mahasiswa mhs = new Mahasiswa(1, "Joko", "kijokogawlbodo@gmail.ac.id", "66666");

        Scanner input = new Scanner(System.in);

        System.out.println("______________________________________________________________________");
        System.out.println("=====           Selamat Datang Di Sistem Aku Cinta Bahasa           ====");
        System.out.println("=====             Lembaga Bahasa Universitas Pancasila             ====");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Choose your role:");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("1. Mahasiswa");
        System.out.println("2. Pengajar");
        System.out.println("3. Lembaga Bahasa");
        System.out.println("4. Keluar");
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Pilih menu : ");
        int menuUtama = input.nextInt();
        System.out.println();
        switch (menuUtama) 
        {
            case 1:
                boolean kembalimahasiswa = false;
                while (!kembalimahasiswa) 
                {
                    System.out.println("=================================================================");
                    System.out.println("========================== MAHASISWA ============================");
                    System.out.println("=================================================================");
                    System.out.println("1. Registrasi Akun");
                    System.out.println("2. Login Akun");
                    System.out.println("-----------------------------------------------------------------");
                    System.out.print("Pilih Menu : ");
                    int menumahasiswa = input.nextInt();
                    System.out.println();
                    switch (menumahasiswa) 
                    {
                        case 1:
                                Mahasiswa.daftar();
                                Mahasiswa.registrasiberhasil();
                                break;

                        case 2:
                                boolean loginSukses = false;
                                while (!loginSukses)
                                {
                                        Mahasiswa.loginakun();
                                        Mahasiswa.loginberhasil();
                                        System.out.println("=================================================================");
                                        System.out.println("========================== MAHASISWA ============================");
                                        System.out.println("=================================================================");
                                        System.out.println("1. Daftar Kelas");
                                        System.out.println("2. Kelas Saya");
                                        System.out.println("3. Logout");
                                        System.out.println("-----------------------------------------------------------------");
                                        System.out.print("Pilih Menu : ");
                                        int menumahasiswakelas = input.nextInt();
                                        System.out.println();
                                        switch (menumahasiswakelas) 
                                        {        
                                        case 1:
                                                boolean kembalidaftarkelas = false;
                                                while (!kembalidaftarkelas)
                                                {
                                                        System.out.println("=================================================================");
                                                        System.out.println("=========================  DAFTAR KELAS  ========================");
                                                        System.out.println("=================================================================");
                                                        System.out.println("1. Kelas Bahasa Inggris");
                                                        System.out.println("2. Kelas Bahasa Jerman");
                                                        System.out.println("3. Kelas Bahasa Cina");
                                                        System.out.println("4. Kembali");                            
                                                        System.out.println("-----------------------------------------------------------------");                                
                                                        System.out.print("Pilih Kelas : ");
                                                        int menudaftarkelas = input.nextInt();
                                                        System.out.println();
                                                        switch (menudaftarkelas) 
                                                        {
                                                        case 1:
                                                                mhs.daftarKelas();
                                                                kembalidaftarkelas = true;
                                                                break;
                                                        case 2:
                                                                mhs.daftarKelas();
                                                                kembalidaftarkelas = true;
                                                                break;
                                                        case 3:
                                                                mhs.daftarKelas();
                                                                kembalidaftarkelas = true;
                                                                break;

                                                        case 4:
                                                                loginSukses = true;
                                                                break;
                                                        }
                                                }
                                                break;

                                        case 2:
                                                System.out.println("=================================================================");
                                                System.out.println("========================== KELAS SAYA ===========================");
                                                System.out.println("=================================================================");
                                                System.out.println("Informasi Kelas Yang Diikuti");
                                                System.out.println("-----------------------------------------------------------------");
                                                System.out.println("1. Kelas Bahasa Inggris");
                                                System.out.println("2. Kelas Bahasa Jerman");
                                                System.out.println("3. Kelas Bahasa China");
                                                System.out.println("4. Kembali");
                                                System.out.println("-----------------------------------------------------------------");
                                                System.out.print("Pilih Menu : ");
                                                int menumahasiswakelasdetail = input.nextInt();
                                                System.out.println();
                                                switch (menumahasiswakelasdetail) 
                                                {
                                                case 1:
                                                        System.out.println("=================================================================");
                                                        System.out.println("========================== KELAS SAYA ===========================");
                                                        System.out.println("=================================================================");
                                                        System.out.println("Selamat datang di Kelas Bahasa Inggris");
                                                        System.out.println("-----------------------------------------------------------------");
                                                        System.out.println("1. Lihat Jadwal Kelas");
                                                        System.out.println("2. Materi Pembelajaran");
                                                        System.out.println("3. Soal");
                                                        System.out.println("4. Test");
                                                        System.out.println("5. Sertifikat");                                                        
                                                        System.out.println("6. Kembali");                                                                                                                
                                                        System.out.println("-----------------------------------------------------------------");
                                                        System.out.print("Pilih Menu : ");
                                                        int menukelasbingg = input.nextInt();
                                                        System.out.println();
                                                        switch (menukelasbingg)   
                                                        {
                                                                case 1:
                                                                        kelasbinggris.jadwalkelas();
                                                                        break;
                                                                case 2:
                                                                        materibinggris1.lihatMateri();
                                                                        materibinggris2.lihatMateri();
                                                                        break;
                                                                case 3:
                                                                        soalbinggris1.lihatSoal();
                                                                        soalbinggris2.lihatSoal();
                                                                        break;


                                                        }                                                     
                                                        break;

                                                case 2:
                                                        tesbinggris1.ikutiTes();
                                                        tesbinggris2.ikutiTes();
                                                        tesbjerman1.ikutiTes();
                                                        tesbjerman2.ikutiTes();
                                                        tesbchina1.ikutiTes();
                                                        tesbchina2.ikutiTes();
                                                        break;

                                                case 3:
                                                        nilaibinggris1.lihatNilai();
                                                        nilaibinggris2.lihatNilai();
                                                        nilaibjerman1.lihatNilai();
                                                        nilaibjerman2.lihatNilai();
                                                        nilaibchina1.lihatNilai();
                                                        nilaibchina2.lihatNilai();
                                                }
                                        }   
                                }

                                break;
                    }
                }
        }

        input.close();


    }
}
package com.rpl;

import com.rpl.User;
import com.rpl.lembaga.Kelas;
import com.rpl.lembaga.Sertifikat;
import com.rpl.mahasiswa.Enrollment;
import com.rpl.mahasiswa.Jawaban;
import com.rpl.mahasiswa.Nilai;
import com.rpl.pengajar.Materi;
import com.rpl.pengajar.Soal;
import com.rpl.pengajar.Tes;
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
                "English Class",                    
                10                                               
                );

        Soal soalbinggris2 = new Soal(
                1,                                    
                "Joko",                        
                "kijokogawlbodo@gmail.ac.id",                    
                "66666",                             
                12,                                     
                "The classroom was very ______ because all the students were studying quietly.", // Pertanyaan baru     
                "A. noisy\n" +
                "B. crowded\n" +
                "C. peaceful\n" +
                "D. messy",         
                "C",
                "English Class",                                  
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
                "Jerman Class",                      
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
                "Jerman Class",                      
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
                "China Class",                     
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
                "China Class",                  
                31                              
        );

        Tes tesbinggris = new Tes(
                1,                                    
                "Joko",                        
                "kijokogawlbodo@gmail.ac.id",                    
                "66666",                 
                10,                          
                "Ujian Java OOP",         
                "26-06-2026",             
                10                        
        );

        Tes tesbjerman = new Tes(
                1,                                    
                "Joko",                        
                "kijokogawlbodo@gmail.ac.id",                    
                "66666",                 
                20,                          
                "Ujian Java OOP",         
                "26-06-2026",             
                20                        
        );

        Tes tesbchina = new Tes(
                1,                                    
                "Joko",                        
                "kijokogawlbodo@gmail.ac.id",                    
                "66666",                 
                30,                          
                "Ujian Java OOP",         
                "26-06-2026",             
                30                        
        );

        Kelas kelasbinggris = new Kelas(
                10,
                "English Class",
                101,
                "26-06-2026",
                "08:00 - 10:00"
        );
        
        Kelas kelasbjerman = new Kelas(
                20,
                "Germany Class",
                102,
                "26-06-2026",
                "10:00 - 12:00"
        );

        Kelas kelasbchina = new Kelas(
                30,
                "Chinese Class",
                103,
                "26-06-2026",
                "14:00 - 16:00"
        );

        Sertifikat sertifikatbinggris = new Sertifikat(
                15,      
                1,    
                "Joko",
                "English Class" 
        );        

        Sertifikat sertifikatbjerman = new Sertifikat(
              15,      
                1,    
                "Joko",
                "Germany Class" 
        );             

        Sertifikat sertifikatbchina = new Sertifikat(
              15,      
                1,    
                "Joko",
                "Chiness Class" 
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
                "B"
        );

        Jawaban jawabanbinggris2 = new Jawaban(
                72,
                1,
                12,
                "C"
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

        Nilai nilaibinggris = new Nilai(
                51,
                1,
                10,
                85
        );

        Nilai nilaibjerman = new Nilai(
                61,
                1,
                20,
                80
        );

        Nilai nilaibchina = new Nilai(
                71,
                1,
                30,
                95
        );

        Mahasiswa mhs = new Mahasiswa(1, "Joko", "kijokogawlbodo@gmail.ac.id", "66666");

        Scanner input = new Scanner(System.in);
    
        ArrayList<User> listAkun = new ArrayList<>();
        listAkun.add(Mahasiswa);
        listAkun.add(Pengajar1);
        listAkun.add(Pengajar2);
        listAkun.add(Pengajar3);

        boolean menuutama = false;
        while (!menuutama) 
        {
                System.out.println("______________________________________________________________________");
                System.out.println("=====          Selamat Datang Di Sistem Aku Cinta Bahasa          ====");
                System.out.println("=====            Lembaga Bahasa Universitas Pancasila             ====");
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
                User userlogin = null;                
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
                                                        int idotomatis = listAkun.size() + 1;
                                                        User akunbaru = new User(idotomatis, "", "", "", "Mahasiswa");
                                                        if (akunbaru.daftar()) 
                                                        {
                                                                listAkun.add(akunbaru); 
                                                                userlogin = akunbaru;
                                                                Mahasiswa.registrasiberhasil();
                                                                System.out.println("");                                                                
                                                        }
                                                        break;
                                                case 2:
                                                        userlogin = Mahasiswa.loginakun(listAkun);
                                                        if (userlogin != null)
                                                        {
                                                                userlogin.loginberhasil();
                                                                System.out.println("");
                                                                boolean loginSukses = false;
                                                                while (!loginSukses)
                                                                {
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
                                                                                                                System.out.println("");
                                                                                                                kembalidaftarkelas = true;
                                                                                                                break;
                                                                                                        case 2:
                                                                                                                mhs.daftarKelas();
                                                                                                                System.out.println("");
                                                                                                                kembalidaftarkelas = true;
                                                                                                                break;
                                                                                                        case 3:
                                                                                                                mhs.daftarKelas();
                                                                                                                System.out.println("");
                                                                                                                kembalidaftarkelas = true;
                                                                                                                break;
                                                                                                        case 4:
                                                                                                                loginSukses = true;
                                                                                                                break;
                                                                                                        default: 
                                                                                                                System.out.println("Pilihan tidak valid!");
                                                                                                                System.out.println();                                                                                                                                                                                
                                                                                                }
                                                                                        }
                                                                                        break;
                                                                                case 2:
                                                                                        boolean kembalikelas = false;
                                                                                        while (!kembalikelas)
                                                                                        {
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
                                                                                                                boolean englishclass = false;
                                                                                                                while (!englishclass)
                                                                                                                {
                                                                                                                        System.out.println("=================================================================");
                                                                                                                        System.out.println("========================= ENGLISH CLASS =========================");
                                                                                                                        System.out.println("=================================================================");
                                                                                                                        System.out.println("Selamat datang di Kelas Bahasa Inggris");
                                                                                                                        System.out.println("-----------------------------------------------------------------");
                                                                                                                        System.out.println("1. Lihat Jadwal Kelas");
                                                                                                                        System.out.println("2. Materi Pembelajaran");
                                                                                                                        System.out.println("3. Test");
                                                                                                                        System.out.println("4. Sertifikat");
                                                                                                                        System.out.println("5. Kembali");                                                        
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
                                                                                                                                        System.out.println("=================================================================");
                                                                                                                                        System.out.println("=========================  DAFTAR KELAS  ========================");
                                                                                                                                        System.out.println("=================================================================");
                                                                                                                                        System.out.println("1. Pertemuan 1");
                                                                                                                                        System.out.println("2. Pertemuan 2");
                                                                                                                                        System.out.println("3. Kembali");
                                                                                                                                        System.out.println("-----------------------------------------------------------------");
                                                                                                                                        System.out.print("Pilih Materi : ");
                                                                                                                                        int menumateribingg = input.nextInt();
                                                                                                                                        System.out.println();
                                                                                                                                        switch (menumateribingg) 
                                                                                                                                        {
                                                                                                                                                case 1:
                                                                                                                                                        materibinggris1.lihatMateri();
                                                                                                                                                        break;
                                                                                                                                                case 2:
                                                                                                                                                        materibinggris2.lihatMateri();
                                                                                                                                                        break;
                                                                                                                                                case 3:
                                                                                                                                                        break;
                                                                                                                                                default: 
                                                                                                                                                        System.out.println("Pilihan tidak valid!");
                                                                                                                                                        System.out.println();                                                                                                                         
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                case 3:
                                                                                                                                        tesbinggris.mulaiTes();
                                                                                                                                        System.out.println("");
                                                                                                                                        Soal[] daftarUjian = {soalbinggris1, soalbinggris2};    
                                                                                                                                        Jawaban[] daftarJawaban = {jawabanbinggris1, jawabanbinggris2};    
                                                                                                                                        int totalNilai = 0;
                                                                                                                                        System.out.println("===========================================================");
                                                                                                                                        System.out.println("                MULAI UJIAN BAHASA INGGRIS                 ");
                                                                                                                                        System.out.println("===========================================================");
                                                                                                                                        System.out.println("Nama Kelas: " + kelasbinggris.getNamaKelas());
                                                                                                                                        System.out.println("Nama Pengajar: " + Pengajar1.getNamaUser());
                                                                                                                                        System.out.println("Total Soal: " + daftarUjian.length);
                                                                                                                                        System.out.println();
                                                                                                                                        for (int i = 0; i < daftarUjian.length; i++) 
                                                                                                                                        {
                                                                                                                                                System.out.println(i + 1);
                                                                                                                                                System.out.println("Pertanyaan   : " + daftarUjian[i].getPertanyaan());
                                                                                                                                                System.out.println();
                                                                                                                                                System.out.println(daftarUjian[i].getPilihan());
                                                                                                                                                System.out.println("-----------------------------------------------------------");
                                                                                                                                                System.out.print("Jawaban Anda: ");
                                                                                                                                                String jawabanUser = input.next();
                                                                                                                                                jawabanbinggris1. setJawaban(jawabanUser);
                                                                                                                                                jawabanbinggris1.simpanJawaban();
                                                                                                                                                jawabanbinggris1.periksaJawaban(daftarUjian[i].getJawabanBenar());
                                                                                                                                                jawabanbinggris2.setJawaban(jawabanUser);
                                                                                                                                                jawabanbinggris2.simpanJawaban();
                                                                                                                                                jawabanbinggris2.periksaJawaban(daftarUjian[i].getJawabanBenar());
                                                                                                                                                if (jawabanUser.equalsIgnoreCase(daftarUjian[i].getJawabanBenar())) 
                                                                                                                                                {
                                                                                                                                                        System.out.println("-> Benar!");
                                                                                                                                                        totalNilai += 50;
                                                                                                                                                } 
                                                                                                                                                else 
                                                                                                                                                {
                                                                                                                                                        System.out.println("-> Salah! (Jawaban benar: " + daftarUjian[i].getJawabanBenar() + ")");
                                                                                                                                                }
                                                                                                                                                System.out.println("Waktu menjawab: " + jawabanbinggris1.getWaktuJawab());
                                                                                                                                                System.out.println("Waktu menjawab: " + jawabanbinggris2.getWaktuJawab());
                                                                                                                                                System.out.println("===========================================================");
                                                                                                                                                System.out.println();
                                                                                                                                        }                                                                                
                                                                                                                                                System.out.println("===========================================================");
                                                                                                                                                System.out.println("                      REKAP NILAI AKHIR                    ");
                                                                                                                                                System.out.println("===========================================================");
                                                                                                                                                System.out.println("ID Mahasiswa   : " + Mahasiswa.getIdUser());
                                                                                                                                                System.out.println("Nama Mahasiswa : " + Mahasiswa.getNamaUser());
                                                                                                                                                System.out.println("Skor Diperoleh : " + nilaibinggris.hitungNilai() + " / 100.0"); 
                                                                                                                                                System.out.println("Status Ujian   : " + (nilaibinggris.getSkor() >= 70 ? "LULUS" : "REMEDIAL"));
                                                                                                                                                System.out.println("===========================================================");
                                                                                                                                                System.out.println();

                                                                                                                                                System.out.println("===========================================================");
                                                                                                                                                System.out.println("                REVIEW SOAL DAN KUNCI JAWABAN              ");
                                                                                                                                                System.out.println("===========================================================");
                                                                                                                                                for (int i = 0; i < daftarUjian.length; i++) 
                                                                                                                                                {
                                                                                                                                                        System.out.println("Soal Nomor " + (i + 1));
                                                                                                                                                        System.out.println("Pertanyaan    : " + daftarUjian[i].getPertanyaan());
                                                                                                                                                        System.out.println("Jawaban Anda  : " + daftarJawaban[i].getJawaban() + 
                                                                                                                                                                        " (" + (daftarJawaban[i].isStatusBenar() ? "BENAR" : "SALAH") + ")");
                                                                                                                                                        System.out.println("Kunci Jawaban : " + daftarUjian[i].getJawabanBenar());
                                                                                                                                                        System.out.println("===========================================================");
                                                                                                                                                        System.out.println();
                                                                                                                                                }
                                                                                                                                                tesbinggris.tutupTes();
                                                                                                                                                System.out.println("==========================================================="); 
                                                                                                                                        break;
                                                                                                                                case 4: 
                                                                                                                                        List<Nilai> daftarnilaibinggris = new ArrayList<>();
                                                                                                                                        daftarnilaibinggris.add(nilaibinggris); 
                                                                                                                                        sertifikatbinggris.hitungNilai(daftarnilaibinggris);
                                                                                                                                        sertifikatbinggris.lihatNilai();
                                                                                                                                        break; 
                                                                                                                                case 5:
                                                                                                                                        englishclass = true;
                                                                                                                                        break;
                                                                                                                                default: 
                                                                                                                                        System.out.println("Pilihan tidak valid!");
                                                                                                                                        System.out.println();                                                                                                        
                                                                                                                        }                                                                                                                                             
                                                                                                                }
                                                                                                                break;
                                                                                                        case 2:
                                                                                                                boolean germanyclass = false;
                                                                                                                while (!germanyclass)
                                                                                                                {
                                                                                                                        System.out.println("=================================================================");
                                                                                                                        System.out.println("========================= GERMANY CLASS =========================");
                                                                                                                        System.out.println("=================================================================");
                                                                                                                        System.out.println("Selamat datang di Kelas Bahasa Jerman");
                                                                                                                        System.out.println("-----------------------------------------------------------------");
                                                                                                                        System.out.println("1. Lihat Jadwal Kelas");
                                                                                                                        System.out.println("2. Materi Pembelajaran");
                                                                                                                        System.out.println("3. Test");
                                                                                                                        System.out.println("4. Sertifikat");
                                                                                                                        System.out.println("5. Kembali");                                                        
                                                                                                                        System.out.println("-----------------------------------------------------------------");
                                                                                                                        System.out.print("Pilih Menu : ");
                                                                                                                        int menukelasbjerman = input.nextInt();
                                                                                                                        System.out.println();
                                                                                                                        switch (menukelasbjerman)   
                                                                                                                        {
                                                                                                                                case 1:
                                                                                                                                        kelasbjerman.jadwalkelas();
                                                                                                                                        break;
                                                                                                                                case 2:
                                                                                                                                        boolean materigermany = false;
                                                                                                                                        while (!materigermany) 
                                                                                                                                        {
                                                                                                                                                System.out.println("=================================================================");
                                                                                                                                                System.out.println("=========================  DAFTAR KELAS  ========================");
                                                                                                                                                System.out.println("=================================================================");
                                                                                                                                                System.out.println("1. Pertemuan 1");
                                                                                                                                                System.out.println("2. Pertemuan 2");
                                                                                                                                                System.out.println("3. Kembali");
                                                                                                                                                System.out.println("-----------------------------------------------------------------");
                                                                                                                                                System.out.print("Pilih Materi : ");
                                                                                                                                                int menumateribjerman = input.nextInt();
                                                                                                                                                System.out.println();
                                                                                                                                                switch (menumateribjerman) 
                                                                                                                                                {
                                                                                                                                                        case 1:
                                                                                                                                                                materibjerman1.lihatMateri();
                                                                                                                                                                break;
                                                                                                                                                        case 2:
                                                                                                                                                                materibjerman2.lihatMateri();
                                                                                                                                                                break;
                                                                                                                                                        case 3:
                                                                                                                                                                materigermany = true;
                                                                                                                                                                break;
                                                                                                                                                        default: 
                                                                                                                                                                System.out.println("Pilihan tidak valid!");
                                                                                                                                                                System.out.println();                                                                                                                         
                                                                                                                                                }        
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                case 3:
                                                                                                                                        tesbjerman.mulaiTes();
                                                                                                                                        System.out.println("");
                                                                                                                                        Soal[] daftarUjian = {soalbjerman1, soalbjerman2};    
                                                                                                                                        Jawaban[] daftarJawaban = {jawabanbjerman1, jawabanbjerman2};    
                                                                                                                                        int totalNilai = 0;
                                                                                                                                        System.out.println("===========================================================");
                                                                                                                                        System.out.println("                MULAI UJIAN BAHASA JERMAN                 ");
                                                                                                                                        System.out.println("===========================================================");
                                                                                                                                        System.out.println("Nama Kelas: " + kelasbjerman.getNamaKelas());
                                                                                                                                        System.out.println("Nama Pengajar: " + Pengajar2.getNamaUser());
                                                                                                                                        System.out.println("Total Soal: " + daftarUjian.length);
                                                                                                                                        System.out.println();
                                                                                                                                        for (int i = 0; i < daftarUjian.length; i++) 
                                                                                                                                        {
                                                                                                                                                System.out.println(i + 1);
                                                                                                                                                System.out.println("Pertanyaan   : " + daftarUjian[i].getPertanyaan());
                                                                                                                                                System.out.println();
                                                                                                                                                System.out.println(daftarUjian[i].getPilihan());
                                                                                                                                                System.out.println("-----------------------------------------------------------");
                                                                                                                                                System.out.print("Jawaban Anda: ");
                                                                                                                                                String jawabanUser = input.next();
                                                                                                                                                jawabanbjerman1. setJawaban(jawabanUser);
                                                                                                                                                jawabanbjerman1.simpanJawaban();
                                                                                                                                                jawabanbjerman1.periksaJawaban(daftarUjian[i].getJawabanBenar());
                                                                                                                                                jawabanbjerman2.setJawaban(jawabanUser);
                                                                                                                                                jawabanbjerman2.simpanJawaban();
                                                                                                                                                jawabanbjerman2.periksaJawaban(daftarUjian[i].getJawabanBenar());
                                                                                                                                                if (jawabanUser.equalsIgnoreCase(daftarUjian[i].getJawabanBenar())) 
                                                                                                                                                {
                                                                                                                                                        System.out.println("-> Benar!");
                                                                                                                                                        totalNilai += 50;
                                                                                                                                                } 
                                                                                                                                                else 
                                                                                                                                                {
                                                                                                                                                        System.out.println("-> Salah! (Jawaban benar: " + daftarUjian[i].getJawabanBenar() + ")");
                                                                                                                                                }
                                                                                                                                                System.out.println("Waktu menjawab: " + jawabanbjerman1.getWaktuJawab());
                                                                                                                                                System.out.println("Waktu menjawab: " + jawabanbjerman2.getWaktuJawab());
                                                                                                                                                System.out.println("===========================================================");
                                                                                                                                                System.out.println();
                                                                                                                                        }                                                                                
                                                                                                                                                System.out.println("===========================================================");
                                                                                                                                                System.out.println("                      REKAP NILAI AKHIR                    ");
                                                                                                                                                System.out.println("===========================================================");
                                                                                                                                                System.out.println("ID Mahasiswa   : " + Mahasiswa.getIdUser());
                                                                                                                                                System.out.println("Nama Mahasiswa : " + Mahasiswa.getNamaUser());
                                                                                                                                                System.out.println("Skor Diperoleh : " + nilaibjerman.hitungNilai() + " / 100.0"); 
                                                                                                                                                System.out.println("Status Ujian   : " + (nilaibjerman.getSkor() >= 70 ? "LULUS" : "REMEDIAL"));
                                                                                                                                                System.out.println("===========================================================");
                                                                                                                                                System.out.println();

                                                                                                                                                System.out.println("===========================================================");
                                                                                                                                                System.out.println("                REVIEW SOAL DAN KUNCI JAWABAN              ");
                                                                                                                                                System.out.println("===========================================================");
                                                                                                                                                for (int i = 0; i < daftarUjian.length; i++) 
                                                                                                                                                {
                                                                                                                                                        System.out.println("Soal Nomor " + (i + 1));
                                                                                                                                                        System.out.println("Pertanyaan    : " + daftarUjian[i].getPertanyaan());
                                                                                                                                                        System.out.println("Jawaban Anda  : " + daftarJawaban[i].getJawaban() + 
                                                                                                                                                                        " (" + (daftarJawaban[i].isStatusBenar() ? "BENAR" : "SALAH") + ")");
                                                                                                                                                        System.out.println("Kunci Jawaban : " + daftarUjian[i].getJawabanBenar());
                                                                                                                                                        System.out.println("===========================================================");
                                                                                                                                                        System.out.println();
                                                                                                                                                }
                                                                                                                                                tesbinggris.tutupTes();
                                                                                                                                                System.out.println("==========================================================="); 
                                                                                                                                        break;
                                                                                                                                case 4: 
                                                                                                                                        List<Nilai> daftarnilaibjerman = new ArrayList<>();
                                                                                                                                        daftarnilaibjerman.add(nilaibjerman); 
                                                                                                                                        sertifikatbjerman.hitungNilai(daftarnilaibjerman);
                                                                                                                                        sertifikatbjerman.lihatNilai();
                                                                                                                                        break; 
                                                                                                                                case 5:
                                                                                                                                        englishclass = true;
                                                                                                                                        break;
                                                                                                                                default: 
                                                                                                                                        System.out.println("Pilihan tidak valid!");
                                                                                                                                        System.out.println();                                                                                                        
                                                                                                                        }                                                                                                                                             
                                                                                                                }
                                                                                                                break;
                                                                                                        case 3:
                                                                                                                boolean chineseclass = false;
                                                                                                                while (!chineseclass)
                                                                                                                {
                                                                                                                        System.out.println("=================================================================");
                                                                                                                        System.out.println("========================= CHINESE CLASS =========================");
                                                                                                                        System.out.println("=================================================================");
                                                                                                                        System.out.println("Selamat datang di Kelas Bahasa China");
                                                                                                                        System.out.println("-----------------------------------------------------------------");
                                                                                                                        System.out.println("1. Lihat Jadwal Kelas");
                                                                                                                        System.out.println("2. Materi Pembelajaran");
                                                                                                                        System.out.println("3. Test");
                                                                                                                        System.out.println("4. Sertifikat");
                                                                                                                        System.out.println("5. Kembali");                                                        
                                                                                                                        System.out.println("-----------------------------------------------------------------");
                                                                                                                        System.out.print("Pilih Menu : ");
                                                                                                                        int menukelasbchina = input.nextInt();
                                                                                                                        System.out.println();
                                                                                                                        switch (menukelasbchina)   
                                                                                                                        {
                                                                                                                                case 1:
                                                                                                                                        kelasbchina.jadwalkelas();
                                                                                                                                        break;
                                                                                                                                case 2:
                                                                                                                                        boolean materichinese = false;
                                                                                                                                        while (!materichinese) 
                                                                                                                                        {
                                                                                                                                                System.out.println("=================================================================");
                                                                                                                                                System.out.println("=========================  DAFTAR KELAS  ========================");
                                                                                                                                                System.out.println("=================================================================");
                                                                                                                                                System.out.println("1. Pertemuan 1");
                                                                                                                                                System.out.println("2. Pertemuan 2");
                                                                                                                                                System.out.println("3. Kembali");
                                                                                                                                                System.out.println("-----------------------------------------------------------------");
                                                                                                                                                System.out.print("Pilih Materi : ");
                                                                                                                                                int menumateribchina = input.nextInt();
                                                                                                                                                System.out.println();
                                                                                                                                                switch (menumateribchina) 
                                                                                                                                                {
                                                                                                                                                        case 1:
                                                                                                                                                                materibchina1.lihatMateri();
                                                                                                                                                                break;
                                                                                                                                                        case 2:
                                                                                                                                                                materibchina2.lihatMateri();
                                                                                                                                                                break;
                                                                                                                                                        case 3:
                                                                                                                                                                materichinese = true;
                                                                                                                                                                break;
                                                                                                                                                        default: 
                                                                                                                                                                System.out.println("Pilihan tidak valid!");
                                                                                                                                                                System.out.println();                                                                                                                         
                                                                                                                                                }        
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                case 3:
                                                                                                                                        tesbchina.mulaiTes();
                                                                                                                                        System.out.println("");
                                                                                                                                        Soal[] daftarUjian = {soalbchina1, soalbchina2};    
                                                                                                                                        Jawaban[] daftarJawaban = {jawabanbchina1, jawabanbchina2};    
                                                                                                                                        int totalNilai = 0;
                                                                                                                                        System.out.println("===========================================================");
                                                                                                                                        System.out.println("                MULAI UJIAN BAHASA CHINA                 ");
                                                                                                                                        System.out.println("===========================================================");
                                                                                                                                        System.out.println("Nama Kelas: " + kelasbchina.getNamaKelas());
                                                                                                                                        System.out.println("Nama Pengajar: " + Pengajar3.getNamaUser());
                                                                                                                                        System.out.println("Total Soal: " + daftarUjian.length);
                                                                                                                                        System.out.println();
                                                                                                                                        for (int i = 0; i < daftarUjian.length; i++) 
                                                                                                                                        {
                                                                                                                                                System.out.println(i + 1);
                                                                                                                                                System.out.println("Pertanyaan   : " + daftarUjian[i].getPertanyaan());
                                                                                                                                                System.out.println();
                                                                                                                                                System.out.println(daftarUjian[i].getPilihan());
                                                                                                                                                System.out.println("-----------------------------------------------------------");
                                                                                                                                                System.out.print("Jawaban Anda: ");
                                                                                                                                                String jawabanUser = input.next();
                                                                                                                                                jawabanbchina1. setJawaban(jawabanUser);
                                                                                                                                                jawabanbchina1.simpanJawaban();
                                                                                                                                                jawabanbchina1.periksaJawaban(daftarUjian[i].getJawabanBenar());
                                                                                                                                                jawabanbchina2.setJawaban(jawabanUser);
                                                                                                                                                jawabanbchina2.simpanJawaban();
                                                                                                                                                jawabanbchina2.periksaJawaban(daftarUjian[i].getJawabanBenar());
                                                                                                                                                if (jawabanUser.equalsIgnoreCase(daftarUjian[i].getJawabanBenar())) 
                                                                                                                                                {
                                                                                                                                                        System.out.println("-> Benar!");
                                                                                                                                                        totalNilai += 50;
                                                                                                                                                } 
                                                                                                                                                else 
                                                                                                                                                {
                                                                                                                                                        System.out.println("-> Salah! (Jawaban benar: " + daftarUjian[i].getJawabanBenar() + ")");
                                                                                                                                                }
                                                                                                                                                System.out.println("Waktu menjawab: " + jawabanbchina1.getWaktuJawab());
                                                                                                                                                System.out.println("Waktu menjawab: " + jawabanbchina2.getWaktuJawab());
                                                                                                                                                System.out.println("===========================================================");
                                                                                                                                                System.out.println();
                                                                                                                                        }                                                                                
                                                                                                                                                System.out.println("===========================================================");
                                                                                                                                                System.out.println("                      REKAP NILAI AKHIR                    ");
                                                                                                                                                System.out.println("===========================================================");
                                                                                                                                                System.out.println("ID Mahasiswa   : " + Mahasiswa.getIdUser());
                                                                                                                                                System.out.println("Nama Mahasiswa : " + Mahasiswa.getNamaUser());
                                                                                                                                                System.out.println("Skor Diperoleh : " + nilaibchina.hitungNilai() + " / 100.0"); 
                                                                                                                                                System.out.println("Status Ujian   : " + (nilaibchina.getSkor() >= 70 ? "LULUS" : "REMEDIAL"));
                                                                                                                                                System.out.println("===========================================================");
                                                                                                                                                System.out.println();

                                                                                                                                                System.out.println("===========================================================");
                                                                                                                                                System.out.println("                REVIEW SOAL DAN KUNCI JAWABAN              ");
                                                                                                                                                System.out.println("===========================================================");
                                                                                                                                                for (int i = 0; i < daftarUjian.length; i++) 
                                                                                                                                                {
                                                                                                                                                        System.out.println("Soal Nomor " + (i + 1));
                                                                                                                                                        System.out.println("Pertanyaan    : " + daftarUjian[i].getPertanyaan());
                                                                                                                                                        System.out.println("Jawaban Anda  : " + daftarJawaban[i].getJawaban() + 
                                                                                                                                                                        " (" + (daftarJawaban[i].isStatusBenar() ? "BENAR" : "SALAH") + ")");
                                                                                                                                                        System.out.println("Kunci Jawaban : " + daftarUjian[i].getJawabanBenar());
                                                                                                                                                        System.out.println("===========================================================");
                                                                                                                                                        System.out.println();
                                                                                                                                                }
                                                                                                                                                tesbinggris.tutupTes();
                                                                                                                                                System.out.println("==========================================================="); 
                                                                                                                                        break;
                                                                                                                                case 4: 
                                                                                                                                        List<Nilai> daftarnilaibchina = new ArrayList<>();
                                                                                                                                        daftarnilaibchina.add(nilaibchina); 
                                                                                                                                        sertifikatbchina.hitungNilai(daftarnilaibchina);
                                                                                                                                        sertifikatbchina.lihatNilai();
                                                                                                                                        break; 
                                                                                                                                case 5:
                                                                                                                                        chineseclass = true;
                                                                                                                                        break;
                                                                                                                                default: 
                                                                                                                                        System.out.println("Pilihan tidak valid!");
                                                                                                                                        System.out.println();                                                                                                        
                                                                                                                        }                                                                                                                                             
                                                                                                                }                                                                        
                                                                                                }
                                                                                        }
                                                                                        break;
                                                                        }   
                                                                }

                                                        }
                                                        else 
                                                        {
                                                                Mahasiswa.logininvalid();
                                                        }
                                                        break;
                                        }
                                }
                                break;
                        case 2: 
                                userlogin = Pengajar1.loginakun(listAkun); 
                                if (userlogin != null && userlogin.role.equalsIgnoreCase("Pengajar")) 
                                {
                                        userlogin.loginberhasil();
                                        System.out.println("Selamat datang " + userlogin.getNamaUser());
                                        System.out.println("");  
                                        boolean menuutamapengajar = true; 
                                        while (menuutamapengajar) 
                                        {
                                                System.out.println("=================================================================");
                                                System.out.println("=========================== PENGAJAR ============================");
                                                System.out.println("=================================================================");
                                                System.out.println("1. Kelola Materi");
                                                System.out.println("2. Kelola Tes");
                                                System.out.println("3. Kelola Nilai Siswa");
                                                System.out.println("4. Logout");
                                                System.out.println("-----------------------------------------------------------------");
                                                System.out.print("Pilih Menu : ");
                                                int menupengajar = input.nextInt();
                                                System.out.println();      
                                                switch (menupengajar) 
                                                {
                                                        case 1:
                                                                System.out.println("-> Menampilkan jadwal mengajar Anda...");
                                                                break;
                                                        case 2:
                                                                System.out.println("-> Fitur input nilai mahasiswa...");
                                                                break;
                                                        case 3:
                                                                userlogin.lihatProfil(); 
                                                                break;
                                                        case 4:
                                                                userlogin.logout();
                                                                menuutamapengajar = false; 
                                                                break;
                                                        default:
                                                                System.out.println("Pilihan tidak valid!");
                                                }
                                        }
                                } 
                                else if (userlogin != null && !userlogin.role.equalsIgnoreCase("Pengajar")) 
                                {
                                        System.out.println("Login Gagal: Akun Anda terdaftar sebagai Mahasiswa, bukan Pengajar!");
                                } 
                                else 
                                {
                                        Mahasiswa.logininvalid(); 
                                        System.out.println();
                                }
                                break;         
                }
        }
        input.close();
    }
}
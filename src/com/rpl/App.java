package com.rpl;

import com.rpl.lembaga.Kelas;
import com.rpl.lembaga.LembagaBahasa;
import com.rpl.lembaga.Sertifikat;
import com.rpl.mahasiswa.Enrollment;
import com.rpl.mahasiswa.Jawaban;
import com.rpl.mahasiswa.Nilai;
import com.rpl.pengajar.Materi;
import com.rpl.pengajar.Soal;
import com.rpl.pengajar.Tes;
import com.rpl.mahasiswa.Mahasiswa;
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
                "Introduction to English Greetings", 
                "Materi membahas salam dalam bahasa Inggris seperti" +
                "Good Morning, Good Afternoon, Good Evening, Goodbye," + 
                "dan penggunaannya dalam percakapan sehari-hari.",
                10,                             
                101                          
        );

        Materi materibinggris2 = new Materi(
                101,                            
                "Mark Lee",               
                "marklee@gmail.ac.id",
                "020809",                       
                21,                              
                "Introducing Yourself", 
                "Materi membahas cara memperkenalkan diri dalam bahasa Inggris," +
                "seperti menyebutkan nama, umur, asal, dan hobi menggunakan kalimat sederhana.",
                11,                             
                101                          
        );

        Materi materibjerman1 = new Materi(
                102,                            
                "Jisung Park",               
                "jisungpark@gmail.ac.id",
                "050202",                       
                20,                              
                "Salam dalam Bahasa Jerman", 
                "Materi membahas ucapan dasar bahasa Jerman seperti Hallo, Guten Morgen," +
                "Guten Tag, Guten Abend, Danke, Bitte, dan Tschüss.",
                20,                             
                102                          
        );

        Materi materibjerman2 = new Materi(
                102,                            
                "Jisung Park",               
                "jisungpark@gmail.ac.id",
                "050202",                       
                21,                              
                "Perkenalan Diri dalam Bahasa Jerman", 
                "Materi membahas cara memperkenalkan diri menggunakan kalimat sederhana" +
                "seperti Ich heiße, Ich komme aus, dan Ich bin Student.",
                21,                             
                102                          
        );

        Materi materibchina1 = new Materi(
                103,                            
                "Yeji Hwang",               
                "yejihwang@gmail.ac.id",
                "050203",                       
                30,                              
                "Percakapan Dasar Bahasa Mandarin", 
                "Materi membahas kosakata dasar Mandarin seperti Ni Hao (Halo)," + 
                "Xie Xie (Terima Kasih), Zai Jian (Sampai Jumpa), dan Wo Ai Ni (Aku Cinta Kamu).",
                30,                             
                103                          
        );

        Materi materibchina2 = new Materi(
                103,                            
                "Yeji Hwang",               
                "yejihwang@gmail.ac.id",
                "050203",                       
                31,                              
                "Perkenalan Diri dalam Bahasa Mandarin", 
                "Materi membahas cara memperkenalkan diri menggunakan kalimat sederhana" + 
                "seperti Wo Jiao, Wo Shi, dan Wo Lai Zi Indonesia.",
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
                "Apa arti kata Jerman “Guten Morgen”?",       
                "A. Selamat malam\n" +
                "B. Selamat pagi\n" +
                "C. Terima kasih\n" +
                "D. Sampai jumpa",         
                "B",
                "Jerman Class",                      
                20                               
        );

        Soal soalbjerman2 = new Soal(
                1,                                    
                "Joko",                        
                "kijokogawlbodo@gmail.ac.id",                    
                "66666",                             
                22,                                     
                "Bagaimana cara mengucapkan “Terima kasih” dalam bahasa Jerman?",       
                "A. Bitte\n" +
                "B. Hallo\n" +
                "C. Danke\n" +
                "D. Tschüss",         
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
                "Apa arti kata Mandarin “Ni Hao (你好)”?",       
                "A. Selamat tinggal\n" +
                "B. Apa kabar\n" +
                "C. Halo\n" +
                "D. Terima kasih",         
                "C", 
                "China Class",                     
                30                               
        );

        Soal soalbchina2 = new Soal(
                1,                                    
                "Joko",                        
                "kijokogawlbodo@gmail.ac.id",                    
                "66666",                             
                32,                                     
                "Bagaimana cara mengucapkan “Terima kasih” dalam bahasa Mandarin?",       
                "A. Xie Xie\n" +
                "B. Zai Jian\n" +
                "C. Ni Hao\n" +
                "D. Wo Ai Ni",         
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
                "Ujian Bahasa Inggris",         
                "26-06-2026",             
                10                        
        );

        Tes tesbjerman = new Tes(
                1,                                    
                "Joko",                        
                "kijokogawlbodo@gmail.ac.id",                    
                "66666",                 
                20,                          
                "Ujian Bahasa Jerman",         
                "26-06-2026",             
                20                        
        );

        Tes tesbchina = new Tes(
                1,                                    
                "Joko",                        
                "kijokogawlbodo@gmail.ac.id",                    
                "66666",                 
                30,                          
                "Ujian Bahasa China",         
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
                "Chinese Class" 
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
                "B"
        );

        Jawaban jawabanbjerman2 = new Jawaban(
                82,
                1,
                22,
                "C"
        );


        Jawaban jawabanbchina1 = new Jawaban(
                91,
                1,
                31,
                "C"
        );

        Jawaban jawabanbchina2 = new Jawaban(
                92,
                1,
                32,
                "A"
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

        LembagaBahasa stafflembaga = new LembagaBahasa(
        10,                         
        "Ajeng Febriah",           
        "febriahajasie@gmail.ac.id",      
        "808080"               
        );        

        Scanner input = new Scanner(System.in);
    
        ArrayList<User> listAkun = new ArrayList<>();
        listAkun.add(Mahasiswa);
        listAkun.add(Pengajar1);
        listAkun.add(Pengajar2);
        listAkun.add(Pengajar3);
        listAkun.add(Lembagabahasa);

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
                                        System.out.println("3. Logout");
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
                                                                System.out.println("Selamat datang " + userlogin.getNamaUser());
                                                                System.out.println();
                                                                boolean loginSukses = false;
                                                                while (!loginSukses)
                                                                {
                                                                        ArrayList<Enrollment> listEnrollment = new ArrayList<>();
                                                                        listEnrollment.add(enrollmentbinggris);
                                                                        listEnrollment.add(enrollmentbjerman);
                                                                        listEnrollment.add(enrollmentbchina);
                                                                        System.out.println("=================================================================");
                                                                        System.out.println("========================== MAHASISWA ============================");
                                                                        System.out.println("=================================================================");
                                                                        System.out.println("1. Daftar Kelas");
                                                                        System.out.println("2. Kelas Saya");
                                                                        System.out.println("3. Lihat Profil");                                                                        
                                                                        System.out.println("4. Logout");
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
                                                                                                int idEnrollBaru = listEnrollment.size() + 1;
                                                                                                switch (menudaftarkelas) 
                                                                                                {
                                                                                                        case 1:
                                                                                                                mhs.daftarKelas();
                                                                                                                Enrollment enrollinggris = new Enrollment(idEnrollBaru, userlogin.id_user, 10);
                                                                                                                listEnrollment.add(enrollinggris);                                                                                                                 
                                                                                                                enrollinggris.daftar(); 
                                                                                                                System.out.println("");
                                                                                                                stafflembaga.validasiDaftar();
                                                                                                                System.out.println("-----------------------------------------------------------------");
                                                                                                                System.out.println("                 STRUK VERIFIKASI PENDAFTARAN (ACC)              ");
                                                                                                                System.out.println("-----------------------------------------------------------------");
                                                                                                                System.out.printf(" No. Transaksi (Enroll ID) : %d\n", enrollinggris.getIdEnrollment());
                                                                                                                System.out.printf(" ID Mahasiswa              : %d\n", enrollinggris.getIdUser());
                                                                                                                System.out.printf(" ID Kelas Pilihan          : %d (Bahasa Inggris)\n", enrollinggris.getIdKelas());
                                                                                                                System.out.println(" Status Pendaftaran        : DISETUJUI");
                                                                                                                System.out.println("=================================================================\n");
                                                                                                                kembalidaftarkelas = true;
                                                                                                                break;
                                                                                                        case 2:
                                                                                                                mhs.daftarKelas();
                                                                                                                Enrollment enrolljerman = new Enrollment(idEnrollBaru, userlogin.id_user, 20);
                                                                                                                listEnrollment.add(enrolljerman);                                                                                                                 
                                                                                                                enrolljerman.daftar(); 
                                                                                                                System.out.println("");  
                                                                                                                stafflembaga.validasiDaftar();
                                                                                                                System.out.println("-----------------------------------------------------------------");
                                                                                                                System.out.println("                 STRUK VERIFIKASI PENDAFTARAN (ACC)              ");
                                                                                                                System.out.println("-----------------------------------------------------------------");
                                                                                                                System.out.printf(" No. Transaksi (Enroll ID) : %d\n", enrolljerman.getIdEnrollment());
                                                                                                                System.out.printf(" ID Mahasiswa              : %d\n", enrolljerman.getIdUser());
                                                                                                                System.out.printf(" ID Kelas Pilihan          : %d (Bahasa Jeerman)\n", enrolljerman.getIdKelas());
                                                                                                                System.out.println(" Status Pendaftaran        : DISETUJUI");
                                                                                                                System.out.println("=================================================================\n");                                                                                                                                                                                                                              
                                                                                                                kembalidaftarkelas = true;
                                                                                                                break;
                                                                                                        case 3:
                                                                                                                mhs.daftarKelas();
                                                                                                                Enrollment enrollchina = new Enrollment(idEnrollBaru, userlogin.id_user, 30);
                                                                                                                listEnrollment.add(enrollchina);                                                                                                                 
                                                                                                                enrollchina.daftar(); 
                                                                                                                System.out.println(""); 
                                                                                                                stafflembaga.validasiDaftar();
                                                                                                                System.out.println("-----------------------------------------------------------------");
                                                                                                                System.out.println("                 STRUK VERIFIKASI PENDAFTARAN (ACC)              ");
                                                                                                                System.out.println("-----------------------------------------------------------------");
                                                                                                                System.out.printf(" No. Transaksi (Enroll ID) : %d\n", enrollchina.getIdEnrollment());
                                                                                                                System.out.printf(" ID Mahasiswa              : %d\n", enrollchina.getIdUser());
                                                                                                                System.out.printf(" ID Kelas Pilihan          : %d (Bahasa China)\n", enrollchina.getIdKelas());
                                                                                                                System.out.println(" Status Pendaftaran        : DISETUJUI");
                                                                                                                System.out.println("=================================================================\n");                                                                                                                                                                                                                                                                                                                                                
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
                                                                                                                                                if (jawabanUser.equalsIgnoreCase(daftarUjian[i].getJawabanBenar())) 
                                                                                                                                                {
                                                                                                                                                        System.out.println("-> Benar!");
                                                                                                                                                        totalNilai += 50;
                                                                                                                                                } 
                                                                                                                                                else 
                                                                                                                                                {
                                                                                                                                                        System.out.println("-> Salah! (Jawaban benar: " + daftarUjian[i].getJawabanBenar() + ")");
                                                                                                                                                }
                                                                                                                                                System.out.println("Waktu menjawab: " + jawabanbinggris2.getWaktuJawab());
                                                                                                                                                System.out.println("===========================================================");
                                                                                                                                                System.out.println();
                                                                                                                                        }                                                                                
                                                                                                                                                System.out.println("===========================================================");
                                                                                                                                                System.out.println("                      REKAP NILAI AKHIR                    ");
                                                                                                                                                System.out.println("===========================================================");
                                                                                                                                                System.out.println("ID Mahasiswa   : " + Mahasiswa.getIdUser());
                                                                                                                                                System.out.println("Nama Mahasiswa : " + Mahasiswa.getNamaUser());
                                                                                                                                                System.out.println("Skor Diperoleh : " + totalNilai + " / 100.0"); 
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
                                                                                                                                                        String jwbUser = daftarJawaban[i].getJawaban();
                                                                                                                                                        String kunci = daftarUjian[i].getJawabanBenar();
                                                                                                                                                        String status = jwbUser.equalsIgnoreCase(kunci) ? "BENAR" : "SALAH";
                                                                                                                                                        System.out.println("Jawaban Anda  : " + jwbUser + " (" + status + ")");
                                                                                                                                                        System.out.println("Kunci Jawaban : " + kunci);
                                                                                                                                                        System.out.println("===========================================================");
                                                                                                                                                        System.out.println();
                                                                                                                                                }
                                                                                                                                                tesbinggris.tutupTes();
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
                                                                                                                                                System.out.println("===========================================================");
                                                                                                                                                System.out.println();
                                                                                                                                        }                                                                                
                                                                                                                                                System.out.println("===========================================================");
                                                                                                                                                System.out.println("                      REKAP NILAI AKHIR                    ");
                                                                                                                                                System.out.println("===========================================================");
                                                                                                                                                System.out.println("ID Mahasiswa   : " + Mahasiswa.getIdUser());
                                                                                                                                                System.out.println("Nama Mahasiswa : " + Mahasiswa.getNamaUser());
                                                                                                                                                System.out.println("Skor Diperoleh : " + totalNilai + " / 100.0"); 
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
                                                                                                                                                        String jwbUser = daftarJawaban[i].getJawaban();
                                                                                                                                                        String kunci = daftarUjian[i].getJawabanBenar();
                                                                                                                                                        String status = jwbUser.equalsIgnoreCase(kunci) ? "BENAR" : "SALAH";
                                                                                                                                                        System.out.println("Jawaban Anda  : " + jwbUser + " (" + status + ")");
                                                                                                                                                        System.out.println("Kunci Jawaban : " + kunci);
                                                                                                                                                        System.out.println("===========================================================");
                                                                                                                                                        System.out.println();
                                                                                                                                                }
                                                                                                                                                tesbinggris.tutupTes();
                                                                                                                                        break;
                                                                                                                                case 4: 
                                                                                                                                        List<Nilai> daftarnilaibjerman = new ArrayList<>();
                                                                                                                                        daftarnilaibjerman.add(nilaibjerman); 
                                                                                                                                        sertifikatbjerman.hitungNilai(daftarnilaibjerman);
                                                                                                                                        sertifikatbjerman.lihatNilai();
                                                                                                                                        break; 
                                                                                                                                case 5:
                                                                                                                                        germanyclass = true;
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
                                                                                                                                                System.out.println("===========================================================");
                                                                                                                                                System.out.println();
                                                                                                                                        }                                                                                
                                                                                                                                                System.out.println("===========================================================");
                                                                                                                                                System.out.println("                      REKAP NILAI AKHIR                    ");
                                                                                                                                                System.out.println("===========================================================");
                                                                                                                                                System.out.println("ID Mahasiswa   : " + Mahasiswa.getIdUser());
                                                                                                                                                System.out.println("Nama Mahasiswa : " + Mahasiswa.getNamaUser());
                                                                                                                                                System.out.println("Skor Diperoleh : " + totalNilai + " / 100.0"); 
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
                                                                                                                                                        String jwbUser = daftarJawaban[i].getJawaban();
                                                                                                                                                        String kunci = daftarUjian[i].getJawabanBenar();
                                                                                                                                                        String status = jwbUser.equalsIgnoreCase(kunci) ? "BENAR" : "SALAH";
                                                                                                                                                        System.out.println("Jawaban Anda  : " + jwbUser + " (" + status + ")");
                                                                                                                                                        System.out.println("Kunci Jawaban : " + kunci);
                                                                                                                                                        System.out.println("===========================================================");
                                                                                                                                                        System.out.println();
                                                                                                                                                }
                                                                                                                                                tesbinggris.tutupTes();
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
                                                                                                                break;
                                                                                                        case 4: 
                                                                                                                kembalikelas = true;
                                                                                                                break;
                                                                                                        default: 
                                                                                                                System.out.println("Pilihan tidak valid!");
                                                                                                                System.out.println();                                                                                                                                                                                                                       
                                                                                                }
                                                                                        }
                                                                                        break;
                                                                                case 3: 
                                                                                        userlogin.lihatProfil();
                                                                                        break;
                                                                                default:
                                                                                        System.out.println("Pilihan tidak valid!");
                                                                                        System.out.println();                                                                                        
                                                                        }   
                                                                }
                                                        }
                                                        else 
                                                        {
                                                                Mahasiswa.logininvalid();
                                                                System.out.println();
                                                        }
                                                        break;
                                                case 3: 
                                                        kembalimahasiswa = true;
                                                        break;
                                                default:
                                                        System.out.println("Pilihan tidak valid!");
                                                        System.out.println(); 
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
                                                                ArrayList<Materi> listMateri = new ArrayList<>();
                                                                listMateri.add(materibinggris1);
                                                                listMateri.add(materibinggris2);
                                                                listMateri.add(materibjerman1);
                                                                listMateri.add(materibjerman2);
                                                                listMateri.add(materibchina1);
                                                                listMateri.add(materibchina2);                                                                
                                                                boolean menuutamamateri = false;
                                                                while (!menuutamamateri) 
                                                                {
                                                                        System.out.println("=================================================================");
                                                                        System.out.println("============================ MATERI =============================");
                                                                        System.out.println("=================================================================");
                                                                        System.out.println("1. Tambah Materi");
                                                                        System.out.println("2. Edit Materi");
                                                                        System.out.println("3. Hapus Materi");
                                                                        System.out.println("4. Keluar");
                                                                        System.out.println("-----------------------------------------------------------------");
                                                                        System.out.print("Pilih Menu : ");
                                                                        int menumateri = input.nextInt();
                                                                        System.out.println();
                                                                        switch(menumateri)
                                                                        {
                                                                                case 1: 
                                                                                        System.out.println("=========================================================");
                                                                                        System.out.println("                     TAMBAH MATERI NEW                   ");
                                                                                        System.out.println("=========================================================");
                                                                                        input.nextLine(); 
                                                                                        System.out.print("Masukkan ID Materi baru : ");
                                                                                        int idMat = input.nextInt();
                                                                                        input.nextLine();                       
                                                                                        System.out.print("Masukkan Judul Materi   : ");
                                                                                        String judulMat = input.nextLine();                                                                                        
                                                                                        System.out.print("Masukkan Isi Materi     : ");
                                                                                        String isiMat = input.nextLine();                                                                                        
                                                                                        System.out.print("Masukkan ID Kelas       : ");
                                                                                        int idKel = input.nextInt();
                                                                                        input.nextLine();
                                                                                        Materi materiBaru = new Materi(
                                                                                        userlogin.id_user,     
                                                                                        userlogin.getNamaUser(),
                                                                                        userlogin.email,        
                                                                                        userlogin.password,     
                                                                                        idMat,                  
                                                                                        judulMat,               
                                                                                        isiMat,                 
                                                                                        idKel,                  
                                                                                        userlogin.id_user        
                                                                                        );
                                                                                        listMateri.add(materiBaru); 
                                                                                        System.out.println();
                                                                                        materiBaru.tambahMateri();
                                                                                        break;
                                                                                case 2:
                                                                                        System.out.println("=========================================================");
                                                                                        System.out.println("                     EDIT MATERI                         ");
                                                                                        System.out.println("=========================================================");
                                                                                        System.out.print("Masukkan ID Materi yang ingin diedit: ");
                                                                                        int idCariEdit = input.nextInt();
                                                                                        input.nextLine();
                                                                                        boolean ditemukanEdit = false;
                                                                                        for (Materi m : listMateri) 
                                                                                        {
                                                                                                if (m.getIdMateri() == idCariEdit && m.id_user == userlogin.id_user) 
                                                                                                {
                                                                                                        System.out.print("Masukkan Judul Bahasa Baru [" + m.getJudul() + "]: ");
                                                                                                        m.setJudul(input.nextLine());
                                                                                                        System.out.print("Masukkan Isi Materi Baru: ");
                                                                                                        m.setIsiMateri(input.nextLine());
                                                                                                        m.editMateri();
                                                                                                        break;
                                                                                                }
                                                                                        }     
                                                                                        if (!ditemukanEdit) 
                                                                                        {
                                                                                                System.out.println("Materi tidak ditemukan atau Anda tidak memiliki akses mengedit materi ini.");
                                                                                        }
                                                                                        break;
                                                                                case 3: 
                                                                                        System.out.println("=========================================================");
                                                                                        System.out.println("                     HAPUS MATERI                        ");
                                                                                        System.out.println("=========================================================");
                                                                                        System.out.print("Masukkan ID Materi yang ingin dihapus: ");
                                                                                        int idCariHapus = input.nextInt();
                                                                                        input.nextLine();
                                                                                        boolean ditemukanHapus = false;
                                                                                        for (int i = 0; i < listMateri.size(); i++) 
                                                                                        {
                                                                                                Materi m = listMateri.get(i);
                                                                                                if (m.getIdMateri() == idCariHapus && m.id_user == userlogin.id_user) 
                                                                                                {
                                                                                                        m.hapusMateri();
                                                                                                        System.out.println();
                                                                                                        listMateri.remove(i);
                                                                                                        System.out.println("-> Materi dengan ID " + idCariHapus + " berhasil dihapus!");
                                                                                                        ditemukanHapus = true;
                                                                                                        break;
                                                                                                }
                                                                                        }
                                                                                        if (!ditemukanHapus) 
                                                                                        {
                                                                                                System.out.println("Gagal mengupdate materi");
                                                                                        }
                                                                                        break;
                                                                                case 4:
                                                                                        menuutamamateri = true;
                                                                                        break;
                                                                                default:
                                                                                        System.out.println("Pilihan tidak valid!");
                                                                                        System.out.println();                                                                                        
                                                                        }
                                                                }
                                                                break;
                                                        case 2:
                                                                ArrayList<Tes> listTes = new ArrayList<>();
                                                                System.out.println("=========================================================");
                                                                System.out.println("                     BUAT TES BARU                       ");
                                                                System.out.println("=========================================================");
                                                                input.nextLine();                                                                 
                                                                System.out.print("Masukkan ID Tes      : ");
                                                                int idT = input.nextInt();
                                                                input.nextLine();                                                                
                                                                System.out.print("Masukkan Nama Tes    : ");
                                                                String namaT = input.nextLine();
                                                                System.out.print("Masukkan Tanggal Tes : ");
                                                                String tglT = input.nextLine();
                                                                System.out.print("Masukkan ID Kelas    : ");
                                                                int idK = input.nextInt();
                                                                input.nextLine();
                                                                Tes tesBaru = new Tes(
                                                                userlogin.id_user, userlogin.getNamaUser(), userlogin.email, userlogin.password,
                                                                idT, namaT, tglT, idK
                                                                );
                                                                listTes.add(tesBaru); 
                                                                System.out.println();
                                                                tesBaru.buatTes();                                                                
                                                                break;
                                                        case 3:
                                                                ArrayList<Nilai> listNilai = new ArrayList<>();
                                                                listNilai.add(nilaibinggris);
                                                                listNilai.add(nilaibjerman);
                                                                listNilai.add(nilaibchina); 
                                                                boolean menuNilai = true;
                                                                while (menuNilai) 
                                                                {
                                                                        System.out.println("=================================================================");
                                                                        System.out.println("========================== KELOLA NILAI =========================");
                                                                        System.out.println("=================================================================");
                                                                        System.out.println("1. Lihat Daftar Nilai Mahasiswa");
                                                                        System.out.println("2. Input Nilai Baru");
                                                                        System.out.println("3. Kembali");
                                                                        System.out.println("-----------------------------------------------------------------");
                                                                        System.out.print("Pilih Menu : ");
                                                                        int pilihanNilai = input.nextInt();
                                                                        System.out.println();                                                                        
                                                                        switch (pilihanNilai) {
                                                                        case 1: 
                                                                                System.out.println("=================================================================");
                                                                                System.out.println("                    DAFTAR NILAI MAHASISWA                       ");
                                                                                System.out.println("=================================================================");
                                                                                System.out.printf("%-10s %-20s %-10s %-10s\n", "ID NILAI", "NAMA MAHASISWA", "ID TES", "SKOR");
                                                                                System.out.println("-----------------------------------------------------------------");
                                                                                for (Nilai n : listNilai) 
                                                                                {
                                                                                String namaMahasiswa = "Tidak Diketahui";
                                                                                for (User akun : listAkun) 
                                                                                {
                                                                                        if (akun.id_user == n.getIdUser()) 
                                                                                        {
                                                                                                namaMahasiswa = akun.getNamaUser();
                                                                                                break;
                                                                                        }
                                                                                }
                                                                                System.out.printf("%-10d %-20s %-10d %-10.2f\n", 
                                                                                                n.getIdNilai(), namaMahasiswa, n.getIdTes(), n.hitungNilai());
                                                                                }
                                                                                System.out.println("=================================================================\n");
                                                                                break;
                                                                        case 2: 
                                                                                System.out.println("=========================================================");
                                                                                System.out.println("                     INPUT NILAI BARU                    ");
                                                                                System.out.println("=========================================================");
                                                                                System.out.print("Masukkan ID Nilai    : ");
                                                                                int idN = input.nextInt();
                                                                                System.out.print("Masukkan ID Mahasiswa: ");
                                                                                int idMhs = input.nextInt();
                                                                                System.out.print("Masukkan ID Tes      : ");
                                                                                int idtes = input.nextInt();
                                                                                System.out.print("Masukkan Skor Nilai  : ");
                                                                                float skorMhs = input.nextFloat();
                                                                                listNilai.add(new Nilai(idN, idMhs, idtes, skorMhs));
                                                                                System.out.println("-> Nilai sukses disimpan!");
                                                                                System.out.println();
                                                                                break;           
                                                                        case 3:
                                                                                menuNilai = false;
                                                                                break;
                                                                        }
                                                                }
                                                                break;
                                                        case 4:
                                                                menuutamapengajar = false; 
                                                                break;
                                                        default:
                                                                System.out.println("Pilihan tidak valid!");
                                                                System.out.println();
                                                }
                                        }
                                } 
                                else 
                                {
                                        Pengajar1.logininvalid(); 
                                        System.out.println();
                                }
                                break;
                        case 3:    
                                userlogin = Lembagabahasa.loginakun(listAkun); 
                                if (userlogin != null && userlogin.role.equalsIgnoreCase("Staff Lembaga Bahasa")) 
                                {
                                        userlogin.loginberhasil();
                                        System.out.println("Selamat datang " + userlogin.getNamaUser());
                                        System.out.println("");  
                                        boolean menuutamastafflembaga = true; 
                                        while (menuutamastafflembaga) 
                                        {
                                                System.out.println("=================================================================");
                                                System.out.println("========================= LEMBAGA BAHASA ========================");
                                                System.out.println("=================================================================");
                                                System.out.println("1. Kelola Kelas");
                                                System.out.println("2. Kelola Sertifikat");
                                                System.out.println("3. Logout");
                                                System.out.println("-----------------------------------------------------------------");
                                                System.out.print("Pilih Menu : ");       
                                                int menustaflembaga = input.nextInt();
                                                System.out.println();      
                                                switch (menustaflembaga) 
                                                {
                                                        case 1: 
                                                                boolean menuKelas = true;
                                                                while (menuKelas) 
                                                                {
                                                                        System.out.println("=========================================================");
                                                                        System.out.println("                      KELOLA KELAS                       ");
                                                                        System.out.println("=========================================================");
                                                                        System.out.println("1. Kelola Jadwal Kelas");
                                                                        System.out.println("2. Kelola Kurikulum");
                                                                        System.out.println("3. Kembali");
                                                                        System.out.println("---------------------------------------------------------");
                                                                        System.out.print("Pilih Menu Kelas : ");
                                                                        int subkelas = input.nextInt();
                                                                        switch (subkelas) 
                                                                        {
                                                                                case 1: 
                                                                                        System.out.println();
                                                                                        System.out.println("=================================================================");
                                                                                        System.out.println("========================= KELAS BAHASA ==========================");
                                                                                        System.out.println("=================================================================");
                                                                                        System.out.println("Informasi Kelas Yang Diikuti");
                                                                                        System.out.println("-----------------------------------------------------------------");
                                                                                        System.out.println("1. Kelas Bahasa Inggris");
                                                                                        System.out.println("2. Kelas Bahasa Jerman");
                                                                                        System.out.println("3. Kelas Bahasa China");
                                                                                        System.out.println("4. Kembali");
                                                                                        System.out.println("-----------------------------------------------------------------");
                                                                                        System.out.print("Pilih Menu Kelas : ");
                                                                                        int kelasbahasa = input.nextInt();
                                                                                        switch (kelasbahasa)
                                                                                        {
                                                                                                case 1:
                                                                                                        kelasbinggris.mulaiKelas();
                                                                                                        kelasbinggris.jadwalkelas();
                                                                                                        stafflembaga.kelolaJadwal(); 
                                                                                                        break;
                                                                                                case 2:
                                                                                                        kelasbjerman.mulaiKelas();
                                                                                                        kelasbjerman.jadwalkelas();
                                                                                                        stafflembaga.kelolaJadwal();                                                                                                        
                                                                                                        break;
                                                                                                case 3:
                                                                                                        kelasbchina.mulaiKelas();
                                                                                                        kelasbchina.jadwalkelas();
                                                                                                        stafflembaga.kelolaJadwal();
                                                                                                case 4: 
                                                                                                        menuKelas = true;
                                                                                                        break;
                                                                                                default: 
                                                                                                        System.out.println("Pilihan tidak valid!");
                                                                                                        System.out.println();                                                                                                                                                                                                         
                                                                                        }
                                                                                        break;
                                                                                case 2:
                                                                                        stafflembaga.kelolaKurikulum();
                                                                                        break;
                                                                                case 3:
                                                                                        menuKelas = true;
                                                                                        break;
                                                                                default:
                                                                                        System.out.println("Pilihan tidak valid!");
                                                                                        System.out.println();
                                                                        }
                                                                }
                                                                break;
                                                        case 2: 
                                                                System.out.println("=========================================================");
                                                                System.out.println("                    KELOLA SERTIFIKAT                    ");
                                                                System.out.println("=========================================================");
                                                                stafflembaga.terbitSertifikat(); 
                                                                System.out.println();                                                        
                                                                break; 
                                                        case 3: 
                                                                menuutamastafflembaga = true;
                                                                break;
                                                        default: 
                                                                System.out.println("Pilihan tidak valid");
                                                                System.out.println();
                                                }   
                                        }
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
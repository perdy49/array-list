import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan data
        ArrayList<String> noList = new ArrayList<>();
        ArrayList<String> kodeList = new ArrayList<>();
        ArrayList<String> mataKuliahList = new ArrayList<>();
        ArrayList<Integer> sksList = new ArrayList<>();
        ArrayList<String> hurufmutuList = new ArrayList<>();
        ArrayList<String> Bobotlist = new ArrayList<>();
        ArrayList<String> Nilailist = new ArrayList<>();
        ArrayList<String> Jumlahsks = new ArrayList<>();
        ArrayList<String> IP_Semester = new ArrayList<>();
        ArrayList<String> Sks_Maksimal_yang_bisa_diambil_semester_depan = new ArrayList<>();

        // Menambahkan data ke dalam ArrayList
        noList.add("1");
        kodeList.add("PS0101");
        mataKuliahList.add("Nilai Dasar Shalih Ikram");
        sksList.add(2);
        hurufmutuList.add("B");
        Bobotlist.add("3,00");
        Nilailist.add("70,00");

        noList.add("2");
        kodeList.add("PS0102");
        mataKuliahList.add("Teologi Aswaja");
        sksList.add(2);
        hurufmutuList.add("A-");
        Bobotlist.add("3,50");
        Nilailist.add("83,10");

        noList.add("3");
        kodeList.add("PS0104");
        mataKuliahList.add("Civic Education");
        sksList.add(2);
        hurufmutuList.add("A-");
        Bobotlist.add("3,50");
        Nilailist.add("88,00");

        noList.add("4");
        kodeList.add("PS0201");
        mataKuliahList.add("Ulumul Qur'an ");
        sksList.add(2);
        hurufmutuList.add("A-");
        Bobotlist.add("3,50");
        Nilailist.add("80,60");

        noList.add("5");
        kodeList.add("PS0203");
        mataKuliahList.add("Sejarah Pemikiran Dan Keuangan Perbankan");
        sksList.add(2);
        hurufmutuList.add("B+");
        Bobotlist.add("3,25");
        Nilailist.add("79,50");

        noList.add("6");
        kodeList.add("PS0205");
        mataKuliahList.add("Bahasa Arab I");
        sksList.add(2);
        hurufmutuList.add("B-");
        Bobotlist.add("2,75");
        Nilailist.add("68,00");

        noList.add("7");
        kodeList.add("PS0207");
        mataKuliahList.add("Bahasa Inggris I");
        sksList.add(2);
        hurufmutuList.add("B");
        Bobotlist.add("3,00");
        Nilailist.add("72,45");

        noList.add("8");
        kodeList.add("PS0209");
        mataKuliahList.add("Pengantar Ekonomi Mikro");
        sksList.add(3);
        hurufmutuList.add("A-");
        Bobotlist.add("3,50");
        Nilailist.add("82,00");

        noList.add("9");
        kodeList.add("PS0218");
        mataKuliahList.add("Manajemen Syariah");
        sksList.add(2);
        hurufmutuList.add("A-");
        Bobotlist.add("3,50");
        Nilailist.add("84,50");

        noList.add("10");
        kodeList.add("PS0227");
        mataKuliahList.add("Pengantar Filsafat");
        sksList.add(2);
        hurufmutuList.add("A-");
        Bobotlist.add("3,50");
        Nilailist.add("83,80");

        noList.add("11");
        kodeList.add("PS0416");
        mataKuliahList.add("Bahasa Indonesia");
        sksList.add(2);
        hurufmutuList.add("A-");
        Bobotlist.add("3,50");
        Nilailist.add("80,00");

        Jumlahsks.add("23");
        IP_Semester.add("3,33");
        Sks_Maksimal_yang_bisa_diambil_semester_depan.add("24");

        // Menampilkan data dalam format tabel
        System.out.printf("%-7s%-10s%-47s%-7s%-15s%-10s%-10s%n", "NO", "Kode", "MATAKULIAH    ", "sks", "Huruf-mutu ", "Bobot", "Nilai");
        for (int i = 0; i < noList.size(); i++) {
            System.out.printf("%-7s%-10s%-47s%-7s%-15s%-10s%-10s%n", noList.get(i), kodeList.get(i), mataKuliahList.get(i),
                    sksList.get(i), hurufmutuList.get(i), Bobotlist.get(i), Nilailist.get(i));
        }

        System.out.println( "Jumlah Sks                                    = 23");
        System.out.println("IP-semester                                   = 3,33");
        System.out.println("Sks_Maksimal yang bisa diambil semester depan = 24");
    }
}
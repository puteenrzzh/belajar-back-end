import java.util.Scanner;

public class Tugas3BE {
    public static void main(String[] args) {
        //a. Buatlah program untuk input nama anda dan output kalimat "Selamat datang di bootcamp Kawah Edukasi, {namaAnda}"
        Scanner input = new Scanner(System.in);
        String namaAnda;
        System.out.print("Masukkan Nama = ");
        namaAnda = input.next();

        System.out.println("Selamat datang di bootcamp Kawah Edukasi "+ namaAnda);

        //b. Buatlah masing masing dua variable untuk data type short, double, char, dan boolean
        short iniShort = 1000;
        short iniShort2 = 2000;
        double iniDouble = 10.10;
        double iniDouble2 = 20.20;
        char k = 'K';
        char e = 'E';
        boolean iniB = true;
        boolean iniB2 = false;


        // c. Buatlah 3 variable string dengan value masing-masing, "Saya senang" "belajar" "Java Language", lalu gabungkan dan print hasilnya.
        String a = "Saya senang ";
        String b = "belajar ";
        String c = "Java Language";

        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
    }
}

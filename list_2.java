import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list_2{

    public static void main(String[] args) {

        // a. List Nama makanan minimal 10 data
        List<String> foodList = new ArrayList<>();
        foodList.add("Ayam Remuk Sambal Setan");
        foodList.add("Ayam Remuk Sambal Ijo");
        foodList.add("Ayam Remuk Sambal Matah");
        foodList.add("Ayam Remuk Sambal Geprek");
        foodList.add("Ayam Remuk Sambal Nanas");
        foodList.add("Ayam Remuk Sambal Mangga");
        foodList.add("Ayam Bakar Kobongan");
        foodList.add("Ayam Goreng Sambal Setan");
        foodList.add("Ceker Crispy");
        foodList.add("Nasi");

        System.out.println("List Nama Makanan:");
        for (String food : foodList) {
            System.out.println(food);
        }

        // b. List Tahun Piala Dunia minimal 3 data
        List<Integer> worldCupYears = new ArrayList<>();
        worldCupYears.add(2022);
        worldCupYears.add(2018);
        worldCupYears.add(2014);

        System.out.println("\nList Tahun Piala Dunia:");
        for (int year : worldCupYears) {
            System.out.println(year);
        }

        // c. Implement sort pada list nama provinsi minimal 10 data secara descending
        List<String> provinceList = new ArrayList<>();
        provinceList.add("Sulawesi Utara");
        provinceList.add("Sulawesi Selatan");
        provinceList.add("Sulawesi Barat");
        provinceList.add("Sulawesi Tengah");
        provinceList.add("Sumatra Barat");
        provinceList.add("Sumatra Selatan");
        provinceList.add("Sumatra Utara");
        provinceList.add("Kep.Riau");
        provinceList.add("Papua Barat");
        provinceList.add("Papua Timur");

        System.out.println("\nList Nama Provinsi sebelum diurutkan:");
        for (String province : provinceList) {
            System.out.println(province);
        }

        Collections.sort(provinceList, Collections.reverseOrder());

        System.out.println("\nList Nama Provinsi setelah diurutkan secara descending:");
        for (String province : provinceList) {
            System.out.println(province);
        }

        // d. Implement penghapusan data untuk 5 data yang berbeda dari list bahasa pemograman yang berisikan 12 data
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("C++");
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("Golang");
        programmingLanguages.add("Swift");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("PHP");
        programmingLanguages.add("Visual Basic");
        programmingLanguages.add("HTML");
        programmingLanguages.add("CSS");

        System.out.println("\nList Bahasa Pemrograman sebelum dihapus:");
        for (String language : programmingLanguages) {
            System.out.println(language);
        }

        programmingLanguages.remove("Python");
        programmingLanguages.remove("Ruby");
        programmingLanguages.remove("Visual Basic");
        programmingLanguages.remove("HTML");
        programmingLanguages.remove("CSS");

        System.out.println("\nList Bahasa Pemrograman setelah dihapus:");
        for (String language : programmingLanguages) {
            System.out.println(language);
        }
    }
}
package tugasBE5;

public class Segitiga extends BangunDatar {

    float  alas;
    float  tinggi;
    float  sisiA;
    float  sisiB;
    float  sisiC;

    @Override
    float  luas() {
        float  luas = 1/2 * alas * tinggi;
        System.out.println("Luas Segitiga:" + luas+ " cm^2");
        return luas;
    }
    @Override
    float  keliling() {
        float keliling = (sisiA + sisiB + sisiC);
        System.out.println("Keliling Segitiga: " + keliling+ " cm");
        return keliling;
    }


}
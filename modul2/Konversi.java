
import java.util.Scanner;

class Converter{
    Scanner scan;
    int num;
    void getVal()
    {
        scan = new Scanner(System.in);
        System.out.println("Masukan Angka :");
        num = Integer.parseInt(scan.nextLine());
    }
    void convert()
    {
        String hexa = Integer.toHexString(num);
        System.out.println("Nilai Bilangan Heksadesimal : " + hexa);
        String octal = Integer.toOctalString(num);
        System.out.println("Nilai Bilangan Oktal : " + octal);
        String binary = Integer.toBinaryString(num);
        System.out.println("Nilai Bilangan Biner : " + binary);
    }
}
class Decimal_Conversion {
    public static void main(String args[]) {
       Converter obj = new Converter();
        obj.getVal();
        obj.convert();
    }
}
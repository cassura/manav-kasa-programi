import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double armut,elma,domates,muz,patlican,toplamTutar;


        System.out.println("armut kac kilo?:");
        armut = input.nextDouble();
        System.out.println("elma kac kilo?:");
        elma = input.nextDouble();
        System.out.println("domates kac kilo?:");
        domates = input.nextDouble();
        System.out.println("muz kac kilo?:");
        muz = input.nextDouble();
        System.out.println("patlican kaç kilo?:");
        patlican = input.nextDouble();

        toplamTutar = patlican*5+armut*2.14+domates*1.11+muz*0.95+elma*3.67;
        System.out.println("toplam tutar:" + toplamTutar);






    }
}
import java.util.Scanner;

public class KucuktenBuyugeSiralama {
    public static void main(String[] args) {
        int sayi1, sayi2, sayi3;

        Scanner input= new Scanner(System.in);
        System.out.print("Ilk Sayisi(sayi1) Giriniz: ");
        sayi1=input.nextInt();

        System.out.print("Ikinci Sayiyi(sayi2) Giriniz: ");
        sayi2=input.nextInt();

        System.out.print("Ucuncu Sayiyi(sayi3) Giriniz: ");
        sayi3=input.nextInt();
        
        if (sayi1<sayi2 && sayi1<sayi3){
            if (sayi2<sayi3){
                System.out.println(sayi1 + "<" + sayi2 + "<" + sayi3);
            }
            else {
                System.out.println(sayi1 + "<" + sayi3 + "<" + sayi2);
            }
        } else if (sayi2<sayi1 && sayi2<sayi3) {
            if (sayi1<sayi3){
                System.out.println(sayi2 + "<" + sayi1 + "<" + sayi3);
            }
            else{
                System.out.println(sayi2 + "<" + sayi3 + "<" + sayi1);
            }
        } else if (sayi3<sayi1 && sayi3<sayi2) {
            if (sayi1<sayi2){
                System.out.println(sayi3 + "<" + sayi1 + "<" + sayi2);
            }
            else {
                System.out.println(sayi3 + "<" + sayi2 + "<" + sayi1);
            }
        }
    }
}

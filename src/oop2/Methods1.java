package oop2;

public class Methods1 {
    public static void main(String[] args) {
        int[] sayilar = new int[] {1, 2, 5, 7, 8, 9, 5, 33} ;
        int aranacak = 11;

        boolean varMi = sayiBulma(sayilar,aranacak);
        if (!varMi){
            System.out.println("sayi yok");
        } else {
            System.out.println("sayi var");
        }
    }
    public static boolean sayiBulma(int[] numbers,int aranacak){

        boolean x = false;
        for (int a:numbers) {
            if (a == aranacak) {
                x = true;
                break;
            }
        }

        return x;
    }
}

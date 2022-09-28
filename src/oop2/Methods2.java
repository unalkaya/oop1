package oop2;

public class Methods2 {
    public static void main(String[] args) {
        create();
        read();
        delete();
        update();
        int toplam = topla(1,2,3,5,32,54,45,76,23,56);
        System.out.println(toplam);
    }
    public static void create(){
        System.out.println("eklendi");
    }
    public static void delete(){
        System.out.println("silindi");
    }
    public static void update(){
        System.out.println("güncellendi");
    }
    public static void read(){
        System.out.println("okundu");
    }

    public static int topla(int... sayilar){
        int toplam = 0;
        for (int i : sayilar) {
            toplam = toplam + i;
        }
        return toplam;
    }
}

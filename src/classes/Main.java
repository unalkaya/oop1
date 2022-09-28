package classes;

public class Main {
    public static void main(String[] args) {

        // new pahalıdır! sadece ihtiyac duyduğunda getirirsin.

        CustomerManager customerManager = new CustomerManager();
        customerManager.name="1";
        CustomerManager customerManager2 = new CustomerManager();
        customerManager2.name="2";

        customerManager=customerManager2;

        System.out.println(customerManager.name);
        customerManager.ekle();
        customerManager.guncelle();
        customerManager.oku();
        customerManager.sil();

        //int-double vb değer tip olarak tutulur.
        //ama int-double gibi diziler referans tip

        DortIslemExample dortIslemExample = new DortIslemExample();

        int sonuc = dortIslemExample.bol(22,11);

        System.out.println(sonuc);

    }
}

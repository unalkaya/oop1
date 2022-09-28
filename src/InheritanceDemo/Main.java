package InheritanceDemo;

public class Main {
    public static void main(String[] args) {
        //Bir class sadece bir tane class'ı extend edebilir.

        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        ogretmenKrediManager.hesapla();

        KrediUI krediUI= new KrediUI();
        krediUI.KrediHesapla(new TarimKrediManager());
        krediUI.KrediHesapla(new OgretmenKrediManager());
        krediUI.KrediHesapla(new AskerKrediManager());
    }
}

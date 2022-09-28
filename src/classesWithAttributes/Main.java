package classesWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product2 product2 = new Product2();
        product2.setName("Laptop");
        product2.setId(1);
        product2.setDescriptipn("Asus Laptop");
        product2.setStockAmount(3);
        System.out.println(product2.getName());

        ProductManager productManager = new ProductManager();
        productManager.productAdd(product2);

        //Ürün nesnesinde ürüne ait özellikler
        //Ürün Manager'da Ürüne ait operasyonlar burada single responsibility i bırakma.

    }
}

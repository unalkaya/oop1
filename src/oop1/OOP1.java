package oop1;

public class OOP1 {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.name="Delonghi Kahve Makinesi";
        product1.unitPrice=7500;
        product1.discount=7;
        product1.unitInStock=3;
        product1.imageUrl="bilmemne.jpg";

        Product product2 = new Product();
        product2.setName("Simp Kahve Makinesi");
        product2.unitPrice=8000;
        product2.discount=3;
        product2.unitInStock=9;
        product2.imageUrl="bilmemne.jpg";

        Product product3 = new Product();
        product3.name="Kitch Kahve Makinesi";
        product3.unitPrice=5000;
        product3.discount=10;
        product3.unitInStock=1;
        product3.imageUrl="bilmemne.jpg";

        Product[] products = {product1,product2,product3};

        System.out.println("<ul>");
        for (Product product: products) {
            System.out.println("<li>"+product.name+"</li>");
        }
        System.out.println("</ul>");


        IndividualCustomer individualCustomer = new IndividualCustomer();

        individualCustomer.setId(001);
        individualCustomer.setCustomerNumber("241341234");
        individualCustomer.setPhone("546354355");
        individualCustomer.setFirstName("Ünal");
        individualCustomer.setLastName("Kaya");

        CorporateCustomer corporateCustomer = new CorporateCustomer();

        corporateCustomer.setId(002);
        corporateCustomer.setCustomerNumber("214");
        corporateCustomer.setPhone("0504535546");
        corporateCustomer.setCompanyName("sfasfasfas");
        corporateCustomer.setTaxNumber("3564356436");



    }
}

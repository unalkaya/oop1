package classesWithAttributes;

public class Product2 {
    public Product2(int id, String name, String descriptipn,double price,int stockAmount){
        System.out.println("Constructor triggered");
        this.id=id;
        this.name=name;
        this.descriptipn=descriptipn;
        this.price=price;
        this.stockAmount=stockAmount;
    }
    public Product2(){
        System.out.println("Constructor triggered");
    }
    private int id;
    private String name;
    private String descriptipn;
    private double price;
    private int stockAmount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptipn() {
        return descriptipn;
    }

    public void setDescriptipn(String descriptipn) {
        this.descriptipn = descriptipn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
}

public class Product {
    private String name;
    private double price;
    private int quantity;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public Product(){

    }

    public Product(String productName, double productPrice, int productQuantity){
        setName(productName);
        setPrice(productPrice);
        setQuantity(productQuantity);
    }


}

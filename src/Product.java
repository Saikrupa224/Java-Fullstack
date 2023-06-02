public class Product {
    public double price = 250.0d;
    public double getPrice(){
        return price;
    }
    public double getPrice(int quantity){
        double Finalprice = quantity * price;
        return Finalprice;
    }

    public void setPrice(double price){
        this.price = price;
    }
}

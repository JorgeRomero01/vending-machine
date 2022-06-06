public class Item {
    private String name;
    private double price;
    private int quantity;

    Item(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Item(Item item){
        this.name = item.name;
        this.price = item.price;
        this.quantity = item.quantity;
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public String toString(){
        return this.name + ": " + this.price + " " + "(" + this.quantity + ")";
    }

}

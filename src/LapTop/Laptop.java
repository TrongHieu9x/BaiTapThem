package LapTop;

public class Laptop {
    private static int VALUE = 1;
    private static int id;
    private String firm;
    private String color;
    private double price;
    private int amount;

    public Laptop() {
    }

    public Laptop(int id, String firm, String color, double price, int amount) {
        this.id = ++VALUE;
        this.firm = firm;
        this.color = color;
        this.price = price;
        this.amount = amount;
    }

    public static int getId() {
        return VALUE;
    }

    public void setId(int id) {
        this.id = VALUE;
    }

    public String getFirm() {
        return firm;
    }

    public void setName(String firm) {
        this.firm = firm;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", firm='" + firm + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }

}

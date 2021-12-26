package Fruit;

public class Apple extends Fruit {

    public Apple(double weight, String taste, String color, double price) {
        super( weight, taste, color, price);
    }

    public double getWeight() {
        return super.getWeight();
    }

    public void setWeight(double weight) {
        super.setWeight(weight);
    }

    public String getTaste() {
        return super.getTaste();
    }

    public void setTaste(String taste) {
        super.setTaste(taste);
    }

    public String getColor() {
        return super.getColor();
    }

    public void setColor(String color) {
        super.setColor(color);
    }

    public double getPrice() {
        return super.getPrice();
    }

    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public String toString() {
        return "Apple{}";
    }
}

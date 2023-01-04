package HW3_JavaCore.Task2;
import java.util.ArrayList;

public class Box {
    private ArrayList<Fruit> product = new ArrayList<>();

    public Box() {
        ArrayList<Fruit> product = new ArrayList<>();
    }


    public double getWeight() {

        double weightSum = 0.0f;
        for (Fruit e : product) {
            weightSum += e.getWeight();
        }
        return weightSum;
    }

    public ArrayList<Fruit> getProduct() {
    return product;
    }


    public void add(Fruit fruit) {
        if (product.size() > 1) {
            if (comparableProd(fruit)) {
                throw new BoxCustom("Нельзя яблоки высыпать в коробку с апельсинами!");
            }
        }
        product.add(0, fruit);
    }

    public boolean compare(Box otherVeg) {
        return Math.abs(getWeight() - otherVeg.getWeight()) < 0.001;
    }

    public void removeSingleItem() {
    }

    public void shiftSingleItem(Box box2) throws BoxCustom {

        if (comparableProd(box2)) {
            throw new BoxCustom("Нельзя яблоки высыпать в коробку с апельсинами!");
        }
        for (int i = product.size() - 1; i >= 0; i--) {
            box2.getProduct().add(product.get(i));
            product.remove(i);
        }
    }
    public boolean comparableProd(Box otherBox) {
        return product.get(0).getClass() != otherBox.getProduct().get(0).getClass();
    }
    public boolean comparableProd(Fruit fruit) {
        return product.get(0).getClass() != fruit.getClass();
    }

}


import base.Pizzaitaliana;
import base.Topping;

// Press Shift twice to open the Search Everywhere dialog and type show whitespaces,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Pizzaitaliana pizza = new Pizzaitaliana("pizza Margarita", 10.99,"la cream");
        pizza.addTopping(new Topping("Tomate"));
        pizza.addTopping(new Topping("Cheese"));
        pizza.addTopping(new Topping("Basil"));
        pizza.prepare();
        System.out.println("Salsa:"+pizza.getSalsa());


    }
}
package base;



public class Pizzaitaliana extends Pizza {
    private String salsa;

    public Pizzaitaliana(String name, double price, String salsa, Topping... toppings) {
        super(name, price, toppings);
        this.salsa = salsa;

    }

    public String getSalsa() {
        return salsa;
    }
}

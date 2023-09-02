package interfaces;

public abstract class pizzabase  implements Iprerable{
    private String nombre;
    private Double precio;
    public pizzabase (String nombre, double precio){
        this.nombre=nombre;
        this.precio = precio;


    }
    @Override
    public void prepare (){
        System.out.println("lA PIZZA SE ESTA PREPARANDO");
    }

}

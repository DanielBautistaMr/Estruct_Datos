
package perro;

public class Main {
    public static void main(String[] args) {

        Perro miPerro = new Perro("marrón", "Gran Danés", 1, "Jose Manuel");

        System.out.println("Mi perro se llama " + miPerro.getNombre() +
                           " de raza " + miPerro.getRaza() +
                           "tiene el pelaje de color " + miPerro.getColorPelaje() +
                            " tiene tan solo " + miPerro.getEdad() + " año");

      
        miPerro.jugar();
        miPerro.correr();
        miPerro.olfatear();
        
      

      
    }
}
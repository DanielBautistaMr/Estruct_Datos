
package perro;

public class Perro {
    
    // Atributos
    private String colorPelaje;
    private String raza;
    private int edad;
    private String nombre;
    
    // Constructor
    public Perro(String colorPelaje, String raza, int edad, String nombre) {
        this.colorPelaje = colorPelaje;
        this.raza = raza;
        this.edad = edad;
        this.nombre = nombre;
    }
    
    // Getters y Setters
    public String getColorPelaje() {
        return colorPelaje;
    }
    
    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }
    
    public String getRaza() {
        return raza;
    }
    
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Métodos
    public void jugar() {
        System.out.println("El perro muerde el balon");
    }
    
    public void correr() {
        System.out.println("Estoy corriendo");
    }
    
    public void olfatear() {
        System.out.println("Estoy oliendo algo");
    }
}



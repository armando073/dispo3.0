public class Dispositivo {
    //Atributos
    public String nombre;
    String tipo;
    public boolean activo;

    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Tipo: "+tipo);
        System.out.println("Activo: "+activo);
    }

    void mostrarEstado(){
        String estado = activo? "Activo": "Inactivo"; //Variable con un condicional if else (terciario).
        System.out.println(nombre + " " + estado);
    }
}

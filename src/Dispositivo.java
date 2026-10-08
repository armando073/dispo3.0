public class Dispositivo {
    //Atributos
    private String nombre;
    private String tipo;
    private boolean activo;

    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Tipo: "+tipo);
        System.out.println("Activo: "+activo);
    }

    void mostrarEstado(){
        String estado = activo? "Activo": "Inactivo"; //Variable con un condicional if else (terciario).
        System.out.println(nombre + " " + estado);
    }
     public void setNombre(String nombre){
         if (nombre != null || !nombre.isBlank()) {
             this.nombre = nombre;
         }
     }

     public String getNombre(){
        return nombre;
     }

     public void setTipo(String tipo){
         if(tipo != null || !tipo.isBlank())
            this.tipo = tipo;
     }

     public String getTipo(){
        return tipo;
     }

     public boolean isActivo(){
        return activo;
     }

     public void setActivo(boolean activo){
        this.activo = activo;
     }
}

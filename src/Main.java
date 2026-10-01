//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Dispositivo di1 = new Dispositivo();
    Dispositivo di2 = new Dispositivo();

    di1.nombre = "Teclado";
    di1.tipo = "Entrada";
    di1.activo = true;

    di2.nombre = "Monitor";
    di2.tipo = "Salida";
    di2.activo = false;

    di1.mostrarInformacion();
    System.out.println();
    di1.mostrarEstado();
    System.out.println("\n");

    di2.mostrarInformacion();
    System.out.println();
    di2.mostrarEstado();
    di1.activo = false;
    System.out.println("\n");
    di1.mostrarEstado();

}

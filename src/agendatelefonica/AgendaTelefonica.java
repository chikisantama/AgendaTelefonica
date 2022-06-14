package agendatelefonica;

import java.util.Scanner;

public class AgendaTelefonica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        boolean salir = false;
        int opcion;

        Agenda agendaTelefonica = new Agenda(3);
        String nombre;
        int telefono;
        Contacto c;

        while (!salir) {

            System.out.println("1.Añadir Contacto");
            System.out.println("2.Listar Contacto");
            System.out.println("3.Buscar Contacto");
            System.out.println("4.Existe Contacto");
            System.out.println("5Eliminar Contacto");
            System.out.println("6.Contactos Libres");
            System.out.println("7. Agenda Llena");
            System.out.println("8.Salir");
            try {
                System.out.println("Escribe una de las opciones");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Escribe un nombre");
                        nombre = sc.next();

                        System.out.println("Escribe un telefono");
                        telefono = sc.nextInt();

                        c = new Contacto(nombre, telefono);
                        agendaTelefonica.nuevoContacto(c);

                        break;

                    case 2:
                        agendaTelefonica.listarContacto();

                        break;

                    case 3:
                        System.out.println("Escribe un nombre");
                        nombre = sc.next();

                        agendaTelefonica.buscarContacto(nombre);

                        break;

                    case 4:
                        System.out.println("Escribe un nombre");
                        nombre = sc.next();

                        c = new Contacto(nombre, 0);

                        if (agendaTelefonica.existeContacto(c)) {
                            System.out.println("Existe contacto");
                        } else {
                            System.out.println("No existe el contacto");
                        }
                        ;
                        break;

                    case 5:
                        System.out.println("Escribe un nombre");
                        nombre = sc.next();

                        c = new Contacto(nombre, 0);

                        agendaTelefonica.eliminarContacto(c);
                        break;

                    case 6:
                        System.out.println("Hay " + agendaTelefonica.huecosLibres() + " Contactos Libres");

                        break;

                    case 7:
                        if (agendaTelefonica.agendaLlena()) {
                            System.out.println("La agenda esta llena");
                        } else {
                            System.out.println("Puedes seguir metiendo contactos");
                        }

                        break;

                    case 8:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo hay numeros entre 1 y 8");
                }
            } catch (Exception e) {
                System.out.println("debes insertar numeros ");
                sc.next();
            }
        }
    }
}

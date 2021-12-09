package Controlador;

import Utils.pedir;
import Vista.menu;
import model.Alumno;
import model.Grupo;

public class Principal {
    public static void start() {
        int tamano = 0;
        double nota = 0;

        //Aqui creo los grupos y los alumnos que van a ser metidos en los arrays
        Grupo g1 = new Grupo("PrimeroSMR", tamano = pedir.leeEntero("Introduce la cantidad de alumnos que va a tener el grupo PrimeroSRM"));
        System.out.println("----------------------------------------------------------------------------------------------");

        Grupo g2 = new Grupo("SegundoSMR", tamano = pedir.leeEntero("Introduce la cantidad de alumnos que va a tener el grupo SegundoSMR"));
        System.out.println("----------------------------------------------------------------------------------------------");

        Alumno sergio = new Alumno("Sergio", nota = pedir.leeDouble("Introduce la nota que va a tener Sergio"));
        System.out.println("----------------------------------------------------------------------------------------------");

        Alumno victor = new Alumno("Victor", nota = pedir.leeDouble("Introduce la nota que va a tener Victor"));
        System.out.println("----------------------------------------------------------------------------------------------");

        Alumno prados = new Alumno("Francisco", nota = pedir.leeDouble("Introduce la nota que va a tener Francisco"));
        System.out.println("----------------------------------------------------------------------------------------------");

        Alumno rafa = new Alumno("Rafa", nota = pedir.leeDouble("Introduce la nota que va a tener Rafa"));
        System.out.println("----------------------------------------------------------------------------------------------");

        Alumno juanma = new Alumno("Juanma", nota = pedir.leeDouble("Introduce la nota que va a tener Juanma"));
        System.out.println("----------------------------------------------------------------------------------------------");

        Alumno matilda = new Alumno("Matilda", nota = pedir.leeDouble("Introduce la nota que va a tener Matilda"));
        System.out.println("----------------------------------------------------------------------------------------------");

        //Aqui a�ado a los alumnos a los diferentes grupos
        g1.anadirAlumno(sergio);
        g1.anadirAlumno(victor);
        g1.anadirAlumno(prados);

        g2.anadirAlumno(rafa);
        g2.anadirAlumno(juanma);
        g2.anadirAlumno(matilda);

        //Aqui creo un switch para que el usuario escoga la opcion que quiera que realice el programa
        //Y utilizo el do while para que no termine el programa al hacer una sola accion si que termine el programa
        //cuando el usuario introduzca un 0
        int opcion = 0;
        do {
            menu.muestraMenu();
            opcion = pedir.leeEntero("Escoge la opcion que desees");
            switch (opcion) {
                case 0:
                    System.out.println("Nos vemos sosio");
                    break;
                case 1:
                    //Imprimo las medias de los 2 grupos
                    System.out.println("La nota media de " + g1.getNombre() + " es " + g1.calculaMedia());
                    System.out.println("La nota media de " + g2.getNombre() + " es " + g2.calculaMedia());
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println();
                    break;
                case 2:
                    //Imprimo las notas mas altas de los 2 grupos
                    System.out.println("La nota mas alta de " + g1.getNombre() + " es: " + g1.notaMayor());
                    System.out.println("La nota mas alta de " + g2.getNombre() + " es: " + g2.notaMayor());
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println();
                    break;
                case 3:
                    //Imprimo las notas m�s bajas de los 2 grupos
                    System.out.println("La nota mas baja de " + g1.getNombre() + " es: " + g1.notaMenor());
                    System.out.println("La nota mas baja de " + g2.getNombre() + " es: " + g2.notaMenor());
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println();
                    break;
                case 4:
                    //Aqui muestro un submenu el cual muestra que escoga 1 o 2 dependiendo de si quiere escoger
                    //Entre PrimeroSMR o SegundoSMR respectivamente y creo un SubSwitch para que depende de lo que coja hago una cosa o otra
                    menu.escogeGrupo();
                    int opcion2 = pedir.leeEntero("Introduce el numero de la opcion que quieras escoger");
                    switch (opcion2) {
                        case 1:
                            //Modifico la nota segun el nombre que me introduzcan por teclado
                            g1.modificaNota(pedir.leeRespuesta("Introduce el nombre del alumno que quieras buscar\n" + "Es sensible a mayusculas"));
                            break;
                        case 2:
                            //Modifico la nota segun el nombre que me introduzcan por teclado
                            g2.modificaNota(pedir.leeRespuesta("Introduce el nombre del alumno que quieras buscar\n" + "Es sensible a mayusculas"));
                            break;
                        default:
                            //En caso de que no escoga uno de los 2 grupos le saltar� el siguiente mensaje
                            System.out.println("Has escogido un grupo no existente");
                            break;
                    }
                    break;
                case 5:
                    //Aqui utilizo otra vez el SubMenu que he utilizado antes para que escoga entre un grupo u otro
                    //Y utilizo un switch para hacer algo dependiendo de lo que escoga
                    menu.escogeGrupo();
                    opcion2 = pedir.leeEntero("Introduce el numero de la opci�n que quieras escoger");
                    switch (opcion2) {
                        case 1:
                            //Elimino un alumno del grupo PrimeroSMR
                            System.out.println(g1.eliminaAlumno(pedir.leeRespuesta("Introduce el nombre del alumno que quieras buscar\n" + "Es sensible a mayusculas")));
                            break;
                        case 2:
                            //Elimino un alumno del grupo SegundoSMR
                            System.out.println(g2.eliminaAlumno(pedir.leeRespuesta("Introduce el nombre del alumno que quieras buscar\n" + "Es sensible a mayusculas")));
                            break;
                        default:
                            //En caso de que haya escogido un grupo que no sea ninguno de los 2 le salte el siguiente mensaje
                            System.out.println("Has escogido un grupo no existente");
                            break;
                    }
                    break;
                case 6:
                    //Muestro los 2 grupos con sus respectivos alumnos y nostas

                    //Aqui muestro PrimeroSMR
                    System.out.println(g1);
                    System.out.println("----------------------------------------------------------------------------------------------");
                    //Aqui muestro SegundoSMR
                    System.out.println(g2);
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println();
                    break;
                default:
                    //En caso de que no escoga ninguna opcion valida que salte el siguiente mensaje
                    System.out.println("Has escogido una opci�n no v�lida");
                    break;
            }
        } while (opcion != 0);
    }
}

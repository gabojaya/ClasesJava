
import java.util.Scanner;

public class Calendario {

    public static void llenarDias(String[][] calendario) {
        calendario[0][0] = "";
        calendario[0][1] = String.format("%.3s", "Lunes");
        calendario[0][2] = String.format("%.3s", "Martes");
        calendario[0][3] = String.format("%.3s", "Miercoles");
        calendario[0][4] = String.format("%.3s", "Jueves");
        calendario[0][5] = String.format("%.3s", "Viernes");
        calendario[0][6] = String.format("%.3s", "Sabado");
        calendario[0][7] = String.format("%.4s", " Domingo");
    }

    public static void llenarHoras(String[][] calendario) {
        for (int x = 1; x < calendario[x].length - 3; x++) {

            int y = (x + 3 + x);

            calendario[x][0] = (y) + "-" + (y + 2);

        }
        calendario[5][0] = "13-14";

        for (int x = 6; x < calendario[x].length; x++) {

            int y = (x + 2 + x);

            calendario[x][0] = (y) + "-" + (y + 2);

        }
        calendario[8][0] = "18-20";
    }

    public static void showCalendario(String[][] calendario) {
        for (int x = 0; x < calendario.length; x++) {
            System.out.print("|");
            for (int y = 0; y < calendario[x].length; y++) {
                System.out.print(calendario[x][y]);
                if (y != calendario[x].length - 1)
                    System.out.print("\t");
            }
            System.out.println("|");
        }
    }

    public static void showHora() {
        System.out.println("Ingrese el numero de la hora a la que quiere agarrar cupo");
        System.out.print("1. 5am-7am  ");
        System.out.print("2. 7am-9am  ");
        System.out.print("3. 9am-11am  ");
        System.out.print("4. 11am-13pm  ");
        System.out.print("5. 13pm-14pm  ");
        System.out.print("6. 14pm-16pm  ");
        System.out.print("7. 16pm-18pm  ");
        System.out.print("8. 18pm-20pm  ");
        System.out.println("");
    }

    public static void elegirHora(int hora, int y, String materia, String[][] calendario) {
        int x = 0;
        switch (hora) {
            case 1:
                x = 1;
                llenarCalendario(x, y, materia, calendario);

                break;
            case 2:
                x = 2;
                llenarCalendario(x, y, materia, calendario);
                break;
            case 3:
                x = 3;
                llenarCalendario(x, y, materia, calendario);
                break;
            case 4:

                x = 4;
                llenarCalendario(x, y, materia, calendario);
                break;
            case 5:
                x = 5;
                llenarCalendario(x, y, materia, calendario);
                break;
            case 6:
                x = 6;
                llenarCalendario(x, y, materia, calendario);
                break;
            case 7:
                x = 7;
                llenarCalendario(x, y, materia, calendario);
                break;
            case 8:
                x = 8;
                llenarCalendario(x, y, materia, calendario);
                break;

            default:
                System.out.println("Hora incorrecta");
                break;
        }
    }

    public static void llenarCalendario(int x, int y, String materia, String[][] calendario) {
        if (calendario[x][y].equals("    ")) {
            calendario[x][y] = String.format("%.4s", materia);
        } else {
            System.out.println("Este horario ya esta ocupado");
        }

    }

    public static void main(String[] args) {

        String[][] calendario = new String[9][8];
        for (int f = 0; f < calendario.length; f++)
            for (int c = 0; c < calendario[f].length; c++)
                calendario[f][c] = "    ";
        llenarDias(calendario);

        llenarHoras(calendario);

        boolean bandera = true;
        String respuesta;
        Scanner sc = new Scanner(System.in);
        int dia = 0;
        int hora = 0;
        String materia;

        System.out.println("Bienvenido a *LLenar su Calendario Escolar* ");
        while (bandera == true) {
            System.out.println("Digito SI/NO si quiere ingresar una materia");
            respuesta = sc.next().toLowerCase();
            if (respuesta.equals("si")) {
                System.out.println("Ingrese el numero de la opcion que necesita");
                System.out.println("1.Lunes  2.Martes  3.Miercoles  4.Jueves  5.Viernes  6.Sabado  7.Domingo");
                dia = sc.nextInt();
                System.out.println("Escriba la materia que quiere");
                materia = sc.next();
                int y = 0;
                switch (dia) {
                    case 1:
                        y = 1;
                        showHora();
                        hora = sc.nextInt();
                        elegirHora(hora, y, materia, calendario);

                        break;
                    case 2:
                        y = 2;
                        showHora();
                        hora = sc.nextInt();
                        elegirHora(hora, y, materia, calendario);

                        break;
                    case 3:
                        y = 3;
                        showHora();
                        hora = sc.nextInt();
                        elegirHora(hora, y, materia, calendario);

                        break;
                    case 4:
                        y = 4;
                        showHora();
                        hora = sc.nextInt();
                        elegirHora(hora, y, materia, calendario);

                        break;
                    case 5:
                        y = 5;
                        showHora();
                        hora = sc.nextInt();
                        elegirHora(hora, y, materia, calendario);

                        break;
                    case 6:
                        y = 6;
                        showHora();
                        hora = sc.nextInt();
                        elegirHora(hora, y, materia, calendario);

                        break;
                    case 7:
                        y = 7;
                        showHora();
                        hora = sc.nextInt();
                        elegirHora(hora, y, materia, calendario);

                        break;

                    default:
                        System.out.println("Opcione incorrecta");
                        break;
                }

            } else {
                System.out.println("Usted a salido del sistema");
                bandera = false;
            }

        }
        showCalendario(calendario);
        sc.close();

    }

}

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Practica1 {
    Scanner leer = new Scanner(System.in);

    public void menu() throws IOException {
        Matriz matriz = new Matriz();
        int opcion = 0;
        do {
            System.out.println("Bienvenido al gestor de matrices.");
            System.out.println("Seleccione una opcion ingresando su indice.");
            System.out.println("1. Mostrar Matriz");
            System.out.println("2. Mostrar operaciones sobre toda la matriz");
            System.out.println("3. Mostrar operaciones por filas o columnas");
            System.out.println("4. Mostrar operaciones de ordenamiento");
            System.out.println("0. Salir");
            opcion = leerInt(0, 4);
            //Los numerales de la practica se dividieron en tres categorias para facilitar la visualizacion.
            switch (opcion) {
                case 1:
                    matriz.mostrarMatriz();
                    break;
                case 2:
                    menuOperacionesMatriz(matriz);
                    break;
                case 3:
                    menuOperacionesFilasColumnas(matriz);
                    break;
                case 4:
                    menuOperacionesOrdenamiento(matriz);
                    break;
                case 0:
                    System.out.println("Adios!");
                    break;

            }
        }while(opcion != 0);

    }

    public void menuOperacionesMatriz(Matriz matriz){
        int opcion = 0;
        do {
            System.out.println("Seleccione la operacion que desea realizar.");
            System.out.println("1. Hallar la suma de los terminos de la matriz");
            System.out.println("2. Hallar el mayor valor en la matriz");
            System.out.println("3. Hallar el menor valor en la matriz");
            System.out.println("4. Mostrar el numero de veces que se repite cada dato");
            System.out.println("5. Mostrar el promedio de los datos de la tridiagonal principal");
            System.out.println("0. Volver al menu principal");
            opcion = leerInt(0,5);
            switch (opcion){
                case 1:
                    matriz.sumaDatosMatriz();
                    break;
                case 2:
                    matriz.mayorValor();
                    break;
                case 3:
                    matriz.menorValor();
                    break;
                case 4:
                    matriz.repeticionDatos();
                    break;
                case 5:
                    matriz.promedioTridiagonal();
                    break;
            }
        }while(opcion != 0);
    }

    public void menuOperacionesFilasColumnas(Matriz matriz){
        int opcion = 0;
        do {
            System.out.println("Seleccione la operacion que desea realizar.");
            System.out.println("1. Mostrar el mayor dato de cada fila");
            System.out.println("2. Mostrar el menor dato de cada columna");
            System.out.println("3. Mostrar el dato con la mayor suma de digitos en cada fila");
            System.out.println("4. Intercambiar los datos de una fila con los de una columna");
            System.out.println("0. Volver al menu principal");
            opcion = leerInt(0,4);
            switch (opcion){
                case 1:
                    matriz.mayorDatoCadaFila();
                    break;
                case 2:
                    matriz.menorDatoCadaColumna();
                    break;
                case 3:
                    matriz.datoMayorSumaDigitosCadaFila();
                    break;
                case 4:
                    matriz.intercambiaUnaFilaConColumna();
                    break;
            }
        }while(opcion != 0);
    }

    public void menuOperacionesOrdenamiento(Matriz matriz){
        int opcion = 0;
        do {
            System.out.println("Seleccione la operacion que desea realizar.");
            System.out.println("1. Ordenar la matriz ascendentemente por filas");
            System.out.println("2. Ordenar cada fila descendentemente");
            System.out.println("3. Ordenar descendentemente por fila 1?");
            System.out.println("4. Ordenar ascendentemente los digitos de cada dato de la tridiagonal segundaria");
            System.out.println("0. Volver al menu principal");
            opcion = leerInt(0,4);
            switch (opcion){
                case 1:
                    matriz.ordenarAscendentePorFilas();
                    break;
                case 2:
                    matriz.ordenarCadaFilaDescendente();
                    break;
                case 3:
                    matriz.ordenarDescendentePorFilaUno();
                    break;
                case 4:
                    matriz.ordenarAscendenteDigitosTridiagonalSegundaria();
                    break;
            }
        }while(opcion != 0);
    }

    public int leerInt(int min, int max){
        //Metodo para leer un Entero ingresado por el usuario, valido en un intervalo y con manejo de excepciones.
        int n = min-1;
        while(true){
            try{
                n = Integer.parseInt(leer.nextLine());
            }catch (InputMismatchException ex){
                System.out.println("El numero debe estar entre "+min+" y "+ max);
            }
            if(n<= max && n>= min) break;
            System.out.println("El numero debe estar entre "+min+" y "+max);
        }
        return n;
    }

    public static void main(String[] args) throws IOException {
        Practica1 practica = new Practica1();
        practica.menu();
    }
}

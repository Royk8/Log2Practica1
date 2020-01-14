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
                    menuOperacionesMatriz();
                    break;
                case 3:
                    menuOperacionesFilasColumnas();
                    break;
                case 4:
                    menuOperacionesOrdenamiento();
                    break;
                case 0:
                    System.out.println("Adios!");
                    break;

            }
        }while(opcion != 0);

    }

    public void menuOperacionesMatriz(){
        System.out.println("Seleccione la operacion que desea realizar.");
    }

    public void menuOperacionesFilasColumnas(){

    }

    public void menuOperacionesOrdenamiento(){

    }

    public int leerInt(int min, int max){
        int n = -1;
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

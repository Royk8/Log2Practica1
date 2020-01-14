import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Matriz {
    private int M[][];
    private int orden;

    public Matriz ()throws IOException {
        //Constructor de la matriz que lee los datos desde un archivo de texto
        BufferedReader leerArchivo = null;
        try{
            leerArchivo = new BufferedReader(new FileReader(
                    "D:\\Roy\\Cosas Udea\\Java 2019-2\\Practicas Logica\\Log2Practica1\\Matriz.txt"));
            String linea;
            int numeroLinea = 0;
            int orden=0;
            while((linea = leerArchivo.readLine()) != null){
                if (numeroLinea == 0){
                    orden = Integer.parseInt(linea);
                    M = new int[orden+1][orden+1];
                    this.orden = orden;
                    numeroLinea++;
                    continue;
                }
                String[] numeros = linea.split(" ");
                for(int j = 1; j <= orden; j++){
                    M[numeroLinea][j] = Integer.parseInt(numeros[j-1]);
                }
                numeroLinea++;
            }
        }finally {
            if(leerArchivo != null){
                leerArchivo.close();
            }
        }

    }

    public Matriz (int n){
        //Constructor basico de la matriz
        M = new int[n+1][n+1];
        orden= n;
    }



    public void mostrarMatriz(){
        System.out.println("La matriz de orden " + orden + " es la siguiente: ");
        for(int i = 1; i <= orden; i++){
            for(int j = 1; j<= orden; j ++) System.out.print(M[i][j]+" ");
            System.out.println("");
        }
    }
}

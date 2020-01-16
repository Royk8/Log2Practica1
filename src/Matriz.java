import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Matriz {
    private int M[][];
    private int orden;

    public Matriz ()throws IOException {
        //Constructor de la matriz que lee los datos desde un archivo de texto

        //Se usa para encontrar la direccion del archivo y almacenarla en la variable 'ruta'.
        File archivo = new File(System.getProperty("user.dir"));
        String ruta = archivo.getAbsolutePath()+"\\Matriz.txt";

        BufferedReader leerArchivo = null;
        try{
            leerArchivo = new BufferedReader(new FileReader(ruta));
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
        //Metodo que imprime los valores de la matriz
        System.out.println("La matriz de orden " + orden + " es la siguiente: ");
        for(int i = 1; i <= orden; i++){
            for(int j = 1; j<= orden; j ++) System.out.print(M[i][j]+" ");
            System.out.println("");
        }
    }

    public void sumaDatosMatriz(){
        //Metodo que retorna un entero con la suma de los datos de la matriz
        int suma = 0;
        for(int i = 1; i <= orden; i++){
            for (int j = 1; j <= orden; j++)
                suma = suma + M[i][j];
        }
        System.out.println("La suma de todos los datos de la matriz es: " + suma);
    }

    public void mayorValor(){
        //Metodo que imprime el mayor valor de la matriz y su posicion
        int mayor = 0, iMayor = -1, jMayor = -1;
        for (int i = 1; i <= orden; i++){
            for(int j = 1; j <= orden; j++){
                if (M[i][j] > mayor){
                    mayor = M[i][j];
                    iMayor = i;
                    jMayor = j;
                }
            }
        }
        System.out.println("El mayor valor de la matriz es " + mayor +
                " y se encuentra en la posicion [" + iMayor + "][" + jMayor + "]");
    }

    public void menorValor(){
        //Metodo que imprime el menor valor de la matriz y su posicion
        int menor = 0, iMenor = -1, jMenor = -1;
        for (int i = 1; i <= orden; i++){
            for(int j = 1; j <= orden; j++){
                if (M[i][j] < menor){
                    menor = M[i][j];
                    iMenor = i;
                    jMenor = j;
                }
            }
        }
        System.out.println("El menor valor de la matriz es " + menor +
                " y se encuentra en la posicion [" + iMenor + "][" + jMenor + "]");
    }

    public void repeticionDatos(){

    }

    public void promedioTridiagonal(){

    }

    public void mayorDatoCadaFila(){

    }

    public void menorDatoCadaColumna(){

    }

    public void datoMayorSumaDigitosCadaFila(){

    }

    public void intercambiaUnaFilaConColumna(){

    }

    public void ordenarAscendentePorFilas(){

    }

    public void ordenarCadaFilaDescendente(){

    }

    public void ordenarDescendentePorFilaUno(){

    }

    public void ordenarAscendenteDigitosTridiagonalSegundaria(){

    }
}

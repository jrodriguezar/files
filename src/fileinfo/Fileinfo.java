package fileinfo;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jrodriguezar
 */
public class Fileinfo {

    public static void main(String[] args) throws FileNotFoundException{
        ArrayList<Integer> arreglin = new ArrayList<Integer>();
        int a = 0;
        Scanner lectura = new Scanner(System.in);
        a = lectura.nextInt();
        Scanner input = new Scanner(new File("izi/fua.txt"));
        //int count = 0;
        //int number = input.nextInt();
        while(input.hasNextInt()){
            //String word = input.next();
            int number = input.nextInt();
            System.out.println("Numeros encontrados: ");
            System.out.println(number);
        }
        
        
        PrintStream out = new PrintStream("izi/fua.txt");
        out.println(a);
        
        
        
        
        
        
        /*File archivo = new File("izi");//ruta relativa
        System.out.println(archivo.exists());
        System.out.println(archivo.isDirectory());
        
        System.out.println(archivo.exists());
        System.out.println(archivo.isDirectory());
        if (archivo.isDirectory()) {
            File files[] = archivo.listFiles();
            String lista[] = archivo.list();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()){
                    System.out.println("spotm");
                }else{
                    System.out.println(files[i].getName());
                }
            }    
        }*/
    }
}

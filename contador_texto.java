package contador_texto;

import java.io.*;
import java.util.*;
/**
 *
 * @author VIVIAN
 */
public class Contador_texto {
      
 //D:\\Vivian\\Documentos\\NetBeansProjects\\Contador_texto\\vendors.csv
    //public static void main (String [] arg){
    //File archivo = new File(t); 
      //  BufferedReader br = new BufferedReader(new FileReader(archivo)); 
    // 
    
    public static void main(String[] args)throws FileNotFoundException, IOException {
   //     try {
       Scanner sc = new Scanner(System.in); 
       System.out.println("Nombre del archivo");  
       String t;
       t = sc.nextLine();
    //if(t = true){
        File archivo = new File(t); 
        BufferedReader br = new BufferedReader(new FileReader(archivo));  
        String lc;  
        String[] lector; 
        int x=0;  //numeros de Lineas 
        int y=0; //num caracteres
        int z=0; // num palabras 
        while ((lc = br.readLine()) != null){  
        x++; 
        lector=lc.split(""); 
        y = y + lector.length; 
        StringTokenizer tokens = new StringTokenizer(lc.replaceAll("\\d*\\W"," ")); 
        z=z+tokens.countTokens();
        }
        System.out.println("Lineas:"+x);
        System.out.println("Caracteres:"+y);
        System.out.println("Palabras:"+z);
  // }
    //else ()
    //{
      //  System.out.println("");
    //}
    
//}catch( IOExeption ) {
// e.printStacktTrace();
//}
    }
}

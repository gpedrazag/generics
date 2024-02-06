/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.estDatos.generics;

/**
 *
 * @author SG702-21
 */
public class GenericsMethods {

    /**
     * @param args the command line arguments
     */

    public static <T> boolean isEqual(GenericsType <T> g1,
            GenericsType <T> g2){
        return g1.get().equals(g2.get());
    }
    
    //Java generics bouded type parameter
    public static <T extends Comparable <T>> int compare(T t1,T t2){
        return t1.compareTo(t2);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        GenericsType <String> g1=new GenericsType <>();
        g1.set("cualquier cosa");
        
        GenericsType <String> g2=new GenericsType <>();
        g2.set("cadena");
        //Una forma de invocar el metodo
        boolean isEqual=GenericsMethods.<String>isEqual(g1,g2);
        //Otra forma de invocar el metod
        isEqual=GenericsMethods.isEqual(g1, g2);
        
        System.out.println("Son iguales? "+isEqual);
      
    }
    
}

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
public class GenericsType <T>{

    /**
     * @param args the command line arguments
     */
    
    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        GenericsType <String> type=new GenericsType <>();
        type.set("cualquier cosa");
        String str= type.get();
        System.out.println("valor "+str);
        
        GenericsType type2=new GenericsType();
        type2.set("cualquier cosa");
        type2.set(55);
        
    }
    
}

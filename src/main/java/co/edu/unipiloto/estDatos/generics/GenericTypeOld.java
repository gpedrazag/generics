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
public class GenericTypeOld {

    /**
     * @param args the command line arguments
     */
    private Object t;
    
    public Object get(){
        return t;
    }

    public void set(Object t) {
        this.t = t;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        GenericTypeOld type=new GenericTypeOld();
        type.set("cualquier cosa");
        String str=(String) type.get();
        System.out.println("valor "+str);
                
    }
    
}

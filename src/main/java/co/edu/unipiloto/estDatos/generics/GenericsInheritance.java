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
public class GenericsInheritance {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        String str="abc";
        Object obj=new Object();
        obj=str;
        
        MyClass <String> myClass1=new MyClass <>();
        MyClass <Object> myClass2=new MyClass <>();
        //myClass2=myClass1;
        obj=myClass1;
        
    }
    
    public static class MyClass<T>{
        
    }
}

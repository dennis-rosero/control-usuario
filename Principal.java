/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author DESKTOP
 */
public class Principal {
    
    public static void main(String[] args ){
    
        Locales obj1= new Locales("Comercial",50,5);
        Nike obj2= new Nike("Zapatos",80,10,"37");
        Adidas obj3= new Adidas();
        
        System.out.println(obj1.getTipo()+obj1.getGanancias()+obj1.getNLocal());
        System.out.println(obj2.getTipo()+obj2.getGanancias()+obj2.getNLocal()+obj2.getTalla());
        obj1.comprar();
        obj2.vender();
        obj3.vender();
        
    
    }
}

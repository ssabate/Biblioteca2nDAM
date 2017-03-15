/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mvchibernate;

import mvchibernate.view.VistaActors;
import mvchibernate.controller.Controlador;
import mvchibernate.model.Model;

/**
 *
 * @author profe
 */
public class MVCHibernate {
    
    static Model modelo=new Model();
    //static Model model=new Model();
    static VistaActors vista=new VistaActors();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Controlador(modelo, vista);
    }
    
}

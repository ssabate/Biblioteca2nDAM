/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvchibernate.model;

import org.hibernate.Session;
import utils.HibernateUtil;

/**
 *
 * @author alumne
 */
public class Model {

    private static Session sesio=HibernateUtil.getSessionFactory().openSession();
    private ClasseDAO<Actors> classeDAOActors=new ClasseDAO<>(Actors.class, sesio);

    public ClasseDAO<Actors> getClasseDAOActors() {
        return classeDAOActors;
    }
    
    
    public void tancaSessio() {
        sesio.close();
    }

}

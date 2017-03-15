/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mvcdb4o.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.ConstraintMode;

/**
 *
 * @author profe
 */
@Entity
@Table(name="actors")
public class Actors implements Comparator<Actors> {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="actor_id")
    private int _1_actor_id;
    
    @Column(name="first_name")
    private String _2_first_name;
    @Column(name="last_name")
    private String _3_last_name;
    
    @ManyToMany(fetch=javax.persistence.FetchType.EAGER, cascade=javax.persistence.CascadeType.ALL)
    @JoinTable(name="ACTORS_AFINS", foreignKey=@javax.persistence.ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Collection<Actors> _4_afins=new ArrayList<>();

    

    

    public Actors() {
    }

    public Actors(String first_name, String last_name) {
        this._2_first_name = first_name;
        this._3_last_name = last_name;
    }

    public String get3_last_name() {
        return _3_last_name;
    }

    public void set3_last_name(String _3_last_name) {
        this._3_last_name = _3_last_name;
    }
 
    public String get2_first_name() {
        return _2_first_name;
    }

    public void set2_first_name(String _2_first_name) {
        this._2_first_name = _2_first_name;
    }

    @Override
    public int compare(Actors o1, Actors o2) {
        return o1.get1_actor_id()-o2.get1_actor_id(); //To change body of generated methods, choose Tools | Templates.
    }

    public int get1_actor_id() {
        return _1_actor_id;
    }

    public void set1_actor_id(int _1_actor_id) {
        this._1_actor_id = _1_actor_id;
    }

    @Override
    public String toString() {
        return _2_first_name + " " + _3_last_name;
    }

    public Collection<Actors> get4_afins() {
        return _4_afins;
    }

    public void set4_afins(Collection<Actors> _4_afins) {
        _4_afins.remove(this);
        this._4_afins = _4_afins;
    }

    
    
}

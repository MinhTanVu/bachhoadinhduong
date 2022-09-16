/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bhddweb.business;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author danhl
 */
@Entity
@Table(name = "typedb", catalog = "databasebhdd", schema = "public")
public class Type implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    
    @Column(name = "idtype")
    @Basic(optional = false)
    private int idType;
    
    @Column(name = "nametype")
    @Basic(optional = false)
    private String nameType;
    
    public void setId(int id){
        this.idType = id;
    }
    
    public int getId(){
        return this.idType;
    }
    
    public void setType(String type){
        this.nameType = type;
    }
    
    public String getType(){
        return this.nameType;
    }
}

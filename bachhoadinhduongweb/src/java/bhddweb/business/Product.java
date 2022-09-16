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
@Table(name = "productdb", catalog = "databasebhdd", schema = "public")
public class Product implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "idproduct")
    @Basic(optional = false)
    private int idProduct;
    
    @Column(name = "nameproduct")
    @Basic(optional = false)
    private String nameProduct;
    
    @Column(name = "numstar")
    private int numStar;
    
    @Column(name = "numreview")
    private int numReview;
    
    @Column(name = "notenum")
    private String noteNum;
    
    @Column(name = "price")
    private int price;
    
    @Column(name = "description")
    private String description;
    
    @Column (name = "idtype")
    @Basic(optional = false)
    private int idType;
    
    public void setId(int id){
        this.idProduct = id;
    }
    
    public int getId(){
        return this.idProduct;
    }
    
    public void setName(String name){
        this.nameProduct = name;
    }
    
    public String getName(){
        return this.nameProduct;
    }
    
    public void setNumstar(int num){
        this.numStar = num;
    }
    
    public int getNumstar(){
        return this.numStar;
    }
    
    public void setNumreview(int num){
        this.numReview = num;
    }
    
    public int getNumreview(){
        return this.numReview;
    }
    
    public void setNotenum(String note){
        this.noteNum = note;
    }
    
    public String getNotenum(){
        return this.noteNum;
    }
    
    public void setPrice(int price){
        this.price = price;
    }
    
    public int getPrice(){
        return this.price;
    }
    
    public void setDescription(String Desp){
        this.description = Desp;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public void setIdtype(int id){
        this.idType = id;
    }
    
    public int getIdtype(){
        return this.idType;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bhddweb.business;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "userdb", catalog = "databasebhdd", schema = "public")
public class User implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "iduser")
    private int idUser;
    @Basic(optional = false)
    @Column(name = "firstname")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "lastname")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Column(name = "phonenumber")
    private String phoneNumber;
    @Column(name = "address")
    private String address;
    @Column(name = "creditcardtype")
    private String creditcardType;
    @Column(name = "creditcardnumber")
    private String creditcardNumber;
    @Column(name = "creditCardexprationdate")
    private java.sql.Date creditCardExpirationDate;
    
     
    
    
    public void setId(int id){
        this.idUser = id;
    }
    
    public int getId(){
        return this.idUser;
    }
    
    public void setFirstname(String firstName){
        this.firstName = firstName;
    }
    
    public String getFirstname(){
        return this.firstName;
    }
    
    public void setLastname(String lastName){
        this.lastName = lastName;
    }
    
    public String getLastname(){
        return this.lastName;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public void setPhonenumber(String numphone){
        this.phoneNumber = numphone;
    }
    
    public String getPhonenumber(){
        return this.phoneNumber;
    }
    
    public void setCreditcardType(String creditType){
        this.creditcardType  = creditType;
    }
    
    public String getCreditcardType(){
        return this.creditcardType;
    }
    
    public void setCreditcardNumber(String creditNum){
        this.creditcardNumber = creditNum;
    }
    
    public String getCreditcardNumber(){
        return this.creditcardNumber;
    }
    
    public void setCreditcardExpDate(String creditExp){
        java.sql.Date creditcardExpDate = java.sql.Date.valueOf(creditExp);
        this.creditCardExpirationDate = creditcardExpDate;
    }
    
    public String getCreditcardExpDate(){
        String creditExp = String.valueOf(this.creditCardExpirationDate);
        return creditExp;
    }
}

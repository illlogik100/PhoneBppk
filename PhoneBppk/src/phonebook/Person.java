/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phonebook;

/**
 *  @author RK Johnson
 *
 * A class to build my Person objects
 * 
 */
public class Person {


    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    

    //RJ Person constructor
    public Person(String firstName, String lastName, String email, String phoneNumber) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Person(String firstName, String lastName) 
    {
        this(firstName, lastName, null, null);
    }

    public String getFirstName() 
    {
        return firstName;
    }

    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    public String getEmail() 
    {
        return email;
    }

    public String getFullName(){
        
        return firstName + " " + lastName;
    }
    
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }
    
    public boolean isEqual(String fullName)
    {
        return this.getFullName().compareTo(fullName)==0;
    }
    
    public boolean isLessThan(String fullName)
    {
        return this.getFullName().compareTo(fullName) < 0;
    }
    
    public boolean isGreaterThan(String fullName)
    {
        return this.getFullName().compareTo(fullName) > 0;
       
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(this.getFirstName()).append(" ")
                .append(this.getLastName()).append(" : ")
                .append(this.getPhoneNumber()).append(" : ")
                .append(this.getEmail()).append("")
                .toString()
                ;
    }
    
}

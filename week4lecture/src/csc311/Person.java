package csc311;


public class Person implements Actor
{
    
    protected String firstName;
    protected String lastName;
    
    
    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
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
    
    
    public String getFullName()
    {
        return this.firstName + " " + this.lastName;
    }
    
    
    public String getLabel()
    {
        return "ImAPerson";
    }
    
    
    public String getName()
    {
        return getFullName();
    }
    
    
}

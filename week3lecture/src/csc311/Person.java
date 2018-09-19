// Michael Gates
// 16 September 2018


package csc311;

public class Person
{
    
    private String firstName;
    private String lastName;
    
    private String phoneNumber;
    
    
    Person(String firstName, String lastName, String phoneNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
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
    
    
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    
    
    public int addValues(int... values)
    {
        int sum = 0;
        
        for (int i : values)
        {
            sum += i;
        }
        return sum;
    }
    
    
    public long afunction(long x)
    {
        return x * 10;
    }
    
}

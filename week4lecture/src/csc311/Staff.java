package csc311;

public class Staff extends Person
{
    
    public Staff(String firstName, String lastName)
    {
        super(firstName, lastName);
    }
    
    
    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof Staff))
        {
            return false;
        }
        Staff s2 = (Staff) o;
        return firstName.equals(s2.getFirstName()) && lastName.equals(s2.getLastName());
    }
}

package csc311;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWeek3Assignment
{
    
    private static final String JANE_PHONE_NUMBER = "222 333-456";
    
    
    @Test
    public void testPhoneNumberWithInvalidDefinition()
    {
        Person john = new Person("john", "smith", "123 456-7890");
        Person jane = new Person("jane", "doe", JANE_PHONE_NUMBER);
        
        assertEquals(JANE_PHONE_NUMBER, jane.getPhoneNumber());
    }
    
    
    @Test
    public void testLastName()
    {
        Person jane = new Person("jane", "doe", JANE_PHONE_NUMBER);
        jane.setLastName("new last name");
        
        assertEquals("new last name", jane.getLastName());
    }
    
    
    @Test
    /* this does not compile, change the implementation */
    public void testAccessMethod()
    {
        Person jane = new Person("jane", "doe", JANE_PHONE_NUMBER);
        String str = jane.getFirstName();
        
        assertEquals("jane", str);
    }
    
    
    @Test
    public void testVarargs()
    {
        Person jane = new Person("jane", "doe", JANE_PHONE_NUMBER);
        
        
        assertEquals(10, jane.addValues(0, 1, 2, 3, 4));
    }
    
    
    @Test
    /* this does not compile, change the implementation */
    public void testOverload()
    {
        Person jane = new Person("jane", "doe", JANE_PHONE_NUMBER);
        
        
        assertEquals(10, jane.afunction(1));
        
        assertEquals(10, jane.afunction(1L));
    }
    
}

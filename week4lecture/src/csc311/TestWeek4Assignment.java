package csc311;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class TestWeek4Assignment
{
    
    private static final String FIRST_NAME = "john";
    private static final String LAST_NAME  = "smith";
    
    
    @Test
    public void testSuperConstructor()
    {
        Staff staff = new Staff(FIRST_NAME, LAST_NAME);
        
        assertEquals(FIRST_NAME, staff.getFirstName());
    }
    
    
    @Test
    public void testMissingInterface()
    {
        Staff staff = new Staff(FIRST_NAME, LAST_NAME);
        RemoteSystem system = new RemoteSystem("my laptop", "@home");
        
        Actor actors[] = { staff, system };
        
        
        assertEquals(FIRST_NAME + " " + LAST_NAME, actors[0].getName());
        assertEquals("my laptop", actors[1].getName());
    }
    
    
    @Test
    public void testMustAddImportOfValidType()
    {
        RemoteSystem system = new RemoteSystem("my laptop", "@home");
        
        assertNotNull(system.getCreationDate());
        
        assertEquals(system.getCreationDate().getClass(), Date.class);
    }
    
    
    @Test
    //
    // you must implement the equals function in Staff
    //
    // see: https://stackoverflow.com/questions/7520432/what-is-the-difference-between-vs-equals-in-java
    //		http://www.programmerinterview.com/index.php/java-questions/java-whats-the-difference-between-equals-and/
    //
    //a good example, with a few annoying popup: https://examples.javacodegeeks.com/core-java/lang/java-equals-method-example/
    //
    public void testIdentityAreEquals()
    {
        Staff staff1 = new Staff(FIRST_NAME, LAST_NAME);
        Staff staff2 = new Staff(FIRST_NAME, LAST_NAME);
        
        assertTrue(staff1.equals(staff2));
    }
    
    
    @Test
    public void testLastCSC311Test()
    {
        RemoteSystem system = new RemoteSystem("my laptop", "@home");
        
        assertEquals("@home".hashCode(), system.getLocationHashCode());
        
    }
    
}

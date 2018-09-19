package csc311;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWeek2Assignment
{
    
    @Test
    public void testIncrement()
    {
        Week2Assignment week2 = new Week2Assignment();
        
        assertEquals(2, week2.increment(1));
    }
    
    
    @Test
    public void testDoModule()
    {
        Week2Assignment week2 = new Week2Assignment();
        
        assertEquals(3, week2.doModulo(3, 7));
        
    }
    
    
    @Test
    public void testForEach()
    {
        Week2Assignment week2 = new Week2Assignment();
        
        int values[] = { 1, 0, 5, 10, 7 };
        assertEquals(1, week2.forEach(values));
        
    }
    
    
    @Test
    public void testCountToMaxValue()
    {
        Week2Assignment week2 = new Week2Assignment();
        
        int values[] = { 1, 0, 5, 10, 7 };
        assertEquals(3, week2.countToMaxValue(values, 14));
    }
    
    
    @Test
    public void testDoingTheCase()
    {
        Week2Assignment week2 = new Week2Assignment();
        
        int values[] = { 0, 1, 3, 6, 10 };
        assertEquals(107, week2.doingTheCase(values));
        
    }
    
}

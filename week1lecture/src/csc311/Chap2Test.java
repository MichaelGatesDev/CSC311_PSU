package csc311;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Chap2Test
{
    
    @Test
    public void testAdd()
    {
        
        int[] values = { 1, 2, 3, 4 };
        int x = Chap2.add(values);
        
        assertEquals(10, x);
    }
    
    
    @Test
    public void testOddandEven()
    {
        
        int[] values = { 1, 2, 3, 4 };
        int x = Chap2.addOdd(values);
        
        assertEquals(4, x);
    }
    
    
    @Test
    public void testOddOnly()
    {
        
        int[] values = { 1, 3 };
        int x = Chap2.addOdd(values);
        
        assertEquals(4, x);
    }
}

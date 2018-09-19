package csc311;

import org.junit.Assert;
import org.junit.Test;

public class ExceptionsTest
{
    @Test
    public void testNFE()
    {
        ExceptionsFail e = new ExceptionsFail();
        
        Assert.assertEquals(e.addStringNums("10", "20"), 30L);
        Assert.assertEquals(e.addStringNums("1F", "30A"), 0L);
    }
    
    
    @Test
    public void testCCE()
    {
        ExceptionsFail e = new ExceptionsFail();
        
        Assert.assertEquals(e.addOnlyStrings("a", "b", "c"), "abc");
        Assert.assertEquals(e.addOnlyStrings(5, "Test", (float) 0.5), "Test");
    }
    
    
    @Test
    public void testNPE()
    {
        ExceptionsFail e = new ExceptionsFail();
        
        Assert.assertEquals(e.getThirdCharacter("test"), 's');
        Assert.assertEquals(e.getThirdCharacter("no"), '\u0000');
    }
    
    
    @Test
    public void testNASE()
    {
        ExceptionsFail e = new ExceptionsFail();
        
        Assert.assertEquals(e.createEmptyArray(5).length, 5);
        Assert.assertEquals(e.createEmptyArray(-5).length, 10);
    }
    
    
    @Test
    public void testCustom()
    {
        ExceptionsFail e = new ExceptionsFail();
        
        Assert.assertEquals("jspoeh", e.scrambleName("joseph"));
        Assert.assertNotEquals("harrison", e.scrambleName("harrison"));
        Assert.assertEquals("bob", e.scrambleName("bob"));
        Assert.assertEquals("derf", e.scrambleName("fred"));
        Assert.assertEquals("yram", e.scrambleName("mary"));
    }
    
}

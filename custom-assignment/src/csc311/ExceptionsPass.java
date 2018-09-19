package csc311;

public class ExceptionsPass
{
    
    
    public long addStringNums(String a, String b)
    {
        long n;
        try
        {
            n = new Long(a) + new Long(b);
        }
        catch (NumberFormatException nfe)
        {
            n = 0;
        }
        return n;
    }
    
    
    public String addOnlyStrings(Object... objects)
    {
        String s = "";
        for (Object obj : objects)
        {
            try
            {
                s += (String) obj;
            }
            catch (ClassCastException ignored)
            {
            }
        }
        return s;
    }
    
    
    public char getThirdCharacter(String s)
    {
        char c;
        
        try
        {
            c = s.toCharArray()[2];
        }
        catch (ArrayIndexOutOfBoundsException aioob)
        {
            c = '\u0000';
        }
        return c;
    }
    
    
    public int[] createEmptyArray(int size)
    {
        int[] created;
        try
        {
            created = new int[size];
        }
        catch (NegativeArraySizeException nase)
        {
            created = new int[10];
        }
        return created;
    }
    
    
    private class NameLengthException extends Exception
    {
    }
    
    
    public String scrambleName(String s)
    {
        String result;
        try
        {
            result = this.scramble(s.toLowerCase());
        }
        catch (NameLengthException e)
        {
            result = reverse(s.toLowerCase());
        }
        return result;
    }
    
    
    // Character mapping key
    // a b c d e f g
    // e o e o e o e
    // 0 1 2 3 4 5 6
    //
    // a c e g b d f
    // e e e e o o o
    // 0 2 4 6 1 3 5
    private String scramble(String s) throws NameLengthException
    {
        if (s.length() < 5)
        {
            throw new NameLengthException();
        }
        char[] origChars = s.toCharArray();
        char[] scrambled = new char[origChars.length];
        
        int evens = origChars.length / 2;
        
        int evenPos = 0;
        int oddPos = evens;
        
        for (int i = 0; i < s.length(); i++)
        {
            scrambled[i % 2 == 0 ? evenPos++ : oddPos++] = origChars[i];
        }
        return new String(scrambled);
    }
    
    
    private String reverse(String s)
    {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--)
        {
            reversed += s.toCharArray()[i];
        }
        return reversed;
    }
    
}

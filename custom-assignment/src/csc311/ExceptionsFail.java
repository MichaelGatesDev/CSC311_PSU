package csc311;


// All of the following methods are missing error handling and general implementation
// Not using error handling to solve the problem will result in no credit
public class ExceptionsFail
{
    
    // Using the most appropriate exception:
    // Parse each parameter as a long, and add them.
    // Return the sum, or 0 if *any one of them* throws an exception while parsing.
    public long addStringNums(String a, String b)
    {
        return new Long(a) + new Long(b);
    }
    
    
    // Using the most appropriate exception:
    // Take some objects which are strings and concatenate them.
    // Should not work on types other than String.
    // Must use EXCEPTION HANDLING (not instance checking) if object is not of type string.
    // If an exception arises, it is safe just to ignore
    public String addOnlyStrings(Object... objects)
    {
        String s = "";
        for (Object obj : objects)
        {
            s += (String) obj;
        }
        return s;
    }
    
    
    // Using the most appropriate exception:
    // Gets the third character in the given string
    // If an exception occurs while accessing the array, it should return the default character value \u0000
    public char getThirdCharacter(String s)
    {
        return s.toCharArray()[2];
    }
    
    
    // Using the most appropriate exception:
    // Creates a new empty array with the specified definite size
    // If a negative number is passed as the array size, the method should return a new array with a size of 10.
    public int[] createEmptyArray(int size)
    {
        return new int[size];
    }
    
    
    // This is an (incomplete) custom exception class
    private class NameLengthException
    {
    }
    
    
    // Complete the custom exception above and use that for error handling in this method
    // This function scrambles given string using the scramble method below
    // The given string should be converted to all lowercase.
    // If the scramble function throws an error, it should return the reverse of the given string
    public String scrambleName(String s)
    {
        return this.scramble(s);
    }
    
    
    // This function scrambles the given string
    // If the length of the provided string is less than 5 characters, it should throw the custom exception and do nothing further
    // The new string should begin with all of the characters at even indices in the original string, and then all of the odd indiced characters
    // Examples:
    // - testing    => tsigetn
    // - laughter   => luheagtr
    // - ellen      => elnle
    private String scramble(String s)
    {
        String scrambled = "";
        char[] origChars = null;
        return scrambled;
    }
    
    
    // This function simply reverses the given string (e.g. testing -> gnitset)
    private String reverse(String s)
    {
        return null;
    }
    
}

// Michael Gates
package csc311;

public class Week2Assignment
{
    
    //correct the function, in the most efficient way
    //must return the value incremented by 1
    public int increment(int x)
    {
        return ++x;
    }
    
    
    //complete the function, in the most efficient way
    //must return the modulo of x divided by y
    public int doModulo(int x, int y)
    {
        return x % y;
    }
    
    
    //complete the function, in the most efficient way
    //using a For each, count how many zeroes
    //are in values
    public int forEach(int[] values)
    {
        int count = 0;
        
        for (int i : values)
        {
            if (i == 0)
            {
                count++;
            }
        }
        return count;
    }
    
    
    //complete the function, in the most efficient way
    //count how many values you must add up (starting at 0)
    //to have a sum less than max
    public int countToMaxValue(int[] values, int max)
    {
        int count = 0;
        int sum = 0;
        for (int i : values)
        {
            if (sum + i > max)
            {
                break;
            }
            sum += i;
            count++;
        }
        return count;
    }
    
    
    //complete the function, in the most efficient way
    //if the value is:
    //  1           : you must add 0
    //  2,3,4       : you must add 1
    //  5,6,7       : you must add the value
    //  other value : you must add the value * 10
    public int doingTheCase(int[] values)
    {
        int sum = 0;
        
        for (int i : values)
        {
            switch (i)
            {
                default:
                    sum += i * 10;
                    break;
                case 1:
                    sum += 0;
                    break;
                case 2:
                case 3:
                case 4:
                    sum += 1;
                    break;
                case 5:
                case 6:
                case 7:
                    sum += i;
                    break;
            }
        }
        
        return sum;
    }
    
    
}

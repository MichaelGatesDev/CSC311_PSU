package csc311;

import java.util.Date;

public class RemoteSystem implements Actor
{
    
    String name;
    String location;
    Date   creationDate;
    
    
    public RemoteSystem(String name, String location)
    {
        this.name = name;
        this.location = location;
        this.creationDate = new Date();
    }
    
    
    public Date getCreationDate()
    {
        return creationDate;
    }
    
    
    protected String getLocation()
    {
        return location;
    }
    
    
    public int getLocationHashCode()
    {
        return this.getLocation().hashCode();
    }
    
    
    @Override
    public String getName()
    {
        return name;
    }
}


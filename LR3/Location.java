/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;


    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }
    
    public boolean equals(Object obj) 
    {
        Location ex = (Location) obj;
        if (ex.xCoord == xCoord && ex.yCoord == yCoord) { return true; }
        return false;
    }
    
    public int hashCode() 
    {
        int code = 24*xCoord + 24*yCoord;
        return code;
    }
}

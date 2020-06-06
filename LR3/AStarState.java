import java.util.*;
/**
 * This class stores the basic state necessary for the A* algorithm to compute a
 * path across a map.  This state includes a collection of "open waypoints" and
 * another collection of "closed waypoints."  In addition, this class provides
 * the basic operations that the A* pathfinding algorithm needs to perform its
 * processing.
 **/
public class AStarState
{
    /** This is a reference to the map that the A* algorithm is navigating. **/
    private Map2D map;

    private JMapCell[][] mapCells;
    
    private Map<Location, Waypoint> opened_Waypoints = new HashMap<Location, Waypoint>();
    
    private Map<Location, Waypoint> closed_Waypoints = new HashMap<Location, Waypoint>();
  
    /**
     * Initialize a new state object for the A* pathfinding algorithm to use.
     **/
    public AStarState(Map2D map)
    {
        if (map == null)
            throw new NullPointerException("map cannot be null");

        this.map = map;
    }

    /** Returns the map that the A* pathfinder is navigating. **/
    public Map2D getMap()
    {
        return map;
    }

    /**
     * This method scans through all open waypoints, and returns the waypoint
     * with the minimum total cost.  If there are no open waypoints, this method
     * returns <code>null</code>.
     **/
    public Waypoint getMinOpenWaypoint()
    {
        if (numOpenWaypoints() == 0) { return null; }
        Waypoint top_WP = null; //������ �������
        for (Location i: opened_Waypoints.keySet()) //���� �������� ������ ���� ���-�����
        {
            Waypoint current_WP = opened_Waypoints.get(i);//������� �������
            if (current_WP != null) 
            {
                if (top_WP != null) 
                {
                    if (current_WP.getTotalCost() < top_WP.getTotalCost()) //��������� ����� ������
                    {
                    	top_WP = current_WP;
                    }
                }
                else { top_WP = current_WP;}
            }
        }
        return top_WP;
    }

    /**
     * This method adds a waypoint to (or potentially updates a waypoint already
     * in) the "open waypoints" collection.  If there is not already an open
     * waypoint at the new waypoint's location then the new waypoint is simply
     * added to the collection.  However, if there is already a waypoint at the
     * new waypoint's location, the new waypoint replaces the old one <em>only
     * if</em> the new waypoint's "previous cost" value is less than the current
     * waypoint's "previous cost" value.
     **/
    public boolean addOpenWaypoint(Waypoint newWP)
    {
        Location locate = newWP.getLocation();
        if (opened_Waypoints.containsKey(locate) == true) //�������� �������� �� ���-����� �������� ������ ��� �������
        {
            Waypoint current_WP = opened_Waypoints.get(locate);
            if (newWP.getPreviousCost() < current_WP.getPreviousCost())//��������� ����� ����� � ������ ������
            {
                opened_Waypoints.put(locate, newWP);//������ ������� �� �����
                return true;
            }
            return false;
        }
        opened_Waypoints.put(locate, newWP);//���������� ����� ������� � ���-�����
        return true;
    }


    /** Returns the current number of open waypoints. **/
    public int numOpenWaypoints()
    {
        return opened_Waypoints.size();//������ ���-����� �������� ������ 
    }


    /**
     * This method moves the waypoint at the specified location from the
     * open list to the closed list.
     **/
    public void closeWaypoint(Location loc)
    {
        Waypoint Wp1 = opened_Waypoints.get(loc);
        opened_Waypoints.remove(loc);//�������� �� ���-����� �������� ������ 
        closed_Waypoints.put(loc, Wp1);//���������� � ���-����� �������� ������ 
    }

    /**
     * Returns true if the collection of closed waypoints contains a waypoint
     * for the specified location.
     **/
    public boolean isLocationClosed(Location loc)
    {
        return closed_Waypoints.containsKey(loc);//�������� �������� �� ���-����� ���� � ����� ������
    }
}


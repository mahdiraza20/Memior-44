package m_mehdi;

public class Hexagon {
    private GroundTypes groundTypes;
    private Location location;
    private boolean isOccupied;
    private Forces forces;
    public Hexagon(GroundTypes groundTypes, Location location) {
        this.groundTypes = groundTypes;
        this.location = location;
        isOccupied = false;
    }
    public void reset() {
        isOccupied = false;
    }

    public void setForces(Forces forces) {
        this.forces = forces;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
    public void setGroundTypes(GroundTypes groundTypes){
        this.groundTypes = groundTypes;
    }

    public GroundTypes getGroundTypes() {
        return groundTypes;
    }

    public Location getLocation() {
        return location;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "groundTypes=" + groundTypes +
                ", location=" + location +
                ", isOccupied=" + isOccupied +
                '}';
    }
}

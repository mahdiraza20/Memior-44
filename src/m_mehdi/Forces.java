package m_mehdi;

public abstract class Forces {
    protected String name;
    protected Teams team;
    protected Hexagon currentHexagon;

    public Forces(Teams team) {
        this.team = team;

    }

    public String getName() {
        return name;
    }

    public Teams getTeam() {
        return team;
    }

    public Hexagon getCurrentHexagon() {
        return currentHexagon;
    }

    public void setCurrentHexagon(Hexagon currentHexagon) {
        this.currentHexagon = currentHexagon;
    }

    public boolean validMoves(){return true;}

    @Override
    public String toString() {
        return "Forces{" +
                "name='" + name + '\'' +
                ", team=" + team +
                ", currentHexagon=" + currentHexagon +
                '}';
    }
}

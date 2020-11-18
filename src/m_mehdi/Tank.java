package m_mehdi;

public class Tank extends Forces {
    public Tank(Teams team) {
        super(team);
        this.name = "T";
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public Teams getTeam() {
        return super.getTeam();
    }

    @Override
    public Hexagon getCurrentHexagon() {
        return super.getCurrentHexagon();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void setCurrentHexagon(Hexagon currentHexagon) {
        this.currentHexagon = currentHexagon;
    }

    @Override
    public boolean validMoves() {
        return super.validMoves();
    }
}

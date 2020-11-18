package m_mehdi;

public class Bomb extends Forces {
    public Bomb(Teams team) {
        super(team);
        this.name = "B";
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
        return currentHexagon;
    }

    @Override
    public void setCurrentHexagon(Hexagon currentHexagon) {
        this.currentHexagon = currentHexagon;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean validMoves() {
        return super.validMoves();
    }
}

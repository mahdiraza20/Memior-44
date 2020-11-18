package m_mehdi;

public class Soldier extends Forces {
    public Soldier(Teams team) {
        super(team);
        this.name = "S";
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
    public void setCurrentHexagon(Hexagon currentHexagon) {
        super.setCurrentHexagon(currentHexagon);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean validMoves() {
        int right = currentHexagon.getLocation().getColumn();
        int left = currentHexagon.getLocation().getRow();
        for (int i = (right-1); i == (right+1);i ++) {
            for (int j = (left-1); j == (left+1); j++){
                System.out.println(i);
                System.out.println(j);
                System.out.println("is valid move");
            }

        }
        return super.validMoves();
    }
}

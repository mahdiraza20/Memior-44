package m_mehdi;

import java.util.ArrayList;
import java.util.Arrays;

public class Map {
    Hexagon[][] hexagons = new Hexagon[13][9];
    ArrayList<Forces> forces;
    public Map() {
        forces =  new ArrayList<>();
    }
    public void addHexagons() {
        for (int i = 0; i < 9; i ++) {
            for (int j = 0; j < 13; j++) {
                hexagons[j][i] = new Hexagon(GroundTypes.N, new Location(j,(i)));
            }
        }
    }
    public void printMap() {
        for (int i = 0 ;i < 45 ;i++) {
            if (i % 5 == 4) {
                for (int j = 1; j <= 13 ; j++) {
                        System.out.print("  * ** *");
                        System.out.print("    ");
                }
                System.out.println();
            } else if (i % 5 == 3 ) {
                for (int j = 0; j < 13 ; j++) {
                    System.out.print(" *      *");
                    System.out.print("   ");
                }
                System.out.println();

            } else if (i % 5 == 2) {
                for (int j = 0; j < 13 ; j++) {
                    System.out.print("*   "+hexagons[j][i/5].getGroundTypes() +"    *");
                    System.out.print("  ");
                }
                System.out.println();
            }else if (i % 5 == 1) {
                for (int j = 0; j < 13 ; j++) {
                    System.out.print(" *      *");
                    System.out.print("   ");
                }
                System.out.println();
        } else if (i % 5 == 0) {
                for (int j = 0; j < 13 ; j++) {
                    System.out.print("  * ** *");
                    System.out.print("    ");
                }
                System.out.println();
        }
        }
    }
    public void addForces() {
        Forces bomb1 = new Bomb(Teams.allied);
        Forces bomb2 = new Bomb(Teams.axis);
        forces.add(bomb1);
        bomb1.setCurrentHexagon(hexagons[0][0]);
        forces.add(bomb2);
    }
    public void assignGroundTypes(){
        hexagons[1][0].setGroundTypes(GroundTypes.H);
        hexagons[4][0].setGroundTypes(GroundTypes.B);
        hexagons[4][1].setGroundTypes(GroundTypes.S);
        hexagons[10][4].setGroundTypes(GroundTypes.C);
        hexagons[2][6].setGroundTypes(GroundTypes.C);
        hexagons[9][7].setGroundTypes(GroundTypes.F);
    }
    public void deleteForces(int num) {
        forces.remove(num);
    }


}

package battleships;

import java.util.Random;

public class Battleship {
    private int rowLocation;
    private int columnLocation;
    private boolean shipDeployed = false;
    private boolean foundDeployablePosition = false;
    private boolean shipSunk = false;
    private boolean canThisShipBeChecked = true;
    private boolean orientation; //True = Horizontal | False = Vertical
    private Random rand = new Random();
    
    public void setRowLocation(int n) {
        rowLocation = n;
    }
    public void setColumnLocation(int n) {
        columnLocation = n;
    }
    public void setShipDeployed(boolean bool) {
        shipDeployed = bool;
    }
    public void setFoundDeployablePosition(boolean bool) { 
        foundDeployablePosition = bool;
    }
    public int getRowLocation() {
        return rowLocation;
    }
    public int getColumnLocation() {
        return columnLocation;
    }
    public boolean getShipSunk() {
        return shipSunk;
    }
    public boolean getShipDeployed() {
        return shipDeployed;
    }
    public boolean getFoundDeployablePosition() {
        return foundDeployablePosition;
    }
    public boolean getCanThisShipBeChecked() {
        return canThisShipBeChecked;
    }
    public void setCanThisShipBeChecked(boolean bool) {
        canThisShipBeChecked = bool;
    }
    public void setRandomLocation() {
        rowLocation = rand.nextInt(5);
        columnLocation = rand.nextInt(5);
    }
    public int[][] deployShip(int[][] location, int numToExtend) {
    //Deploys ship into the array in row and col position and extends it up to n amount
        if(rand.nextBoolean()) {
            for(int i = 0; i < numToExtend; i++)
            {
                location[rowLocation][columnLocation+i] = 1;
                orientation = true;
            }
        }
        else {
            for(int i = 0; i < numToExtend; i++)
            {
                location[rowLocation+i][columnLocation] = 1;
                orientation = false;
            }
        }
        return location;
    }
    public boolean checkSurrounding(int[][] location) {
        //Checks the location array for possible ship deployment locations and returns a boolean
        //False means there is nothing in the positions it is checking while true means there is something there
        boolean check = false;
        if(location[rowLocation][columnLocation] == 1 || location[rowLocation+1][columnLocation] == 1 || location[rowLocation+2][columnLocation] == 1 
           || location[rowLocation][columnLocation+1] == 1 || location[rowLocation][columnLocation+2] == 1) {
            check = true;
        }
        return check;
    }
    public void findDeployableLocation(int[][] location) {
        //Keeps going until it finds a suitable position to prepare for ship deployment
        boolean check = checkSurrounding(location);
        while(check == true) {
            setRandomLocation();
            System.out.println("Invalid Ship Position");
            check = checkSurrounding(location);
        }
        foundDeployablePosition = true;
        System.out.println("Found Valid Ship Position");
    }
    public boolean checkIfSunk(int[][] location) {
        System.out.println("Im actually checking all the way in for the ships!");
        if(orientation) {
            System.out.println("Checking while accounting for the ship to be horizontal!");
            if(location[rowLocation][columnLocation] == -1 && location[rowLocation][columnLocation+1] == -1 && location[rowLocation][columnLocation+2] == -1) {
                shipSunk = true;
                System.out.println("I SWEAR I RETURNED THE TRUE");
            }
        }
        else {
            System.out.println("Checking while accounting for the ship to be vertical!");
            if(location[rowLocation][columnLocation] == -1 && location[rowLocation+1][columnLocation] == -1 && location[rowLocation+2][columnLocation] == -1) {
                shipSunk = true;
                System.out.println("I SWEAR I RETURNED THE TRUE");
            }
            }
        return shipSunk;
    }
}

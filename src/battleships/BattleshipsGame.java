package battleships;

/**
 *
 * @author Mohamed Serhan
 */
public class BattleshipsGame {
    private int location[][] = new int[7][7];
    private Battleship shipOne = new Battleship();
    private Battleship shipTwo = new Battleship();
    private Battleship shipThree = new Battleship();
    private Battleship shipFour = new Battleship();
    
    public void generateLocation()
    //Generates random starting locations for the battleships
    {
        //Declaring Variables
        shipOne.setRandomLocation();
        shipTwo.setRandomLocation();
        shipThree.setRandomLocation();
        shipFour.setRandomLocation();
        
        //Debug Code, prints random values
//        System.out.println(shipOne.getRowLocation());
//        System.out.println(shipOne.getColumnLocation());
//        System.out.println(shipTwo.getRowLocation());
//        System.out.println(shipTwo.getColumnLocation());
//        System.out.println(shipThree.getRowLocation());
//        System.out.println(shipThree.getColumnLocation());
//        System.out.println(shipFour.getRowLocation());
//        System.out.println(shipFour.getColumnLocation());
        
        //Assign shipLocations to location multiarray
        //Assign shipOne first
        if(shipOne.getShipDeployed() == false) {
            shipOne.findDeployableLocation(location);
            shipOne.deployShip(location, 3);
        }
        
        //Now add shipTwo, shipThree, and shipFour using a while loop to check if the spots are occupied
        //If it is occupied then get new set of random values and try again            
        //shipTwo
        if(shipTwo.getShipDeployed() == false) {
            shipTwo.findDeployableLocation(location);
            shipTwo.deployShip(location, 3);
        }
        
        //shipThree
        if(shipThree.getShipDeployed() == false) {
            shipThree.findDeployableLocation(location);
            shipThree.deployShip(location, 3);
        }
            
        //shipFour
        if(shipFour.getShipDeployed() == false) {
            shipFour.findDeployableLocation(location);
            shipFour.deployShip(location, 3);
        }
             
        //Debug code, prints array
        printArray();
    }
    
    public void printArray() {
        //Debug code, prints array
        for(int i = 0; i < 1; i++) {
            for(int row = 0; row < location[0].length; row++) {
                for(int col = 0; col < location[1].length; col++) {
                    System.out.print(location[row][col]);
                }
                System.out.println();
            }
        }
    }
    public boolean checkLocation(char col, int row) 
    //Checks the location to see if the user hits or misses. If the user hits then the location is set to -1. True = Hit | False = Miss.
    {
        int column = 0;
        row = row - 1;
        boolean shipHit = false;
        switch(col) {
            case 'A':
                column = 0;
            break;
                
            case 'B':
                column = 1;
            break;
            
            case 'C':
                column = 2;
            break;
            
            case 'D':
                column = 3;
            break;
            
            case 'E':
                column = 4;
            break;
            
            case 'F':
                column = 5;
            break;
            
            case 'G':
                column = 6;
            break;
        }
        System.out.println("Checking location " + row + ", " + column);
        if(location[row][column] == 1) {
            shipHit = true;
            location[row][column] = -1;
        }
        printArray();
        return shipHit;
    }
    
    public int checkSunkShips() 
    //Returns the number of the ship that sank
    {
        int thisShipSunk = 0;
        if(shipOne.checkIfSunk(location) == true && shipOne.getCanThisShipBeChecked() == true){// && shipOne.getShipSunk() == true) {
            thisShipSunk = 1;
            shipOne.setCanThisShipBeChecked(false);
            System.out.println("Ship one sunk!");
        }
        else if(shipTwo.checkIfSunk(location) == true && shipTwo.getCanThisShipBeChecked() == true){// && shipTwo.getShipSunk() == true) {
            thisShipSunk = 2;
            shipTwo.setCanThisShipBeChecked(false);
            System.out.println("Ship two sunk!");
        }
        else if(shipThree.checkIfSunk(location) == true && shipThree.getCanThisShipBeChecked() == true){// && shipThree.getShipSunk() == true) {
            thisShipSunk = 3;
            shipThree.setCanThisShipBeChecked(false);
            System.out.println("Ship three sunk!");
        }
        else if(shipFour.checkIfSunk(location) == true && shipFour.getCanThisShipBeChecked() == true){// && shipFour.getShipSunk() == false) {
            thisShipSunk = 4;
            shipFour.setCanThisShipBeChecked(false);
            System.out.println("Ship four sunk!");
        }
        return thisShipSunk;
    }
    
    public void clearLocation() 
    //Fully clears the location array
    {
        location = new int[7][7];
    }
}

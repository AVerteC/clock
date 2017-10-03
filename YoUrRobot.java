import kareltherobot.*;
import java.awt.Color;

public class YoUrRobot extends UrRobot 
{
    // instance variables - replace the example below with your own
   

    /**
     * Constructor for objects of class advfunct
     */
    public YoUrRobot(int st, int av, Direction d, int b)
   
    {
        // initialise instance variables
        super(st, av, d, b);
    }

   
    public void turnRight() 
    {
    turnLeft();
    turnLeft();
    turnLeft();
    
            
    }

    public void turnAround()
    {
        turnLeft();
        turnLeft();
        
     }

    public void moveMile()
    {
        move();
        move();
        move();
        move();
        move();
        move();
        move();
        move();
    }
    
    public void move5pick()
    {
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
    }
    
    public void two()
    {
        move();
        putBeeper();
    }
    
    public void together()
    {
        move();
        putBeeper();
        move();
    }
    
    public void reset()
    {
    move();
    }
    
    public void numone()
    {
    
    //always start and end facing east    
        
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
   //top part of number one
        turnLeft();
        move();
        turnLeft();
        move();
        putBeeper();
        
    //preppin for next number
        move();
        move();
        move();
        move();
        move();
        turnLeft();
        move();
        move();
        putBeeper();
        move();
    }
    public void numtwo()
    {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        turnAround();
        move();
        move();
        move();
        move();
        
        turnRight();
        move();
        putBeeper();
        move();
        
        turnRight();
        move();
        putBeeper();
        
        turnLeft();
        move();
        turnRight();
        move();
        putBeeper();
        
        turnLeft();
        move();
        turnRight();
        move();
        putBeeper();
        
        turnLeft();
        move();
        turnRight();
        move();
        putBeeper();
        
        turnLeft();
        move();
        
        turnLeft();
        
        
        move();
        putBeeper();
        
        
        move();
        putBeeper();
        
        
        move();
        putBeeper();
        move();
        
        turnLeft();
        move();
        putBeeper();
        
        turnLeft();
        
        move();
        move();
        move();
        move();
        
    }
    
    public void numthree()
    {
        turnLeft();
        move();
        putBeeper();
        turnRight();
        move();
        turnRight();

        move();
        turnLeft();
        putBeeper();

        move();
        putBeeper();
        move();
        putBeeper();
        
        move();
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        
        turnRight();
        move();
        turnRight();
        move();
        move();
        putBeeper();

        turnLeft();
        move();
        putBeeper();

        move();
        turnLeft();
        move();

        putBeeper();
        move();
        putBeeper();

        move();
        putBeeper();
        turnLeft();
        move();
        turnRight();
        move();
        putBeeper();

        turnAround();
        move();
        move();
        move();
        move();
        move();
        turnRight();
        move();
        move();
        move();
        move();
        move();
        turnLeft();


    }

    public static void main(String [] args)
    {
        YoUrRobot ko = new YoUrRobot(1, 1, East, infinity);
        //ko.numone();
        //ko.reset();
        //ko.numtwo();
        ko.numthree();
    }
        
        
    

    static
    {
        World.reset();
        World.readWorld("clock.kwld");
        World.setBeeperColor(Color.red);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10); 
        World.setVisible(true);
    }


}
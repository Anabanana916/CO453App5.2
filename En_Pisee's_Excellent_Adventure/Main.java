import greenfoot.*;

public class Main extends Screen {

    private Buttons op1Button;

    /**
     * Constructor for objects of class Main.
     * 
     */
    public Main() {
        // Constructor for the 'Main' class
        // Call the superclass constructor with parameters (800, 600, 1)
        super(800, 600, 1);
        
        // Call the 'createButtons()' method to create buttons
        createButtons();
        
        // Call the 'prepare()' method for additional preparation
        prepare();
    }
    
    public void createButtons() {
        // Method to create buttons
        
        // Create a GreenfootImage object named 'buttonImage' from the image file "Option1.png"
        GreenfootImage buttonImage = new GreenfootImage("Option1.png");
        
        // Create an instance of the 'Buttons' class named 'op1Button' with the image "Option1.png"
        op1Button = new Buttons("Option1.png");
        
        // Add the 'op1Button' object to the world at coordinates (100, 475)
        addObject(op1Button, 100, 475);
    }
    
    public void act() {
        // Method executed continuously during the game
        
        // Check if the mouse click occurred on the 'op1Button' object
        if (Greenfoot.mouseClicked(op1Button)) {
            // Print "Game Starts" to the console
            //System.out.println("Game Starts");
            
            
            // Transition to the 'Intro' world by setting the world to a new instance of 'Intro'
            Greenfoot.setWorld(new Intro());
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
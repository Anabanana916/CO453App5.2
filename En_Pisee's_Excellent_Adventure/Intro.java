import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intro extends Screen {
    private EnPisee testEnPisee;
    private Buttons op1Button;
    private Buttons op2Button;
    
    
    public Intro() {
        // Constructor for the 'Intro' class
        // Call the superclass constructor with parameters (800, 600, 1)
        super(800, 600, 1);
        
        // Print introductory messages to the console
        System.out.println("Hi!");
        System.out.println("My name is En Pisee! And this is my game! I will be your narrator for this adventure.");
        System.out.println("You! Will be the hero of my story! Making challenging choices, taking horrifying risks,");
        System.out.println("and hopefully defeating the evil dragon and beating my game!!");
        System.out.println("Are you up for the challenge?");
        System.out.println("1) 'Heck yes!!'");
        System.out.println("2) 'WTF are you??'");
        System.out.print("> ");
        
        // Call the 'createEnPisee()' method to create the EnPisee character
        createEnPisee();
        
        // Call the 'createButtons()' method to create buttons
        createButtons();
    }
    
    public void createButtons() {
        // Method to create buttons
        
        // Create an instance of the 'Buttons' class named 'op1Button' with the image "Option1.png"
        op1Button = new Buttons("Option1.png");
        
        // Add the 'op1Button' object to the world at coordinates (100, 475)
        addObject(op1Button, 100, 475);
        
        // Create an instance of the 'Buttons' class named 'op2Button' with the image "Option2.png"
        op2Button = new Buttons("Option2.png");
        
        // Add the 'op2Button' object to the world at coordinates (100, 540)
        addObject(op2Button, 100, 540);
    }
    
    public void act() {
        // Method executed continuously during the game
        
        // Check if the mouse click occurred on the 'op1Button' object
        if (Greenfoot.mouseClicked(op1Button)) {
            // Print "OPTION 1 SELECTED" to the console
            System.out.println("OPTION 1 SELECTED");
            
            // Transition to the 'Village' world by setting the world to a new instance of 'Village'
            Greenfoot.setWorld(new Village());
        }
        
        // Check if the mouse click occurred on the 'op2Button' object
        if (Greenfoot.mouseClicked(op2Button)) {
            // Print "OPTION 2 SELECTED" to the console
            System.out.println("OPTION 2 SELECTED");
            
            // Transition to the 'Village' world by setting the world to a new instance of 'Village'
            Greenfoot.setWorld(new Village());
        }
    }
    
    public void createEnPisee() {
        // Method to create the EnPisee character
        
        // Create an instance of the 'EnPisee' class named 'testEnPisee' with the image "NPChappy.png"
        testEnPisee = new EnPisee("NPChappy.png");
        
        // Add the 'testEnPisee' object to the world at coordinates (400, 300)
        addObject(testEnPisee, 400, 300);
    }
}
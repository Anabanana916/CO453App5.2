import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Sneak1 class represents the first sneak challenge in the game. It extends 
 * the Screen class and provides the introduction and choices for the challenge. 
 * The class creates buttons for the choices and handles mouse click events to 
 * perform actions based on the selected option. It also has a method to create 
 * and add an EnPisee object to the world.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sneak1 extends Screen
{
    // Declare private instance variables
    private EnPisee testEnPisee;
    private Buttons op1Button;
    private Buttons op2Button;
    private Buttons op3Button;
    
    // Sneak1 class constructor
    public Sneak1()
    {
        // Call the superclass constructor with parameters (800, 600, 1)
        super(800, 600, 1);
        
        // Print the introduction and choices for the sneak challenge to the console
        System.out.println("You get behind the dragon, but you knock over some coins! The sound causes the dragon");
        System.out.println("to raise its head suddenly and start looking around.");
        System.out.println("1) Freeze");
        System.out.println("2) Hide");
        System.out.println("3) Say Hi");
        
        // Call the 'createButtons()' method to create buttons for the choices
        createButtons();
    }
    
    // Method to create buttons for the choices
    public void createButtons() {
        // Create instances of the 'Buttons' class with specific images and add them to the world at specific coordinates
        op1Button = new Buttons("Option1.png");
        addObject(op1Button, 100, 475);
        
        op2Button = new Buttons("Option2.png");
        addObject(op2Button, 100, 540);
        
        op3Button = new Buttons("Option3.png");
        addObject(op3Button, 275, 475);
    }
    
    // Method that is called continuously by Greenfoot for the actor to perform actions
    public void act() {
        // Check if the mouse click occurred on each button and perform corresponding actions based on the selected option
        
        if (Greenfoot.mouseClicked(op1Button)) {
            System.out.println("OPTION 1 SELECTED");
            System.out.println("You once heard that a dragon's vision is based on movement.");
            System.out.println("You heard wrong.");
            System.out.println("The Dragon crushes you with its tail.");
            
            // Transition to the 'Gameover' world by setting the world to a new instance of 'Gameover'
            Greenfoot.setWorld(new Gameover());
        }
        
        if (Greenfoot.mouseClicked(op2Button)) {
            System.out.println("OPTION 2 SELECTED");
            System.out.println("You duck behind a pile of treasure. The Dragon takes a moment, before returning to its rest.");
            
            // Transition to the next sneak challenge (Sneak2) by creating a new instance of 'Sneak2' world
            // Greenfoot.setWorld(new Sneak2());
        }
        
        if (Greenfoot.mouseClicked(op3Button)) {
            System.out.println("OPTION 3 SELECTED");
            System.out.println("The Dragon looks at you, bewildered. Then smiles.");
            System.out.println("'Goodbye.'");
            System.out.println("It blasts you with its lightning breath.");
            
            // Transition to the 'Gameover' world by setting the world to a new instance of 'Gameover'
            Greenfoot.setWorld(new Gameover());
        }
    }
    
    // Method to create the 'EnPisee' object
    public void createEnPisee() {
        // Create an instance of the 'EnPisee' class named 'testEnPisee' with the image "NPCvhappy.png"
        testEnPisee = new EnPisee("NPCvhappy.png");
        
        // Add the 'testEnPisee' object to the world at coordinates (200, 200)
        addObject(testEnPisee, 200, 200);
    }
}


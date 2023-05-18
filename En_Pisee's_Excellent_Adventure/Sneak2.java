import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Sneak2 class represents the first sneak challenge in the game. It extends 
 * the Screen class and provides the introduction and choices for the challenge. 
 * The class creates buttons for the choices and handles mouse click events to 
 * perform actions based on the selected option. It also has a method to create 
 * and add an EnPisee object to the world.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sneak2 extends Screen
{
    // Declare private instance variables
    private EnPisee testEnPisee;
    private Buttons op1Button;
    private Buttons op2Button;
    private Buttons op3Button;
    
    // Sneak2 class constructor
    public Sneak2()
    {
        // Call the superclass constructor with parameters (800, 600, 1)
        super(800, 600, 1);
        
        // Print the introduction and choices for the sneak challenge to the console
        System.out.println("You edge ever closer to the beast. It's large, powerful form lay resting peacefully");
        System.out.println("as you close in on it's belly.");
        System.out.println("1) Lighter");
        System.out.println("2) Sneak");
        System.out.println("3) Sneeze");
        
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
            System.out.println("You approach the tail of the Dragon. Pull out your lighter and ignite their");
            System.out.println("tail. The fire catches disturbingly well. The beast screams and fails as it");
            System.out.println("begins to burn. It's scales beginning to crisp and flake off the body whilst");
            System.out.println("it slowly burns to death. You slew the beast. The dragon is no more. Some");
            System.out.println("saying it's pained howls haunting the caves forever.");
            
            // Transition to the 'Gameover' world by setting the world to a new instance of 'Gameover'
            Greenfoot.setWorld(new Gameover());
        }
        
        if (Greenfoot.mouseClicked(op2Button)) {
            System.out.println("OPTION 2 SELECTED");
            System.out.println("You make your way under the dragon's soft, under belly.");
            
            // Transition to the next sneak challenge (Sneak2) by creating a new instance of 'Sneak2' world
            Greenfoot.setWorld(new Sneak3());
        }
        
        if (Greenfoot.mouseClicked(op3Button)) {
            System.out.println("OPTION 3 SELECTED");
            System.out.println("'A-A-ACHOO!' Your sneeze echos through the cave. Waking the dragon who's head");
            System.out.println("snaps to look at you. It looks at you with a level of disappointment you");
            System.out.println("normally only reserved for parents.");
            System.out.println("'Really?' The Dragon asks, before briefly getting up, and then crushing you");
            System.out.println("underneath it's large body.");

            
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


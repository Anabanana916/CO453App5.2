import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Sneak3 class represents the first sneak challenge in the game. It extends 
 * the Screen class and provides the introduction and choices for the challenge. 
 * The class creates buttons for the choices and handles mouse click events to 
 * perform actions based on the selected option. It also has a method to create 
 * and add an EnPisee object to the world.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sneak3 extends Screen
{
    // Declare private instance variables
    private EnPisee testEnPisee;
    private Buttons op1Button;
    private Buttons op2Button;
    private Buttons op3Button;
    
    // Sneak3 class constructor
    public Sneak3()
    {
        // Call the superclass constructor with parameters (800, 600, 1)
        super(800, 600, 1);
        
        // Print the introduction and choices for the sneak challenge to the console
        System.out.println("You manage to reach the soft belly of the best. The Dragon, still sleeping and");
        System.out.println("unaware of your presence. Prey to your next decision.");
        System.out.println("1) Gut");
        System.out.println("2) Tickle");
        System.out.println("3) Stab");
        
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
            System.out.println("You slide your dagger into the belly and begin running. Cutting a gaping");
            System.out.println("hole in their stomach. The Dragon cries out in pain. It rolls over to");
            System.out.println("see what happened which cause it's insides to fall out of it's body. It");
            System.out.println("gasps in horror and as the light leaves it's eyes, the last thing it sees");
            System.out.println("is the beast who did this to them. You slew the dragon, but upon taking in");
            System.out.println("the immense pile of treasure in this cave, you make a decision. You take");
            System.out.println("the Dragon's place. The village you, seemingly, set out to save is now your");            
            System.out.println("victim. They now must all give their valuables and food to you. They only");
            System.out.println("live because you see fit for them to live to serve your needs. Your legend");
            System.out.println("set, as the beast who slew a dragon.");

            
            // Transition to the 'Gameover' world by setting the world to a new instance of 'Gameover'
            // Greenfoot.setWorld(new Sneak3());
        }
        
        if (Greenfoot.mouseClicked(op2Button)) {
            System.out.println("OPTION 2 SELECTED");
            System.out.println("You begin tickling the beast. It erupts in roars of laughter! In it's");
            System.out.println(" uncontrollable laughter, it rolls over and crushes you.");
            
            // Transition to the next sneak challenge (Sneak3) by creating a new instance of 'Sneak2' world
            Greenfoot.setWorld(new Gameover());
        }
        
        if (Greenfoot.mouseClicked(op3Button)) {
            System.out.println("OPTION 3 SELECTED");
            System.out.println("You stab your dagger into the beast. It's head snaps up and whirls");
            System.out.println("around to face you");
            System.out.println("'Ow!' It says, sounding heavily insulted. It blasts you with it's");
            System.out.println("lightening breath. Frying you to a crisp before returning to it's");
            System.out.println("rest.");
            
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


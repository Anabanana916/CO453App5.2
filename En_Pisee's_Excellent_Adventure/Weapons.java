import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Weapons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weapons extends Screen
{

    private EnPisee testEnPisee;
    private Buttons op1Button; //rough code for now
    private Buttons op2Button;
    private Buttons op3Button; 
    private Buttons op4Button;
    public Weapons()
    {
        // Constructor for the 'Weapons' class
        // Call the superclass constructor with parameters (800, 600, 1)
        super(800, 600, 1);
        
        // Print the introduction and choices for selecting a weapon to the console        
        showText("You decide to take action and attempt to slay the dragon, freeing the villagers", 400, 20);
        showText("from their bindings so that they might live. You head to the local weapons", 400, 40);
        showText("merchant and find 4 weapons. Which do you take?", 400, 60);
        showText("1) Sword and shield", 200, 130);
        showText("2) Long Sword", 600, 130);
        showText("3) Dark Dagger", 200, 160);
        showText("4) Lighter", 600, 160);
        
        createEnPisee();
        // Call the 'createButtons()' method to create buttons
        createButtons();
    }
    
    public void createButtons() {
        // Method to create buttons
        
        // Create an instance of the 'Buttons' class named 'op1Button' with the image "Option1.png"
        op1Button = new Buttons("Option1.png");
        // Add the 'op1Button' object to the world at coordinates (100, 475)
        addObject(op1Button, 100, 490);
        
        // Create an instance of the 'Buttons' class named 'op2Button' with the image "Option2.png"
        op2Button = new Buttons("Option2.png");
        // Add the 'op2Button' object to the world at coordinates (100, 540)
        addObject(op2Button, 100, 560);
        
        // Create an instance of the 'Buttons' class named 'op3Button' with the image "Option3.png"
        op3Button = new Buttons("Option3.png");
        // Add the 'op3Button' object to the world at coordinates (275, 475)
        addObject(op3Button, 275, 490);
        
        // Create an instance of the 'Buttons' class named 'op4Button' with the image "Option4.png"
        op4Button = new Buttons("Option4.png");
        // Add the 'op4Button' object to the world at coordinates (275, 540)
        addObject(op4Button, 275, 560);
    }
    
    public void act() {
        // Method executed continuously during the game
        
        // Check if the mouse click occurred on the 'op1Button' object
        if (Greenfoot.mouseClicked(op1Button)) {
            // Print "OPTION 1 SELECTED" to the console
            showText("OPTION 1 SELECTED: Sword and shield", 100, 400);
            Greenfoot.playSound("boop.mp3");
            // Transition to the 'OldCrone' world by setting the world to a new instance of 'OldCrone'
            Greenfoot.setWorld(new OldCrone());
        }
        
        // Check if the mouse click occurred on the 'op2Button' object
        if (Greenfoot.mouseClicked(op2Button)) {
            // Print "OPTION 2 SELECTED" to the console
            showText("OPTION 2 SELECTED: Long Sword", 100, 400);
            Greenfoot.playSound("boop.mp3");
            // Transition to the 'OldCrone' world by setting the world to a new instance of 'OldCrone'
            Greenfoot.setWorld(new OldCrone());
        }
        
        // Check if the mouse click occurred on the 'op3Button' object
        if (Greenfoot.mouseClicked(op3Button)) {
            // Print "OPTION 3 SELECTED" to the console
            showText("OPTION 3 SELECTED: Dark Dagger", 100, 400);
            Greenfoot.playSound("boop.mp3");
            // Transition to the 'OldCrone' world by setting the world to a new instance of 'OldCrone'
            Greenfoot.setWorld(new OldCrone());
        }
        
        // Check if the mouse click occurred on the 'op4Button' object
        if (Greenfoot.mouseClicked(op4Button)) {
            // Print "OPTION 4 SELECTED" to the console
            showText("OPTION 4 SELECTED: Lighter", 100, 400);
            Greenfoot.playSound("boop.mp3");
            // Transition to the 'OldCrone' world by setting the world to a new instance of 'OldCrone'
            Greenfoot.setWorld(new OldCrone());
        }
    }
    
    public void createEnPisee() {
        // Method to create the EnPisee character
        
        // Create an instance of the 'EnPisee' class named 'testEnPisee' with the image "NPCLeftArm.png"
        testEnPisee = new EnPisee("NPCLeftArm.png");
        
        // Add the 'testEnPisee' object to the world at coordinates (400, 300)
        addObject(testEnPisee, 400, 320);
    }

}

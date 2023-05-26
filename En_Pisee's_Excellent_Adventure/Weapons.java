import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Weapons class represents a screen in a game where the player can choose a weapon to use.
 * It extends the Screen class and contains buttons for different weapon options. The class allows the
 * player to select a weapon by clicking on the corresponding button, plays a sound effect, and transitions
 * to the OldCrone world. It also includes a character, EnPisee, displayed on the screen.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weapons extends Screen {

    private EnPisee testEnPisee;
    private Buttons op1Button;
    private Buttons op2Button;
    private Buttons op3Button;
    private Buttons op4Button;
    
    /**
     * Constructor for the 'Weapons' class.
     * Calls the superclass constructor with parameters (800, 600, 1).
     * Prints the introduction and choices for selecting a weapon to the console.
     * Creates the EnPisee character.
     * Calls the 'createButtons()' method to create buttons.
     */
    public Weapons() {
        super(800, 600, 1);
        
        showText("You decide to take action and attempt to slay the dragon, freeing the villagers", 400, 20);
        showText("from their bindings so that they might live. You head to the local weapons", 400, 40);
        showText("merchant and find 4 weapons. Which do you take?", 400, 60);
        showText("1) Sword and shield", 200, 130);
        showText("2) Long Sword", 600, 130);
        showText("3) Dark Dagger", 200, 160);
        showText("4) Lighter", 600, 160);
        
        createEnPisee();
        createButtons();
    }
    
    /**
     * Method to create buttons.
     * Creates instances of the 'Buttons' class with respective images.
     * Adds the button objects to the world at specified coordinates.
     */
    public void createButtons() {
        op1Button = new Buttons("Option1.png");
        addObject(op1Button, 100, 490);
        
        op2Button = new Buttons("Option2.png");
        addObject(op2Button, 100, 560);
        
        op3Button = new Buttons("Option3.png");
        addObject(op3Button, 275, 490);
        
        op4Button = new Buttons("Option4.png");
        addObject(op4Button, 275, 560);
    }
    
    /**
     * Method executed continuously during the game.
     * Checks for mouse clicks on the buttons.
     * Prints the selected option to the console.
     * Plays a sound effect.
     * Transitions to the 'OldCrone' world.
     */
    public void act() {
        if (Greenfoot.mouseClicked(op1Button)) {
            showText("OPTION 1 SELECTED: Sword and shield", 100, 400);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new OldCrone());
        }
        
        if (Greenfoot.mouseClicked(op2Button)) {
            showText("OPTION 2 SELECTED: Long Sword", 100, 400);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new OldCrone());
        }
        
        if (Greenfoot.mouseClicked(op3Button)) {
            showText("OPTION 3 SELECTED: Dark Dagger", 100, 400);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new OldCrone());
        }
        
        if (Greenfoot.mouseClicked(op4Button)) {
            showText("OPTION 4 SELECTED: Lighter", 100, 400);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new OldCrone());
        }
    }
    
    /**
     * Method to create the EnPisee character.
     * Creates an instance of the 'EnPisee' class with the image "NPCLeftArm.png".
     * Adds the 'testEnPisee' object to the world at coordinates (400, 320).
     */
    public void createEnPisee() {
        testEnPisee = new EnPisee("NPCLeftArm.png");
        addObject(testEnPisee, 400, 320);
    }
}


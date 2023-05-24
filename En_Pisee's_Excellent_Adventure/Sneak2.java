import greenfoot.*;  // Import required classes

/**
 * The Sneak2 class represents the second sneak challenge in the game. It extends 
 * the Screen class and provides the introduction and choices for the challenge. 
 * The class creates buttons for the choices and handles mouse click events to 
 * perform actions based on the selected option. It also has methods to create 
 * and add EnPisee, PlayerWeapon, and ItemsImages objects to the world.
 * 
 * [Author's name]
 * [Version number or date]
 */
public class Sneak2 extends Screen
{
    /* Declare private instance variables */
    private EnPisee testEnPisee;
    private Buttons op1Button;
    private Buttons op2Button;
    private PlayerWeapon testPlayerWeapon;
    private ItemsImages testItem;
    
    /* Sneak2 class constructor */
    public Sneak2()
    {
        /* Call the superclass constructor with parameters (800, 600, 1) */
        super(800, 600, 1);
        
        /* Print the introduction and choices for the sneak challenge to the console */
        showText("You edge ever closer to the beast. Its large, powerful form lies resting peacefully.", 400, 20);
        showText("What do you do?", 400, 40);
        showText("1) Sneak", 200, 130);
        showText("2) Sneeze", 600, 130);
        
        /* Call the 'createButtons()' method to create buttons for the choices */
        createButtons();
        
        /* Call the 'createEnPisee()' method to create and add the EnPisee object to the world */
        createEnPisee();
        
        /* Call the 'createItems()' method to create and add the ItemsImages object to the world */
        createItems();
        
        /* Call the 'createPlayerWeapon()' method to create and add the PlayerWeapon object to the world */
        createPlayerWeapon();
    }
    
    /* Method to create buttons for the choices */
    public void createButtons() {
        /* Create instances of the 'Buttons' class with specific images and add them to the world at specific coordinates */
        op1Button = new Buttons("Option1.png");
        addObject(op1Button, 100, 490);
        
        op2Button = new Buttons("Option2.png");
        addObject(op2Button, 100, 560);
    }
    
    /* Method that is called continuously by Greenfoot for the actor to perform actions */
    public void act() {
        /* Check if the mouse click occurred on each button and perform corresponding actions based on the selected option */
        
        if (Greenfoot.mouseClicked(op1Button)) {
            /* Option 1 selected: Perform actions */
            showText("OPTION 1 SELECTED: You make your way under the dragon's soft underbelly.", 400, 40);
            Greenfoot.playSound("boop.mp3");
            /* Transition to the next sneak challenge (Sneak3) by creating a new instance of 'Sneak3' world */
            Greenfoot.setWorld(new Sneak3());
        }
        
        if (Greenfoot.mouseClicked(op2Button)) {
            /* Option 2 selected: Perform actions */
            showText("OPTION 2 SELECTED: The dragon snaps its head to look at you and then sighs.", 400, 40);
            showText("Really?' It asks, before rolling over and crushing you under its belly.", 400, 60);
            Greenfoot.playSound("boop.mp3");
            /* Transition to the 'Gameover' world by setting the world to a new instance of 'Gameover' */
            Greenfoot.setWorld(new Gameover());
        }
    }
    
    /* Method to create and add the EnPisee object to the world */
    public void createEnPisee() {
        /* Create an instance of the 'EnPisee' class named 'testEnPisee' with the image "NPCvhappy.png" */
        testEnPisee = new EnPisee("NPCvhappy.png");
        
        /* Add the 'testEnPisee' object to the world at coordinates (400, 320) */
        addObject(testEnPisee, 400, 320);
    }
    
    /* Method to create and add the PlayerWeapon object to the world */
    public void createPlayerWeapon() {
        /* Create an instance of the 'PlayerWeapon' class named 'testPlayerWeapon' with the image "Shield.png" */
        testPlayerWeapon = new PlayerWeapon("Shield.png");
        
        /* Add the 'testPlayerWeapon' object to the world at coordinates (500, 520) */
        addObject(testPlayerWeapon, 500, 520);
    }
    
    /* Method to create and add the ItemsImages object to the world */
    public void createItems() {
        /* Create an instance of the 'ItemsImages' class named 'testItem' with the image "Potion.png" */
        testItem = new ItemsImages("Potion.png");
        
        /* Add the 'testItem' object to the world at coordinates (700, 520) */
        addObject(testItem, 700, 520);
    }
}

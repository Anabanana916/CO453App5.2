import greenfoot.*;

/**
 * The River class represents a world in the game where the player 
 * encounters a river and needs to make a choice to cross it. 
 * The options are presented using buttons. When a button is 
 * clicked, the game prints a corresponding message to the console 
 * and transitions to another world based on the choice made. 
 * The class also contains methods to create and add objects to the 
 * world, such as EnPisee, PlayerWeapon, and ItemsImages.
 * 
 * [Author's name]
 * [Version number or date]
 */
public class River extends Screen
{
    /** Declare private instance variables */
    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private ItemsImages testItem;
    private Buttons op1Button;
    private Buttons op2Button;
    private Buttons op3Button;
    private Buttons op4Button;
    
    /** River class constructor */
    public River()
    {
        /** Call the superclass constructor with parameters (800, 600, 1) */
        super(800, 600, 1);
        
        /** Print the introduction and choices for crossing the river to the console */
        showText("You leave the village and come across a river. The current is strong. You can", 400, 20);
        showText("see the water crashing into the rocks. What do you do?", 400, 40);
        showText("1) Swim through", 200, 130);
        showText("2) Use a nearby person to get across", 600, 130);
        showText("3) Hop across rocks", 200, 160);
        showText("4) Take the bridge", 600, 160);
        
        createEnPisee();
        /** Call the 'createButtons()' method to create buttons for the choices */
        createButtons();
        createPlayerWeapon();
        createItems();
    }
    
    /** Method to create buttons for the choices */
    public void createButtons() {
        /** Create instances of the 'Buttons' class with specific images and add them to the world at specific coordinates */
        op1Button = new Buttons("Option1.png");
        addObject(op1Button, 100, 490);
        
        op2Button = new Buttons("Option2.png");
        addObject(op2Button, 100, 560);
        
        op3Button = new Buttons("Option3.png");
        addObject(op3Button, 275, 490);
        
        op4Button = new Buttons("Option4.png");
        addObject(op4Button, 275, 560);
    }
    
    /** Method that is called continuously by Greenfoot for the actor to perform actions */
    public void act() {
        /** Check if the mouse click occurred on each button and perform corresponding actions based on the selected option */
        
        if (Greenfoot.mouseClicked(op1Button)) {
            showText("OPTION 1 SELECTED: You jump into the water. The current carries you away, causing you to drown.", 400, 40);
            Greenfoot.playSound("boop.mp3");
            /** Transition to the 'Gameover' world by setting the world to a new instance of 'Gameover' */
            Greenfoot.setWorld(new Gameover());
        }
        
        if (Greenfoot.mouseClicked(op2Button)) {
            showText("OPTION 2 SELECTED: You grab a nearby villager and attempt to use him as a raft. You both drown.", 400, 40);
            showText("No clue what you were expecting here.", 400, 60);
            Greenfoot.playSound("boop.mp3");
            /** Transition to the 'Gameover' world by setting the world to a new instance of 'Gameover' */
            Greenfoot.setWorld(new Gameover());
        }
        
        if (Greenfoot.mouseClicked(op3Button)) {
            showText("OPTION 3 SELECTED: You look cool... until you slip on a mossy rock and fall and drown", 400, 40);
            Greenfoot.playSound("boop.mp3");
            /** Transition to the 'Gameover' world by setting the world to a new instance of 'Gameover' */
            Greenfoot.setWorld(new Gameover());
        }
        
        if (Greenfoot.mouseClicked(op4Button)) {
            showText("OPTION 4 SELECTED: Using common sense, you walk to and cross over using the nearby bridge.", 400, 40);
            Greenfoot.playSound("boop.mp3");
            /** Transition to the 'Bomb' world by setting the world to a new instance of 'Bomb' */
            Greenfoot.setWorld(new Bomb());
        }
    }
    
    /** Method to create the 'EnPisee' object */
    public void createEnPisee() {
        /** Create an instance of the 'EnPisee' class named 'testEnPisee' with the image "NPC....png" */
        testEnPisee = new EnPisee("NPC....png");
        
        /** Add the 'testEnPisee' object to the world at coordinates (400, 300) */
        addObject(testEnPisee, 400, 320);
    }
    
    /** Method to create the 'PlayerWeapon' object */
    public void createPlayerWeapon() {
        /** Create an instance of the 'PlayerWeapon' class named 'testPlayerWeapon' with the image "Shield.png" */
        testPlayerWeapon = new PlayerWeapon("Shield.png");
        
        /** Add the 'testPlayerWeapon' object to the world at coordinates (500, 500) */
        addObject(testPlayerWeapon, 500, 520);
    }
    
    /** Method to create the 'ItemsImages' object */
    public void createItems() {
        /** Create an instance of the 'ItemsImages' class named 'testItem' with the image "Potion.png" */
        testItem = new ItemsImages("Potion.png");
        
        /** Add the 'testItem' object to the world at coordinates (700, 500) */
        addObject(testItem, 700, 520);
    }
}

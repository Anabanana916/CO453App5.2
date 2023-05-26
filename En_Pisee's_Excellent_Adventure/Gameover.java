import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The class Gameover represents a game over screen. It displays a text message
 * and creates buttons for the player to interact with. When the player clicks on a button,
 * a corresponding action is performed, such as transitioning to a different game world. 
 * Additionally, a character is displayed on the screen.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gameover extends Screen {
    private EnPisee testEnPisee;
    private Buttons op1Button;
    private Buttons op2Button;
    private Buttons op3Button;
    private Buttons op4Button;

    /**
     * Constructor for objects of class Gameover.
     * Initializes the world and sets up the game over scene with text.
     * Creates and adds a button to return to the main menu.
     * Creates and adds an instance of the EnPisee class to the world.
     */
    public Gameover() {
        super(800, 600, 1);

        showText("That's Game Over. Nice try! But you might want to consider your choices carefully.", 400, 75);
        createButtons();
        createEnPisee();
    }

    /**
     * Creates a button for the main menu and adds it to the world.
     */
    public void createButtons() {
        op1Button = new Buttons("Menubut.png");
        addObject(op1Button, 390, 500);
    }

    /**
     * Method executed continuously during the game.
     * Checks for mouse clicks on the button and performs the corresponding action.
     */
    public void act() {
        if (Greenfoot.mouseClicked(op1Button)) {
            showText("OPTION 1 SELECTED", 100, 400);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new Main());
        }
    }

    /**
     * Creates and adds an instance of the EnPisee class to the world.
     */
    public void createEnPisee() {
        testEnPisee = new EnPisee("NPC.png");
        addObject(testEnPisee, 400, 300);
    }
}


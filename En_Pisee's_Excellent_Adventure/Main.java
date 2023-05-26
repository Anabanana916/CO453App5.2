import greenfoot.*;
/**
 * The class Main represents the main menu screen of the game and it extends the Screen class.

 * The constructor initializes the screen dimensions and creates a start button by calling the
 * createButtons() method.

 * The createButtons() method creates a start button object and adds it to the scene at a 
 * specific location.

 * The act() method continuously checks for mouse clicks on the start button. If the button is
 * clicked, it plays a sound and transitions to the Intro screen by creating a new instance of
 * the Intro class.

 * In summary, this code sets up a simple main menu screen with a start button. Clicking the 
 * start button triggers a transition to the introductory screen of the game or application.
 */


public class Main extends Screen {

    private Buttons op1Button;

    /**
     * Constructor for objects of class Main.
     * Initializes the world and sets up the main menu with a start button.
     * Creates and adds a start button to the world.
     */
    public Main() {
        super(800, 600, 1);
        createButtons();
    }

    /**
     * Creates a start button and adds it to the world.
     */
    public void createButtons() {
        op1Button = new Buttons("Startbut.png");
        addObject(op1Button, 100, 475);
    }

    /**
     * Method executed continuously during the game.
     * Checks for mouse clicks on the start button and transitions to the 'Intro' world.
     */
    public void act() {
        if (Greenfoot.mouseClicked(op1Button)) {
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new Intro());
        }
    }
}

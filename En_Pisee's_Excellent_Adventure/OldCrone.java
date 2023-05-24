import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The OldCrone class is a representation of an encounter with an old crone in a game. 
 * It extends the Screen class and is responsible for displaying the interaction options and 
 * handling the player's choices.

 * When the OldCrone screen is displayed, it presents the player with three options: accepting
 * the crone's aid, ignoring her, or berating her. The class creates buttons for each option 
 * and adds them to the screen.

 * The act() method continuously checks for mouse clicks on the buttons. If the player clicks
 * the button to accept the crone's aid, a potion is given, and the game transitions to the
 * River world. Clicking the button to ignore the crone leads to a transition to the River 
 * world without any consequences. Choosing to berate the crone results in the player being 
 * transformed into a cactus and leads to the Gameover world.

 * Additionally, the OldCrone class creates and adds the EnPisee character and the
 * PlayerWeapon object to the screen.

 * In summary, the OldCrone class manages the interaction with the old crone, offers choices
 * to the player, handles button clicks, and determines the corresponding actions and
 * transitions in the game.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OldCrone extends Screen {

    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private Buttons op1Button;
    private Buttons op2Button;
    private Buttons op3Button;

    /**
     * Constructor for objects of class OldCrone.
     * Initialises the world and displays the introduction and choices for interacting with the old crone.
     * Creates and adds buttons to the world.
     * Creates and adds the EnPisee character and the PlayerWeapon object to the world.
     */
    public OldCrone() {
        super(800, 600, 1);
        showText("You venture toward the Dragon's cave. An old crone approaches you, offering you", 400, 20);
        showText("aid. Do you accept?", 400, 40);
        showText("1) Accept", 200, 130);
        showText("2) Ignore", 600, 130);
        showText("3) Berate", 200, 160);
        createEnPisee();
        createButtons();
        createPlayerWeapon();
    }

    /**
     * Creates buttons for the choices and adds them to the world.
     */
    public void createButtons() {
        op1Button = new Buttons("Option1.png");
        addObject(op1Button, 100, 490);

        op2Button = new Buttons("Option2.png");
        addObject(op2Button, 100, 560);

        op3Button = new Buttons("Option3.png");
        addObject(op3Button, 275, 490);
    }

    /**
     * Method executed continuously during the game.
     * Checks for mouse clicks on the buttons and performs actions accordingly.
     * Transitions to different worlds based on the selected options.
     */
    public void act() {
        if (Greenfoot.mouseClicked(op1Button)) {
            showText("OPTION 1 SELECTED: She hands you a potion. It glows with a mysterious power.", 100, 400);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new River());
        }

        if (Greenfoot.mouseClicked(op2Button)) {
            showText("OPTION 2 SELECTED: You ignore the crone. She smelt funny anyway.", 100, 400);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new River());
        }

        if (Greenfoot.mouseClicked(op3Button)) {
            showText("OPTION 3 SELECTED: 'Be gone from my sight, you foul smelling wench!' You sneer. The crone", 400, 20);
            showText("smiles. Her yellow teeth showing the many years of dental neglect as a", 400, 40);
            showText("strange, green smoke surrounds the pair of you. You feel strange. Prickly", 400, 60);
            showText("even. You can't see, but you have been turned into a cactus.", 400, 80);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new Gameover());
        }
    }

    /**
     * Creates the EnPisee character and adds it to the world.
     */
    public void createEnPisee() {
        testEnPisee = new EnPisee("NPC.png");
        addObject(testEnPisee, 400, 320);
    }

    /**
     * Creates the PlayerWeapon object and adds it to the world.
     */
    public void createPlayerWeapon() {
        testPlayerWeapon = new PlayerWeapon("Shield.png");
        addObject(testPlayerWeapon, 500, 520);
    }

}


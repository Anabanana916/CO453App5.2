import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Dragon class represents a world in the game where the player reaches the
 * Dragon's lair. The player is presented with options through buttons and the 
 * game prints corresponding messages to the console based on the selected option.
 * The class also contains methods to create and add objects to the world, such 
 * as EnPisee, PlayerWeapon, and ItemsImages.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dragon extends Screen {
    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private ItemsImages testItem;
    private Buttons op1Button;
    private Buttons op2Button;
    private Buttons op3Button;
    private Buttons op4Button;

    /**
     * Dragon class constructor.
     * Initializes the world and sets up the Dragon's lair scene with text and buttons.
     * Creates and adds instances of EnPisee, PlayerWeapon, and ItemsImages classes to the world.
     */
    public Dragon() {
        super(800, 600, 1);

        showText("Finally, you reach the Dragon's lair. The hulking beast lays resting atop its", 400, 20);
        showText("hoard. How do you approach?", 400, 40);
        showText("1) Insult the dragon", 200, 130);
        showText("2) Challenge", 600, 130);
        showText("3) Sneak up to dragon", 200, 160);

        createEnPisee();
        createButtons();
        createItems();
        createPlayerWeapon();
    }

    /**
     * Creates buttons for the choices and adds them to the world at specific coordinates.
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
     * Handles button clicks and performs corresponding actions based on the selected option.
     * Transitions to different worlds based on the selected option.
     */
    public void act() {
        if (Greenfoot.mouseClicked(op1Button)) {
            showText("OPTION 1 SELECTED: 'WAKE UP YOU SCALEY GIT!' You yell. The Dragon opens one", 400, 40);
            showText("eye, looks at you, and with a yawn opens its maw and blasts you with", 400, 60);
            showText("its lightning breath. Killing you instantly.", 400, 80);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new Gameover());
        }

        if (Greenfoot.mouseClicked(op2Button)) {
            showText("OPTION 2 SELECTED: 'I challenge thee, vile beast!' You bellow.", 400, 40);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new Challenge1());
        }

        if (Greenfoot.mouseClicked(op3Button)) {
            showText("OPTION 3 SELECTED: You duck down low and cautiously make your way behind the", 400, 40);
            showText("dragon.", 400, 60);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new Sneak1());
        }
    }

    /**
     * Creates and adds an instance of the EnPisee class to the world at specific coordinates.
     */
    public void createEnPisee() {
        testEnPisee = new EnPisee("NPCworry.png");
        addObject(testEnPisee, 400, 320);
    }

    /**
     * Creates and adds an instance of the PlayerWeapon class to the world at specific coordinates.
     */
    public void createPlayerWeapon() {
        testPlayerWeapon = new PlayerWeapon("Shield.png");
        addObject(testPlayerWeapon, 500, 520);
    }

    /**
     * Creates and adds an instance of the ItemsImages class to the world at specific coordinates.
     */
    public void createItems() {
        testItem = new ItemsImages("Potion.png");
        addObject(testItem, 700, 520);
    }
}


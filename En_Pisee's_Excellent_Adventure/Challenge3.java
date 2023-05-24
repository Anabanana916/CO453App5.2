import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Challenge3 class represents the third challenge in the game, where the 
 * player faces the Dragon's final charge. The class extends the Screen class 
 * and provides the introduction and choices for the challenge. It creates 
 * buttons for the choices and handles mouse click events to perform actions 
 * based on the selected option. Similar to the previous classes, it has 
 * methods to create and add objects to the world, such as EnPisee, 
 * PlayerWeapon, and ItemsImages.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Challenge3 extends Screen {
    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private ItemsImages testItem;
    private Buttons op1Button;
    private Buttons op2Button;
    private Buttons op3Button;
    private Buttons op4Button;

    /**
     * Challenge3 class constructor.
     * Initializes the world and sets up the challenge scene with text and buttons.
     * Creates and adds instances of EnPisee, PlayerWeapon, and ItemsImages classes to the world.
     */
    public Challenge3() {
        super(800, 600, 1);

        showText("'ENOUGH!!' The Dragon bellows! 'I will not have you insult my", 400, 20);
        showText("presence any longer!!' It charges you, looking to swallow you", 400, 40);
        showText(" whole!", 400, 60);
        showText("1) Leap", 200, 130);
        showText("2) Dodge", 600, 130);
        showText("3) Charge", 200, 160);

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
            showText("OPTION 1 SELECTED", 400, 40);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new NeutralEnd());
        }

        if (Greenfoot.mouseClicked(op2Button)) {
            showText("OPTION 2 SELECTED: You attempt to dodge again, but you only move yourself", 400, 40);
            showText("directly into the dragon's teeth as its jaw clamps down, carving your body", 400, 80);
            showText("in two.", 400, 100);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new Gameover());
        }

        if (Greenfoot.mouseClicked(op3Button)) {
            showText("OPTION 3 SELECTED: You charge the beast, running straight into its teeth.", 400, 40);
            showText("Resulting in you becoming a hard-earned snack.", 400, 80);
            showText("in two.", 400, 100);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new Gameover());
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



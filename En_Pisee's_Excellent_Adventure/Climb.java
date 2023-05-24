import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Climb class represents a world in the game where the player encounters 
 * a dangerous cliffside while approaching a cave. The player is presented with 
 * options through buttons to decide how to proceed. When a button is clicked, 
 * the game prints a corresponding message to the console and transitions to 
 * another world based on the choice made. The class also contains methods to 
 * create and add objects to the world, such as EnPisee, PlayerWeapon, and 
 * ItemsImages.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Climb extends Screen {
    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private ItemsImages testItem;
    private Buttons op1Button;
    private Buttons op2Button;
    private Buttons op3Button;
    private Buttons op4Button;

    /**
     * Climb class constructor.
     * Initializes the world and sets up the climbing challenge scene with text and buttons.
     * Creates and adds instances of EnPisee, PlayerWeapon, and ItemsImages classes to the world.
     */
    public Climb() {
        super(800, 600, 1);

        showText("You start getting closer to the cave, but the only way to get to the cave seems", 400, 20);
        showText("to be up a dangerous cliff side. What do you do?", 400, 40);
        showText("1) Scale unsafe cliff side", 200, 130);
        showText("2) Take the scenic route", 600, 130);
        showText("3) Wait for a lift", 200, 160);

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
            showText("OPTION 1 SELECTED: You attempt to scale the cliff, but a rock breaks as you push off and", 400, 40);
            showText("you fall and become a pizza splat on the ground.", 400, 40);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new Gameover());
        }

        if (Greenfoot.mouseClicked(op2Button)) {
            showText("OPTION 2 SELECTED: You take the scenic route. Taking in the beautiful views as you safely make", 400, 40);
            showText("your way to the top.", 400, 40);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new Cave());
        }

        if (Greenfoot.mouseClicked(op3Button)) {
            showText("OPTION 3 SELECTED: You wait for a lift, and a rock squishes you flat.", 400, 40);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new Gameover());
        }
    }

    /**
     * Creates and adds an instance of the EnPisee class to the world at specific coordinates.
     */
    public void createEnPisee() {
        testEnPisee = new EnPisee("NPChappy.png");
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


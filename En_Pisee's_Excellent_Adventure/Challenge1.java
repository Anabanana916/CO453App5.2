import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Challenge1 class represents a world in the game where the player faces 
 * the Dragon's challenge. Similar to the Dragon class, the player is presented 
 * with options through buttons, and the game prints corresponding messages to 
 * the console based on the selected option. The class also contains methods to 
 * create and add objects to the world, such as EnPisee, PlayerWeapon, and ItemsImages.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Challenge1 extends Screen {
    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private ItemsImages testItem;
    private Buttons op1Button;
    private Buttons op2Button;
    private Buttons op3Button;
    private Buttons op4Button;

    /**
     * Challenge1 class constructor.
     * Initializes the world and sets up the challenge scene with text and buttons.
     * Creates and adds instances of EnPisee, PlayerWeapon, and ItemsImages classes to the world.
     */
    public Challenge1() {
        super(800, 600, 1);

        showText("The Dragon stands atop its hoard, staring you down. Its chest inflates and", 400, 20);
        showText("its eyes glow an electric blue as it readies its lightning breath", 400, 40);
        showText("1) Dodge", 200, 130);
        showText("2) Charge", 600, 130);
        showText("3) Dance off", 200, 160);
        showText("4) Just a joke bro!", 600, 160);

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

        op4Button = new Buttons("Option4.png");
        addObject(op4Button, 275, 560);
    }

    /**
     * Handles button clicks and performs corresponding actions based on the selected option.
     * Transitions to different worlds based on the selected option.
     */
    public void act() {
        if (Greenfoot.mouseClicked(op1Button)) {
            showText("OPTION 1 SELECTED: You run toward the dragon, diving to the left and narrowly", 400, 40);
            showText("missing the Dragon's lightning breath as it sizzles past you.", 400, 60);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new Challenge2());
        }

        if (Greenfoot.mouseClicked(op2Button)) {
            showText("OPTION 2 SELECTED: You charge the Dragon, bellowing a battle cry. The Dragon", 400, 40);
            showText("rears back and electrocutes you with its lightning breath, turning you to ash", 400, 80);
            showText("before you even get close.", 400, 100);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new Gameover());
        }

        if (Greenfoot.mouseClicked(op3Button)) {
            showText("OPTION 3 SELECTED: You start dancing. Your moves, incredible. Timing, immaculate.", 400, 40);
            showText("It's almost as if dancing was your true calling. The dragon crushes you with its", 400, 80);
            showText("colossal tail mid-dance. It's a dragon fight! Not a dance contest.", 400, 100);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new Gameover());
        }

        if (Greenfoot.mouseClicked(op4Button)) {
            showText("OPTION 4 SELECTED: With a look of disappointment, the dragon sighs and slaps you", 400, 40);
            showText("with its mighty claw, sending you flying into the cave wall and killing you on", 400, 80);
            showText("impact.", 400, 100);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new Gameover());
        }
    }

    /**
     * Creates and adds an instance of the EnPisee class to the world at specific coordinates.
     */
    public void createEnPisee() {
        testEnPisee = new EnPisee("NPCscared.png");
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



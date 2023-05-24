import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Challenge2 class represents the second challenge in the game, where the 
 * player faces the Dragon's tail attack. The class extends the Screen class 
 * and provides the introduction and choices for the challenge. It also creates
 * buttons for the choices and handles mouse click events to perform actions 
 * based on the selected option. Similar to the previous classes, it has methods
 * to create and add objects to the world, such as EnPisee, PlayerWeapon, and ItemsImages.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Challenge2 extends Screen {
    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private ItemsImages testItem;
    private Buttons op1Button;
    private Buttons op2Button;
    private Buttons op3Button;

    /**
     * Challenge2 class constructor.
     * Initializes the world and sets up the challenge scene with text and buttons.
     * Creates and adds instances of EnPisee, PlayerWeapon, and ItemsImages classes to the world.
     */
    public Challenge2() {
        super(800, 600, 1);

        showText("The Dragon growls. How dare this intruder insult them by not dying faster.", 400, 20);
        showText("They whirl around, their tail heading straight for you.", 400, 40);
        showText("1) Strike", 200, 130);
        showText("2) Dodge", 600, 130);
        showText("3) Leap", 200, 160);

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
            showText("OPTION 1 SELECTED: You swing your mighty weapon, carving through the tail", 400, 40);
            showText("causing the Dragon to cry out in agony.", 400, 80);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new Challenge3());
        }

        if (Greenfoot.mouseClicked(op2Button)) {
            showText("OPTION 2 SELECTED: You drop and slide under the tail, narrowly avoiding", 400, 40);
            showText("the tail as you feel the air rush over you from the tail swipe.", 400, 80);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new Challenge3());
        }

        if (Greenfoot.mouseClicked(op3Button)) {
            showText("OPTION 3 SELECTED: You leap into the air and get smacked by the tail. You", 400, 40);
            showText("fly into the air and just before you splat into the cave wall coating the", 400, 60);
            showText(" wall in a new color called 'hint of internal organs", 400, 80);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new Gameover());
        }
    }

    /**
     * Creates and adds an instance of the EnPisee class to the world at specific coordinates.
     */
    public void createEnPisee() {
        testEnPisee = new EnPisee("NPC....png");
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


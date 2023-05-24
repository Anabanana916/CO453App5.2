import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Intro represents an introductory scene in a game or application. It extends the Screen 
 * class.

 * The constructor sets up the screen dimensions and displays introductory messages using the
 * showText() method. It creates and adds a character to the scene by calling the 
 * createEnPisee() method. Additionally, it creates two buttons using the createButtons() 
 * method and adds them to the scene.

 * The act() method is continuously executed during the game and checks for mouse clicks on 
 * the buttons. If a button is clicked, it displays a corresponding text message, plays a
 * sound, and transitions to a new instance of the Village class, representing a different 
 * game world.

 * The createEnPisee() method creates and adds a character to the scene, while the
 * createButtons() method creates buttons and adds them to the scene.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intro extends Screen {
    private EnPisee testEnPisee;
    private Buttons op1Button;
    private Buttons op2Button;

    /**
     * Constructor for objects of class Intro.
     * Initializes the world and sets up the introductory scene with text and buttons.
     * Creates and adds an instance of the EnPisee class to the world.
     * Creates and adds buttons for the choices.
     */
    public Intro() {
        super(800, 600, 1);

        showText("Hi! My Name is En Pisee! And this is my game, and I shall be your narrator for", 400, 20);
        showText("this adventure. You! Will be the hero of my story! Making challenging choices,", 400, 40);
        showText("taking horrifying risks, and hopefully defeating the evil dragon and", 400, 60);
        showText("beating my game!!", 400, 80);
        showText("Are you up for the challenge?", 400, 100);
        showText("1) 'Heck yes!!'", 200, 140);
        showText("2) 'WTF are you??'", 600, 140);

        createEnPisee();
        createButtons();
    }

    /**
     * Creates buttons for the choices and adds them to the world.
     */
    public void createButtons() {
        op1Button = new Buttons("Option1.png");
        addObject(op1Button, 100, 490);

        op2Button = new Buttons("Option2.png");
        addObject(op2Button, 100, 560);
    }

    /**
     * Method executed continuously during the game.
     * Checks for mouse clicks on the buttons and performs the corresponding action.
     */
    public void act() {
        if (Greenfoot.mouseClicked(op1Button)) {
            showText("OPTION 1 SELECTED", 100, 400);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new Village());
        }

        if (Greenfoot.mouseClicked(op2Button)) {
            showText("OPTION 2 SELECTED", 100, 400);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new Village());
        }
    }

    /**
     * Creates and adds an instance of the EnPisee class to the world.
     */
    public void createEnPisee() {
        testEnPisee = new EnPisee("NPChappy.png");
        addObject(testEnPisee, 400, 320);
    }
}

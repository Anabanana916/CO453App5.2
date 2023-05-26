import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class called EvilEnding represents one ending.
 * It extends a class called Screen. The class contains private variables for character 
 * instances, player weapons, items/images, and buttons.
 * The constructor initializes the scene by setting up the screen dimensions and displaying 
 * descriptive text. It also creates and adds a character to the scene.
 * There are two additional methods. One creates buttons and adds them to the scene, while 
 * the other creates and adds another character to the scene
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EvilEnding extends Screen {

    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private ItemsImages testItem;
    private Buttons op1Button; 
    private Buttons op2Button;
    private Buttons op3Button; 
    private Buttons op4Button;
    
    /**
     * EvilEnding class constructor.
     * Initializes the world and sets up the evil ending scene with text.
     * Creates and adds an instance of the EnPisee class to the world.
     */
    public EvilEnding() {
        super(800, 600, 1);
        
        showText("You slide your dagger into the belly and begin running. Cutting a gaping", 400, 20);
        showText("hole in their stomach. The Dragon cries out in pain. It rolls over to.", 400, 40);
        showText("see what happened which cause its insides to fall out of its body. It", 400, 60);
        showText("gasps in horror and as the light leaves its eyes, the last thing it sees", 400, 80);
        showText("is the beast who did this to them. You slew the dragon, but upon taking in", 400, 100);
        showText("the immense pile of treasure in this cave, you make a decision. You take", 400, 120);
        showText("the Dragon's place. The village you, seemingly, set out to save is now your", 400, 140);
        showText("victim. They now must all give their valuables and food to you. They only", 400, 160);
        showText("live because you see fit for them to live to serve your needs. Your legend", 400, 180);
        showText("set, as the beast who slew a dragon.", 400, 200);
        
        createEnPisee();
    }
    
    /**
     * Creates a button for an option and adds it to the world.
     */
    public void createButtons(Screen main) {
        op1Button = new Buttons("Option1.png");
        addObject(op1Button, 100, 475);
    }
    
    /**
     * Creates and adds an instance of the EnPisee class to the world.
     */
    public void createEnPisee() {
        testEnPisee = new EnPisee("NPCvhappy.png");
        addObject(testEnPisee, 600, 400);
    }
}


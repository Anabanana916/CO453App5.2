import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Cave class represents a world in the game where the player reaches the 
 * Dragon's cave. The player navigates through dark tunnels and encounters a 
 * swarm of bats. The player is presented with options through buttons, and 
 * the game prints corresponding messages to the console based on the selected 
 * option. The class also contains methods to create and add objects to the 
 * world, such as EnPisee, PlayerWeapon, and ItemsImages.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
/**
 * This code defines a class named "Cave" that extends the "Screen" class.
 * It declares private instance variables for various objects.
 * 
 * The class constructor initializes the superclass with width 800, height 600, and pixel size 1.
 * It displays introduction and choices for the cave scene on the screen.
 * It creates instances of buttons and adds them to the world.
 * It also creates instances of other objects and adds them to the world.
 * 
 * The 'act' method is called continuously by Greenfoot and checks for mouse clicks on the buttons.
 * It performs corresponding actions based on the selected option and transitions to other worlds accordingly.
 * 
 * The 'createEnPisee' method creates an instance of the 'EnPisee' class and adds it to the world.
 * 
 * The 'createPlayerWeapon' method creates an instance of the 'PlayerWeapon' class and adds it to the world.
 * 
 * The 'createItems' method creates an instance of the 'ItemsImages' class and adds it to the world.
 */
public class Cave extends Screen
{
    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private ItemsImages testItem;
    private Buttons op1Button;
    private Buttons op2Button;
    private Buttons op3Button;
    
    public Cave()
    {
        super(800, 600, 1);
        
        showText("You reach the Dragon's cave. Walking through the dark tunnels, you find it", 400, 20);
        showText("hard to navigate through. You trip on a rock that you didn't see, and 100", 400, 40);
        showText(" red eyes appear from the ceiling. A swarm of bats charge towards you!", 400, 40);
        showText("1) Say hi to bats", 200, 130);
        showText("2) Use weapon on broken wall", 600, 130);
        showText("3) Run through dangerous cave", 200, 160);
        
        createEnPisee();
        
        createButtons();
        createItems();
        createPlayerWeapon();
    }
    
    public void createButtons() {
        op1Button = new Buttons("Option1.png");
        addObject(op1Button, 100, 490);
        
        op2Button = new Buttons("Option2.png");
        addObject(op2Button, 100, 560);
        
        op3Button = new Buttons("Option3.png");
        addObject(op3Button, 275, 490);
    }
    
    public void act() {
        if (Greenfoot.mouseClicked(op1Button)) {
            showText("OPTION 1 SELECTED: You are swarmed by the bats. When they finally leave,", 400, 40);
            showText("the only thing left of you is a skeleton.", 400, 40);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new Gameover());
        }
        
        if (Greenfoot.mouseClicked(op2Button)) {
            showText("OPTION 2 SELECTED: You take your weapon and break a nearby wall and get", 400, 40);
            showText("away from the bats.", 400, 40);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new Dragon());
        }
        
        if (Greenfoot.mouseClicked(op3Button)) {
            showText("OPTION 3 SELECTED: You run through the dark cave, running into a wall and causing a", 400, 40);
            showText("stalagmite... stalactite? One of those pointy rock thingies to fall on top of you.", 400, 40);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new Gameover());
        }
    }
    
    public void createEnPisee() {
        testEnPisee = new EnPisee("NPCdone.png");
        addObject(testEnPisee, 400, 320);
    }
    
    public void createPlayerWeapon() {
        testPlayerWeapon = new PlayerWeapon("Shield.png");
        addObject(testPlayerWeapon, 500, 520);
    }
    
    public void createItems() {
        testItem = new ItemsImages("Potion.png");
        addObject(testItem, 700, 520);
    }
}

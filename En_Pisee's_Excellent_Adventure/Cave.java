import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cave extends Screen
{

    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private ItemsImages testItem;
    private Buttons op1Button; //rough code for now
    private Buttons op2Button;
    private Buttons op3Button; 
    private Buttons op4Button;
    
    public Cave()
    {
        super(800, 600, 1);
        System.out.println("You reach the Dragon's cave. Walking through the dark tunnels, you find it hard to");
        System.out.println("navigate through. You trip on a rock that you didn't see, and 100 red eyes appear");
        System.out.println("from the ceiling. A swarm of bats charge towards you!");
        System.out.println("1) Say hi to bats");
        System.out.println("2) Use weapon on broken wall");
        System.out.println("3) Run through dangerous cave");
        System.out.print(">  ");
        createButtons();
    }
    
    public void createButtons() {
        op1Button = new Buttons("Option1.png");
        addObject(op1Button, 100, 475);
        
        op2Button = new Buttons("Option2.png");
        addObject(op2Button, 100, 540);
        
        op3Button = new Buttons("Option3.png");
        addObject(op3Button, 275, 475);
        
    }
    
    public void act() {
        if (Greenfoot.mouseClicked(op1Button)) {
            System.out.println("OPTION 1 SELECTED");
            System.out.println("You are swarmed by the bats. When they finally leave, the only thing left of you is a skeleton.");
            Greenfoot.setWorld(new Gameover());
        }
        
        if (Greenfoot.mouseClicked(op2Button)) {
            System.out.println("OPTION 2 SELECTED");
            System.out.println("You take your weapon and break a near by wall and get away from the bats.");
            Greenfoot.setWorld(new Dragon());
        }
        
        if (Greenfoot.mouseClicked(op3Button)) {
            System.out.println("OPTION 3 SELECTED");
            System.out.println("You run through the dark cave. Running into a wall and causing a stalagmite...");
            System.out.println("stalactite? One of those point rock thingies to fall on top of you.");
            Greenfoot.setWorld(new Gameover());
        }
    }
    
    public void createEnPisee() {
        testEnPisee = new EnPisee("NPCdone.png");
        addObject(testEnPisee, 400, 300);
    }
    
    public void createPlayerWeapon() {
        testPlayerWeapon = new PlayerWeapon("Shield.png");
        addObject(testPlayerWeapon, 500, 500);
    }
    
    public void createItems() {
        testItem = new ItemsImages("Potion.png");
        addObject(testItem, 700, 500);
    }
}

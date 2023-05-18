import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Screen
{

    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private ItemsImages testItem;
    private Buttons op1Button; //rough code for now
    private Buttons op2Button;
    private Buttons op3Button; 
    private Buttons op4Button;
    public Bomb()
    {
        super(800, 600, 1);
        System.out.println("You venture on. Eventually, coming across an ornate chest! You open the chest and reach inside an-");
        System.out.println("OH MY GOD!!! IT'S A LIT BOMB!! Quick! Throw it away!!");
        
        System.out.println("1) Throw bomb");
        System.out.println("2) Hold on to bomb");
        System.out.println("3) Give bomb to En Pisee");
        System.out.println("4) Extinguish bomb");
        createButtons();
    }
    
    public void createButtons() {
        op1Button = new Buttons("Option1.png");
        addObject(op1Button, 100, 475);
        
        op2Button = new Buttons("Option2.png");
        addObject(op2Button, 100, 540);
        
        op3Button = new Buttons("Option3.png");
        addObject(op3Button, 275, 475);
        
        op4Button = new Buttons("Option4.png");
        addObject(op4Button, 275, 540);
    }
    
    public void act() {
        if (Greenfoot.mouseClicked(op1Button)) {
            System.out.println("OPTION 1 SELECTED");
            System.out.println("You hurl the bomb away and it explodes harmlessly.");
            Greenfoot.setWorld(new Gameover());
        }
        if (Greenfoot.mouseClicked(op2Button)) {
            System.out.println("OPTION 2 SELECTED");
            System.out.println("What? Why would yo-\n");
            System.out.println("The bomb explodes in your hands. Sending pieces of you flying everywhere.");
            Greenfoot.setWorld(new Gameover());
        }
        if (Greenfoot.mouseClicked(op3Button)) {
            System.out.println("OPTION 3 SELECTED");
            System.out.println("huh? what????");
            Greenfoot.setWorld(new Gameover());
        }
        if (Greenfoot.mouseClicked(op4Button)) {
            System.out.println("OPTION 4 SELECTED");
            System.out.println("You use the lid of the lighter to put out the bomb fuse. I have no clue how that worked.");
            Greenfoot.setWorld(new Bomb());
        }
    }
    
    
    public void createEnPisee() {
        testEnPisee = new EnPisee("NPCworry.png");
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

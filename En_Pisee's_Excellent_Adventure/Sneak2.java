import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Challenge3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sneak2 extends Screen
{

    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private ItemsImages testItem;
    private Buttons op1Button; //rough code for now
    private Buttons op2Button;
    private Buttons op3Button; 
    private Buttons op4Button;
    
    public Challenge3()
    {
        super(800, 600, 1);
        
        System.out.println("You edge ever closer to the beast. It's large, powerful form lay resting peacefully");
        System.out.println("as you close in on it's belly.");
        
        System.out.println("1) Lighter");
        System.out.println("2) Sneak");
        System.out.println("3) Sneeze");
        
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
            System.out.println("OPTION 2 SELECTED");
            System.out.println("You approach the tail of the Dragon. Pull out your lighter and ignite their");
            System.out.println("tail. The fire catches disturbingly well. The beast screams and fails as it");
            System.out.println("begins to burn. It's scales beginning to crisp and flake off the body whilst");
            System.out.println("it slowly burns to death. You slew the beast. The dragon is no more. Some");
            System.out.println("saying it's pained howls haunting the caves forever.");
            Greenfoot.setWorld(new EvilEnding());
        }
        if (Greenfoot.mouseClicked(op2Button)) {
            System.out.println("OPTION 2 SELECTED");
            System.out.println("You make your way under the dragon's soft, under belly.");
            Greenfoot.setWorld(new Sneak3());
        }
        if (Greenfoot.mouseClicked(op3Button)) {
            System.out.println("OPTION 3 SELECTED");
            System.out.println("'A-A-ACHOO!' Your sneeze echos through the cave. Waking the dragon who's head");
            System.out.println("snaps to look at you. It looks at you with a level of disappointment you");
            System.out.println("normally only reserved for parents.");
            System.out.println("'Really?' The Dragon asks, before briefly getting up, and then crushing you");
            System.out.println("underneath it's large body.");
            Greenfoot.setWorld(new Gameover());
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

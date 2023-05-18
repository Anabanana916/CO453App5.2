import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Challenge3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Challenge3 extends Screen
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
        
        System.out.println("'ENOUGH!!' The Dragon bellows! 'I will not have you insult my presence any longer!!'");
        System.out.println("It charges you, looking to swallow you whole!");
        System.out.println("1) Leap into the maw of the beast");
        System.out.println("2) Dodge");
        System.out.println("3) Charge");
        
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
            System.out.println("You leap into the maw of the Dragon. He swallows you whole and you feel yourself slide");
            System.out.println("down the gullet of the beast. You don't have much time. You use all of your remaining");
            System.out.println("strength to slice and cut the innards of the Dragon. You hear their muffled screams of");
            System.out.println("pain, their cries of pain slowly being turned into gargled screams as blood fills their");
            System.out.println("throat. You fear that you may not survive the insides of the dragon, even though you");
            System.out.println("slew the beast. However, the potion you drank gave you the resiliance to not only ");
            System.out.println("survive, but cut your way out. You saved the village and lived to tell the tale. Thanks");
            System.out.println("to you, the village thrives. Your story is shared across the land, a statue erected in");
            System.out.println("the village square and you are heralded as a hero.");
            Greenfoot.setWorld(new Challenge2());
        }
        if (Greenfoot.mouseClicked(op2Button)) {
            System.out.println("OPTION 2 SELECTED");
            System.out.println("You attempt to dodge again, but you only move yourself directly into the dragon's");
            System.out.println("teeth as it's jaw clamps down, carving your body in two.");
            Greenfoot.setWorld(new Gameover());
        }
        if (Greenfoot.mouseClicked(op3Button)) {
            System.out.println("OPTION 3 SELECTED");
            System.out.println("You charge the beast, running straight into it's teeth. Resulting in you becoming");
            System.out.println("a hard earned snack.");
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

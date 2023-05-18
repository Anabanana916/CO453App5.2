import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Challenge3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Challenge extends Screen
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
        
        System.out.println("You manage to reach the soft belly of the best. The Dragon, still sleeping and");
        System.out.println("unaware of your presence. Prey to your next decision.");
    
        System.out.println("1) Gut");
        System.out.println("2) Tickle");
        System.out.println("3) Stab");
        
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
            System.out.println("You slide your dagger into the belly and begin running. Cutting a gaping");
            System.out.println("hole in their stomach. The Dragon cries out in pain. It rolls over to ");
            System.out.println("see what happened which cause it's insides to fall out of it's body. It");
            System.out.println("gasps in horror and as the light leaves it's eyes, the last thing it sees");
            System.out.println("is the beast who did this to them. You slew the dragon, but upon taking in");
            System.out.println("the immense pile of treasure in this cave, you make a decision. You take");
            System.out.println("the Dragon's place. The village you, seemingly, set out to save is now your");
            System.out.println("victim. They now must all give their valuables and food to you. They only");
            System.out.println("live because you see fit for them to live to serve your needs. Your legend");
            System.out.println("set, as the beast who slew a dragon.");
            Greenfoot.setWorld(new EvilEnding());
        }
        if (Greenfoot.mouseClicked(op2Button)) {
            System.out.println("OPTION 2 SELECTED");
            System.out.println("You begin tickling the beast. It erupts in roars of laughter! In it's");
            System.out.println("uncontrollable laughter, it rolls over and crushes you.");
            Greenfoot.setWorld(new Gameover());
        }
        if (Greenfoot.mouseClicked(op3Button)) {
            System.out.println("OPTION 3 SELECTED");
            System.out.println("You stab your dagger into the beast. It's head snaps up and whirls");
            System.out.println("around to face you.");
            System.out.println("'Ow!' It says, sounding heavily insulted. It blasts you with it's");
            System.out.println("lightening breath. Frying you to a crisp before returning to it's");
            System.out.println("rest.");
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

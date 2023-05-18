import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Challenge1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Challenge1 extends Screen
{

    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private ItemsImages testItem;
    private Buttons op1Button; //rough code for now
    private Buttons op2Button;
    private Buttons op3Button; 
    private Buttons op4Button;
    
    public Challenge1()
    {
            super(800, 600, 1);
                System.out.println("The Dragon stands atop it' hoard, staring you down. It's chest inflates and it's eyes");
                System.out.println("glow an electric blue as it readies it's lightening breath toward you.");
                System.out.println("1) Dodge");
                System.out.println("2) Charge");
                System.out.println("3) Dance off");
                System.out.println("4) Just a joke bro!  ");
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
            System.out.println("You run toward the dragon, diving to the left and narrowly missing the Dragon's");
            System.out.println("lightening breath as it sizzles past you.");
            Greenfoot.setWorld(new Challenge2());
        }
        if (Greenfoot.mouseClicked(op2Button)) {
            System.out.println("OPTION 2 SELECTED");
            System.out.println("You charge the Dragon. Bellowing a battle cry. The Dragon rears back and electrocutes");
            System.out.println("you with its lightening breath, turning you to ashe before you even get close.");
            Greenfoot.setWorld(new Gameover());
        }
        if (Greenfoot.mouseClicked(op3Button)) {
            System.out.println("OPTION 3 SELECTED");
            System.out.println("You start dancing. Your moves, incredible. Timing, immaculate. It's almost as if ");
            System.out.println("dancing was your true calling. The dragon, crushes you with it's colossal tail mid ");
            System.out.println("dance. It's a dragon fight! Not a dance contest.");
            Greenfoot.setWorld(new Gameover());
        }
        if (Greenfoot.mouseClicked(op4Button)) {
            System.out.println("OPTION 4 SELECTED");
            System.out.println("With a look of disappointment, the dragon sighs and slaps you with its mighty claw. ");
            System.out.println("Sending you flying into the cave wall and killing you on impact.");
            Greenfoot.setWorld(new Gameover());
        }
    }
    
    public void createEnPisee() {
        testEnPisee = new EnPisee("NPCscared.png");
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

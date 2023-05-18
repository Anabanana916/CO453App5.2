import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dragon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dragon extends Screen
{

    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private ItemsImages testItem;
    private Buttons op1Button; //rough code for now
    private Buttons op2Button;
    private Buttons op3Button; 
    private Buttons op4Button;
    
    public Dragon()
    {
        super(800, 600, 1);
        System.out.println("Finally, you reach the Dragon's lair. The hulking, beast lays resting atop its hoard.");
        System.out.println("How do you approach?");
        System.out.println("1) Insult the dragon");
        System.out.println("2) Challenge");
        System.out.println("3) Drink potion");
        System.out.println("4) Sneak up to dragon");
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
            System.out.println("'WAKE UP YOU SCALEY GIT!' You yell. The Dragon opens one eye, looks at you,");
            System.out.println("and with a yawn opens it's maw and blasts you with it's ning breath. Killing");
            System.out.println("you instantly.");
            Greenfoot.setWorld(new Gameover());
        }
        if (Greenfoot.mouseClicked(op2Button)) {
            System.out.println("OPTION 2 SELECTED");
            System.out.println("'I challenge thee, vile beast!' You bellow.");
            Greenfoot.setWorld(new Challenge1());
        }
        if (Greenfoot.mouseClicked(op3Button)) {
            System.out.println("OPTION 3 SELECTED");
            System.out.println("You chug the entirety of your potion, throw the glass down on the ground");
            System.out.println("and yell 'Awaken, vile beast, you shall torment the good people of that");
            System.out.println("village any longer!'");
            Greenfoot.setWorld(new Gameover());
        }
        if (Greenfoot.mouseClicked(op4Button)) {
            System.out.println("OPTION 4 SELECTED");
            System.out.println("You duck down low and cautiously make your way behind the dragon. However,");
            System.out.println("you trip on an unseen rock and collapse onto the treasure. You hope the noise");
            System.out.println("did not wake the beast. You look up to see it staring down at you. 'Nice try.'");
            System.out.println("It scoffs before biting and swallowing you whole.");
            Greenfoot.setWorld(new Sneak1());
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

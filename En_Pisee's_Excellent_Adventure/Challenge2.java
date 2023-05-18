import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Challenge2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Challenge2 extends Screen
{

    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private ItemsImages testItem;
    private Buttons op1Button; //rough code for now
    private Buttons op2Button;
    private Buttons op3Button; 
    private Buttons op4Button;
    
    public Challenge2()
    {
        super(800, 600, 1);
        System.out.println("The Dragon growls. How dare this intruder insult them by not dying faster. They whirl around,");
        System.out.println("their tail heading straight for you.");
        
    
        System.out.println("1) Strike");
        System.out.println("2) Dodge");
        System.out.println("3) Leap");
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
            System.out.println("You swing your mighty weapon. Carving through the tail, causing the Dragon to ");
            System.out.println("cry out in agony.");
            Greenfoot.setWorld(new Challenge2());
        }
        if (Greenfoot.mouseClicked(op2Button)) {
            System.out.println("OPTION 2 SELECTED");
            System.out.println("You drop and slide under the tail. Narrowly avoiding the tail as you feel the air ");
            System.out.println("rush over you from the tail swipe.");
            Greenfoot.setWorld(new Challenge2());
        }
        if (Greenfoot.mouseClicked(op3Button)) {
            System.out.println("OPTION 3 SELECTED");
            System.out.println("You leap into the air and get smacked by the tail. You fly into the air and just ");
            System.out.println("before you splat into the cave wall, you swear you hear the Dragon say 'HOME RUN!'.");
            System.out.println("You then coat the wall in a new colour called hint of internal organs.");
            Greenfoot.setWorld(new Gameover());
        }
    }
    
    public void createEnPisee() {
        testEnPisee = new EnPisee("NPC....png");
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

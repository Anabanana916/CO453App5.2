import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Climb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Climb extends Screen
{
    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private ItemsImages testItem;
    private Buttons op1Button; //rough code for now
    private Buttons op2Button;
    private Buttons op3Button; 
    private Buttons op4Button;
    
    public Climb()
    {
        super(800, 600, 1);
        System.out.println("You start getting closer to the cave, but the only way to get to the cave seems to be up");
        System.out.println("a dangerous cliff side. What do you do?");
        System.out.println("1) Scale unsafe cliff side");
        System.out.println("2) Take the scenic route");
        System.out.println("3) Wait for a lift");
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
            System.out.println("You attempt to scale the cliff, but a rock breaks as you push off and you fall and");
            System.out.println("become a pizza splat on the ground.");
            Greenfoot.setWorld(new Gameover());
        }
        if (Greenfoot.mouseClicked(op2Button)) {
            System.out.println("OPTION 2 SELECTED");
            System.out.println("You take the scenic route. Taking in the beautiful views as you safely make your way to the top.");
            Greenfoot.setWorld(new Cave());
        }
        
        if (Greenfoot.mouseClicked(op3Button)) {
            System.out.println("OPTION 3 SELECTED");
            System.out.println("You wait for a lift, and a rock squishes you flat.");
            Greenfoot.setWorld(new Gameover());
        }
    }
    
    public void createEnPisee() {
        testEnPisee = new EnPisee("NPChappy.png");
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

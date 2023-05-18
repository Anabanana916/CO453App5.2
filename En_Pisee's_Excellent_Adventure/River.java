import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class River here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class River extends Screen
{

    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private ItemsImages testItem;
    private Buttons op1Button; //rough code for now
    private Buttons op2Button;
    private Buttons op3Button; 
    private Buttons op4Button;
    public River()
    {
        super(800, 600, 1);
        System.out.println("You leave the village and come across a river. The current is strong. You can see the water");
        System.out.println("crashing into the rocks. What do you do?");
        System.out.println("1) Swim through");
        System.out.println("2) Grab a nearby person and use them to get across");
        System.out.println("3) Hop across rocks");
        System.out.println("4) Take the bridge");
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
            System.out.println("You jump into the water. The current carries you away, causing you to drown.");
            Greenfoot.setWorld(new Gameover());
        }
        if (Greenfoot.mouseClicked(op2Button)) {
            System.out.println("OPTION 2 SELECTED");
            System.out.println("You grab a nearby villager and attempt to use him as a raft. You both drown. No clue what you were expecting here.");
            Greenfoot.setWorld(new Gameover());
        }
        if (Greenfoot.mouseClicked(op3Button)) {
            System.out.println("OPTION 3 SELECTED");
            System.out.println("You look cool... until you slip on a mossy rock and fall and drown");
            Greenfoot.setWorld(new Gameover());
        }
        if (Greenfoot.mouseClicked(op4Button)) {
            System.out.println("OPTION 4 SELECTED");
            System.out.println("Using common sense, you walk to and cross over using the nearby bridge.");
            Greenfoot.setWorld(new Bomb());
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

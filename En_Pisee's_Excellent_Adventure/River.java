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
    private Items testItem;
    private Buttons op1Button; //rough code for now
    private Buttons op2Button;
    private Buttons op3Button; 
    private Buttons op4Button;
    public River()
    {
        super(800, 600, 1);
    }
    
    public void createButtons(Screen bomb) {
        op2Button = new Buttons("Option2.png", bomb);
        addObject(op2Button, 100, 540);
    }
    
    public void createGOButtons(Screen link) {
        op1Button = new Buttons("Option1.png", link);
        addObject(op1Button, 100, 475);
        
        op3Button = new Buttons("Option3.png", link);
        addObject(op3Button, 275, 475);
        
        op4Button = new Buttons("Option4.png", link);
        addObject(op4Button, 275, 540);
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
        testItem = new Items("Potion.png");
        addObject(testItem, 700, 500);
    }
}

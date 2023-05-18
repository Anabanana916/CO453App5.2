import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OldCrone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OldCrone extends Screen
{

    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private Buttons op1Button; //rough code for now
    private Buttons op2Button;
    private Buttons op3Button; 
    private Buttons op4Button;
    public OldCrone()
    {
        super(800, 600, 1);
        System.out.println("You venture toward the Dragon's cave. An old crone approaches you, offering you");
        System.out.println("aid. Do you accept?");

        System.out.println("1) Accept");
        System.out.println("2) Ignore");
        System.out.println("3) Berate");
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
        boolean restartEncounter= false;
        while(!restartEncounter) {
            if (Greenfoot.mouseClicked(op1Button)) {
                System.out.println("OPTION 1 SELECTED");
                System.out.println("She hands you a potion. It glows with a mysterious power. You store it for later.");
                Greenfoot.setWorld(new River());
            }
            if (Greenfoot.mouseClicked(op2Button)) {
                System.out.println("OPTION 2 SELECTED");
                System.out.println("You ignore the crone. She smelt funny anyway.");
    
                Greenfoot.setWorld(new River());
            }
            if (Greenfoot.mouseClicked(op3Button)) {
                System.out.println("OPTION 3 SELECTED");
                System.out.println("'Be gone from my sight, you foul smelling wench!' You sneer. The crone");
                System.out.println("smiles. Her yellow teeth showing the many years of dental neglect as a");
                System.out.println("strange, green smoke surrounds the pair of you. You feel strange. Prickly");
                System.out.println("even. You can't see, but you have been turned into a cactus.");
                Greenfoot.setWorld(new Gameover());
            }
        }
    }
    
    
    public void createEnPisee() {
        testEnPisee = new EnPisee("NPC.png");
        addObject(testEnPisee, 400, 300);
    }
    
    public void createPlayerWeapon() {
        testPlayerWeapon = new PlayerWeapon("Shield.png");
        addObject(testPlayerWeapon, 500, 500);
    }

}

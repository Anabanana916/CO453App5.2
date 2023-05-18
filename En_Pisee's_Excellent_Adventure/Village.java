import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Village here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Village extends Screen
{
    int i = 0;
    private EnPisee testEnPisee;
    private Buttons op1Button; //rough code for now
    private Buttons op2Button;
    private Buttons op3Button; 
    private Buttons op4Button;
    /**
     * Constructor for objects of class Village.
     * 
     */
    
    public Village()
    {
        super(800, 600, 1);
        createButtons();
        
        
            System.out.println("You, in a world of dragons and knights in shining armour, find yourself in a village.");
            System.out.println("The village people are tired and ragged. Labouring long hours to appease the great,");
            System.out.println("blue dragon who over sees the village. It demands that all food and precious materials");
            System.out.println("of the village be given to them. The villagers are barely able to keep themselves alive");
            System.out.println("whilst keeping the dragon from killing them all.");
                
            System.out.println("1) 'No, seriously. WTF are you?'");
            System.out.println("2) Take pity on the villagers");
            System.out.println("3) Sympathise with the villagers");
            System.out.println("4) Look at them in disgust");
                
            System.out.print(">  ");
    
        if (i == 5) {
            /*NPC leaves ending*/
            System.out.println("Ok! That does it!! If you're just going to be rude! I won't tell you my excellent story.");
            System.out.println("Good bye!!");
            /*gameOver();*/
        }
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
            System.out.println("1)'No, seriously. WTF are you?'");
            i = i + 1;
            Greenfoot.setWorld(new Weapons());
        }
        if (Greenfoot.mouseClicked(op2Button)) {
            System.out.println("OPTION 2 SELECTED");
            System.out.println("2) Take pity on the villagers");
            i = 6;
            Greenfoot.setWorld(new Weapons());
        }
        if (Greenfoot.mouseClicked(op3Button)) {
            System.out.println("OPTION 3 SELECTED");
            System.out.println("3) Sympathise with the villagers");
            i = 6;
            Greenfoot.setWorld(new Weapons());
        }
        if (Greenfoot.mouseClicked(op4Button)) {
            System.out.println("OPTION 4 SELECTED");
            System.out.println("4) Look at them in disgust");
            i = 6;
            Greenfoot.setWorld(new Weapons());
        }
    }
    
    
    
    public void createEnPisee() {
        testEnPisee = new EnPisee("NPCRightArm.png");
        addObject(testEnPisee, 400, 300);
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class creates a village scenario where the player encounters a group of tired
 * villagers oppressed by a blue dragon. The villagers struggle to meet the 
 * dragon's demands for food and resources, barely surviving. The code includes 
 * the creation of buttons for different options and displays introductory text
 * to set the scene. It also handles mouse clicks on the buttons, triggering 
 * actions and transitions to other worlds. The code utilizes sound effects and 
 * displays text based on the selected options. Additionally, it creates and 
 * adds a character named "EnPisee" to the village scene.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Village extends Screen
{
    int i = 0;
    private EnPisee testEnPisee;
    private Buttons op1Button; // Rough code for now
    private Buttons op2Button;
    private Buttons op3Button; 
    private Buttons op4Button;
    /**
     * Constructor for objects of class Village.
     */
    public Village()
    {
        super(800, 600, 1);
        
        createButtons(); /* Create buttons for options */
        
        showText("In a world of dragons and knights in shining armor, you find yourself in a", 400, 20);
        showText("village. The villagers are tired and ragged. Labouring long hours to appease", 400, 40);
        showText("the great, blue dragon who oversees the village. It demands that all food", 400, 60);
        showText("and precious materials be given to them. The villagers are barely able to", 400, 80);
        showText("keep themselves alive whilst keeping the dragon from killing them all.", 400, 100);
        showText("1) 'No, seriously. WTF are you?'", 200, 130);
        showText("2) Take pity on the villagers", 600, 130);
        showText("3) Sympathize with the villagers", 200, 160);
        showText("4) Look at them in disgust", 600, 160);
        
        createEnPisee(); /* Create the character 'EnPisee' */
        
        if (i == 5) {
            showText("Ok! That does it!! If you're just going to be rude! I won't tell you my", 400, 20);
            showText("excellent story. Goodbye!!", 400, 40);
        }
    }
    
    public void createButtons() {
        op1Button = new Buttons("Option1.png"); /* Create the first option button */
        addObject(op1Button, 100, 490);
        
        op2Button = new Buttons("Option2.png"); /* Create the second option button */
        addObject(op2Button, 100, 560);
        
        op3Button = new Buttons("Option3.png"); /* Create the third option button */
        addObject(op3Button, 275, 490);
        
        op4Button = new Buttons("Option4.png"); /* Create the fourth option button */
        addObject(op4Button, 275, 560);
    }
    
    public void act() {
        if (Greenfoot.mouseClicked(op1Button)) { /* Check if the first option button is clicked */
            showText("OPTION 1 SELECTED:'No, seriously. WTF are you?'", 100, 400);
            Greenfoot.playSound("boop.mp3");
            i = i + 1;
            
            Greenfoot.setWorld(new Weapons()); /* Transition to the 'Weapons' world */
        }
        
        if (Greenfoot.mouseClicked(op2Button)) { /* Check if the second option button is clicked */
            showText("OPTION 2 SELECTED", 100, 400);
            Greenfoot.playSound("boop.mp3");
            i = 6;
            
            Greenfoot.setWorld(new Weapons()); /* Transition to the 'Weapons' world */
        }
        
        if (Greenfoot.mouseClicked(op3Button)) { /* Check if the third option button is clicked */
            showText("OPTION 3 SELECTED", 100, 400);
            Greenfoot.playSound("boop.mp3");
            i = 6;
            
            Greenfoot.setWorld(new Weapons()); /* Transition to the 'Weapons' world */
        }
        
        if (Greenfoot.mouseClicked(op4Button)) { /* Check if the fourth option button is clicked */
            showText("OPTION 4 SELECTED", 100, 400);
            Greenfoot.playSound("boop.mp3");
            i = 6;
            
            Greenfoot.setWorld(new Weapons()); /* Transition to the 'Weapons' world */
        }
    }
    
    public void createEnPisee() {
        testEnPisee = new EnPisee("NPCRightArm.png"); /* Create the 'EnPisee' character */
        
        addObject(testEnPisee, 400, 320);
    }
}

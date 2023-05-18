import greenfoot.*;

public class Main extends Screen {

    private Buttons op1Button;

    /**
     * Constructor for objects of class Main.
     * 
     */
    public Main() {
        super(800, 600, 1);
        createButtons();
        prepare();
    }

    public void createButtons() {
        GreenfootImage buttonImage = new GreenfootImage("Option1.png");
        op1Button = new Buttons("Option1.png");
        addObject(op1Button, 100, 475);
    }

    public void act() {
        if (Greenfoot.mouseClicked(op1Button)) {
            System.out.println("Game Starts");
            Greenfoot.setWorld(new Intro());
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
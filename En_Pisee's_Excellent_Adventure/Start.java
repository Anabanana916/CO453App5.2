import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Screen
{
    public Main main;
    public Intro intro;
    public Village village;
    public Weapons weapons;
    public OldCrone oldCrone;
    public River river;
    public Bomb bomb;
    public Climb climb;
    public Cave cave;
    public Dragon dragon;
    public Challenge1 challenge1;
    public Challenge2 challenge2;
    public Challenge3 challenge3;
    public NeutralEnd neutralEnd;
    
    public Sneak1 sneak1;
    
    public Start()
    {
        super(800, 600, 1);
        main = new Main();
        intro = new Intro();
        village = new Village();
        weapons = new Weapons();
        oldCrone = new OldCrone();
        river = new River();
        bomb = new Bomb();
        climb = new Climb();
        cave = new Cave();
        dragon = new Dragon();
        challenge1 = new Challenge1();
        challenge2 = new Challenge2();
        challenge3 = new Challenge3();
        neutralEnd = new NeutralEnd();
        
        sneak1 = new Sneak1();
        
        main.createButtons(intro);
        main.createEnPisee();
        
        intro.createButtons(village);
        intro.createEnPisee();
        
        village.createButtons(weapons);
        village.createEnPisee();
        
        weapons.createButtons(oldCrone);
        weapons.createEnPisee();
        
        oldCrone.createButtons(river);
        oldCrone.createEnPisee();
        oldCrone.createPlayerWeapon();
        
        river.createButtons(bomb);
        river.createEnPisee();
        river.createPlayerWeapon(); //placeholder
        river.createItems(); //placeholder
        
        bomb.createButtons(climb);
        bomb.createEnPisee();
        bomb.createPlayerWeapon(); //placeholder
        bomb.createItems(); //placeholder
        
        climb.createButtons(cave);
        climb.createEnPisee();
        climb.createPlayerWeapon(); //placeholder
        climb.createItems(); //placeholder
        
        cave.createButtons(dragon);
        cave.createEnPisee();
        cave.createPlayerWeapon(); //placeholder
        cave.createItems(); //placeholder
        
        dragon.createButtons(challenge1);
        dragon.createEnPisee();
        dragon.createPlayerWeapon(); //placeholder
        dragon.createItems(); //placeholder
        
        challenge1.createButtons(challenge2);
        challenge1.createEnPisee();
        challenge1.createPlayerWeapon(); //placeholder
        challenge1.createItems(); //placeholder
        
        challenge2.createButtons(challenge3);
        challenge2.createEnPisee();
        challenge2.createPlayerWeapon(); //placeholder
        challenge2.createItems(); //placeholder
        
        challenge3.createButtons(neutralEnd);
        challenge3.createEnPisee();
        challenge3.createPlayerWeapon(); //placeholder
        challenge3.createItems(); //placeholder
        
        neutralEnd.createButtons(main);
        neutralEnd.createEnPisee();
        neutralEnd.createPlayerWeapon(); //placeholder
        neutralEnd.createItems(); //placeholder
        
        Greenfoot.setWorld(main);
    }
}

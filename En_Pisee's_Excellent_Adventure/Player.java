
public class Player {
    //private int weapon;

    private Items.Weapons myWeapon = Items.Weapons.none;
    private boolean potion = false;
    private boolean bomb = false;


    public Items.Weapons getWeapon(){
        return myWeapon;
    }

    public void setWeapon(Items.Weapons newWeapon) {
        this.myWeapon = newWeapon;
    }

    public boolean getPotion(){
        return potion;
    }

    public void setPotion(boolean newPotion){
        this.potion = newPotion;
    }

    public boolean getBomb(){
        return bomb;
    }

    public void seBomb(boolean newBomb){
        this.bomb = newBomb;
    }
}
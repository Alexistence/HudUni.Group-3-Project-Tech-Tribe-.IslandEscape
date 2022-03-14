import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Arrays;
import java.util.Random;

public class MainGame{
    public static void main(String[] args) {
        Random rand = new Random();
        boolean player1Turn = true;
        character player1 = new character(100,100,1,0,10,10,
                50,10,1,null,null,null);
        inventory player1Inventory = new inventory();
        player1.initialiseInventory();
        player1.equipItem(player1Inventory.sword,player1.getItemBelong(1));
        player1.equipItem(player1Inventory.bloodArm,player1.getItemBelong(2));
        Item player1Weapon = player1.getWeapon();
        Item player1Armor = player1.getArmor();
        player1Weapon.changeQuantity(1);
        player1Armor.changeQuantity(1);
        int playerAttack = player1.getAttack(player1Weapon, player1Inventory.getStat(player1Weapon));
        int playerArmor = player1.getDefence(player1Armor,player1Inventory.getStat(player1Armor));
        player1Armor.getEffect(player1Turn,player1.getHealth(),player1.getMana(),playerAttack,player1.getLuck(),player1.getSpeed(),50,10,50);
        System.out.println(player1.getHealth());
        player1.addToInventory(player1Weapon.getItemID(),player1Weapon.getQuantity());
        player1.addToInventory(player1Armor.getItemID(),player1Armor.getQuantity());
        System.out.println(Arrays.deepToString(player1.getInventory()));
        player1.getInventoryHeld(player1.getInventory(),player1Inventory);
    }
    public static void getThing(Object cmp1, Object cmp2){
        if (cmp1 == cmp2){
            System.out.println("NaMy");
        }
    }
    public static void battle(){
    }
    public static void story(){

    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Random;

public class inventory{
    Random random = new Random();
    Item bloodArm = new Item(20,2000,"blood armor",true,1,20,0,0,0);
    Item leatherArm = new Item(5,20,"leather armor",false,0,2,0,1,0);
    Item sword = new Item(10,20,"sword",false,0,1,0,2,0);
    Item randSword = new Item(20,100,"lucky sword",true,6,1,0,3,0);
    Item healingPotS = new Item(15,5,"small health potion",true,4,3,0,4,0);
    Item magicalPotS =  new Item(20,10,"small magical potion",true,5,3,0,5,0);

    Item[] differentItems = new Item[]{bloodArm, leatherArm, sword,randSword, healingPotS, magicalPotS};
    Item[] level10 = new Item[]{};
    Item[] level20 = new Item[]{};
    Item[] level30 = new Item[]{};
    Item[] level40 = new Item[]{};
    Item[] level50 = new Item[]{};
    Item[] levelAbove = new Item[]{};
    ArrayList<Integer> IDList = Arrays.stream(differentItems).map(Item::getItemID).collect(Collectors.toCollection(ArrayList::new));
    ArrayList<Integer> statList = Arrays.stream(differentItems).map(Item::getStat).collect(Collectors.toCollection(ArrayList::new));
    ArrayList<String> nameList = Arrays.stream(differentItems).map(Item::getName).collect(Collectors.toCollection(ArrayList::new));

    public Item getItem(int itemID){
        for (int a = 0; a< (long) IDList.size(); a++){
            if (a == itemID){
                return differentItems[a];
            }
        }
        return null;
    }
    public int getItemID(Item item){
        for (int i = 0;i<differentItems.length;i++){
            if (differentItems[i] == item){
                return IDList.get(i);
            }
        }
        return -1;
    }
    public int getStat(Item item){
        for (int a = 0; a<statList.size(); a++){
            if (differentItems[a] == item){
                return statList.get(a);
            }
        }
        return -1;
    }
    public String getName(Object item){
        for (int a = 0; a< nameList.size(); a++){
            if (differentItems[a] == item){
                return nameList.get(a);
            }
        }
        return "none";
    }
    public Object itemPool(int playerLvl){
        if (playerLvl <= 10){
            return level10[random.nextInt(level10.length)];
        }
        else if (playerLvl <= 20){
            return level20[random.nextInt(level20.length)];
        }
        else if (playerLvl<=30){
            return level30[random.nextInt(level30.length)];
        }
        else if (playerLvl <=40){
            return level40[random.nextInt(level40.length)];
        }
        else if (playerLvl<=50){
            return level50[random.nextInt(level50.length)];
        }
        else {
            return levelAbove[random.nextInt(levelAbove.length)];
        }
    }
}
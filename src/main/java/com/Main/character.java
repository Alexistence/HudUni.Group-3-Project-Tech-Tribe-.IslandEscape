package com.Main;

public class character{
    private int health;
    private int mana;
    private int playerLevel;
    private int XP;
    private int attack;
    private int defence;
    private int money;
    private int speed;
    private int luck;
    private Item weaponEq;
    private Item armorEq;
    private int[][] playerInventory;
    private int[] weaponsID = {1,10};
    private int[] armorID = {2,20};
    private int[] consumID = {3};

    public character(int health, int mana, int playerLevel, int XP, int attack, int defence, int money, int speed, int luck, Item weaponEq, Item armorEq, int[][] playerInventory){
        this.health = health;
        this.mana = mana;
        this.playerLevel = playerLevel;
        this.XP = XP;
        this.attack = attack;
        this.defence = defence;
        this.money = money;
        this.weaponEq = weaponEq;
        this.armorEq = armorEq;
        this.playerInventory = playerInventory;
        this.speed = speed;
        this.luck = luck;
    }
    public int getHealth(){return this.health;}
    public int getMana(){return this.mana;}
    public int getPlayerLevel(){return this.playerLevel;}
    public int getXP(){return this.XP;}
    public int getAttack(Object weapon, int weaponAtt){
        int attack = 0;
        attack+=this.attack;
        if (weapon!=null){
            attack += weaponAtt;
        }
        return attack;
    }
    public int getDefence(Object armor,int armorDef){
        int defence = 0;
        defence+=this.defence;
        if (armor != null){
            defence +=armorDef;
        }
        return this.defence;
    }
    public int getMoney(){return this.money;}
    public int[][] getInventory(){return this.playerInventory;}
    public void initialiseInventory(){
        this.playerInventory = new int[][]{{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0}};
    }
    public void getInventoryHeld(int[][] playerInventory, inventory playerInventoryClass){
        for (int[] a: playerInventory){
            if (a[1] != 0) {
                System.out.println(playerInventoryClass.getName(playerInventoryClass.getItem(a[0])));
                System.out.println("item amount: " + a[1]);
            }
        }
    }
    public Item getWeapon(){return this.weaponEq;}
    public Item getArmor(){return this.armorEq;}
    public int getLuck(){return this.luck;}
    public int getSpeed(){return this.speed;}

    public int[] getItemBelong(int num){
        if (num == 1){
            return this.weaponsID;
        }
        else if (num == 2){
            return this.armorID;
        }
        else if (num == 3){
            return this.consumID;
        }
        return null;
    }

    public void equipItem(Item item, int[] weaponType){
        int total = 0;
        for (int a:weaponType){
            total += a;
        }
        if (total == 11){
            this.weaponEq = item;
        }
        else if (total == 22){
            this.armorEq = item;
        }
        else System.out.println("you cant equip that");
    }
    public void checkLevelUp(){
        if (this.XP >= 100){
            this.XP -= 100;
            playerLevel+=1;
        }
    }

    public int addToValue(int item,int addOrTake,int amount){          //addortake 1= minus 0= add
        if (addOrTake == 1){
            item -= amount;
        }
        else {
            item += amount;
        }
        return item;
    }
    public void addToInventory(int itemid, int itemQuant){
        int checkSpace = 0;
        for (int[] a : this.playerInventory){
            if (a[0] == 0){
                a[0] = itemid;
                a[1] = itemQuant;
                checkSpace+=1;
                break;
            }
        }
        if (checkSpace == 0){
            System.out.println("you have no inventory space");
        }

    }
}

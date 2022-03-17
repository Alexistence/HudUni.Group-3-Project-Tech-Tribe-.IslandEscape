package com.company;

import java.util.*;

public class MainGame{
    static Scanner scanner = new Scanner(System.in);
    static Random rand = new Random();
    static boolean player1Turn = true;
    static character player1 = new character(100,100,1,0,10,10,
            50,10,1,null,null,null);
    static inventory player1Inventory = new inventory();
    public static void main(String[] args) {
        player1.initialiseInventory();
        player1.equipItem(player1Inventory.sword,player1.getItemBelong(1));
        player1.equipItem(player1Inventory.bloodArm,player1.getItemBelong(2));
        Item player1Weapon = player1.getWeapon();
        Item player1Armor = player1.getArmor();
        player1Weapon.changeQuantity(1);
        player1Armor.changeQuantity(1);
        int player1Attack = player1.getAttack(player1Weapon, player1Inventory.getStat(player1Weapon));
        int player1Defence = player1.getDefence(player1Armor,player1Inventory.getStat(player1Armor));
        player1Armor.getEffect(player1Turn,player1.getHealth(),player1.getMana(),player1Attack,player1.getLuck(),player1.getSpeed(),50,10,50);
        player1.changeCharacterValues(player1Armor.changeCharValues());
        System.out.println(player1.getHealth());
        player1.addToInventory(player1Weapon.getItemID(),player1Weapon.getQuantity());
        player1.addToInventory(player1Armor.getItemID(),player1Armor.getQuantity());
        player1.getInventoryHeld(player1.getInventory(),player1Inventory);
        getListOfCertainItems(1,player1Inventory,player1);
    }
    public static void battle(){
    }
    public static void story(){
    }
    public static Item userInventoryChoice(int itemToUse, character playerName,inventory playerInventory){
        playerName.getInventoryHeld(playerName.getInventory(),playerInventory);
        System.out.println("which item do you want to use?");
        while (true) {
            try {
                int userInput = scanner.nextInt();
                int[] playerChosenItem = playerName.getInventory()[userInput];
                if (userInput>1 && userInput<10){
                    playerInventory.getItem(playerChosenItem[0]);
                    {
                        return playerInventory.getItem(playerChosenItem[0]);
                    }
                }
                else {
                    System.out.println("cant use that item");
                }
            } catch (Exception a) {
                System.out.println("incorrect input");
            }
        }
    }
    static public ArrayList<int[]> getListOfCertainItems(int itemType,inventory playerInv,character player){
        ArrayList<int[]> itemArrayList = new ArrayList<>();
        for (int[] a : player.getInventory()){
            if (a[1]!=0 && playerInv.getItem(a[0]).getType()==itemType){
                itemArrayList.add(a);
            }
        }
        return itemArrayList;
    }
}
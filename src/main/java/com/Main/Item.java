package com.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Item {
    private final int effectID;
    private final int worth;
    private final int stat;
    private final String name;
    private final boolean effect;
    private final int type; //0 for special effect 1 for weapon 2 for gear 3 for consumable 10 for special weapon 20 for special armor
    private int quantity;
    private final int itemID;
    private int active;
    public Item(int stat,int worth,String name,boolean effect,int effectID,int type,int quantity,int itemID,int active){
        this.stat = stat;
        this.worth = worth;
        this.name = name;
        this.effect = effect;
        this.effectID = effectID;
        this.type = type;
        this.quantity = quantity;
        this.itemID = itemID;
        this.active = active;
    }

    public int getWorth(){
        return this.worth;
    }
    public String getName(){
        return this.name;
    }
    public int getStat(){
        return this.stat;
    }
    public int getType(){
        return this.type;
    }
    public int getItemID(){return this.itemID;}
    public int getQuantity(){return this.quantity;}
    public void checkForEffect(){
        if (this.effect){
            System.out.println("this item has an effect");
        }
    }
    public void getEffect(boolean playerTurn,int charHp,int charMp, int charAtt,int charLuck, int charSpeed, int monHp, int monAtt, int monDef){
        if (this.effect){
            if (this.type == 1 ){
                weaponEffect(charAtt,monHp,charLuck);
            }
            else if (this.type == 2){
                armorEffect(charHp,monAtt);
            }
            else if (this.type == 10){
                specialEffect(playerTurn,charHp,charAtt,charMp,charSpeed,monAtt,monHp,monDef);
            }
            else if(this.type == 20){
                specialEffect(playerTurn,charHp,charAtt,charMp,charSpeed,monAtt,monHp,monDef);
            }
        }
    }

    public void changeQuantity(int changeQ){
        this.quantity += changeQ;
    }

    public int checkDmgCalculation(int dmg,int def){return Math.max(dmg - def, 0);}
    public int checkHlthCalculation(int tempCal){return Math.min(tempCal,100);}

    private int weaponEffect(int cAtt,int mDef,int cLuck){
        int tempCal = 0;
        switch (this.effectID){
            case 6:
                tempCal = checkDmgCalculation(cAtt,mDef);
                break;

        }
        return tempCal;
    }
    private void armorEffect(int cHp,int mAtt){

    }
    private int specialEffect(boolean playerTurn,int cHP, int cAtt,int cMp,int cSpeed, int mAtt, int mHp,int mDef){
        int tempCal = 0;
        switch (this.effectID){
            case 1:
                if (playerTurn){
                    cHP -= 10;
                    tempCal = cAtt + 10;
                }
                break;
        }
        return tempCal;
    }
    public void consumeableEffect(int quantity,int cHp, int cMp, int cAtt, int mDef, int mAtt){
        int tempCal;
        switch (this.effectID){
            case 4:
                tempCal = cHp + 15;
                this.quantity -= 1;
                tempCal = checkHlthCalculation(tempCal);
                cHp = tempCal;
                break;
            case 5:
                tempCal = cMp + 20;
                this.quantity -= 1;
                tempCal = checkHlthCalculation(tempCal);
                cMp = tempCal;
                break;
        }
    }

    public ArrayList changeCharValues(int charHp,int charMp, int charAtt,int charLuck, int charSpeed){
        switch (this.effectID){
            case 1:
                charHp-=10;
                break;
        }
        ArrayList<Object> items = new ArrayList<>(Arrays.asList(charHp,charMp, charAtt, charLuck,  charSpeed));
        return items;
    }
}
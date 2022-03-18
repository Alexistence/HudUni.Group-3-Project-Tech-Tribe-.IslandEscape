
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random Ranm = new Random( );

        String[] enemies = {"Pirate Assaulter","Pirate RPG Shooters","Pirate Heavy Gunners","Pirate Defenders"};
        int MaximumEnemyHealth =80;
        int AttackDmgOfEnemy = 20;
//player variables
         int health =100;
        int attackDmg = 50;
        int HealthPotions =6;
        int PotionHealAmount = 20;
         int healthPotionDropChance = 45;

        boolean running = true;

        System.out.println("Welcome to the Island!");
        Game:
        while(running){
            System.out.println("===========================================");
            int HealthOfEnemy = Ranm.nextInt(MaximumEnemyHealth);
            String enemy = enemies[Ranm.nextInt(enemies.length)];
            //Pirate Assaulters
            System.out.println("\t# " + enemy + " is hear! #\n");

            while (HealthOfEnemy>0) {
                System.out.println("\tPlayer Hp:" +health);
                System.out.println("\t" + enemy + "'s HP: " + HealthOfEnemy);
                System.out.println("\n\t");
                System.out.println("What actions you want to take");
                System.out.println("\tA. Attack the enemy!");
                System.out.println("\tB. Take potion!");
                System.out.println("\tC. Run from the enemy!");

                String input = scan.nextLine();
                if (input.equals("A")) {
                    int DamageDealt = Ranm.nextInt(AttackDmgOfEnemy);
                    int DamageTaken = Ranm.nextInt(AttackDmgOfEnemy);
                    HealthOfEnemy-=  DamageDealt;
                    health -= DamageTaken;
                    System.out.println("\t> The " + enemy + " is damaged " + DamageTaken ) ;
                    System.out.println("\t> The " + enemy  + " hit you by" + DamageDealt);
                    if (health<1){
                        System.out.println("\t> You are nearly dead!");
                        break;
                    }
                }

                else if(input.equals("B")){
                    if (HealthPotions >0){
                        health+= PotionHealAmount;
                        HealthPotions--;
                        System.out.println("\t You took a heal potion"
                                + "\n\t> Your health increase to " +health +" hp"
                                + "\n\t> Your health potions number decreased to " + HealthPotions);
                    }
                    else {
                        System.out.println("\t> No potions left");
                    }

                }
                else if(input.equals("C")){
                    System.out.println("\t You run from enemy!");
                    continue Game;
                }
                else {
                    System.out.println("\t Not Valid");
                }

            }
            if (health<1){
                System.out.println("You get out from the island ");
                break ;
            }
            System.out.println("=====================================");
            System.out.println(enemy + " is defeated");
            System.out.println("Hp left: " + health);
            if (Ranm.nextInt(100) < healthPotionDropChance ){
                 HealthPotions++;
                System.out.println(enemy + " dropped a health potion");
                System.out.println("Your health potion increased till " + HealthPotions);

            }
            System.out.println("=================================");
            System.out.println("Next step");
            System.out.println("1.Exit Island");
            System.out.println("2.Go to the next Level");

            String input = scan.nextLine();

            while (!input.equals("1") && !input.equals("2")){
                System.out.println("Not valid");
                input = scan.nextLine();
            }

            if (input.equals("1")){
                System.out.println("Continue adventure in the island");
            }
            else if (input.equals("2")){
                System.out.println("Level Is Finished Successfully");
                break ;
            }
        }
        System.out.println("!!!!!!!!!!!!!!");
    }
}

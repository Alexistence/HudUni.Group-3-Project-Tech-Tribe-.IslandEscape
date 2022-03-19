import java.util.Locale;
import java.util.Scanner;

public class StoryOfTheGame {

    //Scanner class to get user input
    static Scanner scanner = new Scanner(System.in);

    //Game name and Title
    static String gameName = "ISLAND ESCAPE";

    //Variable to use as random events
    static int initialMoney = 50;
    static int initialHealth = 100;

    //Direction
    static String northDirection = "NORTH";
    static String southDirection = "SOUTH";
    static String eastDirection = "EAST";
    static String westDirection = "WEST";

    //To match the data, we will store them in small letter
    static String northDirectionStore = northDirection.toLowerCase();
    static String southDirectionStore = southDirection.toLowerCase();
    static String eastDirectionStore = eastDirection.toLowerCase();
    static String westDirectionStore = westDirection.toLowerCase();

    //Default characters name!
    static String secondHeroCharacter = "George Bland"; //Missing in the initial stage, Scientist
    static String thirdHeroCharacter = "Jose Howlett"; // Tech Geek
    static String fourthHeroCharacter = "Noel Lester"; // Good with magic and witchery
    static String fifthHeroCharacter = "Andrew Murphy"; // Expert in karate, martial arts and taekwondo

    //Villager's characters
    static String villageLeader = "Pagan Min";
    static String secondVillageLeader = "Darth Vader";

    //Pirate leader name
    static String pirateLeader = "Shane Thomson";

    //Interpol Head Officer's name
    static String interpolHeadOfficer = "Alice Clement";




    //Main method for the story
    public static void main(String[] args) {

        //Five dots after script line [.....]
        //Three dots after conversation line [...]

        //Creating character's variable to use them efficiently
        //For the hero, we will let the user decide the username!
        //We can get the main character's name from the user!
        System.out.println("What username do you prefer for yourself?");

        String firstHeroCharacter = scanner.nextLine(); //He was in army before, has the treasure map





        //Start of the game

        //Starting first Script
        System.out.println("Year 2021.....\nFive friends.....\nWanted to make their Summer Vacation thrilling.....\n");
        System.out.println(firstHeroCharacter+"\n"+secondHeroCharacter+"\n"+thirdHeroCharacter+"\n"+fourthHeroCharacter+"\n"+fifthHeroCharacter+"\n");
        System.out.println("They went to a unknown island .....\nTo enjoy their summer vacation..... \nNear to the Arab Sea.....");
        System.out.println("But till that time,\nThey didn't know that.....\nThis tour will be their life's most thrilling and adventurous time.....");
        System.out.println("They came to the island by renting a yacht from their country's sea shore.....");
        System.out.println("They started to hunt wild animals and fishes to eat them.....\nMade a small tent near the beach and.....\nStarted exploring the island.....");
        System.out.println("And this is how their life was going.....\n\n");
        //End of the first script

        //Start of the first conversation
        System.out.println(firstHeroCharacter+": It's been one week to this island...\nIt's so beautiful and quite...\n");
        System.out.println(thirdHeroCharacter+": Yeah bud...\nThat's what we all believe...\nFinally we got some time after having a load of work pressure...\n");
        System.out.println(secondHeroCharacter+": You're right mate...\nIt will be a fresh start of my new science project...\nI've never been to this type of island before...\nIt's so beautiful...and...\nI can just sit on the beach and see what is going on...\n");
        System.out.println(firstHeroCharacter+": Ohhh!! "+secondHeroCharacter+" man...\nI'm just thinking about the army training time...\nThat time was amazing...After a long hour of training...\nWe used to go to the nearby sea or river to swim...\nThat time was the best time of my life\n");
        System.out.println(fourthHeroCharacter+": I came here to find some spiritual stuff for learning witchery...\nThis place is full of this resources...\n");
        System.out.println(secondHeroCharacter+": Man...\nJust enjoy this vacation...\nYou can learn them later...\nLet's go to fishing...\n");
        System.out.println(fifthHeroCharacter+": Yeah, you guys go and hunt some fish...\nI'll make a fire to cook them..\n");
        System.out.println(thirdHeroCharacter+": Let's goooooooo!!!\n\n");
        //End of the first conversation part

        //Starting Second script
        System.out.println("They were fishing near the sea shore.....\nMaking fun.....\nSwimming.....\nPlaying water football.....\nCame back with some fish.....\nThey cooked the fishes.....\nThey had a nice fist.....\n");
        System.out.println("But something was missing from their life.....\nThey basically came here to find a hidden treasure.....\nAnd "+firstHeroCharacter+" has the map of the hidden treasure.....\nThat was the main reason to come to this void island.....\nMaybe they could find anything special.....!!\n");
        System.out.println("At that night.....\nIn front of the tent.....\nThey made a fire....\nStarted planning how they'll go to find the hidden treasure.....\n");
        System.out.println(firstHeroCharacter+" has the treasure map.....\nSo he's giving description to his other friends.....\n\n");
        //End of the Second Script

        //Starting of second conversation part
        System.out.println(firstHeroCharacter+": So guys...\nWe have the hidden map\nFor the last one week\nWe enjoyed a lot\nBut remember guys...\nThis was our main focus for coming to this island...\n");
        System.out.println(secondHeroCharacter+": Yeah,I think it's the best time to go for this adventure...\nTo see the unseen and find the hidden treasure...\nMaybe we can get some precious thing or interesting thing so that I can continue my research...\nWhat do you say "+thirdHeroCharacter+"?\n");
        System.out.println(thirdHeroCharacter+": Yeah I think so...\nMaybe we can get something which is precious...\nOr we can sell them to make a good amount of money...\nIf we do that,I'm pretty sure that I'll leave my job and start spending that money...\nHAHAHAHA\n");
        System.out.println(fourthHeroCharacter+": What you guys are thinking about?...\nI'm hoping that I'll find some spiritual power...\nSo that I can apply them is learning witchery...\n");
        System.out.println(firstHeroCharacter+": Guys calm down!!!\nIt's not about what we'll gonna find...\nBut I'm pretty sure that there is something special in this place...\nBecause my master said that this place is very hard to find out...\nAnd it's not so easy to go there...\nBut I'll try my best!...\nWhat do you guys think about it?..\n");
        System.out.println(fifthHeroCharacter+": If the map is not fake and accurate, then I'm very confident about finding that place...\nI know that will be hard for us...\nBut we can do that...If we try our best...Maybe...\n");
        System.out.println(firstHeroCharacter+": Yeah, that's what I'm trying to say...\nTomorrow morning...\nWe will start our journey...\nJust make sure that you guys don't lose the track...\nAnd try to help each other...\nBecause sometimes...\nDeep jungle is very dangerous...\nAnd if there is any danger or something that can harm you or anyone else...\nJust let us know...\n");
        System.out.println(thirdHeroCharacter+": As far as I got to know from the maps that...\nWe are on a corner of this island...\nSo the hidden place is on the other side of the island...\nAnd the thing is we'll have to go through massive deep jungle and...\nA river flowing with rapid tidal wave...\n");
        System.out.println(firstHeroCharacter+": Yeah! "+thirdHeroCharacter+" is absolutely right!...\nBut I think we can make it!\nLet's see what we can do...!\n");
        System.out.println(fifthHeroCharacter+": Then...Everyone...\nHave a sound sleep tonight...\nTomorrow we have a harsh day I think...\nHaving a sound sleep is important for doing hardwork!...\n");
        System.out.println(firstHeroCharacter+": Yeah...\n"+fifthHeroCharacter+" is right!...\nEveryone...make sure you guys have a sound sleep today!\nGood Night, Sleep tight... \nEveryone!...\n");
        //End of the second conversation

        //Starting third script
        System.out.println("Everyone went to the tent to have a sleep!...\nEveryone is having an excitement about finding the treasure...\n");
        System.out.println("But they don't know...\nThis tour will be their life's most adventurous journey ever...\n");
        System.out.println("This journey will turn out their life...\nMaking a big impact in their life...\n");
        //End of the third script

        //Start of the fourth script
        System.out.println("In the early morning, everyone woke up!...\nAfter finishing their breakfast,they gathered in front of "+firstHeroCharacter+" and...\nstarted discussing about how they'll going to start their journey!...\n");
        System.out.println("They packed all the stuff with them....\nKnowing that they won't come to this place again...\nTheir journey will be finding some new stuff in this island...\n");
        //End of the fourth script

        //Start of the third conversation
        System.out.println(firstHeroCharacter+": Okay guys,We are starting our journey today...\nMake sure you guys never miss to communicate with each other....\nThere is deep jungle,so it's easy to get lost in the deep jungle...\nIf you look something suspicious or interesting...\nCall everyone so that no one miss anything and...\nIf you see something dangerous,just alert other people so that they can protect themselves...\n");
        System.out.println(secondHeroCharacter+": Yes mate!...\nWe are ready...\nHope it will be a mysterious journey ever!...\nWhat about others?...\n");
        System.out.println(thirdHeroCharacter+": I'm the same!...\nLet's do something new!...\nWhat do you say "+fourthHeroCharacter+"?...\n");
        System.out.println(fourthHeroCharacter+": Yeah,I'm ready for it!...\nIt's too much exciting for me right now!...\n");
        System.out.println(fifthHeroCharacter+": Yeah...\nIt's same for me as well...\nJust thinking about a lot of money!...\n");
        System.out.println(firstHeroCharacter+": Come on "+fifthHeroCharacter+" !...\nDon't think about the money all the time!...\nWhat are doing right now to see the unseen, to find out something interesting...\n");
        System.out.println(fifthHeroCharacter+": I know commander! Just kidding by the way!...\nNevermind...\n");
        System.out.println(firstHeroCharacter+": Okay guys, we'll start from here today, we'll make a move to the "+northDirection+" part of this island...\nThe map showing that this part has the hidden treasure!...\nLet's make a move to that side first!...\n");
        System.out.println(thirdHeroCharacter+": Whatever you say Officer!...\nWe agree with you!!!...\n");
        System.out.println(firstHeroCharacter+": "+thirdHeroCharacter+" Stop calling me officer! I was in the army,not right now!...\n");
        System.out.println(thirdHeroCharacter+": I'm just joking mate...\nHAHAHAHA...\nDon't be angry with me...\nLet's go guys!!!...\n");
        //End of the third conversation

        //Start of fifth script
        System.out.println("They started their journey...\nGoing through the deep jungle...\nWatching the creation of God...\n");
        System.out.println("Charming Birds...\nColourful Insects...\nDifferent Animals...\nMisty Deep jungle full with thousands of trees and plants...\n");
        System.out.println("They were enjoying the whole journey together...\nExploring the deep jungle...\n");
        System.out.println("At the time of sunset...\nThey made a tent at the top of the hills...\n");
        System.out.println("They were watching the colourful sunset...\nThey were hoping that it would be a successful journey for them...\n");
        System.out.println("At the night, they made a fire!...\nHunted an animal...\nWas roasting it and chitchatting about the whole day!...\n");
        System.out.println("At that moment...\nThey were discussing about how they'll gonna do in the next day...\n");
        System.out.println(firstHeroCharacter+" was talking about it...\nMaking a plan to divide the task among his friends...\n");
        //End of fifth script

        //Start of the fourth conversation
        System.out.println(firstHeroCharacter+": So...\nFirst day went pretty well! We are going to the deepest portion of the jungle right now!...\nAll the thing went smoothly...\nWe've seen a lot of creatures...\nWe've seen the unseen...\nBut I'm eagerly waiting for the next day!...\nThe map shows that, we just walked one fifth of the jungle...\nMore to go!...\n");
        System.out.println(thirdHeroCharacter+": Yeah, We've come so far from where we did camp last time!...\nLike near the sea shore...\n");
        System.out.println(fifthHeroCharacter+": We walked a lot today...\nI'm feeling pain in my legs already!...\n");
        System.out.println(secondHeroCharacter+": Stop complaining "+fifthHeroCharacter+" !\nI don't know why you're so lazy!...\nYou just want to sleep!...\nHere we are trying our best to find something precious!...\n");
        System.out.println(fourthHeroCharacter+": Okay!! Okay!!...\nCalm Down guys! It's not the time to argue!...\nFrom his childhood,he was lazy...\nWe can't do anything about it...\n"+fifthHeroCharacter+", put your legs near the fire, your legs are aching because of the cold weather...\nJust get some worm from the fire and that would be fine...\n");
        System.out.println(firstHeroCharacter+": I don't know why you guys arguing right now!...\nRELAX!!!\nEverybody has done their work very well...\nIt's obvious to feel tired....\nJust make sure at the night, you guys have some good sleep...\nTomorrow,we'll have to cross a river, which flowing with rapid tidal waves!...\n\nAnd one thing I want to mention, although we are on a top of a hill...\nIf anyone of you guys wants to go outside at night...\nMake sure you never go outside without your friend...\nBecause, at night, there is some dangerous animal roaming around in this jungle...\nProtect yourself first and if you need to go outside...\nCall someone, take him out with you...\nBecause...\nGoing outside alone in the night is not safe!...\n");
        System.out.println(thirdHeroCharacter+": Yeah, That what I was thinking about!...\nWe shouldn't go outside alone...\nIf you want to go outside, take someone with you!...\n");
        System.out.println(secondHeroCharacter+": What if I want to smoke?...\nShould I take someone out for smoking as well? HEHEHE...\n");
        System.out.println(thirdHeroCharacter+": Shut Up, Don't smoke cigarette at the night! You should quit smoking!");
        System.out.println(fourthHeroCharacter+": Yeah "+secondHeroCharacter+" !\nYou should quit smoking, you know it's bad for health...\nYou'll get tired easily if you smoke regularly!...\n");
        System.out.println(firstHeroCharacter+": It's good for health if you don't smoke!...\nWhatever, guys, you can go to sleep right now!...\nWake up early in the morning...\nI'm going to sleep, I'm too tired...\nSee yaa in the morning...\nGood Night Everyone!...\n ");
        //End of the fourth conversation

        //Start of sixth script
        System.out.println("They went to their tent...\nFor having a good sleep...\n");
        System.out.println("It was a full moonlit night!...\nThe whole jungle was so quite...\nThey were sleeping peacefully...\n");
        System.out.println(secondHeroCharacter+" wasn't sleeping...\nbecause he was having a feeling to smoke cigarettes ");
        System.out.println("Suddenly, "+secondHeroCharacter+" came out of the tent to have a smoke!...\nHe thought that, he'll be okay if he go outside without calling someone else...\n");
        System.out.println("He went outside with a cigarettes and lighter...\nStarted smoking the cigarette...\nHe was a little bit far from the tent...\nHe was singing...\nSuddenly a strong hand came and covered his mouth...\nHe didn't get the chance to shout and ....\n");
        //End of sixth script

        //Start of the fifth conversation
        System.out.println(thirdHeroCharacter+": Hey "+secondHeroCharacter+" !...\nWake up...\nI need to go to pee...\n");
        System.out.println("No response...\n");
        System.out.println(thirdHeroCharacter+": Wake uuuupppp!\nIt's an emergencyyyy...\nI need to go to pee!...\n");
        System.out.println("No response...\n");
        System.out.println(thirdHeroCharacter+": Mmmmhhhmmmm! He's not here then!...\nWhat!!??...\nHe went outside without waking me up!...\nI should go to others and inform them...\n");
        System.out.println(thirdHeroCharacter+" came outside and call his other friends...\n");
        //End of fifth conversation

        //Start of sixth conversation
        System.out.println(thirdHeroCharacter+": "+firstHeroCharacter+"...\n"+fourthHeroCharacter+"...\n"+fifthHeroCharacter+"...\n");
        System.out.println(thirdHeroCharacter+": Wake up guys:...\n"+secondHeroCharacter+" is not in the tent!...\n");
        System.out.println(firstHeroCharacter+": What???!!...\nWhat are you talking about?!...\nIsn't he in the tent?...\nHave you searched for him properly?...\n");
        System.out.println(thirdHeroCharacter+": Yes, I've searched for him!...\nI was calling him to wake him up because I wanted to go to pee but he didn't respond...\nYou've said us not to go outside alone...\n");
        System.out.println(fourthHeroCharacter+": Yeah, but why he went outside without calling someone!...\nHe is immature as hell!...\nNow at this night where we'll gonna find him?...\n");
        System.out.println(fifthHeroCharacter+": I don't know what to do right now!...\nIf I'm not wrong, he went outside for smoking...\n");
        System.out.println(firstHeroCharacter+": Okay...\nHang on guys...\nHe's missing...\nSo don't argue...\nWe'll have to find him...\nWe'll have to make some fire torch, and then we'll have to search for him!...\nOkay, so you guys, make some fire torch and make sure to be closer to each other...\n");
        System.out.println(thirdHeroCharacter+": Alright!!...\nWhatever you say!!..\nLet's go guys!...\n");
        //End of sixth conversation

        //Start of seventh script
        System.out.println("They started to make fire torch...\nAnd lighted with fire...\nStarted finding for their friend\nThey searched a lot, but they couldn't find it...\nThey came to the place where they've made the tent...\nAnd start gossipping about it...\n");
        //End of seventh script

        //Start of seventh conversation
        System.out.println(thirdHeroCharacter+": Okay, we couldn't find him...\nThat's pathetic...\nI don't know where we'll gonna find him!");
        System.out.println(firstHeroCharacter+": That's dangerous...\nWe'll have to find him immediately...\nOtherwise, it'll be late enough to find him...\nTomorrow morning, we'll start searching for him again...\nIt's dangerous to go for search at the late night!...\n");
        System.out.println(fourthHeroCharacter+": That's fine!...\nI'm very tired right now...\nBut I'm also worried about him...\n");
        System.out.println(fifthHeroCharacter+": Just don't think about it right now!...\nGo to sleep...\nWe can sort it out at the morning...\nWithout good sleep, we wouldn't be able to do anything...\n");
        System.out.println(firstHeroCharacter+":Yeah guys...\nHe's right...\nJust go and have a good sleep...\nWake up early in the morning and then, we can search for him...\n");
        System.out.println(thirdHeroCharacter+": Okay, then Goodnight guys...\nSee yaa in the morning...\nI hope that we can find him tomorrow as soon as possible...\n");
        System.out.println(fifthHeroCharacter+": Good Night, Everyone! See yaa everyone!...\n");
        System.out.println(fourthHeroCharacter+": Good Night!!!...\n");
        //End of seventh conversation

        //Start of the eighth script
        System.out.println("At that night, they didn't have good sleep!...\nThey were just thinking about their friend...\nThe days they've passed together...\nThe moment they've lived together...\n ");
        System.out.println(firstHeroCharacter+" was thinking about him, how they'll gonna find him in this massive island...\nIt won't be easy for them...\nBut that night he made a plan that they'll divide into two groups...\nAnd go in opposite sides of the island to fine their friend...\n");
        System.out.println("At the morning, everyone woke up early...\nStarted getting fresh, and started talking about their plan...\n");
        //End of the eighth script

        //Start of the eighth conversation
        System.out.println(firstHeroCharacter+": Good morning guys!...\nHope you guys had a good sleep...\n");
        System.out.println(thirdHeroCharacter+": Good morning peeps!...\nHonestly,I couldn't sleep...\nAnyways, that doesn't matter...\nWhat is out plan today by the way?...\n");
        System.out.println(fifthHeroCharacter+": I couldn't sleep yet, was just thinking about him...\nDon't know how we'll gonna find him...\n");
        System.out.println(firstHeroCharacter+": So, what we can do is...\nWe can divide into two group...\nAnd go to different side to search for him...\n");
        System.out.println(fourthHeroCharacter+": Yeah, that's a good idea...\nThat what I was thinking at the night...\n");
        System.out.println(firstHeroCharacter+": Yes, I think that will work...\nSo I will go with "+fifthHeroCharacter+" and "+thirdHeroCharacter+" can go with "+fourthHeroCharacter+"...\n");
        System.out.println(fifthHeroCharacter+": I'm good with that!...\n");
        System.out.println(fourthHeroCharacter+": Yeah, I don't have any problem with that...\nBut how we'll gonna end up being together?...\n");
        System.out.println(firstHeroCharacter+": Good question!!...\nSo we are starting from here and at the evening...\nWe'll come to the same place we are right now!...\nI'll give you a spare map I've...\nHope it will help you!...\n");
        System.out.println(fourthHeroCharacter+": That's should be fine!...\nThen let's pack the things we need...\n");
        System.out.println( thirdHeroCharacter+": Yeah, get ready boys! We'll gonna find our friend soon!!...\n");
        //End of the eighth conversation

        //Start of the ninth script
        System.out.println("They started to find their friend in the deep jungle...\nAs they have divided into two groups...\nThey thought it would be easy for them to find him...\n");
        System.out.println("They searched for him for the whole day...\nBut couldn't get any clue...\nBefore the time of the sunset, "+firstHeroCharacter+" and "+fifthHeroCharacter+" was taking rest in the top of a hill...\n");
        System.out.println("They were talking about how they'll gonna find their friend...\n"+fifthHeroCharacter+" was looking so exhausted and worried about his friend...\nThey don't even if they'll be able to find their friend or not!...\n");
        System.out.println("Suddenly...\nThey heard peoples noise, such as laughing, gossipping and singing together...\n");
        System.out.println("They started searching for the source of the noise...\nSuddenly "+fifthHeroCharacter+" came to the corner of the hill...\nAnd what he saw...\nIt was very hard to believe for him...\nIt was simply unbelievable for him to believe...\nHe whispered to "+firstHeroCharacter+" to come and see what he saw...\n");
        System.out.println(firstHeroCharacter+" went there and what he saw he cannot believe himself as well...\n");
        //End of the ninth script

        //Start of the ninth conversation
        System.out.println(fifthHeroCharacter+": What the hell!...\nTheir is a pirate village in this island and...\nWe don't even know about this one...\nThey've kidnapped our friend...\nHe is in the cage...\nHey "+firstHeroCharacter+" !\nI'm going to rescue my friend...\n" );
        System.out.println(firstHeroCharacter+": Wait!...\nDon't rush...\nThey are dangerous...\nYou won't be able to go there and defeat them alone...\nJust wait and mark the village...\n");
        System.out.println(fifthHeroCharacter+": Why you're not allowing me to go!...\nThey've confined our friend in a cage...\nHow I'm gonna tolerate this one!...\nHow you're tolerating this one...\nLet's go and beat them...\n");
        System.out.println(firstHeroCharacter+": Don't be emotional...\nWe are four in numbers, right now two...\nThey are more than hundred...\nWe will have to think more precisely...\nLet's go ");
        System.out.println(fifthHeroCharacter+": I'm just telling you mate!...\nWe will gonna beat them up and rescue our friend...\n");
        System.out.println(firstHeroCharacter+": Okay, we will see...\nNow let's get back to the place...\n");
        //End of the ninth conversation

        //Start of tenth script
        System.out.println("They come back to the place where they last met...\nThey saw that their other two friends have already came to this place...\nThey were taking rest...\nAnd talking about not finding their friend...\n");
        System.out.println(firstHeroCharacter+" and "+fifthHeroCharacter+" came and met their friends...\nThey told their friends what they've seen just some times before!!...\nThey were amazed and shocked by that news...\nThey couldn't believe that...\nTheir friend is kidnapped by several pirates...\nAnd obviously they are very dangerous...\nThey were scared about what happened before and what will going to happen next!...\n");
        //End of the tenth script

        //Start of tenth conversation
        System.out.println(fifthHeroCharacter+": I still can't believe they've kidnapped our friend...\nHow they could do that...\nI'm gonna beat them up and rescue our friend soon!...\n");
        System.out.println(firstHeroCharacter+": Relax "+fifthHeroCharacter+" !...\nDon't panic, We will gonna rescue him...\nBut we will have to ask for help...\nBecause, we, four people cannon defeat them...\nAs far as I know, there is an another island near this island...\nSo, at first we will go there, will search for people...\nWe will tell them how they've kidnapped our friend...\nAnd we will ask for help, to rescue our friend...\n");
        System.out.println(fourthHeroCharacter+": That's a solid idea, we can do that...\nOtherwise, it will be very hard to beat the entire pirate village...\nI like that idea...\n");
        System.out.println(thirdHeroCharacter+": I'm feeling the same...\nWe should do that...\n");
        System.out.println(firstHeroCharacter+": Okay guys...\nTomorrow morning, we will make some boat to cross the sea and then we will go to the island...\n");
        System.out.println(fourthHeroCharacter+": Okay, fair enough!...\nNow, I need to eat something and I need some good sleep...\n");
        System.out.println(fifthHeroCharacter+": It's the same for me...\nI'm to tired and hungry as well...\n");
        System.out.println(thirdHeroCharacter+": Don't worry guys, I was going to get some water...\nAnd that way I found some wild chicken and I did hunt one of them...\nSo we can cook it and then eat it...\n");
        System.out.println(firstHeroCharacter+": God bless you, man!...\nYou're a life saver to be honest...\nLet's go cook this one friends...\n");
        System.out.println(thirdHeroCharacter+": No worries mate!...\nLet's cook it and have some good food!..\n");
        System.out.println(fourthHeroCharacter+": Let's goooooooo!!...\n");
        //End of tenth conversation

        //Start of eleventh script

        //Night Part
        System.out.println("They made a fire...\nCooked the chicken...\nHad the chicken...\nPlanned how they'll gonna rescue their friend...\nAnd go to the unknown island...\n");
        System.out.println("They went inside the tent...\nDiscussing their next plan to go to the island...\nThey were feeling excitement for the adventure they were going to face!...\n");
        System.out.println("They slept, it was a moonlit night...\nMaking the entire island visible...\nAnd...\nFrom tomorrow...\nThey'll gonna have a new journey ahead...\n");

        //Day Part
        System.out.println("In the morning, they woke up...\nStarted taking breakfast...\nAfter that, they gathered together to plan for their next journey");
        System.out.println("For crossing the ocean, they've to go to the shore of the sea...\n");

        //End of eleventh script



        //Start of the eleventh conversation
        System.out.println(fifthHeroCharacter+": Good Morning guys...\nHope you guys had a good sleep...\nToday, everything is different...\nWe'll gonna have to go to another island...\n");
        System.out.println(firstHeroCharacter+": Yeah guys...\nSo basically right now, we will have to go the shore of the sea...\nAnd then, we will try to make two raft for us to go there!...\n");
        System.out.println(thirdHeroCharacter+": Let's go then...\nWhy we are still standing...\nLet's do it...\n");
        System.out.println(fourthHeroCharacter+": Yeah, let's go!...\n");
        //End of the eleventh conversation

        //Start of the twelve script
        System.out.println("After walking for two hours...\nFinally...\nThey reached to the shore of the sea...\nThey started making two raft...\nIt's almost noon when they finished building the raft...\n");
        System.out.println("They started eating some food!...\nTook some rest...\nAnd about to start their journey...\n");
        //End of the twelve script

        //Start of the twelve conversation
        System.out.println(firstHeroCharacter+": Okay guys...\nWe've made two raft...\nSo we will go to the island...\nGood thing is...\nThe weather is good...\nSo it will take like an hour...\n");
        System.out.println(fourthHeroCharacter+": Yeah...\nSo, don't waste time right now!...\nLet's goooo!...\n");
        System.out.println(fifthHeroCharacter+": Yeah...\nLet's go guys!...\n");
        //End of the twelve conversation

        //Start of the thirteenth script
        System.out.println("They started their journey...\nTwo people in a single raft...\nThey crossed the ocean without any problem...\n");
        System.out.println("After almost one hour...\nThey came to the another island...\nAfter reaching the island...\nThey saw some people...\nThey started trying to call them...\nAnd to assure them that they will not harm the villagers...\n");
        System.out.println("They became convinced...\nAnd they said that they'll take them[heroes] to the leader of the village...\n");
        System.out.println("The villagers took them to the leader of the villagers...\n");
        //End of the thirteenth script

        //Start of the thirteenth conversation
        System.out.println(firstHeroCharacter+": Greetings...\nLeader...\n");
        System.out.println(villageLeader+": Greetings...\nWhat made you to come to this island?...\n");
        System.out.println(firstHeroCharacter+": We, five friends...\nCame to that island to spend our summer vacation...\nThe days were good...\nIn the meantime...\nI had a map to the hidden treasure of that island...\nSo we made a plan to go there...\nAnd we started...\nThe first day went well...\nAt the night...\nWe made a tent...\nTo sleep...\nAt that night...\nOne of our friend...\nMaybe came outside the tent...\nAnd he got kidnapped...\n");
        System.out.println(firstHeroCharacter+": That night...\nWe searched a lot for him...\nBut we couldn't find him...\nThe next day...\nWe started searching for him again...\nAnd we divided into two group...\nAnd went to the different side...\nAt the end of the day...\nWe are up of a hill...\nSuddenly, we heard a noise...\nAnd what we saw is our friend is caged...\nIn a pirates village...\nThey are hundred in numbers...\nBut we are four in numbers...\nWe want to rescue our friend...\nBut we need some help...\n");
        System.out.println(fifthHeroCharacter+": So, we came to this island to seek for some help...\nWe guys would be very grateful if you guys help us...\nTo rescue our friend...\n");
        System.out.println(villageLeader+":Hmm...\nI know those pirates...\nMany years ago, we used to live there...\nAnd the treasure map you saw is our treasure...\nOur ancestors had made all those valuable treasure for us...\nBut...\nThey took that island from us...\nBut...\nIt's the high time...\nWe should go there and defeat them...\nObviously...\nI, and the villagers will help you...\nTo rescue your friend...\nTo get our land back...\n");
        System.out.println(villageLeader+": Today...\nTake some rest today...\nHave some food...\nAnd sleep properly...\nWithin a week...\nWe will go to that island...\nAnd will try to beat them...\nDon't worry guys...\n");
        System.out.println(thirdHeroCharacter+": Thank you so much "+villageLeader+" !...\nWe are very grateful to you...\nThank you so much again!!...\n");
        System.out.println(firstHeroCharacter+": Thank you so much your honor!...\nYou are the modest...\nI appreciate your help...\n");
        System.out.println(villageLeader+": I'm glad to help you guys...\nNo worries...\n"+secondVillageLeader+" !...\nTake them to the guest house and provide them with whatever they need...\n");
        System.out.println(secondVillageLeader+": Whatever you say "+villageLeader+"!...\nLet's go guys!...\n");
        System.out.println(fourthHeroCharacter+": Let's go peoples!...\n");
        //End of the thirteenth conversation


        //Start of the fourteenth script
        System.out.println("They went to the guest house...\nTook rest for some time...\nHad some food...\nAnd then had a meeting with the leader...\n");
        System.out.println("The Village Leader was telling the story...\nHow they used to live in that island a long time ago...\nAnd how the pirates invaded that place...\nFrom start till end...\n");
        System.out.println("It was a tragic story...\nThe village leader has lost his father...\nWho was also a village leader...\nThey need to do something to get back to that island...\n");
        System.out.println("The next morning...\nThe village leader introduced them with the worrier of the village...\nThey have couple of sections...\nSuch as archery, sword holder ...\nAnd most surprisingly magic and witchery!...\n");
        System.out.println(firstHeroCharacter+", "+thirdHeroCharacter+", "+fourthHeroCharacter+", and "+fifthHeroCharacter+" was happy...\nBecause they have similar experience...\nNow, they can learn something new or they can train the villagers...\n");
        System.out.println("They started getting trained by the worriers...\nAnd they eventually taught something new to the villagers...\n");
        System.out.println("They made a good relation with the villager's...\nIn the meantime "+thirdHeroCharacter+" started trying to contact with the interpol...\nThey know that it won't be a easy war...\nSo that's why she just wanted to try to contact with the interpol...\n");
        System.out.println("Everything was going very well...\nAfter one week...\nThey made all the arrangement to attack that island...\n");
        System.out.println("In the previous night of the attack...\nThe village leader and heroes made some plan how they'll gonna attack the island...\nThey made a map regarding their attacking plan...\nAnd in the end, they came to a conclusion and getting ready for the war...\n");
        System.out.println("They came to the guest house after the planning!...\nThey started sleeping because they don't know what gonna happen in the next day!...\nSo, they just needed some sleep to get more energy...\n");
        //End of the fourteenth script

        //Start of the fifteenth script
        System.out.println("In the next morning...\nEveryone came to the shore of the sea...\nEveryone was prepared for the war...\n");
        System.out.println("They made a lot of armours...\nWeapon...\nRafts...\nEverything they'll need...\n");
        System.out.println("The village leader and the heroes came together...\nAnd they started gathering in front of the villagers...\nAnd then...\nThe Village Leader started to give an announcement to the villagers...\n");
        //End of the fifteenth script

        //Start of the fourteenth conversation
        System.out.println(villageLeader+": My friends...\nToday...\nWe will go to conquer our island...\nOUR ISLAND...\nTo my friends...\nTry your best to beat them...\nAnd don't forget to help each others...\nWe are going to defeat them...\nBe Brave...\nBe a Worrier...\nAnd Let's go friends!...\n");
        //End of the fourteenth conversation

        //Start of the sixteenth script
        System.out.println("They started their journey...\nAnd after some time...\nReached the island without any problem...\nAs soon as they reached the island...\nThey surround the island with their weapons and trap...\n");
        System.out.println("They started attacking the pirates village as soon as they got the command from the leader...\nThe pirates were unaware of them, and this sudden attack stunned them. But as they were fierce and inhuman, although they were unaware of the situation, they also tried their best to win this war...\nThe villagers were about to win...\n");
        System.out.println("At this moment, when the Pirate Leader realized that they couldn't defeat them, he went near the cage where was "+secondHeroCharacter+"...\nThe Pirate Leader took a knife, held it near the" +secondHeroCharacter+"'s neck");
        //End of the sixteenth script

        //Start of the fifteenth conversation
        System.out.println(pirateLeader+": Everyone Stop!!!...\nOtherwise I'll kill him...\n");
        System.out.println(villageLeader+": Stop...Stop...Everyone Stop...\n");
        System.out.println(pirateLeader+": Hahahahaha! Now??...\nDo you guys want to beat us?...\nDo you want to beat me??...\nDo you think you guys are more clever than me??...\nHAHAHAHA...\n");
        System.out.println(villageLeader+": Okay...\nWe will go back to our island...\nWe don't need this island back...\nJust release our friend...\nWe won't comeback...\n");
        System.out.println(pirateLeader+": HAHAHAHA...\nDo you think I'll give him to you guys??...\nI'll gonna kill him in front of everyone...\n");
        //End of the fifteenth conversation

        //Start of the seventeenth script
        System.out.println("Suddenly, they heard the sound of a helicopter...\nThey were astonished...\nThe pirates leader seems to be scared...\n");
        System.out.println("Suddenly a gunshot hits the knife "+pirateLeader+" was holding on the neck of "+secondHeroCharacter+"!...\nIt felt from "+pirateLeader+"'s hand and then "+villageLeader+" shouted to start the fight again...\n");
        System.out.println("Everyone started the war again...\nAnd the helicopter was from Interpol...\nWhile the figth was going between them...\n"+thirdHeroCharacter+" was trying to contact with the interpol...\nAnd within few tries, she managed to contact to the interpol and she sought for help...\nAnd the interpol responded very fast...\nThey came to rescue all of them...\n");
        System.out.println("As soon as they heard the sound of boats...\nThe Interpol Officers pointed gun to the pirates...\nAsked them to put their hands up...\n");
        System.out.println("This time...\nThe pirate leader didn't try to be clever this time...\nAll the pirates put their gun in the ground...\n"+secondHeroCharacter+"'s friends came to free him from the cage...\nHe was half dead because of the starvation and brutal torture...\n");
        System.out.println("The Interpol's Head Officer come toward them...\nTo check if everything is okay or not...\n");
        //End of the seventeenth script

        //Start of the sixteenth conversation
        System.out.println(interpolHeadOfficer+": Are you okay bud!?...\nLet's come to the boat...\nWe have medic with us...\n");
        System.out.println("The medics come and take "+secondHeroCharacter+" with them to the boat...\n");
        System.out.println(interpolHeadOfficer+": I hope you guys are okay...\nSummer vacation is good unless you come to an unknown island without researching about it...\nSometimes, they are deadly...\nI'm glad to see you guys alive...\n");
        System.out.println(firstHeroCharacter+": Yeah, we are sorry for that...\nBut the villagers helped us a lot...\nSpecially the Village Leader, "+villageLeader+" helped us a lot...\nWithout the help of them, rescuing our friend would be impossible...\n");
        System.out.println(interpolHeadOfficer+": That's why I want to thank "+villageLeader+"! And, specially, "+thirdHeroCharacter+"!...\nShe is so brave and has done an amazing job...\n");
        System.out.println(thirdHeroCharacter+": We was so desperate to rescue our friend...\nThat was basically my duty or responsibility or whatever you say!...\n");
        System.out.println(interpolHeadOfficer+": Brave Girl...!\nby the way guys...\nYou guys shouldn't stay here anymore...\nLet's go to the city...\nWe came with a special boat to carry you guys!..\n");
        System.out.println(fifthHeroCharacter+": Yeah...\nI'm just tired of everything...\nWe should go back home now...\nlet's go guys");
        System.out.println(fourthHeroCharacter+": Yeah,Let's go!!!");
        //End of the sixteenth conversation

        //Start of the eighteenth script
        System.out.println("They started packing all the staff they had...\nIt was almost down...\nThe villagers were standing in front of the beach where all the boat was...\nAnd the interpol team has taken all the pirates to the boat prison they've came with...\n");
        System.out.println("The villagers were so happy to get back their island from the pirates...\nThey were also happy for "+secondHeroCharacter+" to be rescued...\n");
        System.out.println("At the time of sunset...\n"+fifthHeroCharacter+", "+secondHeroCharacter+", "+thirdHeroCharacter+", "+fourthHeroCharacter+", and "+firstHeroCharacter+" were walking to the boats...\nWhich one will carry them to the place they used to live...\n");
        System.out.println("They were both kinda happy and sad because they had a great time with the villagers...\nNow, they'll have to leave...\nThey don't know whether they'll gonna meet with each other again!!..\n");
        System.out.println("But everything in the life happens for a reason...\nThey've accepted this one...\nThey came to the village leader...\n");
        //End of the eighteenth script

        //Start of the seventeenth conversation
        System.out.println(firstHeroCharacter+": Alright Leader, we have to leave right now...\n");
        System.out.println(villageLeader+": Yeah, It's better I guess...\nYou guys have gone through a lot...\nNow, you should!");
        System.out.println(fifthHeroCharacter+": We don't know how to give you thanks...\nYou've helped us in the tough time...\nIf you were not here today...\nWe would not be able to rescue our friend...\n");
        System.out.println(villageLeader+": Don't say like this...\nFor you guys...\nWe've got inspiration to get back to our island...\n");
        System.out.println(firstHeroCharacter+": And Thanks for all the help you've done!...\nThanks again!...\n");
        System.out.println(villageLeader+": No worries guys...\nSee you someday...\nHopefully...\nObviously...\nCome to visit our place someday!...\n");
        System.out.println(thirdHeroCharacter+": Why not!...\nI'm thinking to come back here every summer!!!....\nHEHEHEHEHE...\n ");
        System.out.println(fourthHeroCharacter+": Anyways, see you all in one fine summer...\nTake care of you guys...\nWe will never forget you!...\n");
        System.out.println(villageLeader+": We will never forget you too...\nYou guys were amazing...\n");
        //End of the seventeenth conversation

        //Start of the nineteenth script
        System.out.println("The whole village shouted and said \"We will never forget you!...|\" ");
        System.out.println("They just smiled and went to the boat...\nThey were standing at the corner of the boat...\n");
        System.out.println("The entire village was waving at them...\nInviting them to come back again to spend a good summer...\n");
        System.out.println("The boat started, it started going through the ocean...\nThe sun was setting down at the moment...It was so vivid and colorful...\nThey were enjoying the finest sunset after a long time!!!...\nAnd what they realized is...\n");
        System.out.println("\"Life is beautiful...It's mysterious...\"\n\"We don't know what will happen tomorrow...Just try to live you today fully\"");
        System.out.println("That's what Grand Master Oogway said in \"KUNG FU PANDA\" is -\n\"Yesterday is history, tomorrow is a mystery, but today is a gift. That is why it is called the present.\"");
        //End of the nineteenth script

        //End of the game

        /*Tech Tribe Presents - Project Escape Island
        *                                       ----- Coding Framework -----
        *                                               Hamza Hussain
        *                                                 Team wide
        *                                       ----- Story & Script -----
        *                                           Mahadi Hasan Rifat
        *                                               Alex Taylor
        *                                       ----- Combat Mechanics -----
        *                                               Harley Payne
        *                                       -----  Item System  -----
        *                                             Hamza Hussain
        *                                              Harley Payne
        *                                       -----  NPCs & Enemies  -----
        *                                               Mohamad Miari
        *                                               Hamza Hussain
        *                                       -----    UI & Map   -----
        *                                               Alex Taylor
        *                                       ----- Testing & Debugging -----
        *                                                Mohamad Miari
        *                                                 Team wide
        */


        //Calling Method to check how they work
        randomEventToGetMoney();
        randomEventToGetHealth();
        randomEventToLoseHealth();
    }


    //Methods for Random Event

    //Random Event to Add Money
    static void randomEventToGetMoney() {
        int addMoney = (int) (Math.random()*(500-50)+50);
        System.out.println("You've got "+addMoney+" pound!");
        int totalMoney = initialMoney + addMoney;
        System.out.println("Total Amount - "+totalMoney+" pound!");
    }

    //Random Event to Add Health
    static void randomEventToGetHealth() {
        int addHealth = (int) (Math.random()*(70-20)+20);
        System.out.println("You've got "+addHealth+" health");
        int totalHealth = initialHealth + addHealth;
        if(totalHealth>=100) {
            System.out.println("Your Health Level is 100!");
        }else{
            System.out.println("Your Health Level - "+totalHealth+"!");
        }
    }

    //Random Event to Lose Health
    static void randomEventToLoseHealth() {
        int loseHealth = (int) (Math.random()*(20-5)+5);
        System.out.println("You've lost "+loseHealth+" health");
        int totalHealth = initialHealth - loseHealth;
        if(totalHealth<=20) {
            System.out.println("Your Health Level is Low!\nGet some drinks.\n");
        }else{
            System.out.println("Your Health Level - "+totalHealth+"!");
        }
    }


}

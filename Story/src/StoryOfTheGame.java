import java.util.Scanner;

public class StoryOfTheGame {

    //static int initialAmount = 50;
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        //Five dots after script line [.....]
        //Three dots after conversation line [...]

        //Creating character's variable to use them efficiently
        //For the hero, we will let the user decide the user name!
        //We can get the main character's name from the user!
        System.out.println("What username do you prefer for yourself?");



        String firstHeroCharacter = scanner.nextLine(); //He was in army before, has the treasure map
        String secondHeroCharacter = "George Bland"; //Missing in the initial stage, Scientist
        String thirdHeroCharacter = "Jose Howlett"; // Tech Geek
        String fourthHeroCharacter = "Noel Lester"; // Good with magic and witchery
        String fifthHeroCharacter = "Andrew Murphy"; // Expert in karate, martial arts and taekwondo

        //Direction
        String northDirectionCapital = "North";
        String northDirectionSmaller = "north";
        String southDirectionCapital = "South";
        String southDirectionSmaller = "south";
        String eastDirectionCapital = "East";
        String eastDirectionSmaller = "east";
        String westDirectionCapital = "West";
        String westDirectionSmaller = "west";

        //methods for random event




        //Game name and Title
        String gameName = "ISLAND ESCAPE";



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
        System.out.println(firstHeroCharacter+": Okay guys, we'll start from here today, we'll make a move to the "+northDirectionCapital+" part of this island...\nThe map showing that this part has the hidden treasure!...\nLet's make a move to that side first!...\n");
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


    }


    /*int a = randomEventToGetMoney((int) (Math.random()*500));
    System.out.println(a);

    static int randomEventToGetMoney(int addMoney) {
        initialAmount = initialAmount + addMoney;
        return  initialAmount;
    }*/



}

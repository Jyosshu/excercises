package com.techelevator;

public class AfternoonExercises {

	public static void main(String[] args) {
        
        /* 
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch? 
        */

		int numberOfBirds = 4;
		numberOfBirds = numberOfBirds -1;
		System.out.println(numberOfBirds);
		
        /* 
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests? 
        */

		int newNumberOfBirds = 6;
		newNumberOfBirds = newNumberOfBirds - 3;
		System.out.println(newNumberOfBirds);
		

        /* 
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods? 
        */

		int numOfRac = 3;
		numOfRac = numOfRac - 2;
		System.out.println(numOfRac);
		
        /* 
        4. There are 5 flowers and 3 bees. How many less bees than flowers? 
        */

		int numFlowers = 5;
		numFlowers = numFlowers - 3;
		System.out.println(numFlowers);

		
        /* 
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now? 
        */

		int numPigeons = 1;
		numPigeons += 1;
		System.out.println(numPigeons);

		/* 
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now? 
        */

		int numOwls = 3;
		numOwls = numOwls + 2;
		System.out.println(numOwls);
		
        /* 
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home? 
        */

		int numBeavers = 2;
		numBeavers -= 1;
		System.out.println(numBeavers);
       
		/* 
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all? 
        */

		int numToucans = 2;
		numToucans += 1;
		System.out.println(numToucans);
		
        /* 
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts? 
        */

		int numSquirrels = 4;
		numSquirrels +=2;
		System.out.println(numSquirrels);
		
        /* 
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find? 
        */

		int changeFound = 0;
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		changeFound = (((quarter) * 1) + ((dime) * 1) + ((nickel) * 2));
		System.out.println(changeFound);
		
        /* 
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all? 
        */

		int numMuffins = 0;
		numMuffins += 18 +20 +17;
		System.out.println(numMuffins);
		
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
        int howMuchCents = 0;
        howMuchCents += 24 + 14;
        System.out.println(howMuchCents + " cents");
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
        
        int numMarshmallows = 0;
        numMarshmallows = 8 + 10;
        System.out.println(numMarshmallows);
        
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
        
        int inchesSnow = 0;
        inchesSnow = 29 - 17;
        System.out.println(inchesSnow);
        
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
        int currentCash = 10;
        currentCash = currentCash - (3 + 2);
        System.out.println(currentCash);
        
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
        int howManyMarbles = 16;
        howManyMarbles -= 7;
        System.out.println(howManyMarbles);
        
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
        
        int howManyMoreShells =  19;
        howManyMoreShells = 25 - howManyMoreShells;
        System.out.println(howManyMoreShells + " shells to find!");
        
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
        
        int numGreenBalloons = 0;
        numGreenBalloons = 17 - 8;
        System.out.println(numGreenBalloons + " green balloons");
        
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
        
        int numBooksShelved = 38;
        numBooksShelved += 10;
        System.out.println(numBooksShelved);
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
        
        int howManyBeeLegs = 6;
        howManyBeeLegs *= 8;
        System.out.println(howManyBeeLegs + " legs");
        
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
        
        double costOfIceCream = 99.00;
        int numCones = 2;
        costOfIceCream *= numCones;
        System.out.println("$" + costOfIceCream / 100);
        
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
        
        int numRocksForBorder = 64;
        numRocksForBorder = 125 - numRocksForBorder;
        System.out.println(numRocksForBorder + " more rocks");
        
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
        
        int totalMarbles = 38;
        totalMarbles -= 15;
        System.out.println(totalMarbles);
        
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
        
        int milesLeft = 0;
        milesLeft = 78 - 32;
        System.out.println(milesLeft);
        
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
        
        int hour = 60;
        double timeShoveling = 0.00;
        timeShoveling = (hour * 1) + 30 + 45;
        System.out.println(timeShoveling / 60 + " hours");
        
        /*    
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
        
        double moneySpentHotdogs = 0.00;
        int hotdogCost = 50;
        moneySpentHotdogs = (hotdogCost * 6);
        System.out.println("$" +moneySpentHotdogs / 100);
        
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
        
        int howManyPencils = 0;
        howManyPencils = 50 / 7;
        System.out.println(howManyPencils);
        
        /*    
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
        
        int totalButterflies = 33;
        int redButterflies = 0;
        int orangeButterflies = 20;
        redButterflies = totalButterflies - orangeButterflies;
        System.out.println(redButterflies);
        
        /*    
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
        
        int totalChange = 0;
        int cost = 54;
        totalChange = 100 - cost;
        System.out.println(totalChange + " cents");
        
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
        
        int totalTrees = 13;
        totalTrees += 12;
        System.out.println(totalTrees +" new trees!");
        
        /*    
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
        
        int howManyHours = 0;
        howManyHours = 2 * 24;
        System.out.println(howManyHours + " more hours");
        
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
        
        int totalGum = 0;
        totalGum = 4 * 5;
        System.out.println(totalGum);
        
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
        
        int changeDan = 0;
        changeDan = 3 - 1;
        System.out.println("$" + changeDan + ".00");
        
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
        
        int totalBoaters = 0;
        totalBoaters = 5 * 3;
        System.out.println(totalBoaters + " boaters on the lake");
        
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
            
        int numOfLegos = 0;
        numOfLegos = 380 - 57;
        System.out.println(numOfLegos + " Legos left to step on");
        
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        
        int arthurMuffins = 35;
        arthurMuffins = 83 - arthurMuffins;
        System.out.println(arthurMuffins + " more muffins to bake");
        
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        
        int tooManyCrayons = 0;
        tooManyCrayons = 1400 - 290;
        System.out.println(tooManyCrayons + " crayons too many");
        
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
        
        int totalStickers = 0;
        totalStickers = 10 * 22;
        System.out.println(totalStickers);
        
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
        
        int howManyCakes = 0;
        howManyCakes = 96 / 8;
        System.out.println(howManyCakes + " cupcakes per child");
        
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
        
        int leftOverGinger = 0;
        leftOverGinger = 47 % 6;
        System.out.println("There will be " + leftOverGinger + " cookies remaining");
        
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
        
        int leftOverCrois = 0;
        leftOverCrois = 59 % 8;
        System.out.println(leftOverCrois + " left over");
        
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
        
        int totalTrays = 0;
        totalTrays = 276 / 12;
        System.out.println(totalTrays + " trays needed");
            
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
        
        int numPortions = 0;
        numPortions = 480 / 12;
        System.out.println(numPortions + " bite-sized pretzel portions");
        
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
            
        int totalCakesMade = 53;
        int cakesGiven = 0;
        cakesGiven = ((totalCakesMade - 2) / 3);
        System.out.println(cakesGiven + " boxes given away");
        
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
        
        int uneatenCarrots = 0;
        uneatenCarrots = 74 % 12;
        System.out.println(uneatenCarrots + " uneaten carrots :(");
        
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
        
        int filledShelves = 0;
        filledShelves = 98 / 7;
        System.out.println(filledShelves + " shelves needed for da bears");
        
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
        
        int totalAlbums = 0;
        totalAlbums = 480 / 20;
        System.out.println(totalAlbums + " needed");
        
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
            
        int cardsLeft = 0;
        cardsLeft = 94 % 8;
        System.out.println(cardsLeft + " cards left in the unfilled box");
        
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

        int booksPerShelf = 0;
        booksPerShelf = 210 / 10;
        System.out.println(booksPerShelf + " books per shelf");
        
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
            
        int howManyCro = 0;
        howManyCro = 17 / 7;
        System.out.println(howManyCro + " croissants per person");
        
	}

}

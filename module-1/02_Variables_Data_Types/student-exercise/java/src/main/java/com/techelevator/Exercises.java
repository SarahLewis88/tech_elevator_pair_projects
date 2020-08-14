package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;
		
		System.out.println(remainingNumberOfBirds + " birds");
		
        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

		System.out.println(numberOfExtraBirds + " birds");
		
        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		
		int numberOfRacoons = 3;
		int numberThatLeft = 2;
		int numberOfRacoonsLeft = numberOfRacoons - numberThatLeft;

		System.out.println(numberOfRacoonsLeft + " racoons");
		
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */

		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int lessBeesThanFlowers = numberOfFlowers - numberOfBees;
		
		System.out.println(lessBeesThanFlowers + " bees");

        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		
		int numberOfLonelyPigeons = 1;
		int numberOfAdditionalPigeons = 1;
		int totalPigeons = numberOfLonelyPigeons + numberOfAdditionalPigeons;
		
		System.out.println(totalPigeons + " pigeons");
		
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */

		int numberOfOwlsOnTheFence = 3;
		int numberOfAdditionalOwls = 2;
		int totalOwls = numberOfOwlsOnTheFence + numberOfAdditionalOwls;
		
		System.out.println(totalOwls + " owls");
		
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		
		int numberOfBeaversWorkingOnTheirHome = 2;
		int numberOfBeaversThatWentForASwim = 1;
		int totalBeaversStillWorkingOnTheirHome = numberOfBeaversWorkingOnTheirHome - numberOfBeaversThatWentForASwim;
		
		System.out.println(totalBeaversStillWorkingOnTheirHome + " beavers");
		
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */

		int numberOfTucansSittingOnATreeLimb = 2;
		int numberOfTucansThatJoinedThem = 1;
		int totalTucans = numberOfTucansSittingOnATreeLimb + numberOfTucansThatJoinedThem;
		
		System.out.println(totalTucans + " tucans");
		
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		
		int numberOfSquirrels = 4;
		int numberOfNuts = 2;
		int moreSquirrelsThanNuts = numberOfSquirrels - numberOfNuts;
		
		System.out.println(moreSquirrelsThanNuts + " squirrels");

        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */

		// solution 1
		
		float quarterSolution1 = .25F;
		float dimeSolution1 = .10F;
		float nickelSolution1 = .05F;
		float amountOfMoneyFoundSolution1 = quarterSolution1 + dimeSolution1 + 2 * nickelSolution1;
		
		System.out.println("$" + amountOfMoneyFoundSolution1 + " \"solution 1\"");
		
		// solution 2

		int quarterSolution2 = 1;
		int dimeSolution2 = 1;
		int nickelSolution2 = 2;
		float amountOfMoneyFoundSolution2 = quarterSolution2 * .25F + dimeSolution2 * .10F + nickelSolution2 * .05F;
		
		System.out.println("$" + amountOfMoneyFoundSolution2 + " \"solution 2\"");
		
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */

		int mrsBrierMuffins = 18;
		int mrsMacAdamMuffins = 20;
		int mrsFlanneryMuffins = 17;
		int totalNumberOfMuffins = mrsBrierMuffins + mrsMacAdamMuffins + mrsFlanneryMuffins;
		
		System.out.println(totalNumberOfMuffins + " muffins");
		
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */

		int amountSpentOnYoyo = 24;
		int amountSpentOnWhistle = 14;
		int totalAmountSpent = amountSpentOnYoyo + amountSpentOnWhistle;
		
		System.out.println("$" + totalAmountSpent);
		
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */

		int numberOfLargeMarshmallows = 8;
		int numberOfMiniMarshmallows = 10;
		int totalNumberOfMarshmallows = numberOfLargeMarshmallows + numberOfMiniMarshmallows;
		
		System.out.println(totalNumberOfMarshmallows + " muffins");
		
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */

		int inchesOfSnowAtHiltHouse = 29;
		int inchesOfSnowAtBrecknockElementarySchool = 17;
		int inchesMoreOfSnowAtHiltHouseThanAtBrecknockElementarySchool = inchesOfSnowAtHiltHouse - inchesOfSnowAtBrecknockElementarySchool;
		
		System.out.println(inchesMoreOfSnowAtHiltHouseThanAtBrecknockElementarySchool + " in");
		
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */

		int hiltsDollars = 10;
		int costOfToyTruck = 3;
		int costOfPencilCase = 2;
		int hiltsDollarsLeft = hiltsDollars - costOfToyTruck - costOfPencilCase;
		
		System.out.println("$" + hiltsDollarsLeft);
		
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */

		int joshsMarbleCollection = 16;
		int marblesLost = 7;
		int marblesLeft = joshsMarbleCollection - marblesLost;
		
		System.out.println(marblesLeft + " marbles");
		
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */

		int megansSeashells = 19;
		int seashellCollection = 25;
		int moreSeashellsNeeded = seashellCollection - megansSeashells;
		
		System.out.println(moreSeashellsNeeded + " seashells");
		
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */

		int bradsBaloons = 17;
		int blueBalloons = 8;
		int redBalloons = bradsBaloons - blueBalloons;
		
		System.out.println(redBalloons + " red balloons");
		
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */

		int booksOnTheShelf = 38;
		int booksMartaPutOnTheShelf = 10;
		int totalBooksOnTheShelf = booksOnTheShelf + booksMartaPutOnTheShelf;
		
		System.out.println(totalBooksOnTheShelf + " books");
		
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */

		int numberOfLegsOnABee = 6;
		int numberOfBeesWithLegs = 8;
		int totalNumberOfBeeLegs = numberOfLegsOnABee * numberOfBeesWithLegs;
		
		System.out.println(totalNumberOfBeeLegs + " bee legs");
		
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */

		float costOfOneIceCream = .99F;
		float costOfTwoIceCream = costOfOneIceCream * 2;
		
		System.out.println("$" + costOfTwoIceCream);
		
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */

		int numberOfRockNeededForBorder = 125;
		int numberOfRockMrsHiltHas = 64;
		int additionalRocksNeeded = numberOfRockNeededForBorder - numberOfRockMrsHiltHas;
		
		System.out.println(additionalRocksNeeded + " rocks");
		
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */

		int mrsHiltsMarbles = 38;
		int numberOfMarblesLost = 15;
		int numberOfMarblesLeft = mrsHiltsMarbles - numberOfMarblesLost;
		
		System.out.println(numberOfMarblesLeft + " marbles");
		
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		
		int milesToConcert = 78;
		int milesBeforeStopping = 32;
		int milesLeftToDrive = milesToConcert - milesBeforeStopping;
		
		System.out.println(milesLeftToDrive + " mi");
		
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		
		int minutesSpentShovelingSnowSaturdayMorning = 90;
		int minutesSpentShovelingSnowSaturdayAfternoon = 45;
		int totalMinutesSpentShovelingSnow = minutesSpentShovelingSnowSaturdayMorning + minutesSpentShovelingSnowSaturdayAfternoon;
		
		System.out.println(totalMinutesSpentShovelingSnow + " minutes");
		
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */

		int numberOfHotDogsMrsHiltBought = 6;
		float costPerHotDog = .50F;
		float totalAmountSpentOnHotDogs = numberOfHotDogsMrsHiltBought + costPerHotDog;
		
		System.out.println("$" + totalAmountSpentOnHotDogs);
		
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */

		float mrsHiltsMoney = .50F;
		float costPerPencil = .07F;
		int numberOfPencilsBought = (int)(mrsHiltsMoney / costPerPencil);
		
		System.out.println(numberOfPencilsBought + " pencils");
		
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */

		int butterfliesMrsHiltSaw = 33;
		int orangeButterflies = 20;
		int redButterflies = butterfliesMrsHiltSaw - orangeButterflies;
		
		System.out.println(redButterflies + " red butterflies");
		
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */

		float moneyKateGaveTheClerk = 1.00F;
		float priceOfCandy = .54F;
		float katesChange = moneyKateGaveTheClerk - priceOfCandy;
		
		System.out.println("$" + katesChange);
		
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */

		int numberOfMarksTrees = 13;
		int numberOfTreesPlanted = 12;
		int numberOfTotalTrees = numberOfMarksTrees + numberOfTreesPlanted;
		
		System.out.println(numberOfTotalTrees + " trees");
		
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */

		int daysUntilJoySeesGrandma = 2;
		int hoursUntilJoySeesGrandma = daysUntilJoySeesGrandma * 24;
		
		System.out.println(hoursUntilJoySeesGrandma  + " hrs");
		
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */

		int numberOfKimsCousins = 4;
		int piecesOfGumPerCousin = 5;
		int totalPiecesOfGumRequired = numberOfKimsCousins * piecesOfGumPerCousin;
		
		System.out.println(totalPiecesOfGumRequired  + " pieces of gum");
		
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */

		float amountOfMoneyDanHas = 3.00F;
		float amountCandyBarCosts = 1.00F;
		float amountLeftAfterCandyBarPurchase = amountOfMoneyDanHas - amountCandyBarCosts;
		
		System.out.println("$" + amountLeftAfterCandyBarPurchase);
		
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */

		int numberOfBoatsInTheLake = 5;
		int numberOfPeopleInEachBoat = 3;
		int numberOfPeopleInTheLake = numberOfBoatsInTheLake * numberOfPeopleInEachBoat;
		
		System.out.println(numberOfPeopleInTheLake  + " people");
		
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */

		int numberOfLegosEllenHas = 380;
		int numberOfLegosEllenLost = 57;
		int numberOfLegosEllenHasNow = numberOfLegosEllenHas - numberOfLegosEllenLost;
		
		System.out.println(numberOfLegosEllenHasNow  + " legos");
		
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */

		int numberOfMuffinsArthurBaked = 35;
		int numberOfMuffinsArthurWants = 83;
		int numberOfMuffinsArthurNeedsToBake = numberOfMuffinsArthurWants - numberOfMuffinsArthurBaked;
		
		System.out.println(numberOfMuffinsArthurNeedsToBake  + " muffins");
		
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */

		int numberOfCrayonsWillyHas = 1400;
		int numberOfCrayonsLucyHas = 290;
		int numberOfCrayonsMoreThanLucyWillyHas = numberOfCrayonsWillyHas - numberOfCrayonsLucyHas;
		
		System.out.println(numberOfCrayonsMoreThanLucyWillyHas  + " crayons");
		
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */

		int numberOfStickersPerPage = 10;
		int numberOfPages = 22;
		int totalNumberOfStickers = numberOfStickersPerPage * numberOfPages;
		
		System.out.println(totalNumberOfStickers  + " stickers");
		
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */

		int numberOfCupcakes = 96;
		int numberOfChildren = 8;
		int numberOfCupcakesPerChild = numberOfCupcakes / numberOfChildren;
		
		System.out.println(numberOfCupcakesPerChild  + " cupcakes");
		
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */

		int numberOfGingerbreadCookiesSheMade = 47;
		int numberOfGingerbreadCookiesPerGlassJar = 6;
		int numberOfGingerbreadCookiesLeftOver = numberOfGingerbreadCookiesSheMade % numberOfGingerbreadCookiesPerGlassJar;
		
		System.out.println(numberOfGingerbreadCookiesLeftOver  + " gingerbread cookies");
		
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */

		int numberOfCroissantsSheMade = 59;
		int numberOfHerNeighbors = 8;
		int croissantsLeftOver = numberOfCroissantsSheMade % numberOfHerNeighbors;
		
		System.out.println(croissantsLeftOver  + " croissants");
		
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */

		int numberOfOatmealCookiesMarianMadeAtATime = 276;
		int numberOfOatmealCookiesPerTray = 12;
		int numberOfTraysNeeded = numberOfOatmealCookiesMarianMadeAtATime / numberOfOatmealCookiesPerTray;
		
		System.out.println(numberOfTraysNeeded  + " trays");
		
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */

		int numberOfBiteSizedPretzels = 480;
		int numberOfBiteSizedPretzelsInAServingSize = 12;
		int numberOfServingsPrepared = numberOfBiteSizedPretzels / numberOfBiteSizedPretzelsInAServingSize;
		
		System.out.println(numberOfServingsPrepared  + " bite-sized pretzel servings");
		
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */

		int numberOfLemonCupcakesBaked = 53;
		int numberOfLemonCupcakesLeftAtHome = 2;
		int numberLemonCupcakesPerBox = 3;
		int numberOfBoxesGivenAway = ((numberOfLemonCupcakesBaked - numberOfLemonCupcakesLeftAtHome) / numberLemonCupcakesPerBox);
		
		System.out.println(numberOfBoxesGivenAway  + " boxes");
		
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */

		int numberOfCarrotSticksPrepared = 74;
		int numberOfPeopleEatingCarrotSticks = 12;
		int numberOfCarrotSticksLeftOver = (numberOfCarrotSticksPrepared % numberOfPeopleEatingCarrotSticks);
		
		System.out.println(numberOfCarrotSticksLeftOver  + " carrot sticks");
		
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */

		int numberOfTeddyBearsGathered = 98;
		int numberOfTeddyBearsPerShelf = 7;
		int numberOfShelvesFilled = (numberOfTeddyBearsGathered / numberOfTeddyBearsPerShelf);
		
		System.out.println(numberOfShelvesFilled  + " shelves");
		
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */

		int numberPicturesPerAlbum = 20;
		int numberOfPictures = 480;
		int numberOfAlbumsNeeded = (numberOfPictures / numberPicturesPerAlbum);
		
		System.out.println(numberOfAlbumsNeeded  + " albums");
		
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */

		int numberTradingCards = 94;
		int numberOfTradingCardsPerBox = 8;
		int numberTradingCardsLeftOver = (numberTradingCards % numberOfTradingCardsPerBox);
		
		System.out.println(numberTradingCardsLeftOver  + " trading cards");
		
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

		int numberOfBooks = 210;
		int numberOfShelves = 10;
		int numberBooksPerShelf = (numberOfBooks / numberOfShelves);
		
		System.out.println(numberBooksPerShelf  + " books");
		
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */

		// I used float on this one to make sure it really was a full number and not just rounding.
		
		float numberOfCroissants = 17;
		float numberOfGuests = 7;
		float numberCroissantsLeftOver = (numberOfCroissants % numberOfGuests);
		float numberCroissantsPerGuest = ((numberOfCroissants - numberCroissantsLeftOver) / numberOfGuests);
		
		System.out.println(numberCroissantsPerGuest  + " croissants");
		
        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
		
		float billsFootPerHourSpeed = 12 * 14 / 2.15F;
		float jillsFootPerHourSpeed = 12 * 14 / 1.90F;
		float roomSize = 12 * 14;
		float timeForJointPaintingProject = ((roomSize * 5) / (billsFootPerHourSpeed + jillsFootPerHourSpeed));
		
		System.out.println(timeForJointPaintingProject  + " hrs");

		// challenge question part 2 

		float numberOfRooms = 623;
		float hoursWorkedPerDay = 8;
		float numberOfDaysToPaintRooms = (((numberOfRooms * roomSize) / (billsFootPerHourSpeed + jillsFootPerHourSpeed)) / hoursWorkedPerDay);
		
		System.out.println(numberOfDaysToPaintRooms  + " days \"challenge question part 2\"");
		
		
        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */
		
		String firstName = "Sarah";
		String lastName = "Lewis";
		String middleInitial = "E";
		String nameUsingConcatenation = (lastName + ", " + firstName + " " + middleInitial + ".");
		
		System.out.println(nameUsingConcatenation);
						
        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */

		float distanceBetweenNewYorkAndChicago = 800F;
		float distanceTrainHasTravelled = 537F;
		int percentageOfTripCompleted = (int)((distanceTrainHasTravelled / distanceBetweenNewYorkAndChicago) * 100);
		
		System.out.println(percentageOfTripCompleted + "%");
		
	}

}

package com.company;

import java.util.Scanner;

public class Recipes {

    private int theRecipe;

    public Recipes() {
        Scanner Scan = new Scanner(System.in);

        System.out.println("\nWhich recipe do you want to read ? : ");
        theRecipe = Scan.nextInt();

        if(RecipeList.recipeLevel == 1) beginnerRecipes();
        else if(RecipeList.recipeLevel == 2) intermediateRecipes();
        else if(RecipeList.recipeLevel == 3) advancedRecipes();
    }

    //All the Recipe datas inside of the cases

    private void beginnerRecipes() {

            switch (theRecipe)
            {

                case 1 : System.out.println("Ingredients\n" +
                        "1 pound Medium Tomatoes on the Vine\n" +
                        "2 cloves of Garlic, minced\n" +
                        "2 teaspoons Extra Virgin Olive Oil\n" +
                        "1 tablespoon torn Basil\n" +
                        "2 teaspoons grated Parmigiana Reggiano\n" +
                        "4 ounces Barilla Collezione Penne or Rigatoni\n" +
                        "1 Sundried Tomato\n" +
                        "Salt and Pepper\n\n");

                        System.out.println("Instructions\n" +
                                "First place the tomatoes in a food processor and purée.\n" +
                                "\n" +
                                "Next, heat the extra virgin olive oil in a skillet over medium heat. Once the oil is hot, add the garlic. Sauté for 1 minute before pouring in the tomato purée. Bring to a simmer, and let reduce while you prepare the pasta.\n" +
                                "\n" +
                                "Bring a pot of salted water to a boil. Once the water boils, add the pasta. Cook the pasta until very al dente. You want to undercook it a little since you will finish it by cooking it in the sauce for one minute. Reserve ¼ cup of the pasta water before draining the pasta.\n" +
                                "\n" +
                                "Stir the drained pasta, the pasta water, and the basil into the tomato sauce. Let cook for 1 minute and then divide the pasta between 2 plates.\n" +
                                "\n" +
                                "Top the pasta with the parmesan, and then grate some of the sundried tomato over using a microplane. Serve immediately.");
                break;


                case 2 :
                    System.out.println("Ingredients\n" +
                            "2 Sweet Italian Sausages 1/2 lb total\n" +
                            "1/4 cup chopped White Onion\n" +
                            "2 cloves Garlic\n" +
                            "1 14.5 oz can of Crushed Tomatoes\n" +
                            "1/2 cup Heavy Cream\n" +
                            "1 teaspoon Red Pepper Flakes\n" +
                            "2 cups Farfalle\n" +
                            "2 cups Baby Spinach\n" +
                            "2 tablespoons Parmesan\n" +
                            "1 tablespoon Olive Oil\n\n");

                    System.out.println("Instructions\n" +
                            "Finely chop the onion and garlic. Slice the ends off the sausage, and push the meat out of the casing, and loosely crumble it up.\n" +
                            "Bring a pot of salted water to a boil. Once the water has come to a boil, add the pasta. Cook for 7-8 minutes, until al dente. Then drain the pasta and set aside.\n" +
                            "As soon as you put the water on the boil, start to prepare the rest of this dish. Heat the olive oil in a skillet over medium high heat. Add the onions and sauté. After 2 minutes, add the sausage and red pepper flakes. For a mild spice add 1/2 teaspoon of red pepper flakes, or add more for extra spice.\n" +
                            "Brown the sausage, while using a wooden spoon to break it into small pieces.\n" +
                            "Once the sausage has browned, add the garlic, crushed tomatoes, and cream. Stir together. Let simmer for 2-3 minutes.\n" +
                            "Add the drained pasta to the sauce, along with the spinach (I tear it up as I add it in). Let the pasta and spinach simmer in the sauce for 2 minutes over medium heat. Serve with a sprinkle of Parmesan.");
                    break;


                case 3 :
                    System.out.println("Ingredients\n" +
                            "\n" +
                            "3 cups of Tomatoes (I used Baby Roma)\n" +
                            "3 tablespoons Olive Oil\n" +
                            "3 cloves of Garlic, minced\n" +
                            "8 ounces Sliced Mushrooms\n" +
                            "3/4 lb Ground Beef (I like Ground Sirloin)\n" +
                            "1/2 cup Chopped Onion\n" +
                            "2 tablespoons Tomato Paste\n" +
                            "1/2 cup Mascarpone\n" +
                            "8 ounces of Fresh Pasta (I used Rana Tagliatelle)\n" +
                            "1 tablespoon Fresh Chopped Basil\n" +
                            "1 tablespoon Grated Parmesan\n\n");
                    System.out.println("Instructions\n" +
                            "\n" +
                            "Start by roasting the tomatoes for 30 minutes. First, heat your oven to 350 degrees. I chopped 1 cup of the tomatoes into quarters, and I left the others right on the vine since I was going to put them in the blender anyway. I always like to line the baking sheet with parchment, it helps the tomatoes to roast more evenly. Then drizzle a tablespoon of olive oil over the tomatoes and generously dust them with salt and pepper.\n" +
                            "Use the next 30 minutes to catch up on a tv show. You don't need to any prep work in the kitchen right now.\n" +
                            "Once the tomatoes have roasted for 30 minutes, use a slotted spoon to remove the quartered tomatoes and place them in a bowl. Remove the stems from the tomatoes (if you left them on) and pour the whole tomatoes and all of the juices into your blender and liquify. Set aside.\n" +
                            "Pour 1 tablespoon of olive oil into a skillet over medium heat. Once hot, add the garlic and cook until fragrant. Add the mushrooms. Season with some salt and pepper, and cook for 6-7 minutes, until slightly browned. Then set aside - you can put them in the bowl with the sliced tomatoes if you want.\n" +
                            "Using the same skillet, add the last tablespoon of olive oil, and then the beef. Season with salt and pepper and use a wooden spoon to stir and break the beef up into small pieces.\n" +
                            "Once the beef has browned, add the onions to the beef, and cook until they become translucent. Then stir in the liquified tomatoes and the tomato paste. Let simmer and reduce for 2 minutes, then add the mascarpone. As soon as the mascarpone has melted, add the fresh pasta and then the mushrooms and quartered tomatoes.\n" +
                            "Carefully stir to cover the pasta in the sauce. Let the pasta simmer in the sauce for about 5 minutes until the pasta is al dente. Serve right away. Garnish with the basil and Parmesan.");
                    break;
                case 4 :
                    System.out.println("Ingredients\n" +
                            "2 1/2 cups Medium Shells\n" +
                            "2 1/2 tablespoons Butter\n" +
                            "2 tablespoons Plain Panko Breadcrumbs\n" +
                            "2 tablespoons Flour\n" +
                            "1 1/4 cup 2% Milk\n" +
                            "1 1/4 cubed Sharp Cheddar\n" +
                            "about 1/2 teaspoon Salt\n" +
                            "about 1/4 teaspoon Black Pepper\n" +
                            "a dash of Dry Mustard\n" +
                            "a dash of Paprika\n\n");
                    System.out.println("Instructions\n" +
                            "Bring a pot of salted water to a boil. Once boiling, add the pasta, cooking until al dente according to the directions on the box.\n" +
                            "Then get to work toasting the breadcrumbs. Melt 1 tablespoon of butter in a small skillet over medium heat. Stir in the breadcrumbs, and continue to stir until the break crumbs have reached a golden brown color. Then remove from the heat and set aside.\n" +
                            "Prepare the sauce next. Melt the remaining butter in a saucepan over medium heat. Once melted, whisk in the flour. Continue whisking until the butter and flour mixture (the roux) is slightly golden in color.\n" +
                            "Whisk the milk into the roux. Whisk frequently until the milk comes to a slow and steady boil. Let the mixture boil and thicken for one minute while whisking constantly.\n" +
                            "Add the cheese to the milk and whisky until it melts.\n" +
                            "Season the sauce with the salt and pepper, and a dash of dry mustard and paprika.\n" +
                            "Drain the pasta and add it to the sauce. Serve with the crispy panko breadcrumbs on top.\n");
                    break;
                case 5 :
                    System.out.println("Ingredients\n" +
                            "\n" +
                            "1 head of Garlic\n" +
                            "2 tablespoons Olive Oil\n" +
                            "2 cups Cherry Tomatoes (I used red and yellow)\n" +
                            "1/4 cup Fresh Basil Leaves\n" +
                            "Salt and Pepper\n" +
                            "12 ounces of Fresh Pasta\n" +
                            "1 tablespoon Butter\n" +
                            "2 ounces Goat Cheese\n" +
                            "1/4 cup Pasta Water\n\n");
                    System.out.println("Instructions\n" +
                            "\n" +
                            "The first thing you need to do is put the garlic in the oven to roast. Slice the top of the garlic off, exposing the tops of the cloves of garlic. Then place the garlic on two layers of foil - sliced side facing down. Fold the foil up around the garlic. Then drizzle one tablespoon of olive oil over and seal up the foil around the garlic. Place in the oven at 350 degrees.\n" +
                            "Next prepare the tomatoes. Simply slice the cherry tomatoes in half and place them on a baking sheet. Drizzle the remaining oil oil over and generously sprinkle with salt and pepper. Roughly chop the basil and sprinkle it over before placing the tomatoes in the oven beside the garlic.\n" +
                            "Now you have about 20 minutes to hang out. I read Cooking Light.\n" +
                            "Ok, hangout time is over. Bring a pot of salted water to a boil.\n" +
                            "While you are waiting for the water to boil, start working on the roasted garlic goat cheese sauce. Remove the garlic from the oven and carefully unwrap it. Let it cool for a minute before extracting 4-5 cloves of garlic (or more if you really love garlic). The garlic should be very soft; use a fork to mash it.\n" +
                            "Melt the butter in a skillet over medium heat. Reduce to medium low heat, and let the butter slowly brown; this brings out more flavor. Once the butter has started to brown, add the garlic stirring it into the butter. Then add the goat cheese letting it melt. At this point the mixture will be a thick paste. Remove the tomatoes from the oven, and scoop any tomato liquid at the bottom of the pan into the skillet, thinning out the sauce. Taste the sauce and season with salt and pepper. Then stir the tomatoes into the sauce. Keep warm on low.\n" +
                            "By now the water should be boiling. Add the pasta to the water and cook according to the directions. Before draining the pasta, remove 1/4 cup of water from the pot.\n" +
                            "Drain the pasta, and stir the pasta water in the sauce. Add the pasta to the sauce, let simmer for 1 minute, and serve immediately.\n");
                    break;
                case 6 :
                    System.out.println("Ingredients\n" +
                            "4 Boneless Skinless Chicken Breasts\n" +
                            "4 ounces of Cream Cheese cut into bite chunks (not whipped)\n" +
                            "4 Jalapenos\n" +
                            "1/2 cup Shredded Cheddar Cheese\n" +
                            "8 slices of Bacon\n\n");
                    System.out.println("Instructions\n" +
                            "Start by heating your oven to 300 degrees and then get to chopping the jalapenos. If you like hot spicy heat – leave the seeds. If you want a mild heat, remove the seeds.\n" +
                            "Then move on to pounding out the chicken breasts until they are quite thin. You want them to double in size. Cover the chicken in plastic wrap, and place on a strong surface and use a meat mallet or a cast iron pan to pound them out.\n" +
                            "Next, place a long thin chunk of cream cheese in the center.\n" +
                            "Add jalapeno and cheddar cheese on top, and then wrap the chicken around it.\n" +
                            "Use 2 slices of bacon to wrap around each chicken breast sealing it shut. Sprinkle with salt and pepper.\n" +
                            "\n" +
                            "Place the bacon wrapped chicken breasts in a baking sheet lined with aluminum foil.\n" +
                            "After 45 minutes, remove the chicken from the oven, and drain any bacon fat off the pan.\n" +
                            "Increase the oven temperature to 400 degrees, letting the bacon crisp up for another 10 minutes or as long as necessary.");
                    break;
                case 7 :
                    System.out.println("Ingredients\n" +
                            "\n" +
                            "2 tablespoons Butter\n" +
                            "2 cloves Garlic, minced\n" +
                            "3 tablespoons Flour\n" +
                            "1 cup Chicken Stock\n" +
                            "1/2 cup Milk\n" +
                            "3-4 tablespoons Mustard\n" +
                            "1 tablespoon Tarragon\n" +
                            "2 tablespoons Olive Oil\n" +
                            "8 ounces sliced Mushrooms\n" +
                            "3 tablespoons White Wine\n" +
                            "1 Yellow Onion, chopped\n" +
                            "2 pounds Chicken Breasts\n" +
                            "Flour to dredge the chicken\n" +
                            "Salt and Pepper\n\n");
                    System.out.println("Instructions\n" +
                            "\n" +
                            "Preheat your oven to 300 degrees. Prepare the chicken by cutting each chicken breast in half and then pounding it with a meat mallet until it has a thin and even thickness.\n" +
                            "Then start preparing the sauce. Start by melting the butter in a medium saucepan. Stir in the garlic, and let it cook for one minute and then stir in the flour. Stir for another minute. Then slowly add the chicken stock and milk whisk until the butter/flour mixture is completely incorporated. Then bring to a slow boil. Let boil for 1 minute, stirring frequently. This lets the sauce thicken. Then add in the mustard and tarragon. Go ahead and add extra mustard if you really like mustard. Set the sauce aside.\n" +
                            "Heat 1 tablespoon of olive oil in a skillet over medium heat. Add the mushrooms and toss in the olive oil. Sprinkle with salt and pepper. Saute the mushrooms for 4 minutes, and then add the white wine and the onions. Let saute for another 4 minutes. Then add the mushrooms and onions to the sauce.\n" +
                            "In a bowl combine about 1/2 cup flour and 1/2 teaspoon of both salt and pepper. Using the same skillet, heat another tablespoon of olive oil over medium-high heat. Once the skillet is hot, dredge the chicken in the flour and place in the skillet. It will only take a couple minutes to brown on each side. Place the browned chicken in a casserole dish. Continue to brown the chicken in batches, adding more olive oil to the pan as necessary.\n" +
                            "Once all of the chicken has browned, pour the sauce over, and place it in the oven to bake for 45 minutes.");
                    break;
                case 8 :
                    System.out.println("Ingredients\n" +
                            "1 Whole Chicken about 2 1/2 pounds\n" +
                            "1 Lemon\n" +
                            "2 Shallots\n" +
                            "2 tablespoon Butter at room temperature\n" +
                            "1/2 teaspoon Salt\n" +
                            "1/4 teaspoon Freshly Ground Black Pepper\n" +
                            "1/2 teaspoon Thyme\n" +
                            "1 teaspoon Rosemary\n" +
                            "1/4 cup Lemon Juice\n" +
                            "about 1 1/2 cups Chicken Broth\n" +
                            "1/2 cup White Wine\n" +
                            "For the gravy:\n" +
                            "1 tablespoon Butter\n" +
                            "1 tablespoon Flour\n" +
                            "Pan Drippings\n" +
                            "Chicken Broth if you need to thin the gravy\n\n");
                    System.out.println("Instructions\n" +
                            "Heat your oven to 500 degrees. Then remove the chicken from the bag. If there are giblets in the inside of the cavity of the chicken, remove those (I just throw them away).\n" +
                            "Rinse the inside and outside of the chicken, and then pat it dry with paper towels. \n" +
                            "Next, chop the lemon and shallot and stuff them inside the chicken. \n" +
                            "Use butcher's twine or folded up aluminum foil to tie the drumsticks together so that the lemon and shallot stays inside the chicken.\n" +
                            "Then rub the butter all over the chicken.\n" +
                            "Sprinkle a generous amount of salt, pepper, thyme, and rosemary over the top.\n" +
                            "Place the chicken in a roasting pan. Pour 1/4 cup of lemon juice, 1/2 cup of chicken broth, and 1/2 cup of white wine around the chicken.\n" +
                            "If you have an in oven thermometer, insert it in the thigh above the drumstick.\n" +
                            "Place the chicken in the oven on the center rack.\n" +
                            "After 20 minutes cover the chicken with foil, and 10 minutes after that reduce the oven temperature to 350 degrees.\n" +
                            "Let the chicken roast for another hour or so until it reaches 165 degrees, periodically check to make sure that there is a layer of liquid in the bottom of the roasting pan, add chicken broth as necessary.\n" +
                            "Take the chicken out of the oven and out of the roasting pan, and place it on a cutting board to rest.\n" +
                            "To make the gravy, scrape up any of the browned bits on the bottom of the pan. Then pour all of the drippings through a strainer and into a glass container. Set aside. In a small saucepan, melt a tablespoon of butter over medium heat. Once melted, whisk in a tablespoon of flour. Next, use a baster to suck up all of the juices below the line of fat that will rise to the top. Whisk in the juices and bring to a simmer and let thicken. Season with salt and pepper to taste. If the gravy is too thick, thin it with a bit of chicken broth.\n" +
                            "\n" +
                            "Carve the chicken and serve it with the gravy.");
                    break;
                case 9 :
                    System.out.println("Ingredients\n" +
                            "1.5 pounds Boneless Skinless Chicken Breast\n" +
                            "3 tablespoons All Purpose Flour\n" +
                            "3 teaspoons Sesame Oil\n" +
                            "3/4 cup Low Sodium Soy Sauce\n" +
                            "3 cloves of Garlic pressed or minced\n" +
                            "1 teaspoon Peeled Fresh Ginger grated\n" +
                            "1/2 teaspoon - 1 teaspoon Sriracha to taste\n" +
                            "2 teaspoons Corn Starch\n" +
                            "2 cups Sliced Mushrooms\n" +
                            "1 cup Snow Peas\n" +
                            "1/2 cup Shredded Carrot I get it from the grocery store salad bar\n" +
                            "2 teaspoons Sesame Seeds\n\n");
                    System.out.println("Instructions\n" +
                            "Serve with your favorite rice (I used Uncle Ben's Brown and Wild Rice Mix)\n" +
                            "First, use a knife or kitchen sheers to cut the chicken up into pieces that are about 2 bites big.\n" +
                            "Then toss the chicken in the flour, until it is evenly coated in flour. Next heat a teaspoon of sesame oil in a wok or skillet over medium heat. Once hot, add 1/3 of the chicken, and cook each side for 2 minutes, until browned. Then cook the rest of the chicken in two more batches, adding another teaspoon of sesame oil to the pan each time. Set the cooked chicken aside in a bowl.\n" +
                            "Whisk the soy sauce, garlic, ginger, sriracha, and corn starch together and then pour it into the same wok or skillet over medium heat. Add the mushrooms, and let cook for 3 minutes, stirring frequently.\n" +
                            "Add the chicken, and stir to coat it in the sauce. Cook for another 4 minutes. Lastly, add the snow peas, carrot, and sesame seeds. Cook for 2 minutes. (I used this time to make my Uncle Ben's microwaveable rice).");
                    break;
                case 10:
                    System.out.println("Ingredients\n" +
                            "16 ounces Chuck Roast\n" +
                            "1 ½ cup Sliced Mushrooms\n" +
                            "1 packed Dry Onion Soup Mix\n" +
                            "2 10.5 ounce Cans of Cream of Mushroom Soup\n" +
                            "Egg Noodles\n\n");
                    System.out.println("Instructions\n" +
                            "Place the beef in a casserole dish or dutch oven. Pour the mushrooms, dry onion soup mix, and cream of mushroom soup over. Fill one of the empty soup cans with water and pour it over the beef. Make sure that the liquid submerges the beef. Add extra soup and water if necessary.\n" +
                            "Cover the dish and place it in the oven set to 225 degrees. Let roast for 4 ½ hours, or until the beef is so tender it is falling apart. Serve over egg noodles.");
                    break;
                case 11:
                    System.out.println("Ingredients\n" +
                            "4 Chicken Breasts\n" +
                            "Salt and Pepper\n" +
                            "2 tablespoons Butter\n" +
                            "2 cloves of Garlic crushed or chopped\n" +
                            "8 ounces Sliced Mushrooms I like baby bella\n" +
                            "1 cup Dry Sherry\n" +
                            "1/3 cup Heavy Cream\n" +
                            "1/2 teaspoon Thyme\n\n");
                    System.out.println("Instructions\n" +
                            "Heat your oven to 350 degrees.\n" +
                            "Melt 1 tablespoon of butter in a large skillet over medium-high heat. Generously salt and pepper both sides of the chicken breasts. Once the butter has melted, add the chicken to the skillet. Then add 1/4 cup of sherry. Cook the chicken for 3 minutes per side, until browned. Then remove the chicken from the skillet and place it on a plate while you work on the sauce.\n" +
                            "Melt another tablespoon of butter in the same skillet you just used to cook the chicken. Add the garlic and stir, scraping up any brown bits. After a minute add the mushrooms. Generously salt and pepper and toss until the mushrooms are evenly coated with butter. Cook for 2 minutes. Then add the remaining sherry. Let the mushrooms simmer for another 4 minutes. Then stir in the cream and thyme. Let the sauce reduce for 5 minutes then add the chicken back to the skillet. Place the skillet in the oven for 30 minutes so that the chicken can finish cooking. (Make sure you are using an oven-safe skillet!)\n" +
                            "After 30 minutes in the oven the chicken should be done - serve it with pasta or rice pilaf. Spoon the sauce over the top.");
                    break;
                case 12:
                    System.out.println("Ingredients\n" +
                            "1 pound Boneless Skinless Chicken Breasts\n" +
                            "1 tablespoon Olive Oil\n" +
                            "Salt and Pepper\n" +
                            "About 1 1/2 cups White Wine I used Pino Grigio\n" +
                            "4 slices of Prosciutto\n" +
                            "1/2 pound Baby Spinach\n" +
                            "1 cup thinly sliced Baby Bella Mushroom\n" +
                            "1 cup chopped Grape Tomatoes\n" +
                            "1/2 cup Crumbled Blue Cheese\n" +
                            "4 Hard Boiled Eggs sliced\n" +
                            "Blue Cheese Dressing\n\n");
                    System.out.println("Instructions\n" +
                            "Start by preparing the chicken. Heat your oven to 300 degrees. Place the chicken breasts on a baking sheet. Drizzle the olive oil over, and sprinkle with salt and pepper. Then pour the white wine into the pan, you want it to be about 1/2 inch high. Place the chicken in the oven to bake. After 30 minutes, flip it over, and let it cook for another hour.\n" +
                            "You have about 40 minutes of downtime while the chicken bakes. After 40 minutes, place the proscuitto on a parchment lined baking sheet, and place it in the oven alongside the chicken. Cook the prosciutto for about 15 minutes, until it is hard and crisp. Let cool, and then crumble.\n" +
                            "Next, prepare the blue cheese dressing if you are making it from scratch.\n" +
                            "Remove the chicken from the oven, and slice or dice.\n" +
                            "To assemble the salads, divide the spinach between for plates or storage containers. Add the sliced chicken, chopped tomatoes, sliced mushrooms, crumbled blue cheese, sliced egg, and crispy prosciutto. Either top with blue cheese dressing and eat right away, or leave undressed and store for later.\n" +
                            "Recipe Notes\n" +
                            "You could certainly add some different ingredients. Steak could be substituted for chicken. You could use bacon instead of prosciutto. Avocado, toasted walnuts, and chopped bell peppers would be welcome additions.");
                    break;

             default: System.out.println("You didn't choose a number of recipe."); break;

            }





    }

    private void intermediateRecipes() {

        switch (theRecipe)
        {

            case 1 :
                System.out.println("Ingredients\n" +
                        "6 large eggs separated into yolks and whites\n" +
                        "2 3/4 cups plus 1 teaspoon superfine sugar (if you can't find superfine just pulse regular granulated sugar in the blender until it's powdery)\n" +
                        "1 tablespoon cornstarch\n" +
                        "1 teaspoon white wine vinegar\n" +
                        "dash pure vanilla extract\n" +
                        "1 tablespoon lemon zest\n" +
                        "1/2 cup plus 1/2 teaspoon freshly squeezed lemon juice divided\n" +
                        "8 tablespoons (1 stick) unsalted butter cut into small cubes\n" +
                        "2 cups fresh raspberries\n" +
                        "8 ounces Mascarpone cheese\n" +
                        "1/2 cup cold heavy cream\n\n");
                System.out.println("Instructions\n" +
                        "For the meringue: Heat oven to 350 degrees. Line a baking sheet with parchment paper, and draw a circle on the paper using an 8- or 9- inch cake pan as a guide. Flip the parchment over so the pencil marking is facing down (this ensures that the pencil won't transfer to the meringue). In bowl of an electric mixer, combine the 6 egg whites and a pinch of the salt. Begin beating at low speed, slowly increasing to high. Continue until satiny peaks begin to form; gradually beat in 1 3/4 cup of the sugar a tablespoon at a time until meringue is stiff and shiny.\n" +
                        "\n" +
                        "Sprinkle in cornstarch, white-wine vinegar, and dash of vanilla, and fold in gently. Mound onto parchment within circle, and shape into a disk, flattening top and smoothing sides. Place in oven, and immediately reduce heat to 300°F and bake until set about 1 hour 15 minutes. Turn off heat, and allow meringue to cool completely in oven.\n" +
                        "\n" +
                        "TIP\n" +
                        "Meringue can be made up to 2 days in advance. Store lightly covered with plastic wrap at room temperature until ready to use. \n" +
                        "\n" +
                        "For the lemon curd: Meanwhile, make the lemon curd. Combine 6 egg yolks, 2/3 cup of the sugar, zest, 1/2 cup of the juice, and 1/4 teaspoon of the salt in a medium saucepan and whisk until evenly combined. Cook over medium-low heat, stirring constantly, until thick enough to coat the back of a spoon, about 8 minutes. When you draw your finger across the spoon, it should make a mark through the custard, which should not run back in on itself. Remove from heat, transfer to a bowl, and stir in 8 tablespoons of the butter, piece by piece, until. Cover with plastic wrap and refrigerate until cold, at least 1 hour.\n" +
                        "\n" +
                        "TIP\n" +
                        "Curd can be made up to 2 days ahead of time and stored refrigerated in an airtight container until ready to use. You will not need all of the curd so you can use the rest to make parfaits or to fill crepes.\n" +
                        "\n" +
                        "For the raspberry puree: Place the 2 cups of raspberries and 1 tablespoon of the sugar in a small saucepan and cook over low heat until the sugar is dissolved and the raspberries just begin to break down. Transfer sauce to a food processor or blender, add the lemon juice, and process until smooth. Pass the puree through a fine-mesh sieve and discard seeds and set sauce aside. \n" +
                        "\n" +
                        "TIP\n" +
                        "Raspberry puree sauce can be made up to 4 days ahead of time. Store refrigerated in an airtight container until ready to use. You will not need to use all the puree -- use the rest to top ice cream or your morning yogurt or to make a twist on these Peach Melba Cream Sodas. \n" +
                        "\n" +
                        "For the mascarpone whipped cream: When ready to serve, combine 8 ounces of mascarpone, 1/2 cup of cream, and remaining 1/3 cup of the sugar in a medium bowl. Using a clean whisk, beat just until well combined and fluffy and medium peaks (the whipped cream will cling to the whisk without falling off). \n" +
                        "\n" +
                        "To serve: To assemble, carefully peel off parchment and place meringue on a platter or cake stand. Gently crack the top with the back of a soup spoon to make a shallow nest for the whipped cream, curd, sauce, and berries. Place one of the meringue rounds on a cake stand then topping with half the whipped mascarpone, a few spoonfuls of the curd, and a few spoonfuls of the raspberry puree. Top with half the berry mixture then repeat to create a second layer. Serve immediately. ");
                break;
            case 2 :
                System.out.println("Ingredients\n" +
                        "1 pound unpeeled Persian cucumbers ends trimmed, plus more for garnish\n" +
                        "1 1/2 cups fresh basil leaves (no stems), plus more sprigs on the stem for garnish\n" +
                        "1/2 cup cold water\n" +
                        "6 tablespoons freshly squeezed lime juice\n" +
                        "1/4 cup honey\n" +
                        "Pinch coarse sea salt\n" +
                        "1 bar spoon orange flower water (optional)\n" +
                        "1/3 cup elderflower liqueur\n" +
                        "12 dashes ANGOSTURA orange bitters\n" +
                        "1 (750 ml) chilled sparkling water\n" +
                        "ice cubes\n\n");
                System.out.println("Instructions\n" +
                        "For the Agua Fresca: Combine the cucumber, basil, water, lime juice, honey and salt in the carafe of a blender. Place the top on the blender carafe, then blend until the mixture is smooth, at least 30 seconds.\n" +
                        "\n" +
                        "Strain the mixture twice through a sieve, pushing on the back of the mixture with a spatula to extract as much juice as possible. Discard the solids and set mixture aside.\n" +
                        "\n" +
                        "For the Cocktail: In a pitcher, mix the cucumber agua fresca, elderflower liqueur, ANGOSTURA orange bitters and 2 cups ice.\n" +
                        "\n" +
                        "To serve, fill a Tom Collins glass with 3 to 4 ice cubes, add in ½ cup of the cucumber basil agua fresca cocktail mixture and top with ½ cup of sparkling water. Stir to combine, garnish with a sprig basil leaves and some thinly-sliced cucumber and serve.");
                break;
            case 3 :
                System.out.println("Ingredients\n" +
                        "4 large very fresh, high-quality eggs divided\n" +
                        "3/4 cup granulated sugar\n" +
                        "8 ounces Mascarpone cheese\n" +
                        "1 tablespoon pure vanilla extract or the inside bits from a vanilla bean (optional)\n" +
                        "1 pinch kosher salt\n" +
                        "1 cup espresso or strong coffee\n" +
                        "2 tablespoons dark rum or kahlua (optional)\n" +
                        "3 (7 ounce) packages ladyfingers (aka Savoiardi)\n" +
                        "1/4 cup dutch-process cocoa powder for garnish\n" +
                        "dark chocolate (about 72%), for garnish (optional)\n\n");
                System.out.println("Instructions\n" +
                        "Prepare a 6-inch or 8-inch springform pan by lining the bottom with a round of parchment or wax paper. Set aside. Meanwhile, carefully separate the eggs and set the whites in the refrigerator until ready to use. Combine the egg yolks and sugar in the bowl of a stand mixer fitted with a whisk attachment. Beat on medium speed until the mixture is well combined and thicker, about 3 minutes. \n" +
                        "\n" +
                        "Transer the egg yolk mixture to a heatproof (glass or metallic) bowl and set it over a small pan of simmering water. Constantly whisk the mixture until is reaches 160°F then immediately remove from the heat and return to the stand mixer bowl. Add the mascarpone cream to the egg yolks then, scraping down the sides of the bowl periodically, beat the mixture on medium speed until it's thoroughly combined. If using, add the vanilla then stir to incorporate. Remove mixture to a bowl and set aside to cool. \n" +
                        "\n" +
                        "TIP\n" +
                        "A traditional tiramisu doesn't include cream. By cooking the eggs slightly you not only get rid of an \"eggy\" flavor that some tiramisu recipes have but also you make a sort of custard base that allows you to get a nice thick mascarpone cream without adding in heavy cream.\n" +
                        "\n" +
                        "Thoroughly clean the stand mixer bowl and whisk attachment, dry the mixing bowl, then return it to the stand mixer and add the egg whites. Beat on medium speed until frothy then add a pinch of salt. Keep beating the mixture until the egg whites are stiff peaks (the egg whites won't move when you turn the mixing bowl upside down). Add 1/3 of the egg whites to the mascarpone mixture and stir well to combine. Then gently fold in the remaining egg whites. \n" +
                        "\n" +
                        "TIP\n" +
                        "Make sure the mixing bowl is super clean before you whip the egg whites or they may not increase in volume. After cleaning with soapy water go ahead and rinse everything with distilled white vinegar to be extra sure it's clean. Just dry it thoroughly so you don't have a major vinegar flavor going on in the recipe.\n" +
                        "\n" +
                        "Brew 1 cup of very strong coffee or espresso and add in dark rum or kahlua, if using. Place coffee mixture in a shallow dish then begin to assemble the tiramisu. To assemble, arrange some dry (undipped) ladyfingers one next to the other into an upright border around the inside edge of the springform pan. You should be able to fit enough so they are snug and hold each other in place by the time you're finished. \n" +
                        "\n" +
                        "TIP\n" +
                        "Using espresso is preferable to brewed coffee as it imparts a deeper flavor. You can use decaf if you don't want the caffeine kick!\n" +
                        "\n" +
                        "To assemble the rest of the tiramisu, dip the top of a ladyfinger in the coffee mixture the arrange in dipped-side up in the bottom of the pan. Continue until you have a tight layer of ladyfingers on the bottom of the pan (you will need to trim some to fit into the random holes). Add about 1-inch of the mascarpone cream mixture (about 1 1/3 cups) then smooth into an even layer with a rubber spatula. Sift a spoonful of cocoa powder even over the layer. Repeat two more times to make three layers in total (you should use up all the mascaprone cream by the end). Do not put on the last layer of cocoa until ready to serve. \n" +
                        "\n" +
                        "TIP\n" +
                        "You can also make this as a normal (layered) tiramisu in a square glass pan. To do so simply skip the step where you stack some of the ladyfingers on the edge and just get to the layering part. \n" +
                        "\n" +
                        "Lightly cover the tiramisu cake with plastic wrap and transfer to the refrigerator until set, at least 6 hours and preferably 12 hours. To serve, remove the spring form pan ring then garnish the top with a last layer of cocoa powder and, if desired, some chocolate curls. \n" +
                        "\n" +
                        "TIP\n" +
                        "To make chocoalte curls, use a vegetable peeler on the side of a chocolate bar!");
                break;
            case 4 :
                System.out.println("Ingredients\n" +
                        "8 medium baby japanese eggplant (or 1 Globe eggplant) ends trimmed\n" +
                        "6 tablespoons olive oil divided plus more for garnish\n" +
                        "4 sprigs fresh thyme (or oregano) leaves stripped\n" +
                        "kosher salt and Freshly ground black pepper\n" +
                        "6 medium garlic cloves thinly sliced\n" +
                        "1 (14-ounce) can tomato puree\n" +
                        "1 tablespoon balsamic or sherry vinegar\n" +
                        "1 teaspoon unrefined cane sugar optional\n" +
                        "12 ounces spaghetti\n" +
                        "3 ounces feta or goat cheese crumbled\n" +
                        "1 handful fresh basil leaves thinly sliced\n\n");
                System.out.println("Instructions\n" +
                        "Heat oven to 450°F and arrange a rack in the middle. Slice baby eggplant lengthwse or cut larger eggplant into 1-inch cubes then combine with half of the olive oil and the thyme or oregano. Season with salt and freshly ground black pepper and toss to combine. Spread on a silicone baking mat or foil-lined baking sheet in one even layer and roast, stirring a few times, until soft and golden brown, about 20 to 30 minutes.\n" +
                        "\n" +
                        "Meanwhile, bring a large pot of heavily salted water to a boil over high heat. In a large frying pan, heat the remaining oil over medium-high heat. When it shimmers, add garlic and cook until garlic is crisp, golden brown, and fragrant. Remove garlic to a paper towel-lined plate and set aside. Return pan with olive oil to the stove over medium heat and add the tomatoes and vinegar, sugar, season with salt, reduce heat to medium-low, and simmer, stirring occasionally, until slightly thickened, about 10 minutes\n" +
                        "\n" +
                        "Meanwhile, when the water boils, cook pasta according to package directions. Reserve 1 cup of pasta water and drain pasta. Set aside. Add eggplant to pasta sauce and simmer until heated through. Taste, and, add more vinegar is sauce is sweet, or, as needed, add sugar to make the sauce sweeter.\n" +
                        "\n" +
                        "Add reserved pasta to pasta sauce and stir to coat. Add 1/4 cup of the reserved pasta water and stir until each piece of pasta is just coated with the sauce. Add additional pasta water as needed to help the sauce coat the pasta. Remove from heat, top with cheese, basil, and crisp garlic and season with additional salt and pepper, as desired. Finish pasta with a drizzle of additional olive oil and serve.");
                break;
            case 5 :
                System.out.println("Ingredients\n" +
                        "6 large egg yolks\n" +
                        "3/4 cup unrefined granulated sugar\n" +
                        "15 ounces Strawberry-Tarragon Puree\n" +
                        "1/2 cup freshly squeezed lemon juice\n" +
                        "8 ounces unsalted butter cut into 8 pieces\n\n");
                System.out.println("Instructions\n" +
                        "Combine egg yolks, sugar, purée and lemon juice in a medium saucepan and whisk to combine. Using a wooden spoon, continue stirring, paying careful attention to bottom and sides of pan to prevent egg yolks from sticking. Continue cooking for 6 to 8 minutes until curd begins to thicken enough to coat the back of your spoon.\n" +
                        "\n" +
                        "Remove from heat and add butter, one tablespoon at a time, whisking constantly until thoroughly incorporated. Pour curd through a fine mesh sieve into a medium bowl and place plastic wrap directly over curd to prevent film from forming. Let cool at room temperature. Once cool, pour curd into jars, tightly seal and chill in refrigerator at least one hour before serving.\n" +
                        "\n" +
                        "TIP\n" +
                        "Curd can be stored up to two weeks in refrigerator.");
                break;
            case 6 :
                System.out.println("Ingredients\n" +
                        "1/3 cup almond meal or graham cracker crumbs\n" +
                        "1/3 cup powdered sugar\n" +
                        "3/4 cup all-natural almond butter (or your favorite nut butter) stirred as needed to incorporate oil \n" +
                        "1 tablespoon honey or maple syrup\n" +
                        "1/2 teaspoon pure vanilla extract or vanilla bean paste\n" +
                        "1/2 teaspoon Sea salt\n" +
                        "1/2 pound (8 ounces) coarsely chopped milk or dark chocolate\n\n");
                System.out.println("Instructions\n" +
                        "Combine graham cracker crumbs or almond meal, powdered sugar, nut butter, honey or maple syrup, vanilla, and sea salt in a stand mixer fit with a paddle attachment or in a large bowl. Mix on medium speed with a stand mixer or a handheld mixer until filling is well combined, breaks into large chunks, and resembles cookie dough.\n" +
                        "\n" +
                        "Divide filling into 36 (1-teaspoon) balls or larger as needed to fit your chocolate candy molds or mini muffin pans, then form into round, flat egg shapes if putting in the candy molds or discs if putting in the muffin tins. Set aside. Meanwhile, break up the chocolate, place in a stainless steep or glass bowl and nest over a pot of simmering water (make sure the bowl doesn't touch the water) and stir until chocolate is melted and smooth.\n" +
                        "\n" +
                        "TIP\n" +
                        "When the filling is in the wells, there should be enough room to cover it with chocolate.\n" +
                        "\n" +
                        "Using a small pastry brush, paint the chocolate inside each well of the muffin pan or the candy molds. Do your best to make your coating as even as possible, aiming for about 1/16-inch thick. Place the chocolate in the fridge until it\u0092s just set.\n" +
                        "\n" +
                        "Place fillings in the mini muffin wells or candy molds (shaping the filling as needed to fit well) but don\u0092't push too hard or you\u0092'll crack the coating. Spoon more chocolate over each filling until completely covered. Scrape across the top of the pan with a pastry knife or a flat spatula to remove excess chocolate and even out candy tops.\n" +
                        "\n" +
                        "Place the molds in the freezer for 15 to 20 minutes to set up. To remove candies, place a towel or a silicone baking mat on a counter and hit one edge of the muffin pan against the counter. Let come to room temperature before serving.");
                break;
            case 7 :
                System.out.println("Ingredients\n" +
                        "3 large eggs\n" +
                        "3 large egg yolks\n" +
                        "1/2 cup almond milk or whole milk or coconut milk\n" +
                        "1/4 cup packed light brown sugar\n" +
                        "1/2 teaspoon pure vanilla extract\n" +
                        "1/4 teaspoon kosher salt\n" +
                        "pinch ground cardamom optional\n" +
                        "2 tablespoons unsalted butter\n" +
                        "1/4 cup granulated sugar\n" +
                        "4 apple or baby firm-ripe bananas peeled and halved lengthwise\n" +
                        "2 tablespoons roughly chopped toasted macadamia nuts\n" +
                        "3 croissants halved lengthwise\n" +
                        "Toasted coconut for serving\n" +
                        "whipped cream or whipped coconut cream or whipped creme fraiche, for serving\n\n");
                System.out.println("Instructions\n" +
                        "Heat oven to 350°F and arrange a rack in the middle. Combine the whole eggs, egg yolks, milk, brown sugar, vanilla extract, kosher salt, and pinch of cardamom in a large bowl and whisk until eggs are broken up and custard is smooth. Set aside. \n" +
                        "\n" +
                        "Melt butter in an 8-inch cast iron pan over medium-high heat. Stir in granulated sugar and cook, swirling skillet occasionally, until mixture turns medium amber, about 3 minutes. Arrange bananas cut-side down in skillet, overlapping slightly. Scatter macadamia nuts over the top then cook, without stirring for another 3 minutes. Meanwhile, dip the cut croissants into the custard mixture then let excess custard drip off. Arrange the croissants cut-side up in the pan and overlap slightly. Push down slightly so the croissants fit and the banana caramel mixture comes up the sides slightly. \n" +
                        "\n" +
                        "Transfer to oven and bake until croissants are golden brown and puffed, about 10 to 15 minutes. Remove from oven and let sit for a few minutes. Carefully invert the tart onto a serving plate. Serve with toasted coconut and whipped coconut cream or creme fraiche.");
                break;
            case 8 :
                System.out.println("Ingredients\n" +
                        "3/4 cup short grain brown rice\n" +
                        "1 1/2 cups cold water\n" +
                        "2 tablespoons rice wine vinegar\n" +
                        "1 tablespoon unrefined cane sugar\n" +
                        "1/2 teaspoon kosher salt\n" +
                        "8 ounces sushi grade ahi tuna, salmon, or hamachi sliced 1/4-inch thick on the bias and refrigerated until ready to serve\n" +
                        "1 medium Persian cucumber sliced into 1/4-inch rounds\n" +
                        "1/4 cup pickled ginger\n" +
                        "1/2 cup daikon sprouts or pea shoots, trimmed\n" +
                        "1/2 medium lemon thinly sliced\n" +
                        "1/4 sweet onion thinly sliced\n" +
                        "1 small firm-ripe avocado halved, pitted, and thinly sliced\n" +
                        "low-sodium soy sauce for serving\n" +
                        "Prepared wasabi for serving\n\n");
                System.out.println("Instructions\n" +
                        "In a small pot with a tight fitting lid bring rice and water to a boil. Stir, then reduce heat to low and cook for a bout 45 to 50 minutes or until water is absorbed and rice cooked through.\n" +
                        "\n" +
                        "TIP\n" +
                        "Brown rice can be cooked ahead of time (using this method of with a rice cooker) and prepared sushi style up to 2 days ahead of time. \n" +
                        "\n" +
                        "About 5 to 10 minutes before rice is done bring the vinegar, sugar, and salt to a boil in a small saucepan. Remove from heat and stir to dissolve sugar and salt.\n" +
                        "\n" +
                        "Once rice is done, transfer to a wide bowl or small sheet pan and pour over the vinegar solution. Using a wooden rice paddle mix the vinegar through the rice using a flipping and chopping motion. This helps to release the hot air and creates a coating on the grains of rice. Continue to mix the rice for 1 to 2 minutes.\n" +
                        "\n" +
                        "Divide the rice between two wide bowls. Layer slices of your fish over lapping each other while putting a slice of lemon and a few onion slices between each piece. Place a little pile of pickled ginger next to the fish. Then create a pile of cucumbers next to the ginger. Fan slices of half an avocado along the other side of the bowl. In the middle of the bowl place a mound of pea shoots. Serve with a side dish of soy sauce and wasabi.  \n" +
                        "\n" +
                        "TIP\n" +
                        "You need really high quality sushi grade fish for this recipe so do not take any shortcuts. We special order our chirashi fish from a reputable fish monger and let them know that we're going to eat it raw so they give us the best of the best in quality.");
                break;
            case 9 :
                System.out.println("Ingredients\n" +
                        "2 pounds flaky white fish such as snapper, cod, mahi mahi, or tilapia\n" +
                        "3/4 cup cornstarch divided\n" +
                        "1 teaspoon baking powder divided\n" +
                        "kosher salt\n" +
                        "1/2 to 3/4 cup unbleached all-purpose flour\n" +
                        "2/3 cup Crema or sour cream\n" +
                        "1/3 cup good-quality mayonnaise\n" +
                        "3 chipotle en adobo sauce or chipotle puree\n" +
                        "2 tablespoons freshly squeezed lime juice plus more to taste\n" +
                        "1 cup lager beer preferably Mexican\n" +
                        "neutral oil (like canola, grapeseed, or peanut oil) for fying\n" +
                        "2 cups shredded red cabbage\n" +
                        "Lime wedges for serving\n" +
                        "cilantro leaves for serving\n\n");
                System.out.println("Instructions\n" +
                        "To prepare the fish: Cut each tilapia fillet in half lengthwise. Keep the shorter half of the fillet whole, but cut the longer half in half again widthwise. To a large bowl, add 1/4 cup cornstarch, 1/2 teaspoon baking powder and 2 teaspoons kosher salt, whisking to combine. Add the strips of tilapia, and toss until evenly coated. Transfer the fish to a wire rack set over a rimmed baking sheet, and refrigerate uncovered for 30 minutes or overnight. Meanwhile, make the crema.\n" +
                        "\n" +
                        "For the crema: Combine the Mexican crema, mayo, chipotles, lime juice and a pinch of salt in a small food processor or blender, and process until smooth.  The crema should be fairly thin. Season to taste with additional kosher salt and lime juice. Flavors should be bright and bold. \n" +
                        "\n" +
                        "TIP\n" +
                        "Recipe can be done through this step up to 1 day ahead.\n" +
                        "\n" +
                        "To fry the fish: When ready to fry, whisk together 1/2 cup cornstarch, 1/2 teaspoon baking powder, 1/2 cup flour and 2 teaspoons kosher salt in a large bowl. Add beer, and whisk until smooth. To test the consistency, dip a whisk into the batter, then pull up.  If the batter runs off the whisk in a steady, thin stream, it’s perfect. If it doesn’t hold to the whisk, it’s too thin.  Whisk in a little flour and test again.  If the batter runs off the whisk in a slower, thicker stream, it’s too thick, whisk in a little beer and test again. Set batter aside for 15 minutes before using.\n" +
                        "\n" +
                        "Meanwhile, fill a large cast-iron pot with enough oil to reach a depth of 2-inches, and preheat oil to 350°F. Working in batches, dip the fillets in the beer batter one at a time, making sure the fish is fully coated.  Let excess batter drip off, then carefully lower the fish in the oil.  Don’t overcrowd the batches as this will cause the temperature of the oil to drop quickly.  Fry the fish until golden brown and cooked through (4 to 5 minutes). Transfer to a wire rack and immediately sprinkle with salt.\n" +
                        "\n" +
                        "To assemble the fish tacos: To make the fish tacos, place 1 or 2 pieces of fried fish in a warm tortilla with shredded cabbage.  Squeeze a lime over the fish and cabbage, then drizzle with chipotle crema. Finish with a few cilantro leaves. The fish tacos are best enjoyed immediately!");
                break;
            case 10:
                System.out.println("Ingredients\n" +
                        "4 cups low-sodium chicken or vegetable broth\n" +
                        "4 ounces thinly sliced speck or prosciutto\n" +
                        "2 tablespoons unsalted butter\n" +
                        "2 medium leeks ends trimmed, quartered lengthwise then thinly sliced crosswise\n" +
                        "1 1/2 cups semi-pearled farro\n" +
                        "1 cup Franciacorta or another sparkling wine\n" +
                        "2 medium ripe Red d'Anjou pears diced\n" +
                        "Dash white balsamic vinegar (optional)\n" +
                        "1/4 cup finely grated Parmigiano-Reggiano cheese\n" +
                        "3 tablespoons Mascarpone cheese or robiola bosina cheese, for garnish (optional)\n\n");
                System.out.println("Instructions\n" +
                        "Heat the oven to 400°F. Place broth in a small saucepan and keep warm over low heat. Heat butter in a large saucepan over medium heat. When foaming subsides, add leek, season with salt and freshly ground black pepper, and cook until translucent, about 5 minutes. Meanwhile, arrange the prosciutto in a single layer on a foil-lined baking sheet. Bake until crisp, 8 to 10 minutes; set aside. Meanwhile, add the grains and stir to coat in the oil. Add the wine and cook until alcohol smell is cooked off.\n" +
                        "\n" +
                        "Reduce heat to medium-low and add simmer, adding the broth one ladleful at a time and stirring occasionally, until the broth is absorbed (it should be cooking at a simmer the whole time). Continue adding broth until it is all absorbed and the barley is al dente (firm but not chalky) and the risotto is a porridge-like consistency, about 30 minutes.\n" +
                        "\n" +
                        "Stir in 1 cup of water, season with salt and freshly ground black pepper, and stir in pears. If desired, add vinegar, cover and set aside to rest a few minutes. Stir in the Parmiggiano cheese then taste and adjust seasoning.\n" +
                        "\n" +
                        "Divide risotto among serving bowls, top with mascarpone or robiola, drizzle with olive oil, top with crisp speck, add freshly ground black pepper, and serve. ");
                break;
            case 11:
                System.out.println("Ingredients\n" +
                        "1 cup semi-pearled farro rinsed and drained (can substitute wheatberries or barley)\n" +
                        "3 tablespoons extra-virgin olive oil\n" +
                        "1/2 medium yellow onion finely chopped\n" +
                        "4 medium celery stalks finely chopped\n" +
                        "3 medium garlic cloves finely chopped\n" +
                        "1 tablespoon minced fresh thyme leaves\n" +
                        "kosher salt and Freshly ground black pepper\n" +
                        "2 medium Golden Delicious, Gala, or Pink Lady apples halved, cored, and medium dice\n" +
                        "3/4 cup low-sodium vegetable broth, chicken broth, or water\n" +
                        "1/3 cup currants\n" +
                        "1/4 cup roughly chopped fresh flat-leaf Italian parsley\n" +
                        "1/4 cup walnuts toasted and finely chopped\n" +
                        "4 acorn squash cut in half and seeds removed\n\n");
                System.out.println("Instructions\n" +
                        "Bring a large pot of heavily salted water to a boil over high heat. When it boils, stir in farro and cook until just tender, about 15 to 20 minutes. Drain well and place in a large bowl. (Can be done up to 1 day ahead.) Heat the oven to 375°F and arrange a rack in the middle.\n" +
                        "\n" +
                        "Heat oil in a large frying pan over medium heat. When it shimmers, add the onion, celery, garlic, and thyme then season with the kosher salt and freshly ground black pepper, and stir to coat. Cook, stirring occasionally, until just softened, about 5 minutes.\n" +
                        "\n" +
                        "Remove from heat and stir in the apples, grains, broth, currants or raisins, parsley, walnuts, and some freshly ground black pepper. Divide filling among acorn squash or place in 2 quart baking dish, drizzle with a bit of olive oil, and bake until the filling is heated through, 15 minutes. Serve hot or warm.\n" +
                        "\n" +
                        "TIP\n" +
                        "The stuffing can be made through this point up to 4 days in advance and store refrigerated until ready to proceed.");
                break;
            case 12:
                System.out.println("Ingredients\n" +
                        "1/2 cup extra-virgin olive oil divided plus more for steak\n" +
                        "1 cup whole cherry or grape tomatoes plus more for salad\n" +
                        "1 medium shallot roughly chopped\n" +
                        "1 medium garlic clove roughly chopped\n" +
                        "2 tablespoons balsamic or sherry vinegar\n" +
                        "1 pinch unrefined cane sugar\n" +
                        "kosher salt and Freshly ground black pepper\n" +
                        "2 (8 ounce) New York Strip Steaks or Top Sirloin Steaks\n" +
                        "1 pound marble potatoes or other tiny potatoes\n" +
                        "1 medium bell pepper large dice\n" +
                        "1/3 cup thinly sliced celery plus a few celery leaves for garnish\n" +
                        "1/4 cup thinly sliced green onions (aka scallions)\n" +
                        "2 tablespoons finely chopped fresh parsley, chives, or dill divided for vinaigrette and garnish (optional)\n\n");
                System.out.println("Instructions\n" +
                        "For the vinaigrette: Heat 1 tablespoon of the oil in a medium frying pan over medium-high heat until shimmering. Add tomatoes and sear, stirring occasionally, until the skins pucker and begin to color, about 2 minutes. Stir in garlic and shallot and cook until slightly softened, about 1 minute more.\n" +
                        "\n" +
                        "TIP\n" +
                        "Be careful: When the tomatoes get hot, some might burst.\n" +
                        "\n" +
                        "Transfer tomato mixture to a small, deep mixing bowl, add vinegar, and purée with an immersion blender. Keep blending constantly with the immersion blender and slowly pour in the remaining oil, until well incorporated. Stir in 1 tablespoon of the herbs (if using) then season with salt and freshly ground black pepper, taste, and adjust seasoning as desired.\n" +
                        "\n" +
                        "TIP\n" +
                        "You may also blend the tomato mixture in a blender, but use extreme caution when blending hot items, as trapped steam can blow off the lid. Vinaigrette can be made up to 4 days in advance -- store refrigerated in an airtight container and let warm up slightly so it's pourable before using.\n" +
                        "\n" +
                        "For the salad: Place potatoes in a medium saucepan and cover with water. Bring to a boil over high heat then reduce to a simmer. Cook until potatoes are knife tender, about 15 minutes. Drain let cool slightly then halve.\n" +
                        "\n" +
                        "Meanwhile, heat the grill to medium high (about 400°F). Meanwhile, drizzle the steaks on all sides with a little oil, generously season with salt and pepper, and let come to room temperature while the grill is heating. Grill the steaks uncovered for 5 minutes per side for medium. Remove from the grill and let rest for 5 to 10 minutes. Cut into large dice and set aside.\n" +
                        "\n" +
                        "TIP\n" +
                        "Potatoes can be cooked and halved up to two days ahead of time.\n" +
                        "\n" +
                        "Combine the reserved steak, bell pepper, tomato, remaining 1 tablespoon of herbs (if using), celery, celery leaves, and scallions in a large, nonreactive mixing bowl. Halve the potatoes and add to the bowl. Toss with about 1/4 cup of the vinaigrette and season with salt and pepper as needed. Taste and add more salt, pepper, or vinaigrette, as desired. Serve immediately.");
                break;

            default: System.out.println("You didn't choose a number of recipe."); break;

        }


    }

    private void advancedRecipes() {
        switch (theRecipe)
        {
            case 1 :
                System.out.println("INGREDIENTS\n" +
                        "Calabrian Chile Sauce\n" +
                        "3 Tbsp. chopped oil-packed Calabrian chiles from a jar\n" +
                        "2 Tbsp. extra-virgin olive oil\n" +
                        "1½ tsp. finely grated lemon zest\n" +
                        "2 tsp. fresh lemon juice\n" +
                        "½ small garlic clove, finely grated\n" +
                        "Arancini\n" +
                        "3½ cups low-sodium homemade chicken stock or store-bought broth\n" +
                        "4 Tbsp. unsalted butter, divided\n" +
                        "1 medium onion, finely chopped\n" +
                        "2 garlic cloves, thinly sliced\n" +
                        "1 cup carnaroli or arborio rice\n" +
                        "1½ tsp. kosher salt, plus more\n" +
                        "½ cup dry white wine\n" +
                        "2 oz. finely grated Parmesan (about 1 cup)\n" +
                        "¼ cup heavy cream\n" +
                        "2 tsp. finely grated lemon zest\n" +
                        "1 Tbsp. fresh lemon juice\n" +
                        "1 tsp. freshly ground black pepper, plus more\n" +
                        "3 oz. low-moisture mozzarella, cut into ⅓\" pieces\n" +
                        "2 cups panko (Japanese breadcrumbs)\n" +
                        "½ cup all-purpose flour\n" +
                        "2 large eggs\n" +
                        "Canola oil (for frying; about 6 cups)\n\n");
                System.out.println("RECIPE PREPARATION\n" +
                        "Calabrian Chile Sauce\n" +
                        "Mix chiles, oil, lemon zest, lemon juice, and garlic in a small bowl to combine.\n" +
                        "\n" +
                        "Do Ahead: Sauce can be made 12 hours ahead. Cover tightly with plastic wrap and chill.\n" +
                        "Arancini\n" +
                        "Bring stock to a simmer in a medium pot over medium heat, then keep warm over low.\n" +
                        "\n" +
                        "Heat 2 Tbsp. butter in a medium saucepan over medium. Add onion and cook, stirring often, until softened but not browned, 4–5 minutes. Add garlic and cook, stirring constantly, until softened but not browned, about 1 more minute.\n" +
                        "\n" +
                        "Stir in rice; season with 1½ tsp. salt. Cook, stirring often, until some of the grains turn translucent around the edges, about 3 minutes. Add wine and cook, stirring often, until pan is almost dry, about 2 minutes. Ladle in 1 cup warm stock, bring to a simmer, and cook, stirring often, until liquid is absorbed, about 4 minutes. Ladle in another 1 cup stock and continue to cook, stirring yet again, until most of the liquid is absorbed, 5–7 minutes. Add remaining 1½ cups stock and cook, stirring often, until rice is cooked through but toothsome and liquid is mostly absorbed, 9–11 minutes longer. Remove from heat. Stir in Parmesan, cream, lemon zest, lemon juice, 1 tsp. pepper, and remaining 2 Tbsp. butter. Season risotto with salt.\n" +
                        "\n" +
                        "Spread risotto in an even layer on a parchment-lined rimmed baking sheet. Chill at least 1 hour or up to 4 (cover risotto with plastic wrap after 1 hour so it doesn’t develop a skin).\n" +
                        "\n" +
                        "Line another rimmed baking sheet with parchment. Scoop about ¼ cup risotto into your hands and form into a patty about 2½\" in diameter (it doesn’t need to be perfect!). Place 2–3 pieces mozzarella in the center of patty. Carefully pinch and shape risotto so it completely encases the cheese, then roll into a 2\" ball. Your hands might get messy, and the balls may be slightly misshapen (they’ll firm up later). Place on prepared baking sheet. Repeat with remaining risotto and mozzarella. Freeze balls 10 minutes.\n" +
                        "\n" +
                        "Meanwhile, pulse panko in a food processor or place in a ziptop plastic bag and crush with a rolling pin until finer crumbs form. Transfer to a shallow bowl. Place flour in another shallow bowl. Lightly beat eggs in a third shallow bowl to blend; season all bowls with salt and pepper. Working one at a time, dredge balls in flour, shaking off excess. Transfer to bowl with egg and turn to coat, letting excess drip back into bowl. Coat with panko, pressing gently to adhere. Transfer to a parchment-lined rimmed baking sheet. Chill balls while you heat oil.\n" +
                        "\n" +
                        "Pour oil into a medium heavy pot fitted with thermometer to a depth of 2\". Heat over medium until thermometer registers 350°. Carefully lower half of rice balls into oil with a slotted spoon or spider and fry until deeply golden brown, 6–8 minutes. Transfer to paper towels to drain; season with salt. Repeat with remaining rice balls. Serve warm with sauce alongside.");
                break;
            case 2 :
                System.out.println("INGREDIENTS\n" +
                        "Herby Panko\n" +
                        "3 Tbsp. extra-virgin olive oil\n" +
                        "½ cup panko (Japanese breadcrumbs)\n" +
                        "Kosher salt, freshly ground pepper\n" +
                        "2 Tbsp. finely chopped chives\n" +
                        "2 tsp. thyme leaves\n" +
                        "Horseradish and Beet Relish\n" +
                        "1 medium beet, preferably golden, trimmed, peeled\n" +
                        "1 small knob horseradish, peeled\n" +
                        "1 Tbsp. red wine vinegar\n" +
                        "½ tsp. honey\n" +
                        "Kosher salt, freshly ground pepper\n" +
                        "Stew and Assembly\n" +
                        "5 lb. oxtails or beef short ribs, cut into 2\" segments, patted dry\n" +
                        "Kosher salt, freshly ground pepper\n" +
                        "3 Tbsp. extra-virgin olive oil\n" +
                        "2 large leeks, white and pale green parts only, halved lengthwise, then sliced crosswise into ½\" pieces\n" +
                        "4 celery stalks, sliced ½\" thick\n" +
                        "2 heads of garlic, top third removed\n" +
                        "¼ cup tomato paste\n" +
                        "1 750-ml bottle red wine\n" +
                        "1 bunch thyme, stems tied together with kitchen twine\n" +
                        "Parsley leaves, grated Parmesan, and/or sliced jarred pepperoncini (for serving; optional)\n\n");
                System.out.println("RECIPE PREPARATION\n" +
                        "Herby Panko\n" +
                        "Heat oil in a medium skillet over medium. As soon as oil is shimmering, add panko and cook, stirring often, until golden brown, about 3 minutes. Season with salt and pepper. Remove from heat and mix in chives and thyme. Let cool.\n" +
                        "\n" +
                        "Horseradish and Beet Relish\n" +
                        "Grate beet on the large holes of a box grater into a medium bowl. Grate about 1” of horseradish on the small holes of grater into the same bowl. Add vinegar and honey and season with salt and pepper; mix well. Let sit at room temperature at least 15 minutes before serving.\n" +
                        "\n" +
                        "Do Ahead: Relish can be made 2 days ahead. Cover and chill.\n" +
                        "Stew and Assembly\n" +
                        "Season oxtails very generously all over with salt and pepper. Heat oil in a large Dutch oven or other heavy pot over medium-high. Working in 2 batches, cook oxtail in a single layer, turning once, until browned on both sides, 8–10 minutes per batch. As oxtail pieces finish cooking, transfer to a large plate.\n" +
                        "\n" +
                        "Reduce heat to medium and cook leeks, celery, and garlic, cut side down, in the same pot, stirring leeks and celery occasionally, until leeks are softened and browned in spots and garlic is golden brown, about 5 minutes. Add tomato paste and cook, stirring constantly and scraping bottom of pot, until vegetables are coated and paste is slightly darkened in color, about 3 minutes. Gradually add wine, stirring to release any bits stuck on bottom of pot, then add 6 cups water and thyme. Season generously with salt and pepper and bring to a simmer. Return oxtails to pot and bring stew back up to a simmer. Cover with a lid, leaving slightly askew so steam can escape and cook, adjusting heat to maintain a very gentle simmer and skimming foam from surface as needed, until meat is fork-tender, 3–3½ hours.\n" +
                        "\n" +
                        "Uncover and remove pot from heat. Transfer oxtails to a cutting board and let cool 15–20 minutes. Pull meat from bones and tear into bite-size pieces; discard fat, cartilage, and bones. Add meat back to pot as you go. Let stew cool uncovered until no longer steaming. Cover pot and chill stew at least 12 hours (you can skip this step, but it will dramatically improve the flavor).\n" +
                        "\n" +
                        "Uncover stew and spoon off half to three-quarters of fat on the surface; discard. Gently reheat stew until barely simmering. Pluck out and discard thyme and garlic heads (don't worry about any cloves that may have escaped into stew). Taste and season with more salt and pepper if needed. Ladle into bowls and serve with Herby Panko, Horseradish and Beet Relish, parsley, Parmesan, and/or pepperoncini as desired.\n" +
                        "\n" +
                        "Do Ahead: Stew can be made 3 days ahead. Keep chilled.");
                break;
            case 3 :
                System.out.println("INGREDIENTS\n" +
                        "Chicken Filling\n" +
                        "4 large tomatillos (or 6 medium), husks removed, rinsed\n" +
                        "3 cubanelle or banana peppers, halved, seeded, stemmed\n" +
                        "3 poblano chiles, halved, seeded, stemmed\n" +
                        "3 jalapeños, halved, seeded, stemmed\n" +
                        "¼ medium onion\n" +
                        "4 scallions, trimmed\n" +
                        "3 garlic cloves, unpeeled\n" +
                        "⅓ cup schmaltz or lard, melted, cooled\n" +
                        "3 sprigs oregano\n" +
                        "Kosher salt\n" +
                        "2 teaspoons white wine vinegar\n" +
                        "1 teaspoon ground coriander\n" +
                        "1 teaspoon ground cumin\n" +
                        "1 rotisserie chicken, skin removed, meat coarsely chopped\n" +
                        "If Using Instant Dry Masa\n" +
                        "3¾ cups instant corn masa flour (such as Maseca Tamal Instant Corn Masa Mix)\n" +
                        "2 cups homemade chicken stock or low-sodium chicken broth\n" +
                        "1¼ cups plus 2 tablespoons lard, melted, plus more if needed\n" +
                        "1 tablespoon kosher salt\n" +
                        "1½ teaspoons baking powder\n" +
                        "If Using Fresh Masa\n" +
                        "3 pounds unprepared fresh corn masa for tamales\n" +
                        "1¼ cups plus 2 tablespoons lard, melted, plus more if needed\n" +
                        "¼ cup homemade chicken stock or low-sodium chicken broth\n" +
                        "1 tablespoon kosher salt\n" +
                        "Assembly\n" +
                        "30 corn husks (from a 1-pound bag)\n" +
                        "3 cups homemade chicken stock or low-sodium chicken broth, plus more\n" +
                        "Fresh salsa and lime wedges (for serving)\n\n");
                System.out.println("RECIPE PREPARATION\n" +
                        "Chicken Filling\n" +
                        "Preheat oven to 425°. Toss tomatillos, peppers, chiles, jalapeños, onion, scallions, garlic, schmaltz, and oregano in a large bowl; season with salt. Spread on a rimmed baking sheet and roast until vegetables are soft and browned, 35–40 minutes. Let cool slightly. Peel garlic cloves. Strip oregano leaves from sprigs; discard sprigs.\n" +
                        "\n" +
                        "Transfer tomatillo mixture along with any accumulated juices on baking sheet, garlic, oregano leaves, vinegar, coriander, and cumin to a blender and purée until smooth; season with salt. Transfer 1¾ cups tomatillo purée to a large bowl. Add chicken and toss to coat; season with salt. It should resemble a slightly overdressed chicken salad; add more tomatillo purée if needed (reserve ¼ cup purée for masa). Transfer to an airtight container and chill until chicken is cold and firm, at least 3 hours.\n" +
                        "\n" +
                        "Do Ahead: Filling can be made 3 days ahead. Keep chilled.\n" +
                        "For Instant Dry Masa\n" +
                        "Mix corn masa flour, stock, lard, salt, baking powder, and ¼ cup reserved tomatillo purée in a large bowl with your hands until dough comes together. Continue to knead until mixture looks smooth and shiny, about 4 minutes.\n" +
                        "\n" +
                        "Slap top of masa with the palm of your hand, immediately pulling your hand back; if dough sticks to your hand, add 2 Tbsp. more lard and knead to incorporate. Repeat slap test. If masa doesn’t stick and your hand looks shiny, dough is ready. If masa sticks, continue adding lard 2 Tbsp. at a time and repeat slap test. Let dough sit 30 minutes, uncovered, until the consistency of peanut butter; it will thicken as it sits.\n" +
                        "\n" +
                        "For Fresh Masa\n" +
                        "Mix corn masa, lard, stock, salt, and ¼ cup reserved tomatillo mixture in a large bowl with your hands until incorporated and mixture looks smooth and shiny, about 4 minutes.\n" +
                        "\n" +
                        "Slap top of masa with the palm of your hand, immediately pulling your hand back; if dough sticks to your hand, add 2 Tbsp. more lard and knead to incorporate. Repeat slap test. If masa doesn’t stick and your hand looks shiny, dough is ready. If masa sticks, continue adding lard 2 Tbsp. at a time and repeat slap test.\n" +
                        "\n" +
                        "Assembly\n" +
                        "Soak husks in a large bowl of hot water until soft and pliable, about 15 minutes. Using your hands, swirl husks in water to loosen any silk and dirt clinging to surface. Drain, rinse, and shake off excess water.\n" +
                        "\n" +
                        "Working one at a time, place husk on a clean work surface and gently stretch out wide end. Measure 5\" wide, then tear off any excess (hold onto the scraps; you’ll use them later). The width doesn’t have to be exactly 5\", but if you go narrower than that, your tamale might be too small to cover the filling. This recipe makes about 30 tamales, but you may want to have extra husks prepared in case a few tear.\n" +
                        "\n" +
                        "Arrange husk so wide end is closet to you. Spoon 2 heaping Tbsp. masa (or use a 1⅓-oz. ice cream scoop) about 4\" from the bottom. Using a butter knife, small offset spatula, or putty knife, spread masa in a thin, even layer, covering width of husk and going about 5\" up the sides, leaving narrow end uncovered. If you mess up, just scrape masa off husk and start over (no one will ever know!). Repeat with remaining masa and husks.\n" +
                        "Keeping wide end closest to you, place 2 Tbsp. cold chicken filling in the center of masa, forming a log that runs down the center. Fold 1 side of husk over filling, then fold other side over to cover. Holding tamale seam side up, fold narrow, pointed end of husk away from you and tuck under tamale. Transfer to a rimmed baking sheet. Repeat with remaining tamales.\n" +
                        "\n" +
                        "Line bottom of a large heavy pot with husk scraps. Crumple a large sheet of foil to form a 3\"-diameter ball. Place ball in pot. Using ball as support, prop tamales upright, with folded end down and seam side facing out, until ball is surrounded (this will take 4–6 tamales). Continue stacking tamales around the center, leaning them against one another. Pour 3 cups broth into pot, being careful not to get any inside tamales (broth will come about ¾\" up sides of tamales).\n" +
                        "\n" +
                        "Bring liquid to a boil over high heat, then reduce heat to medium-low. Cover pot and simmer tamales, undisturbed, adding more broth as needed to keep some liquid in the pot, 40 minutes. Remove 1 tamale and let cool about 3 minutes. (If you don’t let the tamale rest before checking, the masa is guaranteed to stick to the husk and appear gummy, so you really have to wait.) Remove husk; if masa sticks to husk, it’s not ready. Carefully re-fold and return to pot. Cook 5 minutes, then check again. If husk is easily removed, your tamales are fully cooked! Remove from heat and let sit, uncovered, 10 minutes. Serve with salsa and a squeeze of lime.");
                break;
            case 4 :
                System.out.println("INGREDIENTS\n" +
                        "2 5–5½-lb. ducks\n" +
                        "Kosher salt\n" +
                        "2 Tbsp. allspice berries\n" +
                        "2 whole nutmegs\n" +
                        "16 habanero chiles, stems removed\n" +
                        "1 cup soy sauce\n" +
                        "½ cup spiced rum\n" +
                        "½ cup unseasoned rice vinegar\n" +
                        "4 tsp. sugar\n" +
                        "2 2\" pieces ginger, scrubbed, crushed\n" +
                        "Hoisin sauce, small flour tortillas, sliced Napa cabbage, sliced scallions, julienned peeled ginger, sliced serrano chiles, mint sprigs, cilantro sprigs, and lime wedges (for serving)\n" +
                        "Special Equipment\n" +
                        "A razor blade and a spice mill or mortar and pestle\n\n");
                System.out.println("RECIPE PREPARATION\n" +
                        "Lightly score skin of both ducks using a clean razor blade, cutting most of the way through skin and fat but not into flesh below (a very sharp, thin knife will also work). Season ducks generously with salt and place each one in a large resealable plastic bag.\n" +
                        "\n" +
                        "Finely grind allspice in spice mill or with mortar and pestle and place in a blender. Finely grate nutmeg into blender. Add habanero chiles (we recommend keeping the seeds in as the ducks’ fat will keep it from absorbing too much heat), soy sauce, rum, vinegar, and sugar. Purée until smooth. Divide marinade between bags; add a piece of ginger to each. Seal bags, pressing out air, and work marinade around to coat ducks. Chill, breast side down, 12 hours.\n" +
                        "\n" +
                        "Preheat oven to 450°. Remove ducks from marinade and place, breast side up, on a wire rack set inside a foil-lined rimmed baking sheet (don’t worry about any marinade that may be inside ducks; it will add flavor as they cook). Roast ducks just until beginning to brown, 10–12 minutes. Reduce oven temperature to 250° and continue to roast until ducks are very dark brown, leg joints wiggle freely when flexed, and an instant-read thermometer inserted into the thickest part of breasts registers 195°, 4½–5 hours. Let rest 30 minutes before shredding.\n" +
                        "\n" +
                        "To serve, pile meat on hoisin-slicked tortillas and top with cabbage, scallions, ginger, serrano chiles, mint, and cilantro as desired; squeeze lime wedges over.");
                break;
            case 5 :
                System.out.println("INGREDIENTS\n" +
                        "Filling and Sauce\n" +
                        "1 1–1¼-pound lamb shank\n" +
                        "Kosher salt, freshly ground black pepper\n" +
                        "2 tablespoons canola oil\n" +
                        "3 medium shallots, chopped (about 1½ cups)\n" +
                        "4 large garlic cloves, crushed\n" +
                        "2 tablespoons tomato paste\n" +
                        "1 cup red wine\n" +
                        "4 cups low-sodium chicken stock or broth\n" +
                        "2 bay leaves\n" +
                        "7 sprigs thyme, divided\n" +
                        "3 tablespoons olive oil\n" +
                        "2 medium onions, thinly sliced\n" +
                        "3 ounces Parmesan, coarsely grated (about ¾ cup)\n" +
                        "1 14.5-ounce can whole peeled tomatoes\n" +
                        "¼ cup (½ stick) unsalted butter\n" +
                        "½ teaspoon red wine vinegar\n" +
                        "Assembly\n" +
                        "Cornmeal or semolina flour (for dusting)\n" +
                        "Fresh Pasta Dough\n" +
                        "1 large egg, beaten to blend\n" +
                        "Kosher salt\n" +
                        "Coarsely grated Parmesan and thyme leaves (for serving)\n\n");
                System.out.println("RECIPE PREPARATION\n" +
                        "Filling and Sauce\n" +
                        "Preheat oven to 350°. Season lamb with salt and pepper. Heat canola oil in a medium ovenproof pot over medium-high. Cook lamb, turning occasionally, until evenly browned, 10–12 minutes. Transfer to a plate.\n" +
                        "\n" +
                        "Reduce heat to medium-low and cook shallots and garlic until shallots are softened and edges of garlic are golden brown, 3–4 minutes. Add tomato paste and cook until heated through and darkened in color, about 2 minutes. Add wine, scraping up browned bits, and bring to a simmer. Add stock, bay leaves, 2 thyme sprigs, and reserved lamb shank; return to a simmer. Cover, transfer to oven, and braise, turning lamb occasionally, until meat is falling off the bone, 2½–3 hours.\n" +
                        "\n" +
                        "Meanwhile, tie remaining 5 thyme sprigs into a bundle with twine. Heat olive oil in a large skillet over medium. Add onions and thyme bundle; season with salt. Cook, stirring frequently, until onions are deep golden brown, 25–30 minutes. Remove thyme bundle and discard. Finely chop onion; set aside.\n" +
                        "\n" +
                        "Transfer lamb to a cutting board and let cool. Strain braising liquid through a fine-mesh sieve into a small bowl or measuring cup (you should have about ¼ cup). Discard thyme and bay leaves; separately reserve liquid and solids. Wipe out pot.\n" +
                        "\n" +
                        "Pull off meat from shank and finely chop; transfer to a medium bowl; discard any silver skin and excess fat. Add caramelized onions, cheese, 4 Tbsp. braising liquid, and half of the braising solids. Stir to combine; taste and adjust seasoning with salt and pepper.\n" +
                        "\n" +
                        "Crush tomatoes with your hands or the back of a fork in reserved pot. Add remaining braising liquid and solids and cook over medium heat, stirring occasionally, until reduced by half and sauce is thickened and slightly chunky, 25–35 minutes. Stir in butter and vinegar; season with salt and pepper.\n" +
                        "\n" +
                        "Assembly\n" +
                        "Dust a large rimmed baking sheet with cornmeal. Set pasta maker to thickest setting; dust lightly with cornmeal. Divide dough into 4 pieces. Working with 1 piece at a time and keeping remaining dough wrapped in plastic as you work, flatten dough into a narrow rectangle (no wider than mouth of machine); pass through rollers. Fold dough as needed to fit and roll again. Repeat without folding, adjusting machine to thinner settings after every pass and dusting with cornmeal if sticky, until pasta is 1/16\" thick (setting 8 on most machines). (Alternatively, you can roll out sheets lengthwise with a rolling pin until 1/16\" thick.)\n" +
                        "\n" +
                        "Lightly dust work surface with cornmeal. Cut sheet of dough in half crosswise. Starting 1\" from the short edge, spoon lamb mixture, 1 Tbsp. at a time, down length, spacing about 1\" apart (you should get 5 mounds). Brush dough and top of filling with egg wash. Top with second length of dough; press around each mound to seal, then press outward toward edges, pushing out any air pockets.\n" +
                        "\n" +
                        "Using a sharp knife or pizza cutter, cut each ravioli into a 2\" square. Arrange on prepared sheet, dust with cornmeal, and cover loosely with plastic wrap. Repeat with remaining dough and filling.\n" +
                        "\n" +
                        "Working in batches if needed, cook ravioli in a large pot of boiling salted water until tender, about 5 minutes. Drain.\n" +
                        "\n" +
                        "Divide ravioli among plates; cover with tomato sauce. Top with cheese and thyme.\n" +
                        "\n" +
                        "Do Ahead: Assembled ravioli can be made 3 hours ahead; cover and chill.");
                break;
            case 6 :
                System.out.println("INGREDIENTS\n" +
                        "Ragù Bolognese\n" +
                        "2 lb. ground pork\n" +
                        "1 lb. ground beef chuck (20% fat)\n" +
                        "Kosher salt, freshly ground pepper\n" +
                        "2 Tbsp. extra-virgin olive oil\n" +
                        "2 oz. pancetta or slab bacon, chopped\n" +
                        "1 medium onion, finely chopped\n" +
                        "1 celery stalk, finely chopped\n" +
                        "1 medium carrot, peeled, finely chopped\n" +
                        "6 garlic cloves, sliced\n" +
                        "2 Tbsp. tomato paste\n" +
                        "¾ cup dry white wine\n" +
                        "1 28-oz. can whole peeled tomatoes\n" +
                        "1 cup low-sodium chicken broth\n" +
                        "1 cup whole milk\n" +
                        "Béchamel\n" +
                        "7 Tbsp. unsalted butter\n" +
                        "¼ cup plus 3 Tbsp. all-purpose flour\n" +
                        "6 cups whole milk\n" +
                        "4 oz. Parmesan, coarsely grated (about 1 cup)\n" +
                        "Pinch of cayenne pepper\n" +
                        "Pinch of ground nutmeg\n" +
                        "Kosher salt, freshly ground pepper\n" +
                        "Assembly\n" +
                        "1¼ lb. dried lasagna noodles (we like De Cecco since they are wide and short)\n" +
                        "Kosher salt\n" +
                        "Extra-virgin olive oil (for greasing)\n\n");
                System.out.println("RECIPE PREPARATION\n" +
                        "Ragù Bolognese\n" +
                        "Preheat oven to 225°. Mix pork and beef with your hands in a large bowl; season generously with salt and pepper, then mix again. Form into about 18 large meatballs (they don’t need to be perfect—you’ll be mashing them later).\n" +
                        "\n" +
                        "Heat oil in a large Dutch oven over medium-high. Working in 2 batches, cook meatballs, turning occasionally and reducing heat if bottom of pot looks in danger of scorching, until browned all over, about 6 minutes per batch. Transfer to a rimmed baking sheet as they’re done.\n" +
                        "\n" +
                        "Reduce heat to medium. Add pancetta and cook, stirring often, until lightly browned and beginning to crisp, about 5 minutes. Add onion, celery, carrot, and garlic and cook, stirring occasionally, until softened, 6–8 minutes. Add tomato paste and cook, stirring constantly, until paste darkens, about 2 minutes. Add wine and cook, stirring occasionally, until nearly completely evaporated, 4–5 minutes. Add tomatoes, crushing with your hands, and increase heat to medium-high. Cook, stirring occasionally, until liquid is jammy and reduced by about half, 8–10 minutes. Add broth and milk and return meat to pot. Bring to a simmer. Cover pot, leaving lid slightly ajar, and transfer to oven. Bake sauce (no need to stir, but check after 1–2 hours to ensure liquid is at a low simmer, adjusting oven temperature as needed) until meatballs are falling-apart tender, 3–4 hours.\n" +
                        "\n" +
                        "Using a potato masher, break meatballs apart and incorporate into liquid (you should have about 8 cups ragù); season with salt and pepper. Reduce over medium-low heat if needed to thicken.\n" +
                        "\n" +
                        "Do Ahead: Sauce can be made 4 days ahead; let cool, then cover and chill, or freeze up to 3 months.\n" +
                        "Béchamel\n" +
                        "Melt butter in a large saucepan over medium heat. Whisk in flour and cook, whisking occasionally, until flour begins to smell a bit nutty, about 4 minutes. Quickly whisk in milk and increase heat to medium-high. Bring to a simmer and cook, whisking occasionally, until béchamel thickens, about 4 minutes. Reduce heat to medium-low and cook, whisking occasionally, until smooth and velvety, about 10 minutes. Remove from heat and whisk in Parmesan, cayenne, and nutmeg (you should have about 6 cups); season with salt and pepper. Transfer to a large bowl, cover with plastic wrap, and use within 1 hour or chill.\n" +
                        "\n" +
                        "Do Ahead: Béchamel can be made 1 day ahead. Keep chilled. Rewarm just enough to loosen before using.\n" +
                        "Assembly\n" +
                        "Preheat oven to 325°. Cook noodles in a large pot of boiling salted water, stirring occasionally and separating noodles so they don’t stick to each other, until just starting to soften but still snap in half rather than bend when folded; 3 minutes is the magic number. They will be so firm it will just seem all wrong, but this is what separates al dente lasagna layers from gummy ones. Transfer noodles to a large bowl of cold water to cool. Drain and lie flat in a single layer on a rimmed baking sheet, separated by parchment or wax paper.\n" +
                        "\n" +
                        "Lightly oil a 13x9\" glass or ceramic baking dish. Spread 1½ cups ragù in dish. Lay a single layer of noodles over ragù (you will need to cut some noodles in half in order to fill all gaps). Spoon 1¼ cups béchamel over noodles, spreading in an even layer with a small offset spatula. Top béchamel with 1½ cups ragù. Repeat, creating 5 layers of pasta (or 6, depending on how deep your pan is) and ending with remaining 1 cup béchamel. It should come right to the top edge of the dish, and the top layer of pasta will get super crunchy when baked.\n" +
                        "\n" +
                        "Cover with a lightly oiled piece of foil and set on a rimmed baking sheet (just to catch drips). Bake lasagna until bubbling gently around the edges, about 1 hour. Remove from oven and increase oven temperature to 425°; carefully place rack in top of oven. Uncover and continue to bake until top is browned and crisp around the edges, 10–15 minutes.\n" +
                        "\n" +
                        "Let sit 10 minutes before serving.\n" +
                        "\n");
                break;
            case 7 :
                System.out.println("INGREDIENTS\n" +
                        "Duck Confit\n" +
                        "6 duck legs\n" +
                        "6 Tbsp. Diamond Crystal or 3 Tbsp. plus 2½ tsp. Morton kosher salt\n" +
                        "4 sprigs thyme\n" +
                        "4 garlic cloves, smashed\n" +
                        "2 tsp. black peppercorns\n" +
                        "1 tsp. juniper berries (optional)\n" +
                        "Beans\n" +
                        "2 whole cloves\n" +
                        "1 large onion, peeled, halved through root end\n" +
                        "1½ lb. dried Tarbais, corona, or cannellini beans, soaked overnight, drained\n" +
                        "8 oz. pancetta (leave in 1 thick piece)\n" +
                        "2 carrots, scrubbed, halved crosswise if large\n" +
                        "1 head of garlic, halved crosswise\n" +
                        "4 sprigs thyme\n" +
                        "1 bay leaf\n" +
                        "Freshly ground black pepper\n" +
                        "Kosher salt\n" +
                        "Pork Ragù\n" +
                        "1½ lb. skinless, boneless pork shoulder (Boston butt), cut into 1\" pieces\n" +
                        "1½ tsp. Diamond Crystal or 1 tsp. Morton kosher salt, plus more\n" +
                        "Freshly ground black pepper\n" +
                        "2 Tbsp. vegetable oil\n" +
                        "1 large carrot, peeled, chopped\n" +
                        "1 large carrot, peeled, chopped\n" +
                        "4 garlic cloves, finely chopped\n" +
                        "4 sprigs thyme\n" +
                        "1 bay leaf\n" +
                        "1 14.5-oz. can crushed tomatoes\n" +
                        "6 cups chicken stock or low-sodium chicken broth\n" +
                        "Assembly\n" +
                        "Kosher salt, freshly ground pepper\n" +
                        "1 lb. fresh pork sausage (such as Toulouse, sweet Italian, or unsmoked kielbasa)\n" +
                        "3 cups medium-fine fresh breadcrumbs, divided\n" +
                        "¼ cup finely chopped parsley\n" +
                        "1 garlic clove, halved lengthwise\n" +
                        "1 lb. precooked garlic sausage, sliced crosswise ¼\" thick (optional)\n\n");
                System.out.println("RECIPE PREPARATION\n" +
                        "Two Days Ahead\n" +
                        "Cure Duck Legs\n" +
                        "\n" +
                        "Prick skin on duck legs all over with the tip of a paring knife. Rub legs with salt, making sure to massage into flesh and skin.\n" +
                        "\n" +
                        "Place legs in a large bowl and cover with plastic wrap, pressing directly onto legs. Rest a plate on top of legs and weigh down with several 28-oz. cans. Chill at least 12 hours and up to 1 day.\n" +
                        "\n" +
                        "Note: If you’re going to cook the beans and ragout and combine tomorrow, soak the beans tonight. If not, just remember to soak them the day before you want to cook them.\n" +
                        "One Day Ahead\n" +
                        "Confit Duck Legs\n" +
                        "\n" +
                        "Preheat oven to 250°. Evenly scatter thyme, garlic, peppercorns, and juniper berries (if using) across a large baking dish or roasting pan and add 2 Tbsp. water.\n" +
                        "\n" +
                        "Remove duck legs from bowl. Rinse off salt and arrange legs, skin side down, over aromatics in baking dish. Cover dish tightly with foil and weigh down with a cast-iron skillet or a heavy baking dish. Bake until fat renders out of duck and legs are submerged, about 2 hours.\n" +
                        "\n" +
                        "Carefully remove baking dish from oven and remove skillet and foil. Turn legs skin side up and nestle back into fat. Cover dish again with foil and continue to cook legs, unweighted, until duck meat is very tender and bones wiggle easily in joints, 2–2½ hours longer.");
                break;
            case 8 :
                System.out.println("INGREDIENTS\n" +
                        "Eggplant and Lamb\n" +
                        "8 garlic cloves, finely grated, divided\n" +
                        "½ cup plus 2 tablespoons extra-virgin olive oil\n" +
                        "2 tablespoons chopped mint, divided\n" +
                        "2 tablespoons chopped oregano, divided\n" +
                        "3 medium eggplants (about 3½ pounds total), sliced crosswise into ½-inch-thick rounds\n" +
                        "2½ teaspoons kosher salt, plus more\n" +
                        "½ teaspoon freshly ground black pepper, plus more\n" +
                        "2 pounds ground lamb\n" +
                        "2 medium onions, chopped\n" +
                        "1 3-inch cinnamon stick\n" +
                        "2 Fresno chiles, finely chopped\n" +
                        "1 tablespoon paprika\n" +
                        "1 tablespoon tomato paste\n" +
                        "¾ cup dry white wine\n" +
                        "1 28-ounce can whole peeled tomatoes\n" +
                        "Béchamel and Assembly\n" +
                        "6 tablespoons unsalted butter\n" +
                        "½ cup all-purpose flour\n" +
                        "2½ cups whole milk, warmed\n" +
                        "¾ teaspoon kosher salt\n" +
                        "4 ounces farmer cheese, crumbled (about 1 cup)\n" +
                        "2 ounces Pecorino or Parmesan, finely grated (about 1¾ cups), divided\n" +
                        "3 large egg yolks, beaten to blend\n\n");
                System.out.println("RECIPE PREPARATION\n" +
                        "Eggplant and Lamb\n" +
                        "Place a rack in middle of oven; preheat to 475°. Whisk half of the garlic, ½ cup oil, 1 Tbsp. mint, and 1 Tbsp. oregano in a small bowl. Brush both sides of eggplant rounds with herb oil, making sure to get all the herbs and garlic onto eggplant; season with salt and pepper. Transfer eggplant to a rimmed baking sheet (it’s okay to pile the rounds on top of each other) and roast until tender and browned, 35–45 minutes. Reduce oven temperature to 400°.\n" +
                        "\n" +
                        "Meanwhile, heat remaining 2 Tbsp. oil in a large wide pot over high. Cook lamb, breaking up with a spoon, until browned on all sides and cooked through and liquid from meat is evaporated (there will be a lot of rendered fat), 12–16 minutes. Strain fat through a fine-mesh sieve into a clean small bowl and transfer lamb to a medium bowl. Reserve 3 Tbsp. lamb fat; discard remaining fat.\n" +
                        "\n" +
                        "Heat 2 Tbsp. lamb fat in same pot over medium-high (reserve remaining 1 Tbsp. lamb fat for assembling the moussaka). Add onion, cinnamon, 2½ tsp. salt, and ½ tsp. pepper and cook, stirring occasionally, until onion is tender and translucent, 8–10 minutes. Add chiles and remaining garlic and cook, scraping up any browned bits from the bottom of the pot, until onion is golden brown, about 5 minutes. Add paprika and tomato paste and cook until brick red in color, about 1 minute. Add wine and cook, stirring occasionally, until slightly reduced and no longer smells of alcohol, about 3 minutes. Add tomatoes and break up with a wooden spoon into small pieces (the seeds will shoot out at you if you’re too aggressive, so start slowly—puncture the tomato, then get your smash and break on!). Add lamb and remaining 1 Tbsp. mint and 1 Tbsp. oregano and cook, stirring occasionally, until most of the liquid is evaporated and mixture looks like a thick meat sauce, 5–7 minutes. Pluck out and discard cinnamon stick.\n" +
                        "\n" +
                        "Béchamel and Assembly\n" +
                        "Heat butter in a medium saucepan over medium until foaming. Add flour and cook, whisking constantly, until combined, about 1 minute. Whisk in warm milk and bring sauce to a boil. Cook béchamel, whisking often, until very thick (it should have the consistency of pudding), about 5 minutes; stir in salt. Remove from heat and whisk in farmer cheese and half of the Pecorino. Let sit 10 minutes for cheese to melt, then add egg yolks and vigorously whisk until combined and béchamel is golden yellow.\n" +
                        "\n" +
                        "Brush a 13x9\" baking pan with remaining 1 Tbsp. lamb fat. Layer half of eggplant in pan, covering the bottom entirely. Spread half of lamb mixture over eggplant in an even layer. Repeat with remaining eggplant and lamb to make another layer of each. Top with béchamel and smooth surface; sprinkle with remaining Pecorino.\n" +
                        "\n" +
                        "Bake moussaka until bubbling vigorously and béchamel is browned in spots, 30–45 minutes. Let cool 30 minutes before serving.\n" +
                        "\n" +
                        "Do Ahead: Moussaka can be baked 1 day ahead. Let cool, then cover and chill, or freeze up to 3 months. Thaw before reheating in a 250° oven until warmed through, about 1 hour.");
                break;
            case 9 :
                System.out.println("INGREDIENTS\n" +
                        "Chicken\n" +
                        "9.5 ounces kosher salt (1 cup Morton or 1⅔ cups Diamond Crystal)\n" +
                        "⅓ cup (packed) light brown sugar\n" +
                        "¾ cup hot sauce (preferably Crystal)\n" +
                        "2 3½–4-pound chickens, cut into 8 pieces (legs and thighs separated, breasts halved), backbone and wing tips removed\n" +
                        "4 cups all-purpose flour\n" +
                        "6 tablespoons Old Bay seasoning\n" +
                        "3 cups buttermilk\n" +
                        "Glaze and Assembly\n" +
                        "¾ cup lard\n" +
                        "1 tablespoon Old Bay seasoning\n" +
                        "2 teaspoons paprika\n" +
                        "1½ teaspoons cayenne pepper\n" +
                        "Vegetable oil (for frying; about 4 quarts)\n" +
                        "Special Equipment\n" +
                        "A deep-fry thermometer\n\n");
                System.out.println("RECIPE PREPARATION\n" +
                        "Chicken\n" +
                        "Heat salt, brown sugar, and 4 cups water in a large pot over medium, whisking, until salt and sugar dissolve, about 5 minutes. Remove from heat and stir in hot sauce and 8 cups ice water. Add chicken to brine, cover, and chill 4 hours.\n" +
                        "\n" +
                        "Combine 2 cups flour and 3 Tbsp. Old Bay seasoning in a shallow baking dish and toss with your fingers to evenly distribute seasoning. Place buttermilk in a medium bowl. Remove chicken from brine and pat dry with paper towels.\n" +
                        "\n" +
                        "Working one at a time, dip 8 pieces of chicken in buttermilk, allowing excess to drip off, then coat in flour mixture, packing all around chicken and pressing firmly into cracks and crevices; shake off excess. Place chicken on a wire rack set inside a rimmed baking sheet. Discard flour mixture, which will be wet at this point, and repeat process with remaining flour, Old Bay, buttermilk, and chicken; place on another wire rack set inside a rimmed baking sheet. Chill, uncovered, 12–24 hours.\n" +
                        "\n" +
                        "Glaze and Assembly\n" +
                        "Let chicken stand at room temperature 30 minutes.\n" +
                        "\n" +
                        "Heat lard, Old Bay, paprika, and cayenne in a small saucepan over low, stirring, until lard is melted, about 3 minutes. Set glaze aside.\n" +
                        "\n" +
                        "Pour oil into a large pot fitted with deep-fry thermometer to come halfway up the sides. Heat over medium-high until thermometer registers 325°. Working in 4 batches, fry chicken, turning often with tongs and adjusting heat to maintain temperature, until skin is deep golden brown and an instant-read thermometer inserted into the thickest part of chicken registers 165° for dark meat and 160° for white meat, 10–12 minutes per batch. Transfer chicken back to wire racks and let rest 5 minutes. Brush lightly with glaze (reheat glaze, if needed) and let cool. Store on racks at room temperature up to 3 hours ahead.");
                break;
            case 10:
                System.out.println("INGREDIENTS\n" +
                        "Crepe Batter\n" +
                        "6 large eggs\n" +
                        "1¼ cups all-purpose flour\n" +
                        "½ teaspoon kosher salt\n" +
                        "Nonstick vegetable oil spray\n" +
                        "Filling and Assembly\n" +
                        "2 large egg yolks, beaten to blend\n" +
                        "1½ pounds ricotta\n" +
                        "8 ounces mozzarella, grated\n" +
                        "1 ounce Parmesan, grated, plus more for serving\n" +
                        "Kosher salt, freshly ground pepper\n" +
                        "2 10-ounce frozen chopped spinach, thawed, drained (optional)\n" +
                        "3 cups marinara sauce, preferably homemade, divided\n\n");
                System.out.println("RECIPE PREPARATION\n" +
                        "Crepe Batter\n" +
                        "Using an electric mixer on high speed, beat eggs in a large bowl until light, airy, pale in color, and can nearly hold peaks, 6–8 minutes.\n" +
                        "\n" +
                        "Reduce mixer speed to low. Gradually add flour and salt, beating well between additions, until no clumps of flour remain. With mixer speed on low, slowly pour in 1½ cups water and continue to beat until well incorporated. Cover and let dough rest at least 2 hours (this gives the flour time to hydrate and results in a smoother finished texture).\n" +
                        "\n" +
                        "Heat a small nonstick skillet over medium and spray with nonstick spray. Pour 2 Tbsp. batter into skillet and cook, swirling skillet constantly to encourage crepe to form a nice, round shape, until set, 15–20 seconds. Tap out crepe onto a clean towel; gently flatten any creases. Repeat with remaining batter; if possible, do not to stack crepes.\n" +
                        "\n" +
                        "Do Ahead: Dough can be made 1 day ahead; keep covered and chill.\n" +
                        "Filling and Assembly\n" +
                        "Preheat oven to 350°. Mix egg yolks, ricotta, mozzarella, and Parmesan in a large bowl; season with salt and pepper. Squeeze out excess liquid from spinach, if using, and add to egg mixture; toss to coat.\n" +
                        "\n" +
                        "Spread 1 cup sauce in a 13x9\" baking pan. Working one at a time, spoon 2 Tbsp. filling in center of crepe. Spread filling all the way to the ends. Roll up crepe, then flatten slightly with your hands. Transfer seam side down to prepared dish. Working in batches if needed, repeat with remaining crepes and filling, leaving a small gap in between each. Top with sauce and cover with foil. Bake manicotti until cheese is melted and sauce is bubbling, 35–45 minutes. Let manicotti cool slightly in pan to set, about 15 minutes. Top with Parmesan and pepper before serving.\n" +
                        "\n" +
                        "Do Ahead: Filling can be made 1 day ahead; cover and chill. Manicotti can be made 1 month ahead; transfer to airtight containers or freezer bags and freeze.");
                break;
            case 11:
                System.out.println("INGREDIENTS\n" +
                        "1 envelope active dry yeast (about 2¼ tsp.)\n" +
                        "2 Tbsp. plus ½ cup extra-virgin olive oil, plus more for bowl\n" +
                        "2 tsp. kosher salt\n" +
                        "4 cups all-purpose flour, divided, plus more for surface\n\n");
                System.out.println("RECIPE PREPARATION\n" +
                        "Stir together yeast and 1¾ cups warm water (105–110°) in the bowl of a stand mixer; let stand until yeast starts to foam, about 10 minutes.\n" +
                        "\n" +
                        "Mix in 2 Tbsp. oil, then salt and 2 cups flour. Attach dough hook and mix until just combined. Scrape down sides of bowl. Add another 2 cups flour, a cup at a time, mixing until incorporated and a shaggy dough forms, about 3 minutes.\n" +
                        "\n" +
                        "Increase speed to medium and mix until dough is soft and elastic and starts to pull away from sides of bowl, 5–6 minutes. It will still be somewhat sticky. Place dough in a lightly oiled bowl and cover with plastic wrap. Chill 24 hours.\n" +
                        "\n" +
                        "Coat an 18x13\" rimmed baking sheet with remaining ½ cup oil. Turn out dough onto a rimmed baking sheet and let sit 10 minutes to take off the chill. Gently and gradually stretch dough until it reaches edges and all 4 corners of baking sheet. (If dough springs back or is stiff to work with, let it rest a few minutes before continuing. You may need to let it rest more than once.)\n" +
                        "\n" +
                        "Cover dough on baking sheet tightly with plastic wrap and let sit in a warm place (but not too warm!—about 70° is ideal for yeast to grow) until it is puffed and full of air bubbles, 30–40 minutes.");
                break;
            case 12:
                System.out.println("INGREDIENTS\n" +
                        "6 garlic cloves, finely grated\n" +
                        "4 tsp. finely grated peeled ginger\n" +
                        "4 tsp. ground turmeric\n" +
                        "2 tsp. garam masala\n" +
                        "2 tsp. ground coriander\n" +
                        "2 tsp. ground cumin\n" +
                        "1½ cups whole-milk yogurt (not Greek)\n" +
                        "1 Tbsp. kosher salt\n" +
                        "2 lb. skinless, boneless chicken breasts, halved lengthwise\n" +
                        "3 Tbsp. ghee (clarified butter) or vegetable oil\n" +
                        "1 small onion, thinly sliced\n" +
                        "¼ cup tomato paste\n" +
                        "6 cardamom pods, crushed\n" +
                        "2 dried chiles de árbol or ½ tsp. crushed red pepper flakes\n" +
                        "1 28-oz. can whole peeled tomatoes, like San Marzano\n" +
                        "2 cups heavy cream\n" +
                        "¾ cup chopped cilantro, plus sprigs for garnish\n" +
                        "Steamed basmati rice (for serving)\n\n");
                System.out.println("RECIPE PREPARATION\n" +
                        "Combine garlic, ginger, turmeric, garam masala, coriander, and cumin in a small bowl. Whisk yogurt, salt, and half of spice mixture in a medium bowl; add chicken and turn to coat. Cover and chill 4-6 hours. Cover and chill remaining spice mixture.\n" +
                        "\n" +
                        "Heat ghee in a large heavy pot over medium heat. Add onion, tomato paste, cardamom, and chiles and cook, stirring often, until tomato paste has darkened and onion is soft, about 5 minutes. Add remaining half of spice mixture and cook, stirring often, until bottom of pot begins to brown, about 4 minutes.\n" +
                        "\n" +
                        "Add tomatoes with juices, crushing them with your hands as you add them. Bring to a boil, reduce heat, and simmer, stirring often and scraping up browned bits from bottom of pot, until sauce thickens, 8-10 minutes.\n" +
                        "\n" +
                        "Add cream and chopped cilantro. Simmer, stirring occasionally, until sauce thickens, 30-40 minutes.\n" +
                        "\n" +
                        "Meanwhile, preheat broiler. Line a rimmed baking sheet with foil and set a wire rack inside sheet. Arrange chicken on rack in a single layer. Broil until chicken starts to blacken in spots (it will not be cooked through), about 10 minutes.\n" +
                        "\n" +
                        "Cut chicken into bite-size pieces, add to sauce, and simmer, stirring occasionally, until chicken is cooked through, 8-10 minutes. Serve with rice and cilantro sprigs.");
                break;


            default: System.out.println("You didn't choose a number of recipe."); break;

        }
    }

}
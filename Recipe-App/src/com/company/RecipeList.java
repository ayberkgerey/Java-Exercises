package com.company;

import java.util.Scanner;

public class RecipeList {

    public static int recipeLevel;

    public RecipeList() {
        // User has to enter a recipe level *Beginner *Intermediate *Advanced
        Scanner Scan = new Scanner(System.in);

        System.out.println("Enter a Recipe Level : ");
        System.out.println("1)Beginner 2)Intermediate 3)Advanced");
        recipeLevels(); // recipe List has shown until here.
    }

    //It will control the recipe level's numbers which is between 1 and 3
    //And it will show the recipe List inside the cases.

    private void recipeLevels()
    {
        Scanner Scan = new Scanner(System.in);
        recipeLevel = Scan.nextInt();

        switch (recipeLevel)
        {
            case 1:System.out.println("\n\n\n\t\t\tBeginner Recipes\n");
            beginnerList();
            break;
            case 2:System.out.println("\n\n\n\t\t\tIntermediate Recipes\n");
            intermediateList();
            break;
            case 3:System.out.println("\n\n\n\t\t\tAdvanced Recipes\n");
            advancedList();
            break;

            default:System.out.println("You must enter a number between 1 and 3"); recipeLevels(); break;
        }
    }

    private void beginnerList()
    {
        System.out.println(
                "1) Pomodoro Fresco(Pasta)\n" +
                "2) Sweet and Spicy Sausage Farfalle\n" +
                "3) Easy Beef Pasta Skillet\n" +
                "4) Creamy Cheddar Mac and Cheese\n" +
                "5) Roasted Garlic, Goat Cheese, and Tomato Pasta\n" +
                "6) Bacon Wrapped Jalapeno Popper Chicken\n" +
                "7) Mustard and Mushroom Chicken\n" +
                "8) Roasted Chicken\n" +
                "9) 20 Minute Sesame Chicken\n" +
                "10)Classic Pot Roast\n" +
                "11)Sherry Mushroom Chicken\n" +
                "12)Spinach Salad");
    }

    private void intermediateList()
    {
    System.out.println(

            "1)Mixed Berry Pavlova With Lemon Curd and Mascarpone Whipped Cream\n" +
            "2)Cucumber Basil Agua Fresca Cocktail\n" +
            "3)Classic Tiramisu Cake\n" +
            "4)Roasted Eggplant, Crisp Garlic, and Basil Pasta\n" +
            "5)Strawberry-Tarragon Curd Toast\n" +
            "6)Chocolate-Almond Butter Eggs\n" +
            "7)Macadamia Banana Croissant Tarte Tatin\n" +
            "8)Brown Rice Chirashi Bowl\n" +
            "9)Baja-Style Crispy Fish Tacos with Chipotle Crema\n" +
            "10)Franciacorta Risotto with Pears and Crisped Speck\n" +
            "11)Acorn Squash with Apple Walnut Stuffing\n" +
            "12)Steak Salad with Tomato-Sherry Vinaigrette");
    }

    private void advancedList()
    {
    System.out.println("1)Mozzarella Arancini (Stuffed Rice Balls)\n" +
            "2)Oxtail and Red Wine Stew\n" +
            "3)Chicken Tamales\n" +
            "4)Jerk-Spiced Ducks\n" +
            "5)Homemade Ravioli\n" +
            "6)Best Lasagna\n" +
            "7)Classic Cassoulet\n" +
            "8)Moussaka \n" +
            "9)Glazed Fried Chicken with Old Bay and Cayenne\n" +
            "10)Manicotti\n" +
            "11)Grandma-Style Pizza Dough\n" +
            "12)Chicken Tikka Masala");

    }

}
package builder;


/*  https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 * 
 *  Builder pattern builds a complex object using simple
 *  objects and using a step by step approach. This type
 *  of design pattern comes under creational pattern as 
 *  this pattern provides one of the best ways to create 
 *  an object.
 *   
 *  A Builder class builds the final object step by step.
 *  This builder is independent of other objects.
 */

public class Demo {

	public static void main(String[] args) {
		
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());
		
		Meal nonVegMeal = mealBuilder.prepareVegMeal();
		System.out.println("\n\nNon-Veg meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: £" + nonVegMeal.getCost());

	}

}

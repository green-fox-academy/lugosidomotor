package com.tamagotchi.tamagotchi.models;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Fox {

  private String name;
  private List<Trick> tricks;
  private List<Food> foods;
  private List<Drink> drinks;

  public Fox() {
    this("Dezső");
  }

  public Fox(String name) {
    this.name = name;
    tricks = new ArrayList<>();
    foods = new ArrayList<>();
    drinks = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Trick> getTricks() {
    return tricks;
  }

  public void setTricks(List<Trick> tricks) {
    this.tricks = tricks;
  }

  public List<Food> getFoods() {
    return foods;
  }

  public void setFoods(List<Food> foods) {
    this.foods = foods;
  }

  public List<Drink> getDrinks() {
    return drinks;
  }

  public void setDrinks(List<Drink> drinks) {
    this.drinks = drinks;
  }

  public String getDrink(){
    return "cola";
  }

  public String getFood(){
    return "cheeseburger";
  }

  public int getNumberOfTricks(){
    return tricks.size();
  }



  public List<Drink> allPossibleDrinkList(){
    ArrayList<Drink> drinkList = new ArrayList<Drink>(Arrays.asList());
    Drink drink1 = new Drink("cola");
    Drink drink2 = new Drink("fanta");
    Drink drink3 = new Drink("water");
    drinkList.add(drink1);
    drinkList.add(drink2);
    drinkList.add(drink3);
    return drinkList;
  }

  public List<Food> allPossibleFoodList(){
    ArrayList<Food> foodList = new ArrayList<Food>(Arrays.asList());

    Food food1 = new Food("burger");
    Food food2 = new Food("pizza");
    Food food3 = new Food("candy");
    foodList.add(food1);
    foodList.add(food2);
    foodList.add(food3);
    return foodList;
  }

  public List<Trick> allPossibleTrickList(){
    ArrayList<Trick> trickList = new ArrayList<Trick>(Arrays.asList());

    Trick trick1 = new Trick("stand");
    Trick trick2 = new Trick("sit");
    Trick trick3 = new Trick("vau-vau");
    trickList.add(trick1);
    trickList.add(trick2);
    trickList.add(trick3);
    return trickList;
  }

}
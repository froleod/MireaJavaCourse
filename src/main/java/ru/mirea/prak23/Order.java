package ru.mirea.prak23;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Objects;

public class Order {

    private int size;
    private LinkedList<Dish> dishes;
    private LinkedList<Drink> drinks;

    public boolean addDish(Dish dish) {
        if (dishes == null)
            dishes = new LinkedList<>();
        dishes.add(dish);
        return true;
    }

    public boolean removeDish(String dishName) {
        for (Dish d : dishes) {
            if (Objects.equals(dishName, d.getItemName())) {
                dishes.remove(d);
                return true;
            }
        }
        return false;
    }

    public boolean removeAllDishes(String dishName) {
        boolean flag = false;
        for (Dish d : dishes) {
            if (Objects.equals(dishName, d.getItemName())) {
                dishes.remove(d);
                flag = true;
            }
        }
        return flag;
    }

    public int dishQuantity(){
        return dishes.size();
    }

    public int dishQuantity(String dishName){
        int res = 0;
        for(Dish d: dishes){
            if(Objects.equals(dishName, d.getItemName())){
                res++;
            }
        }
        return res;
    }

    public LinkedList<Dish> getDishes(){
        return dishes;
    }

    public double costDishesTotal(){
        double totalCost = 0;
        for(Dish d: dishes)
            totalCost += d.getItemCost();
        return totalCost;
    }

    public LinkedList<String> dishesNames(){
        LinkedList<String> names = new LinkedList<>();
        for(Dish d: dishes)
            names.add(d.getItemName());

        return names;
    }

    public LinkedList<Dish> sortedDishesByCostDesc(){
        LinkedList<Dish> dishes = getDishes();
        dishes.sort(new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return (int) (o2.getItemCost() - o1.getItemCost());
            }
        });
        return dishes;
    }


    public boolean addDrink(Drink drink) {
        if (drinks == null)
            drinks = new LinkedList<>();
        drinks.add(drink);
        return true;
    }

    public boolean removeDrink(String drinkName) {
        for (Drink d : drinks) {
            if (Objects.equals(drinkName, d.getItemName())) {
                drinks.remove(d);
                return true;
            }
        }
        return false;
    }

    public boolean removeAllDrinks(String drinkName) {
        boolean flag = false;
        for (Drink d : drinks) {
            if (Objects.equals(drinkName, d.getItemName())) {
                drinks.remove(d);
                flag = true;
            }
        }
        return flag;
    }

    public int drinkQuantity(){
        return drinks.size();
    }

    public int drinkQuantity(String drinkName){
        int res = 0;
        for(Drink d: drinks){
            if(Objects.equals(drinkName, d.getItemName())){
                res++;
            }
        }
        return res;
    }

    public LinkedList<Drink> getDrinks(){
        return drinks;
    }

    public double costDrinksTotal(){
        double totalCost = 0;
        for(Drink d: drinks)
            totalCost += d.getItemCost();
        return totalCost;
    }

    public LinkedList<String> drinksNames(){
        LinkedList<String> names = new LinkedList<>();
        for(Drink d: drinks)
            names.add(d.getItemName());

        return names;
    }

    public LinkedList<Drink> sortedDrinksByCostDesc(){
        LinkedList<Drink> drinks = getDrinks();
        drinks.sort(new Comparator<Drink>() {
            @Override
            public int compare(Drink o1, Drink o2) {
                return (int) (o2.getItemCost() - o1.getItemCost());
            }
        });
        return drinks;
    }


}

package ru.mirea.prak24;

public class Test {
    public static void main(String[] args) {
        TableOrdersManager ordersManager = new TableOrdersManager(2);

        Drink vodka = new Drink(80, DrinkTypeEnum.VODKA);
        Drink water = new Drink(0, DrinkTypeEnum.WATER);
        Dish dish1 = new Dish(200, "makaroni", "po flotski");

        Customer customer1 = new Customer("Leonid", "Frolov", 19, new Address("Moscow", 123, "Ozernaya", 12, 'k', 34));

        Order order1 = new TableOrder();
        order1.add(vodka);
        order1.add(water);
        order1.setCustomer(customer1);

        Order order2 = new TableOrder();
        order2.add(dish1);

        ordersManager.add(order1, 1);
        ordersManager.add(order2, 2);

        System.out.println("Заказ 1: " + order1.getItems());
        System.out.println("Покупатель: " + order1.getCustomer());
        System.out.println("Адрес покупателя: " + order1.getCustomer().getAddress());

        System.out.println("Заказ 2: " + order2.getItems());


        System.out.println("Список заказов: " + ordersManager.getOrders());

        order1.remove(vodka);
        System.out.println(order1.getItems());
    }
}

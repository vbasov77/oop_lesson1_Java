//Выявите и реализуйте классы для следующей задачи. Пропишите необходимый минимум полей и методов. Пока что оставьте методы пустыми.
//        Торговый автомат содержит в себе набор товаров. Покупатель вводит номер товара. Автомат высвечивает стоимость товара. Покупатель его оплачивает. Из лотка выпадает заказанный товар.
//


package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1, "Шоколад", 150);
        Product product2 = new Product(2, "Вода 0,5", 60);
        Product product3 = new Product(3, "Мороженое", 90);
        Product product4 = new Product(4, "Кола 0,5", 80);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        Integer productId = getProductId();
        System.out.println(productId);
        Integer price = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductId() == productId) {
                price = products.get(i).getPrice();
            }
        }
        System.out.println(price);
        System.out.println("Будете брать? y/n");
        Scanner scanner = new Scanner(System.in);
        String fin = scanner.nextLine();
        System.out.println(fin.equals("y") ? "Возьмите товар" : "Всего доброго!");
    }

    public static Integer getProductId() {
        System.out.println("Введите номер товара");
        Scanner scanner = new Scanner(System.in);
        Integer num = scanner.nextInt();
        return num;
    }

    public static Integer getPrice(Integer id) {


        return id;
    }

}
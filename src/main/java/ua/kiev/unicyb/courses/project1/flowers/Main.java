package ua.kiev.unicyb.courses.project1.flowers;

import ua.kiev.unicyb.courses.project1.flowers.bouquet.BouquetCreator;
import ua.kiev.unicyb.courses.project1.flowers.bouquet.BouquetOfFlowers;


/**
 Создать консольное приложение, удовлетворяющее следующим требованиям:

 1.	Использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция.
 2.	Каждый класс должен иметь исчерпывающее смысл название и информативный состав.
 3.	Наследование должно применяться только тогда, когда это имеет смысл.
 4.	При кодировании должны быть использованы соглашения об оформлении кода java code convention.
 5.	Классы должны быть грамотно разложены по пакетам.
 6.	Работа с консолью или консольное меню должно быть минимальным.
 7.	Для хранения параметров инициализации можно использовать файлы.

 Цветочница. Определить иерархию цветов. Создать несколько объектов-цветов. Собрать букет (используя аксессуары)
 с определением его стоимости. Провести сортировку цветов в букете на основе уровня свежести.
 Найти цветок в букете, соответствующий заданному диапазону длин стеблей.
 */
public class Main {
    public static void main(String[] args) {
        BouquetCreator bouquetCreator = new BouquetCreator("src/main/resources/input");
        BouquetOfFlowers bouquetOfFlowers = bouquetCreator.create();
        System.out.println(bouquetOfFlowers);
        System.out.println();

        System.out.println("Bouquets total price: "+bouquetOfFlowers.getTotalPrice());
        System.out.println();

        System.out.println(bouquetOfFlowers.findFlowerInRangeStemLength(100,125));
        System.out.println();

        bouquetOfFlowers.sortFlowersByFreshness();
        System.out.println(bouquetOfFlowers);
    }
}

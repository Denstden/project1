package ua.kiev.unicyb.courses.project1.flowers;

import ua.kiev.unicyb.courses.project1.flowers.bouquet.BouquetCreator;
import ua.kiev.unicyb.courses.project1.flowers.bouquet.BouquetOfFlowers;


/**
 ������� ���������� ����������, ��������������� ��������� �����������:

 1.	������������ ����������� ���: ������, ������������, �����������, ������������.
 2.	������ ����� ������ ����� ������������� ����� �������� � ������������� ������.
 3.	������������ ������ ����������� ������ �����, ����� ��� ����� �����.
 4.	��� ����������� ������ ���� ������������ ���������� �� ���������� ���� java code convention.
 5.	������ ������ ���� �������� ��������� �� �������.
 6.	������ � �������� ��� ���������� ���� ������ ���� �����������.
 7.	��� �������� ���������� ������������� ����� ������������ �����.

 ����������. ���������� �������� ������. ������� ��������� ��������-������. ������� ����� (��������� ����������)
 � ������������ ��� ���������. �������� ���������� ������ � ������ �� ������ ������ ��������.
 ����� ������ � ������, ��������������� ��������� ��������� ���� �������.
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

package presentation;

import application.Cat;

// Таблицей: сначала шапка, потом по строке на каждого кота.
public class CatTableView {

    // %-10s - строка, выровненная влево по ширине 10 символов
    // %8s / %8d - строка / число, выровненные вправо по ширине 8 символов
    public void showHeader() {
        System.out.println(String.format("%-10s | %8s", "Имя", "Возраст"));
        System.out.println("-----------+---------");
    }

    public void show(Cat cat, int year) {
        System.out.println(String.format("%-10s | %8d", cat.getName(), cat.getAgeForCurrentYear(year)));
    }

}

package presentation;

import application.Cat;

// Коротко, одной строкой: "Барсик — 8 лет".
// Подобрать слово "год / года / лет" — тоже задача презентации:
// application отдаёт просто число, а как его подписать, решаем здесь.
public class CatShortView {

    public void show(Cat cat, int year) {
        int age = cat.getAgeForCurrentYear(year);
        System.out.println(cat.getName() + " — " + age + " " + yearsWord(age));
    }

    // private - метод нужен только внутри этого класса
    private String yearsWord(int age) {
        int lastTwoDigits = age % 100;
        int lastDigit = age % 10;
        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            return "лет"; // 11, 12, 13, 14 лет
        }
        if (lastDigit == 1) {
            return "год"; // 1, 21, 31 год
        }
        if (lastDigit >= 2 && lastDigit <= 4) {
            return "года"; // 2, 3, 4, 22 года
        }
        return "лет"; // 5, 6, 7, 8, 9, 10 лет
    }

}

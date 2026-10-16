package presentation;

import application.Cat;

// Слой presentation: показывает данные пользователю (здесь — в консоль).
// Сам ничего не считает, а берёт готовые данные у слоя application.
public class CatView {

    public void show(Cat cat, int year) { //void - ничего не возвращать
        System.out.println("Животного зовут: " + cat.getName());
        System.out.println("Цвет: " + cat.getColor());
        System.out.println("Коту в " + year + " году будет: " + cat.getAgeForCurrentYear(year));
    }

    public void showVoice(Cat cat) {
        System.out.println(cat.voice());
    }

    public void showSumm(Cat cat, int a, int b) {
        System.out.println("a + b = " + cat.summ(a, b));
    }

}

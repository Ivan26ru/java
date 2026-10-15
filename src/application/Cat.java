package application;

// Слой application: данные и логика. Здесь ничего не печатаем на экран —
// это работа слоя presentation.
public class Cat { //трафарет

    /*
    Метод может вернуть:
    void - ничего
    int - число 1, 2, 3 ...
    String - Строку "Меня зовут безымянный кот"
     */

    private String name;
    private int birthdayYear;

    public Cat(String catName, int birthdayYear) {
        this.name = catName;
        this.birthdayYear = birthdayYear;
    }

    // public - чтобы метод был виден из другого пакета (из presentation)
    public int getAgeForCurrentYear(int year) {
        return year - this.birthdayYear;
    }

    public String voice() { // не печатаем, а возвращаем строку
        return "Тут будет кричать зверь";
    }

    public int summ(int a, int b) { //int тип возвращаемого значения, тут это число
        return a + b; //вернуть данные и завершить метод
    }

    public String getName() { // вернуть строку
        return this.name;
    }

}

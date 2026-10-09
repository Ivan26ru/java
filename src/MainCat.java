void main(String[] args) {
    //    new Animal - создать экземляр класса, то есть объект (рисунок трафарета)
    Cat cat1 = new Cat("Барсик", 2020);
    System.out.println("Животного зовут: " + cat1.getName());
    System.out.println("Коту в 2028 году будет: " + cat1.getAgeForCurrentYear(2028));

    Cat cat2 = new Cat("Кузик3", 2019);
    System.out.println("Животного зовут: " + cat2.getName());
    System.out.println("Коту в 2028 году будет: " + cat2.getAgeForCurrentYear(2028));
}

class Cat { //трафарет

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

    int getAgeForCurrentYear(int year) {
        return year - this.birthdayYear;
    }

    void voice() { //void - ни чего не возвращать
        System.out.println("Тут будет кричать зверь");
    }

    void summVoice(int a, int b) {
        int c = a + b;
        System.out.println("a + b = " + c);
    }

    int summ(int a, int b) { //int тип возвращаемого значения, тут это число
        return a + b; //вернуть данные и завершить метод
    }

    String getName() { // вернуть строку
        return this.name;
    }

}
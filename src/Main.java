void main(String[] args) {
    //    new Animal - создать экземляр класса, то есть объект (рисунок трафарета)
    Cat cat1 = new Cat("Барсик");
    System.out.println("Животного зовут: " + cat1.getName());

    Cat cat2 = new Cat("Кузик");
    System.out.println("Животного зовут: " + cat2.getName());
}

class Cat { //трафарет

    /*
    Метод может вернуть:
    void - ничего
    int - число 1, 2, 3 ...
    String - Строку "Меня зовут безымянный кот"
     */

    private String name;

    public Cat(String catName) {
        this.name = catName;
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
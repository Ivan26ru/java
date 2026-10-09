//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {
    //    new Animal - создать экземляр класса, то есть объект (рисунок трафарета)
    Cat cat = new Cat("Барсик");
    cat.voice();
    cat.summVoice(3, 4);

    System.out.println("котик говорит сумма чисел равна: " + cat.summ(3, 4));
    System.out.println("Котяра кричит новую сумму: " + cat.summ(5, 4));

    int c = cat.summ(5, 6);
    int d = cat.summ(10, 110);
    int summa = c + d;
    System.out.println("сумма числе обоих котов: " + summa);
    System.out.println("Я спросил своего животного как его зовут и он ответил: " + cat.getName());


    Cat cat2 = new Cat("Кузик");
    System.out.println("Животного Марии зовут: " + cat2.getName());
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
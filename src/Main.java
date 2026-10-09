//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {
    //    new Animal - создать экземляр класса, то есть объект (рисунок трафарета)
    Animal animal = new Animal("Барсик");
    animal.voice();
    animal.summVoice(3, 4);

    System.out.println("котик говорит сумма чисел равна: " + animal.summ(3, 4));
    System.out.println("Котяра кричит новую сумму: " + animal.summ(5, 4));

    int c = animal.summ(5, 6);
    int d = animal.summ(10, 110);
    int summa = c + d;
    System.out.println("сумма числе обоих котов: " + summa);
    System.out.println("Я спросил своего животного как его зовут и он ответил: " + animal.getName());


    Animal animal2 = new Animal("Кузик");
    System.out.println("Животного Марии зовут: " + animal2.getName());
}

class Animal { //трафарет

    /*
    Метод может вернуть:
    void - ничего
    int - число 1, 2, 3 ...
    String - Строку "Меня зовут безымянный кот"
     */

    private String name;

    public Animal(String catName) {
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
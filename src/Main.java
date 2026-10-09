//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {
    Animal animal = new Animal();
    animal.voice();
    animal.summVoice(3, 4);

    System.out.println("котик говорит сумма чисел равна: " + animal.summ(3, 4));
    System.out.println("Котяра кричит новую сумму: " + animal.summ(5, 4));

    int c = animal.summ(5, 6);
    int d = animal.summ(10, 110);
    int summa = c + d;
    System.out.println("сумма числе обоих котов: " + summa);

    System.out.println(animal.getName());



//    Cat murzik = new Cat();//объект
//    murzik.voice();
}

class Animal {
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

    String getName(){ // вернуть строку
        return "я безымянный кот";
    }

}

//class Cat extends Animal {
//    void voice() {
//        System.out.println("Мяу мяу мяууууууу");
//    }
//}
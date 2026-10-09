//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Animal animal = new Animal();
    animal.voice();
    animal.summVoice(3,4);

    Cat murzik = new Cat();//объект
    murzik.voice();
}

class Animal {
    void voice() {
        System.out.println("Тут будет кричать зверь");
    }

    void summVoice(int a, int b){
        int c = a + b;
        System.out.println("a + b = " + c);
    }
}

class Cat extends Animal{
    void voice(){
        System.out.println("Мяу мяу мяууууууу");
    }
}
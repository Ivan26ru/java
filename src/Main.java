//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

//  for (int i = 1; i <= 5; i++) {
//
//      if (i > 2){
//          IO.println("i = " + i + " больше 2");
//      } else {
//          IO.println("i = " + i + " меньше или равно 2");
//      }
//
//      IO.println("Квадрат числа равен: " + kvadrat(i));
//
//  }
    Animal animal = new Animal();

    animal.voice();

}

static int kvadrat(int a) {
    return a * a;
}

class Animal {
    void voice() {
        System.out.println("Тут будет кричать зверь");
    }
}
import application.Cat;
import presentation.CatView;

void main(String[] args) {
    //    new Cat - создать экземпляр класса, то есть объект (рисунок трафарета)
    Cat cat1 = new Cat("Барсик", 2020);
    Cat cat2 = new Cat("Кузик", 2019);

    CatView view = new CatView();
    view.show(cat1, 2028);
    view.show(cat2, 2028);
}

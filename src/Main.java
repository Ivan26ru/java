import application.Cat;
import presentation.CatTableView;
import presentation.CatView;

void main(String[] args) {
    //    new Cat - создать экземпляр класса, то есть объект (рисунок трафарета)
    Cat cat1 = new Cat("Барсик", 2020);
    Cat cat2 = new Cat("Кузик", 2019);
    Cat cat3 = new Cat("Мурка", 2027);
    Cat cat4 = new Cat("Пушок", 2025);
    int year = 2028;

    // Коты одни и те же (application), а показать их можно по-разному (presentation)

    System.out.println("=== Подробно ===");
    CatView view = new CatView();
    view.show(cat1, year);
    view.show(cat2, year);

    System.out.println();
    System.out.println("=== Таблица (" + year + " год) ===");
    CatTableView tableView = new CatTableView();
    tableView.showHeader();
    tableView.show(cat1, year);
    tableView.show(cat2, year);
    tableView.show(cat3, year);
    tableView.show(cat4, year);
}

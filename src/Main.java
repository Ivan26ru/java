import application.Cat;
import presentation.CatJsonView;
import presentation.CatShortView;
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
    System.out.println("=== Коротко ===");
    CatShortView shortView = new CatShortView();
    shortView.show(cat1, year);
    shortView.show(cat2, year);
    shortView.show(cat3, year);
    shortView.show(cat4, year);

    System.out.println();
    System.out.println("=== Таблица (" + year + " год) ===");
    CatTableView tableView = new CatTableView();
    tableView.showHeader();
    tableView.show(cat1, year);
    tableView.show(cat2, year);
    tableView.show(cat3, year);
    tableView.show(cat4, year);

    System.out.println();
    System.out.println("=== JSON ===");
    CatJsonView jsonView = new CatJsonView();
    jsonView.show(cat1, year);
    jsonView.show(cat2, year);
}

void main(String[] args) {
    //    new Animal - создать экземляр класса, то есть объект (рисунок трафарета)
    Cat cat1 = new Cat("Барсик", 2020);
    System.out.println("Животного зовут: " + cat1.getName());
    System.out.println("Коту в 2028 году будет: " + cat1.getAgeForCurrentYear(2028));

    Cat cat2 = new Cat("Кузик", 2019);
    System.out.println("Животного зовут: " + cat2.getName());
    System.out.println("Коту в 2028 году будет: " + cat2.getAgeForCurrentYear(2028));
}

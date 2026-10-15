package presentation;

import application.Cat;

// В формате JSON - так данные отдают другим программам (например, сайту).
public class CatJsonView {

    public void show(Cat cat, int year) {
        System.out.println("{\"name\": \"" + escape(cat.getName()) + "\", "
                + "\"year\": " + year + ", "
                + "\"age\": " + cat.getAgeForCurrentYear(year) + "}");
    }

    // Кавычка и \ в имени сломали бы JSON, поэтому ставим перед ними \
    private String escape(String text) {
        return text.replace("\\", "\\\\").replace("\"", "\\\"");
    }

}

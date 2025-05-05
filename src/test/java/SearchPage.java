import static com.codeborne.selenide.Selenide.*;

public class SearchPage extends BaseTest {

    public void clickSearchButton() {
        $("button.search__button").click(); // Нажимаем на кнопку поиска
    }

    public ResultsPage enterSearchTerm(String term) {
        $("input.search__input").setValue(term).pressEnter(); // Вводим слово и нажимаем Enter
        return new ResultsPage(); // Возвращаем объект ResultsPage
    }
}

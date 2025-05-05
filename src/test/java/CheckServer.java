import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckServer extends BaseTest {

    @Test
    public void testSearchFunctionality() {
        String searchTerm = "История"; // Замените на текст, который хотите проверить

        SearchPage searchPage = new SearchPage();
        searchPage.clickSearchButton(); // Нажимаем на кнопку поиска
        ResultsPage resultsPage = searchPage.enterSearchTerm(searchTerm); // Вводим текст для поиска

        ResultsPage searchResultsPage = new ResultsPage();
        assertTrue(searchResultsPage.isSearchResultDisplayed("История")); // Проверяем результат
    }
}

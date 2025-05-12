import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckServer extends BaseTest {


        @Test
        public void testSearchFunctionality() {
            String searchTerm = "История";

            SearchPage searchPage = new SearchPage();
            searchPage.clickSearchButton();
            ResultsPage resultsPage = searchPage.enterSearchTerm(searchTerm);

        }
    }


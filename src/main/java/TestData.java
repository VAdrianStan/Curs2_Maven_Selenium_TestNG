import java.util.Random;

public class TestData {

    public static final String URL = "https://tutorialsninja.com/demo/";
    public static final String BLUE_COLOR = "rgba(35, 161, 209, 1)";
    public static final String BLACK_COLOR = "rgba(54, 54, 54, 1)";

    public static String generateNewEmail() {

       Random random = new Random();
       return "ciulamaDePatrunjel" + random.nextInt(10_000) + "@gmail.com";
    }
}

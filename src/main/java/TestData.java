import java.util.Random;

public class TestData {

    public static String generateNewEmail() {

       Random random = new Random();
       return "ciulamaDePatrunjel" + random.nextInt(10_000) + "@gmail.com";
    }
}

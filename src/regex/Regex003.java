package regex;
/*
Napisz 2 regexy:
1 - > sprawdza poprawność imienia
2 - > sprawdza poprawnośc nazwiska
(weź pod uwage nazwiska wieloczłonowe)
// bez polskich znaków np Bachleda-Curus, von der Leyen
 */
public class Regex003 {
    public static void main(String[] args) {
        RegexTester firstnameTester = new RegexTester("[A-Z][a-z]+");
        firstnameTester.validate("Urszula");
        firstnameTester.validate("Tomek");
        firstnameTester.validate("Janusz");
        firstnameTester.validate("Janusz");
        firstnameTester.validate("ds3");

        RegexTester surnameTester = new RegexTester("[A-Z]*[a-z]*+\\s*[A-Z]*[a-z]*\\s*[A-Z]*[a-z]*-*[A-Z]*[a-z]*");
        surnameTester.validate("Kowalski");
        surnameTester.validate("von der Leyen");
        surnameTester.validate("von der Leyen Aasd");
        surnameTester.validate("von der Leyen-Kowalska");
        surnameTester.validate("Bachleda-Curus");
        surnameTester.validate("de Silva");
        surnameTester.validate("De Silva");
        surnameTester.validate("123123123");
        surnameTester.validate("12312-3123");
        surnameTester.validate("!@$$:");
        surnameTester.validate("Kowalska-");
        surnameTester.validate("-Nowak");
        surnameTester.validate("kowalski");
    }
}

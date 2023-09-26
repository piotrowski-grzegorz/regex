package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Napisz Regex, który sprawdza polskie numery telefonów komórkowych,
zaczynające się cyfrą 5.
 */
public class Regex001 {

    public static void main(String[] args) {

        RegexTester tester = new RegexTester("\\+48)?5[0-9]{8}");

        tester.validate("+48515332123"); // true
        tester.validate("+48515336293");
        tester.validate("415336293");
        tester.validate("615332123");
        tester.validate("715332123");
        tester.validate("712123");
        tester.validate("51123");
    }


}
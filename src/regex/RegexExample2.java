package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample2 {
    public static void main(String[] args) {
        String text = "Some words here";
        Pattern pattern = Pattern.compile(".*(w\\w*).*");
        Matcher matcher = pattern.matcher(text);

        if(matcher.matches()){
            int groupCounter = matcher.groupCount();
            for(int i = 0; i<= groupCounter; i++){
                System.out.printf("grupa nr %d: %s \n", i , matcher.group(i));
            }
        }

        Pattern pattern1 = Pattern.compile(".*-(\\w+)--.*");
        Matcher matcher1 = pattern1.matcher("Francis --Underwood-- został prezydentem USA");

        // jak chcemy wywołać matches group to trzeba zrobić wczesniej matches
        System.out.println(matcher1.matches());
        System.out.println(matcher1.group(1));
    }
}

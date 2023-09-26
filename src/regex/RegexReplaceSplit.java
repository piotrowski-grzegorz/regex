package regex;

public class RegexReplaceSplit {
    //zastępowanie tekstów
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";
        String replaced = text.replaceAll("\\w+", "***");
        System.out.println("Original: " + text);
        System.out.println("Replaced: " + replaced);

        //splitowanie
        String text2 = "Rozdzielaj po dowolnym\nbiałym\tznaku";
        String[] split = text2.split("\\s");
        for(String s: split){
            System.out.println("->" + s);
        }
    }
}

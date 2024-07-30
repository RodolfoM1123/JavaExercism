package acronym;

public class Acronym {
	String acronym = "";
	Acronym(String phrase) {
        String[] phrArray = phrase.toUpperCase().split("[^\\p{Alpha}']+");
        for(String s : phrArray) {
        	System.out.println(s);
        	acronym += s.charAt(0);
        }
    }

    String get() {
        return acronym;
    }

}

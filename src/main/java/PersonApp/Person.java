package PersonApp;

import java.util.ArrayList;
import java.util.List;

public class Person {
    Language language;
    List<Language> knownLanguages = new ArrayList<Language>();


    public Person(Language nativLanguage) {
        this.language = nativLanguage;
        knownLanguages.add(nativLanguage);
    }

    public void learn(Language language) {
        knownLanguages.add(language);
    }

    public void sayHello() {
        knownLanguages.forEach(p -> System.out.println(p.hello()));
    }
}

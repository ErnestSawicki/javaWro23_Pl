package PersonApp;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private Language nativeLanguage;
    private List<Language> knownLanguages = new ArrayList<Language>();


    public Person(Language nativeLanguage) {
        this.nativeLanguage = nativeLanguage;
        knownLanguages.add(nativeLanguage);
    }

    public void learn(Language language) {
        knownLanguages.add(language);
    }

    public void sayHello() {
        knownLanguages.forEach(p -> System.out.print(p.hello() + " "));
    }
}

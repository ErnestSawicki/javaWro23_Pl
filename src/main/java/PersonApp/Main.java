package PersonApp;

public class Main {
    public static void main(String[] args) {
        Language polish = new Polish();
        Language german = new German();
        Language english = new English();
        Language russian = new Russian();

        Person linguist = new Person(polish);
        linguist.learn(german);
        linguist.learn(english);
        linguist.learn(russian);

        linguist.sayHello();
    }
}

package SuperKeyword;

public class SuperKeywordPersonDemo {

    String name;
    int age;

    SuperKeywordPersonDemo(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return this.name + "\n" + this.age + "\n";
    }
}

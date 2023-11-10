package SuperKeyword;

public class SuperKeywordHeroDemo extends SuperKeywordPersonDemo{

    String power;


    SuperKeywordHeroDemo(String name, int age, String power){
        super(name, age);

        this.power = power;
    }

    public String toString(){
        return super.toString()+this.power;
    }
}

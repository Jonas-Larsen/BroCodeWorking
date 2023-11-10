package SuperKeyword;

public class SuperKeywordDemo {
    public static void main(String[] args) {
        /* Super = refers to the superclass (parent) of an object
                   very similar to the "this" keyword
         */

        SuperKeywordHeroDemo hero1 = new SuperKeywordHeroDemo("Batman", 42,"£££");
        SuperKeywordHeroDemo hero2 = new SuperKeywordHeroDemo("Superman", 55,"everything");


        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);
        System.out.println();

        System.out.println(hero2.toString());
    }
}

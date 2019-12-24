package lesson03.part01;

/**
 * Создать три кота используя класс Cat.
 * Провести три боя попарно между котами.
 * Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
 * Результат каждого боя вывести на экран c новой строки.
 *
 * Требования:
 * 1.	Программа не должна считывать данные с клавиатуры.
 * 2.	Нужно создать три объекта типа Cat.
 * 3.	Нужно провести три боя.
 * 4.	Программа должна вывести результат каждого боя с новой строки.
 */

public class Task04 {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Джесси", 5,3,2);
        Cat cat2 = new Cat ("Гуся", 1000, 4,1000);
        Cat cat3 = new Cat("Альпин", 3, 5,3);

        boolean res12 = cat1.fight(cat2);
        boolean res13 = cat1.fight(cat3);
        boolean res23 = cat3.fight(cat2);

        if (res12=false){
            System.out.println(cat1.name);
        } else{
            System.out.println(cat2.name);
        }

        if (res13=false){
            System.out.println(cat1.name);
        }  else{
            System.out.println(cat3.name);
        }

        if (res23=false){
            System.out.println(cat3.name);
        } else{
            System.out.println(cat2.name);
        }

    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

            int score = ageAdvantage + weightAdvantage + strengthAdvantage;
            return score > 2; // return score > 2 ? true : false;
        }
    }

}

public class Main {
    public static void main (String[] args) {
        // РЕШЕНИЕ ЗАДАЧИ 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        // РЕШЕНИЕ ЗАДАЧИ 2
        var multiple1 = dog * 4;
        var multiple2 = cat * 4;
        var multiple3 = paper * 4;

        // РЕШЕНИЕ ЗАДАЧИ 3
        var minus1 = dog - 3.5;
        var minus2 = cat - 1.6;
        var minus3 = paper - 7639;

        // РЕШЕНИЕ ЗАДАЧИ 4
        var friend = 19;
        // В конце должно было получиться 5, т.к var откидывает точку, меня это не устроило и я решил чуть-чуть влезть в нейросеть чтобы вывести полное число.
        double friendresult = (double) friend * 2 / 7;

        // РЕШЕНИЕ ЗАДАЧИ 5
        var frog = 3.5;
        var frogresult = (frog * 10 / 3.5) + 4;

        // РЕШЕНИЕ ЗАДАЧИ 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;

        var boxerresult = boxer1 + boxer2;
        var boxerdiffirence = boxer2 - boxer1;

        // РЕШЕНИЕ ЗАДАЧИ 7
        var boxerdiffirence2 = boxer2 % boxer1;

        // РЕШЕНИЕ ЗАДАЧИ 8
        var personalcount = 640 / 8;

        // НЕ ДО КОНЦА ПОНЯЛ ЗАДАЧУ ТАК ЧТО РЕШУ В ДВУХ ФОРМУЛАХ.
        // КОЛИЧЕСТВО ЧАСОВ ДЕЛЕННОЕ НА УВЕЛИЧЕННОЕ ЧИСЛО СОТРУДНИКОВ:
        var personalothercount = 640 / (personalcount + 94);

        // КОЛИЧЕСТВО ОБЩИХ ЧАСОВ УВЕЛИЧЕННОЕ ОТ ЧИСЛА СОТРУДНИКОВ:
        var personalhourscount = 8 * (personalcount + 94);


        // РЕЗУЛТ ДЛЯ ВЫВОДА ЗНАЧЕНИЙ ПЕРЕМЕННЫХ
        System.out.println("РЕЗУЛЬТАТЫ РЕШЕНИЯ ЗАДАЧ:");

        System.out.println("РЕШЕНИЕ ЗАДАЧИ №1");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("РЕШЕНИЕ ЗАДАЧИ №2");
        System.out.println(multiple1);
        System.out.println(multiple2);
        System.out.println(multiple3);

        System.out.println("РЕШЕНИЕ ЗАДАЧИ №3");
        System.out.println(minus1);
        System.out.println(minus2);
        System.out.println(minus3);

        System.out.println("РЕШЕНИЕ ЗАДАЧИ №4");
        System.out.println(friendresult);

        System.out.println("РЕШЕНИЕ ЗАДАЧИ №5");
        System.out.println(frogresult);

        System.out.println("РЕШЕНИЕ ЗАДАЧИ №6");
        System.out.println(boxerresult);
        System.out.println(boxerdiffirence);

        System.out.println("РЕШЕНИЕ ЗАДАЧИ №7");
        System.out.println(boxerdiffirence2);

        System.out.println("РЕШЕНИЕ ЗАДАЧИ №8");
        System.out.println(personalothercount);
        System.out.println("или");
        System.out.println(personalhourscount);
    }
}
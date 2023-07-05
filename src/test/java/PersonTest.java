import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class PersonTest {

//    @BeforeTest
//    public void beforeTest() {
//        System.out.printf("Before Test:");
//    }
//
//    @AfterTest
//    public void afterTest() {
//        System.out.printf("After Test:");
//    }

    @Test(priority =0, description = "Проверка тинейджеров, возраст 0 лет ")
    public void upTest() {
        boolean resultYouc = Person.isTeenager(0);
        Assert.assertFalse(Person.isTeenager(0), "Он тинейджер ( в 0 лет");
        System.out.println("Является ли ребенок в возрасте 0 лет тинейджером? - " + resultYouc);
    }

    @Test(priority =1,description = "Проверка тинейджеров, возраст 1 год ")
    public void upTestOne() {
        boolean resultYouOne = Person.isTeenager(1);
        Assert.assertFalse(Person.isTeenager(1), "Он тинейджер ( в 1 год");
        System.out.println("Является ли ребенок в возрасте 1 года тинейджером? - " + resultYouOne);
    }

    @Test(priority =2,description = "Проверка тинейджеров, возраст 2 года ")
    public void upTestTwo() {
        boolean resultYouTwo = Person.isTeenager(2);
        Assert.assertFalse(Person.isTeenager(2), "Он тинейджер ( в 2 года");
        System.out.println("Является ли ребенок в возрасте 2 года тинейджером? - " + resultYouTwo);
    }

    @Test(priority =3,description = "Проверка тинейджеров, возраст 3 года ")
    public void upTestThree() {
        boolean resultYouThree = Person.isTeenager(3);
        Assert.assertFalse(Person.isTeenager(3), "Он тинейджер ( в 3 года");
        System.out.println("Является ли ребенок в возрасте 3 года тинейджером? - " + resultYouThree);
    }

    @Test(priority =4,description = "Проверка тинейджеров, возраст 4 года ")
    public void upTestFour() {
        boolean resultYouFour = Person.isTeenager(4);
        Assert.assertFalse(Person.isTeenager(4), "Он тинейджер ( в 4 года");
        System.out.println("Является ли ребенок в возрасте 4 года тинейджером? - " + resultYouFour);
    }

    @Test(priority =5,description = "Проверка тинейджеров, возраст 5 лет ")
    public void upTestFive() {
        boolean resultYouFive = Person.isTeenager(5);
        Assert.assertFalse(Person.isTeenager(5), "Он тинейджер ( в 5 лет");
        System.out.println("Является ли ребенок в возрасте 5 лет тинейджером? - " + resultYouFive);
    }

    @Test(priority =6,description = "Проверка тинейджеров, возраст 6 лет ")
    public void upTestSix() {
        boolean resultYouSix = Person.isTeenager(6);
        Assert.assertFalse(Person.isTeenager(6), "Он тинейджер ( в 6 лет");
        System.out.println("Является ли ребенок в возрасте 6 лет тинейджером? - " + resultYouSix);
    }

    @Test(priority =7,description = "Проверка тинейджеров, возраст 7 лет ")
    public void upTestSeven() {
        boolean resultYouSeven = Person.isTeenager(7);
        Assert.assertFalse(Person.isTeenager(7), "Он тинейджер ( в 7 лет");
        System.out.println("Является ли ребенок в возрасте 7 лет тинейджером? - " + resultYouSeven);
    }

    @Test(priority =8,description = "Проверка тинейджеров, возраст 8 лет ")
    public void upTestEight() {
        boolean resultYouEight = Person.isTeenager(8);
        Assert.assertFalse(Person.isTeenager(8), "Он тинейджер ( в 8 лет");
        System.out.println("Является ли ребенок в возрасте 8 лет тинейджером? - " + resultYouEight);
    }

    @Test(priority =9,description = "Проверка тинейджеров, возраст 9 лет ")
    public void upTestNine() {
        boolean resultYouNine = Person.isTeenager(9);
        Assert.assertFalse(Person.isTeenager(9), "Он тинейджер ( в 9 лет");
        System.out.println("Является ли ребенок в возрасте 9 лет тинейджером? - " + resultYouNine);
    }

    @Test(priority =10,description = "Проверка тинейджеров, возраст 10 лет ")
    public void upTestTen() {
        boolean resultYouTen = Person.isTeenager(10);
        Assert.assertFalse(Person.isTeenager(10), "Он тинейджер ( в 10 лет");
        System.out.println("Является ли ребенок в возрасте 10 лет тинейджером? - " + resultYouTen);
    }

    @Test(priority =11,description = "Проверка тинейджеров, возраст 11 лет ")
    public void upTestEleven() {
        boolean resultYouEleven = Person.isTeenager(11);
        Assert.assertFalse(Person.isTeenager(11), "Он тинейджер ( в11 лет");
        System.out.println("Является ли ребенок в возрасте 11 лет тинейджером? - " + resultYouEleven);
    }

    @Test(priority =12,description = "Проверка тинейджеров, возраст 12 лет ")
    public void upTestTwelve() {
        boolean resultYouTwelve = Person.isTeenager(12);
        Assert.assertFalse(Person.isTeenager(12), "Он тинейджер ( в 12 лет");
        System.out.println("Является ли ребенок в возрасте 12 лет тинейджером? - " + resultYouTwelve);
    }

    @Test(priority =13,description = "Проверка тинейджеров, возраст 13 лет ")
    public void upTestThirteen() {
        boolean resultYouThirteen = Person.isTeenager(13);
        Assert.assertTrue(Person.isTeenager(13), "Он почемуто не является тинейджером ( в 13 лет");
        System.out.println("Является ли ребенок в возрасте 13 лет тинейджером? - " + resultYouThirteen);
    }

    @Test(priority =14,description = "Проверка тинейджеров, возраст 14 лет ")
    public void upTestFourteen() {
        boolean resultYouFourteen = Person.isTeenager(14);
        Assert.assertTrue(Person.isTeenager(14), "Он почему-то не является тинейджером ( в 14 лет");
        System.out.println("Является ли ребенок в возрасте 14 лет тинейджером? - " + resultYouFourteen);
    }

    @Test(priority =15,description = "Проверка тинейджеров, возраст 15 лет ")
    public void upTestFifteen() {
        boolean resultYouFifteen = Person.isTeenager(15);
        Assert.assertTrue(Person.isTeenager(15), "Он почемуто не является тинейджером ( в 15 лет");
        System.out.println("Является ли ребенок в возрасте 15 лет тинейджером? - " + resultYouFifteen);
    }

    @Test(priority =16,description = "Проверка тинейджеров, возраст 16 лет ")
    public void upTestSixteen() {
        boolean resultSixteen = Person.isTeenager(16);
        Assert.assertTrue(Person.isTeenager(16), "Он почемуто не является тинейджером ( в 16 лет");
        System.out.println("Является ли ребенок в возрасте 16 лет тинейджером? - " + resultSixteen);
    }

    @Test(priority =17,description = "Проверка тинейджеров, возраст 17 лет ")
    public void upTestSeventeen() {
        boolean resultSeventeen = Person.isTeenager(17);
        Assert.assertTrue(Person.isTeenager(17), "Он почемуто не является тинейджером ( в 17 лет");
        System.out.println("Является ли ребенок в возрасте 17 лет тинейджером? - " + resultSeventeen);
    }

    @Test(priority =18,description = "Проверка тинейджеров, возраст 18 лет ")
    public void upTestEighteen() {
        boolean resultEighteen = Person.isTeenager(18);
        Assert.assertTrue(Person.isTeenager(18), "Он почемуто не является тинейджером ( в 18 лет");
        System.out.println("Является ли ребенок в возрасте 18 лет тинейджером? - " + resultEighteen);
    }

    @Test(priority =19,description = "Проверка тинейджеров, возраст 19 лет ")
    public void upTestNineteen() {
        boolean resultOldNineteen = Person.isTeenager(19);
        Assert.assertTrue(Person.isTeenager(19), "Он почемуто не является тинейджером ( в 19 лет");
        System.out.println("Является ли ребенок в возрасте 19 лет тинейджером? - " + resultOldNineteen);
    }


    @Test(priority =20,description = "Проверка тинейджеров до 13")
    public void upTestOneThree() {
        boolean resultBefore = Person.isTeenager(12);
        Assert.assertFalse(Person.isTeenager(12), "Они тинейджеры ( до 13 лет");
        System.out.println("Являются ли дети до 13 лет - Тинейджерами ? - " + resultBefore);
    }
    @Test(priority =21,description = "Проверка после 19 лет уже не тинейджеры  ")
    public void upTestTwenty() {
        boolean resultAfter = Person.isTeenager(20);
        Assert.assertFalse(Person.isTeenager(20), "он не тинейджер в 20 лет");
        System.out.println("В 20 лет еще является тинейджером? - " + resultAfter);
    }

    @Test(priority =22,description = "Проверка на 0")
    public void upTestSecond() {
        boolean resultZero = Person.isTeenager(0);
        Assert.assertFalse(Person.isTeenager(0), "Он тинейджер ( сразу когда родился");
        System.out.println("Новорожденные это не тинейджеры. - " + resultZero);
    }

}






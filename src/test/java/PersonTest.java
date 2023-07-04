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

    @Test (description = "Проверка тинейджеров 13 - 19 лет ")
    public void upTest () {

        boolean resultYoung = Person.isTeenager(13);
        Assert.assertTrue(Person.isTeenager(13));
        System.out.println("Тинейджеры 13 лет - " + resultYoung);

        boolean resultMid = Person.isTeenager(16);
        Assert.assertTrue(Person.isTeenager(16));
        System.out.println( "Тинейджеры 16 лет - " + resultMid);

        boolean resultOld = Person.isTeenager(19);
        Assert.assertTrue(Person.isTeenager(19));
        System.out.println("Тинейджеры 19 лет - " + resultOld);
    }
        @Test (description = "Проверка тинейджеров до 13 и после 19 лет ")
        public void upTestOne () {
            boolean resultBefore = Person.isTeenager(12);
            Assert.assertFalse(Person.isTeenager(12));
            System.out.println("Тинейджеры до 13 лет? - " + resultBefore);

            boolean resultAfter = Person.isTeenager(12);
            Assert.assertFalse(Person.isTeenager(20));
            System.out.println("Тинейджеры в 20+ лет? - " + resultAfter);
        }

        @Test (description = "Проверка на 0")
        public void upTestSecond (){
            boolean resultZero = Person.isTeenager(0);
            Assert.assertFalse(Person.isTeenager(0));
            System.out.println("Новорожденные это тинейджеры? - " + resultZero);

    }
}

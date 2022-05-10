import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class PersonTest {

    @DataProvider(name = "isTeenagerData")
    Object[][] isTeenagerDataProvider() {
        return new Object[][] {
                {5,false},
                {12,false},
                {13,true},
                {14,true},
                {16,true},
                {18,true},
                {19,true},
                {20,false},
                {50,false}
        };
    }

    @Test(dataProvider = "isTeenagerData")
    public void testIsTeenager(int age, boolean expectedResult){
        boolean result = Person.isTeenager(age);
        assertEquals(result, expectedResult, "Age = " + age);
    }


}

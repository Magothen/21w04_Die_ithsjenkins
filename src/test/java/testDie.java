import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class testDie {

    //test här
    @ParameterizedTest
    @ValueSource(ints = {4,6,8,10,12,20,100})
    void testDieClass(int input){
        Die testDie = new Die(input); //test code
        Boolean actual = false;
        testDie.roll(); //CUT
        if(testDie.getValue() <= input){
            actual = true;
        }
        Assertions.assertTrue(actual);
    }

}

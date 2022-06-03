import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SILab2Test {
    private List<String> test_list1() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add("0");
        }
        return list;
    }

    private List<String> test_list2() {
        List<String> list = new ArrayList<>();
        list.add("0");
        list.add("#");
        list.add("0");
        list.add("#");
        return list;
    }

    private List<String> result_list2() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("#");
        list.add("1");
        list.add("#");
        return list;
    }

    @Test
    void multipleConditions() {
        List<String> test1 = test_list1();
        List<String> test2 = test_list2();
        List<String> expected = result_list2();
        Assertions.assertThrows(RuntimeException.class, () -> SILab2.function(new ArrayList<>()));
        Assertions.assertThrows(RuntimeException.class, () -> SILab2.function(test1));
        List<String> result = SILab2.function(test2);
        Assertions.assertEquals(expected.toString(), result.toString());
    }

}

package collection03.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UtilMain {
    public static void main(String[] args){
        var list = new ArrayList(List.of(1,3,2,4,5));

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
}

package capgemini.nosql.redis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Starter {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "John");
//        Map map2 = new HashMap();
//        map2.get("");
        Map<String, List<String>> itemsMap = new HashMap<>();
        List<String> list = itemsMap.get("1");
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add("value");

    }
}

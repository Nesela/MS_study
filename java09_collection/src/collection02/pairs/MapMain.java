package collection02.pairs;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {
//        map01();
//        map02();
//        map03();
        map04();
    }

    public static void map04() {
        TreeMap<Integer, String> scores = new TreeMap<>();

        scores.put(50, "F");
        scores.put(65, "D");
        scores.put(77, "C");
        scores.put(82, "B");
        scores.put(93, "A");

        System.out.println(scores);

        // 70점보다 낮은 점수 (점수 entry)
        System.out.println(scores.lowerKey(70));
        // 70점보다 높거나 같은 점수
        System.out.println(scores.ceilingEntry(70));
        // 90 점 초과 중 가장 가까운 점수
        System.out.println(scores.higherEntry(90));
        // 가장 낮은 / 가장 높은 정수를
        System.out.println(scores.firstEntry());
        System.out.println(scores.lastEntry());
        // 내림차순 정렬
        NavigableMap<Integer, String> descendinScores = scores.descendingMap();
        System.out.println(descendinScores);
        // 범위 검색
        // 60 <= subMap(search) <= 80
        System.out.println(scores.subMap(60, true, 80, true));
    }

    public static void  map03() {
        var hashMap = new HashMap<>();
        var linkedMap = new LinkedHashMap<>();
        var treeMap = new TreeMap<>();

        String[] keys = {"C", "A", "B", "D"};
        for (String key : keys) {
            hashMap.put(key, key.charAt(0) - 64);
            linkedMap.put(key, key.charAt(0) - 64);
            treeMap.put(key, key.charAt(0) - 64);
        }

        System.out.printf("""
                hashMap : %s
                linkedHashMap : %s
                treeMap : %s
                """, hashMap, linkedMap, treeMap);
    }

    public static void map02() {
        var map = Map.of("hong", 100, "lee", 95, "kim", 80);

        System.out.println(map.remove("lee"));
        System.out.println(map.containsKey("lee"));
        System.out.println(map.containsValue(90));
    }

    public static void map01() {
        Map<String, Integer> map = new HashMap<>();
        map.put("hong", 100);
        map.put("lee", 95);
        map.put("kim", 80);

        System.out.println(map);
        System.out.println(map.get("lee"));

        // Set<Map.Entry<K,V>> entrySet()
        for (var entry : map.entrySet()) {
//            System.out.println(entry);
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        var iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            var entry = iter.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(map.keySet());
    }
}

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int j = (int) (Math.random() * 100);
            integerList.add(j);
        }
        System.out.print("随机生成50个小于100的数,分别为: ");
        for (Integer i : integerList) {
            System.out.print(i + ",");
        }
        System.out.println();
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            ArrayList<Integer> arrays = new ArrayList<>();
            map.put(i,arrays);
        }
        for (Integer i : integerList) {
            map.get(i / 10).add(i);
        }

        //map2用来format输出
        Map<Integer, String> map2 = new HashMap<>();
        map.forEach((k, v) ->{ map2.put(k,">"+v); });
        System.out.println("Map中的数据为："+map2.toString());

        map.forEach((k, v) ->{
            Collections.sort(v);
            map2.put(k,"=>"+v);
        });
        System.out.println("排序后的数据为："+map2.toString());
    }
}


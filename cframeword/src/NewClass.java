import java.util.*;

public class NewClass {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.remove(Integer.valueOf(1));
        System.out.println(list);
    }
}

//        list.add("BMW");
//        list.add("VOLVO");
//        list.add("FORD");
//        list.add("MAZDA");
//        list.add("SUZUKI");
//        list.add("TOYOTA");
//        list.add(1);
//
//        // Bubble Sort
//        for (int i = 0; i < list.size(); i++) {
//
//            for (int j = 0; j < list.size() - i - 1; j++) {
//
//                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
//
//                    String temp = list.get(j);
//                    list.set(j, list.get(j + 1));
//                    list.set(j + 1, temp);
//                }
//            }
//        }
//
//        System.out.println(list);
//    }
//}

package hackerrank.java.dataStructures;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();

            hashMap.put(name, phone);

            in.nextLine();
        }

        while (in.hasNext()) {
            String s = in.nextLine();

            if (hashMap.containsKey(s)) {
                System.out.println(s + "=" + hashMap.get(s));
            }else{
                System.out.println("Not found");
            }
        }
    }
}

package demoJava;



	import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
	public class SubArrayDemo {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque deque = new ArrayDeque<Integer>();
            Set<Integer> integers = new HashSet<>();
            int n = in.nextInt();
            int m = in.nextInt();
            long result = 0;
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                deque.add(num);
                integers.add(num);
                if (deque.size() == m) {
                    long currentSize = integers.size();
                    if (currentSize > result) {
                        result = currentSize;
                    }
                    Integer removed = (Integer) deque.pollFirst();
                    if (!deque.contains(removed)) {
                        integers.remove(removed);
                    }
                }
            }
            System.out.println(result);
        }
	}
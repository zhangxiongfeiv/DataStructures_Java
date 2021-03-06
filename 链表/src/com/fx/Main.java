package com.fx;

import com.fx.circle.CircleLinkList;
import com.fx.circle.SingleCircleLinkList;
import com.fx.single.SingleLinkList;

public class Main {

    static void testList(List<Integer> list) {
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);

        list.add(0, 55); // [55, 11, 22, 33, 44]
        list.add(2, 66); // [55, 11, 66, 22, 33, 44]
        list.add(list.size(), 77); // [55, 11, 66, 22, 33, 44, 77]

        list.remove(0); // [11, 66, 22, 33, 44, 77]
        list.remove(2); // [11, 66, 33, 44, 77]
        list.remove(list.size() - 1); // [11, 66, 33, 44]

        System.out.println(list);
    }

    // 约瑟夫问题
    static void josephus(CircleLinkList<Integer> list){

        list.reset();

        while (!list.isEmpty()){
            list.next();
            list.next();
            System.out.println(list.remove());
        }
    }

    public static void main(String[] args) {

    }
}

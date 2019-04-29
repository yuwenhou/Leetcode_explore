package List;

import java.util.*;


public class dynamicArray {

    public static void main(String[] args) {
        //1.initialize
        List<Integer> v0 = new ArrayList<>();
        List<Integer> v1;

        //2.cast an array to a vector
        Integer[] a = {1,2,3,4,5};
        v1 = new ArrayList<>(Arrays.asList(a));

        //3.make a copy
        List<Integer> v2 = v1;   //another reference to v1
        List<Integer> v3 = new ArrayList<>(v1); //actual copy

        //4.get Length
        System.out.println("The size of v1:" + v1.size());

        //5. access element
        System.out.println("The first element of v1:" + v1.get(0));

        //6.iterator the vector
        System.out.println("[version 1] The contents of v1 are:");
        for(int i = 0; i<v1.size();i++){
            System.out.println(v1.get(i));
        }
        System.out.println("[version 2] The contents of v1 are:");
        for (int i:v1){
            System.out.println(i);
        }
        //7.modify element
        System.out.println(v2);
        v2.set(0,5);
        System.out.println("the first modify v2[0]:" +v2.get(0));
        v2.set(0,-1);
        System.out.println("the second modify v2[0]:" +v2.get(0));

        //8.sort
        Collections.sort(v2);
        System.out.println(v2);
        //9.add new element at the end of the vector
        v2.add(5,6666);
        v2.add(1,888);
        System.out.println(v2);


        //10.delete the last element
        v2.remove(v2.size()-1);


    }





}

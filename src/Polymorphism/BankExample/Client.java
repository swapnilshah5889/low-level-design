package Polymorphism.BankExample;

import java.util.LinkedHashMap;

public class Client {

    static void calculateInterest(int type) {
        BankAccount obj;
        if(type==0) {
            obj = new Savings();
        }
        else if(type==1) {
            obj = new Checking();
        }
        else {
            obj = new Current();
        }
        // Will call the function from the class of instance
        obj.calculateInterest();
    }

    public static void main(String[] args) {
        /*calculateInterest(0);
        calculateInterest(1);
        calculateInterest(2);*/

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        map.put(1,1);
        map.put(2,2);
        System.out.println(map.get(1));
        System.out.println(map.size());
        for(Integer key : map.keySet()) {
            map.remove(key);
            break;
        }
        map.put(3,3);
        System.out.println(map);
    }

}

package com.java.Dob;

import java.util.HashMap;
import java.util.Map;

class Test {
	public static void main(String[] args) {
        Employee e1 = new Employee("Amar");
        Employee e2 = new Employee("Akhbar");
        Employee e3 = new Employee("Anthony");
        Date d1 = new Date(17, 8, 1998);
        Date d2 = new Date(28, 07, 2001);
        Date d3 = new Date(28, 07, 1999);
       
        Map<Date, Employee> m1 = new HashMap<Date, Employee>();
        m1.put(d1,e1);
        m1.put(d1,e2);
        m1.put(d1,e3);
        m1.put(d2,e1);
        m1.put(d2,e2);
        m1.put(d3,e3);
        for(Map.Entry<Date,Employee> entry: m1.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}

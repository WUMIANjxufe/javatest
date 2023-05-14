package com.example.test;

import com.example.math.statistics.Pearson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        List<Double> list1=new ArrayList<>();
        list1.add(1.0);
        list1.add(0.0);
        list1.add(1.0);
        list1.add(3.0);
        list1.add(0.0);
        list1.add(1.0);
        list1.add(0.0);
        list1.add(0.0);
        list1.add(3.0);
        List<Double> list2=new ArrayList<>();
        list2.add(1.0);
        list2.add(0.0);
        list2.add(1.0);
        list2.add(3.0);
        list2.add(0.0);
        list2.add(1.0);
        list2.add(1.0);
        list2.add(0.0);
        list2.add(2.0);
        List<Double> list3=new ArrayList<>();
        list3.add(1.0);
        list3.add(1.0);
        list3.add(0.0);
        list3.add(0.0);
        list3.add(2.0);
        list3.add(0.0);
        list3.add(0.0);
        list3.add(0.0);
        list3.add(0.0);
        Pearson p = new Pearson();
        System.out.println(p.getPearsonBydim(list1,list3));


    }


}

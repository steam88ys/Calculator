package kr.hs.study;

import kr.hs.study.beans.Number;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Number obj1 = ctx.getBean("t1", Number.class);
        System.out.println("순서 변경 결과: "+ obj1.getStr2()+", "+obj1.getStr1());

        Number obj2 = ctx.getBean("t2", Number.class);
        int sum = obj2.getSu1()+obj2.getSu2()+obj2.getSu3();
        System.out.println("\n합: "+ sum);
        System.out.println("평균: "+ sum/3);

        Number obj3 = ctx.getBean("t3", Number.class);
        if(obj3.getSu4() > obj3.getSu5()) System.out.println("1");
        else if(obj3.getSu4() < obj3.getSu5()) System.out.println("0");
        else System.out.println(obj3.getSu4()+" == "+obj3.getSu5());

        Number obj4 = ctx.getBean("t2", Number.class);
        if (obj4.getSu6() % 2 == 0) {
            System.out.println(obj4.getSu6());
        }
        if (obj4.getSu7() % 2 == 0) {
            System.out.println(obj4.getSu7());
        }
        if (obj4.getSu8() % 2 == 0) {
            System.out.println(obj4.getSu8());
        }

        ctx.close();
    }
}
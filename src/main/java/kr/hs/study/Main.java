package kr.hs.study;

import kr.hs.study.beans.Number;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Number obj1 = ctx.getBean("t1", Number.class);  // 1번
        System.out.println("\n순서 변경 결과: "+ obj1.getStr2()+", "+obj1.getStr1());

        Number obj2 = ctx.getBean("t2", Number.class);  // 2번
        int sum = obj2.getSu1()+obj2.getSu2()+obj2.getSu3();
        System.out.println("\n합: "+ sum);
        System.out.println("평균: "+ sum/3);

        Number obj3 = ctx.getBean("t3", Number.class);  // 3번
        if(obj3.getSu1() > obj3.getSu2()) System.out.println("\n1");
        else if(obj3.getSu2() < obj3.getSu1()) System.out.println("\n0");
        else System.out.println("\n"+obj3.getSu1()+" == "+obj3.getSu2());

        Number obj4 = ctx.getBean("t2", Number.class);  // 4번
        if (obj4.getSu1() % 2 == 0) {
            System.out.println("\n"+obj4.getSu1());
        }
        if (obj4.getSu2() % 2 == 0) {
            System.out.println(obj4.getSu2());
        }
        if (obj4.getSu3() % 2 == 0) {
            System.out.println(obj4.getSu3()+"\n");
        }

        Number obj5 = ctx.getBean("t4", Number.class);  // 5번
        if(obj5.getSu1()/10 == obj5.getSu1()%10) System.out.println("10의 자리와 1의 자리가 같습니다.\n");
        else System.out.println("10의 자리와 1의 자리가 다릅니다.\n");
        
        // 6번
        Number obj6 = ctx.getBean("t6", Number.class);
        int a = obj6.getSu1();
        int b = obj6.getSu2();
        int c = obj6.getSu3();
        if(a*a == (b*b+c*c) || b*b == (a*a+c*c) || c*c == (a*a+b*b)) {
            System.out.println("삼각형이 가능합니다.");
        }else System.out.println("삼각형이 불가능합니다.");
        
        //7번 
        Number obj7 = ctx.getBean("t7", Number.class);
        int max = obj7.getSu1();
        int min = obj7.getSu1();
        if(max < obj7.getSu2()) max = obj7.getSu2();
        else if(max < obj7.getSu3()) max = obj7.getSu2();
        if(min > obj7.getSu2()) min = obj7.getSu2();
        else if(min > obj7.getSu3()) min = obj7.getSu3();
        System.out.println("\n최대점수: "+max+", 최소점수: "+min);
        
        // 8번
        Number obj8 = ctx.getBean("t8", Number.class);
        a = obj8.getSu1();
        b = obj8.getSu2();
        c = obj8.getSu3();
        int d = obj8.getSu4();
        int e = obj8.getSu5();
        sum=0;
        if(a>=20 && a<=50) sum+= a;
        if(b>=20 && b<=50) sum+= b;
        if(c>=20 && c<=50) sum+= c;
        if(d>=20 && d<=50) sum+= d;
        if(e>=20 && e<=50) sum+= e;
        System.out.println("\n합계: "+sum+", 평균: "+sum/5);

        ctx.close();
    }
}
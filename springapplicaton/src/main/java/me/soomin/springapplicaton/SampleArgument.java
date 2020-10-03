package me.soomin.springapplicaton;

import org.springframework.boot.ApplicationArguments;


public class SampleArgument {//자동주입 사용

    public SampleArgument(ApplicationArguments arguments) {//VM 옵션이아니라 프로그램 인자를 이야기한다.
        System.out.println("foo : "+arguments.containsOption("foo"));
        System.out.println("bar : "+arguments.containsOption("bar"));
    }
}

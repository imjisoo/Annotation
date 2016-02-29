package com.sist;

/**
 * Created by AAA on 2016-02-29.
 */
public class MathodUseAnnotation {

    @PrintAnnotation
    public void Methodname1 () {
        System.out.println("어노테이션 적용 메소드1 내용");
    }

    @PrintAnnotation("*")
    public void Methodname2 () {
        System.out.println("어노테이션 적용 메소드2 내용");
    }

    @PrintAnnotation
    public void Methodname3 () {
        System.out.println("어노테이션 적용 메소드3 내용");
    }

    @PrintAnnotation
    public void Methodname4 () {
        System.out.println("어노테이션 적용 메소드4 내용");
    }

}

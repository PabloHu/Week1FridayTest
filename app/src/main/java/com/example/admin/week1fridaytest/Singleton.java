package com.example.admin.week1fridaytest;

/**
 * Created by Admin on 9/1/2017.
 */

public class Singleton {

    public static Singleton singleton = new Singleton();


    @Override
    public String toString() {
        return "Singleton{}";
    }

    private Singleton() {

    }

    public static Singleton getSingleton() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public static void setSingleton(Singleton singleton) {
        Singleton.singleton = singleton;
    }
    public void singletonFunction(){
        System.out.println("SingletonFunction");
    }

}





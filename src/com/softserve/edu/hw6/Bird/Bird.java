package com.softserve.edu.hw6.Bird;

public interface Bird {

    default boolean fly(boolean a){
        return  a;
    }
}

package com.example.testb;

import com.example.testa.MultiModuleA;

public class MultiModuleB {

    public String test() {
        MultiModuleA a = new MultiModuleA();
        return a.test();
    }
}

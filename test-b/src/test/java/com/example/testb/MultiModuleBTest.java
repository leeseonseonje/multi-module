package com.example.testb;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MultiModuleBTest {

    @Test
    void test() {
        MultiModuleB sut = new MultiModuleB();
        String result = sut.test();
        assertThat(result).isEqualTo("multi-module-A");
    }

}
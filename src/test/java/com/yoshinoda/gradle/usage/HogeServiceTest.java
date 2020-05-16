package com.yoshinoda.gradle.usage;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HogeServiceTest {

    private HogeService sut;

    @Before
    public void setUp() throws Exception {
        sut = new HogeService();
    }

    @Test
    public void hoge() throws Exception {
        String actual = sut.hoge();
        assertThat(actual, is("hoge"));
    }
}
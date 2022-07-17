package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AfishaManagerTest {
    @Test
    public void test1() {
        AfishaManager manager = new AfishaManager();
        manager.add("1");
        manager.add("2");
        manager.add("3");

        String[] actual = manager.findALL();
        String[] expected = {"1", "2", "3"};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void test2() {
        AfishaManager manager = new AfishaManager();
        manager.add("1");
        manager.add("2");
        manager.add("3");
        manager.add("4");
        manager.add("5");
        manager.add("6");
        manager.add("7");
        manager.add("8");
        manager.add("9");

        String[] actual = manager.findLast();
        String[] expected = {"9", "8", "7", "6", "5", "4", "3", "2", "1"};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void test3() {
        AfishaManager manager = new AfishaManager();
        manager.add("1");
        manager.add("2");
        manager.add("3");
        manager.add("4");
        manager.add("5");
        manager.add("6");
        manager.add("7");
        manager.add("8");
        manager.add("9");
        manager.add("10");
        manager.add("11");

        String[] actual = manager.findLast();
        String[] expected = {
                "11",
                "10",
                "9",
                "8",
                "7",
                "6",
                "5",
                "4",
                "3",
                "2"
        };
        assertArrayEquals(expected, actual);
    }
}

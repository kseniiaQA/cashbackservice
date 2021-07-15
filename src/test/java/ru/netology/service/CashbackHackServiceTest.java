package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    private  CashbackHackService service = new CashbackHackService();
    @Test
    public void checkFor1Ruble() {


        assertEquals(CashbackHackService.remain(1), 999);
    }

    @Test
    public void checkFor999Ruble() {

        assertEquals(CashbackHackService. remain(999), 1);
    }

    @Test
    public void checkFor1000Ruble() {

        assertEquals(CashbackHackService.remain(1000), 0);
    }

    @Test
    public void checkFor1100Ruble() {

        assertEquals(CashbackHackService.remain(1100), 900);
    }
}

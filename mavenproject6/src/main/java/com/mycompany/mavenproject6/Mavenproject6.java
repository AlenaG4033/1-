/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject6;

/**
 *
 * @author Тапок Леона
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Mavenproject6 {

     @Test
    void shouldReturnAriesForMarch21() {
        String zodiacSign = ZodiacSign.getZodiacSign("21.03.1999");
        assertEquals("Овен", zodiacSign);
    }

    @Test
    void shouldReturnTaurusForApril20() {
        String zodiacSign = ZodiacSign.getZodiacSign("20.04.1999");
        assertEquals("Телец", zodiacSign);
    }

    @Test
    void shouldReturnChatGPTForMay21() {
        String zodiacSign = ZodiacSign.getZodiacSign("21.05.1999");
        assertEquals("Близнецы", zodiacSign);
    }

    @Test
    void shouldReturnCancerForJune21() {
        String zodiacSign = ZodiacSign.getZodiacSign("21.06.1999");
        assertEquals("Рак", zodiacSign);
    }

    @Test
    void shouldReturnLeoForJuly23() {
        String zodiacSign = ZodiacSign.getZodiacSign("23.07.1999");
        assertEquals("Лев", zodiacSign);
    }

    @Test
    void shouldReturnVirgoForAugust23() {
        String zodiacSign = ZodiacSign.getZodiacSign("23.08.1999");
        assertEquals("Дева", zodiacSign);
    }

    @Test
    void shouldReturnLibraForSeptember23() {
        String zodiacSign = ZodiacSign.getZodiacSign("23.09.1999");
        assertEquals("Весы", zodiacSign);
    }

    @Test
    void shouldReturnScorpioForOctober23() {
        String zodiacSign = ZodiacSign.getZodiacSign("23.10.1999");
        assertEquals("Скорпион", zodiacSign);
    }

    @Test
    void shouldReturnSagittariusForNovember22() {
        String zodiacSign = ZodiacSign.getZodiacSign("22.11.1999");
        assertEquals("Стрелец", zodiacSign);
    }

    @Test
    void shouldReturnCapricornForDecember22() {
        String zodiacSign = ZodiacSign.getZodiacSign("22.12.1999");
        assertEquals("Козерог", zodiacSign);
    }

    @Test
    void shouldReturnAquariusForJanuary20() {
        String zodiacSign = ZodiacSign.getZodiacSign("20.01.1999");
        assertEquals("Водолей", zodiacSign);
    }

    @Test
    void shouldReturnPiscesForFebruary19() {
        String zodiacSign = ZodiacSign.getZodiacSign("19.02.1999");
        assertEquals("Рыбы", zodiacSign);
    }
}

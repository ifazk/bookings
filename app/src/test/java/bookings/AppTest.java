/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bookings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appCanCreateDB() {
        java.io.File f = new java.io.File(App.defaultDB);
        if (f.exists()) {
            f.delete();
        }
        App.createNewDB(App.defaultDB);
        f = new java.io.File(App.defaultDB);
        assert(f.exists());
    }

    @Test void appDayStringNull() {
        String s = App.checkDayString(null);
        assertNull(s);
    }

    @Test void appDayStringBad1() {
        String s = App.checkDayString("14");
        assertNull(s);
    }

    @Test void appDayStringBad2() {
        String s = App.checkDayString("abc");
        assertNull(s);
    }

    @Test void appDayStringBad3() {
        String s = App.checkDayString(" ");
        assertNull(s);
    }

    @Test void appDayStringBad4() {
        String s = App.checkDayString("204-26-17");
        assertNull(s);
    }

    @Test void appDayStringGood1() {
        String s = App.checkDayString("2004-02-17");
        assertNotNull(s);
        assertEquals(s, "2004-02-17");
    }

    @Test void appDayStringGood2() {
        String s = App.checkDayString("2004-2-17");
        assertNotNull(s);
        assertEquals(s, "2004-02-17");
    }

    @Test void appTimeStringNull() {
        String s = App.checkTimeString(null);
        assertNull(s);
    }

    @Test void appTimeStringBad1() {
        String s = App.checkTimeString("abc");
        assertNull(s);
    }

    @Test void appTimeStringBad2() {
        String s = App.checkTimeString("10");
        assertNull(s);
    }

    @Test void appTimeStringBad3() {
        String s = App.checkTimeString("10:00:00");
        assertNull(s);
    }

    @Test void appTimeStringBad4() {
        String s = App.checkTimeString("44:00");
        assertNull(s);
    }

    @Test void appTimeStringGood1() {
        String s = App.checkTimeString("10:00");
        assertNotNull(s);
        assertEquals(s, "10:00:00");
    }
}
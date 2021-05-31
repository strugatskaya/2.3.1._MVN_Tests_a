import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateIfRegisteredAndUnderLimit() {

        BonusService service = new BonusService();
        long amount = 6666_00;
        boolean registered = true;
        long expected = 199;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateIfNotRegisteredUnderLimit() {

        BonusService service = new BonusService();
        long amount = 6666_00;
        boolean registered = false;
        long expected = 66;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateIfRegisteredAndOverLimit() {

        BonusService service = new BonusService();
        long amount = 2_000_000_60;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateIfNotRegisteredOverLimit() {

        BonusService service = new BonusService();
        long amount = 2_000_000_60;
        boolean registered = false;
        long expected = 500;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}
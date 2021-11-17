package test;

import org.junit.*;

public class MyTests {
    @Before
    public void init() {
        // test fixture; executed before each test
        // creation of required objects, program state, etc.
    }

    @Test
    public void testThis() {
        // a test
    }

    @Test
    public void testThat() {
        // another test
    }

    @After
    public void tearDown() {
        // executed after each test
    }
}

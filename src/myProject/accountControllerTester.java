package myProject;

import org.junit.*;

import static org.junit.Assert.*;

public class accountControllerTester {


    @Before
    public void setUp() {
        accountDB = Database.setValue();
    }

    @After
    public void tearDown() {
        accountDB.clear();
    }

    @Test
    void testLogInBehaviour() {
        assertEquals(expected :"2107002260", account.getUserID());

    }


}


package myProject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
    public void testLogInBehaviour() {
        assert

    }


}


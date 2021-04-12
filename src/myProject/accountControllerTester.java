package myProject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class accountControllerTester {

    private Account accountDB;
    private AccountController accountController;


    @Before
    public void setUp() {
        accountDB = new Account("2107002260", "Ragna", "Thorsdottir", "123", "rdt1@hi.is", "8637809", null, null);
    }

    @After
    public void tearDown() {
        accountDB = null;

    }

    @Test
    public void testLogInBehaviour() {
        assertEquals("2107002260", accountDB.getUserID());
        assertEquals("123", accountDB.getPassword());
    }

    @Test
    public void testNullLogInBehaviour() {
        assertEquals(" ", accountDB.getUserID());
        assertEquals(" ", accountDB.getPassword());
        fail("Ekkert slegid inn");
    }

    @Test
    public void testNewAccountBehaviour() {
        assertEquals(accountController.newAccount("2107002260", "Ragna", "Thorsdottir", "123",
                "rdt1@hi.is", "8637809", null, null), accountDB);
    }

    @Test
    public void testNullNewAccountBehaviour() {
        assertEquals(accountController.newAccount("", "", "", "",
                "", "", null, null), accountDB);
        fail("Ekkert slegid inn");

    }


}


package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "IdandPassword")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"", "123456", "An email address required."},
                {"abcd@gmail.com", "", "Password is required."},
                {"adfdfgfg", "123456", "Invalid email address."},
                {"abcd@gmail.com", "123456", "Authentication failed."},
        };
        return data;

    }

    @DataProvider(name = "validCredentials")
    public Object[][] validData() {
        Object[][] valid = new Object[][]{
                {"xyz786@gmail.com", "xyz786~",}

        };
        return valid;

    }
    @DataProvider(name = "logout")
    public Object[][] Data() {
        Object[][] valid = new Object[][]{
                {"xyz786@gmail.com", "xyz786~",}

        };
        return valid;

    }
    @DataProvider(name = "createnewaccount")
    public Object[][] info() {
        Object[][] valid = new Object[][]{
                {"xyz2345@gmail.com","xyz","abc","123456","22 harrow","london","21","01545","21","07453482366"}

        };
        return valid;

    }
    @DataProvider(name = "womenpagetest1")
    public Object[][] women() {
        Object[][] valid = new Object[][]{
                {"WOMEN"}

        };
        return valid;

    }

    @DataProvider(name = "womenpagetest2")
    public Object[][] women1() {
        Object[][] valid = new Object[][]{
                {"2","2","Product successfully added to your shopping cart"},
//                {"3","2","Product successfully added to your shopping cart"},
//                {"4","1","Product successfully added to your shopping cart"},
//                {"2","2","Product successfully added to your shopping cart"},

        };
        return valid;

    }



}

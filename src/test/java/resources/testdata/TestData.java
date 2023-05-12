package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "dataSet")
    public Object[][] dataSet() {
        Object[][] data = new Object[][]{
                {"Tester", "Harrow", "5 miles", "30000", "500000", "Per annum", "Permanent", "Permanent Tester jobs in Harrow on the Hill"},
                {"Presser", "London", "25 miles", "15000", "30000", "Per annum", "Permanent", "Permanent Presser jobs in London"},
                {"Store Manager", "Northamptonshire", "15 miles", "300", "600", "Per week", "Permanent", "Permanent Store Manager jobs in Northamptonshire"},
                {"It Administrator", "Warwick, Warwickshire", "15 miles", "40000", "80000", "Per annum", "Permanent", "Permanent It Administrator jobs in Warwick"},
                {"Network Manager", "Reading", "7 miles", "45000", "65000", "Per annum", "Permanent", "Permanent Network Manager jobs in Reading"},
                {"Test Analyst", "Peterborough", "10 miles", "45000", "55000", "Per annum", "Permanent", "Permanent Test Analyst jobs in Peterborough"},
                {"Test Manager", "Milton Keynes", "2 miles", "350", "700", "Per day", "Contract", "Contract Test Manager jobs in Milton Keynes"},
        };
        return data;
    }
}

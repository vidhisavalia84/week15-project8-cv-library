package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "jobsearch")
    public Object[][] getData(){

        String[][] data= new String[][]{
                {"Tester","Harrow","up to 5 miles","30000","50000","Per annum","Permanent","Permanent Tester jobs in Harrow on the Hill"},
                {"Tester","Barbican,Grater London","up to 5 miles","40000","60000","Per annum","Contract","Contract Tester jobs in Barbican"},
                {"Accounts Assistant","Harrow","up to 2 miles","1500","30000","Per week","Any","Accounts Assistant jobs in Harrow on the Hill"},
                {"Customer Service Advisor","Barbican, Greater London","up to 7 miles","25000","35000","Per annum","Any","Customer Service Advisor jobs in Barbican"},
                {"Health And Safety Advisor","Harrow","up to 5 miles","15000","20000","Per annum","Any","Health And Safety Advisor jobs in Harrow on the Hill"},
                {"Customer Assistant","watford","up to 10 miles","10000","25000","Per day","Part Time","Part Time Customer Assistant jobs in Watford"}

        };
        return data;
    }
}

package org.example;

import org.testng.annotations.Test;

public class DataProvider {
@Test(dataProvider = "dbtestdata")
    public void testDataProvider(int dataOne, int dataTwo){

System.out.println("data provider example"+dataOne+"-----"+dataTwo);
}
@org.testng.annotations.DataProvider(name = "dbtestdata")
public Object[][] newData(){
    return new Object[][] {
            {2,2},
            {3,5}
    };
}
}





package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class JunitAnnotations {



@Before

public void acilis(){

    System.out.println("Ilk calisir");
}
@After
public void kapanis(){

    System.out.println("son calisir");


}
    @Test
    public void jUnitIlkTest(){

        System.out.println("1.test calisti");
}

   @Test @Ignore
   public void jUnitIkinciTest(){

        System.out.println("2.test calisti");
    }


}

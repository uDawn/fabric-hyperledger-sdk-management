import org.junit.Test;

public class TestManagement {

    @Test
    public void test(){
        Management management = new Management();
        try{
            management.constructSetup();
            System.out.println("a : " + management.query("a"));
            System.out.println("b : " + management.query("b"));
            management.transfer("a" , "b" , "100.5");
            System.out.println("a : " + management.query("a"));
            System.out.println("b : " + management.query("b"));
            //management.reconstructSetup();
            //management.transfer("a" , "b" , "10");
            //management.query("a");
        }catch (Throwable throwable){
            throwable.getMessage();
        }
    }
}

import org.junit.Test;

public class TestManagement {

    public static void main(String[] args){
        Management management = new Management();
        try{
            management.constructSetup();
            management.transfer("a" , "b" , "10");
            management.query("a");
            //management.reconstructSetup();
            //management.transfer("a" , "b" , "10");
            //management.query("a");
        }catch (Throwable throwable){
            throwable.getMessage();
        }
    }
}

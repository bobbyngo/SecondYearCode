import  java.util.Random;

public class TestBoth extends AbstractTest{

    private String[] a = new String[2];
    private String[] b = {"a", "c", "a", "as"};
    private String[] c = new String[] {"as", "asdasd", "asdasd"};
    private Random random = new Random();


    public int generateRandom(int n){
        //random num from 0 -> n
        return random.nextInt(n);
    }

    public String[] getA() {
        return a;
    }

    public String[] getB() {
        System.out.println(b[0]);
        return b;
    }

    public String[] getC() {
        return c;
    }

    @Override
    public void dogSays() {
        System.out.println("wofff");
    }

    @Override
    public void catSays() {
        System.out.println("meow");
    }

    @Override
    public void benniSays() {
        System.out.println("bobby you are so cringe");
    }
}

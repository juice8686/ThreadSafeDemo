package yeildthread;

/**
 * @author chengyong
 * @time 2017/5/23 14:41
 * @des ${TODO}
 */

public class YieldThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int x = 0; x < 100; x++) {
            System.out.println(getName() + ":" + x);
            Thread.yield();
        }
    }
}

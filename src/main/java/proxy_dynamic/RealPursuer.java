package proxy_dynamic;


/**
 * @author lichenyi
 * @date 2017-7-10.
 */
public class RealPursuer implements Pursuer {
    @Override
    public void sendFollows() {
        System.out.println("真实的追求者的送美丽的鲜花");
    }
    @Override
    public void sendShoes() {
        System.out.println("真实的追求者的送最贵的鞋子");
    }
    @Override
    public void sendBag() {
        System.out.println("真实的追求者的送LV包包");
    }
}

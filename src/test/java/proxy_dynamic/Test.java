package proxy_dynamic;


/**
 * @author lichenyi
 * @date 2017-7-10.
 */
public class Test {
    public static void main(String args[]) {
        ProxyHandle proxyHandle = new ProxyHandle();
        RealPursuer realPursuer = (RealPursuer) proxyHandle.bind(new RealPursuer());
        realPursuer.sendBag();
    }
}

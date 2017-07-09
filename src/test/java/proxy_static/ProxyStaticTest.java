package proxy_static;


/**
 * @author lichenyi
 * @date 2017-7-10.
 */
public class ProxyStaticTest {
    public static void main(String args[]) {
        ProxyPursuer proxyPursuer = new ProxyPursuer(new RealPursuer());
        proxyPursuer.active();
    }
}

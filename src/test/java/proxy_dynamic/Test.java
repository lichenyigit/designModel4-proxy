package proxy_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author lichenyi
 * @date 2017-7-10.
 */
public class Test {
    public static void main(String args[]) {
        Pursuer pursuer = new RealPursuer();
        ProxyHandle proxyHandle = new ProxyHandle();
        pursuer = proxyHandle.bind(pursuer, proxyHandle);
        pursuer.sendBag();


        InvocationHandler proxyHandle1 = new ProxyHandle(pursuer);
        pursuer = (Pursuer) Proxy.newProxyInstance(proxyHandle1.getClass().getClassLoader(), pursuer.getClass().getInterfaces(), proxyHandle1);
        pursuer.sendFollows();
        pursuer.sendShoes();
    }
}

package proxy_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lichenyi
 * @date 2017-7-10.
 */
public class ProxyHandle implements InvocationHandler {

    private Object target;

    //绑定委托对象，并返回代理类
    public Object bind(Object target)
    {
        this.target = target;
        //绑定该类实现的所有接口，取得代理类
        return Proxy.newProxyInstance(RealPursuer.class.getClassLoader(),
                new Class[] {RealPursuer.class},
                new ProxyHandle());
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(target, args);
        return null;
    }
}

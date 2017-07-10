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

    public ProxyHandle(){
    }
    public ProxyHandle(Object target){
        this.target = target;
    }

    //绑定委托对象，并返回代理类
    public Pursuer bind(Object target, InvocationHandler proxyHandle)
    {
        this.target = target;
        Pursuer pursuer = (Pursuer) Proxy.newProxyInstance(proxyHandle.getClass().getClassLoader(), target.getClass().getInterfaces(), proxyHandle);
        return pursuer;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(target, args);
        return null;
    }
}

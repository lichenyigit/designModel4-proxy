package proxy_static;

/**
 * @author lichenyi
 * @date 2017-7-10.
 */
public class ProxyPursuer implements Pursuer {
    private Pursuer pursuer;
    public ProxyPursuer(Pursuer pursuer){
        this.pursuer = pursuer;
    }

    public void sendFollows() {
        this.pursuer.sendFollows();
    }

    public void sendShoes() {
        this.pursuer.sendShoes();
    }

    public void sendBag() {
        this.pursuer.sendBag();
    }

    public void active(){
        sendFollows();
        sendShoes();
        sendBag();
    }
}

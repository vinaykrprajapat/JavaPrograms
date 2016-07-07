package com.kogent.ejb;
import javax.ejb.Remote;
@Remote
public interface HelloRemote {
    public String hello(String h);
}

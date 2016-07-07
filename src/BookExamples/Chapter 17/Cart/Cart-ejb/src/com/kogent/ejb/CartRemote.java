package com.kogent.ejb;

import java.util.Collection;
import javax.ejb.Remote;


@Remote
public interface CartRemote {
    public void addItem(String item);
    public void removeItem(String item);
    public Collection getItems();
}

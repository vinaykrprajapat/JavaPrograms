package com.kogent.ejb;

import java.util.ArrayList;
import java.util.Collection;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

@Stateless
public class CartBean implements CartRemote {

    private ArrayList items;

    @PostConstruct
    public void initialize() {
        items = new ArrayList();
    }

    @SuppressWarnings("unchecked")
    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public Collection getItems() {
        return items;
    }
}

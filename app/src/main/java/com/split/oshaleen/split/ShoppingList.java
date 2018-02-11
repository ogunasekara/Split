package com.split.oshaleen.split;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    private String title;
    private List<String> items;

    public ShoppingList(){
        this.items = new ArrayList<>();
    }

    public ShoppingList(String title){
        this.title = title;
        this.items = new ArrayList<>();
    }

    public ShoppingList(String title, List<String> items){
        this.title = title;
        this.items = items;
    }

    public void addItem(String item){
        this.items.add(item);
    }

    public void removeItem(int pos){
        // return if trying to remove invalid items
        if (pos >= this.items.size()){ return; }
        if (pos < 0) { return; }

        this.items.remove(pos);
    }

    public String getItem(int pos){
        return this.items.get(pos);
    }

    public String getTitle(){
        return this.title;
    }

    public int getSize() { return this.items.size(); }
}

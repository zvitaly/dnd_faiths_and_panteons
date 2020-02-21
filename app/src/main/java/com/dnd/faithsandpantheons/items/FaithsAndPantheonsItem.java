package com.dnd.faithsandpantheons.items;

public class FaithsAndPantheonsItem {
    private String name;
    private String worldview;

    public FaithsAndPantheonsItem(String name, String worldview) {
        this.name = name;
        this.worldview = worldview;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorldview() {
        return worldview;
    }

    public void setWorldview(String worldview) {
        this.worldview = worldview;
    }
}

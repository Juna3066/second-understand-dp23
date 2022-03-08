package com.example.c01create.p05;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private List<String> buildingComponents = new ArrayList<>();

    public void setBasement(String basement) {
        this.buildingComponents.add(basement);
    }

    public void setWall(String wall) {
        this.buildingComponents.add(wall);
    }

    public void setRoof(String roof) {
        this.buildingComponents.add(roof);
    }

    @Override
    public String toString() {
        String buildStr = "";
        for (int i = buildingComponents.size() - 1; i >= 0; i--) {
            buildStr += buildingComponents.get(i);
        }
        return buildStr;
    }
}

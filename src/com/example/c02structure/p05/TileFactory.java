package com.example.c02structure.p05;

import java.util.HashMap;
import java.util.Map;

//享元的关键 享元工厂 无论绘制几次图片 加载图片的次数 最多是 图片的种类数 节省内存空间 提高地图绘制速度
public class TileFactory {
    //缓存图库
    private Map<String, Drawable> images;

    public TileFactory() {
        this.images = new HashMap<>();
    }

    //懒加载
    public Drawable getDrawable(String tile) {
        if (!this.images.containsKey(tile)) {
            switch (tile) {
                case "河流":
                    images.put(tile, new River());
                    break;
                case "草":
                    images.put(tile, new Grass());
                    break;
                case "石头":
                    images.put(tile, new Stone());
                    break;
                case "房子":
                    images.put(tile, new House());
                    break;
            }
        }

        return this.images.get(tile);
    }
}

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Andrey Sadriev aka AESFUI on 05.11.2016.
 */
public class Store {
    private ArrayList<Goods> goods;

    public ArrayList<Goods> list() {
        return goods;
    }

    public int quantity() {
        return goods.size();
    }

    public float averageWeight() {
        float weight = 0;
        for (Goods g : goods) {
            weight+= g.getWeight();
        }

        return weight / quantity();
    }

    public void colorStat() {
        HashMap<Color, Integer> colorAvailableList = new HashMap<Color, Integer>();

        Color color;
        for (Goods g : goods) {
            color = g.getColor();
            if (colorAvailableList.containsKey(color)) {
                colorAvailableList.put(color, colorAvailableList.get(color) + 1);
            } else {
                colorAvailableList.put(color, 1);
            }
        }

        for (Map.Entry<Color, Integer> entry : colorAvailableList.entrySet()) {
            Color c = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(c + " - " + value + " шт.");
        }
    }
}

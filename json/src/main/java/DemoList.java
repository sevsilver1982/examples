import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Founder;
import model.GeneralInfo;
import model.Restaurant;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class DemoList {

    public static void main(String[] args) {
        serialize();
        deserialize();
    }

    public static void serialize() {
        List<Restaurant.RestaurantMenuItem> menuItems = new ArrayList<>();
        menuItems.add(new Restaurant.RestaurantMenuItem("Steak", 20f));
        menuItems.add(new Restaurant.RestaurantMenuItem("Spaghetti", 5f));
        menuItems.add(new Restaurant.RestaurantMenuItem("Steak", 10f));

        Restaurant restaurant = new Restaurant("Future Studio Steakhouse", menuItems);

        String json = new Gson().toJson(restaurant);
    }

    public static void deserialize() {
        String foundersJson = "[{'name': 'user1','flowerCount': 1},{'name': 'user2','flowerCount': 2},{'name': 'user3','flowerCount': 3}]";
        String restaurant = "{'name':'Future Studio Steakhouse','website':'https://futurestud.io','founders': [{'name': 'user1','flowerCount': 1},{'name': 'user2','flowerCount': 2},{'name': 'user3','flowerCount': 3}]}";

        Founder[] founders1 = new Gson().fromJson(foundersJson, Founder[].class);
        System.out.println(founders1);

        Type foundListType = new TypeToken<ArrayList<Founder>>(){}.getType();
        List<Founder> founders2 = new Gson().fromJson(foundersJson, foundListType);
        System.out.println(founders2);

        GeneralInfo founders3 = new Gson().fromJson(restaurant, GeneralInfo.class);
        System.out.println(founders2);
    }

}

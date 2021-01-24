package model;

import java.util.List;

public class Restaurant {
    private String name;
    private List<RestaurantMenuItem> items;

    public Restaurant(String name, List<RestaurantMenuItem> items) {
        this.name = name;
        this.items = items;
    }

    public static class RestaurantMenuItem {
        private String name;
        private Float price;

        public RestaurantMenuItem(String name, Float price) {
            this.name = name;
            this.price = price;
        }

    }

}

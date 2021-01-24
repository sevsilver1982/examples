import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.User;

public class DemoSimple {

    public static void main(String[] args) {
        serializeUser();
        deserializeUser();
    }

    public static void serializeUser() {
        User user = new User(
                "silver",
                "suvorovev@mail.ru",
                null,
                true
                );
        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();

        String json = gson.toJson(user);
    }

    public static void deserializeUser() {
        String json = "{'full_name':'sev','age':38,'isDeveloper':true}";
        Gson gson = new Gson();
        User user = gson.fromJson(json, User.class);
        System.out.println(user);
    }

}

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import serializer.BooleanToIntAdapter;
import serializer.SimpleClass;

public class DemoBooleanToInt {

    public static void main(String[] args) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        BooleanToIntAdapter booleanToIntAdapter = new BooleanToIntAdapter();
        gsonBuilder.registerTypeAdapter(Boolean.class, booleanToIntAdapter); // !!!
        gsonBuilder.registerTypeAdapter(boolean.class, booleanToIntAdapter); // !!!
        Gson gson = gsonBuilder.create();

        System.out.println(
                "custom serializer boolean to int: \n" +
                        gson.toJson(new SimpleClass(true, false, true, false, true))
        );

        String testStr = "{'param1':1,'param2':0,'param3':1,'param4':0}";
        SimpleClass cc = gson.fromJson(testStr, SimpleClass.class);
        System.out.println(
                "\ncustom deserializer int to boolean: \n" +
                        cc.toString()
        );
    }

}

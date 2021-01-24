package serializer;

import com.google.gson.*;

import java.lang.reflect.Type;

public class BooleanToIntAdapter implements JsonSerializer<Boolean>, JsonDeserializer<Boolean> {

    @Override
    public JsonElement serialize(Boolean src, Type typeOfSrc, JsonSerializationContext context) {
        return Boolean.TRUE.equals(src) ? new JsonPrimitive(1) : new JsonPrimitive(0);
    }

    @Override
    public Boolean deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return json.getAsInt() == 1;
    }

}

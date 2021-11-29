package utils.json;

import com.google.gson.JsonObject;

import java.util.Map;

public abstract class JsonObjectBuilder {
    private String objectString;
    private Map<String, Object> object;

    public JsonObjectBuilder(String objectString) {
        this.objectString = objectString;
    }

    public JsonObjectBuilder(JsonObject jsonObject) {
        this.objectString = jsonObject.toString();
    }

    public void build() {
        objectString.split("a");
    }

    public String beautify() {
        return objectString;
    }
}

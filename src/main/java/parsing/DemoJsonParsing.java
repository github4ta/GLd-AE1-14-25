package parsing;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class DemoJsonParsing {

    public static void main(String[] args) {
        String json = """
                """;

        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();

        var errorsArray = jsonObject.getAsJsonArray("errors");

        JsonObject firstError = errorsArray.get(0).getAsJsonObject();


    }
}
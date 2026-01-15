package parsing;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class DemoJsonParsing {
    public static void main(String[] args) {
        String json = """
                {
                    "errors": [
                        {
                            "message": "400: Bad Request",
                            "locations": [
                                {
                                    "line": 2,
                                    "column": 3
                                }
                            ],
                            "path": [
                                "passwordLogin"
                            ],
                            "extensions": {
                                "errors": {
                                    "ui": [
                                        {
                                            "id": 4000006,
                                            "text": "Incorrect email or password. Please enter them again.",
                                            "type": "error"
                                        }
                                    ]
                                },
                                "code": "BAD_REQUEST"
                            }
                        }
                    ],
                    "data": null
                }
                """;
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
        Object value = jsonObject.get("data");
        System.out.println(value);
    }
}

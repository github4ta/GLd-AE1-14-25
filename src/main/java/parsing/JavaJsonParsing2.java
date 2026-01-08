package parsing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaJsonParsing2 {
    public static void main(String[] args) {
        String json = """
                {
                    "code": "AUT0017",
                    "message": "authentication failed",
                    "label": {
                        "text": "Такого профиля не существует"
                    },
                    "http": {
                        "code": 401,
                        "message": "Unauthorized"
                    }
                }
                """;

        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode;
        try{
            rootNode = mapper.readTree(json);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        //boolean value= rootNode.get("result").booleanValue();

        String code = rootNode.get("http").get("code").toString();
        //System.out.println(value);
        System.out.println(code);
    }
}

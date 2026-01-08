package parsing;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Parsing {
    public static void main(String[] args) {
        String json = """
    {
    "phone_number": [
        "data_not_valid"
    ],
    "password": [
        "data_not_valid"
    ]
}
                """;

        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNote;
        try {
            rootNote = mapper.readTree(json);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

      //  boolean value = rootNote.get("result").booleanValue();
        String password = rootNote.get("password").get(0).toString();
        System.out.println(password);
    }
}

package parsing;


import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;

public class JavaJsonParsing2 {
    public static void main(String[] args) {
        String json = """
                {
                    "result": false,
                    "errorType": null,
                    "errors": [
                        "E-mail/ телефон или пароль указаны неверно."
                    ],
                    "errorCode": null,
                    "authResponse": null,
                    "message": "E-mail/ телефон или пароль указаны неверно.",
                    "data": {
                        "wasSend": false,
                        "secondsBeforeResending": 0,
                        "needCaptchaToken": false,
                        "lockReason": "",
                        "error": "E-mail/ телефон или пароль указаны неверно."
                    }
                }
                """;


        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode;
        try {
            rootNode = mapper.readTree(json);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        boolean value = rootNode.get("result").booleanValue();

        String error = rootNode.get("data").get("error").toString();
        System.out.println(value);
        System.out.println(error);

    }
}

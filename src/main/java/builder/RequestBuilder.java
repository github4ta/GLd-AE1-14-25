package builder;

import java.util.HashMap;
import java.util.Map;

public class RequestBuilder {
    private Map<String, String> headers;
    private String body;
    private Map<String, String> queryParams;
    private String url;
    private String method;

    public RequestBuilder() {
        headers = new HashMap<>();
        body = "";
        queryParams = new HashMap<>();
        url = "";
        method = "";
    }

    public RequestBuilder addHeader(String header, String value) {
        headers.put(header, value);
        return this;
    }

    public ReQuestPublic build() {
        return new ReQuestPublic(headers, body, queryParams, url, method);
    }
}

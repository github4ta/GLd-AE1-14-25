package builder;

import java.util.Map;

public class ReQuestPublic {
    private Map<String, String> headers;
    private String body;
    private Map<String, String> queryParams;
    private String url;
    private String method;

    public ReQuestPublic(Map<String, String> headers, String body, Map<String, String> queryParams, String url, String method) {
        this.headers = headers;
        this.body = body;
        this.queryParams = queryParams;
        this.url = url;
        this.method = method;
    }

    @Override
    public String toString() {
        return "ReQuestPublic{" +
                "headers=" + headers +
                ", body='" + body + '\'' +
                ", queryParams=" + queryParams +
                ", url='" + url + '\'' +
                ", method='" + method + '\'' +
                '}';
    }
}

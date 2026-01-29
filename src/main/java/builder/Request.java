package builder;

import java.util.HashMap;
import java.util.Map;

public class Request {
    private Map<String, String> headers;
    private String body;
    private Map<String, String> queryParams;
    private String url;
    private String method;

    public Request(Map<String, String> headers, String body, Map<String, String> queryParams, String url, String method) {
        this.headers = headers;
        this.body = body;
        this.queryParams = queryParams;
        this.url = url;
        this.method = method;
    }

    @Override
    public String toString() {
        return "Request{" +
                "headers=" + headers +
                ", body='" + body + '\'' +
                ", queryParams=" + queryParams +
                ", url='" + url + '\'' +
                ", method='" + method + '\'' +
                '}';
    }

    public static class RequestBuilder {
        private Map<String, String> headers = new HashMap<>();
        private String body;
        private Map<String, String> queryParams;
        private String url;
        private String method;

        public RequestBuilder() {

        }

        public RequestBuilder addHeader(String header, String value) {
            headers.put(header, value);
            return this;
        }

        public Request build() {
            return new Request(headers, body, queryParams, url, method);
        }
    }
}

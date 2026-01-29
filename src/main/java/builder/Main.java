package builder;

public class Main {
    public static void main(String[] args) {
        Request.RequestBuilder requestBuilder = new Request.RequestBuilder();
        Request request = requestBuilder
                .addHeader("Content-Type", "text")
                .build();

        System.out.println(request);

        RequestBuilder requestBuilder1 = new RequestBuilder();
        ReQuestPublic request1 = requestBuilder1
                .addHeader("Cookies", "24294294290")
                .build();

        System.out.println(request1);
    }
}

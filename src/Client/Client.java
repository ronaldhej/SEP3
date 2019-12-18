package Client;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.http.json.JsonHttpContent;
import com.google.api.client.json.jackson2.JacksonFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Client {
    private String url;
    private HttpRequestFactory requestFactory;

    public Client() {
        this.url = "https://localhost:44368/api/User";
        requestFactory
                = new NetHttpTransport().createRequestFactory();
    }


    public void getPrint() throws IOException {
        HttpRequest request = requestFactory.buildGetRequest(
                new GenericUrl(url)
        );
        String rawResponse = request.execute().parseAsString();
        System.out.println(rawResponse);
    }


    public String getUserByID(String Id) throws IOException {
        HttpRequest request = requestFactory.buildGetRequest(
                new GenericUrl(url+"/"+Id)
        );
        return request.execute().parseAsString();
    }

    public String get() throws IOException {
        HttpRequest request = requestFactory.buildGetRequest(
                new GenericUrl(url)
        );
        return request.execute().parseAsString();
    }

    public void postCreateNewUser(String Id, String name) throws IOException {
        Map<String, String> json = new HashMap<String, String>();
        json.put("Id", Id);
        json.put("Name", name);
        HttpContent httpContent = new JsonHttpContent(new JacksonFactory(), json);
        HttpRequest requestPost = requestFactory.buildPostRequest(
                new GenericUrl(url),httpContent
        );
        requestPost.execute();
    }

    public void deleteUserByID(String Id) throws IOException {
        HttpRequest delete =
                requestFactory.buildDeleteRequest(new GenericUrl(url+"/"+Id));
        delete.execute();
    }
}

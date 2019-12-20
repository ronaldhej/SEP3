package Client;
import Model.BacklogItemEntity;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.http.json.JsonHttpContent;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {

    private String url;
    private HttpRequestFactory requestFactory;

    public Client() {
        this.url = "http://localhost:54206/api/Sprint/";
        requestFactory
                = new NetHttpTransport().createRequestFactory();
    }

    public void PostSprint(String name, String contributor, String Id) throws IOException {
        Map<String, String> json = new HashMap<String, String>();
        json.put("contributor", contributor);
        json.put("Id",Id);
        json.put("name",name);
        Gson gson = new Gson();
        HttpContent httpContent = new JsonHttpContent(new JacksonFactory(), "a");
        HttpRequest requestPost = requestFactory.buildPostRequest(
                new GenericUrl(url+"PostSprint"),httpContent);
        requestPost.execute();
    }
    public void PostEmployee(String name, String password) throws IOException {
        Map<String, String> json = new HashMap<String, String>();
        json.put("name", name);
        json.put("password",password);
        HttpContent httpContent = new JsonHttpContent(new JacksonFactory(), json);
        HttpRequest requestPost = requestFactory.buildPostRequest(
                new GenericUrl(url+"PostEmployee"),httpContent);
        requestPost.execute();
    }
    public void DeleteSprint(String id) throws IOException {
        HttpRequest delete =
                requestFactory.buildDeleteRequest(new GenericUrl(url+"DeleteSprint/"+id));
        delete.execute();
    }
    public void AddEmployee(String name, String password) throws IOException {
        Map<String, String> json = new HashMap<String, String>();
        json.put("password", password);
        json.put("name",name);
        HttpContent httpContent = new JsonHttpContent(new JacksonFactory(), json);
        HttpRequest requestPost = requestFactory.buildPostRequest(
                new GenericUrl(url+"PostEmployee"),httpContent);
        requestPost.execute();
    }
    public void RemoveSprint(String id) throws IOException {
        HttpRequest delete =
                requestFactory.buildDeleteRequest(new GenericUrl(url+"RemoveSprintById/"+id));
        delete.execute();
    }
    public String GetSprint(String id) throws IOException {
        HttpRequest request = requestFactory.buildGetRequest(
                new GenericUrl(url+"GetSprintbyID"+id));
        return request.execute().parseAsString();
    }
    public void AssignToTeam(String id, String AssignedToTeam) throws IOException {
        Map<String, String> json = new HashMap<String, String>();
        json.put("id", id);
        json.put("AssignedToTeam",AssignedToTeam);
        HttpContent httpContent = new JsonHttpContent(new JacksonFactory(), json);
        HttpRequest requestPost = requestFactory.buildPostRequest(
                new GenericUrl(url+"AssignToTeam"),httpContent);
        requestPost.execute();
    }
    public void AssignToPerson(String id, String AssignedToTeam) throws IOException {
        Map<String, String> json = new HashMap<String, String>();
        json.put("id", id);
        json.put("AssignedToTeam",AssignedToTeam);
        HttpContent httpContent = new JsonHttpContent(new JacksonFactory(), json);
        HttpRequest requestPost = requestFactory.buildPostRequest(
                new GenericUrl(url+"AssignToPerson"),httpContent);
        requestPost.execute();
    }
    public String GetSprintByTeam(String id) throws IOException {
        HttpRequest request = requestFactory.buildGetRequest(
                new GenericUrl(url+"GetSprintbyID"+id));

        String rawResponse = request.execute().parseAsString();
        return rawResponse;

    }
    public String GetSprintByPerson(int id) throws IOException {
        HttpRequest request = requestFactory.buildGetRequest(
                new GenericUrl(url+"GetSprintByPerson"+id));

        String rawResponse = request.execute().parseAsString();
        return rawResponse;
    }
    public String CheckPassword(String EmployeeId, String Password) throws IOException {
        Map<String, String> json = new HashMap<String, String>();
        json.put("id", EmployeeId);
        json.put("Password",Password);
        HttpContent httpContent = new JsonHttpContent(new JacksonFactory(), json);
        HttpRequest requestPost = requestFactory.buildPostRequest(
                new GenericUrl(url+"CheckPassword"),httpContent);
        requestPost.execute();
        return requestPost.execute().parseAsString();
    }
    public void AddEmployee2(String name, String password) throws IOException {
        Map<String, String> json = new HashMap<String, String>();
        json.put("Name", name);
        json.put("Password",password);
        HttpContent httpContent = new JsonHttpContent(new JacksonFactory(), json);
        HttpRequest requestPost = requestFactory.buildPostRequest(
                new GenericUrl(url+"AddEmployee"),httpContent);
        requestPost.execute();

    }
    public void RemoveEmployee(String id) throws IOException {
        HttpRequest delete =
                requestFactory.buildDeleteRequest(new GenericUrl(url+"RemoveEmployee/"+id));
        delete.execute();
    }
    public String GetOneEmployee(String id) throws IOException {
        HttpRequest request = requestFactory.buildGetRequest(
                new GenericUrl(url+"GetOneEmployee"+id));

        String rawResponse = request.execute().parseAsString();
        return rawResponse;
    }
    public String GetAllEmployees() throws IOException {
        HttpRequest request = requestFactory.buildGetRequest(
                new GenericUrl(url+"GetAllEmployees"));

        String rawResponse = request.execute().parseAsString();
        return rawResponse;
    }
    public void CreateBacklog(List<BacklogItemEntity> items) throws IOException {
        HttpRequest request = requestFactory.buildGetRequest(
                new GenericUrl(url+"CreateBacklog"));

        request.execute();
    }


}

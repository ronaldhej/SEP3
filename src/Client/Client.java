import com.google.gson.Gson;

import java.io.PrintWriter;
import java.net.Socket;


public class Client {

    public static void main(String[] args) {
        Socket socket;
        try {
            socket = new Socket( "127.0.0.1", 2000);
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            EmployeeEntity emp = new EmployeeEntity();
            emp.FirstName = "Bartek";
            AddEmployeeRequest reg = new AddEmployeeRequest();
            reg.Employee = emp;
            Gson gson = new Gson();
            JsonPackage Jpackage = new JsonPackage();
            Jpackage.Type = "AddRequest";
            Jpackage.Content = reg;
            String employee = gson.toJson(Jpackage);
            writer.print(employee);
            writer.flush();
            writer.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using WebApp.SocketClient.Model;
using WebApp.SocketClient.Requests;
using Newtonsoft.Json;

namespace WebApp.SocketClient.JsonHandler
{
    public class EmployeeJsonHandler
    {

        public String Add(String name)
        {

            EmployeeEntity employee = new EmployeeEntity();
            employee.SetValues(name);
            JsonPackage package = new JsonPackage();
            AddEmployeeRequest emp = new AddEmployeeRequest();
            emp.Employee = employee;
            package.Type = "AddRequest";
            package.Content = emp;
            String jsonpackage = JsonConvert.SerializeObject(package);

            return jsonpackage;


        }

        public string Remove(String id)
        {
            EmployeeEntity employee = new EmployeeEntity();
            employee.setId(id);
            JsonPackage package = new JsonPackage();
            AddEmployeeRequest emp = new AddEmployeeRequest();
            emp.Employee = employee;
            package.Type = "RemoveRequest";
            package.Content = emp;
            String jsonpackage = JsonConvert.SerializeObject(package);

            return jsonpackage;
        }

        public string GetOne(String id)
        {
            EmployeeEntity employee = new EmployeeEntity();
            employee.setId(id);
            JsonPackage package = new JsonPackage();
            AddEmployeeRequest emp = new AddEmployeeRequest();
            emp.Employee = employee;
            package.Type = "GetOneRequest";
            package.Content = emp;
            String jsonpackage = JsonConvert.SerializeObject(package);


            return jsonpackage;
        }


    }
}

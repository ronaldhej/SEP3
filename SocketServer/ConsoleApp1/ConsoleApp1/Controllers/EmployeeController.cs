using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Viaven.Requests;
using Newtonsoft.Json;
using System.Net.Sockets;
using Viaven;
using System.Net;
using System.Net.Sockets;

namespace Viaven.Controllers

{
    class EmployeeController
    {

        const int PORT_NO = 2000;
        const string SERVER_IP = "127.0.0.1";
        AsynchronousSocketListener socket = new AsynchronousSocketListener(); 


        public void HandleRequests(string json, Socket handler)

        {
            var request = JsonConvert.DeserializeObject <JsonPackage>(json);

            switch (request.Type)
            {
                case ("AddRequest"):
                    EmployeeDatabaseController.AddNewEmployee((request.Content.ToObject<EmployeeRequest>()).Employee);
                    break;
                case ("RemoveRequest"):
                    EmployeeDatabaseController.RemoveEmployee((request.Content.ToObject<EmployeeRequest>()).Employee);
                    break;
                case ("GetOneRequest"):
                    String toSend = EmployeeDatabaseController.GetOneEmployee((request.Content.ToObject<EmployeeRequest>()).Employee);
                    //socketListener.Send(handler ,toSend);
                    break;
                case ("GetEmployees"):

                    break;
                case ("CheckPassword"):
                    String verification = EmployeeDatabaseController.CheckPassword((request.Content.ToObject<EmployeeRequest>()).Employee);
                    socket.Send(handler, verification);
                    

                    break;

                

            }
        }

    }
}

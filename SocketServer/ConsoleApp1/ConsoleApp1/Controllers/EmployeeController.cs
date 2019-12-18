using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Viaven.Requests;
using Newtonsoft.Json;
using System.Net.Sockets;
using Viaven;

namespace Viaven.Controllers

{
    class EmployeeController
    {

        public Socket workSocket = null;
        public const int BufferSize = 1024;
        public byte[] buffer = new byte[BufferSize];
        public StringBuilder sb = new StringBuilder();
        StateObject state = new StateObject();
        AsynchronousSocketListener socketListener = new AsynchronousSocketListener();
        public void HandleRequests(string json)

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
                    Socket handler = state.workSocket;
                    socketListener.Send(handler ,toSend);
                    break;
                case ("GetEmployees"):

                    break;
                case ("CheckPassword"):
                    String verification = EmployeeDatabaseController.CheckPassword((request.Content.ToObject<EmployeeRequest>()).Employee);
                    Socket handle = state.workSocket;
                    socketListener.Send(handle, verification);
                    break;

                

            }
        }

    }
}

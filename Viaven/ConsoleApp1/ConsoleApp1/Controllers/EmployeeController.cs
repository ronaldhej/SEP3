using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Viaven.Requests;
using Newtonsoft.Json;
namespace Viaven.Controllers
{
    class EmployeeController
    {
        public void HandleRequest(string json)
        {
            var request = JsonConvert.DeserializeObject <JsonPackage>(json);

            switch (request.Type)
            {
                case ("AddRequest"):
                    DbContext.AddNewEmployee((request.Content.ToObject<AddEmployeeRequest>()).Employee);
                    break;
                //case ("RemoveRequest"):
                //    DbContext.RemoveEmployee(((RemoveEmployeeRequest)request.Content).Id);
                 //   break;

            }
        }


        public void AddEmployee(AddEmployeeRequest emp)
        {
            
        }
    }
}

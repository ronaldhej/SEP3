using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Viaven.Requests;
using Newtonsoft.Json;


namespace Viaven.Controllers
{
    class RequestHandler



    {
        EmployeeController empController = new EmployeeController();
        SprintController sprController = new SprintController();

        public void ForwardRequest(string json)
        {
            var request = JsonConvert.DeserializeObject<JsonPackage>(json);

            switch (request.ForwardTo)
            {
                case ("EmployeeController"):
                    empController.HandleRequests(json);
                    break;
                case ("SprintController"):
                    sprController.HandleRequest(json);
                    break;

            }
        }

    }
}

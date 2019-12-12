using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Viaven.Requests;
using Newtonsoft.Json;
using Viaven.Requests.SprintRequests;


namespace Viaven.Controllers
{
    class SprintController
    {
        public void HandleRequest(string json)
        {
            var request = JsonConvert.DeserializeObject<JsonPackage>(json);

            switch (request.Type)
            {
                case ("AddRequest"):
                    SprintDatabaseController.AddNewSprint((request.Content.ToObject<AddSprintRequest>()).Sprint);
                    break;
                case ("RemoveRequest"):
                     //SprintDatabaseController.RemoveSprint((request.Content.ToObject<RemoveSprintRequest>()).Sprint);
                    break;

            }
        }

    }
}

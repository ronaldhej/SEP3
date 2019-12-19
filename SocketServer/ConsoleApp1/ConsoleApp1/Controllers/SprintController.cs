using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Viaven.Requests;
using Newtonsoft.Json;
using System.Net;
using System.Net.Sockets;


namespace Viaven.Controllers
{
    class SprintController
    {
        public void HandleRequest(string json, Socket handler)
        {
            var request = JsonConvert.DeserializeObject<JsonPackage>(json);

            switch (request.Type)
            {
                case ("AddRequest"):
                    SprintDatabaseController.AddNewSprint((request.Content.ToObject<SprintRequest>()).Sprint);
                    break;
                case ("RemoveRequest"):
                     //SprintDatabaseController.RemoveSprint((request.Content.ToObject<RemoveSprintRequest>()).Sprint);
                    break;
                case ("AssignRequest"):
                    SprintDatabaseController.AssignToTeam((request.Content.ToObject<SprintRequest>().Sprint.Id));
                    break;

            }
        }

    }
}

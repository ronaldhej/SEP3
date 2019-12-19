using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Viaven.Requests;
using Newtonsoft.Json;
using Viaven.Requests;
using Viaven.Entities;
using System.Net;
using System.Net.Sockets;

namespace Viaven.Controllers
{
    class BacklogController
    {
        public void HandleRequest(string json, Socket handler)
        {
            var request = JsonConvert.DeserializeObject<JsonPackage>(json);

            switch (request.Type)
            {
                case ("CreateRequest"):
                    BacklogEntity backlogEntity = new BacklogEntity();
                    backlogEntity = request.Content.ToObject<BacklogRequest>().backlogEntity;
                    BacklogDatabaseController.CreateBacklog(backlogEntity);
                    break;
                case ("RemoveRequest"):
                    //BacklogDatabaseController.RemoveSprint((request.Content.ToObject<RemoveSprintRequest>()).Sprint);
                    break;

            }
        }

    }
}

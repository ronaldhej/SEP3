using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using WebApp.SocketClient.Model;
using Newtonsoft.Json;
using WebApp.SocketClient.Requests;

namespace WebApp.SocketClient.JsonHandler
{
    public class SprintJsonHandler
    {

        public String Add(String name, String contributor, String id)

        {
            SprintRequest sprintRequest = new SprintRequest();
            SprintEntity sprint = new SprintEntity();
            sprint.SetValues(name, contributor, id);
            sprintRequest.sprint = sprint;
            JsonPackage package = new JsonPackage();
            package.Type = "AddRequest";
            package.ForwardTo = "SprintController";
            package.Content = sprintRequest;
            String jsonpackage = JsonConvert.SerializeObject(package);

            return jsonpackage;


        }

    }
}

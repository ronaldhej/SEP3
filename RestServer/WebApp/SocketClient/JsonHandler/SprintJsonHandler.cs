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

        public String Add(String name, String task, String id)

        {
            SprintRequest sprintRequest = new SprintRequest();
            SprintEntity sprint = new SprintEntity();
            sprint.SetValues(name, task, id);
            sprintRequest.sprint = sprint;
            JsonPackage package = new JsonPackage();
            package.Type = "AddRequest";
            package.ForwardTo = "SprintController";
            package.Content = sprintRequest;
            String jsonpackage = JsonConvert.SerializeObject(package);

            return jsonpackage;


        }

        public string AssignToTeam(string id, )
        {

            SprintRequest sprintRequest = new SprintRequest();
            SprintEntity sprint = new SprintEntity();
            sprint.Id = id;
            sprintRequest.sprint = sprint;
            JsonPackage package = new JsonPackage();
            package.Type = "AssignToTeamRequest";
            package.ForwardTo = "SprintController";
            package.Content = sprintRequest;
            String jsonpackage = JsonConvert.SerializeObject(package);

            return jsonpackage;


        }

    }
}

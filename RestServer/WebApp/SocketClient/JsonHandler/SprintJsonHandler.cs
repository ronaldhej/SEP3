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

        public String Add(String name, String task)

        {
            SprintRequest sprintRequest = new SprintRequest();
            SprintEntity sprint = new SprintEntity();
            sprint.SetValues(name, task);
            sprintRequest.sprint = sprint;
            JsonPackage package = new JsonPackage();
            package.Type = "AddRequest";
            package.ForwardTo = "SprintController";
            package.Content = sprintRequest;
            String jsonpackage = JsonConvert.SerializeObject(package);

            return jsonpackage;


        }

        public string AssignToTeam(string id, string AssginedToTeam)
        {

            SprintRequest sprintRequest = new SprintRequest();
            SprintEntity sprint = new SprintEntity();
            sprint.Id = id;
            sprint.AssignedToTeam = AssginedToTeam;
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

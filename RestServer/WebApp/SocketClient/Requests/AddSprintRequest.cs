using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using WebApp.SocketClient.Model;
using Newtonsoft.Json;

namespace WebApp.SocketClient.Requests
{
    public class AddSprintRequest
    {

        public String get(String name, String contributor, int id)
        {

            SprintEntity sprint = new SprintEntity();
            sprint.SetValues(name, contributor, id);
            JsonPackage package = new JsonPackage();
            package.Type = "AddRequest";
            package.Content = sprint;
            String jsonpackage = JsonConvert.SerializeObject(package);

            return jsonpackage;


        }

    public SprintEntity sprint = new SprintEntity();

    }
}

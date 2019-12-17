using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace WebApp.SocketClient.Model
{
    public class SprintEntity
    {

        public string Name { get; set; }
        public string Id { get; set; }
        public string Task { get; set; }
        public string AssignedToTeam { get; set; }
        public string AssginedToPerson { get; set; }
        public string status { get; set; }

        public void SetValues(string Name, string Task)
        {
            this.Name = Name;
            this.Task = Task;

        }



    }

    
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace WebApp.SocketClient.Model
{
    public class SprintEntity
    {

        public String Name { get; set; }
        public String Id { get; set; }
        public String Contributor { get; set; }

        public void SetValues(String name, String Contributor, String Id)
        {
            this.Name = name;
            this.Id = Id;
            this.Contributor = Contributor;
        }

    }

    
}

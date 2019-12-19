using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Viaven.Entities
{
    public class SprintEntity
    {
        public string Name { get; set; }
        public string Task { get; set; }
        public string Id { get; set; }
        public string AssignedToTeam { get; set; }
        public string AssignedToPerson { get; set; }
        public string BacklogId { get; internal set; }
    }
}

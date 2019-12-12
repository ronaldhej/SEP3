using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace WebApp.Data
{
    public class Sprint
    {
        public int Id { get; set; }
        public string Target { get; set; }
        public string Contributor { get; set; }
        public string Comment { get; set; }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Newtonsoft.Json.Linq;
using Viaven.Entities;

namespace Viaven.Requests
{
    class EmployeeRequest
    {
        public EmployeeEntity Employee;

        public static implicit operator JObject(EmployeeRequest v)
        {
            throw new NotImplementedException();
        }
    }
}

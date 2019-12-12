using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using WebApp.Data;
using WebApp.Client;


namespace WebApp.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class EmployeeController : ControllerBase
    {

        private readonly EmployeeContext _context;

        public EmployeeController(EmployeeContext context)
        {
            _context = context;
        }


        // GET: api/Employee/5


        // POST: api/Employee
        [HttpPost]
        public void PostEmployee(String name, String contributor, int id)
        {
            Client.Client cl = new Client.Client();
            cl.AddEmployee();

        }

        // DELETE: api/Sprints1/5
        [HttpDelete("{id}")]
        public void DeleteSprint(int id)
        {

            Client.Client cl = new Client.Client();
            cl.RemoveEmployee();

        }

       
    }
}

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
    public class SprintController : ControllerBase
    {

        private readonly SprintContext _context;

        public SprintController(SprintContext context)
        {
            _context = context;
        }


        // POST: api/Sprints1/
        [HttpPost("{name, contributor, id}")]
        public void PostSprint(String name, String contributor, String Id)
        {
            Client.Client cl = new Client.Client();
            cl.AddSprint(name, contributor, Id);
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

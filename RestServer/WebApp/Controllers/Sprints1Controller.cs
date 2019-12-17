using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using WebApp.Data;
using WebApp.Client;
using WebApp.SocketClient.Model;

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
        [HttpPost]
        public void PostSprint(String name, String contributor, String Id)
        {
            List<BacklogItemEntity> items = new List<BacklogItemEntity>();
            BacklogItemEntity backlogItem = new BacklogItemEntity();
            BacklogItemEntity backlogItem2 = new BacklogItemEntity();
            backlogItem.task = "lol";
            backlogItem.points = "a";
            backlogItem2.task = "xd";
            backlogItem2.points = "5";
            items.Add(backlogItem);
            items.Add(backlogItem2);
            Client.SocketRouter cl = new Client.SocketRouter();
            cl.CreateBacklog(items);

        }

        // DELETE: api/Sprints1/5
        [HttpDelete("{id}")]
        public void DeleteSprint(int id)
        {

            Client.SocketRouter cl = new Client.SocketRouter();


        }

    }
}

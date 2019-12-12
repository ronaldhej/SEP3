using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace WebApp.Data
{
    public class SprintContext : DbContext
    {
        public SprintContext(DbContextOptions<SprintContext> options) : base(options) { }
        public DbSet<Sprint> Sprints { get; set; }
    }
}

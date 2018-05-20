using System;
using ExeAvaliativo.Entidades;
using System.Configuration;
using Microsoft.Data.Entity;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExeAvaliativo {
    public class EntidadesContext : DbContext {
        public DbSet<Aluno> Alunos { get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            string stringConexao = ConfigurationManager.ConnectionStrings["dbExeAvaliativo"].ConnectionString;
            optionsBuilder.UseSqlServer(stringConexao);
            base.OnConfiguring(optionsBuilder);
        }
    }
}

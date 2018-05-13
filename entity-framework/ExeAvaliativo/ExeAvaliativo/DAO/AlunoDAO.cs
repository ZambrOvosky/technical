using ExeAvaliativo.Entidades;
using Microsoft.Data.Entity;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ExeAvaliativo;

namespace ExeAvaliativo.DAO {
    class AlunoDAO {
        private EntidadesContext context = new EntidadesContext();
        public AlunoDAO(EntidadesContext context)
        {
            this.context = context;
        }
        public void Salvar(Aluno aluno)
        {
            context.Alunos.Add(aluno);
            context.SaveChanges();
        }

        public void ExibiTudo()
        {
            var busca = from a in context.Alunos select a;
            busca.ToList();
            foreach (var resultado in busca)
                Console.WriteLine(resultado.Id + "  " + resultado.Nome + "  " + resultado.Telefone + "  " + resultado.Curso);
        }

        public void ExibiNomeCurso()
        {
            
            var busca = from a in context.Alunos select a;
            busca.ToList();
            foreach (var resultado in busca)
                Console.WriteLine(resultado.Nome + " : " + resultado.Curso);
        }

        public void ExibiInfo()
        {
            var busca = from a in context.Alunos where a.Curso == "Informática" select a;
            busca.ToList();
            foreach (var resultado in busca)
                Console.WriteLine(resultado.Id + "  " + resultado.Nome + "  " + resultado.Telefone + "  " + resultado.Curso);
        }

        public void ExibiNomeTel()
        {
            var busca = from a in context.Alunos orderby a.Telefone select a;
            busca.ToList();
            foreach (var resultado in busca)
                Console.WriteLine(resultado.Nome + " : " + resultado.Telefone);
        }

        public void ExibiNomeDesc()
        {
            var busca = from a in context.Alunos orderby a.Nome descending select a;
            busca.ToList();
            foreach (var resultado in busca)
                Console.WriteLine(resultado.Nome + " : " + resultado.Telefone);
        }
    }
}
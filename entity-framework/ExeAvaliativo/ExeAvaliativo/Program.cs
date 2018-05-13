using ExeAvaliativo.DAO;
using ExeAvaliativo.Entidades;
using Microsoft.Data.Entity;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExeAvaliativo {
    class Program {
        static void Main(string[] args)
        {
            EntidadesContext context = new EntidadesContext();
            AlunoDAO dao = new AlunoDAO(context);

            //Aluno a = new Aluno("Informática", "Bob", "912345678");
            //Aluno b = new Aluno("Informática", "Ale", "912345679");
            //Aluno c = new Aluno("Informática", "Lui", "912345670");
            //Aluno d = new Aluno("Segurança", "Jot", "912345671");

            //dao.Salvar(a);
            //dao.Salvar(b);
            //dao.Salvar(c);
            //dao.Salvar(d);

            dao.ExibiInfo();

            Console.ReadKey();
        }
    }
}

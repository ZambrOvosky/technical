using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExeAvaliativo.Entidades {
    public class Aluno {
        public int Id { get; set; }
        public string Nome { get; set; }
        public string Telefone { get; set; }
        public string Curso { get; set; }

        public Aluno(string curso, string nome, string tel)
        {
            this.Curso = curso;
            this.Nome = nome;
            this.Telefone = tel;
        }
    }
}

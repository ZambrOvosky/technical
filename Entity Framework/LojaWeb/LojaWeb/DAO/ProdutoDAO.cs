using LojaWeb.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace LojaWeb.DAO {
    public class ProdutoDAO {
        private EntidadeContext context = new EntidadeContext();

        public void Adicionar(Produto produto) {
            context.Produtos.Add(produto);
            context.SaveChanges();
        }

        public IList<Produto> ListarProduto() {
            return context.Produtos.ToList();
        }
    }
}
﻿using LojaWeb.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace LojaWeb.DAO {
    public class CategoriaProdutoDAO {
        private EntidadeContext context = new EntidadeContext();

        public void Adicionar(CategoriaProduto categoria) {
            context.Categorias.Add(categoria);
            context.SaveChanges();
        }

        public IList<CategoriaProduto> ListarCProduto() {
            return context.Categorias.ToList();
        }

        public IList<CategoriaProduto> ListarCategorias()
        {
            return context.Categorias.ToList();
        }

        public CategoriaProduto BuscarId(int id)
        {
            return context.Categorias.FirstOrDefault(c => c.Id == id);
        }
    }
}
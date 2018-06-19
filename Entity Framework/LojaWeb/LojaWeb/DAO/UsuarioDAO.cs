﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using LojaWeb.Models;

namespace LojaWeb.DAO {
    public class UsuarioDAO {
        private EntidadeContext context;

        public UsuarioDAO() {
            context = new EntidadeContext();
        }

        public IList<Usuario> ListarUsuarios() {
            return context.Usuarios.ToList();
        }

        public Usuario BuscarId(int id) {
            return context.Usuarios.FirstOrDefault(u => u.Id == id); ;
        }

        public void Atualizar() {
            context.SaveChanges();
        }

        public void Inserir(Usuario usuario) {
            context.Usuarios.Add(usuario);
            Atualizar();
        }

        public void Remover(Usuario usuario) {
            context.Usuarios.Remove(usuario);
            Atualizar();
        }

    }
}
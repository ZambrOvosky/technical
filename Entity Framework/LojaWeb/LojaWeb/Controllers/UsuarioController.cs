using LojaWeb.DAO;
using LojaWeb.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace LojaWeb.Controllers
{
    public class UsuarioController : Controller
    {
        // GET: Usuario
        public ActionResult Index()
        {
            return View();
        }

        public ActionResult Form()
        {
            return View();
        }

        public ActionResult Adicionar(Usuario usuario) {
            UsuarioDAO dao = new UsuarioDAO();
            dao.Inserir(usuario);
            return View();
        }
    }
}
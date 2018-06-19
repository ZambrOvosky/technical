using LojaWeb.DAO;
using LojaWeb.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace LojaWeb.Controllers
{
    public class CategoriaProdutoController : Controller
    {
        // GET: CategoriaProduto
        public ActionResult Index()
        {
            return View();
        }

        public ActionResult FormCatProd() {
            return View();
        }

        public ActionResult Adicionar(CategoriaProduto catproduto) {
            CategoriaProdutoDAO dao = new CategoriaProdutoDAO();
            dao.Adicionar(catproduto);
            return View();
        }
    }
}
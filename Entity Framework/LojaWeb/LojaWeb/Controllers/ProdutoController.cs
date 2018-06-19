﻿using LojaWeb.DAO;
using LojaWeb.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace LojaWeb.Controllers
{
    public class ProdutoController : Controller
    {
        // GET: Produto
        public ActionResult Index()
        {
            return View();
        }

        public ActionResult FormProd() {
            return View();
        }

        public ActionResult Adicionar(Produto produto) {
            ProdutoDAO dao = new ProdutoDAO();
            dao.Adicionar(produto);
            return View();
        }
    }
}
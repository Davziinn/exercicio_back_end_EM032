package test;

import dao.IProdutoDAO;
import dao.ProdutoDAO;
import domain.Produto;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ProdutoTest {

    private IProdutoDAO produtoDAO;

    public ProdutoTest(){
        produtoDAO = new ProdutoDAO();
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo_produto("A!");
        produto.setNome_produto("Biscoito");
        produto = produtoDAO.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId_produto());
    }
}
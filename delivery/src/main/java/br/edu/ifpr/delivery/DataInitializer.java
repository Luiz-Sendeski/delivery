/*package br.edu.ifpr.delivery;

import br.edu.ifpr.delivery.model.*;
import br.edu.ifpr.delivery.repositorio.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    @Autowired
    private ProdutoRepositorio produtoRepositorio;

    @Autowired
    private PedidoRepositorio pedidoRepositorio;

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        // Criando categorias
        Categoria lanches = new Categoria("Lanches");
        Categoria bebidas = new Categoria("Bebidas");

        categoriaRepositorio.saveAll(List.of(lanches, bebidas));

        // Criando produtos para Lanches
        Produto xSalada = new Produto("X Salada", 12.00f, lanches);
        Produto xBacon = new Produto("X Bacon", 15.00f, lanches);
        Produto xPicanha = new Produto("X Picanha", 18.00f, lanches);

        // Criando produtos para Bebidas
        Produto cocaCola = new Produto("Coca-Cola", 7.00f, bebidas);
        Produto fanta = new Produto("Fanta", 6.00f, bebidas);
        Produto guarana = new Produto("Guaraná", 6.00f, bebidas);

        produtoRepositorio.saveAll(List.of(xSalada, xBacon, xPicanha, cocaCola, fanta, guarana));

        // Buscando o usuário Marcelo ou criando se não existir
        Usuario usuarioMarcelo = usuarioRepositorio.findByLogin("marcelo").orElseGet(() -> {
            Usuario novoUsuario = new Usuario();
            novoUsuario.setLogin("marcelo");
            novoUsuario.setNome("Marcelo");
            novoUsuario.setSenha(passwordEncoder.encode("senhaCriptografadaAqui")); // Insira a senha que deseja criptografada
            //novoUsuario.setChave("240e3a004294acf9"); // Exemplo de chave, insira a correta
            return usuarioRepositorio.save(novoUsuario);
        });

        // Criando um pedido para o usuário Marcelo
        Pedido pedido = new Pedido();
        pedido.setData(LocalDateTime.now());
        pedido.setEntrega("Endereço de Entrega Exemplo");
        pedido.setUsuario(usuarioMarcelo);

        // Associando produtos ao pedido
        PedidoProduto pedidoProduto1 = new PedidoProduto(pedido, xPicanha);
        PedidoProduto pedidoProduto2 = new PedidoProduto(pedido, cocaCola);

        pedido.addProduto(pedidoProduto1);
        pedido.addProduto(pedidoProduto2);

        pedido.setValor(xPicanha.getValor() + cocaCola.getValor()); // Exemplo de valor do pedido

        pedidoRepositorio.save(pedido);
    }
}
*/

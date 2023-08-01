package com.example.agapesistemas.domain.orders;

import com.example.agapesistemas.domain.clientes.Clientes;
import com.example.agapesistemas.domain.product.Product;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Clientes cliente;

    @ManyToMany
    @JoinTable(
            name = "pedidos_produtos",
            joinColumns = @JoinColumn(name = "pedido_id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id")
    )
    private List<Product> produtos;
}

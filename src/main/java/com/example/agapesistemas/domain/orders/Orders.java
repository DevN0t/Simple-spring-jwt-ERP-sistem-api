package com.example.agapesistemas.domain.orders;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "orders")
@Entity(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public Orders(OrdersRequestDTO data){
    }
}


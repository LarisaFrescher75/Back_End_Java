package de.ait.userapi.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;


//@AllArgsConstructor
@Getter
@NoArgsConstructor
@ToString

@Entity
@Table(name = "t_user")

public class Product {

    private Object o;
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String title;

    private int bigDecimalPrice;
    private long l;
    private String orange;
    private BigDecimal bigDecimal;


    public Product(Object o, Long id, String title, int bigDecimalPrice) {
        this.o = o;
        this.id = id;
        this.title = title;
        this.bigDecimalPrice = bigDecimalPrice;
    }

    public Product(long l, String orange, BigDecimal bigDecimal) {
        this.l = l;
        this.orange = orange;
        this.bigDecimal = bigDecimal;
    }
}

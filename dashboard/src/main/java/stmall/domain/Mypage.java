package stmall.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "Mypage_table")
@Data
public class Mypage {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long orderid;

    private String customerId;
    private String itemid;
    private Integer qty;
    private String address;
    private String orderStatus;
    private String deliveryStatus;
}

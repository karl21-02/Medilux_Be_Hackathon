package be.be_project.board.entity;

import be.be_project.global.BaseTimeEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity extends BaseTimeEntity {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String productName;

        private String category;

        private Long normalPrice;

        private Long sellingPrice;

        private Long inventoryQuantity;


}

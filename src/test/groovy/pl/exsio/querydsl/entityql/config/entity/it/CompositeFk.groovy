package pl.exsio.querydsl.entityql.config.entity.it

import javax.persistence.*

@Entity
@Table(name = "COMPOSITE_FK")
public class CompositeFk {

    @Id
    @Column(name = "ID")
    private Long id;

   @ManyToOne
   @JoinColumns([
           @JoinColumn(name = "PK_ID_1", nullable = false, referencedColumnName = "ID_1"),
           @JoinColumn(name = "PK_ID_2", nullable = false, referencedColumnName = "ID_2")
   ])
    private CompositePk compositePk;

    @Column(name = "DESC")
    private String desc;
}
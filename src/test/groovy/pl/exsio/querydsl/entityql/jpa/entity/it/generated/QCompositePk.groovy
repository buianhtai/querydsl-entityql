package pl.exsio.querydsl.entityql.jpa.entity.it.generated

import com.querydsl.core.types.Path
import com.querydsl.core.types.dsl.NumberPath
import com.querydsl.core.types.dsl.StringPath
import com.querydsl.sql.PrimaryKey
import groovy.transform.CompileStatic
import pl.exsio.querydsl.entityql.QColumnMetadataFactory
import pl.exsio.querydsl.entityql.QPathConfig
import pl.exsio.querydsl.entityql.QPathFactory
import pl.exsio.querydsl.entityql.QStaticModel
import pl.exsio.querydsl.entityql.jpa.entity.it.CompositePk

/**
 * This class was generated by EntityQL (https://github.com/eXsio/querydsl-entityql). It is not
 * recommended to make any changes to this class. Any manual changes will be lost upon the next
 * class generation.
 */
@CompileStatic
public final class QCompositePk extends QStaticModel<CompositePk> {

  public static final QCompositePk INSTANCE = new QCompositePk();

  public final NumberPath<Long> id1;

  public final StringPath id2;

  public final StringPath desc;

  public final PrimaryKey<CompositePk> _primaryKey;

  public QCompositePk() {
    this("COMPOSITE_PK");
  }

  @SuppressWarnings(value = "unchecked")
  public QCompositePk(String variable) {
    super(CompositePk.class, variable, "", "COMPOSITE_PK");

    id1:
    {
      QPathConfig config = new QPathConfig(Long.class, Long.class, "ID_1", true, 1, -5);

      this.id1 = QPathFactory.<NumberPath<Long>>create(this, config);

      addMetadata(this.id1, QColumnMetadataFactory.create(config));
      this.columnsMap.put("id1", this.id1);
    }

    id2:
    {
      QPathConfig config = new QPathConfig(String.class, String.class, "ID_2", true, 2, 12);

      this.id2 = QPathFactory.<StringPath>create(this, config);

      addMetadata(this.id2, QColumnMetadataFactory.create(config));
      this.columnsMap.put("id2", this.id2);
    }

    desc:
    {
      QPathConfig config = new QPathConfig(String.class, String.class, "DESC", true, 3, 12);

      this.desc = QPathFactory.<StringPath>create(this, config);

      addMetadata(this.desc, QColumnMetadataFactory.create(config));
      this.columnsMap.put("desc", this.desc);
    }

    _primaryKey:
    {
      List<Path> paths = new ArrayList();

      paths.add(this.id1);

      paths.add(this.id2);

      this._primaryKey = this.<CompositePk>createPrimaryKey(paths.<Path>toArray(new Path[0]));
    }
  }
}

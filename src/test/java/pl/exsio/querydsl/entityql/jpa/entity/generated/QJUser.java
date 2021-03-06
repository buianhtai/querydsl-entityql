package pl.exsio.querydsl.entityql.jpa.entity.generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.StringPath;
import com.querydsl.sql.ForeignKey;
import com.querydsl.sql.PrimaryKey;
import java.util.Arrays;
import java.util.Date;
import javax.annotation.Generated;
import pl.exsio.querydsl.entityql.QColumnMetadataFactory;
import pl.exsio.querydsl.entityql.QPathConfig;
import pl.exsio.querydsl.entityql.QPathFactory;
import pl.exsio.querydsl.entityql.QStaticModel;
import pl.exsio.querydsl.entityql.jpa.entity.JOrder;
import pl.exsio.querydsl.entityql.jpa.entity.JUser;
import pl.exsio.querydsl.entityql.jpa.entity.JUser.Type;
import pl.exsio.querydsl.entityql.path.QEnumPath;
import pl.exsio.querydsl.entityql.path.QObjectPath;

/**
 * This class was generated by EntityQL (https://github.com/eXsio/querydsl-entityql). It is not
 * recommended to make any changes to this class. Any manual changes will be lost upon the next
 * class generation.
 */
@Generated("pl.exsio.querydsl.entityql.QExporter")
public final class QJUser extends QStaticModel<JUser> {

  private static final long serialVersionUID = -417680394;

  public static final QJUser INSTANCE = new QJUser();

  public static final QJUser qJUser = INSTANCE;

  public final NumberPath<Long> id;

  public final StringPath name;

  public final QEnumPath<Type> typeStr;

  public final QEnumPath<Type> typeOrd;

  public final QEnumPath<Type> typeDef;

  public final QObjectPath<Object> createdBy;

  public final QObjectPath<Date> createdAt;

  public final ForeignKey<JOrder> order;

  public final PrimaryKey<JUser> _primaryKey;

  public QJUser() {
    this("JUSERS");
  }

  @SuppressWarnings(value = "unchecked")
  public QJUser(String variable) {
    super(JUser.class, variable, "", "JUSERS");

    id:
    {
      QPathConfig config = new QPathConfig(Long.class, Long.class, "USER_ID", true, 1, -5);

      this.id = QPathFactory.<NumberPath<Long>>create(this, config);

      addMetadata(this.id, QColumnMetadataFactory.create(config));
      this.columnsMap.put("id", this.id);
    }

    name:
    {
      QPathConfig config = new QPathConfig(String.class, String.class, "NAME", true, 2, 12);

      this.name = QPathFactory.<StringPath>create(this, config);

      addMetadata(this.name, QColumnMetadataFactory.create(config));
      this.columnsMap.put("name", this.name);
    }

    typeStr:
    {
      QPathConfig config = new QPathConfig(Type.class, Enum.class, "USER_TYPE", false, 4, 12);

      this.typeStr = QPathFactory.<QEnumPath<Type>>create(this, config);

      addMetadata(this.typeStr, QColumnMetadataFactory.create(config));
      this.columnsMap.put("typeStr", this.typeStr);
    }

    typeOrd:
    {
      QPathConfig config = new QPathConfig(Type.class, Enum.class, "USER_TYPE_ORD", false, 5, 12);

      this.typeOrd = QPathFactory.<QEnumPath<Type>>create(this, config);

      addMetadata(this.typeOrd, QColumnMetadataFactory.create(config));
      this.columnsMap.put("typeOrd", this.typeOrd);
    }

    typeDef:
    {
      QPathConfig config = new QPathConfig(Type.class, Enum.class, "USER_TYPE_DEF", false, 6, 12);

      this.typeDef = QPathFactory.<QEnumPath<Type>>create(this, config);

      addMetadata(this.typeDef, QColumnMetadataFactory.create(config));
      this.columnsMap.put("typeDef", this.typeDef);
    }

    createdBy:
    {
      QPathConfig config = new QPathConfig(Object.class, Object.class, "CREATED_BY", true, 7, 1111);

      this.createdBy = QPathFactory.<QObjectPath<Object>>create(this, config);

      addMetadata(this.createdBy, QColumnMetadataFactory.create(config));
      this.columnsMap.put("createdBy", this.createdBy);
    }

    createdAt:
    {
      QPathConfig config = new QPathConfig(Date.class, Object.class, "CREATED_AT", true, 8, 1111);

      this.createdAt = QPathFactory.<QObjectPath<Date>>create(this, config);

      addMetadata(this.createdAt, QColumnMetadataFactory.create(config));
      this.columnsMap.put("createdAt", this.createdAt);
    }

    order:
    {
      QPathConfig config0 = new QPathConfig(Long.class, Long.class, "USER_ID", false, 3, -5);

      Path<?> order0 = QPathFactory.<Path>create(this, config0);
      addMetadata(order0, QColumnMetadataFactory.create(config0));

      this.order =
          this.<JOrder>createInvForeignKey(
              Arrays.<Path<?>>asList(order0), Arrays.asList("USER_ID"));

      this.inverseJoinColumnsMap.put("order", this.order);
    }

    _primaryKey:
    {
      this.primaryKeyColumns = Arrays.<Path<?>>asList(this.id);

      this._primaryKey = this.<JUser>createPrimaryKey(primaryKeyColumns.<Path>toArray(new Path[0]));
    }
  }
}

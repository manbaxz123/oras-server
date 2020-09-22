package capstone.oras.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAccountEntity is a Querydsl query type for AccountEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAccountEntity extends EntityPathBase<AccountEntity> {

    private static final long serialVersionUID = 1502222883L;

    public static final QAccountEntity accountEntity = new QAccountEntity("accountEntity");

    public final BooleanPath active = createBoolean("active");

    public final StringPath email = createString("email");

    public final StringPath fullname = createString("fullname");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath password = createString("password");

    public QAccountEntity(String variable) {
        super(AccountEntity.class, forVariable(variable));
    }

    public QAccountEntity(Path<? extends AccountEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAccountEntity(PathMetadata metadata) {
        super(AccountEntity.class, metadata);
    }

}


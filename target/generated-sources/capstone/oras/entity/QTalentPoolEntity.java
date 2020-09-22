package capstone.oras.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTalentPoolEntity is a Querydsl query type for TalentPoolEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTalentPoolEntity extends EntityPathBase<TalentPoolEntity> {

    private static final long serialVersionUID = 993305240L;

    public static final QTalentPoolEntity talentPoolEntity = new QTalentPoolEntity("talentPoolEntity");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public QTalentPoolEntity(String variable) {
        super(TalentPoolEntity.class, forVariable(variable));
    }

    public QTalentPoolEntity(Path<? extends TalentPoolEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTalentPoolEntity(PathMetadata metadata) {
        super(TalentPoolEntity.class, metadata);
    }

}


package capstone.oras.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCandidateEntity is a Querydsl query type for CandidateEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCandidateEntity extends EntityPathBase<CandidateEntity> {

    private static final long serialVersionUID = 1510812729L;

    public static final QCandidateEntity candidateEntity = new QCandidateEntity("candidateEntity");

    public final StringPath address = createString("address");

    public final StringPath email = createString("email");

    public final StringPath fullname = createString("fullname");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath phoneNo = createString("phoneNo");

    public QCandidateEntity(String variable) {
        super(CandidateEntity.class, forVariable(variable));
    }

    public QCandidateEntity(Path<? extends CandidateEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCandidateEntity(PathMetadata metadata) {
        super(CandidateEntity.class, metadata);
    }

}


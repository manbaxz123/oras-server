package capstone.oras.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QJobEntity is a Querydsl query type for JobEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QJobEntity extends EntityPathBase<JobEntity> {

    private static final long serialVersionUID = 1745195315L;

    public static final QJobEntity jobEntity = new QJobEntity("jobEntity");

    public final DatePath<java.sql.Date> applyFrom = createDate("applyFrom", java.sql.Date.class);

    public final DatePath<java.sql.Date> applyTo = createDate("applyTo", java.sql.Date.class);

    public final DatePath<java.sql.Date> createDate = createDate("createDate", java.sql.Date.class);

    public final NumberPath<Integer> creatorId = createNumber("creatorId", Integer.class);

    public final StringPath currency = createString("currency");

    public final StringPath description = createString("description");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Double> salaryFrom = createNumber("salaryFrom", Double.class);

    public final BooleanPath salaryHidden = createBoolean("salaryHidden");

    public final NumberPath<Double> salaryTo = createNumber("salaryTo", Double.class);

    public final StringPath status = createString("status");

    public final NumberPath<Integer> talentPoolId = createNumber("talentPoolId", Integer.class);

    public final StringPath title = createString("title");

    public final NumberPath<Integer> vacancies = createNumber("vacancies", Integer.class);

    public QJobEntity(String variable) {
        super(JobEntity.class, forVariable(variable));
    }

    public QJobEntity(Path<? extends JobEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QJobEntity(PathMetadata metadata) {
        super(JobEntity.class, metadata);
    }

}


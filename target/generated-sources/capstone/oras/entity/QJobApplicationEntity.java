package capstone.oras.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QJobApplicationEntity is a Querydsl query type for JobApplicationEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QJobApplicationEntity extends EntityPathBase<JobApplicationEntity> {

    private static final long serialVersionUID = -46171645L;

    public static final QJobApplicationEntity jobApplicationEntity = new QJobApplicationEntity("jobApplicationEntity");

    public final DatePath<java.sql.Date> applyDate = createDate("applyDate", java.sql.Date.class);

    public final NumberPath<Integer> candidateId = createNumber("candidateId", Integer.class);

    public final StringPath comment = createString("comment");

    public final StringPath cv = createString("cv");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> jobId = createNumber("jobId", Integer.class);

    public final NumberPath<Double> matchingRate = createNumber("matchingRate", Double.class);

    public final StringPath source = createString("source");

    public final StringPath status = createString("status");

    public final NumberPath<Integer> talentPoolId = createNumber("talentPoolId", Integer.class);

    public QJobApplicationEntity(String variable) {
        super(JobApplicationEntity.class, forVariable(variable));
    }

    public QJobApplicationEntity(Path<? extends JobApplicationEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QJobApplicationEntity(PathMetadata metadata) {
        super(JobApplicationEntity.class, metadata);
    }

}


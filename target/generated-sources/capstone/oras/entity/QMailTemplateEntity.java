package capstone.oras.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMailTemplateEntity is a Querydsl query type for MailTemplateEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMailTemplateEntity extends EntityPathBase<MailTemplateEntity> {

    private static final long serialVersionUID = -449273663L;

    public static final QMailTemplateEntity mailTemplateEntity = new QMailTemplateEntity("mailTemplateEntity");

    public final StringPath body = createString("body");

    public final NumberPath<Integer> creatorId = createNumber("creatorId", Integer.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath subject = createString("subject");

    public final StringPath type = createString("type");

    public QMailTemplateEntity(String variable) {
        super(MailTemplateEntity.class, forVariable(variable));
    }

    public QMailTemplateEntity(Path<? extends MailTemplateEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMailTemplateEntity(PathMetadata metadata) {
        super(MailTemplateEntity.class, metadata);
    }

}


package cn.zy.repository;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QArtifactRepository is a Querydsl query type for ArtifactRepository
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QArtifactRepository extends EntityPathBase<ArtifactRepository> {

    private static final long serialVersionUID = 876726964L;

    public static final QArtifactRepository artifactRepository = new QArtifactRepository("artifactRepository");

    public final StringPath id = createString("id");

    public final StringPath name = createString("name");

    public final BooleanPath snapshotsEnabled = createBoolean("snapshotsEnabled");

    public final StringPath url = createString("url");

    public QArtifactRepository(String variable) {
        super(ArtifactRepository.class, forVariable(variable));
    }

    public QArtifactRepository(Path<? extends ArtifactRepository> path) {
        super(path.getType(), path.getMetadata());
    }

    public QArtifactRepository(PathMetadata metadata) {
        super(ArtifactRepository.class, metadata);
    }

}


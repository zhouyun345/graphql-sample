package cn.zy.controller;

import cn.zy.repository.ArtifactRepositories;
import cn.zy.repository.ArtifactRepository;
import cn.zy.repository.QArtifactRepository;
import com.querydsl.jpa.impl.JPAQuery;
import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class QueryController {

  @Autowired
  private EntityManager entityManager;

  @Autowired
  private ArtifactRepositories repositories;

  @QueryMapping
  public String greeting() {
    return "hello";
  }

  @QueryMapping
  public List<ArtifactRepository> tests(@Argument List<String> ids) {
    QArtifactRepository qArtifactRepository = QArtifactRepository.artifactRepository;
    return new JPAQuery<ArtifactRepository>(entityManager)
        .select(qArtifactRepository)
        .from(qArtifactRepository)
        .where(qArtifactRepository.id.in(ids))
        .fetch();
  }
}

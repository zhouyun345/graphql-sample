package cn.zy;

import cn.zy.client.ArtifactRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Test implements CommandLineRunner {

  @Autowired
  private MyGraphQLRepository myGraphQLRepository;

  @Override
  public void run(String... args) throws Exception {
    List<ArtifactRepository> artifactRepositories = myGraphQLRepository.artifactRepositories();
    System.out.println(artifactRepositories.size());
  }
}

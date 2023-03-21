package cn.zy;

import cn.zy.client.ArtifactRepository;
import cn.zy.repo.MyGraphQLRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Test implements CommandLineRunner {

  @Autowired
  private MyGraphQLRepository myGraphQLRepository;

  @Override
  public void run(String... args) throws Exception {
    List<ArtifactRepository> artifactRepositories = myGraphQLRepository.artifactRepositories();
    log.info("result => {}", artifactRepositories);
  }
}

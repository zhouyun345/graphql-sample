package cn.zy.controller;

import cn.zy.repository.ArtifactRepository;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/test")
public class WebController {

  @GetMapping
  public Mono<String> test() {
    WebClient webClient = WebClient.create();
    Mono<String> mono = webClient.get().uri("https://www.baidu.com").retrieve()
        .bodyToMono(String.class);
    return mono;
  }

  @GetMapping("/graphql")
  public Mono<ArtifactRepository> graphql() {
    WebClient webClient = WebClient.create("http://localhost:8080/graphql");
    HttpGraphQlClient graphQlClient = HttpGraphQlClient.create(webClient);

    Mono<ArtifactRepository> artifactRepositoryMono = graphQlClient.documentName("artifact")
        .retrieve("artifactRepository")
        .toEntity(ArtifactRepository.class);
    return artifactRepositoryMono;
  }
}

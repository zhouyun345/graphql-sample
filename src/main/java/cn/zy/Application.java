package cn.zy;

import com.graphql_java_generator.client.graphqlrepository.EnableGraphQLRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"cn.zy", "com.graphql_java_generator.client"})
@EnableGraphQLRepositories({"cn.zy.repo"})
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}

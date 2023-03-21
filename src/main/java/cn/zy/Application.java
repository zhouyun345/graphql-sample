package cn.zy;

import cn.zy.client.util.QueryExecutor;
import com.graphql_java_generator.client.GraphQLConfiguration;
import com.graphql_java_generator.client.graphqlrepository.EnableGraphQLRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = { Application.class, GraphQLConfiguration.class, QueryExecutor.class })
@EnableGraphQLRepositories({ "cn.zy.client" })
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}

package cn.zy;

import cn.zy.client.ArtifactRepository;
import com.graphql_java_generator.client.graphqlrepository.GraphQLRepository;
import com.graphql_java_generator.client.graphqlrepository.PartialRequest;
import com.graphql_java_generator.exception.GraphQLRequestExecutionException;
import java.util.List;

@GraphQLRepository
public interface MyGraphQLRepository {

  @PartialRequest(request = "{id name url}")
  List<ArtifactRepository> artifactRepositories() throws GraphQLRequestExecutionException;
}

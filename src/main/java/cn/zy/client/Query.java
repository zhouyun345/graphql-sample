/** Generated by the default template from graphql-java-generator */
package cn.zy.client;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import cn.zy.client.util.CustomJacksonDeserializers;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.graphql_java_generator.annotation.GraphQLInputParameters;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLQuery;
import com.graphql_java_generator.annotation.GraphQLScalar;
import com.graphql_java_generator.annotation.RequestType;
import java.util.List;

/**
 *
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLQuery(name = "Query", type = RequestType.query)
@GraphQLObjectType("Query")
@JsonInclude(Include.NON_NULL)
@SuppressWarnings("unused")
public class Query 
 implements com.graphql_java_generator.client.GraphQLRequestObject{

	private ObjectMapper mapper = null;
	private JsonNode extensions;
	private Map<String, JsonNode> extensionsAsMap = null;

	/**
	 * This map contains the deserialized values for the alias, as parsed from the json response from the GraphQL
	 * server. The key is the alias name, the value is the deserialiazed value (taking into account custom scalars,
	 * lists, ...)
	 */
	@com.graphql_java_generator.annotation.GraphQLIgnore
	Map<String, Object> aliasValues = new HashMap<>();

	public Query(){
		// No action
	}

	@JsonProperty("greeting")
	@GraphQLScalar(fieldName = "greeting", graphQLTypeSimpleName = "String", javaClass = String.class)
	String greeting;


	@JsonProperty("artifactRepositories")
	@JsonDeserialize(using = CustomJacksonDeserializers.ListArtifactRepository.class)
	@GraphQLNonScalar(fieldName = "artifactRepositories", graphQLTypeSimpleName = "ArtifactRepository", javaClass = ArtifactRepository.class)
	List<ArtifactRepository> artifactRepositories;


	@JsonProperty("artifactRepository")
	@GraphQLInputParameters(names = {"id"}, types = {"ID"}, mandatories = {true}, listDepths = {0}, itemsMandatory = {false})
	@GraphQLNonScalar(fieldName = "artifactRepository", graphQLTypeSimpleName = "ArtifactRepository", javaClass = ArtifactRepository.class)
	ArtifactRepository artifactRepository;


	@JsonProperty("tests")
	@JsonDeserialize(using = CustomJacksonDeserializers.ListArtifactRepository.class)
	@GraphQLInputParameters(names = {"ids"}, types = {"ID"}, mandatories = {true}, listDepths = {1}, itemsMandatory = {false})
	@GraphQLNonScalar(fieldName = "tests", graphQLTypeSimpleName = "ArtifactRepository", javaClass = ArtifactRepository.class)
	List<ArtifactRepository> tests;


	@JsonProperty("__schema")
	@GraphQLNonScalar(fieldName = "__schema", graphQLTypeSimpleName = "__Schema", javaClass = __Schema.class)
	__Schema __schema;


	@JsonProperty("__type")
	@GraphQLInputParameters(names = {"name"}, types = {"String"}, mandatories = {true}, listDepths = {0}, itemsMandatory = {false})
	@GraphQLNonScalar(fieldName = "__type", graphQLTypeSimpleName = "__Type", javaClass = __Type.class)
	__Type __type;


	@JsonProperty("__typename")
	@GraphQLScalar(fieldName = "__typename", graphQLTypeSimpleName = "String", javaClass = String.class)
	String __typename;



	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getGreeting() {
		return greeting;
	}
		

	public void setArtifactRepositories(List<ArtifactRepository> artifactRepositories) {
		this.artifactRepositories = artifactRepositories;
	}

	public List<ArtifactRepository> getArtifactRepositories() {
		return artifactRepositories;
	}
		

	public void setArtifactRepository(ArtifactRepository artifactRepository) {
		this.artifactRepository = artifactRepository;
	}

	public ArtifactRepository getArtifactRepository() {
		return artifactRepository;
	}
		

	public void setTests(List<ArtifactRepository> tests) {
		this.tests = tests;
	}

	public List<ArtifactRepository> getTests() {
		return tests;
	}
		

	public void set__schema(__Schema __schema) {
		this.__schema = __schema;
	}

	public __Schema get__schema() {
		return __schema;
	}
		

	public void set__type(__Type __type) {
		this.__type = __type;
	}

	public __Type get__type() {
		return __type;
	}
		

	public void set__typename(String __typename) {
		this.__typename = __typename;
	}

	public String get__typename() {
		return __typename;
	}
		

 
	/**
	 * This method is called during the json deserialization process, by the {@link GraphQLObjectMapper}, each time an
	 * alias value is read from the json.
	 * 
	 * @param aliasName
	 * @param aliasDeserializedValue
	 */
	public void setAliasValue(String aliasName, Object aliasDeserializedValue) {
		aliasValues.put(aliasName, aliasDeserializedValue);
	}

	/**
	 * Retrieves the value for the given alias, as it has been received for this object in the GraphQL response. <BR/>
	 * This method <B>should not be used for Custom Scalars</B>, as the parser doesn't know if this alias is a custom
	 * scalar, and which custom scalar to use at deserialization time. In most case, a value will then be provided by
	 * this method with a basis json deserialization, but this value won't be the proper custom scalar value.
	 * 
	 * @param alias
	 * @return
	 */
	public Object getAliasValue(String alias) {
		return aliasValues.get(alias);
	}

    public String toString() {
        return "Query {"
				+ "greeting: " + greeting
				+ ", "
				+ "artifactRepositories: " + artifactRepositories
				+ ", "
				+ "artifactRepository: " + artifactRepository
				+ ", "
				+ "tests: " + tests
				+ ", "
				+ "__schema: " + __schema
				+ ", "
				+ "__type: " + __type
				+ ", "
				+ "__typename: " + __typename
        		+ "}";
    }

	public static Builder builder() {
		return new Builder();
	}

	/**
	 * The Builder that helps building instance of this POJO. You can get an instance of this class, by calling the
	 * {@link #builder()}
	 */
	public static class Builder {
		private String greeting;
		private List<ArtifactRepository> artifactRepositories;
		private ArtifactRepository artifactRepository;
		private List<ArtifactRepository> tests;
		private __Schema __schema;
		private __Type __type;

		public Builder withGreeting(String greeting) {
			this.greeting = greeting;
			return this;
		}
		public Builder withArtifactRepositories(List<ArtifactRepository> artifactRepositories) {
			this.artifactRepositories = artifactRepositories;
			return this;
		}
		public Builder withArtifactRepository(ArtifactRepository artifactRepository) {
			this.artifactRepository = artifactRepository;
			return this;
		}
		public Builder withTests(List<ArtifactRepository> tests) {
			this.tests = tests;
			return this;
		}
		public Builder with__schema(__Schema __schema) {
			this.__schema = __schema;
			return this;
		}
		public Builder with__type(__Type __type) {
			this.__type = __type;
			return this;
		}

		public Query build() {
			Query _object = new Query();
			_object.setGreeting(greeting);
			_object.setArtifactRepositories(artifactRepositories);
			_object.setArtifactRepository(artifactRepository);
			_object.setTests(tests);
			_object.set__schema(__schema);
			_object.set__type(__type);
			_object.set__typename("Query");
			return _object;
		}
	}
	private ObjectMapper getMapper() {
		if (mapper == null) {
			mapper = new ObjectMapper();
		}
		return mapper;
	}
	
	public JsonNode getExtensions() {
		return extensions;
	}
	
	public void setExtensions(JsonNode extensions) {
		this.extensions = extensions;
	}
	
	/**
	 * Returns the extensions as a map. The values can't be deserialized, as their type is unknown.
	 * 
	 * @return
	 */
	public Map<String, JsonNode> getExtensionsAsMap() {
		if (extensionsAsMap == null) {
			ObjectMapper mapper = new ObjectMapper();
			extensionsAsMap = mapper.convertValue(extensions, new TypeReference<Map<String, JsonNode>>() {
			});
		}
		return extensionsAsMap;
	}
	
	/**
	 * Parse the value for the given _key_, as found in the <I>extensions</I> field of the GraphQL server's response,
	 * into the given _t_ class.
	 * 
	 * @param <T>
	 * @param key
	 * @param t
	 * @return null if the key is not in the <I>extensions</I> map. Otherwise: the value for this _key_, as a _t_
	 *         instance
	 * @throws JsonProcessingException
	 *             When there is an error when converting the key's value into the _t_ class
	 */
	public <T> T getExtensionsField(String key, Class<T> t) throws JsonProcessingException {
		JsonNode node = getExtensionsAsMap().get(key);
		return (node == null) ? null : getMapper().treeToValue(node, t);
	}
}

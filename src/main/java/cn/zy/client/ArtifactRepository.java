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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 *
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("ArtifactRepository")
@JsonInclude(Include.NON_NULL)
@SuppressWarnings("unused")
public class ArtifactRepository 
{

	/**
	 * This map contains the deserialized values for the alias, as parsed from the json response from the GraphQL
	 * server. The key is the alias name, the value is the deserialiazed value (taking into account custom scalars,
	 * lists, ...)
	 */
	@com.graphql_java_generator.annotation.GraphQLIgnore
	Map<String, Object> aliasValues = new HashMap<>();

	public ArtifactRepository(){
		// No action
	}

	@JsonProperty("id")
	@GraphQLScalar(fieldName = "id", graphQLTypeSimpleName = "ID", javaClass = String.class)
	String id;


	@JsonProperty("name")
	@GraphQLScalar(fieldName = "name", graphQLTypeSimpleName = "String", javaClass = String.class)
	String name;


	@JsonProperty("url")
	@GraphQLScalar(fieldName = "url", graphQLTypeSimpleName = "String", javaClass = String.class)
	String url;


	@JsonProperty("snapshotsEnabled")
	@GraphQLScalar(fieldName = "snapshotsEnabled", graphQLTypeSimpleName = "Boolean", javaClass = Boolean.class)
	Boolean snapshotsEnabled;


	@JsonProperty("__typename")
	@GraphQLScalar(fieldName = "__typename", graphQLTypeSimpleName = "String", javaClass = String.class)
	String __typename;



	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
		

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
		

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}
		

	public void setSnapshotsEnabled(Boolean snapshotsEnabled) {
		this.snapshotsEnabled = snapshotsEnabled;
	}

	public Boolean getSnapshotsEnabled() {
		return snapshotsEnabled;
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
        return "ArtifactRepository {"
				+ "id: " + id
				+ ", "
				+ "name: " + name
				+ ", "
				+ "url: " + url
				+ ", "
				+ "snapshotsEnabled: " + snapshotsEnabled
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
		private String id;
		private String name;
		private String url;
		private Boolean snapshotsEnabled;

		public Builder withId(String id) {
			this.id = id;
			return this;
		}
		public Builder withName(String name) {
			this.name = name;
			return this;
		}
		public Builder withUrl(String url) {
			this.url = url;
			return this;
		}
		public Builder withSnapshotsEnabled(Boolean snapshotsEnabled) {
			this.snapshotsEnabled = snapshotsEnabled;
			return this;
		}

		public ArtifactRepository build() {
			ArtifactRepository _object = new ArtifactRepository();
			_object.setId(id);
			_object.setName(name);
			_object.setUrl(url);
			_object.setSnapshotsEnabled(snapshotsEnabled);
			_object.set__typename("ArtifactRepository");
			return _object;
		}
	}
}

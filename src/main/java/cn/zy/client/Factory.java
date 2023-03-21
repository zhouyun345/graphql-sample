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
@GraphQLObjectType("Factory")
@JsonInclude(Include.NON_NULL)
@SuppressWarnings("unused")
public class Factory 
{

	/**
	 * This map contains the deserialized values for the alias, as parsed from the json response from the GraphQL
	 * server. The key is the alias name, the value is the deserialiazed value (taking into account custom scalars,
	 * lists, ...)
	 */
	@com.graphql_java_generator.annotation.GraphQLIgnore
	Map<String, Object> aliasValues = new HashMap<>();

	public Factory(){
		// No action
	}

	@JsonProperty("codeCarport")
	@GraphQLScalar(fieldName = "codeCarport", graphQLTypeSimpleName = "String", javaClass = String.class)
	String codeCarport;


	@JsonProperty("codePIA")
	@GraphQLScalar(fieldName = "codePIA", graphQLTypeSimpleName = "String", javaClass = String.class)
	String codePIA;


	@JsonProperty("key")
	@GraphQLScalar(fieldName = "key", graphQLTypeSimpleName = "String", javaClass = String.class)
	String key;


	@JsonProperty("location")
	@GraphQLScalar(fieldName = "location", graphQLTypeSimpleName = "String", javaClass = String.class)
	String location;


	@JsonProperty("__typename")
	@GraphQLScalar(fieldName = "__typename", graphQLTypeSimpleName = "String", javaClass = String.class)
	String __typename;



	public void setCodeCarport(String codeCarport) {
		this.codeCarport = codeCarport;
	}

	public String getCodeCarport() {
		return codeCarport;
	}
		

	public void setCodePIA(String codePIA) {
		this.codePIA = codePIA;
	}

	public String getCodePIA() {
		return codePIA;
	}
		

	public void setKey(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
		

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocation() {
		return location;
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
        return "Factory {"
				+ "codeCarport: " + codeCarport
				+ ", "
				+ "codePIA: " + codePIA
				+ ", "
				+ "key: " + key
				+ ", "
				+ "location: " + location
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
		private String codeCarport;
		private String codePIA;
		private String key;
		private String location;

		public Builder withCodeCarport(String codeCarport) {
			this.codeCarport = codeCarport;
			return this;
		}
		public Builder withCodePIA(String codePIA) {
			this.codePIA = codePIA;
			return this;
		}
		public Builder withKey(String key) {
			this.key = key;
			return this;
		}
		public Builder withLocation(String location) {
			this.location = location;
			return this;
		}

		public Factory build() {
			Factory _object = new Factory();
			_object.setCodeCarport(codeCarport);
			_object.setCodePIA(codePIA);
			_object.setKey(key);
			_object.setLocation(location);
			_object.set__typename("Factory");
			return _object;
		}
	}
}

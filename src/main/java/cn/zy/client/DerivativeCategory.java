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
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 *
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("DerivativeCategory")
@JsonInclude(Include.NON_NULL)
@SuppressWarnings("unused")
public class DerivativeCategory 
{

	/**
	 * This map contains the deserialized values for the alias, as parsed from the json response from the GraphQL
	 * server. The key is the alias name, the value is the deserialiazed value (taking into account custom scalars,
	 * lists, ...)
	 */
	@com.graphql_java_generator.annotation.GraphQLIgnore
	Map<String, Object> aliasValues = new HashMap<>();

	public DerivativeCategory(){
		// No action
	}

	@JsonProperty("key")
	@GraphQLScalar(fieldName = "key", graphQLTypeSimpleName = "String", javaClass = String.class)
	String key;


	@JsonProperty("name")
	@GraphQLNonScalar(fieldName = "name", graphQLTypeSimpleName = "TranslatedText", javaClass = TranslatedText.class)
	TranslatedText name;


	@JsonProperty("__typename")
	@GraphQLScalar(fieldName = "__typename", graphQLTypeSimpleName = "String", javaClass = String.class)
	String __typename;



	public void setKey(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
		

	public void setName(TranslatedText name) {
		this.name = name;
	}

	public TranslatedText getName() {
		return name;
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
        return "DerivativeCategory {"
				+ "key: " + key
				+ ", "
				+ "name: " + name
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
		private String key;
		private TranslatedText name;

		public Builder withKey(String key) {
			this.key = key;
			return this;
		}
		public Builder withName(TranslatedText name) {
			this.name = name;
			return this;
		}

		public DerivativeCategory build() {
			DerivativeCategory _object = new DerivativeCategory();
			_object.setKey(key);
			_object.setName(name);
			_object.set__typename("DerivativeCategory");
			return _object;
		}
	}
}

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
import com.graphql_java_generator.annotation.GraphQLScalar;
import java.util.List;

/**
 *
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("CustomerSpecifiedVehicleConfiguratorImages")
@JsonInclude(Include.NON_NULL)
@SuppressWarnings("unused")
public class CustomerSpecifiedVehicleConfiguratorImages 
{

	/**
	 * This map contains the deserialized values for the alias, as parsed from the json response from the GraphQL
	 * server. The key is the alias name, the value is the deserialiazed value (taking into account custom scalars,
	 * lists, ...)
	 */
	@com.graphql_java_generator.annotation.GraphQLIgnore
	Map<String, Object> aliasValues = new HashMap<>();

	public CustomerSpecifiedVehicleConfiguratorImages(){
		// No action
	}

	@JsonProperty("iris")
	@JsonDeserialize(using = CustomJacksonDeserializers.ListIrisConfiguratorImage.class)
	@GraphQLInputParameters(names = {"irisConfiguratorImagesRequest"}, types = {"IrisConfiguratorImagesRequestInput"}, mandatories = {true}, listDepths = {0}, itemsMandatory = {false})
	@GraphQLNonScalar(fieldName = "iris", graphQLTypeSimpleName = "IrisConfiguratorImage", javaClass = IrisConfiguratorImage.class)
	List<IrisConfiguratorImage> iris;


	@JsonProperty("__typename")
	@GraphQLScalar(fieldName = "__typename", graphQLTypeSimpleName = "String", javaClass = String.class)
	String __typename;



	public void setIris(List<IrisConfiguratorImage> iris) {
		this.iris = iris;
	}

	public List<IrisConfiguratorImage> getIris() {
		return iris;
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
        return "CustomerSpecifiedVehicleConfiguratorImages {"
				+ "iris: " + iris
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
		private List<IrisConfiguratorImage> iris;

		public Builder withIris(List<IrisConfiguratorImage> iris) {
			this.iris = iris;
			return this;
		}

		public CustomerSpecifiedVehicleConfiguratorImages build() {
			CustomerSpecifiedVehicleConfiguratorImages _object = new CustomerSpecifiedVehicleConfiguratorImages();
			_object.setIris(iris);
			_object.set__typename("CustomerSpecifiedVehicleConfiguratorImages");
			return _object;
		}
	}
}

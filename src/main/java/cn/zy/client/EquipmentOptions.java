/** Generated by the default template from graphql-java-generator */
package cn.zy.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.graphql_java_generator.annotation.GraphQLInterfaceType;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "__typename", visible = true)
@JsonSubTypes({ @Type(value = FactoryVehicleEquipmentOptions.class, name = "FactoryVehicleEquipmentOptions"), @Type(value = VehicleStateEquipmentOptions.class, name = "VehicleStateEquipmentOptions") })
@GraphQLInterfaceType("EquipmentOptions")
@SuppressWarnings("unused")
public interface EquipmentOptions  {

	@JsonProperty("wheels")
	@GraphQLNonScalar(fieldName = "wheels", graphQLTypeSimpleName = "Wheels", javaClass = Wheels.class)
	public void setWheels(Wheels wheels);

	@JsonProperty("wheels")
	@GraphQLNonScalar(fieldName = "wheels", graphQLTypeSimpleName = "Wheels", javaClass = Wheels.class)
	public Wheels getWheels();

	@JsonProperty("__typename")
	@GraphQLScalar(fieldName = "__typename", graphQLTypeSimpleName = "String", javaClass = String.class)
	public void set__typename(String __typename);

	@JsonProperty("__typename")
	@GraphQLScalar(fieldName = "__typename", graphQLTypeSimpleName = "String", javaClass = String.class)
	public String get__typename();

	/**
	 * This method is called during the json deserialization process, by the {@link GraphQLObjectMapper}, each time an
	 * alias value is read from the json.
	 * 
	 * @param aliasName
	 * @param aliasDeserializedValue
	 */
	public void setAliasValue(String aliasName, Object aliasDeserializedValue);

	/**
	 * Retrieves the value for the given alias, as it has been received for this object in the GraphQL response. <BR/>
	 * This method <B>should not be used for Custom Scalars</B>, as the parser doesn't know if this alias is a custom
	 * scalar, and which custom scalar to use at deserialization time. In most case, a value will then be provided by
	 * this method with a basis json deserialization, but this value won't be the proper custom scalar value.
	 * 
	 * @param alias
	 * @return
	 */
	public Object getAliasValue(String alias);

}

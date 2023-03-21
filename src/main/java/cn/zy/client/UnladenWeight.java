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
@GraphQLObjectType("UnladenWeight")
@JsonInclude(Include.NON_NULL)
@SuppressWarnings("unused")
public class UnladenWeight 
{

	/**
	 * This map contains the deserialized values for the alias, as parsed from the json response from the GraphQL
	 * server. The key is the alias name, the value is the deserialiazed value (taking into account custom scalars,
	 * lists, ...)
	 */
	@com.graphql_java_generator.annotation.GraphQLIgnore
	Map<String, Object> aliasValues = new HashMap<>();

	public UnladenWeight(){
		// No action
	}

	@JsonProperty("din")
	@GraphQLNonScalar(fieldName = "din", graphQLTypeSimpleName = "VehicleWeightTechnicalDataItem", javaClass = VehicleWeightTechnicalDataItem.class)
	VehicleWeightTechnicalDataItem din;


	@JsonProperty("ec")
	@GraphQLNonScalar(fieldName = "ec", graphQLTypeSimpleName = "VehicleWeightTechnicalDataItem", javaClass = VehicleWeightTechnicalDataItem.class)
	VehicleWeightTechnicalDataItem ec;


	@JsonProperty("individualVehicle")
	@GraphQLNonScalar(fieldName = "individualVehicle", graphQLTypeSimpleName = "VehicleWeightTechnicalDataItem", javaClass = VehicleWeightTechnicalDataItem.class)
	VehicleWeightTechnicalDataItem individualVehicle;


	@JsonProperty("__typename")
	@GraphQLScalar(fieldName = "__typename", graphQLTypeSimpleName = "String", javaClass = String.class)
	String __typename;



	public void setDin(VehicleWeightTechnicalDataItem din) {
		this.din = din;
	}

	public VehicleWeightTechnicalDataItem getDin() {
		return din;
	}
		

	public void setEc(VehicleWeightTechnicalDataItem ec) {
		this.ec = ec;
	}

	public VehicleWeightTechnicalDataItem getEc() {
		return ec;
	}
		

	public void setIndividualVehicle(VehicleWeightTechnicalDataItem individualVehicle) {
		this.individualVehicle = individualVehicle;
	}

	public VehicleWeightTechnicalDataItem getIndividualVehicle() {
		return individualVehicle;
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
        return "UnladenWeight {"
				+ "din: " + din
				+ ", "
				+ "ec: " + ec
				+ ", "
				+ "individualVehicle: " + individualVehicle
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
		private VehicleWeightTechnicalDataItem din;
		private VehicleWeightTechnicalDataItem ec;
		private VehicleWeightTechnicalDataItem individualVehicle;

		public Builder withDin(VehicleWeightTechnicalDataItem din) {
			this.din = din;
			return this;
		}
		public Builder withEc(VehicleWeightTechnicalDataItem ec) {
			this.ec = ec;
			return this;
		}
		public Builder withIndividualVehicle(VehicleWeightTechnicalDataItem individualVehicle) {
			this.individualVehicle = individualVehicle;
			return this;
		}

		public UnladenWeight build() {
			UnladenWeight _object = new UnladenWeight();
			_object.setDin(din);
			_object.setEc(ec);
			_object.setIndividualVehicle(individualVehicle);
			_object.set__typename("UnladenWeight");
			return _object;
		}
	}
}

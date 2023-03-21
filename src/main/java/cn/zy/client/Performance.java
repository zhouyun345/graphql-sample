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
@GraphQLObjectType("Performance")
@JsonInclude(Include.NON_NULL)
@SuppressWarnings("unused")
public class Performance 
{

	/**
	 * This map contains the deserialized values for the alias, as parsed from the json response from the GraphQL
	 * server. The key is the alias name, the value is the deserialiazed value (taking into account custom scalars,
	 * lists, ...)
	 */
	@com.graphql_java_generator.annotation.GraphQLIgnore
	Map<String, Object> aliasValues = new HashMap<>();

	public Performance(){
		// No action
	}

	@JsonProperty("acceleration")
	@GraphQLNonScalar(fieldName = "acceleration", graphQLTypeSimpleName = "Acceleration", javaClass = Acceleration.class)
	Acceleration acceleration;


	@JsonProperty("electricalTopSpeed")
	@GraphQLNonScalar(fieldName = "electricalTopSpeed", graphQLTypeSimpleName = "SpeedTechnicalDataItem", javaClass = SpeedTechnicalDataItem.class)
	SpeedTechnicalDataItem electricalTopSpeed;


	@JsonProperty("topSpeed")
	@GraphQLNonScalar(fieldName = "topSpeed", graphQLTypeSimpleName = "SpeedTechnicalDataItem", javaClass = SpeedTechnicalDataItem.class)
	SpeedTechnicalDataItem topSpeed;


	@JsonProperty("__typename")
	@GraphQLScalar(fieldName = "__typename", graphQLTypeSimpleName = "String", javaClass = String.class)
	String __typename;



	public void setAcceleration(Acceleration acceleration) {
		this.acceleration = acceleration;
	}

	public Acceleration getAcceleration() {
		return acceleration;
	}
		

	public void setElectricalTopSpeed(SpeedTechnicalDataItem electricalTopSpeed) {
		this.electricalTopSpeed = electricalTopSpeed;
	}

	public SpeedTechnicalDataItem getElectricalTopSpeed() {
		return electricalTopSpeed;
	}
		

	public void setTopSpeed(SpeedTechnicalDataItem topSpeed) {
		this.topSpeed = topSpeed;
	}

	public SpeedTechnicalDataItem getTopSpeed() {
		return topSpeed;
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
        return "Performance {"
				+ "acceleration: " + acceleration
				+ ", "
				+ "electricalTopSpeed: " + electricalTopSpeed
				+ ", "
				+ "topSpeed: " + topSpeed
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
		private Acceleration acceleration;
		private SpeedTechnicalDataItem electricalTopSpeed;
		private SpeedTechnicalDataItem topSpeed;

		public Builder withAcceleration(Acceleration acceleration) {
			this.acceleration = acceleration;
			return this;
		}
		public Builder withElectricalTopSpeed(SpeedTechnicalDataItem electricalTopSpeed) {
			this.electricalTopSpeed = electricalTopSpeed;
			return this;
		}
		public Builder withTopSpeed(SpeedTechnicalDataItem topSpeed) {
			this.topSpeed = topSpeed;
			return this;
		}

		public Performance build() {
			Performance _object = new Performance();
			_object.setAcceleration(acceleration);
			_object.setElectricalTopSpeed(electricalTopSpeed);
			_object.setTopSpeed(topSpeed);
			_object.set__typename("Performance");
			return _object;
		}
	}
}
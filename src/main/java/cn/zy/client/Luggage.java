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
@GraphQLObjectType("Luggage")
@JsonInclude(Include.NON_NULL)
@SuppressWarnings("unused")
public class Luggage 
{

	/**
	 * This map contains the deserialized values for the alias, as parsed from the json response from the GraphQL
	 * server. The key is the alias name, the value is the deserialiazed value (taking into account custom scalars,
	 * lists, ...)
	 */
	@com.graphql_java_generator.annotation.GraphQLIgnore
	Map<String, Object> aliasValues = new HashMap<>();

	public Luggage(){
		// No action
	}

	@JsonProperty("frontVolume")
	@GraphQLNonScalar(fieldName = "frontVolume", graphQLTypeSimpleName = "LuggageVolumeTechnicalDataItem", javaClass = LuggageVolumeTechnicalDataItem.class)
	LuggageVolumeTechnicalDataItem frontVolume;


	@JsonProperty("maxVolumeRear")
	@GraphQLNonScalar(fieldName = "maxVolumeRear", graphQLTypeSimpleName = "LuggageVolumeTechnicalDataItem", javaClass = LuggageVolumeTechnicalDataItem.class)
	LuggageVolumeTechnicalDataItem maxVolumeRear;


	@JsonProperty("rearVolume")
	@GraphQLNonScalar(fieldName = "rearVolume", graphQLTypeSimpleName = "LuggageVolumeTechnicalDataItem", javaClass = LuggageVolumeTechnicalDataItem.class)
	LuggageVolumeTechnicalDataItem rearVolume;


	@JsonProperty("volume")
	@GraphQLNonScalar(fieldName = "volume", graphQLTypeSimpleName = "LuggageVolumeTechnicalDataItem", javaClass = LuggageVolumeTechnicalDataItem.class)
	LuggageVolumeTechnicalDataItem volume;


	@JsonProperty("volumeSeatsFolded")
	@GraphQLNonScalar(fieldName = "volumeSeatsFolded", graphQLTypeSimpleName = "LuggageVolumeTechnicalDataItem", javaClass = LuggageVolumeTechnicalDataItem.class)
	LuggageVolumeTechnicalDataItem volumeSeatsFolded;


	@JsonProperty("__typename")
	@GraphQLScalar(fieldName = "__typename", graphQLTypeSimpleName = "String", javaClass = String.class)
	String __typename;



	public void setFrontVolume(LuggageVolumeTechnicalDataItem frontVolume) {
		this.frontVolume = frontVolume;
	}

	public LuggageVolumeTechnicalDataItem getFrontVolume() {
		return frontVolume;
	}
		

	public void setMaxVolumeRear(LuggageVolumeTechnicalDataItem maxVolumeRear) {
		this.maxVolumeRear = maxVolumeRear;
	}

	public LuggageVolumeTechnicalDataItem getMaxVolumeRear() {
		return maxVolumeRear;
	}
		

	public void setRearVolume(LuggageVolumeTechnicalDataItem rearVolume) {
		this.rearVolume = rearVolume;
	}

	public LuggageVolumeTechnicalDataItem getRearVolume() {
		return rearVolume;
	}
		

	public void setVolume(LuggageVolumeTechnicalDataItem volume) {
		this.volume = volume;
	}

	public LuggageVolumeTechnicalDataItem getVolume() {
		return volume;
	}
		

	public void setVolumeSeatsFolded(LuggageVolumeTechnicalDataItem volumeSeatsFolded) {
		this.volumeSeatsFolded = volumeSeatsFolded;
	}

	public LuggageVolumeTechnicalDataItem getVolumeSeatsFolded() {
		return volumeSeatsFolded;
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
        return "Luggage {"
				+ "frontVolume: " + frontVolume
				+ ", "
				+ "maxVolumeRear: " + maxVolumeRear
				+ ", "
				+ "rearVolume: " + rearVolume
				+ ", "
				+ "volume: " + volume
				+ ", "
				+ "volumeSeatsFolded: " + volumeSeatsFolded
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
		private LuggageVolumeTechnicalDataItem frontVolume;
		private LuggageVolumeTechnicalDataItem maxVolumeRear;
		private LuggageVolumeTechnicalDataItem rearVolume;
		private LuggageVolumeTechnicalDataItem volume;
		private LuggageVolumeTechnicalDataItem volumeSeatsFolded;

		public Builder withFrontVolume(LuggageVolumeTechnicalDataItem frontVolume) {
			this.frontVolume = frontVolume;
			return this;
		}
		public Builder withMaxVolumeRear(LuggageVolumeTechnicalDataItem maxVolumeRear) {
			this.maxVolumeRear = maxVolumeRear;
			return this;
		}
		public Builder withRearVolume(LuggageVolumeTechnicalDataItem rearVolume) {
			this.rearVolume = rearVolume;
			return this;
		}
		public Builder withVolume(LuggageVolumeTechnicalDataItem volume) {
			this.volume = volume;
			return this;
		}
		public Builder withVolumeSeatsFolded(LuggageVolumeTechnicalDataItem volumeSeatsFolded) {
			this.volumeSeatsFolded = volumeSeatsFolded;
			return this;
		}

		public Luggage build() {
			Luggage _object = new Luggage();
			_object.setFrontVolume(frontVolume);
			_object.setMaxVolumeRear(maxVolumeRear);
			_object.setRearVolume(rearVolume);
			_object.setVolume(volume);
			_object.setVolumeSeatsFolded(volumeSeatsFolded);
			_object.set__typename("Luggage");
			return _object;
		}
	}
}
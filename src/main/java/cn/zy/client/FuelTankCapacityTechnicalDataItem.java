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
@GraphQLObjectType("FuelTankCapacityTechnicalDataItem")
@JsonInclude(Include.NON_NULL)
@SuppressWarnings("unused")
public class FuelTankCapacityTechnicalDataItem 
	implements TechnicalDataItem, TechnicalDataItemInterface{

	/**
	 * This map contains the deserialized values for the alias, as parsed from the json response from the GraphQL
	 * server. The key is the alias name, the value is the deserialiazed value (taking into account custom scalars,
	 * lists, ...)
	 */
	@com.graphql_java_generator.annotation.GraphQLIgnore
	Map<String, Object> aliasValues = new HashMap<>();

	public FuelTankCapacityTechnicalDataItem(){
		// No action
	}

	@JsonProperty("value")
	@GraphQLNonScalar(fieldName = "value", graphQLTypeSimpleName = "FuelTankCapacityMeasurement", javaClass = FuelTankCapacityMeasurement.class)
	FuelTankCapacityMeasurement value;


	@JsonProperty("disclaimer")
	@GraphQLNonScalar(fieldName = "disclaimer", graphQLTypeSimpleName = "TranslatedText", javaClass = TranslatedText.class)
	TranslatedText disclaimer;


	@JsonProperty("name")
	@GraphQLNonScalar(fieldName = "name", graphQLTypeSimpleName = "TranslatedText", javaClass = TranslatedText.class)
	TranslatedText name;


	@JsonProperty("__typename")
	@GraphQLScalar(fieldName = "__typename", graphQLTypeSimpleName = "String", javaClass = String.class)
	String __typename;




	/**
	 */
	@Override
	public void setValue(FormattedMarketingValue value) {
		if (value == null || value instanceof FuelTankCapacityMeasurement) {
			this.value = (FuelTankCapacityMeasurement) value;
		} else {
			throw new IllegalArgumentException("The given value should be an instance of cn.zy.client.FuelTankCapacityMeasurement, but is an instance of "
					+ value.getClass().getName());
		}
	}
 

	/** 
	 * As the type declared in the class is not inherited from one of the implemented interfaces, we need a dedicated setter.
	 * 
	 * @param
	 */
	public void setValue(FuelTankCapacityMeasurement value) {
		this.value = value;
	}

	/**
	 */
	@Override
	public FuelTankCapacityMeasurement getValue() {
		return value;
	}


	/**
	 */
	@Override
	public void setDisclaimer(TranslatedText disclaimer) {
		if (disclaimer == null || disclaimer instanceof TranslatedText) {
			this.disclaimer = (TranslatedText) disclaimer;
		} else {
			throw new IllegalArgumentException("The given disclaimer should be an instance of cn.zy.client.TranslatedText, but is an instance of "
					+ disclaimer.getClass().getName());
		}
	}
 

	/**
	 */
	@Override
	public TranslatedText getDisclaimer() {
		return disclaimer;
	}


	/**
	 */
	@Override
	public void setName(TranslatedText name) {
		if (name == null || name instanceof TranslatedText) {
			this.name = (TranslatedText) name;
		} else {
			throw new IllegalArgumentException("The given name should be an instance of cn.zy.client.TranslatedText, but is an instance of "
					+ name.getClass().getName());
		}
	}
 

	/**
	 */
	@Override
	public TranslatedText getName() {
		return name;
	}


	/**
	 */
	@Override
	public void set__typename(String __typename) {
		if (__typename == null || __typename instanceof String) {
			this.__typename = (String) __typename;
		} else {
			throw new IllegalArgumentException("The given __typename should be an instance of java.lang.String, but is an instance of "
					+ __typename.getClass().getName());
		}
	}
 

	/**
	 */
	@Override
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
        return "FuelTankCapacityTechnicalDataItem {"
				+ "value: " + value
				+ ", "
				+ "disclaimer: " + disclaimer
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
		private FuelTankCapacityMeasurement value;
		private TranslatedText disclaimer;
		private TranslatedText name;

		public Builder withValue(FuelTankCapacityMeasurement value) {
			this.value = value;
			return this;
		}
		public Builder withDisclaimer(TranslatedText disclaimer) {
			this.disclaimer = disclaimer;
			return this;
		}
		public Builder withName(TranslatedText name) {
			this.name = name;
			return this;
		}

		public FuelTankCapacityTechnicalDataItem build() {
			FuelTankCapacityTechnicalDataItem _object = new FuelTankCapacityTechnicalDataItem();
			_object.setValue(value);
			_object.setDisclaimer(disclaimer);
			_object.setName(name);
			_object.set__typename("FuelTankCapacityTechnicalDataItem");
			return _object;
		}
	}
}

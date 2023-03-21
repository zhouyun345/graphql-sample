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
@GraphQLObjectType("FuelConsumptionMeasurement")
@JsonInclude(Include.NON_NULL)
@SuppressWarnings("unused")
public class FuelConsumptionMeasurement 
	implements Measurement, FormattedMarketingValue{

	/**
	 * This map contains the deserialized values for the alias, as parsed from the json response from the GraphQL
	 * server. The key is the alias name, the value is the deserialiazed value (taking into account custom scalars,
	 * lists, ...)
	 */
	@com.graphql_java_generator.annotation.GraphQLIgnore
	Map<String, Object> aliasValues = new HashMap<>();

	public FuelConsumptionMeasurement(){
		// No action
	}

	@JsonProperty("b35")
	@GraphQLNonScalar(fieldName = "b35", graphQLTypeSimpleName = "FloatUnitMeasurementValue", javaClass = FloatUnitMeasurementValue.class)
	FloatUnitMeasurementValue b35;


	@JsonProperty("milgluk")
	@GraphQLNonScalar(fieldName = "milgluk", graphQLTypeSimpleName = "FloatUnitMeasurementValue", javaClass = FloatUnitMeasurementValue.class)
	FloatUnitMeasurementValue milgluk;


	@JsonProperty("milglus")
	@GraphQLNonScalar(fieldName = "milglus", graphQLTypeSimpleName = "FloatUnitMeasurementValue", javaClass = FloatUnitMeasurementValue.class)
	FloatUnitMeasurementValue milglus;


	@JsonProperty("vkon")
	@GraphQLNonScalar(fieldName = "vkon", graphQLTypeSimpleName = "FloatUnitMeasurementValue", javaClass = FloatUnitMeasurementValue.class)
	FloatUnitMeasurementValue vkon;


	@JsonProperty("formattedInMarketplace")
	@GraphQLNonScalar(fieldName = "formattedInMarketplace", graphQLTypeSimpleName = "TranslatedText", javaClass = TranslatedText.class)
	TranslatedText formattedInMarketplace;


	@JsonProperty("__typename")
	@GraphQLScalar(fieldName = "__typename", graphQLTypeSimpleName = "String", javaClass = String.class)
	String __typename;



	public void setB35(FloatUnitMeasurementValue b35) {
		this.b35 = b35;
	}

	public FloatUnitMeasurementValue getB35() {
		return b35;
	}
		

	public void setMilgluk(FloatUnitMeasurementValue milgluk) {
		this.milgluk = milgluk;
	}

	public FloatUnitMeasurementValue getMilgluk() {
		return milgluk;
	}
		

	public void setMilglus(FloatUnitMeasurementValue milglus) {
		this.milglus = milglus;
	}

	public FloatUnitMeasurementValue getMilglus() {
		return milglus;
	}
		

	public void setVkon(FloatUnitMeasurementValue vkon) {
		this.vkon = vkon;
	}

	public FloatUnitMeasurementValue getVkon() {
		return vkon;
	}
		


	/**
	 */
	@Override
	public void setFormattedInMarketplace(TranslatedText formattedInMarketplace) {
		if (formattedInMarketplace == null || formattedInMarketplace instanceof TranslatedText) {
			this.formattedInMarketplace = (TranslatedText) formattedInMarketplace;
		} else {
			throw new IllegalArgumentException("The given formattedInMarketplace should be an instance of cn.zy.client.TranslatedText, but is an instance of "
					+ formattedInMarketplace.getClass().getName());
		}
	}
 

	/**
	 */
	@Override
	public TranslatedText getFormattedInMarketplace() {
		return formattedInMarketplace;
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
        return "FuelConsumptionMeasurement {"
				+ "b35: " + b35
				+ ", "
				+ "milgluk: " + milgluk
				+ ", "
				+ "milglus: " + milglus
				+ ", "
				+ "vkon: " + vkon
				+ ", "
				+ "formattedInMarketplace: " + formattedInMarketplace
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
		private FloatUnitMeasurementValue b35;
		private FloatUnitMeasurementValue milgluk;
		private FloatUnitMeasurementValue milglus;
		private FloatUnitMeasurementValue vkon;
		private TranslatedText formattedInMarketplace;

		public Builder withB35(FloatUnitMeasurementValue b35) {
			this.b35 = b35;
			return this;
		}
		public Builder withMilgluk(FloatUnitMeasurementValue milgluk) {
			this.milgluk = milgluk;
			return this;
		}
		public Builder withMilglus(FloatUnitMeasurementValue milglus) {
			this.milglus = milglus;
			return this;
		}
		public Builder withVkon(FloatUnitMeasurementValue vkon) {
			this.vkon = vkon;
			return this;
		}
		public Builder withFormattedInMarketplace(TranslatedText formattedInMarketplace) {
			this.formattedInMarketplace = formattedInMarketplace;
			return this;
		}

		public FuelConsumptionMeasurement build() {
			FuelConsumptionMeasurement _object = new FuelConsumptionMeasurement();
			_object.setB35(b35);
			_object.setMilgluk(milgluk);
			_object.setMilglus(milglus);
			_object.setVkon(vkon);
			_object.setFormattedInMarketplace(formattedInMarketplace);
			_object.set__typename("FuelConsumptionMeasurement");
			return _object;
		}
	}
}

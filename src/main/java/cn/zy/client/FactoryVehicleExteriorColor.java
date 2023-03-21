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
@GraphQLObjectType("FactoryVehicleExteriorColor")
@JsonInclude(Include.NON_NULL)
@SuppressWarnings("unused")
public class FactoryVehicleExteriorColor 
	implements ExteriorColor{

	/**
	 * This map contains the deserialized values for the alias, as parsed from the json response from the GraphQL
	 * server. The key is the alias name, the value is the deserialiazed value (taking into account custom scalars,
	 * lists, ...)
	 */
	@com.graphql_java_generator.annotation.GraphQLIgnore
	Map<String, Object> aliasValues = new HashMap<>();

	public FactoryVehicleExteriorColor(){
		// No action
	}

	@JsonProperty("optionCode")
	@GraphQLScalar(fieldName = "optionCode", graphQLTypeSimpleName = "String", javaClass = String.class)
	String optionCode;


	@JsonProperty("colorTag")
	@GraphQLNonScalar(fieldName = "colorTag", graphQLTypeSimpleName = "ColorTag", javaClass = ColorTag.class)
	ColorTag colorTag;


	@JsonProperty("customColorCode")
	@GraphQLScalar(fieldName = "customColorCode", graphQLTypeSimpleName = "String", javaClass = String.class)
	String customColorCode;


	@JsonProperty("exteriorColorType")
	@GraphQLNonScalar(fieldName = "exteriorColorType", graphQLTypeSimpleName = "TranslatedEnumValue", javaClass = TranslatedEnumValue.class)
	TranslatedEnumValue exteriorColorType;


	@JsonProperty("hexCode")
	@GraphQLScalar(fieldName = "hexCode", graphQLTypeSimpleName = "String", javaClass = String.class)
	String hexCode;


	@JsonProperty("isCustomColor")
	@GraphQLScalar(fieldName = "isCustomColor", graphQLTypeSimpleName = "Boolean", javaClass = Boolean.class)
	Boolean isCustomColor;


	@JsonProperty("name")
	@GraphQLNonScalar(fieldName = "name", graphQLTypeSimpleName = "TranslatedText", javaClass = TranslatedText.class)
	TranslatedText name;


	@JsonProperty("optionType")
	@GraphQLScalar(fieldName = "optionType", graphQLTypeSimpleName = "String", javaClass = String.class)
	String optionType;


	@JsonProperty("price")
	@GraphQLNonScalar(fieldName = "price", graphQLTypeSimpleName = "Price", javaClass = Price.class)
	Price price;


	@JsonProperty("__typename")
	@GraphQLScalar(fieldName = "__typename", graphQLTypeSimpleName = "String", javaClass = String.class)
	String __typename;




	/**
	 */
	@Override
	public void setOptionCode(String optionCode) {
		if (optionCode == null || optionCode instanceof String) {
			this.optionCode = (String) optionCode;
		} else {
			throw new IllegalArgumentException("The given optionCode should be an instance of java.lang.String, but is an instance of "
					+ optionCode.getClass().getName());
		}
	}
 

	/**
	 */
	@Override
	public String getOptionCode() {
		return optionCode;
	}


	/**
	 */
	@Override
	public void setColorTag(ColorTag colorTag) {
		if (colorTag == null || colorTag instanceof ColorTag) {
			this.colorTag = (ColorTag) colorTag;
		} else {
			throw new IllegalArgumentException("The given colorTag should be an instance of cn.zy.client.ColorTag, but is an instance of "
					+ colorTag.getClass().getName());
		}
	}
 

	/**
	 */
	@Override
	public ColorTag getColorTag() {
		return colorTag;
	}


	/**
	 */
	@Override
	public void setCustomColorCode(String customColorCode) {
		if (customColorCode == null || customColorCode instanceof String) {
			this.customColorCode = (String) customColorCode;
		} else {
			throw new IllegalArgumentException("The given customColorCode should be an instance of java.lang.String, but is an instance of "
					+ customColorCode.getClass().getName());
		}
	}
 

	/**
	 */
	@Override
	public String getCustomColorCode() {
		return customColorCode;
	}


	/**
	 */
	@Override
	public void setExteriorColorType(TranslatedEnumValue exteriorColorType) {
		if (exteriorColorType == null || exteriorColorType instanceof TranslatedEnumValue) {
			this.exteriorColorType = (TranslatedEnumValue) exteriorColorType;
		} else {
			throw new IllegalArgumentException("The given exteriorColorType should be an instance of cn.zy.client.TranslatedEnumValue, but is an instance of "
					+ exteriorColorType.getClass().getName());
		}
	}
 

	/**
	 */
	@Override
	public TranslatedEnumValue getExteriorColorType() {
		return exteriorColorType;
	}


	/**
	 */
	@Override
	public void setHexCode(String hexCode) {
		if (hexCode == null || hexCode instanceof String) {
			this.hexCode = (String) hexCode;
		} else {
			throw new IllegalArgumentException("The given hexCode should be an instance of java.lang.String, but is an instance of "
					+ hexCode.getClass().getName());
		}
	}
 

	/**
	 */
	@Override
	public String getHexCode() {
		return hexCode;
	}


	/**
	 */
	@Override
	public void setIsCustomColor(Boolean isCustomColor) {
		if (isCustomColor == null || isCustomColor instanceof Boolean) {
			this.isCustomColor = (Boolean) isCustomColor;
		} else {
			throw new IllegalArgumentException("The given isCustomColor should be an instance of java.lang.Boolean, but is an instance of "
					+ isCustomColor.getClass().getName());
		}
	}
 

	/**
	 */
	@Override
	public Boolean getIsCustomColor() {
		return isCustomColor;
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
	public void setOptionType(String optionType) {
		if (optionType == null || optionType instanceof String) {
			this.optionType = (String) optionType;
		} else {
			throw new IllegalArgumentException("The given optionType should be an instance of java.lang.String, but is an instance of "
					+ optionType.getClass().getName());
		}
	}
 

	/**
	 */
	@Override
	public String getOptionType() {
		return optionType;
	}


	/**
	 */
	@Override
	public void setPrice(Price price) {
		if (price == null || price instanceof Price) {
			this.price = (Price) price;
		} else {
			throw new IllegalArgumentException("The given price should be an instance of cn.zy.client.Price, but is an instance of "
					+ price.getClass().getName());
		}
	}
 

	/**
	 */
	@Override
	public Price getPrice() {
		return price;
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
        return "FactoryVehicleExteriorColor {"
				+ "optionCode: " + optionCode
				+ ", "
				+ "colorTag: " + colorTag
				+ ", "
				+ "customColorCode: " + customColorCode
				+ ", "
				+ "exteriorColorType: " + exteriorColorType
				+ ", "
				+ "hexCode: " + hexCode
				+ ", "
				+ "isCustomColor: " + isCustomColor
				+ ", "
				+ "name: " + name
				+ ", "
				+ "optionType: " + optionType
				+ ", "
				+ "price: " + price
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
		private String optionCode;
		private ColorTag colorTag;
		private String customColorCode;
		private TranslatedEnumValue exteriorColorType;
		private String hexCode;
		private Boolean isCustomColor;
		private TranslatedText name;
		private String optionType;
		private Price price;

		public Builder withOptionCode(String optionCode) {
			this.optionCode = optionCode;
			return this;
		}
		public Builder withColorTag(ColorTag colorTag) {
			this.colorTag = colorTag;
			return this;
		}
		public Builder withCustomColorCode(String customColorCode) {
			this.customColorCode = customColorCode;
			return this;
		}
		public Builder withExteriorColorType(TranslatedEnumValue exteriorColorType) {
			this.exteriorColorType = exteriorColorType;
			return this;
		}
		public Builder withHexCode(String hexCode) {
			this.hexCode = hexCode;
			return this;
		}
		public Builder withIsCustomColor(Boolean isCustomColor) {
			this.isCustomColor = isCustomColor;
			return this;
		}
		public Builder withName(TranslatedText name) {
			this.name = name;
			return this;
		}
		public Builder withOptionType(String optionType) {
			this.optionType = optionType;
			return this;
		}
		public Builder withPrice(Price price) {
			this.price = price;
			return this;
		}

		public FactoryVehicleExteriorColor build() {
			FactoryVehicleExteriorColor _object = new FactoryVehicleExteriorColor();
			_object.setOptionCode(optionCode);
			_object.setColorTag(colorTag);
			_object.setCustomColorCode(customColorCode);
			_object.setExteriorColorType(exteriorColorType);
			_object.setHexCode(hexCode);
			_object.setIsCustomColor(isCustomColor);
			_object.setName(name);
			_object.setOptionType(optionType);
			_object.setPrice(price);
			_object.set__typename("FactoryVehicleExteriorColor");
			return _object;
		}
	}
}

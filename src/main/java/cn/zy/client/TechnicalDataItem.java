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
@JsonSubTypes({ @Type(value = AccelerationTechnicalDataItem.class, name = "AccelerationTechnicalDataItem"), @Type(value = AngleTechnicalDataItem.class, name = "AngleTechnicalDataItem"), @Type(value = BodyDetailLengthTechnicalDataItem.class, name = "BodyDetailLengthTechnicalDataItem"), @Type(value = ChargingPowerTechnicalDataItem.class, name = "ChargingPowerTechnicalDataItem"), @Type(value = ChargingTimeAcTechnicalDataItem.class, name = "ChargingTimeAcTechnicalDataItem"), @Type(value = ChargingTimeDcTechnicalDataItem.class, name = "ChargingTimeDcTechnicalDataItem"), @Type(value = DisplacementTechnicalDataItem.class, name = "DisplacementTechnicalDataItem"), @Type(value = DragTechnicalDataItem.class, name = "DragTechnicalDataItem"), @Type(value = ElectricCapacityTechnicalDataItem.class, name = "ElectricCapacityTechnicalDataItem"), @Type(value = ElectricConsumptionEquivalentTechnicalDataItem.class, name = "ElectricConsumptionEquivalentTechnicalDataItem"), @Type(value = ElectricConsumptionTechnicalDataItem.class, name = "ElectricConsumptionTechnicalDataItem"), @Type(value = EmissionTechnicalDataItem.class, name = "EmissionTechnicalDataItem"), @Type(value = EngineDetailLengthTechnicalDataItem.class, name = "EngineDetailLengthTechnicalDataItem"), @Type(value = FuelConsumptionTechnicalDataItem.class, name = "FuelConsumptionTechnicalDataItem"), @Type(value = FuelTankCapacityTechnicalDataItem.class, name = "FuelTankCapacityTechnicalDataItem"), @Type(value = IntTechnicalDataItem.class, name = "IntTechnicalDataItem"), @Type(value = LuggageVolumeTechnicalDataItem.class, name = "LuggageVolumeTechnicalDataItem"), @Type(value = RangeTechnicalDataItem.class, name = "RangeTechnicalDataItem"), @Type(value = RpmRangeTechnicalDataItem.class, name = "RpmRangeTechnicalDataItem"), @Type(value = RpmTechnicalDataItem.class, name = "RpmTechnicalDataItem"), @Type(value = SpeedTechnicalDataItem.class, name = "SpeedTechnicalDataItem"), @Type(value = TorqueTechnicalDataItem.class, name = "TorqueTechnicalDataItem"), @Type(value = TranslatedEnumValueTechnicalDataItem.class, name = "TranslatedEnumValueTechnicalDataItem"), @Type(value = TurningRadiusTechnicalDataItem.class, name = "TurningRadiusTechnicalDataItem"), @Type(value = VehicleLengthTechnicalDataItem.class, name = "VehicleLengthTechnicalDataItem"), @Type(value = VehicleWeightTechnicalDataItem.class, name = "VehicleWeightTechnicalDataItem") })
@GraphQLInterfaceType("TechnicalDataItem")
@SuppressWarnings("unused")
public interface TechnicalDataItem  {

	@JsonProperty("disclaimer")
	@GraphQLNonScalar(fieldName = "disclaimer", graphQLTypeSimpleName = "TranslatedText", javaClass = TranslatedText.class)
	public void setDisclaimer(TranslatedText disclaimer);

	@JsonProperty("disclaimer")
	@GraphQLNonScalar(fieldName = "disclaimer", graphQLTypeSimpleName = "TranslatedText", javaClass = TranslatedText.class)
	public TranslatedText getDisclaimer();

	@JsonProperty("value")
	@GraphQLNonScalar(fieldName = "value", graphQLTypeSimpleName = "FormattedMarketingValue", javaClass = FormattedMarketingValue.class)
	public void setValue(FormattedMarketingValue value);

	@JsonProperty("value")
	@GraphQLNonScalar(fieldName = "value", graphQLTypeSimpleName = "FormattedMarketingValue", javaClass = FormattedMarketingValue.class)
	public FormattedMarketingValue getValue();

	@JsonProperty("name")
	@GraphQLNonScalar(fieldName = "name", graphQLTypeSimpleName = "TranslatedText", javaClass = TranslatedText.class)
	public void setName(TranslatedText name);

	@JsonProperty("name")
	@GraphQLNonScalar(fieldName = "name", graphQLTypeSimpleName = "TranslatedText", javaClass = TranslatedText.class)
	public TranslatedText getName();

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

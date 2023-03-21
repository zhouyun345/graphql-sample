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
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;
import java.util.List;

/**
 *
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("VehicleBasicData")
@JsonInclude(Include.NON_NULL)
@SuppressWarnings("unused")
public class VehicleBasicData 
{

	/**
	 * This map contains the deserialized values for the alias, as parsed from the json response from the GraphQL
	 * server. The key is the alias name, the value is the deserialiazed value (taking into account custom scalars,
	 * lists, ...)
	 */
	@com.graphql_java_generator.annotation.GraphQLIgnore
	Map<String, Object> aliasValues = new HashMap<>();

	public VehicleBasicData(){
		// No action
	}

	@JsonProperty("commissionNumber")
	@GraphQLScalar(fieldName = "commissionNumber", graphQLTypeSimpleName = "String", javaClass = String.class)
	String commissionNumber;


	@JsonProperty("dealer")
	@GraphQLScalar(fieldName = "dealer", graphQLTypeSimpleName = "String", javaClass = String.class)
	String dealer;


	@JsonProperty("driveSide")
	@GraphQLNonScalar(fieldName = "driveSide", graphQLTypeSimpleName = "TranslatedEnumValue", javaClass = TranslatedEnumValue.class)
	TranslatedEnumValue driveSide;


	@JsonProperty("engines")
	@JsonDeserialize(using = CustomJacksonDeserializers.ListString.class)
	@GraphQLScalar(fieldName = "engines", graphQLTypeSimpleName = "String", javaClass = String.class)
	List<String> engines;


	@JsonProperty("factory")
	@GraphQLNonScalar(fieldName = "factory", graphQLTypeSimpleName = "Factory", javaClass = Factory.class)
	Factory factory;


	@JsonProperty("orderSpecification")
	@GraphQLScalar(fieldName = "orderSpecification", graphQLTypeSimpleName = "String", javaClass = String.class)
	String orderSpecification;


	@JsonProperty("price")
	@GraphQLNonScalar(fieldName = "price", graphQLTypeSimpleName = "VehiclePrice", javaClass = VehiclePrice.class)
	VehiclePrice price;


	@JsonProperty("productionNumber")
	@GraphQLScalar(fieldName = "productionNumber", graphQLTypeSimpleName = "String", javaClass = String.class)
	String productionNumber;


	@JsonProperty("quoteMonth")
	@GraphQLNonScalar(fieldName = "quoteMonth", graphQLTypeSimpleName = "QuoteMonth", javaClass = QuoteMonth.class)
	QuoteMonth quoteMonth;


	@JsonProperty("shippingLocation")
	@GraphQLScalar(fieldName = "shippingLocation", graphQLTypeSimpleName = "String", javaClass = String.class)
	String shippingLocation;


	@JsonProperty("transmissions")
	@JsonDeserialize(using = CustomJacksonDeserializers.ListString.class)
	@GraphQLScalar(fieldName = "transmissions", graphQLTypeSimpleName = "String", javaClass = String.class)
	List<String> transmissions;


	@JsonProperty("tyres")
	@GraphQLNonScalar(fieldName = "tyres", graphQLTypeSimpleName = "Tyres", javaClass = Tyres.class)
	Tyres tyres;


	@JsonProperty("zp8Date")
	@JsonDeserialize(using = CustomJacksonDeserializers.Date.class)
	@GraphQLScalar(fieldName = "zp8Date", graphQLTypeSimpleName = "Date", javaClass = java.util.Date.class)
	java.util.Date zp8Date;


	@JsonProperty("__typename")
	@GraphQLScalar(fieldName = "__typename", graphQLTypeSimpleName = "String", javaClass = String.class)
	String __typename;



	public void setCommissionNumber(String commissionNumber) {
		this.commissionNumber = commissionNumber;
	}

	public String getCommissionNumber() {
		return commissionNumber;
	}
		

	public void setDealer(String dealer) {
		this.dealer = dealer;
	}

	public String getDealer() {
		return dealer;
	}
		

	public void setDriveSide(TranslatedEnumValue driveSide) {
		this.driveSide = driveSide;
	}

	public TranslatedEnumValue getDriveSide() {
		return driveSide;
	}
		

	public void setEngines(List<String> engines) {
		this.engines = engines;
	}

	public List<String> getEngines() {
		return engines;
	}
		

	public void setFactory(Factory factory) {
		this.factory = factory;
	}

	public Factory getFactory() {
		return factory;
	}
		

	public void setOrderSpecification(String orderSpecification) {
		this.orderSpecification = orderSpecification;
	}

	public String getOrderSpecification() {
		return orderSpecification;
	}
		

	public void setPrice(VehiclePrice price) {
		this.price = price;
	}

	public VehiclePrice getPrice() {
		return price;
	}
		

	public void setProductionNumber(String productionNumber) {
		this.productionNumber = productionNumber;
	}

	public String getProductionNumber() {
		return productionNumber;
	}
		

	public void setQuoteMonth(QuoteMonth quoteMonth) {
		this.quoteMonth = quoteMonth;
	}

	public QuoteMonth getQuoteMonth() {
		return quoteMonth;
	}
		

	public void setShippingLocation(String shippingLocation) {
		this.shippingLocation = shippingLocation;
	}

	public String getShippingLocation() {
		return shippingLocation;
	}
		

	public void setTransmissions(List<String> transmissions) {
		this.transmissions = transmissions;
	}

	public List<String> getTransmissions() {
		return transmissions;
	}
		

	public void setTyres(Tyres tyres) {
		this.tyres = tyres;
	}

	public Tyres getTyres() {
		return tyres;
	}
		

	public void setZp8Date(java.util.Date zp8Date) {
		this.zp8Date = zp8Date;
	}

	public java.util.Date getZp8Date() {
		return zp8Date;
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
        return "VehicleBasicData {"
				+ "commissionNumber: " + commissionNumber
				+ ", "
				+ "dealer: " + dealer
				+ ", "
				+ "driveSide: " + driveSide
				+ ", "
				+ "engines: " + engines
				+ ", "
				+ "factory: " + factory
				+ ", "
				+ "orderSpecification: " + orderSpecification
				+ ", "
				+ "price: " + price
				+ ", "
				+ "productionNumber: " + productionNumber
				+ ", "
				+ "quoteMonth: " + quoteMonth
				+ ", "
				+ "shippingLocation: " + shippingLocation
				+ ", "
				+ "transmissions: " + transmissions
				+ ", "
				+ "tyres: " + tyres
				+ ", "
				+ "zp8Date: " + zp8Date
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
		private String commissionNumber;
		private String dealer;
		private TranslatedEnumValue driveSide;
		private List<String> engines;
		private Factory factory;
		private String orderSpecification;
		private VehiclePrice price;
		private String productionNumber;
		private QuoteMonth quoteMonth;
		private String shippingLocation;
		private List<String> transmissions;
		private Tyres tyres;
		private java.util.Date zp8Date;

		public Builder withCommissionNumber(String commissionNumber) {
			this.commissionNumber = commissionNumber;
			return this;
		}
		public Builder withDealer(String dealer) {
			this.dealer = dealer;
			return this;
		}
		public Builder withDriveSide(TranslatedEnumValue driveSide) {
			this.driveSide = driveSide;
			return this;
		}
		public Builder withEngines(List<String> engines) {
			this.engines = engines;
			return this;
		}
		public Builder withFactory(Factory factory) {
			this.factory = factory;
			return this;
		}
		public Builder withOrderSpecification(String orderSpecification) {
			this.orderSpecification = orderSpecification;
			return this;
		}
		public Builder withPrice(VehiclePrice price) {
			this.price = price;
			return this;
		}
		public Builder withProductionNumber(String productionNumber) {
			this.productionNumber = productionNumber;
			return this;
		}
		public Builder withQuoteMonth(QuoteMonth quoteMonth) {
			this.quoteMonth = quoteMonth;
			return this;
		}
		public Builder withShippingLocation(String shippingLocation) {
			this.shippingLocation = shippingLocation;
			return this;
		}
		public Builder withTransmissions(List<String> transmissions) {
			this.transmissions = transmissions;
			return this;
		}
		public Builder withTyres(Tyres tyres) {
			this.tyres = tyres;
			return this;
		}
		public Builder withZp8Date(java.util.Date zp8Date) {
			this.zp8Date = zp8Date;
			return this;
		}

		public VehicleBasicData build() {
			VehicleBasicData _object = new VehicleBasicData();
			_object.setCommissionNumber(commissionNumber);
			_object.setDealer(dealer);
			_object.setDriveSide(driveSide);
			_object.setEngines(engines);
			_object.setFactory(factory);
			_object.setOrderSpecification(orderSpecification);
			_object.setPrice(price);
			_object.setProductionNumber(productionNumber);
			_object.setQuoteMonth(quoteMonth);
			_object.setShippingLocation(shippingLocation);
			_object.setTransmissions(transmissions);
			_object.setTyres(tyres);
			_object.setZp8Date(zp8Date);
			_object.set__typename("VehicleBasicData");
			return _object;
		}
	}
}
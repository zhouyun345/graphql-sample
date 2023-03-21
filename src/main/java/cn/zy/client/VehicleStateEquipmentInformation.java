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
@GraphQLObjectType("VehicleStateEquipmentInformation")
@JsonInclude(Include.NON_NULL)
@SuppressWarnings("unused")
public class VehicleStateEquipmentInformation 
	implements EquipmentInformation{

	/**
	 * This map contains the deserialized values for the alias, as parsed from the json response from the GraphQL
	 * server. The key is the alias name, the value is the deserialiazed value (taking into account custom scalars,
	 * lists, ...)
	 */
	@com.graphql_java_generator.annotation.GraphQLIgnore
	Map<String, Object> aliasValues = new HashMap<>();

	public VehicleStateEquipmentInformation(){
		// No action
	}

	@JsonProperty("options")
	@GraphQLNonScalar(fieldName = "options", graphQLTypeSimpleName = "VehicleStateEquipmentOptions", javaClass = VehicleStateEquipmentOptions.class)
	VehicleStateEquipmentOptions options;


	@JsonProperty("packages")
	@JsonDeserialize(using = CustomJacksonDeserializers.ListVehicleStateEquipmentPackage.class)
	@GraphQLNonScalar(fieldName = "packages", graphQLTypeSimpleName = "VehicleStateEquipmentPackage", javaClass = VehicleStateEquipmentPackage.class)
	List<VehicleStateEquipmentPackage> packages;


	@JsonProperty("categories")
	@JsonDeserialize(using = CustomJacksonDeserializers.ListVehicleStateEquipmentCategoryDetails.class)
	@GraphQLNonScalar(fieldName = "categories", graphQLTypeSimpleName = "VehicleStateEquipmentCategoryDetails", javaClass = VehicleStateEquipmentCategoryDetails.class)
	List<VehicleStateEquipmentCategoryDetails> categories;


	@JsonProperty("__typename")
	@GraphQLScalar(fieldName = "__typename", graphQLTypeSimpleName = "String", javaClass = String.class)
	String __typename;




	/**
	 */
	@Override
	public void setOptions(EquipmentOptions options) {
		if (options == null || options instanceof VehicleStateEquipmentOptions) {
			this.options = (VehicleStateEquipmentOptions) options;
		} else {
			throw new IllegalArgumentException("The given options should be an instance of cn.zy.client.VehicleStateEquipmentOptions, but is an instance of "
					+ options.getClass().getName());
		}
	}
 

	/** 
	 * As the type declared in the class is not inherited from one of the implemented interfaces, we need a dedicated setter.
	 * 
	 * @param
	 */
	public void setOptions(VehicleStateEquipmentOptions options) {
		this.options = options;
	}

	/**
	 */
	@Override
	public VehicleStateEquipmentOptions getOptions() {
		return options;
	}


	/**
	 */
	@Override
	@SuppressWarnings("unchecked")
	public void setPackages(List<EquipmentPackage> packages) {
		if (packages == null || packages instanceof List) {
			// packages is an instance of List<cn.zy.client.EquipmentPackage>. Let's check that this can be copied into a List<VehicleStateEquipmentPackage> 
			for (Object item : packages) {
				if (! (item instanceof VehicleStateEquipmentPackage))
					throw new IllegalArgumentException("The given packages should be a list of instances of cn.zy.client.VehicleStateEquipmentPackage, but at least one item is an instance of "
							+ item.getClass().getName());
			}
			this.packages = (List<VehicleStateEquipmentPackage>) (Object) packages;
		} else {
			throw new IllegalArgumentException("The given packages should be an instance of List<cn.zy.client.VehicleStateEquipmentPackage>, but is an instance of "
					+ packages.getClass().getName());
		}
	}
 

	/** 
	 * As the type declared in the class is not inherited from one of the implemented interfaces, we need a dedicated setter.
	 * <br/>
	 * As the GraphQL type of this field is a list of items that are not of the same type as the field defined in the implemented interface, 
	 * we need to have a dedicated setter with a specific name. This is due to Java that does type erasure on parameterized types (for 
	 * compatibility reasons with older java versions). As Java can't detect at runtime the type of the items of the list, it can't 
	 * decide which setter to call. To overcome this issue, this setter has a dedicated name.
	 * 
	 * @param
	 */
	public void setPackagesVehicleStateEquipmentPackage(List<VehicleStateEquipmentPackage> packages) {
		this.packages = packages;
	}

 	/**
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<EquipmentPackage> getPackages() {
		return (List<EquipmentPackage>) (Object) packages;
	}

	/**
	 */
	public List<VehicleStateEquipmentPackage> getPackagesVehicleStateEquipmentPackage() {
		return packages;
	}


	/**
	 */
	@Override
	@SuppressWarnings("unchecked")
	public void setCategories(List<EquipmentCategoryDetails> categories) {
		if (categories == null || categories instanceof List) {
			// categories is an instance of List<cn.zy.client.EquipmentCategoryDetails>. Let's check that this can be copied into a List<VehicleStateEquipmentCategoryDetails> 
			for (Object item : categories) {
				if (! (item instanceof VehicleStateEquipmentCategoryDetails))
					throw new IllegalArgumentException("The given categories should be a list of instances of cn.zy.client.VehicleStateEquipmentCategoryDetails, but at least one item is an instance of "
							+ item.getClass().getName());
			}
			this.categories = (List<VehicleStateEquipmentCategoryDetails>) (Object) categories;
		} else {
			throw new IllegalArgumentException("The given categories should be an instance of List<cn.zy.client.VehicleStateEquipmentCategoryDetails>, but is an instance of "
					+ categories.getClass().getName());
		}
	}
 

	/** 
	 * As the type declared in the class is not inherited from one of the implemented interfaces, we need a dedicated setter.
	 * <br/>
	 * As the GraphQL type of this field is a list of items that are not of the same type as the field defined in the implemented interface, 
	 * we need to have a dedicated setter with a specific name. This is due to Java that does type erasure on parameterized types (for 
	 * compatibility reasons with older java versions). As Java can't detect at runtime the type of the items of the list, it can't 
	 * decide which setter to call. To overcome this issue, this setter has a dedicated name.
	 * 
	 * @param
	 */
	public void setCategoriesVehicleStateEquipmentCategoryDetails(List<VehicleStateEquipmentCategoryDetails> categories) {
		this.categories = categories;
	}

 	/**
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<EquipmentCategoryDetails> getCategories() {
		return (List<EquipmentCategoryDetails>) (Object) categories;
	}

	/**
	 */
	public List<VehicleStateEquipmentCategoryDetails> getCategoriesVehicleStateEquipmentCategoryDetails() {
		return categories;
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
        return "VehicleStateEquipmentInformation {"
				+ "options: " + options
				+ ", "
				+ "packages: " + packages
				+ ", "
				+ "categories: " + categories
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
		private VehicleStateEquipmentOptions options;
		private List<VehicleStateEquipmentPackage> packages;
		private List<VehicleStateEquipmentCategoryDetails> categories;

		public Builder withOptions(VehicleStateEquipmentOptions options) {
			this.options = options;
			return this;
		}
		public Builder withPackages(List<VehicleStateEquipmentPackage> packages) {
			this.packages = packages;
			return this;
		}
		public Builder withCategories(List<VehicleStateEquipmentCategoryDetails> categories) {
			this.categories = categories;
			return this;
		}

		public VehicleStateEquipmentInformation build() {
			VehicleStateEquipmentInformation _object = new VehicleStateEquipmentInformation();
			_object.setOptions(options);
			_object.setPackagesVehicleStateEquipmentPackage(packages);
			_object.setCategoriesVehicleStateEquipmentCategoryDetails(categories);
			_object.set__typename("VehicleStateEquipmentInformation");
			return _object;
		}
	}
}

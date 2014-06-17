#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.domain;

import java.io.Serializable;

public class CustomPojo implements Serializable {

	private static final long serialVersionUID = 5747580392766173306L;

	private String name;
	private String description;

	public CustomPojo(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof CustomPojo)) {
			return false;
		}
		CustomPojo other = (CustomPojo) obj;
		if (description == null) {
			if (other.getDescription() != null) {
				return false;
			}
		} else if (!description.equals(other.getDescription())) {
			return false;
		}
		if (name == null) {
			if (other.getName() != null) {
				return false;
			}
		} else if (!name.equals(other.getName())) {
			return false;
		}
		return true;
	}

}

package biz.redlotus.hrms.enumeration;

public enum SortEnum {
	ASC, DESC;

	public String getLabel() {
		switch (this) {
		case ASC:
			return "ASC";
		case DESC:
			return "DESC";
		}
		return super.toString();
	}

}

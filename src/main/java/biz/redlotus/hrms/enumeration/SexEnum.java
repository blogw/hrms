package biz.redlotus.hrms.enumeration;

public enum SexEnum {
	MALE, FEMALE;

	public String getLabel() {
		switch (this) {
		case MALE:
			return "男性";
		case FEMALE:
			return "女性";
		}
		return super.toString();
	}

}

package biz.redlotus.hrms.enumeration;

public enum OpenLevelEnum {
	/*
	 * private static final String[] OPENLEVEL_ID = new String[] { "1", "2",
	 * "3",
	 * "99" };
	 * 
	 * private static final String[] OPENLEVEL_NAME = new String[] { "全員に公開",
	 * "同志／同志の同志に公開", "同志のみに公開", "公開しない" };
	 */

	ALLOPEN, FFOPEN, FOPEN, NOTOPEN;

	public String getLabel() {
		switch (this) {
		case ALLOPEN:
			return "全員に公開";
		case FFOPEN:
			return "同志／同志の同志に公開";
		case FOPEN:
			return "同志のみに公開";
		case NOTOPEN:
			return "公開しない";
		}
		return super.toString();
	}
}

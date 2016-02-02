package biz.redlotus.hrms.enumeration;

public enum AgeEnum {
	BEFORE_TEN, FIRST_TEN, LAST_TEN, FIRST_TWENTY, LAST_TWENTY, FIRST_THIRTY, LAST_THIRTY, FIRST_FORTY, LAST_FORTY, FIRST_FIFTY, LAST_FIFTY, FIRST_SIXTY, LAST_SIXTY, FIRST_SEVENTY, LAST_SEVENTY, FIRST_EIGHTY, LAST_EIGHTY, FIRST_NINETY, LAST_NINETY, HUNDRED;

	public String getLabel() {
		switch (this) {
		case BEFORE_TEN:
			return "１０歳未満";
		case FIRST_TEN:
			return "１０代前半";
		case LAST_TEN:
			return "１０代後半";
		case FIRST_TWENTY:
			return "２０代前半";
		case LAST_TWENTY:
			return "２０代後半";
		case FIRST_THIRTY:
			return "３０代前半";
		case LAST_THIRTY:
			return "３０代後半";
		case FIRST_FORTY:
			return "４０代前半";
		case LAST_FORTY:
			return "４０代後半";
		case FIRST_FIFTY:
			return "５０代前半";
		case LAST_FIFTY:
			return "５０代後半";
		case FIRST_SIXTY:
			return "６０代前半";
		case LAST_SIXTY:
			return "６０代後半";
		case FIRST_SEVENTY:
			return "７０代前半";
		case LAST_SEVENTY:
			return "７０代後半";
		case FIRST_EIGHTY:
			return "８０代前半";
		case LAST_EIGHTY:
			return "８０代後半";
		case FIRST_NINETY:
			return "９０代前半";
		case LAST_NINETY:
			return "９０代後半";
		case HUNDRED:
			return "１００歳以上";
		}
		return super.toString();
	}

	/*
	 * private static final String[] AGE_ID = new String[] { "0", "1", "2", "3",
	 * "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
	 * "16", "17", "18", "19" };
	 * 
	 * private static final String[] AGE_NAME = new String[] { "１０歳未満", "１０代前半",
	 * "１０代後半", "２０代前半", "２０代後半", "３０代前半", "３０代後半", "４０代前半", "４０代後半",
	 * "５０代前半", "５０代後半", "６０代前半", "６０代後半", "７０代前半", "７０代後半", "８０代前半",
	 * "８０代後半", "９０代前半", "９０代後半", "１００歳以上" };
	 */
}

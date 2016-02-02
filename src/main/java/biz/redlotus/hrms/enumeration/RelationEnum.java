package biz.redlotus.hrms.enumeration;

public enum RelationEnum {
	FRIEND_1, FRIEND_05, FRIEND_025, NOTFRIEND;

	public String getLabel() {
		switch (this) {
		case FRIEND_1:
			return "同志 ";
		case FRIEND_05:
			return "同志の同志 ";
		case FRIEND_025:
			return "同志の同志の同志 ";
		case NOTFRIEND:
			return "無縁 ";
		}
		return super.toString();
	}
}

package biz.redlotus.hrms.enumeration;

public enum SewaninMailEnum {
	REALTIME, SUMMARY;

	public String getLabel() {
		switch (this) {
		case REALTIME:
			return "リアルタイム受信 ";
		case SUMMARY:
			return "まとめ受信（２回／日：８時,１６時） ";
		}
		return super.toString();
	}
}

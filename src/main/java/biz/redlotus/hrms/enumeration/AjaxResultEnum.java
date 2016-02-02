package biz.redlotus.hrms.enumeration;

public enum AjaxResultEnum {
	SUCCESS, FAIL;

	public String getLabel() {
		switch (this) {
		case SUCCESS:
			return "success";
		case FAIL:
			return "fail";
		}
		return super.toString();
	}

}

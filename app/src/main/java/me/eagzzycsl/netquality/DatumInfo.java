package me.eagzzycsl.netquality;

final class DatumInfo extends BaseDatum {
    private MyInfoType myInfoType;
    private String value;

    DatumInfo(MyInfoType myInfoType, String value) {
        this.myInfoType = myInfoType;
        this.value = value;
    }

    final String getValue() {
        return this.value;
    }

    final String getKey() {
        return this.myInfoType.getKey();
    }

    public final String getName() {
        return this.myInfoType.getName();
    }

}

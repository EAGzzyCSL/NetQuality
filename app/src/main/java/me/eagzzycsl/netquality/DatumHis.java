package me.eagzzycsl.netquality;

class DatumHis extends BaseDatum {
    private String stamp;//某条记录的时间戳


    DatumHis(String stamp) {
        this.stamp = stamp;
    }

    String getStamp() {
        return this.stamp;
    }
}

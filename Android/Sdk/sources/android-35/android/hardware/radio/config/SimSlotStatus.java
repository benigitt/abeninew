/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java --structured --version 3 --hash 1e3dcfffc1e90fc886cf5a22ecaa94601b115710 --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/3/preprocessed.aidl --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.config-V3-java-source/gen/android/hardware/radio/config/SimSlotStatus.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.config-V3-java-source/gen -Nhardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.config/3 hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.config/3/android/hardware/radio/config/SimSlotStatus.aidl
 */
package android.hardware.radio.config;
/** @hide */
public class SimSlotStatus implements android.os.Parcelable
{
  public int cardState = 0;
  public java.lang.String atr;
  public java.lang.String eid;
  public android.hardware.radio.config.SimPortInfo[] portInfo;
  public int supportedMepMode = android.hardware.radio.config.MultipleEnabledProfilesMode.NONE;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<SimSlotStatus> CREATOR = new android.os.Parcelable.Creator<SimSlotStatus>() {
    @Override
    public SimSlotStatus createFromParcel(android.os.Parcel _aidl_source) {
      SimSlotStatus _aidl_out = new SimSlotStatus();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public SimSlotStatus[] newArray(int _aidl_size) {
      return new SimSlotStatus[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(cardState);
    _aidl_parcel.writeString(atr);
    _aidl_parcel.writeString(eid);
    _aidl_parcel.writeTypedArray(portInfo, _aidl_flag);
    _aidl_parcel.writeInt(supportedMepMode);
    int _aidl_end_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.setDataPosition(_aidl_start_pos);
    _aidl_parcel.writeInt(_aidl_end_pos - _aidl_start_pos);
    _aidl_parcel.setDataPosition(_aidl_end_pos);
  }
  public final void readFromParcel(android.os.Parcel _aidl_parcel)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    int _aidl_parcelable_size = _aidl_parcel.readInt();
    try {
      if (_aidl_parcelable_size < 4) throw new android.os.BadParcelableException("Parcelable too small");;
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      cardState = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      atr = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      eid = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      portInfo = _aidl_parcel.createTypedArray(android.hardware.radio.config.SimPortInfo.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      supportedMepMode = _aidl_parcel.readInt();
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  @Override
  public String toString() {
    java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "{", "}");
    _aidl_sj.add("cardState: " + (cardState));
    _aidl_sj.add("atr: " + (java.util.Objects.toString(atr)));
    _aidl_sj.add("eid: " + (java.util.Objects.toString(eid)));
    _aidl_sj.add("portInfo: " + (java.util.Arrays.toString(portInfo)));
    _aidl_sj.add("supportedMepMode: " + (android.hardware.radio.config.MultipleEnabledProfilesMode.$.toString(supportedMepMode)));
    return "SimSlotStatus" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(portInfo);
    return _mask;
  }
  private int describeContents(Object _v) {
    if (_v == null) return 0;
    if (_v instanceof Object[]) {
      int _mask = 0;
      for (Object o : (Object[]) _v) {
        _mask |= describeContents(o);
      }
      return _mask;
    }
    if (_v instanceof android.os.Parcelable) {
      return ((android.os.Parcelable) _v).describeContents();
    }
    return 0;
  }
}
/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java --structured --version 3 --hash c45c122528c07c449ea08f6eacaace17bb7abc38 --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/3/preprocessed.aidl --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V3-java-source/gen/android/hardware/radio/network/LinkCapacityEstimate.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V3-java-source/gen -Nhardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/3 hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/3/android/hardware/radio/network/LinkCapacityEstimate.aidl
 */
package android.hardware.radio.network;
/** @hide */
public class LinkCapacityEstimate implements android.os.Parcelable
{
  public int downlinkCapacityKbps = 0;
  public int uplinkCapacityKbps = 0;
  public int secondaryDownlinkCapacityKbps = 0;
  public int secondaryUplinkCapacityKbps = 0;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<LinkCapacityEstimate> CREATOR = new android.os.Parcelable.Creator<LinkCapacityEstimate>() {
    @Override
    public LinkCapacityEstimate createFromParcel(android.os.Parcel _aidl_source) {
      LinkCapacityEstimate _aidl_out = new LinkCapacityEstimate();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public LinkCapacityEstimate[] newArray(int _aidl_size) {
      return new LinkCapacityEstimate[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(downlinkCapacityKbps);
    _aidl_parcel.writeInt(uplinkCapacityKbps);
    _aidl_parcel.writeInt(secondaryDownlinkCapacityKbps);
    _aidl_parcel.writeInt(secondaryUplinkCapacityKbps);
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
      downlinkCapacityKbps = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      uplinkCapacityKbps = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      secondaryDownlinkCapacityKbps = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      secondaryUplinkCapacityKbps = _aidl_parcel.readInt();
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
    _aidl_sj.add("downlinkCapacityKbps: " + (downlinkCapacityKbps));
    _aidl_sj.add("uplinkCapacityKbps: " + (uplinkCapacityKbps));
    _aidl_sj.add("secondaryDownlinkCapacityKbps: " + (secondaryDownlinkCapacityKbps));
    _aidl_sj.add("secondaryUplinkCapacityKbps: " + (secondaryUplinkCapacityKbps));
    return "LinkCapacityEstimate" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java --structured --version 2 --hash fc957f1d3d261d065ff5e5415f2d21caa79c310f -t --stability vintf --min_sdk_version platform_apis --ninja -d out/soong/.intermediates/hardware/interfaces/gnss/aidl/android.hardware.gnss-V2-java-source/gen/android/hardware/gnss/CorrelationVector.java.d -o out/soong/.intermediates/hardware/interfaces/gnss/aidl/android.hardware.gnss-V2-java-source/gen -Nhardware/interfaces/gnss/aidl/aidl_api/android.hardware.gnss/2 hardware/interfaces/gnss/aidl/aidl_api/android.hardware.gnss/2/android/hardware/gnss/CorrelationVector.aidl
 */
package android.hardware.gnss;
/** @hide */
public class CorrelationVector implements android.os.Parcelable
{
  public double frequencyOffsetMps = 0.000000;
  public double samplingWidthM = 0.000000;
  public double samplingStartM = 0.000000;
  public int[] magnitude;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<CorrelationVector> CREATOR = new android.os.Parcelable.Creator<CorrelationVector>() {
    @Override
    public CorrelationVector createFromParcel(android.os.Parcel _aidl_source) {
      CorrelationVector _aidl_out = new CorrelationVector();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public CorrelationVector[] newArray(int _aidl_size) {
      return new CorrelationVector[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeDouble(frequencyOffsetMps);
    _aidl_parcel.writeDouble(samplingWidthM);
    _aidl_parcel.writeDouble(samplingStartM);
    _aidl_parcel.writeIntArray(magnitude);
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
      frequencyOffsetMps = _aidl_parcel.readDouble();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      samplingWidthM = _aidl_parcel.readDouble();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      samplingStartM = _aidl_parcel.readDouble();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      magnitude = _aidl_parcel.createIntArray();
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
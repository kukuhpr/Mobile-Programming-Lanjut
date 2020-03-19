package com.semester6.fragmentapp;

import android.os.Parcel;
import android.os.Parcelable;

public class pendidikan implements Parcelable {

    private String nama;
    private String deskripsi;
    private String poto;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getPoto() {
        return poto;
    }

    public void setPoto(String poto) {
        this.poto = poto;
    }

    @Override
    public int describeContents(){
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.nama);
        parcel.writeString(this.deskripsi);
        parcel.writeString(this.poto);
    }

    pendidikan(){

    }

    private pendidikan(Parcel in){
        this.nama = in.readString();
        this.deskripsi = in.readString();
        this.poto = in.readString();
    }

    public static final Parcelable.Creator<pendidikan>CREATOR = new Parcelable.Creator<pendidikan>(){

        @Override
        public pendidikan createFromParcel(Parcel parcel) {
            return new pendidikan(parcel);
        }

        @Override
        public pendidikan[] newArray(int i) {
            return new pendidikan[i];
        }
    };
}

package com.example.android.musictest;

import android.os.Parcel;
import android.os.Parcelable;

public class Music implements Parcelable {


    /**Name of song */
    private String mSongName;

    /**Name of Album*/
    private String mAlbumName;

    /** Album Cover Image*/
    private int mAlbumCover;



    public Music( int albumCover, String songName, String albumName) {
        mSongName= songName;
        mAlbumName = albumName;
        mAlbumCover= albumCover;
    }

    protected Music(Parcel in) {
        mSongName = in.readString();
        mAlbumName = in.readString();
        mAlbumCover = in.readInt();
    }

    public static final Creator<Music> CREATOR = new Creator<Music>() {
        @Override
        public Music createFromParcel(Parcel in) {
            return new Music(in);
        }

        @Override
        public Music[] newArray(int size) {
            return new Music[size];
        }
    };

    /**
     * Get song title.
     */

    public String getSongName(){
        return mSongName;
    }

    /**
     * Get album name.
     */

    public String getAlbumName(){
        return mAlbumName;
    }

    /**
     * Get album image.
     */

    public int getImageResource() {return mAlbumCover;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mSongName);
        dest.writeString(mAlbumName);
        dest.writeInt(mAlbumCover);
    }
}

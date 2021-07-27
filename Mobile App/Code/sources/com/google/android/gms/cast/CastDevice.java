package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1706in;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CastDevice implements SafeParcelable {
    public static final Parcelable.Creator<CastDevice> CREATOR = new C0662b();

    /* renamed from: CK */
    private final int f491CK;

    /* renamed from: FG */
    private String f492FG;

    /* renamed from: FH */
    String f493FH;

    /* renamed from: FI */
    private Inet4Address f494FI;

    /* renamed from: FJ */
    private String f495FJ;

    /* renamed from: FK */
    private String f496FK;

    /* renamed from: FL */
    private String f497FL;

    /* renamed from: FM */
    private int f498FM;

    /* renamed from: FN */
    private List<WebImage> f499FN;

    /* renamed from: FO */
    private int f500FO;

    /* renamed from: FP */
    private int f501FP;

    private CastDevice() {
        this(3, (String) null, (String) null, (String) null, (String) null, (String) null, -1, new ArrayList(), 0, -1);
    }

    CastDevice(int i, String str, String str2, String str3, String str4, String str5, int i2, List<WebImage> list, int i3, int i4) {
        this.f491CK = i;
        this.f492FG = str;
        this.f493FH = str2;
        if (this.f493FH != null) {
            try {
                InetAddress byName = InetAddress.getByName(this.f493FH);
                if (byName instanceof Inet4Address) {
                    this.f494FI = (Inet4Address) byName;
                }
            } catch (UnknownHostException e) {
                this.f494FI = null;
            }
        }
        this.f495FJ = str3;
        this.f496FK = str4;
        this.f497FL = str5;
        this.f498FM = i2;
        this.f499FN = list;
        this.f500FO = i3;
        this.f501FP = i4;
    }

    public static CastDevice getFromBundle(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(CastDevice.class.getClassLoader());
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        return getDeviceId() == null ? castDevice.getDeviceId() == null : C1706in.m5031a(this.f492FG, castDevice.f492FG) && C1706in.m5031a(this.f494FI, castDevice.f494FI) && C1706in.m5031a(this.f496FK, castDevice.f496FK) && C1706in.m5031a(this.f495FJ, castDevice.f495FJ) && C1706in.m5031a(this.f497FL, castDevice.f497FL) && this.f498FM == castDevice.f498FM && C1706in.m5031a(this.f499FN, castDevice.f499FN) && this.f500FO == castDevice.f500FO && this.f501FP == castDevice.f501FP;
    }

    public int getCapabilities() {
        return this.f500FO;
    }

    public String getDeviceId() {
        return this.f492FG;
    }

    public String getDeviceVersion() {
        return this.f497FL;
    }

    public String getFriendlyName() {
        return this.f495FJ;
    }

    public WebImage getIcon(int i, int i2) {
        WebImage webImage = null;
        if (this.f499FN.isEmpty()) {
            return null;
        }
        if (i <= 0 || i2 <= 0) {
            return this.f499FN.get(0);
        }
        WebImage webImage2 = null;
        for (WebImage next : this.f499FN) {
            int width = next.getWidth();
            int height = next.getHeight();
            if (width < i || height < i2) {
                if (width < i && height < i2) {
                    if (webImage2 == null || (webImage2.getWidth() < width && webImage2.getHeight() < height)) {
                        webImage2 = next;
                    }
                }
            } else if (webImage == null || (webImage.getWidth() > width && webImage.getHeight() > height)) {
                webImage = next;
            }
        }
        return webImage != null ? webImage : webImage2 != null ? webImage2 : this.f499FN.get(0);
    }

    public List<WebImage> getIcons() {
        return Collections.unmodifiableList(this.f499FN);
    }

    public Inet4Address getIpAddress() {
        return this.f494FI;
    }

    public String getModelName() {
        return this.f496FK;
    }

    public int getServicePort() {
        return this.f498FM;
    }

    public int getStatus() {
        return this.f501FP;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f491CK;
    }

    public boolean hasIcons() {
        return !this.f499FN.isEmpty();
    }

    public int hashCode() {
        if (this.f492FG == null) {
            return 0;
        }
        return this.f492FG.hashCode();
    }

    public boolean isOnLocalNetwork() {
        return !this.f492FG.startsWith("__cast_nearby__");
    }

    public boolean isSameDevice(CastDevice castDevice) {
        if (castDevice == null) {
            return false;
        }
        return getDeviceId() == null ? castDevice.getDeviceId() == null : C1706in.m5031a(getDeviceId(), castDevice.getDeviceId());
    }

    public void putInBundle(Bundle bundle) {
        if (bundle != null) {
            bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this);
        }
    }

    public String toString() {
        return String.format("\"%s\" (%s)", new Object[]{this.f495FJ, this.f492FG});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0662b.m465a(this, parcel, i);
    }
}

package com.google.android.gms.drive.events;

import com.google.android.gms.drive.DriveId;

/* renamed from: com.google.android.gms.drive.events.d */
public class C0742d {
    /* renamed from: a */
    public static boolean m841a(int i, DriveId driveId) {
        return driveId != null || m842bi(i);
    }

    /* renamed from: bi */
    public static boolean m842bi(int i) {
        return (((long) (1 << i)) & 2) != 0;
    }
}

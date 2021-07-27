package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.C2203b;
import com.google.android.gms.location.C2210e;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ni */
public interface C1993ni extends IInterface {

    /* renamed from: com.google.android.gms.internal.ni$a */
    public static abstract class C1994a extends Binder implements C1993ni {

        /* renamed from: com.google.android.gms.internal.ni$a$a */
        private static class C1995a implements C1993ni {

            /* renamed from: le */
            private IBinder f4140le;

            C1995a(IBinder iBinder) {
                this.f4140le = iBinder;
            }

            /* renamed from: S */
            public void mo16282S(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f4140le.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16283a(long j, boolean z, PendingIntent pendingIntent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeLong(j);
                    obtain.writeInt(z ? 1 : 0);
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4140le.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16284a(PendingIntent pendingIntent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4140le.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16285a(PendingIntent pendingIntent, C1990nh nhVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(nhVar != null ? nhVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4140le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16286a(Location location, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (location != null) {
                        obtain.writeInt(1);
                        location.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f4140le.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16287a(C1990nh nhVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeStrongBinder(nhVar != null ? nhVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4140le.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16288a(C2003nl nlVar, PendingIntent pendingIntent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (nlVar != null) {
                        obtain.writeInt(1);
                        nlVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4140le.transact(53, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16289a(C2003nl nlVar, C2203b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (nlVar != null) {
                        obtain.writeInt(1);
                        nlVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    this.f4140le.transact(52, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16290a(C2010ns nsVar, C2029oh ohVar, PendingIntent pendingIntent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (nsVar != null) {
                        obtain.writeInt(1);
                        nsVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (ohVar != null) {
                        obtain.writeInt(1);
                        ohVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4140le.transact(48, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16291a(C2012nu nuVar, C2029oh ohVar, C2026og ogVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (nuVar != null) {
                        obtain.writeInt(1);
                        nuVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (ohVar != null) {
                        obtain.writeInt(1);
                        ohVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(ogVar != null ? ogVar.asBinder() : null);
                    this.f4140le.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16292a(C2014nw nwVar, C2029oh ohVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (nwVar != null) {
                        obtain.writeInt(1);
                        nwVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (ohVar != null) {
                        obtain.writeInt(1);
                        ohVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4140le.transact(25, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16293a(C2016ny nyVar, C2029oh ohVar, PendingIntent pendingIntent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (nyVar != null) {
                        obtain.writeInt(1);
                        nyVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (ohVar != null) {
                        obtain.writeInt(1);
                        ohVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4140le.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16294a(C2022oc ocVar, C2029oh ohVar, C2026og ogVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (ocVar != null) {
                        obtain.writeInt(1);
                        ocVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (ohVar != null) {
                        obtain.writeInt(1);
                        ohVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(ogVar != null ? ogVar.asBinder() : null);
                    this.f4140le.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16295a(C2024oe oeVar, LatLngBounds latLngBounds, List<String> list, C2029oh ohVar, C2026og ogVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (oeVar != null) {
                        obtain.writeInt(1);
                        oeVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (latLngBounds != null) {
                        obtain.writeInt(1);
                        latLngBounds.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringList(list);
                    if (ohVar != null) {
                        obtain.writeInt(1);
                        ohVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(ogVar != null ? ogVar.asBinder() : null);
                    this.f4140le.transact(50, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16296a(C2029oh ohVar, PendingIntent pendingIntent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (ohVar != null) {
                        obtain.writeInt(1);
                        ohVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4140le.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16297a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, C1990nh nhVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (geofencingRequest != null) {
                        obtain.writeInt(1);
                        geofencingRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(nhVar != null ? nhVar.asBinder() : null);
                    this.f4140le.transact(57, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16298a(LocationRequest locationRequest, PendingIntent pendingIntent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (locationRequest != null) {
                        obtain.writeInt(1);
                        locationRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4140le.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16299a(LocationRequest locationRequest, C2203b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (locationRequest != null) {
                        obtain.writeInt(1);
                        locationRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    this.f4140le.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16300a(LocationRequest locationRequest, C2203b bVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (locationRequest != null) {
                        obtain.writeInt(1);
                        locationRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4140le.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16301a(C2203b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    this.f4140le.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16302a(LatLng latLng, C2012nu nuVar, C2029oh ohVar, C2026og ogVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (nuVar != null) {
                        obtain.writeInt(1);
                        nuVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (ohVar != null) {
                        obtain.writeInt(1);
                        ohVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(ogVar != null ? ogVar.asBinder() : null);
                    this.f4140le.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16303a(LatLngBounds latLngBounds, int i, C2012nu nuVar, C2029oh ohVar, C2026og ogVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (latLngBounds != null) {
                        obtain.writeInt(1);
                        latLngBounds.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    if (nuVar != null) {
                        obtain.writeInt(1);
                        nuVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (ohVar != null) {
                        obtain.writeInt(1);
                        ohVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(ogVar != null ? ogVar.asBinder() : null);
                    this.f4140le.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16304a(LatLngBounds latLngBounds, int i, String str, C2012nu nuVar, C2029oh ohVar, C2026og ogVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (latLngBounds != null) {
                        obtain.writeInt(1);
                        latLngBounds.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (nuVar != null) {
                        obtain.writeInt(1);
                        nuVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (ohVar != null) {
                        obtain.writeInt(1);
                        ohVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(ogVar != null ? ogVar.asBinder() : null);
                    this.f4140le.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16305a(String str, C2029oh ohVar, C2026og ogVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeString(str);
                    if (ohVar != null) {
                        obtain.writeInt(1);
                        ohVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(ogVar != null ? ogVar.asBinder() : null);
                    this.f4140le.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16306a(String str, LatLngBounds latLngBounds, C2008nq nqVar, C2029oh ohVar, C2026og ogVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeString(str);
                    if (latLngBounds != null) {
                        obtain.writeInt(1);
                        latLngBounds.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (nqVar != null) {
                        obtain.writeInt(1);
                        nqVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (ohVar != null) {
                        obtain.writeInt(1);
                        ohVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(ogVar != null ? ogVar.asBinder() : null);
                    this.f4140le.transact(55, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16307a(List<C2005nn> list, PendingIntent pendingIntent, C1990nh nhVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeTypedList(list);
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(nhVar != null ? nhVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4140le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16308a(List<String> list, C2029oh ohVar, C2026og ogVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeStringList(list);
                    if (ohVar != null) {
                        obtain.writeInt(1);
                        ohVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(ogVar != null ? ogVar.asBinder() : null);
                    this.f4140le.transact(58, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16309a(String[] strArr, C1990nh nhVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeStringArray(strArr);
                    obtain.writeStrongBinder(nhVar != null ? nhVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4140le.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4140le;
            }

            /* renamed from: b */
            public void mo16310b(PendingIntent pendingIntent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4140le.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo16311b(Location location) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (location != null) {
                        obtain.writeInt(1);
                        location.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4140le.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo16312b(C2029oh ohVar, PendingIntent pendingIntent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (ohVar != null) {
                        obtain.writeInt(1);
                        ohVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4140le.transact(49, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo16313b(String str, C2029oh ohVar, C2026og ogVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeString(str);
                    if (ohVar != null) {
                        obtain.writeInt(1);
                        ohVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(ogVar != null ? ogVar.asBinder() : null);
                    this.f4140le.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: bZ */
            public Location mo16314bZ(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeString(str);
                    this.f4140le.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ca */
            public C2210e mo16315ca(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeString(str);
                    this.f4140le.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? C2210e.CREATOR.mo17245cK(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ni */
            public Location mo16316ni() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    this.f4140le.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: nj */
            public IBinder mo16317nj() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    this.f4140le.transact(51, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: nk */
            public IBinder mo16318nk() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    this.f4140le.transact(54, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: aO */
        public static C1993ni m5881aO(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1993ni)) ? new C1995a(iBinder) : (C1993ni) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.google.android.gms.internal.oh} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.app.PendingIntent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: android.app.PendingIntent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: android.app.PendingIntent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: android.app.PendingIntent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: com.google.android.gms.location.LocationRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: android.app.PendingIntent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: android.app.PendingIntent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: android.location.Location} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: com.google.android.gms.internal.oh} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: com.google.android.gms.internal.oh} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: com.google.android.gms.internal.oh} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v36, resolved type: android.app.PendingIntent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: android.app.PendingIntent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v43, resolved type: com.google.android.gms.location.LocationRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v45, resolved type: com.google.android.gms.internal.oh} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v47, resolved type: android.location.Location} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v50, resolved type: com.google.android.gms.internal.oh} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v54, resolved type: android.app.PendingIntent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v58, resolved type: android.app.PendingIntent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v63, resolved type: com.google.android.gms.internal.nl} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v65, resolved type: android.app.PendingIntent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v70, resolved type: android.app.PendingIntent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v73, resolved type: com.google.android.gms.internal.oh} */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v27 */
        /* JADX WARNING: type inference failed for: r3v52 */
        /* JADX WARNING: type inference failed for: r3v61 */
        /* JADX WARNING: type inference failed for: r3v68 */
        /* JADX WARNING: type inference failed for: r3v75 */
        /* JADX WARNING: type inference failed for: r3v76 */
        /* JADX WARNING: type inference failed for: r3v77 */
        /* JADX WARNING: type inference failed for: r3v78 */
        /* JADX WARNING: type inference failed for: r3v79 */
        /* JADX WARNING: type inference failed for: r3v80 */
        /* JADX WARNING: type inference failed for: r3v81 */
        /* JADX WARNING: type inference failed for: r3v82 */
        /* JADX WARNING: type inference failed for: r3v83 */
        /* JADX WARNING: type inference failed for: r3v84 */
        /* JADX WARNING: type inference failed for: r3v85 */
        /* JADX WARNING: type inference failed for: r3v86 */
        /* JADX WARNING: type inference failed for: r3v87 */
        /* JADX WARNING: type inference failed for: r3v88 */
        /* JADX WARNING: type inference failed for: r3v89 */
        /* JADX WARNING: type inference failed for: r3v90 */
        /* JADX WARNING: type inference failed for: r3v91 */
        /* JADX WARNING: type inference failed for: r3v92 */
        /* JADX WARNING: type inference failed for: r3v93 */
        /* JADX WARNING: type inference failed for: r3v94 */
        /* JADX WARNING: type inference failed for: r3v95 */
        /* JADX WARNING: type inference failed for: r3v96 */
        /* JADX WARNING: type inference failed for: r3v97 */
        /* JADX WARNING: type inference failed for: r3v98 */
        /* JADX WARNING: type inference failed for: r3v99 */
        /* JADX WARNING: type inference failed for: r3v100 */
        /* JADX WARNING: type inference failed for: r3v101 */
        /* JADX WARNING: type inference failed for: r3v102 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r12, android.os.Parcel r13, android.os.Parcel r14, int r15) throws android.os.RemoteException {
            /*
                r11 = this;
                r0 = 34
                r1 = 0
                r2 = 1
                if (r12 == r0) goto L_0x05a6
                r0 = 42
                r3 = 0
                if (r12 == r0) goto L_0x0582
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r12 == r0) goto L_0x057c
                switch(r12) {
                    case 1: goto L_0x054f;
                    case 2: goto L_0x0528;
                    case 3: goto L_0x050c;
                    case 4: goto L_0x04f4;
                    case 5: goto L_0x04ce;
                    case 6: goto L_0x04b3;
                    case 7: goto L_0x049a;
                    case 8: goto L_0x047a;
                    case 9: goto L_0x0451;
                    case 10: goto L_0x043d;
                    case 11: goto L_0x0422;
                    case 12: goto L_0x040f;
                    case 13: goto L_0x03f4;
                    case 14: goto L_0x03b0;
                    case 15: goto L_0x038c;
                    case 16: goto L_0x0350;
                    case 17: goto L_0x0322;
                    case 18: goto L_0x02ec;
                    case 19: goto L_0x02c3;
                    case 20: goto L_0x029f;
                    case 21: goto L_0x0282;
                    default: goto L_0x0013;
                }
            L_0x0013:
                switch(r12) {
                    case 25: goto L_0x025f;
                    case 26: goto L_0x0240;
                    default: goto L_0x0016;
                }
            L_0x0016:
                switch(r12) {
                    case 46: goto L_0x0210;
                    case 47: goto L_0x01c8;
                    case 48: goto L_0x0192;
                    case 49: goto L_0x0169;
                    case 50: goto L_0x0125;
                    case 51: goto L_0x0115;
                    case 52: goto L_0x00f5;
                    case 53: goto L_0x00cc;
                    case 54: goto L_0x00bc;
                    case 55: goto L_0x0078;
                    default: goto L_0x0019;
                }
            L_0x0019:
                switch(r12) {
                    case 57: goto L_0x0045;
                    case 58: goto L_0x0021;
                    default: goto L_0x001c;
                }
            L_0x001c:
                boolean r0 = super.onTransact(r12, r13, r14, r15)
                return r0
            L_0x0021:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                java.util.ArrayList r0 = r13.createStringArrayList()
                int r1 = r13.readInt()
                if (r1 == 0) goto L_0x0036
                com.google.android.gms.internal.oi r1 = com.google.android.gms.internal.C2029oh.CREATOR
                com.google.android.gms.internal.oh r3 = r1.createFromParcel(r13)
            L_0x0036:
                android.os.IBinder r1 = r13.readStrongBinder()
                com.google.android.gms.internal.og r1 = com.google.android.gms.internal.C2026og.C2027a.m6011aP(r1)
                r11.mo16308a((java.util.List<java.lang.String>) r0, (com.google.android.gms.internal.C2029oh) r3, (com.google.android.gms.internal.C2026og) r1)
                r14.writeNoException()
                return r2
            L_0x0045:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x0059
                android.os.Parcelable$Creator<com.google.android.gms.location.GeofencingRequest> r0 = com.google.android.gms.location.GeofencingRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r13)
                com.google.android.gms.location.GeofencingRequest r0 = (com.google.android.gms.location.GeofencingRequest) r0
                goto L_0x005a
            L_0x0059:
                r0 = r3
            L_0x005a:
                int r1 = r13.readInt()
                if (r1 == 0) goto L_0x0069
                android.os.Parcelable$Creator r1 = android.app.PendingIntent.CREATOR
                java.lang.Object r1 = r1.createFromParcel(r13)
                r3 = r1
                android.app.PendingIntent r3 = (android.app.PendingIntent) r3
            L_0x0069:
                android.os.IBinder r1 = r13.readStrongBinder()
                com.google.android.gms.internal.nh r1 = com.google.android.gms.internal.C1990nh.C1991a.m5840aN(r1)
                r11.mo16297a((com.google.android.gms.location.GeofencingRequest) r0, (android.app.PendingIntent) r3, (com.google.android.gms.internal.C1990nh) r1)
                r14.writeNoException()
                return r2
            L_0x0078:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                java.lang.String r5 = r13.readString()
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x008f
                com.google.android.gms.maps.model.g r0 = com.google.android.gms.maps.model.LatLngBounds.CREATOR
                com.google.android.gms.maps.model.LatLngBounds r0 = r0.createFromParcel(r13)
                r6 = r0
                goto L_0x0090
            L_0x008f:
                r6 = r3
            L_0x0090:
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x009e
                com.google.android.gms.internal.nr r0 = com.google.android.gms.internal.C2008nq.CREATOR
                com.google.android.gms.internal.nq r0 = r0.createFromParcel(r13)
                r7 = r0
                goto L_0x009f
            L_0x009e:
                r7 = r3
            L_0x009f:
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x00ab
                com.google.android.gms.internal.oi r0 = com.google.android.gms.internal.C2029oh.CREATOR
                com.google.android.gms.internal.oh r3 = r0.createFromParcel(r13)
            L_0x00ab:
                r8 = r3
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.og r9 = com.google.android.gms.internal.C2026og.C2027a.m6011aP(r0)
                r4 = r11
                r4.mo16306a((java.lang.String) r5, (com.google.android.gms.maps.model.LatLngBounds) r6, (com.google.android.gms.internal.C2008nq) r7, (com.google.android.gms.internal.C2029oh) r8, (com.google.android.gms.internal.C2026og) r9)
                r14.writeNoException()
                return r2
            L_0x00bc:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r11.mo16318nk()
                r14.writeNoException()
                r14.writeStrongBinder(r0)
                return r2
            L_0x00cc:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x00de
                com.google.android.gms.internal.nm r0 = com.google.android.gms.internal.C2003nl.CREATOR
                com.google.android.gms.internal.nl r0 = r0.createFromParcel(r13)
                goto L_0x00df
            L_0x00de:
                r0 = r3
            L_0x00df:
                int r1 = r13.readInt()
                if (r1 == 0) goto L_0x00ee
                android.os.Parcelable$Creator r1 = android.app.PendingIntent.CREATOR
                java.lang.Object r1 = r1.createFromParcel(r13)
                r3 = r1
                android.app.PendingIntent r3 = (android.app.PendingIntent) r3
            L_0x00ee:
                r11.mo16288a((com.google.android.gms.internal.C2003nl) r0, (android.app.PendingIntent) r3)
                r14.writeNoException()
                return r2
            L_0x00f5:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x0106
                com.google.android.gms.internal.nm r0 = com.google.android.gms.internal.C2003nl.CREATOR
                com.google.android.gms.internal.nl r3 = r0.createFromParcel(r13)
            L_0x0106:
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.location.b r0 = com.google.android.gms.location.C2203b.C2204a.m6629aL(r0)
                r11.mo16289a((com.google.android.gms.internal.C2003nl) r3, (com.google.android.gms.location.C2203b) r0)
                r14.writeNoException()
                return r2
            L_0x0115:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r11.mo16317nj()
                r14.writeNoException()
                r14.writeStrongBinder(r0)
                return r2
            L_0x0125:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x0138
                com.google.android.gms.internal.of r0 = com.google.android.gms.internal.C2024oe.CREATOR
                com.google.android.gms.internal.oe r0 = r0.createFromParcel(r13)
                r5 = r0
                goto L_0x0139
            L_0x0138:
                r5 = r3
            L_0x0139:
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x0147
                com.google.android.gms.maps.model.g r0 = com.google.android.gms.maps.model.LatLngBounds.CREATOR
                com.google.android.gms.maps.model.LatLngBounds r0 = r0.createFromParcel(r13)
                r6 = r0
                goto L_0x0148
            L_0x0147:
                r6 = r3
            L_0x0148:
                java.util.ArrayList r7 = r13.createStringArrayList()
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x0158
                com.google.android.gms.internal.oi r0 = com.google.android.gms.internal.C2029oh.CREATOR
                com.google.android.gms.internal.oh r3 = r0.createFromParcel(r13)
            L_0x0158:
                r8 = r3
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.og r9 = com.google.android.gms.internal.C2026og.C2027a.m6011aP(r0)
                r4 = r11
                r4.mo16295a((com.google.android.gms.internal.C2024oe) r5, (com.google.android.gms.maps.model.LatLngBounds) r6, (java.util.List<java.lang.String>) r7, (com.google.android.gms.internal.C2029oh) r8, (com.google.android.gms.internal.C2026og) r9)
                r14.writeNoException()
                return r2
            L_0x0169:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x017b
                com.google.android.gms.internal.oi r0 = com.google.android.gms.internal.C2029oh.CREATOR
                com.google.android.gms.internal.oh r0 = r0.createFromParcel(r13)
                goto L_0x017c
            L_0x017b:
                r0 = r3
            L_0x017c:
                int r1 = r13.readInt()
                if (r1 == 0) goto L_0x018b
                android.os.Parcelable$Creator r1 = android.app.PendingIntent.CREATOR
                java.lang.Object r1 = r1.createFromParcel(r13)
                r3 = r1
                android.app.PendingIntent r3 = (android.app.PendingIntent) r3
            L_0x018b:
                r11.mo16312b(r0, r3)
                r14.writeNoException()
                return r2
            L_0x0192:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x01a4
                com.google.android.gms.internal.nt r0 = com.google.android.gms.internal.C2010ns.CREATOR
                com.google.android.gms.internal.ns r0 = r0.createFromParcel(r13)
                goto L_0x01a5
            L_0x01a4:
                r0 = r3
            L_0x01a5:
                int r1 = r13.readInt()
                if (r1 == 0) goto L_0x01b2
                com.google.android.gms.internal.oi r1 = com.google.android.gms.internal.C2029oh.CREATOR
                com.google.android.gms.internal.oh r1 = r1.createFromParcel(r13)
                goto L_0x01b3
            L_0x01b2:
                r1 = r3
            L_0x01b3:
                int r4 = r13.readInt()
                if (r4 == 0) goto L_0x01c1
                android.os.Parcelable$Creator r3 = android.app.PendingIntent.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r13)
                android.app.PendingIntent r3 = (android.app.PendingIntent) r3
            L_0x01c1:
                r11.mo16290a((com.google.android.gms.internal.C2010ns) r0, (com.google.android.gms.internal.C2029oh) r1, (android.app.PendingIntent) r3)
                r14.writeNoException()
                return r2
            L_0x01c8:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x01db
                com.google.android.gms.maps.model.g r0 = com.google.android.gms.maps.model.LatLngBounds.CREATOR
                com.google.android.gms.maps.model.LatLngBounds r0 = r0.createFromParcel(r13)
                r5 = r0
                goto L_0x01dc
            L_0x01db:
                r5 = r3
            L_0x01dc:
                int r6 = r13.readInt()
                java.lang.String r7 = r13.readString()
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x01f2
                com.google.android.gms.internal.nv r0 = com.google.android.gms.internal.C2012nu.CREATOR
                com.google.android.gms.internal.nu r0 = r0.createFromParcel(r13)
                r8 = r0
                goto L_0x01f3
            L_0x01f2:
                r8 = r3
            L_0x01f3:
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x01ff
                com.google.android.gms.internal.oi r0 = com.google.android.gms.internal.C2029oh.CREATOR
                com.google.android.gms.internal.oh r3 = r0.createFromParcel(r13)
            L_0x01ff:
                r9 = r3
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.og r10 = com.google.android.gms.internal.C2026og.C2027a.m6011aP(r0)
                r4 = r11
                r4.mo16304a(r5, r6, r7, r8, r9, r10)
                r14.writeNoException()
                return r2
            L_0x0210:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x0224
                android.os.Parcelable$Creator<com.google.android.gms.internal.oc> r0 = com.google.android.gms.internal.C2022oc.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r13)
                com.google.android.gms.internal.oc r0 = (com.google.android.gms.internal.C2022oc) r0
                goto L_0x0225
            L_0x0224:
                r0 = r3
            L_0x0225:
                int r1 = r13.readInt()
                if (r1 == 0) goto L_0x0231
                com.google.android.gms.internal.oi r1 = com.google.android.gms.internal.C2029oh.CREATOR
                com.google.android.gms.internal.oh r3 = r1.createFromParcel(r13)
            L_0x0231:
                android.os.IBinder r1 = r13.readStrongBinder()
                com.google.android.gms.internal.og r1 = com.google.android.gms.internal.C2026og.C2027a.m6011aP(r1)
                r11.mo16294a((com.google.android.gms.internal.C2022oc) r0, (com.google.android.gms.internal.C2029oh) r3, (com.google.android.gms.internal.C2026og) r1)
                r14.writeNoException()
                return r2
            L_0x0240:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x0254
                android.os.Parcelable$Creator r0 = android.location.Location.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r13)
                r3 = r0
                android.location.Location r3 = (android.location.Location) r3
            L_0x0254:
                int r0 = r13.readInt()
                r11.mo16286a((android.location.Location) r3, (int) r0)
                r14.writeNoException()
                return r2
            L_0x025f:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x0271
                com.google.android.gms.internal.nx r0 = com.google.android.gms.internal.C2014nw.CREATOR
                com.google.android.gms.internal.nw r0 = r0.createFromParcel(r13)
                goto L_0x0272
            L_0x0271:
                r0 = r3
            L_0x0272:
                int r1 = r13.readInt()
                if (r1 == 0) goto L_0x027e
                com.google.android.gms.internal.oi r1 = com.google.android.gms.internal.C2029oh.CREATOR
                com.google.android.gms.internal.oh r3 = r1.createFromParcel(r13)
            L_0x027e:
                r11.mo16292a((com.google.android.gms.internal.C2014nw) r0, (com.google.android.gms.internal.C2029oh) r3)
                return r2
            L_0x0282:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                java.lang.String r0 = r13.readString()
                android.location.Location r0 = r11.mo16314bZ(r0)
                r14.writeNoException()
                if (r0 == 0) goto L_0x029b
                r14.writeInt(r2)
                r0.writeToParcel(r14, r2)
                return r2
            L_0x029b:
                r14.writeInt(r1)
                return r2
            L_0x029f:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x02b0
                com.google.android.gms.location.d r0 = com.google.android.gms.location.LocationRequest.CREATOR
                com.google.android.gms.location.LocationRequest r3 = r0.createFromParcel(r13)
            L_0x02b0:
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.location.b r0 = com.google.android.gms.location.C2203b.C2204a.m6629aL(r0)
                java.lang.String r1 = r13.readString()
                r11.mo16300a((com.google.android.gms.location.LocationRequest) r3, (com.google.android.gms.location.C2203b) r0, (java.lang.String) r1)
                r14.writeNoException()
                return r2
            L_0x02c3:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x02d5
                com.google.android.gms.internal.oi r0 = com.google.android.gms.internal.C2029oh.CREATOR
                com.google.android.gms.internal.oh r0 = r0.createFromParcel(r13)
                goto L_0x02d6
            L_0x02d5:
                r0 = r3
            L_0x02d6:
                int r1 = r13.readInt()
                if (r1 == 0) goto L_0x02e5
                android.os.Parcelable$Creator r1 = android.app.PendingIntent.CREATOR
                java.lang.Object r1 = r1.createFromParcel(r13)
                r3 = r1
                android.app.PendingIntent r3 = (android.app.PendingIntent) r3
            L_0x02e5:
                r11.mo16296a((com.google.android.gms.internal.C2029oh) r0, (android.app.PendingIntent) r3)
                r14.writeNoException()
                return r2
            L_0x02ec:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x02fe
                com.google.android.gms.internal.nz r0 = com.google.android.gms.internal.C2016ny.CREATOR
                com.google.android.gms.internal.ny r0 = r0.createFromParcel(r13)
                goto L_0x02ff
            L_0x02fe:
                r0 = r3
            L_0x02ff:
                int r1 = r13.readInt()
                if (r1 == 0) goto L_0x030c
                com.google.android.gms.internal.oi r1 = com.google.android.gms.internal.C2029oh.CREATOR
                com.google.android.gms.internal.oh r1 = r1.createFromParcel(r13)
                goto L_0x030d
            L_0x030c:
                r1 = r3
            L_0x030d:
                int r4 = r13.readInt()
                if (r4 == 0) goto L_0x031b
                android.os.Parcelable$Creator r3 = android.app.PendingIntent.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r13)
                android.app.PendingIntent r3 = (android.app.PendingIntent) r3
            L_0x031b:
                r11.mo16293a((com.google.android.gms.internal.C2016ny) r0, (com.google.android.gms.internal.C2029oh) r1, (android.app.PendingIntent) r3)
                r14.writeNoException()
                return r2
            L_0x0322:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x0334
                com.google.android.gms.internal.nv r0 = com.google.android.gms.internal.C2012nu.CREATOR
                com.google.android.gms.internal.nu r0 = r0.createFromParcel(r13)
                goto L_0x0335
            L_0x0334:
                r0 = r3
            L_0x0335:
                int r1 = r13.readInt()
                if (r1 == 0) goto L_0x0341
                com.google.android.gms.internal.oi r1 = com.google.android.gms.internal.C2029oh.CREATOR
                com.google.android.gms.internal.oh r3 = r1.createFromParcel(r13)
            L_0x0341:
                android.os.IBinder r1 = r13.readStrongBinder()
                com.google.android.gms.internal.og r1 = com.google.android.gms.internal.C2026og.C2027a.m6011aP(r1)
                r11.mo16291a((com.google.android.gms.internal.C2012nu) r0, (com.google.android.gms.internal.C2029oh) r3, (com.google.android.gms.internal.C2026og) r1)
                r14.writeNoException()
                return r2
            L_0x0350:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x0362
                com.google.android.gms.maps.model.i r0 = com.google.android.gms.maps.model.LatLng.CREATOR
                com.google.android.gms.maps.model.LatLng r0 = r0.createFromParcel(r13)
                goto L_0x0363
            L_0x0362:
                r0 = r3
            L_0x0363:
                int r1 = r13.readInt()
                if (r1 == 0) goto L_0x0370
                com.google.android.gms.internal.nv r1 = com.google.android.gms.internal.C2012nu.CREATOR
                com.google.android.gms.internal.nu r1 = r1.createFromParcel(r13)
                goto L_0x0371
            L_0x0370:
                r1 = r3
            L_0x0371:
                int r4 = r13.readInt()
                if (r4 == 0) goto L_0x037d
                com.google.android.gms.internal.oi r3 = com.google.android.gms.internal.C2029oh.CREATOR
                com.google.android.gms.internal.oh r3 = r3.createFromParcel(r13)
            L_0x037d:
                android.os.IBinder r4 = r13.readStrongBinder()
                com.google.android.gms.internal.og r4 = com.google.android.gms.internal.C2026og.C2027a.m6011aP(r4)
                r11.mo16302a((com.google.android.gms.maps.model.LatLng) r0, (com.google.android.gms.internal.C2012nu) r1, (com.google.android.gms.internal.C2029oh) r3, (com.google.android.gms.internal.C2026og) r4)
                r14.writeNoException()
                return r2
            L_0x038c:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                java.lang.String r0 = r13.readString()
                int r1 = r13.readInt()
                if (r1 == 0) goto L_0x03a1
                com.google.android.gms.internal.oi r1 = com.google.android.gms.internal.C2029oh.CREATOR
                com.google.android.gms.internal.oh r3 = r1.createFromParcel(r13)
            L_0x03a1:
                android.os.IBinder r1 = r13.readStrongBinder()
                com.google.android.gms.internal.og r1 = com.google.android.gms.internal.C2026og.C2027a.m6011aP(r1)
                r11.mo16305a((java.lang.String) r0, (com.google.android.gms.internal.C2029oh) r3, (com.google.android.gms.internal.C2026og) r1)
                r14.writeNoException()
                return r2
            L_0x03b0:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x03c3
                com.google.android.gms.maps.model.g r0 = com.google.android.gms.maps.model.LatLngBounds.CREATOR
                com.google.android.gms.maps.model.LatLngBounds r0 = r0.createFromParcel(r13)
                r5 = r0
                goto L_0x03c4
            L_0x03c3:
                r5 = r3
            L_0x03c4:
                int r6 = r13.readInt()
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x03d6
                com.google.android.gms.internal.nv r0 = com.google.android.gms.internal.C2012nu.CREATOR
                com.google.android.gms.internal.nu r0 = r0.createFromParcel(r13)
                r7 = r0
                goto L_0x03d7
            L_0x03d6:
                r7 = r3
            L_0x03d7:
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x03e3
                com.google.android.gms.internal.oi r0 = com.google.android.gms.internal.C2029oh.CREATOR
                com.google.android.gms.internal.oh r3 = r0.createFromParcel(r13)
            L_0x03e3:
                r8 = r3
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.og r9 = com.google.android.gms.internal.C2026og.C2027a.m6011aP(r0)
                r4 = r11
                r4.mo16303a((com.google.android.gms.maps.model.LatLngBounds) r5, (int) r6, (com.google.android.gms.internal.C2012nu) r7, (com.google.android.gms.internal.C2029oh) r8, (com.google.android.gms.internal.C2026og) r9)
                r14.writeNoException()
                return r2
            L_0x03f4:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x0408
                android.os.Parcelable$Creator r0 = android.location.Location.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r13)
                r3 = r0
                android.location.Location r3 = (android.location.Location) r3
            L_0x0408:
                r11.mo16311b((android.location.Location) r3)
                r14.writeNoException()
                return r2
            L_0x040f:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x041b
                r1 = r2
            L_0x041b:
                r11.mo16282S(r1)
                r14.writeNoException()
                return r2
            L_0x0422:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x0436
                android.os.Parcelable$Creator r0 = android.app.PendingIntent.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r13)
                r3 = r0
                android.app.PendingIntent r3 = (android.app.PendingIntent) r3
            L_0x0436:
                r11.mo16310b((android.app.PendingIntent) r3)
                r14.writeNoException()
                return r2
            L_0x043d:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.location.b r0 = com.google.android.gms.location.C2203b.C2204a.m6629aL(r0)
                r11.mo16301a((com.google.android.gms.location.C2203b) r0)
                r14.writeNoException()
                return r2
            L_0x0451:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x0463
                com.google.android.gms.location.d r0 = com.google.android.gms.location.LocationRequest.CREATOR
                com.google.android.gms.location.LocationRequest r0 = r0.createFromParcel(r13)
                goto L_0x0464
            L_0x0463:
                r0 = r3
            L_0x0464:
                int r1 = r13.readInt()
                if (r1 == 0) goto L_0x0473
                android.os.Parcelable$Creator r1 = android.app.PendingIntent.CREATOR
                java.lang.Object r1 = r1.createFromParcel(r13)
                r3 = r1
                android.app.PendingIntent r3 = (android.app.PendingIntent) r3
            L_0x0473:
                r11.mo16298a((com.google.android.gms.location.LocationRequest) r0, (android.app.PendingIntent) r3)
                r14.writeNoException()
                return r2
            L_0x047a:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x048b
                com.google.android.gms.location.d r0 = com.google.android.gms.location.LocationRequest.CREATOR
                com.google.android.gms.location.LocationRequest r3 = r0.createFromParcel(r13)
            L_0x048b:
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.location.b r0 = com.google.android.gms.location.C2203b.C2204a.m6629aL(r0)
                r11.mo16299a((com.google.android.gms.location.LocationRequest) r3, (com.google.android.gms.location.C2203b) r0)
                r14.writeNoException()
                return r2
            L_0x049a:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                android.location.Location r0 = r11.mo16316ni()
                r14.writeNoException()
                if (r0 == 0) goto L_0x04af
                r14.writeInt(r2)
                r0.writeToParcel(r14, r2)
                return r2
            L_0x04af:
                r14.writeInt(r1)
                return r2
            L_0x04b3:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x04c7
                android.os.Parcelable$Creator r0 = android.app.PendingIntent.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r13)
                r3 = r0
                android.app.PendingIntent r3 = (android.app.PendingIntent) r3
            L_0x04c7:
                r11.mo16284a((android.app.PendingIntent) r3)
                r14.writeNoException()
                return r2
            L_0x04ce:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                long r4 = r13.readLong()
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x04de
                r1 = r2
            L_0x04de:
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x04ed
                android.os.Parcelable$Creator r0 = android.app.PendingIntent.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r13)
                r3 = r0
                android.app.PendingIntent r3 = (android.app.PendingIntent) r3
            L_0x04ed:
                r11.mo16283a((long) r4, (boolean) r1, (android.app.PendingIntent) r3)
                r14.writeNoException()
                return r2
            L_0x04f4:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.nh r0 = com.google.android.gms.internal.C1990nh.C1991a.m5840aN(r0)
                java.lang.String r1 = r13.readString()
                r11.mo16287a((com.google.android.gms.internal.C1990nh) r0, (java.lang.String) r1)
                r14.writeNoException()
                return r2
            L_0x050c:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                java.lang.String[] r0 = r13.createStringArray()
                android.os.IBinder r1 = r13.readStrongBinder()
                com.google.android.gms.internal.nh r1 = com.google.android.gms.internal.C1990nh.C1991a.m5840aN(r1)
                java.lang.String r3 = r13.readString()
                r11.mo16309a((java.lang.String[]) r0, (com.google.android.gms.internal.C1990nh) r1, (java.lang.String) r3)
                r14.writeNoException()
                return r2
            L_0x0528:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x053c
                android.os.Parcelable$Creator r0 = android.app.PendingIntent.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r13)
                r3 = r0
                android.app.PendingIntent r3 = (android.app.PendingIntent) r3
            L_0x053c:
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.nh r0 = com.google.android.gms.internal.C1990nh.C1991a.m5840aN(r0)
                java.lang.String r1 = r13.readString()
                r11.mo16285a((android.app.PendingIntent) r3, (com.google.android.gms.internal.C1990nh) r0, (java.lang.String) r1)
                r14.writeNoException()
                return r2
            L_0x054f:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                com.google.android.gms.internal.no r0 = com.google.android.gms.internal.C2005nn.CREATOR
                java.util.ArrayList r0 = r13.createTypedArrayList(r0)
                int r1 = r13.readInt()
                if (r1 == 0) goto L_0x0569
                android.os.Parcelable$Creator r1 = android.app.PendingIntent.CREATOR
                java.lang.Object r1 = r1.createFromParcel(r13)
                r3 = r1
                android.app.PendingIntent r3 = (android.app.PendingIntent) r3
            L_0x0569:
                android.os.IBinder r1 = r13.readStrongBinder()
                com.google.android.gms.internal.nh r1 = com.google.android.gms.internal.C1990nh.C1991a.m5840aN(r1)
                java.lang.String r4 = r13.readString()
                r11.mo16307a((java.util.List<com.google.android.gms.internal.C2005nn>) r0, (android.app.PendingIntent) r3, (com.google.android.gms.internal.C1990nh) r1, (java.lang.String) r4)
                r14.writeNoException()
                return r2
            L_0x057c:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r14.writeString(r0)
                return r2
            L_0x0582:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                java.lang.String r0 = r13.readString()
                int r1 = r13.readInt()
                if (r1 == 0) goto L_0x0597
                com.google.android.gms.internal.oi r1 = com.google.android.gms.internal.C2029oh.CREATOR
                com.google.android.gms.internal.oh r3 = r1.createFromParcel(r13)
            L_0x0597:
                android.os.IBinder r1 = r13.readStrongBinder()
                com.google.android.gms.internal.og r1 = com.google.android.gms.internal.C2026og.C2027a.m6011aP(r1)
                r11.mo16313b(r0, r3, r1)
                r14.writeNoException()
                return r2
            L_0x05a6:
                java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
                r13.enforceInterface(r0)
                java.lang.String r0 = r13.readString()
                com.google.android.gms.location.e r0 = r11.mo16315ca(r0)
                r14.writeNoException()
                if (r0 == 0) goto L_0x05bf
                r14.writeInt(r2)
                r0.writeToParcel(r14, r2)
                return r2
            L_0x05bf:
                r14.writeInt(r1)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1993ni.C1994a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: S */
    void mo16282S(boolean z) throws RemoteException;

    /* renamed from: a */
    void mo16283a(long j, boolean z, PendingIntent pendingIntent) throws RemoteException;

    /* renamed from: a */
    void mo16284a(PendingIntent pendingIntent) throws RemoteException;

    /* renamed from: a */
    void mo16285a(PendingIntent pendingIntent, C1990nh nhVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo16286a(Location location, int i) throws RemoteException;

    /* renamed from: a */
    void mo16287a(C1990nh nhVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo16288a(C2003nl nlVar, PendingIntent pendingIntent) throws RemoteException;

    /* renamed from: a */
    void mo16289a(C2003nl nlVar, C2203b bVar) throws RemoteException;

    /* renamed from: a */
    void mo16290a(C2010ns nsVar, C2029oh ohVar, PendingIntent pendingIntent) throws RemoteException;

    /* renamed from: a */
    void mo16291a(C2012nu nuVar, C2029oh ohVar, C2026og ogVar) throws RemoteException;

    /* renamed from: a */
    void mo16292a(C2014nw nwVar, C2029oh ohVar) throws RemoteException;

    /* renamed from: a */
    void mo16293a(C2016ny nyVar, C2029oh ohVar, PendingIntent pendingIntent) throws RemoteException;

    /* renamed from: a */
    void mo16294a(C2022oc ocVar, C2029oh ohVar, C2026og ogVar) throws RemoteException;

    /* renamed from: a */
    void mo16295a(C2024oe oeVar, LatLngBounds latLngBounds, List<String> list, C2029oh ohVar, C2026og ogVar) throws RemoteException;

    /* renamed from: a */
    void mo16296a(C2029oh ohVar, PendingIntent pendingIntent) throws RemoteException;

    /* renamed from: a */
    void mo16297a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, C1990nh nhVar) throws RemoteException;

    /* renamed from: a */
    void mo16298a(LocationRequest locationRequest, PendingIntent pendingIntent) throws RemoteException;

    /* renamed from: a */
    void mo16299a(LocationRequest locationRequest, C2203b bVar) throws RemoteException;

    /* renamed from: a */
    void mo16300a(LocationRequest locationRequest, C2203b bVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo16301a(C2203b bVar) throws RemoteException;

    /* renamed from: a */
    void mo16302a(LatLng latLng, C2012nu nuVar, C2029oh ohVar, C2026og ogVar) throws RemoteException;

    /* renamed from: a */
    void mo16303a(LatLngBounds latLngBounds, int i, C2012nu nuVar, C2029oh ohVar, C2026og ogVar) throws RemoteException;

    /* renamed from: a */
    void mo16304a(LatLngBounds latLngBounds, int i, String str, C2012nu nuVar, C2029oh ohVar, C2026og ogVar) throws RemoteException;

    /* renamed from: a */
    void mo16305a(String str, C2029oh ohVar, C2026og ogVar) throws RemoteException;

    /* renamed from: a */
    void mo16306a(String str, LatLngBounds latLngBounds, C2008nq nqVar, C2029oh ohVar, C2026og ogVar) throws RemoteException;

    /* renamed from: a */
    void mo16307a(List<C2005nn> list, PendingIntent pendingIntent, C1990nh nhVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo16308a(List<String> list, C2029oh ohVar, C2026og ogVar) throws RemoteException;

    /* renamed from: a */
    void mo16309a(String[] strArr, C1990nh nhVar, String str) throws RemoteException;

    /* renamed from: b */
    void mo16310b(PendingIntent pendingIntent) throws RemoteException;

    /* renamed from: b */
    void mo16311b(Location location) throws RemoteException;

    /* renamed from: b */
    void mo16312b(C2029oh ohVar, PendingIntent pendingIntent) throws RemoteException;

    /* renamed from: b */
    void mo16313b(String str, C2029oh ohVar, C2026og ogVar) throws RemoteException;

    /* renamed from: bZ */
    Location mo16314bZ(String str) throws RemoteException;

    /* renamed from: ca */
    C2210e mo16315ca(String str) throws RemoteException;

    /* renamed from: ni */
    Location mo16316ni() throws RemoteException;

    /* renamed from: nj */
    IBinder mo16317nj() throws RemoteException;

    /* renamed from: nk */
    IBinder mo16318nk() throws RemoteException;
}

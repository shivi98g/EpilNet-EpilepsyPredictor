package com.google.android.gms.games.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.fitness.FitnessStatusCodes;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;

public interface IGamesCallbacks extends IInterface {

    public static abstract class Stub extends Binder implements IGamesCallbacks {

        private static class Proxy implements IGamesCallbacks {

            /* renamed from: le */
            private IBinder f1960le;

            Proxy(IBinder iBinder) {
                this.f1960le = iBinder;
            }

            /* renamed from: A */
            public void mo13313A(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(5025, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: B */
            public void mo13314B(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(5038, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: C */
            public void mo13315C(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(5035, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: D */
            public void mo13316D(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(5039, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: E */
            public void mo13317E(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(GamesStatusCodes.STATUS_MILESTONE_CLAIM_FAILED, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: F */
            public void mo13318F(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(GamesActivityResultCodes.RESULT_LICENSE_FAILED, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: G */
            public void mo13319G(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: H */
            public void mo13320H(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(GamesActivityResultCodes.RESULT_NETWORK_FAILURE, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: I */
            public void mo13321I(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(12001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: J */
            public void mo13322J(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(12005, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: K */
            public void mo13323K(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(12006, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: L */
            public void mo13324L(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(12007, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: M */
            public void mo13325M(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(12014, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: N */
            public void mo13326N(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(12016, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: O */
            public void mo13327O(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(12008, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: P */
            public void mo13328P(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(12013, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Q */
            public void mo13329Q(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(13001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13330a(int i, String str, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1960le.transact(5034, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13331a(DataHolder dataHolder, DataHolder dataHolder2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (dataHolder2 != null) {
                        obtain.writeInt(1);
                        dataHolder2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(FitnessStatusCodes.UNKNOWN_AUTH_ERROR, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13332a(DataHolder dataHolder, Contents contents) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (contents != null) {
                        obtain.writeInt(1);
                        contents.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(12004, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13333a(DataHolder dataHolder, String str, Contents contents, Contents contents2, Contents contents3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (contents != null) {
                        obtain.writeInt(1);
                        contents.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (contents2 != null) {
                        obtain.writeInt(1);
                        contents2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (contents3 != null) {
                        obtain.writeInt(1);
                        contents3.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(12017, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13334a(DataHolder dataHolder, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    this.f1960le.transact(5026, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13335a(DataHolder[] dataHolderArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeTypedArray(dataHolderArr, 0);
                    this.f1960le.transact(14001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1960le;
            }

            /* renamed from: b */
            public void mo13336b(int i, int i2, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.f1960le.transact(5033, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo13337b(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(GamesStatusCodes.STATUS_QUEST_NO_LONGER_AVAILABLE, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo13338b(DataHolder dataHolder, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    this.f1960le.transact(5027, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo13339c(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(GamesActivityResultCodes.RESULT_LEFT_ROOM, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo13340c(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(FitnessStatusCodes.INCONSISTENT_DATA_TYPE, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo13341c(DataHolder dataHolder, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    this.f1960le.transact(5028, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo13342d(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(11001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo13343d(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(12011, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo13344d(DataHolder dataHolder, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    this.f1960le.transact(5029, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: dO */
            public void mo13345dO(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    this.f1960le.transact(5036, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: dP */
            public void mo13346dP(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    this.f1960le.transact(5040, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: dQ */
            public void mo13347dQ(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    this.f1960le.transact(13002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo13348e(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(12003, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo13349e(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(FitnessStatusCodes.APP_MISMATCH, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo13350e(DataHolder dataHolder, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    this.f1960le.transact(5030, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public void mo13351f(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(12015, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public void mo13352f(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f1960le.transact(FitnessStatusCodes.CONFLICTING_DATA_TYPE, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public void mo13353f(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(FitnessStatusCodes.MISSING_BLE_PERMISSION, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public void mo13354f(DataHolder dataHolder, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    this.f1960le.transact(5031, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: fK */
            public void mo13355fK() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.f1960le.transact(5016, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public void mo13356g(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f1960le.transact(FitnessStatusCodes.DATA_TYPE_NOT_FOUND, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public void mo13357g(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(FitnessStatusCodes.UNSUPPORTED_PLATFORM, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public void mo13358h(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f1960le.transact(8007, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public void mo13359h(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(FitnessStatusCodes.TRANSIENT_ERROR, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public void mo13360i(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f1960le.transact(12012, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public void mo13361i(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(FitnessStatusCodes.EQUIVALENT_SESSION_ENDED, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public void mo13362j(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(FitnessStatusCodes.APP_NOT_FIT_ENABLED, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public void mo13363k(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(FitnessStatusCodes.API_EXCEPTION, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: l */
            public void mo13364l(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(9001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: m */
            public void mo13365m(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(5017, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: n */
            public void mo13366n(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(5037, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: o */
            public void mo13367o(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(GamesActivityResultCodes.RESULT_RECONNECT_REQUIRED, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onInvitationRemoved(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeString(str);
                    this.f1960le.transact(8010, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onLeftRoom(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f1960le.transact(5020, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onP2PConnected(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeString(str);
                    this.f1960le.transact(GamesStatusCodes.STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onP2PDisconnected(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeString(str);
                    this.f1960le.transact(GamesStatusCodes.STATUS_MULTIPLAYER_ERROR_INVALID_MULTIPLAYER_TYPE, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onRealTimeMessageReceived(RealTimeMessage realTimeMessage) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (realTimeMessage != null) {
                        obtain.writeInt(1);
                        realTimeMessage.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(5032, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onRequestRemoved(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeString(str);
                    this.f1960le.transact(GamesActivityResultCodes.RESULT_SIGN_IN_FAILED, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onTurnBasedMatchRemoved(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeString(str);
                    this.f1960le.transact(8009, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: p */
            public void mo13375p(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(GamesStatusCodes.STATUS_QUEST_NOT_STARTED, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: q */
            public void mo13376q(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(8004, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: r */
            public void mo13377r(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(8005, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: s */
            public void mo13378s(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(8006, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: t */
            public void mo13379t(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(8008, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: u */
            public void mo13380u(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(5018, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: v */
            public void mo13381v(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(5019, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: w */
            public void mo13382w(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(5021, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: x */
            public void mo13383x(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(5022, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: y */
            public void mo13384y(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(5023, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: z */
            public void mo13385z(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1960le.transact(5024, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.google.android.gms.games.internal.IGamesCallbacks");
        }

        /* renamed from: aD */
        public static IGamesCallbacks m2637aD(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IGamesCallbacks)) ? new Proxy(iBinder) : (IGamesCallbacks) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v47, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v50, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v65, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v68, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v71, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v74, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v77, resolved type: com.google.android.gms.games.multiplayer.realtime.RealTimeMessage} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v85, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v90, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v93, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v96, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v105, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v108, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v112, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v115, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v118, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v121, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v126, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v133, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v138, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v141, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v144, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v148, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v151, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v155, resolved type: com.google.android.gms.drive.Contents} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v159, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v162, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v165, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v168, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v171, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v176, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v179, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v182, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v186, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v193, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v198, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v201, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v205, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX WARNING: type inference failed for: r0v0 */
        /* JADX WARNING: type inference failed for: r0v189 */
        /* JADX WARNING: type inference failed for: r0v214 */
        /* JADX WARNING: type inference failed for: r0v215 */
        /* JADX WARNING: type inference failed for: r0v216 */
        /* JADX WARNING: type inference failed for: r0v217 */
        /* JADX WARNING: type inference failed for: r0v218 */
        /* JADX WARNING: type inference failed for: r0v219 */
        /* JADX WARNING: type inference failed for: r0v220 */
        /* JADX WARNING: type inference failed for: r0v221 */
        /* JADX WARNING: type inference failed for: r0v222 */
        /* JADX WARNING: type inference failed for: r0v223 */
        /* JADX WARNING: type inference failed for: r0v224 */
        /* JADX WARNING: type inference failed for: r0v225 */
        /* JADX WARNING: type inference failed for: r0v226 */
        /* JADX WARNING: type inference failed for: r0v227 */
        /* JADX WARNING: type inference failed for: r0v228 */
        /* JADX WARNING: type inference failed for: r0v229 */
        /* JADX WARNING: type inference failed for: r0v230 */
        /* JADX WARNING: type inference failed for: r0v231 */
        /* JADX WARNING: type inference failed for: r0v232 */
        /* JADX WARNING: type inference failed for: r0v233 */
        /* JADX WARNING: type inference failed for: r0v234 */
        /* JADX WARNING: type inference failed for: r0v235 */
        /* JADX WARNING: type inference failed for: r0v236 */
        /* JADX WARNING: type inference failed for: r0v237 */
        /* JADX WARNING: type inference failed for: r0v238 */
        /* JADX WARNING: type inference failed for: r0v239 */
        /* JADX WARNING: type inference failed for: r0v240 */
        /* JADX WARNING: type inference failed for: r0v241 */
        /* JADX WARNING: type inference failed for: r0v242 */
        /* JADX WARNING: type inference failed for: r0v243 */
        /* JADX WARNING: type inference failed for: r0v244 */
        /* JADX WARNING: type inference failed for: r0v245 */
        /* JADX WARNING: type inference failed for: r0v246 */
        /* JADX WARNING: type inference failed for: r0v247 */
        /* JADX WARNING: type inference failed for: r0v248 */
        /* JADX WARNING: type inference failed for: r0v249 */
        /* JADX WARNING: type inference failed for: r0v250 */
        /* JADX WARNING: type inference failed for: r0v251 */
        /* JADX WARNING: type inference failed for: r0v252 */
        /* JADX WARNING: type inference failed for: r0v253 */
        /* JADX WARNING: type inference failed for: r0v254 */
        /* JADX WARNING: type inference failed for: r0v255 */
        /* JADX WARNING: type inference failed for: r0v256 */
        /* JADX WARNING: type inference failed for: r0v257 */
        /* JADX WARNING: type inference failed for: r0v258 */
        /* JADX WARNING: type inference failed for: r0v259 */
        /* JADX WARNING: type inference failed for: r0v260 */
        /* JADX WARNING: type inference failed for: r0v261 */
        /* JADX WARNING: type inference failed for: r0v262 */
        /* JADX WARNING: type inference failed for: r0v263 */
        /* JADX WARNING: type inference failed for: r0v264 */
        /* JADX WARNING: type inference failed for: r0v265 */
        /* JADX WARNING: type inference failed for: r0v266 */
        /* JADX WARNING: type inference failed for: r0v267 */
        /* JADX WARNING: type inference failed for: r0v268 */
        /* JADX WARNING: type inference failed for: r0v269 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) throws android.os.RemoteException {
            /*
                r9 = this;
                r0 = 0
                r1 = 1
                switch(r10) {
                    case 5001: goto L_0x071c;
                    case 5002: goto L_0x0704;
                    case 5003: goto L_0x06f0;
                    case 5004: goto L_0x06d8;
                    case 5005: goto L_0x06b2;
                    case 5006: goto L_0x069a;
                    case 5007: goto L_0x0682;
                    case 5008: goto L_0x066a;
                    case 5009: goto L_0x0652;
                    case 5010: goto L_0x063a;
                    case 5011: goto L_0x0622;
                    default: goto L_0x0005;
                }
            L_0x0005:
                switch(r10) {
                    case 5016: goto L_0x0616;
                    case 5017: goto L_0x05fe;
                    case 5018: goto L_0x05e6;
                    case 5019: goto L_0x05ce;
                    case 5020: goto L_0x05ba;
                    case 5021: goto L_0x05a2;
                    case 5022: goto L_0x058a;
                    case 5023: goto L_0x0572;
                    case 5024: goto L_0x055a;
                    case 5025: goto L_0x0542;
                    case 5026: goto L_0x0526;
                    case 5027: goto L_0x050a;
                    case 5028: goto L_0x04ee;
                    case 5029: goto L_0x04d2;
                    case 5030: goto L_0x04b6;
                    case 5031: goto L_0x049a;
                    case 5032: goto L_0x0480;
                    case 5033: goto L_0x0468;
                    case 5034: goto L_0x044b;
                    case 5035: goto L_0x0433;
                    case 5036: goto L_0x0423;
                    case 5037: goto L_0x040b;
                    case 5038: goto L_0x03f3;
                    case 5039: goto L_0x03db;
                    case 5040: goto L_0x03cb;
                    default: goto L_0x0008;
                }
            L_0x0008:
                switch(r10) {
                    case 6001: goto L_0x03bb;
                    case 6002: goto L_0x03ab;
                    default: goto L_0x000b;
                }
            L_0x000b:
                switch(r10) {
                    case 8001: goto L_0x0393;
                    case 8002: goto L_0x0375;
                    case 8003: goto L_0x035d;
                    case 8004: goto L_0x0345;
                    case 8005: goto L_0x032d;
                    case 8006: goto L_0x0315;
                    case 8007: goto L_0x0301;
                    case 8008: goto L_0x02e9;
                    case 8009: goto L_0x02d9;
                    case 8010: goto L_0x02c9;
                    default: goto L_0x000e;
                }
            L_0x000e:
                switch(r10) {
                    case 10001: goto L_0x02b1;
                    case 10002: goto L_0x02a1;
                    case 10003: goto L_0x0289;
                    case 10004: goto L_0x0271;
                    case 10005: goto L_0x0253;
                    case 10006: goto L_0x023b;
                    default: goto L_0x0011;
                }
            L_0x0011:
                switch(r10) {
                    case 12003: goto L_0x021d;
                    case 12004: goto L_0x01f5;
                    case 12005: goto L_0x01dd;
                    case 12006: goto L_0x01c5;
                    case 12007: goto L_0x01ad;
                    case 12008: goto L_0x0195;
                    default: goto L_0x0014;
                }
            L_0x0014:
                switch(r10) {
                    case 12011: goto L_0x017d;
                    case 12012: goto L_0x0169;
                    case 12013: goto L_0x0151;
                    case 12014: goto L_0x0139;
                    case 12015: goto L_0x011b;
                    case 12016: goto L_0x0103;
                    case 12017: goto L_0x00b2;
                    default: goto L_0x0017;
                }
            L_0x0017:
                switch(r10) {
                    case 13001: goto L_0x009a;
                    case 13002: goto L_0x008a;
                    default: goto L_0x001a;
                }
            L_0x001a:
                switch(r10) {
                    case 9001: goto L_0x0072;
                    case 11001: goto L_0x0054;
                    case 12001: goto L_0x003c;
                    case 14001: goto L_0x0028;
                    case 1598968902: goto L_0x0022;
                    default: goto L_0x001d;
                }
            L_0x001d:
                boolean r0 = super.onTransact(r10, r11, r12, r13)
                return r0
            L_0x0022:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r12.writeString(r0)
                return r1
            L_0x0028:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r0)
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                java.lang.Object[] r0 = r11.createTypedArray(r0)
                com.google.android.gms.common.data.DataHolder[] r0 = (com.google.android.gms.common.data.DataHolder[]) r0
                r9.mo13335a(r0)
                r12.writeNoException()
                return r1
            L_0x003c:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x004d
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x004d:
                r9.mo13321I(r0)
                r12.writeNoException()
                return r1
            L_0x0054:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                int r3 = r11.readInt()
                if (r3 == 0) goto L_0x006b
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r11)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x006b:
                r9.mo13342d((int) r2, (android.os.Bundle) r0)
                r12.writeNoException()
                return r1
            L_0x0072:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x0083
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x0083:
                r9.mo13364l(r0)
                r12.writeNoException()
                return r1
            L_0x008a:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r0)
                int r0 = r11.readInt()
                r9.mo13347dQ(r0)
                r12.writeNoException()
                return r1
            L_0x009a:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x00ab
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x00ab:
                r9.mo13329Q(r0)
                r12.writeNoException()
                return r1
            L_0x00b2:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x00c5
                com.google.android.gms.common.data.f r2 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r2 = r2.createFromParcel(r11)
                r4 = r2
                goto L_0x00c6
            L_0x00c5:
                r4 = r0
            L_0x00c6:
                java.lang.String r5 = r11.readString()
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x00da
                android.os.Parcelable$Creator<com.google.android.gms.drive.Contents> r2 = com.google.android.gms.drive.Contents.CREATOR
                java.lang.Object r2 = r2.createFromParcel(r11)
                com.google.android.gms.drive.Contents r2 = (com.google.android.gms.drive.Contents) r2
                r6 = r2
                goto L_0x00db
            L_0x00da:
                r6 = r0
            L_0x00db:
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x00eb
                android.os.Parcelable$Creator<com.google.android.gms.drive.Contents> r2 = com.google.android.gms.drive.Contents.CREATOR
                java.lang.Object r2 = r2.createFromParcel(r11)
                com.google.android.gms.drive.Contents r2 = (com.google.android.gms.drive.Contents) r2
                r7 = r2
                goto L_0x00ec
            L_0x00eb:
                r7 = r0
            L_0x00ec:
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x00fa
                android.os.Parcelable$Creator<com.google.android.gms.drive.Contents> r0 = com.google.android.gms.drive.Contents.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r11)
                com.google.android.gms.drive.Contents r0 = (com.google.android.gms.drive.Contents) r0
            L_0x00fa:
                r8 = r0
                r3 = r9
                r3.mo13333a(r4, r5, r6, r7, r8)
                r12.writeNoException()
                return r1
            L_0x0103:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x0114
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x0114:
                r9.mo13326N(r0)
                r12.writeNoException()
                return r1
            L_0x011b:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                int r3 = r11.readInt()
                if (r3 == 0) goto L_0x0132
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r11)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0132:
                r9.mo13351f((int) r2, (android.os.Bundle) r0)
                r12.writeNoException()
                return r1
            L_0x0139:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x014a
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x014a:
                r9.mo13325M(r0)
                r12.writeNoException()
                return r1
            L_0x0151:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x0162
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x0162:
                r9.mo13328P(r0)
                r12.writeNoException()
                return r1
            L_0x0169:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r0)
                int r0 = r11.readInt()
                java.lang.String r2 = r11.readString()
                r9.mo13360i(r0, r2)
                r12.writeNoException()
                return r1
            L_0x017d:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x018e
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x018e:
                r9.mo13343d(r0)
                r12.writeNoException()
                return r1
            L_0x0195:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x01a6
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x01a6:
                r9.mo13327O(r0)
                r12.writeNoException()
                return r1
            L_0x01ad:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x01be
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x01be:
                r9.mo13324L(r0)
                r12.writeNoException()
                return r1
            L_0x01c5:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x01d6
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x01d6:
                r9.mo13323K(r0)
                r12.writeNoException()
                return r1
            L_0x01dd:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x01ee
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x01ee:
                r9.mo13322J(r0)
                r12.writeNoException()
                return r1
            L_0x01f5:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x0207
                com.google.android.gms.common.data.f r2 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r2 = r2.createFromParcel(r11)
                goto L_0x0208
            L_0x0207:
                r2 = r0
            L_0x0208:
                int r3 = r11.readInt()
                if (r3 == 0) goto L_0x0216
                android.os.Parcelable$Creator<com.google.android.gms.drive.Contents> r0 = com.google.android.gms.drive.Contents.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r11)
                com.google.android.gms.drive.Contents r0 = (com.google.android.gms.drive.Contents) r0
            L_0x0216:
                r9.mo13332a((com.google.android.gms.common.data.DataHolder) r2, (com.google.android.gms.drive.Contents) r0)
                r12.writeNoException()
                return r1
            L_0x021d:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                int r3 = r11.readInt()
                if (r3 == 0) goto L_0x0234
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r11)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0234:
                r9.mo13348e((int) r2, (android.os.Bundle) r0)
                r12.writeNoException()
                return r1
            L_0x023b:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x024c
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x024c:
                r9.mo13320H(r0)
                r12.writeNoException()
                return r1
            L_0x0253:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                int r3 = r11.readInt()
                if (r3 == 0) goto L_0x026a
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r11)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x026a:
                r9.mo13339c((int) r2, (android.os.Bundle) r0)
                r12.writeNoException()
                return r1
            L_0x0271:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x0282
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x0282:
                r9.mo13319G(r0)
                r12.writeNoException()
                return r1
            L_0x0289:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x029a
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x029a:
                r9.mo13318F(r0)
                r12.writeNoException()
                return r1
            L_0x02a1:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r0)
                java.lang.String r0 = r11.readString()
                r9.onRequestRemoved(r0)
                r12.writeNoException()
                return r1
            L_0x02b1:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x02c2
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x02c2:
                r9.mo13367o(r0)
                r12.writeNoException()
                return r1
            L_0x02c9:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r0)
                java.lang.String r0 = r11.readString()
                r9.onInvitationRemoved(r0)
                r12.writeNoException()
                return r1
            L_0x02d9:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r0)
                java.lang.String r0 = r11.readString()
                r9.onTurnBasedMatchRemoved(r0)
                r12.writeNoException()
                return r1
            L_0x02e9:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x02fa
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x02fa:
                r9.mo13379t(r0)
                r12.writeNoException()
                return r1
            L_0x0301:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r0)
                int r0 = r11.readInt()
                java.lang.String r2 = r11.readString()
                r9.mo13358h(r0, r2)
                r12.writeNoException()
                return r1
            L_0x0315:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x0326
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x0326:
                r9.mo13378s(r0)
                r12.writeNoException()
                return r1
            L_0x032d:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x033e
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x033e:
                r9.mo13377r(r0)
                r12.writeNoException()
                return r1
            L_0x0345:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x0356
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x0356:
                r9.mo13376q(r0)
                r12.writeNoException()
                return r1
            L_0x035d:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x036e
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x036e:
                r9.mo13375p(r0)
                r12.writeNoException()
                return r1
            L_0x0375:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                int r3 = r11.readInt()
                if (r3 == 0) goto L_0x038c
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r11)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x038c:
                r9.mo13337b((int) r2, (android.os.Bundle) r0)
                r12.writeNoException()
                return r1
            L_0x0393:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x03a4
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x03a4:
                r9.mo13317E(r0)
                r12.writeNoException()
                return r1
            L_0x03ab:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r0)
                java.lang.String r0 = r11.readString()
                r9.onP2PDisconnected(r0)
                r12.writeNoException()
                return r1
            L_0x03bb:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r0)
                java.lang.String r0 = r11.readString()
                r9.onP2PConnected(r0)
                r12.writeNoException()
                return r1
            L_0x03cb:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r0)
                int r0 = r11.readInt()
                r9.mo13346dP(r0)
                r12.writeNoException()
                return r1
            L_0x03db:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x03ec
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x03ec:
                r9.mo13316D(r0)
                r12.writeNoException()
                return r1
            L_0x03f3:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x0404
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x0404:
                r9.mo13314B(r0)
                r12.writeNoException()
                return r1
            L_0x040b:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x041c
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x041c:
                r9.mo13366n(r0)
                r12.writeNoException()
                return r1
            L_0x0423:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r0)
                int r0 = r11.readInt()
                r9.mo13345dO(r0)
                r12.writeNoException()
                return r1
            L_0x0433:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x0444
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x0444:
                r9.mo13315C(r0)
                r12.writeNoException()
                return r1
            L_0x044b:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r0)
                int r0 = r11.readInt()
                java.lang.String r2 = r11.readString()
                int r3 = r11.readInt()
                if (r3 == 0) goto L_0x0460
                r3 = r1
                goto L_0x0461
            L_0x0460:
                r3 = 0
            L_0x0461:
                r9.mo13330a(r0, r2, r3)
                r12.writeNoException()
                return r1
            L_0x0468:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r0)
                int r0 = r11.readInt()
                int r2 = r11.readInt()
                java.lang.String r3 = r11.readString()
                r9.mo13336b(r0, r2, r3)
                r12.writeNoException()
                return r1
            L_0x0480:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x0493
                android.os.Parcelable$Creator<com.google.android.gms.games.multiplayer.realtime.RealTimeMessage> r0 = com.google.android.gms.games.multiplayer.realtime.RealTimeMessage.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r11)
                com.google.android.gms.games.multiplayer.realtime.RealTimeMessage r0 = (com.google.android.gms.games.multiplayer.realtime.RealTimeMessage) r0
            L_0x0493:
                r9.onRealTimeMessageReceived(r0)
                r12.writeNoException()
                return r1
            L_0x049a:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x04ab
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x04ab:
                java.lang.String[] r2 = r11.createStringArray()
                r9.mo13354f((com.google.android.gms.common.data.DataHolder) r0, (java.lang.String[]) r2)
                r12.writeNoException()
                return r1
            L_0x04b6:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x04c7
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x04c7:
                java.lang.String[] r2 = r11.createStringArray()
                r9.mo13350e((com.google.android.gms.common.data.DataHolder) r0, (java.lang.String[]) r2)
                r12.writeNoException()
                return r1
            L_0x04d2:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x04e3
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x04e3:
                java.lang.String[] r2 = r11.createStringArray()
                r9.mo13344d((com.google.android.gms.common.data.DataHolder) r0, (java.lang.String[]) r2)
                r12.writeNoException()
                return r1
            L_0x04ee:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x04ff
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x04ff:
                java.lang.String[] r2 = r11.createStringArray()
                r9.mo13341c((com.google.android.gms.common.data.DataHolder) r0, (java.lang.String[]) r2)
                r12.writeNoException()
                return r1
            L_0x050a:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x051b
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x051b:
                java.lang.String[] r2 = r11.createStringArray()
                r9.mo13338b((com.google.android.gms.common.data.DataHolder) r0, (java.lang.String[]) r2)
                r12.writeNoException()
                return r1
            L_0x0526:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x0537
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x0537:
                java.lang.String[] r2 = r11.createStringArray()
                r9.mo13334a((com.google.android.gms.common.data.DataHolder) r0, (java.lang.String[]) r2)
                r12.writeNoException()
                return r1
            L_0x0542:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x0553
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x0553:
                r9.mo13313A(r0)
                r12.writeNoException()
                return r1
            L_0x055a:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x056b
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x056b:
                r9.mo13385z(r0)
                r12.writeNoException()
                return r1
            L_0x0572:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x0583
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x0583:
                r9.mo13384y(r0)
                r12.writeNoException()
                return r1
            L_0x058a:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x059b
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x059b:
                r9.mo13383x(r0)
                r12.writeNoException()
                return r1
            L_0x05a2:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x05b3
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x05b3:
                r9.mo13382w(r0)
                r12.writeNoException()
                return r1
            L_0x05ba:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r0)
                int r0 = r11.readInt()
                java.lang.String r2 = r11.readString()
                r9.onLeftRoom(r0, r2)
                r12.writeNoException()
                return r1
            L_0x05ce:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x05df
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x05df:
                r9.mo13381v(r0)
                r12.writeNoException()
                return r1
            L_0x05e6:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x05f7
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x05f7:
                r9.mo13380u(r0)
                r12.writeNoException()
                return r1
            L_0x05fe:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x060f
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x060f:
                r9.mo13365m(r0)
                r12.writeNoException()
                return r1
            L_0x0616:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r0)
                r9.mo13355fK()
                r12.writeNoException()
                return r1
            L_0x0622:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x0633
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x0633:
                r9.mo13363k(r0)
                r12.writeNoException()
                return r1
            L_0x063a:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x064b
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x064b:
                r9.mo13362j(r0)
                r12.writeNoException()
                return r1
            L_0x0652:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x0663
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x0663:
                r9.mo13361i(r0)
                r12.writeNoException()
                return r1
            L_0x066a:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x067b
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x067b:
                r9.mo13359h(r0)
                r12.writeNoException()
                return r1
            L_0x0682:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x0693
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x0693:
                r9.mo13357g(r0)
                r12.writeNoException()
                return r1
            L_0x069a:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x06ab
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x06ab:
                r9.mo13353f(r0)
                r12.writeNoException()
                return r1
            L_0x06b2:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x06c4
                com.google.android.gms.common.data.f r2 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r2 = r2.createFromParcel(r11)
                goto L_0x06c5
            L_0x06c4:
                r2 = r0
            L_0x06c5:
                int r3 = r11.readInt()
                if (r3 == 0) goto L_0x06d1
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x06d1:
                r9.mo13331a((com.google.android.gms.common.data.DataHolder) r2, (com.google.android.gms.common.data.DataHolder) r0)
                r12.writeNoException()
                return r1
            L_0x06d8:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x06e9
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x06e9:
                r9.mo13349e(r0)
                r12.writeNoException()
                return r1
            L_0x06f0:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r0)
                int r0 = r11.readInt()
                java.lang.String r2 = r11.readString()
                r9.mo13356g(r0, r2)
                r12.writeNoException()
                return r1
            L_0x0704:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r2)
                int r2 = r11.readInt()
                if (r2 == 0) goto L_0x0715
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r11)
            L_0x0715:
                r9.mo13340c(r0)
                r12.writeNoException()
                return r1
            L_0x071c:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r11.enforceInterface(r0)
                int r0 = r11.readInt()
                java.lang.String r2 = r11.readString()
                r9.mo13352f((int) r0, (java.lang.String) r2)
                r12.writeNoException()
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.games.internal.IGamesCallbacks.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: A */
    void mo13313A(DataHolder dataHolder) throws RemoteException;

    /* renamed from: B */
    void mo13314B(DataHolder dataHolder) throws RemoteException;

    /* renamed from: C */
    void mo13315C(DataHolder dataHolder) throws RemoteException;

    /* renamed from: D */
    void mo13316D(DataHolder dataHolder) throws RemoteException;

    /* renamed from: E */
    void mo13317E(DataHolder dataHolder) throws RemoteException;

    /* renamed from: F */
    void mo13318F(DataHolder dataHolder) throws RemoteException;

    /* renamed from: G */
    void mo13319G(DataHolder dataHolder) throws RemoteException;

    /* renamed from: H */
    void mo13320H(DataHolder dataHolder) throws RemoteException;

    /* renamed from: I */
    void mo13321I(DataHolder dataHolder) throws RemoteException;

    /* renamed from: J */
    void mo13322J(DataHolder dataHolder) throws RemoteException;

    /* renamed from: K */
    void mo13323K(DataHolder dataHolder) throws RemoteException;

    /* renamed from: L */
    void mo13324L(DataHolder dataHolder) throws RemoteException;

    /* renamed from: M */
    void mo13325M(DataHolder dataHolder) throws RemoteException;

    /* renamed from: N */
    void mo13326N(DataHolder dataHolder) throws RemoteException;

    /* renamed from: O */
    void mo13327O(DataHolder dataHolder) throws RemoteException;

    /* renamed from: P */
    void mo13328P(DataHolder dataHolder) throws RemoteException;

    /* renamed from: Q */
    void mo13329Q(DataHolder dataHolder) throws RemoteException;

    /* renamed from: a */
    void mo13330a(int i, String str, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo13331a(DataHolder dataHolder, DataHolder dataHolder2) throws RemoteException;

    /* renamed from: a */
    void mo13332a(DataHolder dataHolder, Contents contents) throws RemoteException;

    /* renamed from: a */
    void mo13333a(DataHolder dataHolder, String str, Contents contents, Contents contents2, Contents contents3) throws RemoteException;

    /* renamed from: a */
    void mo13334a(DataHolder dataHolder, String[] strArr) throws RemoteException;

    /* renamed from: a */
    void mo13335a(DataHolder[] dataHolderArr) throws RemoteException;

    /* renamed from: b */
    void mo13336b(int i, int i2, String str) throws RemoteException;

    /* renamed from: b */
    void mo13337b(int i, Bundle bundle) throws RemoteException;

    /* renamed from: b */
    void mo13338b(DataHolder dataHolder, String[] strArr) throws RemoteException;

    /* renamed from: c */
    void mo13339c(int i, Bundle bundle) throws RemoteException;

    /* renamed from: c */
    void mo13340c(DataHolder dataHolder) throws RemoteException;

    /* renamed from: c */
    void mo13341c(DataHolder dataHolder, String[] strArr) throws RemoteException;

    /* renamed from: d */
    void mo13342d(int i, Bundle bundle) throws RemoteException;

    /* renamed from: d */
    void mo13343d(DataHolder dataHolder) throws RemoteException;

    /* renamed from: d */
    void mo13344d(DataHolder dataHolder, String[] strArr) throws RemoteException;

    /* renamed from: dO */
    void mo13345dO(int i) throws RemoteException;

    /* renamed from: dP */
    void mo13346dP(int i) throws RemoteException;

    /* renamed from: dQ */
    void mo13347dQ(int i) throws RemoteException;

    /* renamed from: e */
    void mo13348e(int i, Bundle bundle) throws RemoteException;

    /* renamed from: e */
    void mo13349e(DataHolder dataHolder) throws RemoteException;

    /* renamed from: e */
    void mo13350e(DataHolder dataHolder, String[] strArr) throws RemoteException;

    /* renamed from: f */
    void mo13351f(int i, Bundle bundle) throws RemoteException;

    /* renamed from: f */
    void mo13352f(int i, String str) throws RemoteException;

    /* renamed from: f */
    void mo13353f(DataHolder dataHolder) throws RemoteException;

    /* renamed from: f */
    void mo13354f(DataHolder dataHolder, String[] strArr) throws RemoteException;

    /* renamed from: fK */
    void mo13355fK() throws RemoteException;

    /* renamed from: g */
    void mo13356g(int i, String str) throws RemoteException;

    /* renamed from: g */
    void mo13357g(DataHolder dataHolder) throws RemoteException;

    /* renamed from: h */
    void mo13358h(int i, String str) throws RemoteException;

    /* renamed from: h */
    void mo13359h(DataHolder dataHolder) throws RemoteException;

    /* renamed from: i */
    void mo13360i(int i, String str) throws RemoteException;

    /* renamed from: i */
    void mo13361i(DataHolder dataHolder) throws RemoteException;

    /* renamed from: j */
    void mo13362j(DataHolder dataHolder) throws RemoteException;

    /* renamed from: k */
    void mo13363k(DataHolder dataHolder) throws RemoteException;

    /* renamed from: l */
    void mo13364l(DataHolder dataHolder) throws RemoteException;

    /* renamed from: m */
    void mo13365m(DataHolder dataHolder) throws RemoteException;

    /* renamed from: n */
    void mo13366n(DataHolder dataHolder) throws RemoteException;

    /* renamed from: o */
    void mo13367o(DataHolder dataHolder) throws RemoteException;

    void onInvitationRemoved(String str) throws RemoteException;

    void onLeftRoom(int i, String str) throws RemoteException;

    void onP2PConnected(String str) throws RemoteException;

    void onP2PDisconnected(String str) throws RemoteException;

    void onRealTimeMessageReceived(RealTimeMessage realTimeMessage) throws RemoteException;

    void onRequestRemoved(String str) throws RemoteException;

    void onTurnBasedMatchRemoved(String str) throws RemoteException;

    /* renamed from: p */
    void mo13375p(DataHolder dataHolder) throws RemoteException;

    /* renamed from: q */
    void mo13376q(DataHolder dataHolder) throws RemoteException;

    /* renamed from: r */
    void mo13377r(DataHolder dataHolder) throws RemoteException;

    /* renamed from: s */
    void mo13378s(DataHolder dataHolder) throws RemoteException;

    /* renamed from: t */
    void mo13379t(DataHolder dataHolder) throws RemoteException;

    /* renamed from: u */
    void mo13380u(DataHolder dataHolder) throws RemoteException;

    /* renamed from: v */
    void mo13381v(DataHolder dataHolder) throws RemoteException;

    /* renamed from: w */
    void mo13382w(DataHolder dataHolder) throws RemoteException;

    /* renamed from: x */
    void mo13383x(DataHolder dataHolder) throws RemoteException;

    /* renamed from: y */
    void mo13384y(DataHolder dataHolder) throws RemoteException;

    /* renamed from: z */
    void mo13385z(DataHolder dataHolder) throws RemoteException;
}

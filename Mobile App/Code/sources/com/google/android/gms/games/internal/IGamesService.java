package com.google.android.gms.games.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.fitness.FitnessStatusCodes;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.achievement.AchievementEntity;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;
import com.google.android.gms.games.internal.request.GameRequestCluster;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;

public interface IGamesService extends IInterface {

    public static abstract class Stub extends Binder implements IGamesService {

        private static class Proxy implements IGamesService {

            /* renamed from: le */
            private IBinder f1961le;

            Proxy(IBinder iBinder) {
                this.f1961le = iBinder;
            }

            /* renamed from: O */
            public void mo13585O(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(5068, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: P */
            public void mo13586P(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(12026, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Q */
            public void mo13587Q(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(13001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public int mo13588a(IGamesCallbacks iGamesCallbacks, byte[] bArr, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeByteArray(bArr);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f1961le.transact(5033, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public Intent mo13589a(int i, int i2, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(9008, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public Intent mo13590a(int i, byte[] bArr, int i2, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.f1961le.transact(10012, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public Intent mo13591a(AchievementEntity achievementEntity) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if (achievementEntity != null) {
                        obtain.writeInt(1);
                        achievementEntity.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1961le.transact(13005, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public Intent mo13592a(ZInvitationCluster zInvitationCluster, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if (zInvitationCluster != null) {
                        obtain.writeInt(1);
                        zInvitationCluster.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f1961le.transact(10021, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public Intent mo13593a(GameRequestCluster gameRequestCluster, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if (gameRequestCluster != null) {
                        obtain.writeInt(1);
                        gameRequestCluster.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    this.f1961le.transact(10022, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public Intent mo13594a(RoomEntity roomEntity, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if (roomEntity != null) {
                        obtain.writeInt(1);
                        roomEntity.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f1961le.transact(9011, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public Intent mo13595a(String str, boolean z, boolean z2, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    obtain.writeInt(i);
                    this.f1961le.transact(12001, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public Intent mo13596a(ParticipantEntity[] participantEntityArr, String str, String str2, Uri uri, Uri uri2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeTypedArray(participantEntityArr, 0);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (uri2 != null) {
                        obtain.writeInt(1);
                        uri2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1961le.transact(9031, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public Intent mo13597a(ParticipantEntity[] participantEntityArr, String str, String str2, Uri uri, Uri uri2, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeTypedArray(participantEntityArr, 0);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (uri2 != null) {
                        obtain.writeInt(1);
                        uri2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str3);
                    this.f1961le.transact(14003, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13598a(long j, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    this.f1961le.transact(8019, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13599a(IBinder iBinder, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1961le.transact(FitnessStatusCodes.UNKNOWN_AUTH_ERROR, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13600a(Contents contents) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if (contents != null) {
                        obtain.writeInt(1);
                        contents.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1961le.transact(12019, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13601a(IGamesCallbacks iGamesCallbacks) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    this.f1961le.transact(FitnessStatusCodes.INCONSISTENT_DATA_TYPE, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13602a(IGamesCallbacks iGamesCallbacks, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeInt(i);
                    this.f1961le.transact(10016, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13603a(IGamesCallbacks iGamesCallbacks, int i, int i2, int i3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    this.f1961le.transact(10009, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13604a(IGamesCallbacks iGamesCallbacks, int i, int i2, boolean z, boolean z2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    this.f1961le.transact(5044, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13605a(IGamesCallbacks iGamesCallbacks, int i, int i2, String[] strArr, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeStringArray(strArr);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1961le.transact(8004, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13606a(IGamesCallbacks iGamesCallbacks, int i, String str, String[] strArr, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(14002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13607a(IGamesCallbacks iGamesCallbacks, int i, boolean z, boolean z2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    this.f1961le.transact(FitnessStatusCodes.INCONSISTENT_PACKAGE_NAME, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13608a(IGamesCallbacks iGamesCallbacks, int i, int[] iArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeIntArray(iArr);
                    this.f1961le.transact(10018, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13609a(IGamesCallbacks iGamesCallbacks, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeLong(j);
                    this.f1961le.transact(5058, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13610a(IGamesCallbacks iGamesCallbacks, long j, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    this.f1961le.transact(8018, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13611a(IGamesCallbacks iGamesCallbacks, Bundle bundle, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f1961le.transact(5021, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13612a(IGamesCallbacks iGamesCallbacks, IBinder iBinder, int i, String[] strArr, Bundle bundle, boolean z, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeLong(j);
                    this.f1961le.transact(5030, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13613a(IGamesCallbacks iGamesCallbacks, IBinder iBinder, String str, boolean z, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeLong(j);
                    this.f1961le.transact(5031, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13614a(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    this.f1961le.transact(FitnessStatusCodes.DISABLED_BLUETOOTH, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13615a(IGamesCallbacks iGamesCallbacks, String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f1961le.transact(10011, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13616a(IGamesCallbacks iGamesCallbacks, String str, int i, int i2, int i3, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(5019, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13617a(IGamesCallbacks iGamesCallbacks, String str, int i, IBinder iBinder, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1961le.transact(5025, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13618a(IGamesCallbacks iGamesCallbacks, String str, int i, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(8023, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13619a(IGamesCallbacks iGamesCallbacks, String str, int i, boolean z, boolean z2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    this.f1961le.transact(5045, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13620a(IGamesCallbacks iGamesCallbacks, String str, int i, boolean z, boolean z2, boolean z3, boolean z4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    obtain.writeInt(z3 ? 1 : 0);
                    obtain.writeInt(z4 ? 1 : 0);
                    this.f1961le.transact(GamesStatusCodes.STATUS_MATCH_ERROR_INACTIVE_MATCH, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13621a(IGamesCallbacks iGamesCallbacks, String str, int i, int[] iArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeIntArray(iArr);
                    this.f1961le.transact(10019, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13622a(IGamesCallbacks iGamesCallbacks, String str, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    this.f1961le.transact(5016, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13623a(IGamesCallbacks iGamesCallbacks, String str, long j, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    obtain.writeString(str2);
                    this.f1961le.transact(GamesStatusCodes.STATUS_INVALID_REAL_TIME_ROOM_ID, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13624a(IGamesCallbacks iGamesCallbacks, String str, IBinder iBinder, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1961le.transact(5023, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13625a(IGamesCallbacks iGamesCallbacks, String str, SnapshotMetadataChangeEntity snapshotMetadataChangeEntity, Contents contents) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    if (snapshotMetadataChangeEntity != null) {
                        obtain.writeInt(1);
                        snapshotMetadataChangeEntity.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (contents != null) {
                        obtain.writeInt(1);
                        contents.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1961le.transact(12007, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13626a(IGamesCallbacks iGamesCallbacks, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f1961le.transact(5038, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13627a(IGamesCallbacks iGamesCallbacks, String str, String str2, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f1961le.transact(GamesStatusCodes.STATUS_MILESTONE_CLAIM_FAILED, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13628a(IGamesCallbacks iGamesCallbacks, String str, String str2, int i, int i2, int i3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    this.f1961le.transact(10010, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13629a(IGamesCallbacks iGamesCallbacks, String str, String str2, int i, int i2, int i3, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(5039, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13630a(IGamesCallbacks iGamesCallbacks, String str, String str2, int i, boolean z, boolean z2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    this.f1961le.transact(9028, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13631a(IGamesCallbacks iGamesCallbacks, String str, String str2, SnapshotMetadataChangeEntity snapshotMetadataChangeEntity, Contents contents) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (snapshotMetadataChangeEntity != null) {
                        obtain.writeInt(1);
                        snapshotMetadataChangeEntity.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (contents != null) {
                        obtain.writeInt(1);
                        contents.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1961le.transact(12033, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13632a(IGamesCallbacks iGamesCallbacks, String str, String str2, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(GamesStatusCodes.STATUS_MULTIPLAYER_ERROR_INVALID_MULTIPLAYER_TYPE, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13633a(IGamesCallbacks iGamesCallbacks, String str, String str2, int[] iArr, int i, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeIntArray(iArr);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(12015, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13634a(IGamesCallbacks iGamesCallbacks, String str, String str2, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStringArray(strArr);
                    this.f1961le.transact(GamesActivityResultCodes.RESULT_INVALID_ROOM, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13635a(IGamesCallbacks iGamesCallbacks, String str, String str2, String[] strArr, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStringArray(strArr);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(12028, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13636a(IGamesCallbacks iGamesCallbacks, String str, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(5054, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13637a(IGamesCallbacks iGamesCallbacks, String str, byte[] bArr, String str2, ParticipantResult[] participantResultArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    obtain.writeString(str2);
                    obtain.writeTypedArray(participantResultArr, 0);
                    this.f1961le.transact(8007, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13638a(IGamesCallbacks iGamesCallbacks, String str, byte[] bArr, ParticipantResult[] participantResultArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    obtain.writeTypedArray(participantResultArr, 0);
                    this.f1961le.transact(8008, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13639a(IGamesCallbacks iGamesCallbacks, String str, int[] iArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeIntArray(iArr);
                    this.f1961le.transact(8017, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13640a(IGamesCallbacks iGamesCallbacks, String str, String[] strArr, int i, byte[] bArr, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i2);
                    this.f1961le.transact(GamesActivityResultCodes.RESULT_LEFT_ROOM, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13641a(IGamesCallbacks iGamesCallbacks, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(GamesStatusCodes.STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13642a(IGamesCallbacks iGamesCallbacks, boolean z, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeInt(z ? 1 : 0);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1961le.transact(5063, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13643a(IGamesCallbacks iGamesCallbacks, boolean z, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeStringArray(strArr);
                    this.f1961le.transact(12031, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13644a(IGamesCallbacks iGamesCallbacks, int[] iArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeIntArray(iArr);
                    this.f1961le.transact(GamesStatusCodes.STATUS_QUEST_NOT_STARTED, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13645a(IGamesCallbacks iGamesCallbacks, int[] iArr, int i, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeIntArray(iArr);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(12010, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13646a(IGamesCallbacks iGamesCallbacks, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeStringArray(strArr);
                    this.f1961le.transact(GamesActivityResultCodes.RESULT_NETWORK_FAILURE, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13647a(IGamesCallbacks iGamesCallbacks, String[] strArr, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeStringArray(strArr);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(12029, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13648a(String str, IBinder iBinder, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1961le.transact(13002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1961le;
            }

            /* renamed from: b */
            public int mo13649b(byte[] bArr, String str, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeByteArray(bArr);
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    this.f1961le.transact(5034, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public Intent mo13650b(int i, int i2, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(9009, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public Intent mo13651b(int[] iArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeIntArray(iArr);
                    this.f1961le.transact(12030, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo13652b(long j, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    this.f1961le.transact(8021, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo13653b(IGamesCallbacks iGamesCallbacks) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    this.f1961le.transact(5017, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo13654b(IGamesCallbacks iGamesCallbacks, int i, boolean z, boolean z2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    this.f1961le.transact(5046, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo13655b(IGamesCallbacks iGamesCallbacks, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeLong(j);
                    this.f1961le.transact(8012, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo13656b(IGamesCallbacks iGamesCallbacks, long j, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    this.f1961le.transact(8020, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo13657b(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    this.f1961le.transact(5018, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo13658b(IGamesCallbacks iGamesCallbacks, String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f1961le.transact(12023, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo13659b(IGamesCallbacks iGamesCallbacks, String str, int i, int i2, int i3, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(5020, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo13660b(IGamesCallbacks iGamesCallbacks, String str, int i, IBinder iBinder, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1961le.transact(GamesStatusCodes.STATUS_PARTICIPANT_NOT_CONNECTED, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo13661b(IGamesCallbacks iGamesCallbacks, String str, int i, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(10017, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo13662b(IGamesCallbacks iGamesCallbacks, String str, int i, boolean z, boolean z2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    this.f1961le.transact(5501, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo13663b(IGamesCallbacks iGamesCallbacks, String str, IBinder iBinder, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1961le.transact(5024, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo13664b(IGamesCallbacks iGamesCallbacks, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f1961le.transact(5041, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo13665b(IGamesCallbacks iGamesCallbacks, String str, String str2, int i, int i2, int i3, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(5040, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo13666b(IGamesCallbacks iGamesCallbacks, String str, String str2, int i, boolean z, boolean z2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    this.f1961le.transact(12018, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo13667b(IGamesCallbacks iGamesCallbacks, String str, String str2, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(GamesStatusCodes.STATUS_MATCH_NOT_FOUND, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo13668b(IGamesCallbacks iGamesCallbacks, String str, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(GamesStatusCodes.STATUS_MATCH_ERROR_INVALID_MATCH_STATE, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo13669b(IGamesCallbacks iGamesCallbacks, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(GamesStatusCodes.STATUS_MATCH_ERROR_OUT_OF_DATE_VERSION, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo13670b(IGamesCallbacks iGamesCallbacks, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeStringArray(strArr);
                    this.f1961le.transact(GamesActivityResultCodes.RESULT_SEND_REQUEST_FAILED, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo13671b(String str, String str2, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    this.f1961le.transact(5051, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: bE */
            public Intent mo13672bE(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    this.f1961le.transact(12034, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: bG */
            public String mo13673bG(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    this.f1961le.transact(5064, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: bH */
            public String mo13674bH(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    this.f1961le.transact(5035, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: bI */
            public void mo13675bI(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    this.f1961le.transact(5050, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: bJ */
            public int mo13676bJ(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    this.f1961le.transact(5060, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: bK */
            public Uri mo13677bK(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    this.f1961le.transact(5066, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: bL */
            public void mo13678bL(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    this.f1961le.transact(GamesStatusCodes.STATUS_QUEST_NO_LONGER_AVAILABLE, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: bM */
            public Intent mo13679bM(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    this.f1961le.transact(9004, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: bN */
            public ParcelFileDescriptor mo13680bN(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    this.f1961le.transact(9030, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo13681c(long j, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    this.f1961le.transact(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo13682c(IGamesCallbacks iGamesCallbacks) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    this.f1961le.transact(5022, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo13683c(IGamesCallbacks iGamesCallbacks, int i, boolean z, boolean z2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    this.f1961le.transact(5048, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo13684c(IGamesCallbacks iGamesCallbacks, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeLong(j);
                    this.f1961le.transact(GamesActivityResultCodes.RESULT_RECONNECT_REQUIRED, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo13685c(IGamesCallbacks iGamesCallbacks, long j, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    this.f1961le.transact(GamesActivityResultCodes.RESULT_LICENSE_FAILED, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo13686c(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    this.f1961le.transact(5032, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo13687c(IGamesCallbacks iGamesCallbacks, String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f1961le.transact(12024, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo13688c(IGamesCallbacks iGamesCallbacks, String str, int i, boolean z, boolean z2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    this.f1961le.transact(9001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo13689c(IGamesCallbacks iGamesCallbacks, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f1961le.transact(8011, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo13690c(IGamesCallbacks iGamesCallbacks, String str, String str2, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(12003, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo13691c(IGamesCallbacks iGamesCallbacks, String str, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(GamesStatusCodes.STATUS_MATCH_ERROR_INVALID_MATCH_RESULTS, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo13692c(IGamesCallbacks iGamesCallbacks, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(8027, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo13693c(IGamesCallbacks iGamesCallbacks, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeStringArray(strArr);
                    this.f1961le.transact(10020, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo13694c(String str, String str2, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    this.f1961le.transact(8026, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo13695d(long j, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    this.f1961le.transact(12014, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo13696d(IGamesCallbacks iGamesCallbacks) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    this.f1961le.transact(5026, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo13697d(IGamesCallbacks iGamesCallbacks, int i, boolean z, boolean z2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    this.f1961le.transact(GamesStatusCodes.STATUS_MULTIPLAYER_DISABLED, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo13698d(IGamesCallbacks iGamesCallbacks, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeLong(j);
                    this.f1961le.transact(12011, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo13699d(IGamesCallbacks iGamesCallbacks, long j, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    this.f1961le.transact(12013, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo13700d(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    this.f1961le.transact(5037, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo13701d(IGamesCallbacks iGamesCallbacks, String str, int i, boolean z, boolean z2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    this.f1961le.transact(9020, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo13702d(IGamesCallbacks iGamesCallbacks, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f1961le.transact(8015, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo13703d(IGamesCallbacks iGamesCallbacks, String str, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(GamesStatusCodes.STATUS_MATCH_ERROR_ALREADY_REMATCHED, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo13704d(IGamesCallbacks iGamesCallbacks, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(12002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: dT */
            public void mo13705dT(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeInt(i);
                    this.f1961le.transact(5036, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo13706e(IGamesCallbacks iGamesCallbacks) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    this.f1961le.transact(5027, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo13707e(IGamesCallbacks iGamesCallbacks, int i, boolean z, boolean z2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    this.f1961le.transact(GamesStatusCodes.STATUS_MULTIPLAYER_ERROR_INVALID_OPERATION, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo13708e(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    this.f1961le.transact(5042, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo13709e(IGamesCallbacks iGamesCallbacks, String str, int i, boolean z, boolean z2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    this.f1961le.transact(12021, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo13710e(IGamesCallbacks iGamesCallbacks, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f1961le.transact(8016, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo13711e(IGamesCallbacks iGamesCallbacks, String str, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(12006, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo13712e(IGamesCallbacks iGamesCallbacks, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(12032, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public void mo13713f(IGamesCallbacks iGamesCallbacks) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    this.f1961le.transact(5047, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public void mo13714f(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    this.f1961le.transact(5043, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public void mo13715f(IGamesCallbacks iGamesCallbacks, String str, int i, boolean z, boolean z2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    this.f1961le.transact(12022, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public void mo13716f(IGamesCallbacks iGamesCallbacks, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f1961le.transact(12009, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public void mo13717f(IGamesCallbacks iGamesCallbacks, String str, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(13006, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public void mo13718f(IGamesCallbacks iGamesCallbacks, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(12016, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: fX */
            public Bundle mo13719fX() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f1961le.transact(FitnessStatusCodes.APP_MISMATCH, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public void mo13720g(IGamesCallbacks iGamesCallbacks) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    this.f1961le.transact(5049, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public void mo13721g(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    this.f1961le.transact(5052, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public void mo13722g(IGamesCallbacks iGamesCallbacks, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(13003, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public ParcelFileDescriptor mo13723h(Uri uri) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1961le.transact(GamesStatusCodes.STATUS_MATCH_ERROR_LOCALLY_MODIFIED, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public RoomEntity mo13724h(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    RoomEntity roomEntity = null;
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    this.f1961le.transact(5053, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        roomEntity = RoomEntity.CREATOR.createFromParcel(obtain2);
                    }
                    return roomEntity;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public void mo13725h(IGamesCallbacks iGamesCallbacks) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    this.f1961le.transact(5056, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public void mo13726h(IGamesCallbacks iGamesCallbacks, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1961le.transact(13004, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public void mo13727i(IGamesCallbacks iGamesCallbacks) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    this.f1961le.transact(5062, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public void mo13728i(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    this.f1961le.transact(5061, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public void mo13729j(IGamesCallbacks iGamesCallbacks) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    this.f1961le.transact(11001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public void mo13730j(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    this.f1961le.transact(5057, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public void mo13731k(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    this.f1961le.transact(GamesStatusCodes.STATUS_REAL_TIME_MESSAGE_SEND_FAILED, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: l */
            public void mo13732l(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    this.f1961le.transact(8005, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: lA */
            public int mo13733lA() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f1961le.transact(10023, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: lB */
            public int mo13734lB() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f1961le.transact(12035, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: lC */
            public int mo13735lC() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f1961le.transact(12036, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: lE */
            public void mo13736lE() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f1961le.transact(FitnessStatusCodes.MISSING_BLE_PERMISSION, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: lG */
            public DataHolder mo13737lG() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f1961le.transact(FitnessStatusCodes.UNSUPPORTED_ACCOUNT, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: lH */
            public boolean mo13738lH() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    boolean z = false;
                    this.f1961le.transact(5067, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: lI */
            public DataHolder mo13739lI() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f1961le.transact(5502, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: lJ */
            public void mo13740lJ() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f1961le.transact(8022, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: lK */
            public Intent mo13741lK() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f1961le.transact(9013, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: lL */
            public void mo13742lL() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f1961le.transact(11002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: lM */
            public boolean mo13743lM() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    boolean z = false;
                    this.f1961le.transact(12025, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: lh */
            public String mo13744lh() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f1961le.transact(FitnessStatusCodes.UNSUPPORTED_PLATFORM, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: li */
            public String mo13745li() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f1961le.transact(FitnessStatusCodes.AGGREGATION_NOT_SUPPORTED, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ll */
            public Intent mo13746ll() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f1961le.transact(9003, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: lm */
            public Intent mo13747lm() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f1961le.transact(9005, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ln */
            public Intent mo13748ln() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f1961le.transact(9006, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: lo */
            public Intent mo13749lo() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f1961le.transact(9007, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: lt */
            public Intent mo13750lt() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f1961le.transact(9010, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: lu */
            public Intent mo13751lu() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f1961le.transact(9012, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: lv */
            public int mo13752lv() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f1961le.transact(9019, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: lw */
            public String mo13753lw() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f1961le.transact(FitnessStatusCodes.DATA_TYPE_NOT_FOUND, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: lx */
            public int mo13754lx() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f1961le.transact(8024, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ly */
            public Intent mo13755ly() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f1961le.transact(10015, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: lz */
            public int mo13756lz() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f1961le.transact(10013, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: m */
            public void mo13757m(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    this.f1961le.transact(8006, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: n */
            public void mo13758n(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    this.f1961le.transact(8009, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: o */
            public void mo13759o(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    this.f1961le.transact(8010, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: o */
            public void mo13760o(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f1961le.transact(12017, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: p */
            public void mo13761p(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    this.f1961le.transact(8014, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: p */
            public void mo13762p(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f1961le.transact(5029, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: q */
            public void mo13763q(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeLong(j);
                    this.f1961le.transact(FitnessStatusCodes.CONFLICTING_DATA_TYPE, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: q */
            public void mo13764q(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    this.f1961le.transact(9002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: q */
            public void mo13765q(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f1961le.transact(5028, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: r */
            public void mo13766r(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeLong(j);
                    this.f1961le.transact(5059, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: r */
            public void mo13767r(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    this.f1961le.transact(12020, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: s */
            public void mo13768s(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeLong(j);
                    this.f1961le.transact(8013, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: s */
            public void mo13769s(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    this.f1961le.transact(12005, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: s */
            public void mo13770s(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f1961le.transact(5055, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: t */
            public void mo13771t(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeLong(j);
                    this.f1961le.transact(GamesActivityResultCodes.RESULT_SIGN_IN_FAILED, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: t */
            public void mo13772t(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    this.f1961le.transact(12027, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: t */
            public void mo13773t(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f1961le.transact(10014, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: t */
            public void mo13774t(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f1961le.transact(5065, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: u */
            public Intent mo13775u(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f1961le.transact(14001, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: u */
            public void mo13776u(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeLong(j);
                    this.f1961le.transact(12012, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: u */
            public void mo13777u(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iGamesCallbacks != null ? iGamesCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    this.f1961le.transact(12008, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: u */
            public void mo13778u(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f1961le.transact(8025, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.google.android.gms.games.internal.IGamesService");
        }

        /* renamed from: aE */
        public static IGamesService m2898aE(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IGamesService)) ? new Proxy(iBinder) : (IGamesService) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: android.os.Parcel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v51, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v55, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v180, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v237, resolved type: android.net.Uri} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v356, resolved type: com.google.android.gms.games.multiplayer.realtime.RoomEntity} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v436, resolved type: com.google.android.gms.games.internal.multiplayer.ZInvitationCluster} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v440, resolved type: com.google.android.gms.games.internal.request.GameRequestCluster} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v465, resolved type: com.google.android.gms.drive.Contents} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v502, resolved type: com.google.android.gms.drive.Contents} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v562, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v572, resolved type: com.google.android.gms.games.achievement.AchievementEntity} */
        /* JADX WARNING: type inference failed for: r0v0 */
        /* JADX WARNING: type inference failed for: r0v59 */
        /* JADX WARNING: type inference failed for: r0v74 */
        /* JADX WARNING: type inference failed for: r0v248 */
        /* JADX WARNING: type inference failed for: r0v261 */
        /* JADX WARNING: type inference failed for: r0v375 */
        /* JADX WARNING: type inference failed for: r0v548 */
        /* JADX WARNING: type inference failed for: r0v586 */
        /* JADX WARNING: type inference failed for: r0v599 */
        /* JADX WARNING: type inference failed for: r0v600 */
        /* JADX WARNING: type inference failed for: r0v601 */
        /* JADX WARNING: type inference failed for: r0v602 */
        /* JADX WARNING: type inference failed for: r0v603 */
        /* JADX WARNING: type inference failed for: r0v604 */
        /* JADX WARNING: type inference failed for: r0v605 */
        /* JADX WARNING: type inference failed for: r0v606 */
        /* JADX WARNING: type inference failed for: r0v607 */
        /* JADX WARNING: type inference failed for: r0v608 */
        /* JADX WARNING: type inference failed for: r0v609 */
        /* JADX WARNING: type inference failed for: r0v610 */
        /* JADX WARNING: type inference failed for: r0v611 */
        /* JADX WARNING: type inference failed for: r0v612 */
        /* JADX WARNING: type inference failed for: r0v613 */
        /* JADX WARNING: type inference failed for: r0v614 */
        /* JADX WARNING: type inference failed for: r0v615 */
        /* JADX WARNING: type inference failed for: r0v616 */
        /* JADX WARNING: type inference failed for: r0v617 */
        /* JADX WARNING: type inference failed for: r0v618 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r14, android.os.Parcel r15, android.os.Parcel r16, int r17) throws android.os.RemoteException {
            /*
                r13 = this;
                r9 = r13
                r10 = r15
                r11 = r16
                r0 = 0
                r7 = 0
                r12 = 1
                switch(r14) {
                    case 5001: goto L_0x16c9;
                    case 5002: goto L_0x16b5;
                    case 5003: goto L_0x16a5;
                    case 5004: goto L_0x168c;
                    case 5005: goto L_0x166e;
                    case 5006: goto L_0x1662;
                    case 5007: goto L_0x1652;
                    default: goto L_0x000a;
                }
            L_0x000a:
                switch(r14) {
                    case 5012: goto L_0x1642;
                    case 5013: goto L_0x1629;
                    case 5014: goto L_0x1611;
                    case 5015: goto L_0x15e9;
                    case 5016: goto L_0x15cd;
                    case 5017: goto L_0x15b9;
                    case 5018: goto L_0x15a1;
                    case 5019: goto L_0x1573;
                    case 5020: goto L_0x1545;
                    case 5021: goto L_0x151b;
                    case 5022: goto L_0x1507;
                    case 5023: goto L_0x14dd;
                    case 5024: goto L_0x14b3;
                    case 5025: goto L_0x1483;
                    case 5026: goto L_0x146f;
                    case 5027: goto L_0x145b;
                    case 5028: goto L_0x1447;
                    case 5029: goto L_0x1433;
                    case 5030: goto L_0x13f6;
                    case 5031: goto L_0x13cc;
                    case 5032: goto L_0x13b4;
                    case 5033: goto L_0x1390;
                    case 5034: goto L_0x1374;
                    case 5035: goto L_0x1360;
                    case 5036: goto L_0x1350;
                    case 5037: goto L_0x1338;
                    case 5038: goto L_0x131c;
                    case 5039: goto L_0x12ec;
                    case 5040: goto L_0x12bc;
                    case 5041: goto L_0x12a0;
                    case 5042: goto L_0x1288;
                    case 5043: goto L_0x1270;
                    case 5044: goto L_0x1241;
                    case 5045: goto L_0x1212;
                    case 5046: goto L_0x11ea;
                    case 5047: goto L_0x11d6;
                    case 5048: goto L_0x11ae;
                    case 5049: goto L_0x119a;
                    case 5050: goto L_0x118a;
                    case 5051: goto L_0x1172;
                    case 5052: goto L_0x115a;
                    case 5053: goto L_0x1135;
                    case 5054: goto L_0x1116;
                    case 5055: goto L_0x1102;
                    case 5056: goto L_0x10ee;
                    case 5057: goto L_0x10d6;
                    case 5058: goto L_0x10be;
                    case 5059: goto L_0x10ae;
                    case 5060: goto L_0x109a;
                    case 5061: goto L_0x1082;
                    case 5062: goto L_0x106e;
                    case 5063: goto L_0x1045;
                    case 5064: goto L_0x1031;
                    case 5065: goto L_0x101d;
                    case 5066: goto L_0x1000;
                    case 5067: goto L_0x0ff0;
                    case 5068: goto L_0x0fdd;
                    default: goto L_0x000d;
                }
            L_0x000d:
                switch(r14) {
                    case 5501: goto L_0x0fae;
                    case 5502: goto L_0x0f95;
                    default: goto L_0x0010;
                }
            L_0x0010:
                switch(r14) {
                    case 6001: goto L_0x0f7a;
                    case 6002: goto L_0x0f57;
                    case 6003: goto L_0x0f2f;
                    case 6004: goto L_0x0f07;
                    default: goto L_0x0013;
                }
            L_0x0013:
                switch(r14) {
                    case 6501: goto L_0x0ec8;
                    case 6502: goto L_0x0ea9;
                    case 6503: goto L_0x0e8e;
                    case 6504: goto L_0x0e6f;
                    case 6505: goto L_0x0e50;
                    case 6506: goto L_0x0e2d;
                    case 6507: goto L_0x0e06;
                    default: goto L_0x0016;
                }
            L_0x0016:
                switch(r14) {
                    case 7001: goto L_0x0dee;
                    case 7002: goto L_0x0dcd;
                    case 7003: goto L_0x0d9d;
                    default: goto L_0x0019;
                }
            L_0x0019:
                switch(r14) {
                    case 8001: goto L_0x0d78;
                    case 8002: goto L_0x0d68;
                    case 8003: goto L_0x0d50;
                    case 8004: goto L_0x0d20;
                    case 8005: goto L_0x0d08;
                    case 8006: goto L_0x0cf0;
                    case 8007: goto L_0x0cc6;
                    case 8008: goto L_0x0ca2;
                    case 8009: goto L_0x0c8a;
                    case 8010: goto L_0x0c72;
                    case 8011: goto L_0x0c56;
                    case 8012: goto L_0x0c3e;
                    case 8013: goto L_0x0c2e;
                    case 8014: goto L_0x0c16;
                    case 8015: goto L_0x0bfa;
                    case 8016: goto L_0x0bde;
                    case 8017: goto L_0x0bc2;
                    case 8018: goto L_0x0ba6;
                    case 8019: goto L_0x0b92;
                    case 8020: goto L_0x0b76;
                    case 8021: goto L_0x0b62;
                    case 8022: goto L_0x0b56;
                    case 8023: goto L_0x0b33;
                    case 8024: goto L_0x0b23;
                    case 8025: goto L_0x0b0f;
                    case 8026: goto L_0x0af7;
                    case 8027: goto L_0x0adc;
                    default: goto L_0x001c;
                }
            L_0x001c:
                switch(r14) {
                    case 9001: goto L_0x0aad;
                    case 9002: goto L_0x0a95;
                    case 9003: goto L_0x0a7c;
                    case 9004: goto L_0x0a5f;
                    case 9005: goto L_0x0a46;
                    case 9006: goto L_0x0a2d;
                    case 9007: goto L_0x0a14;
                    case 9008: goto L_0x09ea;
                    case 9009: goto L_0x09c0;
                    case 9010: goto L_0x09a7;
                    case 9011: goto L_0x097c;
                    case 9012: goto L_0x0963;
                    case 9013: goto L_0x094a;
                    default: goto L_0x001f;
                }
            L_0x001f:
                switch(r14) {
                    case 9019: goto L_0x093a;
                    case 9020: goto L_0x090b;
                    default: goto L_0x0022;
                }
            L_0x0022:
                switch(r14) {
                    case 9030: goto L_0x08ee;
                    case 9031: goto L_0x08a5;
                    default: goto L_0x0025;
                }
            L_0x0025:
                switch(r14) {
                    case 10001: goto L_0x088d;
                    case 10002: goto L_0x087d;
                    case 10003: goto L_0x0861;
                    case 10004: goto L_0x084d;
                    case 10005: goto L_0x0824;
                    case 10006: goto L_0x080c;
                    case 10007: goto L_0x07f4;
                    case 10008: goto L_0x07d4;
                    case 10009: goto L_0x07b4;
                    case 10010: goto L_0x078b;
                    case 10011: goto L_0x076f;
                    case 10012: goto L_0x0746;
                    case 10013: goto L_0x0736;
                    case 10014: goto L_0x0722;
                    case 10015: goto L_0x0709;
                    case 10016: goto L_0x06f1;
                    case 10017: goto L_0x06ce;
                    case 10018: goto L_0x06b2;
                    case 10019: goto L_0x0692;
                    case 10020: goto L_0x067a;
                    case 10021: goto L_0x064d;
                    case 10022: goto L_0x0624;
                    case 10023: goto L_0x0614;
                    default: goto L_0x0028;
                }
            L_0x0028:
                switch(r14) {
                    case 11001: goto L_0x0600;
                    case 11002: goto L_0x05f4;
                    default: goto L_0x002b;
                }
            L_0x002b:
                switch(r14) {
                    case 12001: goto L_0x05c1;
                    case 12002: goto L_0x05a6;
                    case 12003: goto L_0x0583;
                    default: goto L_0x002e;
                }
            L_0x002e:
                switch(r14) {
                    case 12005: goto L_0x056b;
                    case 12006: goto L_0x054c;
                    case 12007: goto L_0x0518;
                    case 12008: goto L_0x0500;
                    case 12009: goto L_0x04e4;
                    case 12010: goto L_0x04c1;
                    case 12011: goto L_0x04a9;
                    case 12012: goto L_0x0499;
                    case 12013: goto L_0x047d;
                    case 12014: goto L_0x0469;
                    case 12015: goto L_0x043b;
                    case 12016: goto L_0x0420;
                    case 12017: goto L_0x040c;
                    case 12018: goto L_0x03d9;
                    case 12019: goto L_0x03bf;
                    case 12020: goto L_0x03a7;
                    case 12021: goto L_0x0378;
                    case 12022: goto L_0x0349;
                    case 12023: goto L_0x032d;
                    case 12024: goto L_0x0311;
                    case 12025: goto L_0x0301;
                    case 12026: goto L_0x02ee;
                    case 12027: goto L_0x02d6;
                    case 12028: goto L_0x02ac;
                    case 12029: goto L_0x028d;
                    case 12030: goto L_0x0270;
                    case 12031: goto L_0x0251;
                    case 12032: goto L_0x0236;
                    case 12033: goto L_0x01fc;
                    case 12034: goto L_0x01df;
                    case 12035: goto L_0x01cf;
                    case 12036: goto L_0x01bf;
                    default: goto L_0x0031;
                }
            L_0x0031:
                switch(r14) {
                    case 13001: goto L_0x01ac;
                    case 13002: goto L_0x018a;
                    case 13003: goto L_0x016f;
                    case 13004: goto L_0x0154;
                    case 13005: goto L_0x012f;
                    case 13006: goto L_0x0110;
                    default: goto L_0x0034;
                }
            L_0x0034:
                switch(r14) {
                    case 14001: goto L_0x00ef;
                    case 14002: goto L_0x00c5;
                    case 14003: goto L_0x0078;
                    default: goto L_0x0037;
                }
            L_0x0037:
                switch(r14) {
                    case 9028: goto L_0x0045;
                    case 1598968902: goto L_0x003f;
                    default: goto L_0x003a;
                }
            L_0x003a:
                boolean r0 = super.onTransact(r14, r15, r16, r17)
                return r0
            L_0x003f:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r11.writeString(r0)
                return r12
            L_0x0045:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r2 = r10.readString()
                java.lang.String r3 = r10.readString()
                int r4 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x0066
                r5 = r12
                goto L_0x0067
            L_0x0066:
                r5 = r7
            L_0x0067:
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x006f
                r6 = r12
                goto L_0x0070
            L_0x006f:
                r6 = r7
            L_0x0070:
                r0 = r9
                r0.mo13630a((com.google.android.gms.games.internal.IGamesCallbacks) r1, (java.lang.String) r2, (java.lang.String) r3, (int) r4, (boolean) r5, (boolean) r6)
                r16.writeNoException()
                return r12
            L_0x0078:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r1)
                android.os.Parcelable$Creator<com.google.android.gms.games.multiplayer.ParticipantEntity> r1 = com.google.android.gms.games.multiplayer.ParticipantEntity.CREATOR
                java.lang.Object[] r1 = r10.createTypedArray(r1)
                com.google.android.gms.games.multiplayer.ParticipantEntity[] r1 = (com.google.android.gms.games.multiplayer.ParticipantEntity[]) r1
                java.lang.String r2 = r10.readString()
                java.lang.String r3 = r10.readString()
                int r4 = r10.readInt()
                if (r4 == 0) goto L_0x009c
                android.os.Parcelable$Creator r4 = android.net.Uri.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r10)
                android.net.Uri r4 = (android.net.Uri) r4
                goto L_0x009d
            L_0x009c:
                r4 = r0
            L_0x009d:
                int r5 = r10.readInt()
                if (r5 == 0) goto L_0x00ab
                android.os.Parcelable$Creator r0 = android.net.Uri.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.net.Uri r0 = (android.net.Uri) r0
            L_0x00ab:
                r5 = r0
                java.lang.String r6 = r10.readString()
                r0 = r9
                android.content.Intent r0 = r0.mo13597a((com.google.android.gms.games.multiplayer.ParticipantEntity[]) r1, (java.lang.String) r2, (java.lang.String) r3, (android.net.Uri) r4, (android.net.Uri) r5, (java.lang.String) r6)
                r16.writeNoException()
                if (r0 == 0) goto L_0x00c1
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x00c1:
                r11.writeInt(r7)
                return r12
            L_0x00c5:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                int r2 = r10.readInt()
                java.lang.String r3 = r10.readString()
                java.lang.String[] r4 = r10.createStringArray()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x00e6
                r5 = r12
                goto L_0x00e7
            L_0x00e6:
                r5 = r7
            L_0x00e7:
                r0 = r9
                r0.mo13606a((com.google.android.gms.games.internal.IGamesCallbacks) r1, (int) r2, (java.lang.String) r3, (java.lang.String[]) r4, (boolean) r5)
                r16.writeNoException()
                return r12
            L_0x00ef:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                int r1 = r10.readInt()
                android.content.Intent r0 = r9.mo13775u((java.lang.String) r0, (int) r1)
                r16.writeNoException()
                if (r0 == 0) goto L_0x010c
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x010c:
                r11.writeInt(r7)
                return r12
            L_0x0110:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                int r2 = r10.readInt()
                if (r2 == 0) goto L_0x0128
                r7 = r12
            L_0x0128:
                r9.mo13717f((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1, (boolean) r7)
                r16.writeNoException()
                return r12
            L_0x012f:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r1)
                int r1 = r10.readInt()
                if (r1 == 0) goto L_0x0140
                com.google.android.gms.games.achievement.AchievementEntityCreator r0 = com.google.android.gms.games.achievement.AchievementEntity.CREATOR
                com.google.android.gms.games.achievement.AchievementEntity r0 = r0.createFromParcel((android.os.Parcel) r10)
            L_0x0140:
                android.content.Intent r0 = r9.mo13591a((com.google.android.gms.games.achievement.AchievementEntity) r0)
                r16.writeNoException()
                if (r0 == 0) goto L_0x0150
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x0150:
                r11.writeInt(r7)
                return r12
            L_0x0154:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                int r1 = r10.readInt()
                if (r1 == 0) goto L_0x0168
                r7 = r12
            L_0x0168:
                r9.mo13726h((com.google.android.gms.games.internal.IGamesCallbacks) r0, (boolean) r7)
                r16.writeNoException()
                return r12
            L_0x016f:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                int r1 = r10.readInt()
                if (r1 == 0) goto L_0x0183
                r7 = r12
            L_0x0183:
                r9.mo13722g((com.google.android.gms.games.internal.IGamesCallbacks) r0, (boolean) r7)
                r16.writeNoException()
                return r12
            L_0x018a:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r1)
                java.lang.String r1 = r10.readString()
                android.os.IBinder r2 = r10.readStrongBinder()
                int r3 = r10.readInt()
                if (r3 == 0) goto L_0x01a5
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x01a5:
                r9.mo13648a((java.lang.String) r1, (android.os.IBinder) r2, (android.os.Bundle) r0)
                r16.writeNoException()
                return r12
            L_0x01ac:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x01b8
                r7 = r12
            L_0x01b8:
                r9.mo13587Q(r7)
                r16.writeNoException()
                return r12
            L_0x01bf:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                int r0 = r9.mo13735lC()
                r16.writeNoException()
                r11.writeInt(r0)
                return r12
            L_0x01cf:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                int r0 = r9.mo13734lB()
                r16.writeNoException()
                r11.writeInt(r0)
                return r12
            L_0x01df:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                android.content.Intent r0 = r9.mo13672bE(r0)
                r16.writeNoException()
                if (r0 == 0) goto L_0x01f8
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x01f8:
                r11.writeInt(r7)
                return r12
            L_0x01fc:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r1)
                android.os.IBinder r1 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r1)
                java.lang.String r2 = r10.readString()
                java.lang.String r3 = r10.readString()
                int r4 = r10.readInt()
                if (r4 == 0) goto L_0x021e
                com.google.android.gms.games.snapshot.SnapshotMetadataChangeCreator r4 = com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity.CREATOR
                com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity r4 = r4.createFromParcel(r10)
                goto L_0x021f
            L_0x021e:
                r4 = r0
            L_0x021f:
                int r5 = r10.readInt()
                if (r5 == 0) goto L_0x022d
                android.os.Parcelable$Creator<com.google.android.gms.drive.Contents> r0 = com.google.android.gms.drive.Contents.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                com.google.android.gms.drive.Contents r0 = (com.google.android.gms.drive.Contents) r0
            L_0x022d:
                r5 = r0
                r0 = r9
                r0.mo13631a((com.google.android.gms.games.internal.IGamesCallbacks) r1, (java.lang.String) r2, (java.lang.String) r3, (com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity) r4, (com.google.android.gms.drive.Contents) r5)
                r16.writeNoException()
                return r12
            L_0x0236:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                int r1 = r10.readInt()
                if (r1 == 0) goto L_0x024a
                r7 = r12
            L_0x024a:
                r9.mo13712e((com.google.android.gms.games.internal.IGamesCallbacks) r0, (boolean) r7)
                r16.writeNoException()
                return r12
            L_0x0251:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                int r1 = r10.readInt()
                if (r1 == 0) goto L_0x0265
                r7 = r12
            L_0x0265:
                java.lang.String[] r1 = r10.createStringArray()
                r9.mo13643a((com.google.android.gms.games.internal.IGamesCallbacks) r0, (boolean) r7, (java.lang.String[]) r1)
                r16.writeNoException()
                return r12
            L_0x0270:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                int[] r0 = r10.createIntArray()
                android.content.Intent r0 = r9.mo13651b((int[]) r0)
                r16.writeNoException()
                if (r0 == 0) goto L_0x0289
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x0289:
                r11.writeInt(r7)
                return r12
            L_0x028d:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String[] r1 = r10.createStringArray()
                int r2 = r10.readInt()
                if (r2 == 0) goto L_0x02a5
                r7 = r12
            L_0x02a5:
                r9.mo13647a((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String[]) r1, (boolean) r7)
                r16.writeNoException()
                return r12
            L_0x02ac:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r2 = r10.readString()
                java.lang.String r3 = r10.readString()
                java.lang.String[] r4 = r10.createStringArray()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x02cd
                r5 = r12
                goto L_0x02ce
            L_0x02cd:
                r5 = r7
            L_0x02ce:
                r0 = r9
                r0.mo13635a((com.google.android.gms.games.internal.IGamesCallbacks) r1, (java.lang.String) r2, (java.lang.String) r3, (java.lang.String[]) r4, (boolean) r5)
                r16.writeNoException()
                return r12
            L_0x02d6:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                r9.mo13772t((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1)
                r16.writeNoException()
                return r12
            L_0x02ee:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x02fa
                r7 = r12
            L_0x02fa:
                r9.mo13586P(r7)
                r16.writeNoException()
                return r12
            L_0x0301:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                boolean r0 = r9.mo13743lM()
                r16.writeNoException()
                r11.writeInt(r0)
                return r12
            L_0x0311:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                int r2 = r10.readInt()
                r9.mo13687c((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1, (int) r2)
                r16.writeNoException()
                return r12
            L_0x032d:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                int r2 = r10.readInt()
                r9.mo13658b((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1, (int) r2)
                r16.writeNoException()
                return r12
            L_0x0349:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r2 = r10.readString()
                int r3 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x0366
                r4 = r12
                goto L_0x0367
            L_0x0366:
                r4 = r7
            L_0x0367:
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x036f
                r5 = r12
                goto L_0x0370
            L_0x036f:
                r5 = r7
            L_0x0370:
                r0 = r9
                r0.mo13715f(r1, r2, r3, r4, r5)
                r16.writeNoException()
                return r12
            L_0x0378:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r2 = r10.readString()
                int r3 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x0395
                r4 = r12
                goto L_0x0396
            L_0x0395:
                r4 = r7
            L_0x0396:
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x039e
                r5 = r12
                goto L_0x039f
            L_0x039e:
                r5 = r7
            L_0x039f:
                r0 = r9
                r0.mo13709e(r1, r2, r3, r4, r5)
                r16.writeNoException()
                return r12
            L_0x03a7:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                r9.mo13767r(r0, r1)
                r16.writeNoException()
                return r12
            L_0x03bf:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r1)
                int r1 = r10.readInt()
                if (r1 == 0) goto L_0x03d2
                android.os.Parcelable$Creator<com.google.android.gms.drive.Contents> r0 = com.google.android.gms.drive.Contents.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                com.google.android.gms.drive.Contents r0 = (com.google.android.gms.drive.Contents) r0
            L_0x03d2:
                r9.mo13600a((com.google.android.gms.drive.Contents) r0)
                r16.writeNoException()
                return r12
            L_0x03d9:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r2 = r10.readString()
                java.lang.String r3 = r10.readString()
                int r4 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x03fa
                r5 = r12
                goto L_0x03fb
            L_0x03fa:
                r5 = r7
            L_0x03fb:
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x0403
                r6 = r12
                goto L_0x0404
            L_0x0403:
                r6 = r7
            L_0x0404:
                r0 = r9
                r0.mo13666b((com.google.android.gms.games.internal.IGamesCallbacks) r1, (java.lang.String) r2, (java.lang.String) r3, (int) r4, (boolean) r5, (boolean) r6)
                r16.writeNoException()
                return r12
            L_0x040c:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                int r1 = r10.readInt()
                r9.mo13760o((java.lang.String) r0, (int) r1)
                r16.writeNoException()
                return r12
            L_0x0420:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                int r1 = r10.readInt()
                if (r1 == 0) goto L_0x0434
                r7 = r12
            L_0x0434:
                r9.mo13718f((com.google.android.gms.games.internal.IGamesCallbacks) r0, (boolean) r7)
                r16.writeNoException()
                return r12
            L_0x043b:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r2 = r10.readString()
                java.lang.String r3 = r10.readString()
                int[] r4 = r10.createIntArray()
                int r5 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x0460
                r6 = r12
                goto L_0x0461
            L_0x0460:
                r6 = r7
            L_0x0461:
                r0 = r9
                r0.mo13633a((com.google.android.gms.games.internal.IGamesCallbacks) r1, (java.lang.String) r2, (java.lang.String) r3, (int[]) r4, (int) r5, (boolean) r6)
                r16.writeNoException()
                return r12
            L_0x0469:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                long r0 = r10.readLong()
                java.lang.String r2 = r10.readString()
                r9.mo13695d((long) r0, (java.lang.String) r2)
                r16.writeNoException()
                return r12
            L_0x047d:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                long r1 = r10.readLong()
                java.lang.String r3 = r10.readString()
                r9.mo13699d((com.google.android.gms.games.internal.IGamesCallbacks) r0, (long) r1, (java.lang.String) r3)
                r16.writeNoException()
                return r12
            L_0x0499:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                long r0 = r10.readLong()
                r9.mo13776u(r0)
                r16.writeNoException()
                return r12
            L_0x04a9:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                long r1 = r10.readLong()
                r9.mo13698d((com.google.android.gms.games.internal.IGamesCallbacks) r0, (long) r1)
                r16.writeNoException()
                return r12
            L_0x04c1:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                int[] r1 = r10.createIntArray()
                int r2 = r10.readInt()
                int r3 = r10.readInt()
                if (r3 == 0) goto L_0x04dd
                r7 = r12
            L_0x04dd:
                r9.mo13645a((com.google.android.gms.games.internal.IGamesCallbacks) r0, (int[]) r1, (int) r2, (boolean) r7)
                r16.writeNoException()
                return r12
            L_0x04e4:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                java.lang.String r2 = r10.readString()
                r9.mo13716f((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1, (java.lang.String) r2)
                r16.writeNoException()
                return r12
            L_0x0500:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                r9.mo13777u((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1)
                r16.writeNoException()
                return r12
            L_0x0518:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r1)
                android.os.IBinder r1 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r1)
                java.lang.String r2 = r10.readString()
                int r3 = r10.readInt()
                if (r3 == 0) goto L_0x0536
                com.google.android.gms.games.snapshot.SnapshotMetadataChangeCreator r3 = com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity.CREATOR
                com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity r3 = r3.createFromParcel(r10)
                goto L_0x0537
            L_0x0536:
                r3 = r0
            L_0x0537:
                int r4 = r10.readInt()
                if (r4 == 0) goto L_0x0545
                android.os.Parcelable$Creator<com.google.android.gms.drive.Contents> r0 = com.google.android.gms.drive.Contents.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                com.google.android.gms.drive.Contents r0 = (com.google.android.gms.drive.Contents) r0
            L_0x0545:
                r9.mo13625a((com.google.android.gms.games.internal.IGamesCallbacks) r1, (java.lang.String) r2, (com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity) r3, (com.google.android.gms.drive.Contents) r0)
                r16.writeNoException()
                return r12
            L_0x054c:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                int r2 = r10.readInt()
                if (r2 == 0) goto L_0x0564
                r7 = r12
            L_0x0564:
                r9.mo13711e((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1, (boolean) r7)
                r16.writeNoException()
                return r12
            L_0x056b:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                r9.mo13769s((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1)
                r16.writeNoException()
                return r12
            L_0x0583:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                java.lang.String r2 = r10.readString()
                int r3 = r10.readInt()
                if (r3 == 0) goto L_0x059f
                r7 = r12
            L_0x059f:
                r9.mo13690c((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1, (java.lang.String) r2, (boolean) r7)
                r16.writeNoException()
                return r12
            L_0x05a6:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                int r1 = r10.readInt()
                if (r1 == 0) goto L_0x05ba
                r7 = r12
            L_0x05ba:
                r9.mo13704d((com.google.android.gms.games.internal.IGamesCallbacks) r0, (boolean) r7)
                r16.writeNoException()
                return r12
            L_0x05c1:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                int r1 = r10.readInt()
                if (r1 == 0) goto L_0x05d2
                r1 = r12
                goto L_0x05d3
            L_0x05d2:
                r1 = r7
            L_0x05d3:
                int r2 = r10.readInt()
                if (r2 == 0) goto L_0x05db
                r2 = r12
                goto L_0x05dc
            L_0x05db:
                r2 = r7
            L_0x05dc:
                int r3 = r10.readInt()
                android.content.Intent r0 = r9.mo13595a((java.lang.String) r0, (boolean) r1, (boolean) r2, (int) r3)
                r16.writeNoException()
                if (r0 == 0) goto L_0x05f0
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x05f0:
                r11.writeInt(r7)
                return r12
            L_0x05f4:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                r9.mo13742lL()
                r16.writeNoException()
                return r12
            L_0x0600:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                r9.mo13729j(r0)
                r16.writeNoException()
                return r12
            L_0x0614:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                int r0 = r9.mo13733lA()
                r16.writeNoException()
                r11.writeInt(r0)
                return r12
            L_0x0624:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r1)
                int r1 = r10.readInt()
                if (r1 == 0) goto L_0x0635
                com.google.android.gms.games.internal.request.GameRequestClusterCreator r0 = com.google.android.gms.games.internal.request.GameRequestCluster.CREATOR
                com.google.android.gms.games.internal.request.GameRequestCluster r0 = r0.createFromParcel(r10)
            L_0x0635:
                java.lang.String r1 = r10.readString()
                android.content.Intent r0 = r9.mo13593a((com.google.android.gms.games.internal.request.GameRequestCluster) r0, (java.lang.String) r1)
                r16.writeNoException()
                if (r0 == 0) goto L_0x0649
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x0649:
                r11.writeInt(r7)
                return r12
            L_0x064d:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r1)
                int r1 = r10.readInt()
                if (r1 == 0) goto L_0x065e
                com.google.android.gms.games.internal.multiplayer.InvitationClusterCreator r0 = com.google.android.gms.games.internal.multiplayer.ZInvitationCluster.CREATOR
                com.google.android.gms.games.internal.multiplayer.ZInvitationCluster r0 = r0.createFromParcel(r10)
            L_0x065e:
                java.lang.String r1 = r10.readString()
                java.lang.String r2 = r10.readString()
                android.content.Intent r0 = r9.mo13592a((com.google.android.gms.games.internal.multiplayer.ZInvitationCluster) r0, (java.lang.String) r1, (java.lang.String) r2)
                r16.writeNoException()
                if (r0 == 0) goto L_0x0676
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x0676:
                r11.writeInt(r7)
                return r12
            L_0x067a:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String[] r1 = r10.createStringArray()
                r9.mo13693c((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String[]) r1)
                r16.writeNoException()
                return r12
            L_0x0692:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                int r2 = r10.readInt()
                int[] r3 = r10.createIntArray()
                r9.mo13621a((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1, (int) r2, (int[]) r3)
                r16.writeNoException()
                return r12
            L_0x06b2:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                int r1 = r10.readInt()
                int[] r2 = r10.createIntArray()
                r9.mo13608a((com.google.android.gms.games.internal.IGamesCallbacks) r0, (int) r1, (int[]) r2)
                r16.writeNoException()
                return r12
            L_0x06ce:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                int r2 = r10.readInt()
                int r3 = r10.readInt()
                if (r3 == 0) goto L_0x06ea
                r7 = r12
            L_0x06ea:
                r9.mo13661b((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1, (int) r2, (boolean) r7)
                r16.writeNoException()
                return r12
            L_0x06f1:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                int r1 = r10.readInt()
                r9.mo13602a((com.google.android.gms.games.internal.IGamesCallbacks) r0, (int) r1)
                r16.writeNoException()
                return r12
            L_0x0709:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.content.Intent r0 = r9.mo13755ly()
                r16.writeNoException()
                if (r0 == 0) goto L_0x071e
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x071e:
                r11.writeInt(r7)
                return r12
            L_0x0722:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                int r1 = r10.readInt()
                r9.mo13773t((java.lang.String) r0, (int) r1)
                r16.writeNoException()
                return r12
            L_0x0736:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                int r0 = r9.mo13756lz()
                r16.writeNoException()
                r11.writeInt(r0)
                return r12
            L_0x0746:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                int r0 = r10.readInt()
                byte[] r1 = r10.createByteArray()
                int r2 = r10.readInt()
                java.lang.String r3 = r10.readString()
                android.content.Intent r0 = r9.mo13590a((int) r0, (byte[]) r1, (int) r2, (java.lang.String) r3)
                r16.writeNoException()
                if (r0 == 0) goto L_0x076b
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x076b:
                r11.writeInt(r7)
                return r12
            L_0x076f:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                int r2 = r10.readInt()
                r9.mo13615a((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1, (int) r2)
                r16.writeNoException()
                return r12
            L_0x078b:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r2 = r10.readString()
                java.lang.String r3 = r10.readString()
                int r4 = r10.readInt()
                int r5 = r10.readInt()
                int r6 = r10.readInt()
                r0 = r9
                r0.mo13628a((com.google.android.gms.games.internal.IGamesCallbacks) r1, (java.lang.String) r2, (java.lang.String) r3, (int) r4, (int) r5, (int) r6)
                r16.writeNoException()
                return r12
            L_0x07b4:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                int r1 = r10.readInt()
                int r2 = r10.readInt()
                int r3 = r10.readInt()
                r9.mo13603a((com.google.android.gms.games.internal.IGamesCallbacks) r0, (int) r1, (int) r2, (int) r3)
                r16.writeNoException()
                return r12
            L_0x07d4:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                java.lang.String r2 = r10.readString()
                java.lang.String[] r3 = r10.createStringArray()
                r9.mo13634a((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1, (java.lang.String) r2, (java.lang.String[]) r3)
                r16.writeNoException()
                return r12
            L_0x07f4:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String[] r1 = r10.createStringArray()
                r9.mo13670b((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String[]) r1)
                r16.writeNoException()
                return r12
            L_0x080c:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String[] r1 = r10.createStringArray()
                r9.mo13646a((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String[]) r1)
                r16.writeNoException()
                return r12
            L_0x0824:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r2 = r10.readString()
                java.lang.String[] r3 = r10.createStringArray()
                int r4 = r10.readInt()
                byte[] r5 = r10.createByteArray()
                int r6 = r10.readInt()
                r0 = r9
                r0.mo13640a((com.google.android.gms.games.internal.IGamesCallbacks) r1, (java.lang.String) r2, (java.lang.String[]) r3, (int) r4, (byte[]) r5, (int) r6)
                r16.writeNoException()
                return r12
            L_0x084d:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                long r0 = r10.readLong()
                java.lang.String r2 = r10.readString()
                r9.mo13681c((long) r0, (java.lang.String) r2)
                r16.writeNoException()
                return r12
            L_0x0861:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                long r1 = r10.readLong()
                java.lang.String r3 = r10.readString()
                r9.mo13685c((com.google.android.gms.games.internal.IGamesCallbacks) r0, (long) r1, (java.lang.String) r3)
                r16.writeNoException()
                return r12
            L_0x087d:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                long r0 = r10.readLong()
                r9.mo13771t(r0)
                r16.writeNoException()
                return r12
            L_0x088d:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                long r1 = r10.readLong()
                r9.mo13684c((com.google.android.gms.games.internal.IGamesCallbacks) r0, (long) r1)
                r16.writeNoException()
                return r12
            L_0x08a5:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r1)
                android.os.Parcelable$Creator<com.google.android.gms.games.multiplayer.ParticipantEntity> r1 = com.google.android.gms.games.multiplayer.ParticipantEntity.CREATOR
                java.lang.Object[] r1 = r10.createTypedArray(r1)
                com.google.android.gms.games.multiplayer.ParticipantEntity[] r1 = (com.google.android.gms.games.multiplayer.ParticipantEntity[]) r1
                java.lang.String r2 = r10.readString()
                java.lang.String r3 = r10.readString()
                int r4 = r10.readInt()
                if (r4 == 0) goto L_0x08c9
                android.os.Parcelable$Creator r4 = android.net.Uri.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r10)
                android.net.Uri r4 = (android.net.Uri) r4
                goto L_0x08ca
            L_0x08c9:
                r4 = r0
            L_0x08ca:
                int r5 = r10.readInt()
                if (r5 == 0) goto L_0x08d8
                android.os.Parcelable$Creator r0 = android.net.Uri.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.net.Uri r0 = (android.net.Uri) r0
            L_0x08d8:
                r5 = r0
                r0 = r9
                android.content.Intent r0 = r0.mo13596a((com.google.android.gms.games.multiplayer.ParticipantEntity[]) r1, (java.lang.String) r2, (java.lang.String) r3, (android.net.Uri) r4, (android.net.Uri) r5)
                r16.writeNoException()
                if (r0 == 0) goto L_0x08ea
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x08ea:
                r11.writeInt(r7)
                return r12
            L_0x08ee:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                android.os.ParcelFileDescriptor r0 = r9.mo13680bN(r0)
                r16.writeNoException()
                if (r0 == 0) goto L_0x0907
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x0907:
                r11.writeInt(r7)
                return r12
            L_0x090b:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r2 = r10.readString()
                int r3 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x0928
                r4 = r12
                goto L_0x0929
            L_0x0928:
                r4 = r7
            L_0x0929:
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x0931
                r5 = r12
                goto L_0x0932
            L_0x0931:
                r5 = r7
            L_0x0932:
                r0 = r9
                r0.mo13701d(r1, r2, r3, r4, r5)
                r16.writeNoException()
                return r12
            L_0x093a:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                int r0 = r9.mo13752lv()
                r16.writeNoException()
                r11.writeInt(r0)
                return r12
            L_0x094a:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.content.Intent r0 = r9.mo13741lK()
                r16.writeNoException()
                if (r0 == 0) goto L_0x095f
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x095f:
                r11.writeInt(r7)
                return r12
            L_0x0963:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.content.Intent r0 = r9.mo13751lu()
                r16.writeNoException()
                if (r0 == 0) goto L_0x0978
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x0978:
                r11.writeInt(r7)
                return r12
            L_0x097c:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r1)
                int r1 = r10.readInt()
                if (r1 == 0) goto L_0x098f
                android.os.Parcelable$Creator<com.google.android.gms.games.multiplayer.realtime.RoomEntity> r0 = com.google.android.gms.games.multiplayer.realtime.RoomEntity.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                com.google.android.gms.games.multiplayer.realtime.RoomEntity r0 = (com.google.android.gms.games.multiplayer.realtime.RoomEntity) r0
            L_0x098f:
                int r1 = r10.readInt()
                android.content.Intent r0 = r9.mo13594a((com.google.android.gms.games.multiplayer.realtime.RoomEntity) r0, (int) r1)
                r16.writeNoException()
                if (r0 == 0) goto L_0x09a3
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x09a3:
                r11.writeInt(r7)
                return r12
            L_0x09a7:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.content.Intent r0 = r9.mo13750lt()
                r16.writeNoException()
                if (r0 == 0) goto L_0x09bc
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x09bc:
                r11.writeInt(r7)
                return r12
            L_0x09c0:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                int r0 = r10.readInt()
                int r1 = r10.readInt()
                int r2 = r10.readInt()
                if (r2 == 0) goto L_0x09d5
                r2 = r12
                goto L_0x09d6
            L_0x09d5:
                r2 = r7
            L_0x09d6:
                android.content.Intent r0 = r9.mo13650b((int) r0, (int) r1, (boolean) r2)
                r16.writeNoException()
                if (r0 == 0) goto L_0x09e6
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x09e6:
                r11.writeInt(r7)
                return r12
            L_0x09ea:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                int r0 = r10.readInt()
                int r1 = r10.readInt()
                int r2 = r10.readInt()
                if (r2 == 0) goto L_0x09ff
                r2 = r12
                goto L_0x0a00
            L_0x09ff:
                r2 = r7
            L_0x0a00:
                android.content.Intent r0 = r9.mo13589a((int) r0, (int) r1, (boolean) r2)
                r16.writeNoException()
                if (r0 == 0) goto L_0x0a10
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x0a10:
                r11.writeInt(r7)
                return r12
            L_0x0a14:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.content.Intent r0 = r9.mo13749lo()
                r16.writeNoException()
                if (r0 == 0) goto L_0x0a29
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x0a29:
                r11.writeInt(r7)
                return r12
            L_0x0a2d:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.content.Intent r0 = r9.mo13748ln()
                r16.writeNoException()
                if (r0 == 0) goto L_0x0a42
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x0a42:
                r11.writeInt(r7)
                return r12
            L_0x0a46:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.content.Intent r0 = r9.mo13747lm()
                r16.writeNoException()
                if (r0 == 0) goto L_0x0a5b
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x0a5b:
                r11.writeInt(r7)
                return r12
            L_0x0a5f:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                android.content.Intent r0 = r9.mo13679bM(r0)
                r16.writeNoException()
                if (r0 == 0) goto L_0x0a78
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x0a78:
                r11.writeInt(r7)
                return r12
            L_0x0a7c:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.content.Intent r0 = r9.mo13746ll()
                r16.writeNoException()
                if (r0 == 0) goto L_0x0a91
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x0a91:
                r11.writeInt(r7)
                return r12
            L_0x0a95:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                r9.mo13764q((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1)
                r16.writeNoException()
                return r12
            L_0x0aad:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r2 = r10.readString()
                int r3 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x0aca
                r4 = r12
                goto L_0x0acb
            L_0x0aca:
                r4 = r7
            L_0x0acb:
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x0ad3
                r5 = r12
                goto L_0x0ad4
            L_0x0ad3:
                r5 = r7
            L_0x0ad4:
                r0 = r9
                r0.mo13688c(r1, r2, r3, r4, r5)
                r16.writeNoException()
                return r12
            L_0x0adc:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                int r1 = r10.readInt()
                if (r1 == 0) goto L_0x0af0
                r7 = r12
            L_0x0af0:
                r9.mo13692c((com.google.android.gms.games.internal.IGamesCallbacks) r0, (boolean) r7)
                r16.writeNoException()
                return r12
            L_0x0af7:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                java.lang.String r1 = r10.readString()
                int r2 = r10.readInt()
                r9.mo13694c((java.lang.String) r0, (java.lang.String) r1, (int) r2)
                r16.writeNoException()
                return r12
            L_0x0b0f:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                java.lang.String r1 = r10.readString()
                r9.mo13778u((java.lang.String) r0, (java.lang.String) r1)
                r16.writeNoException()
                return r12
            L_0x0b23:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                int r0 = r9.mo13754lx()
                r16.writeNoException()
                r11.writeInt(r0)
                return r12
            L_0x0b33:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                int r2 = r10.readInt()
                int r3 = r10.readInt()
                if (r3 == 0) goto L_0x0b4f
                r7 = r12
            L_0x0b4f:
                r9.mo13618a((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1, (int) r2, (boolean) r7)
                r16.writeNoException()
                return r12
            L_0x0b56:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                r9.mo13740lJ()
                r16.writeNoException()
                return r12
            L_0x0b62:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                long r0 = r10.readLong()
                java.lang.String r2 = r10.readString()
                r9.mo13652b((long) r0, (java.lang.String) r2)
                r16.writeNoException()
                return r12
            L_0x0b76:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                long r1 = r10.readLong()
                java.lang.String r3 = r10.readString()
                r9.mo13656b((com.google.android.gms.games.internal.IGamesCallbacks) r0, (long) r1, (java.lang.String) r3)
                r16.writeNoException()
                return r12
            L_0x0b92:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                long r0 = r10.readLong()
                java.lang.String r2 = r10.readString()
                r9.mo13598a((long) r0, (java.lang.String) r2)
                r16.writeNoException()
                return r12
            L_0x0ba6:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                long r1 = r10.readLong()
                java.lang.String r3 = r10.readString()
                r9.mo13610a((com.google.android.gms.games.internal.IGamesCallbacks) r0, (long) r1, (java.lang.String) r3)
                r16.writeNoException()
                return r12
            L_0x0bc2:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                int[] r2 = r10.createIntArray()
                r9.mo13639a((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1, (int[]) r2)
                r16.writeNoException()
                return r12
            L_0x0bde:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                java.lang.String r2 = r10.readString()
                r9.mo13710e((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1, (java.lang.String) r2)
                r16.writeNoException()
                return r12
            L_0x0bfa:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                java.lang.String r2 = r10.readString()
                r9.mo13702d((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1, (java.lang.String) r2)
                r16.writeNoException()
                return r12
            L_0x0c16:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                r9.mo13761p((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1)
                r16.writeNoException()
                return r12
            L_0x0c2e:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                long r0 = r10.readLong()
                r9.mo13768s(r0)
                r16.writeNoException()
                return r12
            L_0x0c3e:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                long r1 = r10.readLong()
                r9.mo13655b((com.google.android.gms.games.internal.IGamesCallbacks) r0, (long) r1)
                r16.writeNoException()
                return r12
            L_0x0c56:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                java.lang.String r2 = r10.readString()
                r9.mo13689c((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1, (java.lang.String) r2)
                r16.writeNoException()
                return r12
            L_0x0c72:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                r9.mo13759o((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1)
                r16.writeNoException()
                return r12
            L_0x0c8a:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                r9.mo13758n(r0, r1)
                r16.writeNoException()
                return r12
            L_0x0ca2:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                byte[] r2 = r10.createByteArray()
                com.google.android.gms.games.multiplayer.ParticipantResultCreator r3 = com.google.android.gms.games.multiplayer.ParticipantResult.CREATOR
                java.lang.Object[] r3 = r10.createTypedArray(r3)
                com.google.android.gms.games.multiplayer.ParticipantResult[] r3 = (com.google.android.gms.games.multiplayer.ParticipantResult[]) r3
                r9.mo13638a((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1, (byte[]) r2, (com.google.android.gms.games.multiplayer.ParticipantResult[]) r3)
                r16.writeNoException()
                return r12
            L_0x0cc6:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r2 = r10.readString()
                byte[] r3 = r10.createByteArray()
                java.lang.String r4 = r10.readString()
                com.google.android.gms.games.multiplayer.ParticipantResultCreator r0 = com.google.android.gms.games.multiplayer.ParticipantResult.CREATOR
                java.lang.Object[] r0 = r10.createTypedArray(r0)
                r5 = r0
                com.google.android.gms.games.multiplayer.ParticipantResult[] r5 = (com.google.android.gms.games.multiplayer.ParticipantResult[]) r5
                r0 = r9
                r0.mo13637a((com.google.android.gms.games.internal.IGamesCallbacks) r1, (java.lang.String) r2, (byte[]) r3, (java.lang.String) r4, (com.google.android.gms.games.multiplayer.ParticipantResult[]) r5)
                r16.writeNoException()
                return r12
            L_0x0cf0:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                r9.mo13757m(r0, r1)
                r16.writeNoException()
                return r12
            L_0x0d08:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                r9.mo13732l(r0, r1)
                r16.writeNoException()
                return r12
            L_0x0d20:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r1)
                android.os.IBinder r1 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r1)
                int r2 = r10.readInt()
                int r3 = r10.readInt()
                java.lang.String[] r4 = r10.createStringArray()
                int r5 = r10.readInt()
                if (r5 == 0) goto L_0x0d47
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0d47:
                r5 = r0
                r0 = r9
                r0.mo13605a((com.google.android.gms.games.internal.IGamesCallbacks) r1, (int) r2, (int) r3, (java.lang.String[]) r4, (android.os.Bundle) r5)
                r16.writeNoException()
                return r12
            L_0x0d50:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                int[] r1 = r10.createIntArray()
                r9.mo13644a((com.google.android.gms.games.internal.IGamesCallbacks) r0, (int[]) r1)
                r16.writeNoException()
                return r12
            L_0x0d68:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                r9.mo13678bL(r0)
                r16.writeNoException()
                return r12
            L_0x0d78:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r2 = r10.readString()
                java.lang.String r3 = r10.readString()
                int r4 = r10.readInt()
                int r5 = r10.readInt()
                r0 = r9
                r0.mo13627a((com.google.android.gms.games.internal.IGamesCallbacks) r1, (java.lang.String) r2, (java.lang.String) r3, (int) r4, (int) r5)
                r16.writeNoException()
                return r12
            L_0x0d9d:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r1)
                android.os.IBinder r1 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r1)
                java.lang.String r2 = r10.readString()
                int r3 = r10.readInt()
                android.os.IBinder r4 = r10.readStrongBinder()
                int r5 = r10.readInt()
                if (r5 == 0) goto L_0x0dc4
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0dc4:
                r5 = r0
                r0 = r9
                r0.mo13660b((com.google.android.gms.games.internal.IGamesCallbacks) r1, (java.lang.String) r2, (int) r3, (android.os.IBinder) r4, (android.os.Bundle) r5)
                r16.writeNoException()
                return r12
            L_0x0dcd:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r2 = r10.readString()
                long r3 = r10.readLong()
                java.lang.String r5 = r10.readString()
                r0 = r9
                r0.mo13623a((com.google.android.gms.games.internal.IGamesCallbacks) r1, (java.lang.String) r2, (long) r3, (java.lang.String) r5)
                r16.writeNoException()
                return r12
            L_0x0dee:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                r9.mo13731k(r0, r1)
                r16.writeNoException()
                return r12
            L_0x0e06:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r1)
                int r1 = r10.readInt()
                if (r1 == 0) goto L_0x0e19
                android.os.Parcelable$Creator r0 = android.net.Uri.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.net.Uri r0 = (android.net.Uri) r0
            L_0x0e19:
                android.os.ParcelFileDescriptor r0 = r9.mo13723h((android.net.Uri) r0)
                r16.writeNoException()
                if (r0 == 0) goto L_0x0e29
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x0e29:
                r11.writeInt(r7)
                return r12
            L_0x0e2d:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                java.lang.String r2 = r10.readString()
                int r3 = r10.readInt()
                if (r3 == 0) goto L_0x0e49
                r7 = r12
            L_0x0e49:
                r9.mo13667b((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1, (java.lang.String) r2, (boolean) r7)
                r16.writeNoException()
                return r12
            L_0x0e50:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                int r2 = r10.readInt()
                if (r2 == 0) goto L_0x0e68
                r7 = r12
            L_0x0e68:
                r9.mo13703d((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1, (boolean) r7)
                r16.writeNoException()
                return r12
            L_0x0e6f:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                int r2 = r10.readInt()
                if (r2 == 0) goto L_0x0e87
                r7 = r12
            L_0x0e87:
                r9.mo13691c((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1, (boolean) r7)
                r16.writeNoException()
                return r12
            L_0x0e8e:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                int r1 = r10.readInt()
                if (r1 == 0) goto L_0x0ea2
                r7 = r12
            L_0x0ea2:
                r9.mo13669b((com.google.android.gms.games.internal.IGamesCallbacks) r0, (boolean) r7)
                r16.writeNoException()
                return r12
            L_0x0ea9:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                int r2 = r10.readInt()
                if (r2 == 0) goto L_0x0ec1
                r7 = r12
            L_0x0ec1:
                r9.mo13668b((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1, (boolean) r7)
                r16.writeNoException()
                return r12
            L_0x0ec8:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r2 = r10.readString()
                int r3 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x0ee5
                r4 = r12
                goto L_0x0ee6
            L_0x0ee5:
                r4 = r7
            L_0x0ee6:
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x0eee
                r5 = r12
                goto L_0x0eef
            L_0x0eee:
                r5 = r7
            L_0x0eef:
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x0ef7
                r6 = r12
                goto L_0x0ef8
            L_0x0ef7:
                r6 = r7
            L_0x0ef8:
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x0eff
                r7 = r12
            L_0x0eff:
                r0 = r9
                r0.mo13620a((com.google.android.gms.games.internal.IGamesCallbacks) r1, (java.lang.String) r2, (int) r3, (boolean) r4, (boolean) r5, (boolean) r6, (boolean) r7)
                r16.writeNoException()
                return r12
            L_0x0f07:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                int r1 = r10.readInt()
                int r2 = r10.readInt()
                if (r2 == 0) goto L_0x0f20
                r2 = r12
                goto L_0x0f21
            L_0x0f20:
                r2 = r7
            L_0x0f21:
                int r3 = r10.readInt()
                if (r3 == 0) goto L_0x0f28
                r7 = r12
            L_0x0f28:
                r9.mo13707e(r0, r1, r2, r7)
                r16.writeNoException()
                return r12
            L_0x0f2f:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                int r1 = r10.readInt()
                int r2 = r10.readInt()
                if (r2 == 0) goto L_0x0f48
                r2 = r12
                goto L_0x0f49
            L_0x0f48:
                r2 = r7
            L_0x0f49:
                int r3 = r10.readInt()
                if (r3 == 0) goto L_0x0f50
                r7 = r12
            L_0x0f50:
                r9.mo13697d(r0, r1, r2, r7)
                r16.writeNoException()
                return r12
            L_0x0f57:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                java.lang.String r2 = r10.readString()
                int r3 = r10.readInt()
                if (r3 == 0) goto L_0x0f73
                r7 = r12
            L_0x0f73:
                r9.mo13632a((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1, (java.lang.String) r2, (boolean) r7)
                r16.writeNoException()
                return r12
            L_0x0f7a:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                int r1 = r10.readInt()
                if (r1 == 0) goto L_0x0f8e
                r7 = r12
            L_0x0f8e:
                r9.mo13641a((com.google.android.gms.games.internal.IGamesCallbacks) r0, (boolean) r7)
                r16.writeNoException()
                return r12
            L_0x0f95:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                com.google.android.gms.common.data.DataHolder r0 = r9.mo13739lI()
                r16.writeNoException()
                if (r0 == 0) goto L_0x0faa
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x0faa:
                r11.writeInt(r7)
                return r12
            L_0x0fae:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r2 = r10.readString()
                int r3 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x0fcb
                r4 = r12
                goto L_0x0fcc
            L_0x0fcb:
                r4 = r7
            L_0x0fcc:
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x0fd4
                r5 = r12
                goto L_0x0fd5
            L_0x0fd4:
                r5 = r7
            L_0x0fd5:
                r0 = r9
                r0.mo13662b((com.google.android.gms.games.internal.IGamesCallbacks) r1, (java.lang.String) r2, (int) r3, (boolean) r4, (boolean) r5)
                r16.writeNoException()
                return r12
            L_0x0fdd:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x0fe9
                r7 = r12
            L_0x0fe9:
                r9.mo13585O(r7)
                r16.writeNoException()
                return r12
            L_0x0ff0:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                boolean r0 = r9.mo13738lH()
                r16.writeNoException()
                r11.writeInt(r0)
                return r12
            L_0x1000:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                android.net.Uri r0 = r9.mo13677bK(r0)
                r16.writeNoException()
                if (r0 == 0) goto L_0x1019
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x1019:
                r11.writeInt(r7)
                return r12
            L_0x101d:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                java.lang.String r1 = r10.readString()
                r9.mo13774t((java.lang.String) r0, (java.lang.String) r1)
                r16.writeNoException()
                return r12
            L_0x1031:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                java.lang.String r0 = r9.mo13673bG(r0)
                r16.writeNoException()
                r11.writeString(r0)
                return r12
            L_0x1045:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r1)
                android.os.IBinder r1 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r1)
                int r2 = r10.readInt()
                if (r2 == 0) goto L_0x1059
                r7 = r12
            L_0x1059:
                int r2 = r10.readInt()
                if (r2 == 0) goto L_0x1067
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x1067:
                r9.mo13642a((com.google.android.gms.games.internal.IGamesCallbacks) r1, (boolean) r7, (android.os.Bundle) r0)
                r16.writeNoException()
                return r12
            L_0x106e:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                r9.mo13727i(r0)
                r16.writeNoException()
                return r12
            L_0x1082:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                r9.mo13728i(r0, r1)
                r16.writeNoException()
                return r12
            L_0x109a:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                int r0 = r9.mo13676bJ(r0)
                r16.writeNoException()
                r11.writeInt(r0)
                return r12
            L_0x10ae:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                long r0 = r10.readLong()
                r9.mo13766r(r0)
                r16.writeNoException()
                return r12
            L_0x10be:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                long r1 = r10.readLong()
                r9.mo13609a((com.google.android.gms.games.internal.IGamesCallbacks) r0, (long) r1)
                r16.writeNoException()
                return r12
            L_0x10d6:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                r9.mo13730j(r0, r1)
                r16.writeNoException()
                return r12
            L_0x10ee:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                r9.mo13725h((com.google.android.gms.games.internal.IGamesCallbacks) r0)
                r16.writeNoException()
                return r12
            L_0x1102:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                int r1 = r10.readInt()
                r9.mo13770s((java.lang.String) r0, (int) r1)
                r16.writeNoException()
                return r12
            L_0x1116:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                int r2 = r10.readInt()
                if (r2 == 0) goto L_0x112e
                r7 = r12
            L_0x112e:
                r9.mo13636a((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1, (boolean) r7)
                r16.writeNoException()
                return r12
            L_0x1135:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                com.google.android.gms.games.multiplayer.realtime.RoomEntity r0 = r9.mo13724h((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1)
                r16.writeNoException()
                if (r0 == 0) goto L_0x1156
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x1156:
                r11.writeInt(r7)
                return r12
            L_0x115a:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                r9.mo13721g((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1)
                r16.writeNoException()
                return r12
            L_0x1172:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                java.lang.String r1 = r10.readString()
                int r2 = r10.readInt()
                r9.mo13671b((java.lang.String) r0, (java.lang.String) r1, (int) r2)
                r16.writeNoException()
                return r12
            L_0x118a:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                r9.mo13675bI(r0)
                r16.writeNoException()
                return r12
            L_0x119a:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                r9.mo13720g(r0)
                r16.writeNoException()
                return r12
            L_0x11ae:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                int r1 = r10.readInt()
                int r2 = r10.readInt()
                if (r2 == 0) goto L_0x11c7
                r2 = r12
                goto L_0x11c8
            L_0x11c7:
                r2 = r7
            L_0x11c8:
                int r3 = r10.readInt()
                if (r3 == 0) goto L_0x11cf
                r7 = r12
            L_0x11cf:
                r9.mo13683c((com.google.android.gms.games.internal.IGamesCallbacks) r0, (int) r1, (boolean) r2, (boolean) r7)
                r16.writeNoException()
                return r12
            L_0x11d6:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                r9.mo13713f(r0)
                r16.writeNoException()
                return r12
            L_0x11ea:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                int r1 = r10.readInt()
                int r2 = r10.readInt()
                if (r2 == 0) goto L_0x1203
                r2 = r12
                goto L_0x1204
            L_0x1203:
                r2 = r7
            L_0x1204:
                int r3 = r10.readInt()
                if (r3 == 0) goto L_0x120b
                r7 = r12
            L_0x120b:
                r9.mo13654b((com.google.android.gms.games.internal.IGamesCallbacks) r0, (int) r1, (boolean) r2, (boolean) r7)
                r16.writeNoException()
                return r12
            L_0x1212:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r2 = r10.readString()
                int r3 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x122f
                r4 = r12
                goto L_0x1230
            L_0x122f:
                r4 = r7
            L_0x1230:
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x1238
                r5 = r12
                goto L_0x1239
            L_0x1238:
                r5 = r7
            L_0x1239:
                r0 = r9
                r0.mo13619a((com.google.android.gms.games.internal.IGamesCallbacks) r1, (java.lang.String) r2, (int) r3, (boolean) r4, (boolean) r5)
                r16.writeNoException()
                return r12
            L_0x1241:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                int r2 = r10.readInt()
                int r3 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x125e
                r4 = r12
                goto L_0x125f
            L_0x125e:
                r4 = r7
            L_0x125f:
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x1267
                r5 = r12
                goto L_0x1268
            L_0x1267:
                r5 = r7
            L_0x1268:
                r0 = r9
                r0.mo13604a((com.google.android.gms.games.internal.IGamesCallbacks) r1, (int) r2, (int) r3, (boolean) r4, (boolean) r5)
                r16.writeNoException()
                return r12
            L_0x1270:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                r9.mo13714f((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1)
                r16.writeNoException()
                return r12
            L_0x1288:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                r9.mo13708e((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1)
                r16.writeNoException()
                return r12
            L_0x12a0:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                java.lang.String r2 = r10.readString()
                r9.mo13664b((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1, (java.lang.String) r2)
                r16.writeNoException()
                return r12
            L_0x12bc:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r2 = r10.readString()
                java.lang.String r3 = r10.readString()
                int r4 = r10.readInt()
                int r5 = r10.readInt()
                int r6 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x12e4
                r7 = r12
            L_0x12e4:
                r0 = r9
                r0.mo13665b(r1, r2, r3, r4, r5, r6, r7)
                r16.writeNoException()
                return r12
            L_0x12ec:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r2 = r10.readString()
                java.lang.String r3 = r10.readString()
                int r4 = r10.readInt()
                int r5 = r10.readInt()
                int r6 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x1314
                r7 = r12
            L_0x1314:
                r0 = r9
                r0.mo13629a((com.google.android.gms.games.internal.IGamesCallbacks) r1, (java.lang.String) r2, (java.lang.String) r3, (int) r4, (int) r5, (int) r6, (boolean) r7)
                r16.writeNoException()
                return r12
            L_0x131c:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                java.lang.String r2 = r10.readString()
                r9.mo13626a((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1, (java.lang.String) r2)
                r16.writeNoException()
                return r12
            L_0x1338:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                r9.mo13700d((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1)
                r16.writeNoException()
                return r12
            L_0x1350:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                int r0 = r10.readInt()
                r9.mo13705dT(r0)
                r16.writeNoException()
                return r12
            L_0x1360:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                java.lang.String r0 = r9.mo13674bH(r0)
                r16.writeNoException()
                r11.writeString(r0)
                return r12
            L_0x1374:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                byte[] r0 = r10.createByteArray()
                java.lang.String r1 = r10.readString()
                java.lang.String[] r2 = r10.createStringArray()
                int r0 = r9.mo13649b((byte[]) r0, (java.lang.String) r1, (java.lang.String[]) r2)
                r16.writeNoException()
                r11.writeInt(r0)
                return r12
            L_0x1390:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                byte[] r1 = r10.createByteArray()
                java.lang.String r2 = r10.readString()
                java.lang.String r3 = r10.readString()
                int r0 = r9.mo13588a((com.google.android.gms.games.internal.IGamesCallbacks) r0, (byte[]) r1, (java.lang.String) r2, (java.lang.String) r3)
                r16.writeNoException()
                r11.writeInt(r0)
                return r12
            L_0x13b4:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                r9.mo13686c((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1)
                r16.writeNoException()
                return r12
            L_0x13cc:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                android.os.IBinder r2 = r10.readStrongBinder()
                java.lang.String r3 = r10.readString()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x13e9
                r4 = r12
                goto L_0x13ea
            L_0x13e9:
                r4 = r7
            L_0x13ea:
                long r5 = r10.readLong()
                r0 = r9
                r0.mo13613a((com.google.android.gms.games.internal.IGamesCallbacks) r1, (android.os.IBinder) r2, (java.lang.String) r3, (boolean) r4, (long) r5)
                r16.writeNoException()
                return r12
            L_0x13f6:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r1)
                android.os.IBinder r1 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r1)
                android.os.IBinder r2 = r10.readStrongBinder()
                int r3 = r10.readInt()
                java.lang.String[] r4 = r10.createStringArray()
                int r5 = r10.readInt()
                if (r5 == 0) goto L_0x141d
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x141d:
                r5 = r0
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x1426
                r6 = r12
                goto L_0x1427
            L_0x1426:
                r6 = r7
            L_0x1427:
                long r7 = r10.readLong()
                r0 = r9
                r0.mo13612a((com.google.android.gms.games.internal.IGamesCallbacks) r1, (android.os.IBinder) r2, (int) r3, (java.lang.String[]) r4, (android.os.Bundle) r5, (boolean) r6, (long) r7)
                r16.writeNoException()
                return r12
            L_0x1433:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                int r1 = r10.readInt()
                r9.mo13762p((java.lang.String) r0, (int) r1)
                r16.writeNoException()
                return r12
            L_0x1447:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                int r1 = r10.readInt()
                r9.mo13765q((java.lang.String) r0, (int) r1)
                r16.writeNoException()
                return r12
            L_0x145b:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                r9.mo13706e(r0)
                r16.writeNoException()
                return r12
            L_0x146f:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                r9.mo13696d(r0)
                r16.writeNoException()
                return r12
            L_0x1483:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r1)
                android.os.IBinder r1 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r1)
                java.lang.String r2 = r10.readString()
                int r3 = r10.readInt()
                android.os.IBinder r4 = r10.readStrongBinder()
                int r5 = r10.readInt()
                if (r5 == 0) goto L_0x14aa
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x14aa:
                r5 = r0
                r0 = r9
                r0.mo13617a((com.google.android.gms.games.internal.IGamesCallbacks) r1, (java.lang.String) r2, (int) r3, (android.os.IBinder) r4, (android.os.Bundle) r5)
                r16.writeNoException()
                return r12
            L_0x14b3:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r1)
                android.os.IBinder r1 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r1)
                java.lang.String r2 = r10.readString()
                android.os.IBinder r3 = r10.readStrongBinder()
                int r4 = r10.readInt()
                if (r4 == 0) goto L_0x14d6
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x14d6:
                r9.mo13663b((com.google.android.gms.games.internal.IGamesCallbacks) r1, (java.lang.String) r2, (android.os.IBinder) r3, (android.os.Bundle) r0)
                r16.writeNoException()
                return r12
            L_0x14dd:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r1)
                android.os.IBinder r1 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r1)
                java.lang.String r2 = r10.readString()
                android.os.IBinder r3 = r10.readStrongBinder()
                int r4 = r10.readInt()
                if (r4 == 0) goto L_0x1500
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x1500:
                r9.mo13624a((com.google.android.gms.games.internal.IGamesCallbacks) r1, (java.lang.String) r2, (android.os.IBinder) r3, (android.os.Bundle) r0)
                r16.writeNoException()
                return r12
            L_0x1507:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                r9.mo13682c(r0)
                r16.writeNoException()
                return r12
            L_0x151b:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r1)
                android.os.IBinder r1 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r1)
                int r2 = r10.readInt()
                if (r2 == 0) goto L_0x1536
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x1536:
                int r2 = r10.readInt()
                int r3 = r10.readInt()
                r9.mo13611a((com.google.android.gms.games.internal.IGamesCallbacks) r1, (android.os.Bundle) r0, (int) r2, (int) r3)
                r16.writeNoException()
                return r12
            L_0x1545:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r2 = r10.readString()
                int r3 = r10.readInt()
                int r4 = r10.readInt()
                int r5 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x156a
                r6 = r12
                goto L_0x156b
            L_0x156a:
                r6 = r7
            L_0x156b:
                r0 = r9
                r0.mo13659b((com.google.android.gms.games.internal.IGamesCallbacks) r1, (java.lang.String) r2, (int) r3, (int) r4, (int) r5, (boolean) r6)
                r16.writeNoException()
                return r12
            L_0x1573:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r2 = r10.readString()
                int r3 = r10.readInt()
                int r4 = r10.readInt()
                int r5 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x1598
                r6 = r12
                goto L_0x1599
            L_0x1598:
                r6 = r7
            L_0x1599:
                r0 = r9
                r0.mo13616a((com.google.android.gms.games.internal.IGamesCallbacks) r1, (java.lang.String) r2, (int) r3, (int) r4, (int) r5, (boolean) r6)
                r16.writeNoException()
                return r12
            L_0x15a1:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                r9.mo13657b((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1)
                r16.writeNoException()
                return r12
            L_0x15b9:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                r9.mo13653b((com.google.android.gms.games.internal.IGamesCallbacks) r0)
                r16.writeNoException()
                return r12
            L_0x15cd:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                long r2 = r10.readLong()
                r9.mo13622a((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1, (long) r2)
                r16.writeNoException()
                return r12
            L_0x15e9:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                int r1 = r10.readInt()
                int r2 = r10.readInt()
                if (r2 == 0) goto L_0x1602
                r2 = r12
                goto L_0x1603
            L_0x1602:
                r2 = r7
            L_0x1603:
                int r3 = r10.readInt()
                if (r3 == 0) goto L_0x160a
                r7 = r12
            L_0x160a:
                r9.mo13607a((com.google.android.gms.games.internal.IGamesCallbacks) r0, (int) r1, (boolean) r2, (boolean) r7)
                r16.writeNoException()
                return r12
            L_0x1611:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                java.lang.String r1 = r10.readString()
                r9.mo13614a((com.google.android.gms.games.internal.IGamesCallbacks) r0, (java.lang.String) r1)
                r16.writeNoException()
                return r12
            L_0x1629:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                com.google.android.gms.common.data.DataHolder r0 = r9.mo13737lG()
                r16.writeNoException()
                if (r0 == 0) goto L_0x163e
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x163e:
                r11.writeInt(r7)
                return r12
            L_0x1642:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r9.mo13745li()
                r16.writeNoException()
                r11.writeString(r0)
                return r12
            L_0x1652:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r9.mo13744lh()
                r16.writeNoException()
                r11.writeString(r0)
                return r12
            L_0x1662:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                r9.mo13736lE()
                r16.writeNoException()
                return r12
            L_0x166e:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r1)
                android.os.IBinder r1 = r10.readStrongBinder()
                int r2 = r10.readInt()
                if (r2 == 0) goto L_0x1685
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x1685:
                r9.mo13599a((android.os.IBinder) r1, (android.os.Bundle) r0)
                r16.writeNoException()
                return r12
            L_0x168c:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.Bundle r0 = r9.mo13719fX()
                r16.writeNoException()
                if (r0 == 0) goto L_0x16a1
                r11.writeInt(r12)
                r0.writeToParcel(r11, r12)
                return r12
            L_0x16a1:
                r11.writeInt(r7)
                return r12
            L_0x16a5:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r9.mo13753lw()
                r16.writeNoException()
                r11.writeString(r0)
                return r12
            L_0x16b5:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.games.internal.IGamesCallbacks r0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.m2637aD(r0)
                r9.mo13601a((com.google.android.gms.games.internal.IGamesCallbacks) r0)
                r16.writeNoException()
                return r12
            L_0x16c9:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r10.enforceInterface(r0)
                long r0 = r10.readLong()
                r9.mo13763q(r0)
                r16.writeNoException()
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.games.internal.IGamesService.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: O */
    void mo13585O(boolean z) throws RemoteException;

    /* renamed from: P */
    void mo13586P(boolean z) throws RemoteException;

    /* renamed from: Q */
    void mo13587Q(boolean z) throws RemoteException;

    /* renamed from: a */
    int mo13588a(IGamesCallbacks iGamesCallbacks, byte[] bArr, String str, String str2) throws RemoteException;

    /* renamed from: a */
    Intent mo13589a(int i, int i2, boolean z) throws RemoteException;

    /* renamed from: a */
    Intent mo13590a(int i, byte[] bArr, int i2, String str) throws RemoteException;

    /* renamed from: a */
    Intent mo13591a(AchievementEntity achievementEntity) throws RemoteException;

    /* renamed from: a */
    Intent mo13592a(ZInvitationCluster zInvitationCluster, String str, String str2) throws RemoteException;

    /* renamed from: a */
    Intent mo13593a(GameRequestCluster gameRequestCluster, String str) throws RemoteException;

    /* renamed from: a */
    Intent mo13594a(RoomEntity roomEntity, int i) throws RemoteException;

    /* renamed from: a */
    Intent mo13595a(String str, boolean z, boolean z2, int i) throws RemoteException;

    /* renamed from: a */
    Intent mo13596a(ParticipantEntity[] participantEntityArr, String str, String str2, Uri uri, Uri uri2) throws RemoteException;

    /* renamed from: a */
    Intent mo13597a(ParticipantEntity[] participantEntityArr, String str, String str2, Uri uri, Uri uri2, String str3) throws RemoteException;

    /* renamed from: a */
    void mo13598a(long j, String str) throws RemoteException;

    /* renamed from: a */
    void mo13599a(IBinder iBinder, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo13600a(Contents contents) throws RemoteException;

    /* renamed from: a */
    void mo13601a(IGamesCallbacks iGamesCallbacks) throws RemoteException;

    /* renamed from: a */
    void mo13602a(IGamesCallbacks iGamesCallbacks, int i) throws RemoteException;

    /* renamed from: a */
    void mo13603a(IGamesCallbacks iGamesCallbacks, int i, int i2, int i3) throws RemoteException;

    /* renamed from: a */
    void mo13604a(IGamesCallbacks iGamesCallbacks, int i, int i2, boolean z, boolean z2) throws RemoteException;

    /* renamed from: a */
    void mo13605a(IGamesCallbacks iGamesCallbacks, int i, int i2, String[] strArr, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo13606a(IGamesCallbacks iGamesCallbacks, int i, String str, String[] strArr, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo13607a(IGamesCallbacks iGamesCallbacks, int i, boolean z, boolean z2) throws RemoteException;

    /* renamed from: a */
    void mo13608a(IGamesCallbacks iGamesCallbacks, int i, int[] iArr) throws RemoteException;

    /* renamed from: a */
    void mo13609a(IGamesCallbacks iGamesCallbacks, long j) throws RemoteException;

    /* renamed from: a */
    void mo13610a(IGamesCallbacks iGamesCallbacks, long j, String str) throws RemoteException;

    /* renamed from: a */
    void mo13611a(IGamesCallbacks iGamesCallbacks, Bundle bundle, int i, int i2) throws RemoteException;

    /* renamed from: a */
    void mo13612a(IGamesCallbacks iGamesCallbacks, IBinder iBinder, int i, String[] strArr, Bundle bundle, boolean z, long j) throws RemoteException;

    /* renamed from: a */
    void mo13613a(IGamesCallbacks iGamesCallbacks, IBinder iBinder, String str, boolean z, long j) throws RemoteException;

    /* renamed from: a */
    void mo13614a(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException;

    /* renamed from: a */
    void mo13615a(IGamesCallbacks iGamesCallbacks, String str, int i) throws RemoteException;

    /* renamed from: a */
    void mo13616a(IGamesCallbacks iGamesCallbacks, String str, int i, int i2, int i3, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo13617a(IGamesCallbacks iGamesCallbacks, String str, int i, IBinder iBinder, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo13618a(IGamesCallbacks iGamesCallbacks, String str, int i, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo13619a(IGamesCallbacks iGamesCallbacks, String str, int i, boolean z, boolean z2) throws RemoteException;

    /* renamed from: a */
    void mo13620a(IGamesCallbacks iGamesCallbacks, String str, int i, boolean z, boolean z2, boolean z3, boolean z4) throws RemoteException;

    /* renamed from: a */
    void mo13621a(IGamesCallbacks iGamesCallbacks, String str, int i, int[] iArr) throws RemoteException;

    /* renamed from: a */
    void mo13622a(IGamesCallbacks iGamesCallbacks, String str, long j) throws RemoteException;

    /* renamed from: a */
    void mo13623a(IGamesCallbacks iGamesCallbacks, String str, long j, String str2) throws RemoteException;

    /* renamed from: a */
    void mo13624a(IGamesCallbacks iGamesCallbacks, String str, IBinder iBinder, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo13625a(IGamesCallbacks iGamesCallbacks, String str, SnapshotMetadataChangeEntity snapshotMetadataChangeEntity, Contents contents) throws RemoteException;

    /* renamed from: a */
    void mo13626a(IGamesCallbacks iGamesCallbacks, String str, String str2) throws RemoteException;

    /* renamed from: a */
    void mo13627a(IGamesCallbacks iGamesCallbacks, String str, String str2, int i, int i2) throws RemoteException;

    /* renamed from: a */
    void mo13628a(IGamesCallbacks iGamesCallbacks, String str, String str2, int i, int i2, int i3) throws RemoteException;

    /* renamed from: a */
    void mo13629a(IGamesCallbacks iGamesCallbacks, String str, String str2, int i, int i2, int i3, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo13630a(IGamesCallbacks iGamesCallbacks, String str, String str2, int i, boolean z, boolean z2) throws RemoteException;

    /* renamed from: a */
    void mo13631a(IGamesCallbacks iGamesCallbacks, String str, String str2, SnapshotMetadataChangeEntity snapshotMetadataChangeEntity, Contents contents) throws RemoteException;

    /* renamed from: a */
    void mo13632a(IGamesCallbacks iGamesCallbacks, String str, String str2, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo13633a(IGamesCallbacks iGamesCallbacks, String str, String str2, int[] iArr, int i, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo13634a(IGamesCallbacks iGamesCallbacks, String str, String str2, String[] strArr) throws RemoteException;

    /* renamed from: a */
    void mo13635a(IGamesCallbacks iGamesCallbacks, String str, String str2, String[] strArr, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo13636a(IGamesCallbacks iGamesCallbacks, String str, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo13637a(IGamesCallbacks iGamesCallbacks, String str, byte[] bArr, String str2, ParticipantResult[] participantResultArr) throws RemoteException;

    /* renamed from: a */
    void mo13638a(IGamesCallbacks iGamesCallbacks, String str, byte[] bArr, ParticipantResult[] participantResultArr) throws RemoteException;

    /* renamed from: a */
    void mo13639a(IGamesCallbacks iGamesCallbacks, String str, int[] iArr) throws RemoteException;

    /* renamed from: a */
    void mo13640a(IGamesCallbacks iGamesCallbacks, String str, String[] strArr, int i, byte[] bArr, int i2) throws RemoteException;

    /* renamed from: a */
    void mo13641a(IGamesCallbacks iGamesCallbacks, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo13642a(IGamesCallbacks iGamesCallbacks, boolean z, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo13643a(IGamesCallbacks iGamesCallbacks, boolean z, String[] strArr) throws RemoteException;

    /* renamed from: a */
    void mo13644a(IGamesCallbacks iGamesCallbacks, int[] iArr) throws RemoteException;

    /* renamed from: a */
    void mo13645a(IGamesCallbacks iGamesCallbacks, int[] iArr, int i, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo13646a(IGamesCallbacks iGamesCallbacks, String[] strArr) throws RemoteException;

    /* renamed from: a */
    void mo13647a(IGamesCallbacks iGamesCallbacks, String[] strArr, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo13648a(String str, IBinder iBinder, Bundle bundle) throws RemoteException;

    /* renamed from: b */
    int mo13649b(byte[] bArr, String str, String[] strArr) throws RemoteException;

    /* renamed from: b */
    Intent mo13650b(int i, int i2, boolean z) throws RemoteException;

    /* renamed from: b */
    Intent mo13651b(int[] iArr) throws RemoteException;

    /* renamed from: b */
    void mo13652b(long j, String str) throws RemoteException;

    /* renamed from: b */
    void mo13653b(IGamesCallbacks iGamesCallbacks) throws RemoteException;

    /* renamed from: b */
    void mo13654b(IGamesCallbacks iGamesCallbacks, int i, boolean z, boolean z2) throws RemoteException;

    /* renamed from: b */
    void mo13655b(IGamesCallbacks iGamesCallbacks, long j) throws RemoteException;

    /* renamed from: b */
    void mo13656b(IGamesCallbacks iGamesCallbacks, long j, String str) throws RemoteException;

    /* renamed from: b */
    void mo13657b(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException;

    /* renamed from: b */
    void mo13658b(IGamesCallbacks iGamesCallbacks, String str, int i) throws RemoteException;

    /* renamed from: b */
    void mo13659b(IGamesCallbacks iGamesCallbacks, String str, int i, int i2, int i3, boolean z) throws RemoteException;

    /* renamed from: b */
    void mo13660b(IGamesCallbacks iGamesCallbacks, String str, int i, IBinder iBinder, Bundle bundle) throws RemoteException;

    /* renamed from: b */
    void mo13661b(IGamesCallbacks iGamesCallbacks, String str, int i, boolean z) throws RemoteException;

    /* renamed from: b */
    void mo13662b(IGamesCallbacks iGamesCallbacks, String str, int i, boolean z, boolean z2) throws RemoteException;

    /* renamed from: b */
    void mo13663b(IGamesCallbacks iGamesCallbacks, String str, IBinder iBinder, Bundle bundle) throws RemoteException;

    /* renamed from: b */
    void mo13664b(IGamesCallbacks iGamesCallbacks, String str, String str2) throws RemoteException;

    /* renamed from: b */
    void mo13665b(IGamesCallbacks iGamesCallbacks, String str, String str2, int i, int i2, int i3, boolean z) throws RemoteException;

    /* renamed from: b */
    void mo13666b(IGamesCallbacks iGamesCallbacks, String str, String str2, int i, boolean z, boolean z2) throws RemoteException;

    /* renamed from: b */
    void mo13667b(IGamesCallbacks iGamesCallbacks, String str, String str2, boolean z) throws RemoteException;

    /* renamed from: b */
    void mo13668b(IGamesCallbacks iGamesCallbacks, String str, boolean z) throws RemoteException;

    /* renamed from: b */
    void mo13669b(IGamesCallbacks iGamesCallbacks, boolean z) throws RemoteException;

    /* renamed from: b */
    void mo13670b(IGamesCallbacks iGamesCallbacks, String[] strArr) throws RemoteException;

    /* renamed from: b */
    void mo13671b(String str, String str2, int i) throws RemoteException;

    /* renamed from: bE */
    Intent mo13672bE(String str) throws RemoteException;

    /* renamed from: bG */
    String mo13673bG(String str) throws RemoteException;

    /* renamed from: bH */
    String mo13674bH(String str) throws RemoteException;

    /* renamed from: bI */
    void mo13675bI(String str) throws RemoteException;

    /* renamed from: bJ */
    int mo13676bJ(String str) throws RemoteException;

    /* renamed from: bK */
    Uri mo13677bK(String str) throws RemoteException;

    /* renamed from: bL */
    void mo13678bL(String str) throws RemoteException;

    /* renamed from: bM */
    Intent mo13679bM(String str) throws RemoteException;

    /* renamed from: bN */
    ParcelFileDescriptor mo13680bN(String str) throws RemoteException;

    /* renamed from: c */
    void mo13681c(long j, String str) throws RemoteException;

    /* renamed from: c */
    void mo13682c(IGamesCallbacks iGamesCallbacks) throws RemoteException;

    /* renamed from: c */
    void mo13683c(IGamesCallbacks iGamesCallbacks, int i, boolean z, boolean z2) throws RemoteException;

    /* renamed from: c */
    void mo13684c(IGamesCallbacks iGamesCallbacks, long j) throws RemoteException;

    /* renamed from: c */
    void mo13685c(IGamesCallbacks iGamesCallbacks, long j, String str) throws RemoteException;

    /* renamed from: c */
    void mo13686c(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException;

    /* renamed from: c */
    void mo13687c(IGamesCallbacks iGamesCallbacks, String str, int i) throws RemoteException;

    /* renamed from: c */
    void mo13688c(IGamesCallbacks iGamesCallbacks, String str, int i, boolean z, boolean z2) throws RemoteException;

    /* renamed from: c */
    void mo13689c(IGamesCallbacks iGamesCallbacks, String str, String str2) throws RemoteException;

    /* renamed from: c */
    void mo13690c(IGamesCallbacks iGamesCallbacks, String str, String str2, boolean z) throws RemoteException;

    /* renamed from: c */
    void mo13691c(IGamesCallbacks iGamesCallbacks, String str, boolean z) throws RemoteException;

    /* renamed from: c */
    void mo13692c(IGamesCallbacks iGamesCallbacks, boolean z) throws RemoteException;

    /* renamed from: c */
    void mo13693c(IGamesCallbacks iGamesCallbacks, String[] strArr) throws RemoteException;

    /* renamed from: c */
    void mo13694c(String str, String str2, int i) throws RemoteException;

    /* renamed from: d */
    void mo13695d(long j, String str) throws RemoteException;

    /* renamed from: d */
    void mo13696d(IGamesCallbacks iGamesCallbacks) throws RemoteException;

    /* renamed from: d */
    void mo13697d(IGamesCallbacks iGamesCallbacks, int i, boolean z, boolean z2) throws RemoteException;

    /* renamed from: d */
    void mo13698d(IGamesCallbacks iGamesCallbacks, long j) throws RemoteException;

    /* renamed from: d */
    void mo13699d(IGamesCallbacks iGamesCallbacks, long j, String str) throws RemoteException;

    /* renamed from: d */
    void mo13700d(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException;

    /* renamed from: d */
    void mo13701d(IGamesCallbacks iGamesCallbacks, String str, int i, boolean z, boolean z2) throws RemoteException;

    /* renamed from: d */
    void mo13702d(IGamesCallbacks iGamesCallbacks, String str, String str2) throws RemoteException;

    /* renamed from: d */
    void mo13703d(IGamesCallbacks iGamesCallbacks, String str, boolean z) throws RemoteException;

    /* renamed from: d */
    void mo13704d(IGamesCallbacks iGamesCallbacks, boolean z) throws RemoteException;

    /* renamed from: dT */
    void mo13705dT(int i) throws RemoteException;

    /* renamed from: e */
    void mo13706e(IGamesCallbacks iGamesCallbacks) throws RemoteException;

    /* renamed from: e */
    void mo13707e(IGamesCallbacks iGamesCallbacks, int i, boolean z, boolean z2) throws RemoteException;

    /* renamed from: e */
    void mo13708e(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException;

    /* renamed from: e */
    void mo13709e(IGamesCallbacks iGamesCallbacks, String str, int i, boolean z, boolean z2) throws RemoteException;

    /* renamed from: e */
    void mo13710e(IGamesCallbacks iGamesCallbacks, String str, String str2) throws RemoteException;

    /* renamed from: e */
    void mo13711e(IGamesCallbacks iGamesCallbacks, String str, boolean z) throws RemoteException;

    /* renamed from: e */
    void mo13712e(IGamesCallbacks iGamesCallbacks, boolean z) throws RemoteException;

    /* renamed from: f */
    void mo13713f(IGamesCallbacks iGamesCallbacks) throws RemoteException;

    /* renamed from: f */
    void mo13714f(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException;

    /* renamed from: f */
    void mo13715f(IGamesCallbacks iGamesCallbacks, String str, int i, boolean z, boolean z2) throws RemoteException;

    /* renamed from: f */
    void mo13716f(IGamesCallbacks iGamesCallbacks, String str, String str2) throws RemoteException;

    /* renamed from: f */
    void mo13717f(IGamesCallbacks iGamesCallbacks, String str, boolean z) throws RemoteException;

    /* renamed from: f */
    void mo13718f(IGamesCallbacks iGamesCallbacks, boolean z) throws RemoteException;

    /* renamed from: fX */
    Bundle mo13719fX() throws RemoteException;

    /* renamed from: g */
    void mo13720g(IGamesCallbacks iGamesCallbacks) throws RemoteException;

    /* renamed from: g */
    void mo13721g(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException;

    /* renamed from: g */
    void mo13722g(IGamesCallbacks iGamesCallbacks, boolean z) throws RemoteException;

    /* renamed from: h */
    ParcelFileDescriptor mo13723h(Uri uri) throws RemoteException;

    /* renamed from: h */
    RoomEntity mo13724h(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException;

    /* renamed from: h */
    void mo13725h(IGamesCallbacks iGamesCallbacks) throws RemoteException;

    /* renamed from: h */
    void mo13726h(IGamesCallbacks iGamesCallbacks, boolean z) throws RemoteException;

    /* renamed from: i */
    void mo13727i(IGamesCallbacks iGamesCallbacks) throws RemoteException;

    /* renamed from: i */
    void mo13728i(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException;

    /* renamed from: j */
    void mo13729j(IGamesCallbacks iGamesCallbacks) throws RemoteException;

    /* renamed from: j */
    void mo13730j(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException;

    /* renamed from: k */
    void mo13731k(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException;

    /* renamed from: l */
    void mo13732l(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException;

    /* renamed from: lA */
    int mo13733lA() throws RemoteException;

    /* renamed from: lB */
    int mo13734lB() throws RemoteException;

    /* renamed from: lC */
    int mo13735lC() throws RemoteException;

    /* renamed from: lE */
    void mo13736lE() throws RemoteException;

    /* renamed from: lG */
    DataHolder mo13737lG() throws RemoteException;

    /* renamed from: lH */
    boolean mo13738lH() throws RemoteException;

    /* renamed from: lI */
    DataHolder mo13739lI() throws RemoteException;

    /* renamed from: lJ */
    void mo13740lJ() throws RemoteException;

    /* renamed from: lK */
    Intent mo13741lK() throws RemoteException;

    /* renamed from: lL */
    void mo13742lL() throws RemoteException;

    /* renamed from: lM */
    boolean mo13743lM() throws RemoteException;

    /* renamed from: lh */
    String mo13744lh() throws RemoteException;

    /* renamed from: li */
    String mo13745li() throws RemoteException;

    /* renamed from: ll */
    Intent mo13746ll() throws RemoteException;

    /* renamed from: lm */
    Intent mo13747lm() throws RemoteException;

    /* renamed from: ln */
    Intent mo13748ln() throws RemoteException;

    /* renamed from: lo */
    Intent mo13749lo() throws RemoteException;

    /* renamed from: lt */
    Intent mo13750lt() throws RemoteException;

    /* renamed from: lu */
    Intent mo13751lu() throws RemoteException;

    /* renamed from: lv */
    int mo13752lv() throws RemoteException;

    /* renamed from: lw */
    String mo13753lw() throws RemoteException;

    /* renamed from: lx */
    int mo13754lx() throws RemoteException;

    /* renamed from: ly */
    Intent mo13755ly() throws RemoteException;

    /* renamed from: lz */
    int mo13756lz() throws RemoteException;

    /* renamed from: m */
    void mo13757m(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException;

    /* renamed from: n */
    void mo13758n(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException;

    /* renamed from: o */
    void mo13759o(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException;

    /* renamed from: o */
    void mo13760o(String str, int i) throws RemoteException;

    /* renamed from: p */
    void mo13761p(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException;

    /* renamed from: p */
    void mo13762p(String str, int i) throws RemoteException;

    /* renamed from: q */
    void mo13763q(long j) throws RemoteException;

    /* renamed from: q */
    void mo13764q(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException;

    /* renamed from: q */
    void mo13765q(String str, int i) throws RemoteException;

    /* renamed from: r */
    void mo13766r(long j) throws RemoteException;

    /* renamed from: r */
    void mo13767r(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException;

    /* renamed from: s */
    void mo13768s(long j) throws RemoteException;

    /* renamed from: s */
    void mo13769s(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException;

    /* renamed from: s */
    void mo13770s(String str, int i) throws RemoteException;

    /* renamed from: t */
    void mo13771t(long j) throws RemoteException;

    /* renamed from: t */
    void mo13772t(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException;

    /* renamed from: t */
    void mo13773t(String str, int i) throws RemoteException;

    /* renamed from: t */
    void mo13774t(String str, String str2) throws RemoteException;

    /* renamed from: u */
    Intent mo13775u(String str, int i) throws RemoteException;

    /* renamed from: u */
    void mo13776u(long j) throws RemoteException;

    /* renamed from: u */
    void mo13777u(IGamesCallbacks iGamesCallbacks, String str) throws RemoteException;

    /* renamed from: u */
    void mo13778u(String str, String str2) throws RemoteException;
}

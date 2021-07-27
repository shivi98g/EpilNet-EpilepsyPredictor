package com.google.android.gms.cast;

import com.google.android.gms.cast.Cast;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.C1697im;
import com.google.android.gms.internal.C1715it;
import com.google.android.gms.internal.C1718iu;
import com.google.android.gms.internal.C1719iv;
import java.io.IOException;
import org.json.JSONObject;

public class RemoteMediaPlayer implements Cast.MessageReceivedCallback {
    public static final int RESUME_STATE_PAUSE = 2;
    public static final int RESUME_STATE_PLAY = 1;
    public static final int RESUME_STATE_UNCHANGED = 0;
    public static final int STATUS_CANCELED = 2101;
    public static final int STATUS_FAILED = 2100;
    public static final int STATUS_REPLACED = 2103;
    public static final int STATUS_SUCCEEDED = 0;
    public static final int STATUS_TIMED_OUT = 2102;
    /* access modifiers changed from: private */

    /* renamed from: Gw */
    public final C1715it f543Gw = new C1715it() {
        /* access modifiers changed from: protected */
        public void onMetadataUpdated() {
            RemoteMediaPlayer.this.onMetadataUpdated();
        }

        /* access modifiers changed from: protected */
        public void onStatusUpdated() {
            RemoteMediaPlayer.this.onStatusUpdated();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: Gx */
    public final C0655a f544Gx = new C0655a();

    /* renamed from: Gy */
    private OnMetadataUpdatedListener f545Gy;

    /* renamed from: Gz */
    private OnStatusUpdatedListener f546Gz;
    /* access modifiers changed from: private */

    /* renamed from: mH */
    public final Object f547mH = new Object();

    public interface MediaChannelResult extends Result {
        JSONObject getCustomData();
    }

    public interface OnMetadataUpdatedListener {
        void onMetadataUpdated();
    }

    public interface OnStatusUpdatedListener {
        void onStatusUpdated();
    }

    /* renamed from: com.google.android.gms.cast.RemoteMediaPlayer$a */
    private class C0655a implements C1718iu {

        /* renamed from: GN */
        private GoogleApiClient f587GN;

        /* renamed from: GO */
        private long f588GO = 0;

        /* renamed from: com.google.android.gms.cast.RemoteMediaPlayer$a$a */
        private final class C0656a implements ResultCallback<Status> {

            /* renamed from: GP */
            private final long f589GP;

            C0656a(long j) {
                this.f589GP = j;
            }

            /* renamed from: j */
            public void onResult(Status status) {
                if (!status.isSuccess()) {
                    RemoteMediaPlayer.this.f543Gw.mo15644b(this.f589GP, status.getStatusCode());
                }
            }
        }

        public C0655a() {
        }

        /* renamed from: a */
        public void mo10821a(String str, String str2, long j, String str3) throws IOException {
            if (this.f587GN == null) {
                throw new IOException("No GoogleApiClient available");
            }
            Cast.CastApi.sendMessage(this.f587GN, str, str2).setResultCallback(new C0656a(j));
        }

        /* renamed from: b */
        public void mo10822b(GoogleApiClient googleApiClient) {
            this.f587GN = googleApiClient;
        }

        /* renamed from: fS */
        public long mo10823fS() {
            long j = this.f588GO + 1;
            this.f588GO = j;
            return j;
        }
    }

    /* renamed from: com.google.android.gms.cast.RemoteMediaPlayer$b */
    private static abstract class C0657b extends Cast.C0639a<MediaChannelResult> {

        /* renamed from: GR */
        C1719iv f591GR = new C1719iv() {
            /* renamed from: a */
            public void mo10827a(long j, int i, JSONObject jSONObject) {
                C0657b.this.mo10914b(new C0660c(new Status(i), jSONObject));
            }

            /* renamed from: n */
            public void mo10828n(long j) {
                C0657b.this.mo10914b(C0657b.this.mo10544c(new Status(RemoteMediaPlayer.STATUS_REPLACED)));
            }
        };

        C0657b(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: k */
        public MediaChannelResult mo10544c(final Status status) {
            return new MediaChannelResult() {
                public JSONObject getCustomData() {
                    return null;
                }

                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.cast.RemoteMediaPlayer$c */
    private static final class C0660c implements MediaChannelResult {

        /* renamed from: Eb */
        private final Status f595Eb;

        /* renamed from: Ga */
        private final JSONObject f596Ga;

        C0660c(Status status, JSONObject jSONObject) {
            this.f595Eb = status;
            this.f596Ga = jSONObject;
        }

        public JSONObject getCustomData() {
            return this.f596Ga;
        }

        public Status getStatus() {
            return this.f595Eb;
        }
    }

    public RemoteMediaPlayer() {
        this.f543Gw.mo15641a(this.f544Gx);
    }

    /* access modifiers changed from: private */
    public void onMetadataUpdated() {
        if (this.f545Gy != null) {
            this.f545Gy.onMetadataUpdated();
        }
    }

    /* access modifiers changed from: private */
    public void onStatusUpdated() {
        if (this.f546Gz != null) {
            this.f546Gz.onStatusUpdated();
        }
    }

    public long getApproximateStreamPosition() {
        long approximateStreamPosition;
        synchronized (this.f547mH) {
            approximateStreamPosition = this.f543Gw.getApproximateStreamPosition();
        }
        return approximateStreamPosition;
    }

    public MediaInfo getMediaInfo() {
        MediaInfo mediaInfo;
        synchronized (this.f547mH) {
            mediaInfo = this.f543Gw.getMediaInfo();
        }
        return mediaInfo;
    }

    public MediaStatus getMediaStatus() {
        MediaStatus mediaStatus;
        synchronized (this.f547mH) {
            mediaStatus = this.f543Gw.getMediaStatus();
        }
        return mediaStatus;
    }

    public String getNamespace() {
        return this.f543Gw.getNamespace();
    }

    public long getStreamDuration() {
        long streamDuration;
        synchronized (this.f547mH) {
            streamDuration = this.f543Gw.getStreamDuration();
        }
        return streamDuration;
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient googleApiClient, MediaInfo mediaInfo) {
        return load(googleApiClient, mediaInfo, true, 0, (long[]) null, (JSONObject) null);
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient googleApiClient, MediaInfo mediaInfo, boolean z) {
        return load(googleApiClient, mediaInfo, z, 0, (long[]) null, (JSONObject) null);
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient googleApiClient, MediaInfo mediaInfo, boolean z, long j) {
        return load(googleApiClient, mediaInfo, z, j, (long[]) null, (JSONObject) null);
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient googleApiClient, MediaInfo mediaInfo, boolean z, long j, JSONObject jSONObject) {
        return load(googleApiClient, mediaInfo, z, j, (long[]) null, jSONObject);
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient googleApiClient, MediaInfo mediaInfo, boolean z, long j, long[] jArr, JSONObject jSONObject) {
        final GoogleApiClient googleApiClient2 = googleApiClient;
        final MediaInfo mediaInfo2 = mediaInfo;
        final boolean z2 = z;
        final long j2 = j;
        final long[] jArr2 = jArr;
        final JSONObject jSONObject2 = jSONObject;
        return googleApiClient.mo10940b(new C0657b(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1697im imVar) {
                C0655a d;
                synchronized (RemoteMediaPlayer.this.f547mH) {
                    RemoteMediaPlayer.this.f544Gx.mo10822b(googleApiClient2);
                    try {
                        RemoteMediaPlayer.this.f543Gw.mo15726a(this.f591GR, mediaInfo2, z2, j2, jArr2, jSONObject2);
                        d = RemoteMediaPlayer.this.f544Gx;
                    } catch (IOException e) {
                        try {
                            mo10914b(mo10544c(new Status(RemoteMediaPlayer.STATUS_FAILED)));
                            d = RemoteMediaPlayer.this.f544Gx;
                        } catch (Throwable th) {
                            RemoteMediaPlayer.this.f544Gx.mo10822b((GoogleApiClient) null);
                            throw th;
                        }
                    }
                    d.mo10822b((GoogleApiClient) null);
                }
            }
        });
    }

    public void onMessageReceived(CastDevice castDevice, String str, String str2) {
        this.f543Gw.mo15643aD(str2);
    }

    public PendingResult<MediaChannelResult> pause(GoogleApiClient googleApiClient) {
        return pause(googleApiClient, (JSONObject) null);
    }

    public PendingResult<MediaChannelResult> pause(final GoogleApiClient googleApiClient, final JSONObject jSONObject) {
        return googleApiClient.mo10940b(new C0657b(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1697im imVar) {
                C0655a d;
                synchronized (RemoteMediaPlayer.this.f547mH) {
                    RemoteMediaPlayer.this.f544Gx.mo10822b(googleApiClient);
                    try {
                        RemoteMediaPlayer.this.f543Gw.mo15728a(this.f591GR, jSONObject);
                        d = RemoteMediaPlayer.this.f544Gx;
                    } catch (IOException e) {
                        try {
                            mo10914b(mo10544c(new Status(RemoteMediaPlayer.STATUS_FAILED)));
                            d = RemoteMediaPlayer.this.f544Gx;
                        } catch (Throwable th) {
                            RemoteMediaPlayer.this.f544Gx.mo10822b((GoogleApiClient) null);
                            throw th;
                        }
                    }
                    d.mo10822b((GoogleApiClient) null);
                }
            }
        });
    }

    public PendingResult<MediaChannelResult> play(GoogleApiClient googleApiClient) {
        return play(googleApiClient, (JSONObject) null);
    }

    public PendingResult<MediaChannelResult> play(final GoogleApiClient googleApiClient, final JSONObject jSONObject) {
        return googleApiClient.mo10940b(new C0657b(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1697im imVar) {
                C0655a d;
                synchronized (RemoteMediaPlayer.this.f547mH) {
                    RemoteMediaPlayer.this.f544Gx.mo10822b(googleApiClient);
                    try {
                        RemoteMediaPlayer.this.f543Gw.mo15732c(this.f591GR, jSONObject);
                        d = RemoteMediaPlayer.this.f544Gx;
                    } catch (IOException e) {
                        try {
                            mo10914b(mo10544c(new Status(RemoteMediaPlayer.STATUS_FAILED)));
                            d = RemoteMediaPlayer.this.f544Gx;
                        } catch (Throwable th) {
                            RemoteMediaPlayer.this.f544Gx.mo10822b((GoogleApiClient) null);
                            throw th;
                        }
                    }
                    d.mo10822b((GoogleApiClient) null);
                }
            }
        });
    }

    public PendingResult<MediaChannelResult> requestStatus(final GoogleApiClient googleApiClient) {
        return googleApiClient.mo10940b(new C0657b(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1697im imVar) {
                C0655a d;
                synchronized (RemoteMediaPlayer.this.f547mH) {
                    RemoteMediaPlayer.this.f544Gx.mo10822b(googleApiClient);
                    try {
                        RemoteMediaPlayer.this.f543Gw.mo15723a(this.f591GR);
                        d = RemoteMediaPlayer.this.f544Gx;
                    } catch (IOException e) {
                        try {
                            mo10914b(mo10544c(new Status(RemoteMediaPlayer.STATUS_FAILED)));
                            d = RemoteMediaPlayer.this.f544Gx;
                        } catch (Throwable th) {
                            RemoteMediaPlayer.this.f544Gx.mo10822b((GoogleApiClient) null);
                            throw th;
                        }
                    }
                    d.mo10822b((GoogleApiClient) null);
                }
            }
        });
    }

    public PendingResult<MediaChannelResult> seek(GoogleApiClient googleApiClient, long j) {
        return seek(googleApiClient, j, 0, (JSONObject) null);
    }

    public PendingResult<MediaChannelResult> seek(GoogleApiClient googleApiClient, long j, int i) {
        return seek(googleApiClient, j, i, (JSONObject) null);
    }

    public PendingResult<MediaChannelResult> seek(GoogleApiClient googleApiClient, long j, int i, JSONObject jSONObject) {
        final GoogleApiClient googleApiClient2 = googleApiClient;
        final long j2 = j;
        final int i2 = i;
        final JSONObject jSONObject2 = jSONObject;
        return googleApiClient.mo10940b(new C0657b(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1697im imVar) {
                C0655a d;
                synchronized (RemoteMediaPlayer.this.f547mH) {
                    RemoteMediaPlayer.this.f544Gx.mo10822b(googleApiClient2);
                    try {
                        RemoteMediaPlayer.this.f543Gw.mo15725a(this.f591GR, j2, i2, jSONObject2);
                        d = RemoteMediaPlayer.this.f544Gx;
                    } catch (IOException e) {
                        try {
                            mo10914b(mo10544c(new Status(RemoteMediaPlayer.STATUS_FAILED)));
                            d = RemoteMediaPlayer.this.f544Gx;
                        } catch (Throwable th) {
                            RemoteMediaPlayer.this.f544Gx.mo10822b((GoogleApiClient) null);
                            throw th;
                        }
                    }
                    d.mo10822b((GoogleApiClient) null);
                }
            }
        });
    }

    public PendingResult<MediaChannelResult> setActiveMediaTracks(final GoogleApiClient googleApiClient, final long[] jArr) {
        if (jArr != null && jArr.length != 0) {
            return googleApiClient.mo10940b(new C0657b(googleApiClient) {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo10540a(C1697im imVar) {
                    C0655a d;
                    synchronized (RemoteMediaPlayer.this.f547mH) {
                        RemoteMediaPlayer.this.f544Gx.mo10822b(googleApiClient);
                        try {
                            RemoteMediaPlayer.this.f543Gw.mo15730a(this.f591GR, jArr);
                            d = RemoteMediaPlayer.this.f544Gx;
                        } catch (IOException e) {
                            try {
                                mo10914b(mo10544c(new Status(RemoteMediaPlayer.STATUS_FAILED)));
                                d = RemoteMediaPlayer.this.f544Gx;
                            } catch (Throwable th) {
                                RemoteMediaPlayer.this.f544Gx.mo10822b((GoogleApiClient) null);
                                throw th;
                            }
                        }
                        d.mo10822b((GoogleApiClient) null);
                    }
                }
            });
        }
        throw new IllegalArgumentException("trackIds cannot be null or empty");
    }

    public void setOnMetadataUpdatedListener(OnMetadataUpdatedListener onMetadataUpdatedListener) {
        this.f545Gy = onMetadataUpdatedListener;
    }

    public void setOnStatusUpdatedListener(OnStatusUpdatedListener onStatusUpdatedListener) {
        this.f546Gz = onStatusUpdatedListener;
    }

    public PendingResult<MediaChannelResult> setStreamMute(GoogleApiClient googleApiClient, boolean z) {
        return setStreamMute(googleApiClient, z, (JSONObject) null);
    }

    public PendingResult<MediaChannelResult> setStreamMute(GoogleApiClient googleApiClient, boolean z, JSONObject jSONObject) {
        final GoogleApiClient googleApiClient2 = googleApiClient;
        final boolean z2 = z;
        final JSONObject jSONObject2 = jSONObject;
        return googleApiClient.mo10940b(new C0657b(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1697im imVar) {
                C0655a d;
                synchronized (RemoteMediaPlayer.this.f547mH) {
                    RemoteMediaPlayer.this.f544Gx.mo10822b(googleApiClient2);
                    try {
                        RemoteMediaPlayer.this.f543Gw.mo15729a(this.f591GR, z2, jSONObject2);
                        d = RemoteMediaPlayer.this.f544Gx;
                    } catch (IllegalStateException e) {
                        mo10914b(mo10544c(new Status(RemoteMediaPlayer.STATUS_FAILED)));
                        d = RemoteMediaPlayer.this.f544Gx;
                    } catch (IOException e2) {
                        try {
                            mo10914b(mo10544c(new Status(RemoteMediaPlayer.STATUS_FAILED)));
                            d = RemoteMediaPlayer.this.f544Gx;
                        } catch (Throwable th) {
                            RemoteMediaPlayer.this.f544Gx.mo10822b((GoogleApiClient) null);
                            throw th;
                        }
                    }
                    d.mo10822b((GoogleApiClient) null);
                }
            }
        });
    }

    public PendingResult<MediaChannelResult> setStreamVolume(GoogleApiClient googleApiClient, double d) throws IllegalArgumentException {
        return setStreamVolume(googleApiClient, d, (JSONObject) null);
    }

    public PendingResult<MediaChannelResult> setStreamVolume(GoogleApiClient googleApiClient, double d, JSONObject jSONObject) throws IllegalArgumentException {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Volume cannot be " + d);
        }
        final GoogleApiClient googleApiClient2 = googleApiClient;
        final double d2 = d;
        final JSONObject jSONObject2 = jSONObject;
        return googleApiClient.mo10940b(new C0657b(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1697im imVar) {
                C0655a d;
                synchronized (RemoteMediaPlayer.this.f547mH) {
                    RemoteMediaPlayer.this.f544Gx.mo10822b(googleApiClient2);
                    try {
                        RemoteMediaPlayer.this.f543Gw.mo15724a(this.f591GR, d2, jSONObject2);
                        d = RemoteMediaPlayer.this.f544Gx;
                    } catch (IllegalStateException e) {
                        mo10914b(mo10544c(new Status(RemoteMediaPlayer.STATUS_FAILED)));
                        d = RemoteMediaPlayer.this.f544Gx;
                    } catch (IllegalArgumentException e2) {
                        mo10914b(mo10544c(new Status(RemoteMediaPlayer.STATUS_FAILED)));
                        d = RemoteMediaPlayer.this.f544Gx;
                    } catch (IOException e3) {
                        try {
                            mo10914b(mo10544c(new Status(RemoteMediaPlayer.STATUS_FAILED)));
                            d = RemoteMediaPlayer.this.f544Gx;
                        } catch (Throwable th) {
                            RemoteMediaPlayer.this.f544Gx.mo10822b((GoogleApiClient) null);
                            throw th;
                        }
                    }
                    d.mo10822b((GoogleApiClient) null);
                }
            }
        });
    }

    public PendingResult<MediaChannelResult> setTextTrackStyle(final GoogleApiClient googleApiClient, final TextTrackStyle textTrackStyle) {
        if (textTrackStyle != null) {
            return googleApiClient.mo10940b(new C0657b(googleApiClient) {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo10540a(C1697im imVar) {
                    C0655a d;
                    synchronized (RemoteMediaPlayer.this.f547mH) {
                        RemoteMediaPlayer.this.f544Gx.mo10822b(googleApiClient);
                        try {
                            RemoteMediaPlayer.this.f543Gw.mo15727a(this.f591GR, textTrackStyle);
                            d = RemoteMediaPlayer.this.f544Gx;
                        } catch (IOException e) {
                            try {
                                mo10914b(mo10544c(new Status(RemoteMediaPlayer.STATUS_FAILED)));
                                d = RemoteMediaPlayer.this.f544Gx;
                            } catch (Throwable th) {
                                RemoteMediaPlayer.this.f544Gx.mo10822b((GoogleApiClient) null);
                                throw th;
                            }
                        }
                        d.mo10822b((GoogleApiClient) null);
                    }
                }
            });
        }
        throw new IllegalArgumentException("trackStyle cannot be null");
    }

    public PendingResult<MediaChannelResult> stop(GoogleApiClient googleApiClient) {
        return stop(googleApiClient, (JSONObject) null);
    }

    public PendingResult<MediaChannelResult> stop(final GoogleApiClient googleApiClient, final JSONObject jSONObject) {
        return googleApiClient.mo10940b(new C0657b(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1697im imVar) {
                C0655a d;
                synchronized (RemoteMediaPlayer.this.f547mH) {
                    RemoteMediaPlayer.this.f544Gx.mo10822b(googleApiClient);
                    try {
                        RemoteMediaPlayer.this.f543Gw.mo15731b(this.f591GR, jSONObject);
                        d = RemoteMediaPlayer.this.f544Gx;
                    } catch (IOException e) {
                        try {
                            mo10914b(mo10544c(new Status(RemoteMediaPlayer.STATUS_FAILED)));
                            d = RemoteMediaPlayer.this.f544Gx;
                        } catch (Throwable th) {
                            RemoteMediaPlayer.this.f544Gx.mo10822b((GoogleApiClient) null);
                            throw th;
                        }
                    }
                    d.mo10822b((GoogleApiClient) null);
                }
            }
        });
    }
}

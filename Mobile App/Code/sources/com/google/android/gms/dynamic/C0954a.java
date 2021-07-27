package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.LifecycleDelegate;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.dynamic.a */
public abstract class C0954a<T extends LifecycleDelegate> {
    /* access modifiers changed from: private */

    /* renamed from: Tu */
    public T f1293Tu;
    /* access modifiers changed from: private */

    /* renamed from: Tv */
    public Bundle f1294Tv;
    /* access modifiers changed from: private */

    /* renamed from: Tw */
    public LinkedList<C0962a> f1295Tw;

    /* renamed from: Tx */
    private final C0971f<T> f1296Tx = new C0971f<T>() {
        /* renamed from: a */
        public void mo12155a(T t) {
            LifecycleDelegate unused = C0954a.this.f1293Tu = t;
            Iterator it = C0954a.this.f1295Tw.iterator();
            while (it.hasNext()) {
                ((C0962a) it.next()).mo12156b(C0954a.this.f1293Tu);
            }
            C0954a.this.f1295Tw.clear();
            Bundle unused2 = C0954a.this.f1294Tv = null;
        }
    };

    /* renamed from: com.google.android.gms.dynamic.a$a */
    private interface C0962a {
        /* renamed from: b */
        void mo12156b(LifecycleDelegate lifecycleDelegate);

        int getState();
    }

    /* renamed from: a */
    private void m1577a(Bundle bundle, C0962a aVar) {
        if (this.f1293Tu != null) {
            aVar.mo12156b(this.f1293Tu);
            return;
        }
        if (this.f1295Tw == null) {
            this.f1295Tw = new LinkedList<>();
        }
        this.f1295Tw.add(aVar);
        if (bundle != null) {
            if (this.f1294Tv == null) {
                this.f1294Tv = (Bundle) bundle.clone();
            } else {
                this.f1294Tv.putAll(bundle);
            }
        }
        mo12142a(this.f1296Tx);
    }

    /* renamed from: b */
    public static void m1579b(FrameLayout frameLayout) {
        final Context context = frameLayout.getContext();
        final int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        String b = GooglePlayServicesUtil.m486b(context, isGooglePlayServicesAvailable);
        String c = GooglePlayServicesUtil.m491c(context, isGooglePlayServicesAvailable);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(b);
        linearLayout.addView(textView);
        if (c != null) {
            Button button = new Button(context);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(c);
            linearLayout.addView(button);
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    context.startActivity(GooglePlayServicesUtil.m484aj(isGooglePlayServicesAvailable));
                }
            });
        }
    }

    /* renamed from: cG */
    private void m1580cG(int i) {
        while (!this.f1295Tw.isEmpty() && this.f1295Tw.getLast().getState() >= i) {
            this.f1295Tw.removeLast();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12141a(FrameLayout frameLayout) {
        m1579b(frameLayout);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo12142a(C0971f<T> fVar);

    /* renamed from: je */
    public T mo12143je() {
        return this.f1293Tu;
    }

    public void onCreate(final Bundle bundle) {
        m1577a(bundle, (C0962a) new C0962a() {
            /* renamed from: b */
            public void mo12156b(LifecycleDelegate lifecycleDelegate) {
                C0954a.this.f1293Tu.onCreate(bundle);
            }

            public int getState() {
                return 1;
            }
        });
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        final FrameLayout frameLayout2 = frameLayout;
        final LayoutInflater layoutInflater2 = layoutInflater;
        final ViewGroup viewGroup2 = viewGroup;
        final Bundle bundle2 = bundle;
        m1577a(bundle, (C0962a) new C0962a() {
            /* renamed from: b */
            public void mo12156b(LifecycleDelegate lifecycleDelegate) {
                frameLayout2.removeAllViews();
                frameLayout2.addView(C0954a.this.f1293Tu.onCreateView(layoutInflater2, viewGroup2, bundle2));
            }

            public int getState() {
                return 2;
            }
        });
        if (this.f1293Tu == null) {
            mo12141a(frameLayout);
        }
        return frameLayout;
    }

    public void onDestroy() {
        if (this.f1293Tu != null) {
            this.f1293Tu.onDestroy();
        } else {
            m1580cG(1);
        }
    }

    public void onDestroyView() {
        if (this.f1293Tu != null) {
            this.f1293Tu.onDestroyView();
        } else {
            m1580cG(2);
        }
    }

    public void onInflate(final Activity activity, final Bundle bundle, final Bundle bundle2) {
        m1577a(bundle2, (C0962a) new C0962a() {
            /* renamed from: b */
            public void mo12156b(LifecycleDelegate lifecycleDelegate) {
                C0954a.this.f1293Tu.onInflate(activity, bundle, bundle2);
            }

            public int getState() {
                return 0;
            }
        });
    }

    public void onLowMemory() {
        if (this.f1293Tu != null) {
            this.f1293Tu.onLowMemory();
        }
    }

    public void onPause() {
        if (this.f1293Tu != null) {
            this.f1293Tu.onPause();
        } else {
            m1580cG(5);
        }
    }

    public void onResume() {
        m1577a((Bundle) null, (C0962a) new C0962a() {
            /* renamed from: b */
            public void mo12156b(LifecycleDelegate lifecycleDelegate) {
                C0954a.this.f1293Tu.onResume();
            }

            public int getState() {
                return 5;
            }
        });
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (this.f1293Tu != null) {
            this.f1293Tu.onSaveInstanceState(bundle);
        } else if (this.f1294Tv != null) {
            bundle.putAll(this.f1294Tv);
        }
    }

    public void onStart() {
        m1577a((Bundle) null, (C0962a) new C0962a() {
            /* renamed from: b */
            public void mo12156b(LifecycleDelegate lifecycleDelegate) {
                C0954a.this.f1293Tu.onStart();
            }

            public int getState() {
                return 4;
            }
        });
    }

    public void onStop() {
        if (this.f1293Tu != null) {
            this.f1293Tu.onStop();
        } else {
            m1580cG(4);
        }
    }
}

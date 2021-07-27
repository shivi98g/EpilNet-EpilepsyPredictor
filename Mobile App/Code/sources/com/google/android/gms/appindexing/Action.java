package com.google.android.gms.appindexing;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.plus.PlusShare;

public final class Action extends Thing {
    public static final String TYPE_ADD = "http://schema.org/AddAction";
    public static final String TYPE_BOOKMARK = "http://schema.org/BookmarkAction";
    public static final String TYPE_LIKE = "http://schema.org/LikeAction";
    public static final String TYPE_LISTEN = "http://schema.org/ListenAction";
    public static final String TYPE_VIEW = "http://schema.org/ViewAction";
    public static final String TYPE_WANT = "http://schema.org/WantAction";
    public static final String TYPE_WATCH = "http://schema.org/WatchAction";

    public static final class Builder extends Thing.Builder {
        public Builder(String str) {
            C1785jx.m5364i(str);
            super.put("type", str);
        }

        public Action build() {
            C1785jx.m5359b(this.f418DJ.get("object"), (Object) "setObject is required before calling build().");
            C1785jx.m5359b(this.f418DJ.get("type"), (Object) "setType is required before calling build().");
            Bundle bundle = (Bundle) this.f418DJ.getParcelable("object");
            C1785jx.m5359b(bundle.get("name"), (Object) "Must call setObject() with a valid name. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
            C1785jx.m5359b(bundle.get(PlusShare.KEY_CALL_TO_ACTION_URL), (Object) "Must call setObject() with a valid app url. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
            return new Action(this.f418DJ);
        }

        public Builder put(String str, Thing thing) {
            return (Builder) super.put(str, thing);
        }

        public Builder put(String str, String str2) {
            return (Builder) super.put(str, str2);
        }

        public Builder setName(String str) {
            return (Builder) super.put("name", str);
        }

        public Builder setObject(Thing thing) {
            C1785jx.m5364i(thing);
            return (Builder) super.put("object", thing);
        }

        public Builder setUrl(Uri uri) {
            if (uri != null) {
                super.put(PlusShare.KEY_CALL_TO_ACTION_URL, uri.toString());
            }
            return this;
        }
    }

    private Action(Bundle bundle) {
        super(bundle);
    }

    public static Action newAction(String str, String str2, Uri uri) {
        return newAction(str, str2, (Uri) null, uri);
    }

    public static Action newAction(String str, String str2, Uri uri, Uri uri2) {
        return new Builder(str).setObject(new Thing.Builder().setName(str2).setId(uri == null ? null : uri.toString()).setUrl(uri2).build()).build();
    }
}

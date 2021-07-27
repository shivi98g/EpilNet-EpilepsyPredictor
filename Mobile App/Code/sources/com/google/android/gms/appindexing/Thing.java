package com.google.android.gms.appindexing;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.plus.PlusShare;

public class Thing {

    /* renamed from: DI */
    final Bundle f417DI;

    public static class Builder {

        /* renamed from: DJ */
        final Bundle f418DJ = new Bundle();

        public Thing build() {
            return new Thing(this.f418DJ);
        }

        public Builder put(String str, Thing thing) {
            C1785jx.m5364i(str);
            if (thing != null) {
                this.f418DJ.putParcelable(str, thing.f417DI);
            }
            return this;
        }

        public Builder put(String str, String str2) {
            C1785jx.m5364i(str);
            if (str2 != null) {
                this.f418DJ.putString(str, str2);
            }
            return this;
        }

        public Builder setDescription(String str) {
            put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, str);
            return this;
        }

        public Builder setId(String str) {
            if (str != null) {
                put("id", str);
            }
            return this;
        }

        public Builder setName(String str) {
            C1785jx.m5364i(str);
            put("name", str);
            return this;
        }

        public Builder setType(String str) {
            put("type", str);
            return this;
        }

        public Builder setUrl(Uri uri) {
            C1785jx.m5364i(uri);
            put(PlusShare.KEY_CALL_TO_ACTION_URL, uri.toString());
            return this;
        }
    }

    Thing(Bundle bundle) {
        this.f417DI = bundle;
    }

    /* renamed from: fI */
    public Bundle mo10522fI() {
        return this.f417DI;
    }
}

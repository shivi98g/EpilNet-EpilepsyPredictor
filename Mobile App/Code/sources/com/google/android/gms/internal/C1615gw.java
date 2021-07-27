package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Message;
import android.support.p000v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

@C1507ey
/* renamed from: com.google.android.gms.internal.gw */
public class C1615gw extends WebChromeClient {

    /* renamed from: mo */
    private final C1610gu f3588mo;

    /* renamed from: com.google.android.gms.internal.gw$7 */
    static /* synthetic */ class C16227 {

        /* renamed from: xq */
        static final /* synthetic */ int[] f3596xq = new int[ConsoleMessage.MessageLevel.values().length];

        static {
            try {
                f3596xq[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f3596xq[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f3596xq[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f3596xq[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f3596xq[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    public C1615gw(C1610gu guVar) {
        this.f3588mo = guVar;
    }

    /* renamed from: a */
    private static void m4760a(AlertDialog.Builder builder, String str, final JsResult jsResult) {
        builder.setMessage(str).setPositiveButton(17039370, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                jsResult.confirm();
            }
        }).setNegativeButton(17039360, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                jsResult.cancel();
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
                jsResult.cancel();
            }
        }).create().show();
    }

    /* renamed from: a */
    private static void m4761a(Context context, AlertDialog.Builder builder, String str, String str2, final JsPromptResult jsPromptResult) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(str);
        final EditText editText = new EditText(context);
        editText.setText(str2);
        linearLayout.addView(textView);
        linearLayout.addView(editText);
        builder.setView(linearLayout).setPositiveButton(17039370, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                jsPromptResult.confirm(editText.getText().toString());
            }
        }).setNegativeButton(17039360, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                jsPromptResult.cancel();
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
                jsPromptResult.cancel();
            }
        }).create().show();
    }

    /* renamed from: c */
    private final Context m4762c(WebView webView) {
        if (!(webView instanceof C1610gu)) {
            return webView.getContext();
        }
        C1610gu guVar = (C1610gu) webView;
        Context dI = guVar.mo15431dI();
        return dI != null ? dI : guVar.getContext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15463a(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        C1445dp dC = this.f3588mo.mo15425dC();
        if (dC == null) {
            C1607gr.m4709W("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        dC.mo15118a(view, customViewCallback);
        dC.setRequestedOrientation(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo15464a(Context context, String str, String str2, String str3, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        try {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle(str);
            if (z) {
                m4761a(context, builder, str2, str3, jsPromptResult);
                return true;
            }
            m4760a(builder, str2, jsResult);
            return true;
        } catch (WindowManager.BadTokenException e) {
            C1607gr.m4713d("Fail to display Dialog.", e);
            return true;
        }
    }

    public final void onCloseWindow(WebView webView) {
        String str;
        if (!(webView instanceof C1610gu)) {
            str = "Tried to close a WebView that wasn't an AdWebView.";
        } else {
            C1445dp dC = ((C1610gu) webView).mo15425dC();
            if (dC == null) {
                str = "Tried to close an AdWebView not associated with an overlay.";
            } else {
                dC.close();
                return;
            }
        }
        C1607gr.m4709W(str);
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        if (str.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        switch (C16227.f3596xq[consoleMessage.messageLevel().ordinal()]) {
            case 1:
                C1607gr.m4706T(str);
                break;
            case 2:
                C1607gr.m4709W(str);
                break;
            case 5:
                C1607gr.m4705S(str);
                break;
            default:
                C1607gr.m4707U(str);
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(this.f3588mo.mo15426dD());
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = j;
        WebStorage.QuotaUpdater quotaUpdater2 = quotaUpdater;
        long j5 = 5242880 - j3;
        long j6 = 0;
        if (j5 <= 0) {
            quotaUpdater2.updateQuota(j4);
            return;
        }
        if (j4 != 0) {
            j6 = j2 == 0 ? Math.min(Math.min(PlaybackStateCompat.ACTION_PREPARE_FROM_URI, j5) + j4, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) : j2 <= Math.min(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED - j4, j5) ? j4 + j2 : j4;
        } else if (j2 <= j5 && j2 <= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            j6 = j2;
        }
        quotaUpdater2.updateQuota(j6);
    }

    public final void onHideCustomView() {
        C1445dp dC = this.f3588mo.mo15425dC();
        if (dC == null) {
            C1607gr.m4709W("Could not get ad overlay when hiding custom view.");
        } else {
            dC.mo15122cf();
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return mo15464a(m4762c(webView), str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return mo15464a(m4762c(webView), str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return mo15464a(m4762c(webView), str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return mo15464a(m4762c(webView), str, str2, str3, (JsResult) null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        long j3 = PlaybackStateCompat.ACTION_PREPARE_FROM_URI + j;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        mo15463a(view, -1, customViewCallback);
    }
}

package com.google.android.gms.drive.widget;

import android.content.Context;
import android.database.CursorIndexOutOfBoundsException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.drive.internal.C0849w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataBufferAdapter<T> extends BaseAdapter {

    /* renamed from: To */
    private final int f1287To;

    /* renamed from: Tp */
    private int f1288Tp;

    /* renamed from: Tq */
    private final int f1289Tq;

    /* renamed from: Tr */
    private final List<DataBuffer<T>> f1290Tr;

    /* renamed from: Ts */
    private final LayoutInflater f1291Ts;

    /* renamed from: Tt */
    private boolean f1292Tt;
    private final Context mContext;

    public DataBufferAdapter(Context context, int i) {
        this(context, i, 0, new ArrayList());
    }

    public DataBufferAdapter(Context context, int i, int i2) {
        this(context, i, i2, new ArrayList());
    }

    public DataBufferAdapter(Context context, int i, int i2, List<DataBuffer<T>> list) {
        this.f1292Tt = true;
        this.mContext = context;
        this.f1288Tp = i;
        this.f1287To = i;
        this.f1289Tq = i2;
        this.f1290Tr = list;
        this.f1291Ts = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public DataBufferAdapter(Context context, int i, int i2, DataBuffer<T>... dataBufferArr) {
        this(context, i, i2, Arrays.asList(dataBufferArr));
    }

    public DataBufferAdapter(Context context, int i, List<DataBuffer<T>> list) {
        this(context, i, 0, list);
    }

    public DataBufferAdapter(Context context, int i, DataBuffer<T>... dataBufferArr) {
        this(context, i, 0, Arrays.asList(dataBufferArr));
    }

    /* renamed from: a */
    private View m1573a(int i, View view, ViewGroup viewGroup, int i2) {
        if (view == null) {
            view = this.f1291Ts.inflate(i2, viewGroup, false);
        }
        try {
            TextView textView = this.f1289Tq == 0 ? (TextView) view : (TextView) view.findViewById(this.f1289Tq);
            Object item = getItem(i);
            textView.setText(item instanceof CharSequence ? (CharSequence) item : item.toString());
            return view;
        } catch (ClassCastException e) {
            C0849w.m1205a("DataBufferAdapter", e, "You must supply a resource ID for a TextView");
            throw new IllegalStateException("DataBufferAdapter requires the resource ID to be a TextView", e);
        }
    }

    public void append(DataBuffer<T> dataBuffer) {
        this.f1290Tr.add(dataBuffer);
        if (this.f1292Tt) {
            notifyDataSetChanged();
        }
    }

    public void clear() {
        for (DataBuffer<T> release : this.f1290Tr) {
            release.release();
        }
        this.f1290Tr.clear();
        if (this.f1292Tt) {
            notifyDataSetChanged();
        }
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getCount() {
        int i = 0;
        for (DataBuffer<T> count : this.f1290Tr) {
            i += count.getCount();
        }
        return i;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return m1573a(i, view, viewGroup, this.f1288Tp);
    }

    public T getItem(int i) throws CursorIndexOutOfBoundsException {
        int i2 = i;
        for (DataBuffer next : this.f1290Tr) {
            int count = next.getCount();
            if (count <= i2) {
                i2 -= count;
            } else {
                try {
                    return next.get(i2);
                } catch (CursorIndexOutOfBoundsException e) {
                    throw new CursorIndexOutOfBoundsException(i, getCount());
                }
            }
        }
        throw new CursorIndexOutOfBoundsException(i, getCount());
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return m1573a(i, view, viewGroup, this.f1287To);
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.f1292Tt = true;
    }

    public void setDropDownViewResource(int i) {
        this.f1288Tp = i;
    }

    public void setNotifyOnChange(boolean z) {
        this.f1292Tt = z;
    }
}

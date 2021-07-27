package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.C0967d;
import com.google.android.gms.dynamic.C0970e;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.maps.LocationSource;
import com.google.android.gms.maps.internal.C2273b;
import com.google.android.gms.maps.internal.C2279d;
import com.google.android.gms.maps.internal.C2285f;
import com.google.android.gms.maps.internal.C2288g;
import com.google.android.gms.maps.internal.C2291h;
import com.google.android.gms.maps.internal.C2294i;
import com.google.android.gms.maps.internal.C2297j;
import com.google.android.gms.maps.internal.C2300k;
import com.google.android.gms.maps.internal.C2303l;
import com.google.android.gms.maps.internal.C2309n;
import com.google.android.gms.maps.internal.C2312o;
import com.google.android.gms.maps.internal.C2315p;
import com.google.android.gms.maps.internal.C2318q;
import com.google.android.gms.maps.internal.C2333v;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.ILocationSourceDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.C2365i;
import com.google.android.gms.maps.model.internal.C2368j;
import com.google.android.gms.maps.model.internal.C2374l;
import com.google.android.gms.maps.model.internal.C2380n;

public final class GoogleMap {
    public static final int MAP_TYPE_HYBRID = 4;
    public static final int MAP_TYPE_NONE = 0;
    public static final int MAP_TYPE_NORMAL = 1;
    public static final int MAP_TYPE_SATELLITE = 2;
    public static final int MAP_TYPE_TERRAIN = 3;
    private final IGoogleMapDelegate akm;
    private UiSettings akn;

    public interface CancelableCallback {
        void onCancel();

        void onFinish();
    }

    public interface InfoWindowAdapter {
        View getInfoContents(Marker marker);

        View getInfoWindow(Marker marker);
    }

    public interface OnCameraChangeListener {
        void onCameraChange(CameraPosition cameraPosition);
    }

    public interface OnIndoorStateChangeListener {
        void onIndoorBuildingFocused();

        void onIndoorLevelActivated(IndoorBuilding indoorBuilding);
    }

    public interface OnInfoWindowClickListener {
        void onInfoWindowClick(Marker marker);
    }

    public interface OnMapClickListener {
        void onMapClick(LatLng latLng);
    }

    public interface OnMapLoadedCallback {
        void onMapLoaded();
    }

    public interface OnMapLongClickListener {
        void onMapLongClick(LatLng latLng);
    }

    public interface OnMarkerClickListener {
        boolean onMarkerClick(Marker marker);
    }

    public interface OnMarkerDragListener {
        void onMarkerDrag(Marker marker);

        void onMarkerDragEnd(Marker marker);

        void onMarkerDragStart(Marker marker);
    }

    public interface OnMyLocationButtonClickListener {
        boolean onMyLocationButtonClick();
    }

    @Deprecated
    public interface OnMyLocationChangeListener {
        void onMyLocationChange(Location location);
    }

    public interface SnapshotReadyCallback {
        void onSnapshotReady(Bitmap bitmap);
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$a */
    private static final class C2226a extends C2273b.C2274a {
        private final CancelableCallback akE;

        C2226a(CancelableCallback cancelableCallback) {
            this.akE = cancelableCallback;
        }

        public void onCancel() {
            this.akE.onCancel();
        }

        public void onFinish() {
            this.akE.onFinish();
        }
    }

    protected GoogleMap(IGoogleMapDelegate iGoogleMapDelegate) {
        this.akm = (IGoogleMapDelegate) C1785jx.m5364i(iGoogleMapDelegate);
    }

    public final Circle addCircle(CircleOptions circleOptions) {
        try {
            return new Circle(this.akm.addCircle(circleOptions));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final GroundOverlay addGroundOverlay(GroundOverlayOptions groundOverlayOptions) {
        try {
            C2365i addGroundOverlay = this.akm.addGroundOverlay(groundOverlayOptions);
            if (addGroundOverlay != null) {
                return new GroundOverlay(addGroundOverlay);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final Marker addMarker(MarkerOptions markerOptions) {
        try {
            C2374l addMarker = this.akm.addMarker(markerOptions);
            if (addMarker != null) {
                return new Marker(addMarker);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final Polygon addPolygon(PolygonOptions polygonOptions) {
        try {
            return new Polygon(this.akm.addPolygon(polygonOptions));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final Polyline addPolyline(PolylineOptions polylineOptions) {
        try {
            return new Polyline(this.akm.addPolyline(polylineOptions));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final TileOverlay addTileOverlay(TileOverlayOptions tileOverlayOptions) {
        try {
            C2380n addTileOverlay = this.akm.addTileOverlay(tileOverlayOptions);
            if (addTileOverlay != null) {
                return new TileOverlay(addTileOverlay);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void animateCamera(CameraUpdate cameraUpdate) {
        try {
            this.akm.animateCamera(cameraUpdate.mo17249nA());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void animateCamera(CameraUpdate cameraUpdate, int i, CancelableCallback cancelableCallback) {
        try {
            this.akm.animateCameraWithDurationAndCallback(cameraUpdate.mo17249nA(), i, cancelableCallback == null ? null : new C2226a(cancelableCallback));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void animateCamera(CameraUpdate cameraUpdate, CancelableCallback cancelableCallback) {
        try {
            this.akm.animateCameraWithCallback(cameraUpdate.mo17249nA(), cancelableCallback == null ? null : new C2226a(cancelableCallback));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void clear() {
        try {
            this.akm.clear();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final CameraPosition getCameraPosition() {
        try {
            return this.akm.getCameraPosition();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public IndoorBuilding getFocusedBuilding() {
        try {
            C2368j focusedBuilding = this.akm.getFocusedBuilding();
            if (focusedBuilding != null) {
                return new IndoorBuilding(focusedBuilding);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int getMapType() {
        try {
            return this.akm.getMapType();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getMaxZoomLevel() {
        try {
            return this.akm.getMaxZoomLevel();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getMinZoomLevel() {
        try {
            return this.akm.getMinZoomLevel();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Deprecated
    public final Location getMyLocation() {
        try {
            return this.akm.getMyLocation();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final Projection getProjection() {
        try {
            return new Projection(this.akm.getProjection());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final UiSettings getUiSettings() {
        try {
            if (this.akn == null) {
                this.akn = new UiSettings(this.akm.getUiSettings());
            }
            return this.akn;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isBuildingsEnabled() {
        try {
            return this.akm.isBuildingsEnabled();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isIndoorEnabled() {
        try {
            return this.akm.isIndoorEnabled();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isMyLocationEnabled() {
        try {
            return this.akm.isMyLocationEnabled();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isTrafficEnabled() {
        try {
            return this.akm.isTrafficEnabled();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void moveCamera(CameraUpdate cameraUpdate) {
        try {
            this.akm.moveCamera(cameraUpdate.mo17249nA());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: nC */
    public IGoogleMapDelegate mo17273nC() {
        return this.akm;
    }

    public final void setBuildingsEnabled(boolean z) {
        try {
            this.akm.setBuildingsEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setContentDescription(String str) {
        try {
            this.akm.setContentDescription(str);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean setIndoorEnabled(boolean z) {
        try {
            return this.akm.setIndoorEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setInfoWindowAdapter(final InfoWindowAdapter infoWindowAdapter) {
        if (infoWindowAdapter == null) {
            try {
                this.akm.setInfoWindowAdapter((C2279d) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.akm.setInfoWindowAdapter(new C2279d.C2280a() {
                /* renamed from: f */
                public C0967d mo17303f(C2374l lVar) {
                    return C0970e.m1613k(infoWindowAdapter.getInfoWindow(new Marker(lVar)));
                }

                /* renamed from: g */
                public C0967d mo17304g(C2374l lVar) {
                    return C0970e.m1613k(infoWindowAdapter.getInfoContents(new Marker(lVar)));
                }
            });
        }
    }

    public final void setLocationSource(final LocationSource locationSource) {
        if (locationSource == null) {
            try {
                this.akm.setLocationSource((ILocationSourceDelegate) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.akm.setLocationSource(new ILocationSourceDelegate.C2255a() {
                public void activate(final C2294i iVar) {
                    locationSource.activate(new LocationSource.OnLocationChangedListener() {
                        public void onLocationChanged(Location location) {
                            try {
                                iVar.mo17738d(location);
                            } catch (RemoteException e) {
                                throw new RuntimeRemoteException(e);
                            }
                        }
                    });
                }

                public void deactivate() {
                    locationSource.deactivate();
                }
            });
        }
    }

    public final void setMapType(int i) {
        try {
            this.akm.setMapType(i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setMyLocationEnabled(boolean z) {
        try {
            this.akm.setMyLocationEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setOnCameraChangeListener(final OnCameraChangeListener onCameraChangeListener) {
        if (onCameraChangeListener == null) {
            try {
                this.akm.setOnCameraChangeListener((C2285f) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.akm.setOnCameraChangeListener(new C2285f.C2286a() {
                public void onCameraChange(CameraPosition cameraPosition) {
                    onCameraChangeListener.onCameraChange(cameraPosition);
                }
            });
        }
    }

    public final void setOnIndoorStateChangeListener(final OnIndoorStateChangeListener onIndoorStateChangeListener) {
        if (onIndoorStateChangeListener == null) {
            try {
                this.akm.setOnIndoorStateChangeListener((C2288g) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.akm.setOnIndoorStateChangeListener(new C2288g.C2289a() {
                /* renamed from: a */
                public void mo17296a(C2368j jVar) {
                    onIndoorStateChangeListener.onIndoorLevelActivated(new IndoorBuilding(jVar));
                }

                public void onIndoorBuildingFocused() {
                    onIndoorStateChangeListener.onIndoorBuildingFocused();
                }
            });
        }
    }

    public final void setOnInfoWindowClickListener(final OnInfoWindowClickListener onInfoWindowClickListener) {
        if (onInfoWindowClickListener == null) {
            try {
                this.akm.setOnInfoWindowClickListener((C2291h) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.akm.setOnInfoWindowClickListener(new C2291h.C2292a() {
                /* renamed from: e */
                public void mo17302e(C2374l lVar) {
                    onInfoWindowClickListener.onInfoWindowClick(new Marker(lVar));
                }
            });
        }
    }

    public final void setOnMapClickListener(final OnMapClickListener onMapClickListener) {
        if (onMapClickListener == null) {
            try {
                this.akm.setOnMapClickListener((C2297j) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.akm.setOnMapClickListener(new C2297j.C2298a() {
                public void onMapClick(LatLng latLng) {
                    onMapClickListener.onMapClick(latLng);
                }
            });
        }
    }

    public void setOnMapLoadedCallback(final OnMapLoadedCallback onMapLoadedCallback) {
        if (onMapLoadedCallback == null) {
            try {
                this.akm.setOnMapLoadedCallback((C2300k) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.akm.setOnMapLoadedCallback(new C2300k.C2301a() {
                public void onMapLoaded() throws RemoteException {
                    onMapLoadedCallback.onMapLoaded();
                }
            });
        }
    }

    public final void setOnMapLongClickListener(final OnMapLongClickListener onMapLongClickListener) {
        if (onMapLongClickListener == null) {
            try {
                this.akm.setOnMapLongClickListener((C2303l) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.akm.setOnMapLongClickListener(new C2303l.C2304a() {
                public void onMapLongClick(LatLng latLng) {
                    onMapLongClickListener.onMapLongClick(latLng);
                }
            });
        }
    }

    public final void setOnMarkerClickListener(final OnMarkerClickListener onMarkerClickListener) {
        if (onMarkerClickListener == null) {
            try {
                this.akm.setOnMarkerClickListener((C2309n) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.akm.setOnMarkerClickListener(new C2309n.C2310a() {
                /* renamed from: a */
                public boolean mo17298a(C2374l lVar) {
                    return onMarkerClickListener.onMarkerClick(new Marker(lVar));
                }
            });
        }
    }

    public final void setOnMarkerDragListener(final OnMarkerDragListener onMarkerDragListener) {
        if (onMarkerDragListener == null) {
            try {
                this.akm.setOnMarkerDragListener((C2312o) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.akm.setOnMarkerDragListener(new C2312o.C2313a() {
                /* renamed from: b */
                public void mo17299b(C2374l lVar) {
                    onMarkerDragListener.onMarkerDragStart(new Marker(lVar));
                }

                /* renamed from: c */
                public void mo17300c(C2374l lVar) {
                    onMarkerDragListener.onMarkerDragEnd(new Marker(lVar));
                }

                /* renamed from: d */
                public void mo17301d(C2374l lVar) {
                    onMarkerDragListener.onMarkerDrag(new Marker(lVar));
                }
            });
        }
    }

    public final void setOnMyLocationButtonClickListener(final OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
        if (onMyLocationButtonClickListener == null) {
            try {
                this.akm.setOnMyLocationButtonClickListener((C2315p) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.akm.setOnMyLocationButtonClickListener(new C2315p.C2316a() {
                public boolean onMyLocationButtonClick() throws RemoteException {
                    return onMyLocationButtonClickListener.onMyLocationButtonClick();
                }
            });
        }
    }

    @Deprecated
    public final void setOnMyLocationChangeListener(final OnMyLocationChangeListener onMyLocationChangeListener) {
        if (onMyLocationChangeListener == null) {
            try {
                this.akm.setOnMyLocationChangeListener((C2318q) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.akm.setOnMyLocationChangeListener(new C2318q.C2319a() {
                /* renamed from: c */
                public void mo17305c(Location location) {
                    onMyLocationChangeListener.onMyLocationChange(location);
                }

                /* renamed from: g */
                public void mo17306g(C0967d dVar) {
                    onMyLocationChangeListener.onMyLocationChange((Location) C0970e.m1612f(dVar));
                }
            });
        }
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        try {
            this.akm.setPadding(i, i2, i3, i4);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setTrafficEnabled(boolean z) {
        try {
            this.akm.setTrafficEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void snapshot(SnapshotReadyCallback snapshotReadyCallback) {
        snapshot(snapshotReadyCallback, (Bitmap) null);
    }

    public final void snapshot(final SnapshotReadyCallback snapshotReadyCallback, Bitmap bitmap) {
        try {
            this.akm.snapshot(new C2333v.C2334a() {
                /* renamed from: h */
                public void mo17309h(C0967d dVar) throws RemoteException {
                    snapshotReadyCallback.onSnapshotReady((Bitmap) C0970e.m1612f(dVar));
                }

                public void onSnapshotReady(Bitmap bitmap) throws RemoteException {
                    snapshotReadyCallback.onSnapshotReady(bitmap);
                }
            }, (C0970e) (bitmap != null ? C0970e.m1613k(bitmap) : null));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void stopAnimation() {
        try {
            this.akm.stopAnimation();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}

package android.support.design.expandable;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.view.ViewParent;

public final class ExpandableWidgetHelper {
    private boolean expanded = false;
    @IdRes
    private int expandedComponentIdHint = 0;
    private final View widget;

    public ExpandableWidgetHelper(ExpandableWidget widget2) {
        this.widget = (View) widget2;
    }

    public boolean setExpanded(boolean expanded2) {
        if (this.expanded == expanded2) {
            return false;
        }
        this.expanded = expanded2;
        dispatchExpandedStateChanged();
        return true;
    }

    public boolean isExpanded() {
        return this.expanded;
    }

    public Bundle onSaveInstanceState() {
        Bundle state = new Bundle();
        state.putBoolean("expanded", this.expanded);
        state.putInt("expandedComponentIdHint", this.expandedComponentIdHint);
        return state;
    }

    public void onRestoreInstanceState(Bundle state) {
        this.expanded = state.getBoolean("expanded", false);
        this.expandedComponentIdHint = state.getInt("expandedComponentIdHint", 0);
        if (this.expanded) {
            dispatchExpandedStateChanged();
        }
    }

    public void setExpandedComponentIdHint(@IdRes int expandedComponentIdHint2) {
        this.expandedComponentIdHint = expandedComponentIdHint2;
    }

    @IdRes
    public int getExpandedComponentIdHint() {
        return this.expandedComponentIdHint;
    }

    private void dispatchExpandedStateChanged() {
        ViewParent parent = this.widget.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).dispatchDependentViewsChanged(this.widget);
        }
    }
}

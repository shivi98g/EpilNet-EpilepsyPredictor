package android.support.design.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class MotionTiming {
    private long delay = 0;
    private long duration = 300;
    @Nullable
    private TimeInterpolator interpolator = null;
    private int repeatCount = 0;
    private int repeatMode = 1;

    public MotionTiming(long delay2, long duration2) {
        this.delay = delay2;
        this.duration = duration2;
    }

    public MotionTiming(long delay2, long duration2, @NonNull TimeInterpolator interpolator2) {
        this.delay = delay2;
        this.duration = duration2;
        this.interpolator = interpolator2;
    }

    public void apply(Animator animator) {
        animator.setStartDelay(getDelay());
        animator.setDuration(getDuration());
        animator.setInterpolator(getInterpolator());
        if (animator instanceof ValueAnimator) {
            ((ValueAnimator) animator).setRepeatCount(getRepeatCount());
            ((ValueAnimator) animator).setRepeatMode(getRepeatMode());
        }
    }

    public long getDelay() {
        return this.delay;
    }

    public long getDuration() {
        return this.duration;
    }

    public TimeInterpolator getInterpolator() {
        return this.interpolator != null ? this.interpolator : AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    public int getRepeatCount() {
        return this.repeatCount;
    }

    public int getRepeatMode() {
        return this.repeatMode;
    }

    static MotionTiming createFromAnimator(ValueAnimator animator) {
        MotionTiming timing = new MotionTiming(animator.getStartDelay(), animator.getDuration(), getInterpolatorCompat(animator));
        timing.repeatCount = animator.getRepeatCount();
        timing.repeatMode = animator.getRepeatMode();
        return timing;
    }

    private static TimeInterpolator getInterpolatorCompat(ValueAnimator animator) {
        TimeInterpolator interpolator2 = animator.getInterpolator();
        if ((interpolator2 instanceof AccelerateDecelerateInterpolator) || interpolator2 == null) {
            return AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        }
        if (interpolator2 instanceof AccelerateInterpolator) {
            return AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
        }
        if (interpolator2 instanceof DecelerateInterpolator) {
            return AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;
        }
        return interpolator2;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MotionTiming that = (MotionTiming) o;
        if (getDelay() == that.getDelay() && getDuration() == that.getDuration() && getRepeatCount() == that.getRepeatCount() && getRepeatMode() == that.getRepeatMode()) {
            return getInterpolator().getClass().equals(that.getInterpolator().getClass());
        }
        return false;
    }

    public int hashCode() {
        return (31 * ((31 * ((31 * ((31 * ((int) (getDelay() ^ (getDelay() >>> 32)))) + ((int) ((getDuration() >>> 32) ^ getDuration())))) + getInterpolator().getClass().hashCode())) + getRepeatCount())) + getRepeatMode();
    }

    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + getDelay() + " duration: " + getDuration() + " interpolator: " + getInterpolator().getClass() + " repeatCount: " + getRepeatCount() + " repeatMode: " + getRepeatMode() + "}\n";
    }
}

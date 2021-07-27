package com.google.android.gms.games.internal.game;

import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import java.util.ArrayList;

public interface ExtendedGame extends Parcelable, Freezable<ExtendedGame> {
    Game getGame();

    /* renamed from: lY */
    ArrayList<GameBadge> mo14125lY();

    /* renamed from: lZ */
    int mo14126lZ();

    /* renamed from: ma */
    boolean mo14127ma();

    /* renamed from: mb */
    int mo14128mb();

    /* renamed from: mc */
    long mo14129mc();

    /* renamed from: md */
    long mo14130md();

    /* renamed from: me */
    String mo14131me();

    /* renamed from: mf */
    long mo14132mf();

    /* renamed from: mg */
    String mo14133mg();

    /* renamed from: mh */
    SnapshotMetadata mo14134mh();
}

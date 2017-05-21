package com.chank.lua.parser;

/**
 * Created by chank on 2017/5/21.
 */
public final class ExpressionKind {

    public static final int VVOID = 0;
    public static final int VNIL = 1;
    public static final int VTRUE = 2;
    public static final int VFALSE = 3;
    public static final int VK = 4;
    public static final int VKFLT = 5;
    public static final int VKINT = 6;
    public static final int VNONRELOC = 7;
    public static final int VLOCAL = 8;
    public static final int VUPVAL = 9;
    public static final int VINDEXED = 10;
    public static final int VJMP = 11;
    public static final int VRELOCABLE = 12;
    public static final int VCALL = 13;
    public static final int VVARARG = 14;

    public static boolean vkIsVar(int k) {
        return VLOCAL <= k && k <= VINDEXED;
    }

    public static boolean vkIsInreg(int k) {
        return k == VNONRELOC || k == VLOCAL;
    }

    public static boolean hasMultret(int k) {
        return k == VCALL || k == VVARARG;
    }

}

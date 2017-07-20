/*
 * Copyright 2017 方里权 (Chank)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.chank.lua;

/**
 * @author Chank
 */
public final class LuaFunc {

    public static final int MAX_UP_VAL = 255;

    public static final class UpVal {
        LuaTValue v;
        int refCount;
        public static final class Open {
            UpVal next;
            int touched;
        }
        Open open;
        LuaTValue value;
    }

    public static LuaObject.Proto luaFNewProto(LuaState l) {
        LuaObject.Proto f = new LuaObject.Proto();
        return f;
    }
}

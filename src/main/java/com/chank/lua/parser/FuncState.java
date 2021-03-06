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

package com.chank.lua.parser;

import com.chank.lua.LuaObject;

/**
 * @author Chank
 */
public class FuncState {
    public LuaObject.Proto f;
    public FuncState prev;
    public LexState ls;
    public LuaParser.BlockCnt bl;
    public int pc;
    public int lastTarget;
    public int jpc;
    public int nk;
    public int np;
    public int firstLocal;
    public short nLocVars;
    public char nactvar;
    public char nups;
    public int freeReg;
}

/*
 * Copyright (c) 2009-2012 Panxiaobo
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.dex2jar.ir.expr;

import com.googlecode.dex2jar.ir.Value;
import com.googlecode.dex2jar.ir.Value.E2Expr;
import com.googlecode.dex2jar.ir.ValueBox;

/**
 * Represent an Array expression
 * 
 * @see VT#ARRAY
 * 
 * @author <a href="mailto:pxb1988@gmail.com">Panxiaobo</a>
 * @version $Rev$
 */
public class ArrayExpr extends E2Expr {

    public ArrayExpr() {
        super(VT.ARRAY, null, null);
    }

    public ArrayExpr(Value base, Value index) {
        super(VT.ARRAY, new ValueBox(base), new ValueBox(index));
    }

    @Override
    public Value clone() {
        return new ArrayExpr(op1.value.clone(), op2.value.clone());
    }

    @Override
    public String toString() {
        return op1 + "[" + op2 + "]";
    }
}

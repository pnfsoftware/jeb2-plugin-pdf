/*
Copyright PNF Software, Inc.

    https://www.pnfsoftware.com

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package com.pnf.plugin.pdf;

import junit.framework.TestCase;

import com.pnf.plugin.pdf.obj.IPdfAttribute.Type;
import com.pnf.plugin.pdf.obj.PdfIndirectOjbStm;

/**
 * 
 * 
 * @author PNF Software
 *
 */
public class PdfIndirectObjStmTest extends TestCase {

    private static final byte[] OBJ_STM = "11 0 12 18 << /Type /Font >> <</New /done>>".getBytes();

    public void testObjStm() {
        PdfIndirectOjbStm obj = new PdfIndirectOjbStm(null, null, 11);
        obj.parse(OBJ_STM, 11 + 0, "11");
        assertEquals(Type.Dictionary, obj.getAttribute().getType());

    }

    public void testObjStm2() {
        PdfIndirectOjbStm obj = new PdfIndirectOjbStm(null, null, 11 + 18);
        obj.parse(OBJ_STM, 11 + 18, "12");
        assertEquals(Type.Dictionary, obj.getAttribute().getType());
    }
}

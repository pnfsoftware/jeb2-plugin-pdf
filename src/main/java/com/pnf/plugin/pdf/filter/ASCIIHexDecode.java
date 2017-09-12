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

package com.pnf.plugin.pdf.filter;

import java.nio.ByteBuffer;

import com.pnf.plugin.pdf.obj.PdfDictionary;

/**
 * 
 * 
 * @author PNF Software
 *
 */
public class ASCIIHexDecode implements IFilter {

    @Override
    public byte[] decodeBytes(byte[] data, int fromByte, int length, PdfDictionary dictionary)
            throws FilterStreamException {
        ByteBuffer bb = com.sun.pdfview.decode.ASCIIHexDecode
                .decode(ByteBufferUtils.getByteBuffer(data, fromByte, length), null);
        return bb.array();
    }
}

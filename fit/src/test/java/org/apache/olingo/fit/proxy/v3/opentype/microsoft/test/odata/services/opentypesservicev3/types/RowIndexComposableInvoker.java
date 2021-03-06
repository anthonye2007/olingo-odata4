/* 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.olingo.fit.proxy.v3.opentype.microsoft.test.odata.services.opentypesservicev3.types;
//CHECKSTYLE:OFF (Maven checkstyle)
import org.apache.olingo.ext.proxy.api.annotations.Key;
import org.apache.olingo.ext.proxy.api.AbstractOpenType;
import org.apache.olingo.commons.api.edm.constants.EdmContentKind;
import org.apache.olingo.client.api.edm.ConcurrencyMode;
//CHECKSTYLE:ON (Maven checkstyle)

public interface RowIndexComposableInvoker 
  extends org.apache.olingo.ext.proxy.api.StructuredComposableInvoker<RowIndex, RowIndex.Operations>
  ,AbstractOpenType {

  @Override
  RowIndexComposableInvoker select(String... select);

  @Override
  RowIndexComposableInvoker expand(String... expand);

    

    @Key
    
    @org.apache.olingo.ext.proxy.api.annotations.Property(name = "Id", 
                type = "Edm.Int32", 
                nullable = false,
                defaultValue = "",
                maxLenght = Integer.MAX_VALUE,
                fixedLenght = false,
                precision = 0,
                scale = 0,
                unicode = true,
                collation = "",
                srid = "",
                concurrencyMode = ConcurrencyMode.None,
                fcSourcePath = "",
                fcTargetPath = "",
                fcContentKind = EdmContentKind.text,
                fcNSPrefix = "",
                fcNSURI = "",
                fcKeepInContent = false)
    java.lang.Integer getId();

    void setId(java.lang.Integer _id);
    

    @org.apache.olingo.ext.proxy.api.annotations.NavigationProperty(name = "Rows", 
                type = "Microsoft.Test.OData.Services.OpenTypesServiceV3.IndexedRow", 
                targetSchema = "Microsoft.Test.OData.Services.OpenTypesServiceV3", 
                targetContainer = "DefaultContainer", 
                targetEntitySet = "Row",
                containsTarget = false)
    org.apache.olingo.fit.proxy.v3.opentype.microsoft.test.odata.services.opentypesservicev3.types.IndexedRowCollection getRows();

    void setRows(org.apache.olingo.fit.proxy.v3.opentype.microsoft.test.odata.services.opentypesservicev3.types.IndexedRowCollection _rows);
    

}

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
package org.apache.olingo.fit.proxy.v3.actionoverloading.microsoft.test.odata.services.astoriadefaultservice.types;
//CHECKSTYLE:OFF (Maven checkstyle)
import org.apache.olingo.ext.proxy.api.annotations.Key;
import org.apache.olingo.ext.proxy.api.annotations.KeyRef;
import org.apache.olingo.commons.api.edm.constants.EdmContentKind;
import org.apache.olingo.client.api.edm.ConcurrencyMode;
import java.util.concurrent.Future;
//CHECKSTYLE:ON (Maven checkstyle)

@KeyRef(OrderLineKey.class)
@org.apache.olingo.ext.proxy.api.annotations.Namespace("Microsoft.Test.OData.Services.AstoriaDefaultService")
@org.apache.olingo.ext.proxy.api.annotations.EntityType(name = "BackOrderLine2",
        openType = false,
        hasStream = false,
        isAbstract = false,
        baseType = "Microsoft.Test.OData.Services.AstoriaDefaultService.BackOrderLine")
public interface BackOrderLine2 
  extends org.apache.olingo.ext.proxy.api.Annotatable,
  org.apache.olingo.fit.proxy.v3.actionoverloading.microsoft.test.odata.services.astoriadefaultservice.types.BackOrderLine   {

  @Override
  BackOrderLine2 load();

  @Override
  Future<? extends BackOrderLine2> loadAsync();

  @Override
  BackOrderLine2 refs();

  @Override
  BackOrderLine2 expand(String... expand);

  @Override
  BackOrderLine2 select(String... select);

        

    
    
    @org.apache.olingo.ext.proxy.api.annotations.Property(name = "OrderLineStream", 
                type = "Edm.Stream", 
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
    org.apache.olingo.ext.proxy.api.EdmStreamValue getOrderLineStream();

    void setOrderLineStream(org.apache.olingo.ext.proxy.api.EdmStreamValue _orderLineStream);
    @Key
    
    @org.apache.olingo.ext.proxy.api.annotations.Property(name = "OrderId", 
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
    java.lang.Integer getOrderId();

    void setOrderId(java.lang.Integer _orderId);
    @Key
    
    @org.apache.olingo.ext.proxy.api.annotations.Property(name = "ProductId", 
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
    java.lang.Integer getProductId();

    void setProductId(java.lang.Integer _productId);
    
    
    @org.apache.olingo.ext.proxy.api.annotations.Property(name = "Quantity", 
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
    java.lang.Integer getQuantity();

    void setQuantity(java.lang.Integer _quantity);
    
    
    @org.apache.olingo.ext.proxy.api.annotations.Property(name = "ConcurrencyToken", 
                type = "Edm.String", 
                nullable = true,
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
    java.lang.String getConcurrencyToken();

    void setConcurrencyToken(java.lang.String _concurrencyToken);
    

    @org.apache.olingo.ext.proxy.api.annotations.NavigationProperty(name = "Order", 
                type = "Microsoft.Test.OData.Services.AstoriaDefaultService.Order", 
                targetSchema = "Microsoft.Test.OData.Services.AstoriaDefaultService", 
                targetContainer = "DefaultContainer", 
                targetEntitySet = "Order",
                containsTarget = false)
    org.apache.olingo.fit.proxy.v3.actionoverloading.microsoft.test.odata.services.astoriadefaultservice.types.Order getOrder();

    void setOrder(org.apache.olingo.fit.proxy.v3.actionoverloading.microsoft.test.odata.services.astoriadefaultservice.types.Order _order);
    
    @org.apache.olingo.ext.proxy.api.annotations.NavigationProperty(name = "Product", 
                type = "Microsoft.Test.OData.Services.AstoriaDefaultService.Product", 
                targetSchema = "Microsoft.Test.OData.Services.AstoriaDefaultService", 
                targetContainer = "DefaultContainer", 
                targetEntitySet = "Product",
                containsTarget = false)
    org.apache.olingo.fit.proxy.v3.actionoverloading.microsoft.test.odata.services.astoriadefaultservice.types.Product getProduct();

    void setProduct(org.apache.olingo.fit.proxy.v3.actionoverloading.microsoft.test.odata.services.astoriadefaultservice.types.Product _product);
    


        @Override
        Operations operations();

    interface Operations extends org.apache.olingo.fit.proxy.v3.actionoverloading.microsoft.test.odata.services.astoriadefaultservice.types.BackOrderLine.Operations{
    
        }
    Annotations annotations();

    interface Annotations            extends org.apache.olingo.fit.proxy.v3.actionoverloading.microsoft.test.odata.services.astoriadefaultservice.types.BackOrderLine.Annotations{

        @org.apache.olingo.ext.proxy.api.annotations.AnnotationsForProperty(name = "OrderLineStream",
                   type = "Edm.Stream")
        org.apache.olingo.ext.proxy.api.Annotatable getOrderLineStreamAnnotations();

        @org.apache.olingo.ext.proxy.api.annotations.AnnotationsForProperty(name = "OrderId",
                   type = "Edm.Int32")
        org.apache.olingo.ext.proxy.api.Annotatable getOrderIdAnnotations();

        @org.apache.olingo.ext.proxy.api.annotations.AnnotationsForProperty(name = "ProductId",
                   type = "Edm.Int32")
        org.apache.olingo.ext.proxy.api.Annotatable getProductIdAnnotations();

        @org.apache.olingo.ext.proxy.api.annotations.AnnotationsForProperty(name = "Quantity",
                   type = "Edm.Int32")
        org.apache.olingo.ext.proxy.api.Annotatable getQuantityAnnotations();

        @org.apache.olingo.ext.proxy.api.annotations.AnnotationsForProperty(name = "ConcurrencyToken",
                   type = "Edm.String")
        org.apache.olingo.ext.proxy.api.Annotatable getConcurrencyTokenAnnotations();



        @org.apache.olingo.ext.proxy.api.annotations.AnnotationsForNavigationProperty(name = "Order", 
                  type = "Microsoft.Test.OData.Services.AstoriaDefaultService.Order")
        org.apache.olingo.ext.proxy.api.Annotatable getOrderAnnotations();

        @org.apache.olingo.ext.proxy.api.annotations.AnnotationsForNavigationProperty(name = "Product", 
                  type = "Microsoft.Test.OData.Services.AstoriaDefaultService.Product")
        org.apache.olingo.ext.proxy.api.Annotatable getProductAnnotations();
    }

}
